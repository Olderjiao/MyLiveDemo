package com.example.mylivedemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.LiveEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.MyUtils;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.kaisengao.likeview.like.KsgLikeView;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

import java.util.ArrayList;
import java.util.HashMap;

import master.flame.danmaku.controller.DrawHandler;
import master.flame.danmaku.controller.IDanmakuView;
import master.flame.danmaku.danmaku.model.BaseDanmaku;
import master.flame.danmaku.danmaku.model.DanmakuTimer;
import master.flame.danmaku.danmaku.model.IDanmakus;
import master.flame.danmaku.danmaku.model.IDisplayer;
import master.flame.danmaku.danmaku.model.android.DanmakuContext;
import master.flame.danmaku.danmaku.model.android.Danmakus;
import master.flame.danmaku.danmaku.model.android.SpannedCacheStuffer;
import master.flame.danmaku.danmaku.parser.BaseDanmakuParser;

public class LiveActivity extends AppCompatActivity implements HomeView<LiveEntity> {

    private TXCloudVideoView live_view;
    private TXLivePlayer mLivePlayer;

    //点赞效果小心心
    private KsgLikeView mLikeView;
    private ArrayList<Integer> hearts = new ArrayList<>();

    //弹幕相关类
    private BaseDanmakuParser parser = new BaseDanmakuParser() {
        @Override
        protected IDanmakus parse() {
            return new Danmakus();
        }
    };
    private IDanmakuView mDanmakuView;
    private DanmakuContext mContext;
    private boolean showDanmaku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        initView();
    }

    private void initView() {
        //设置弹幕控件
        mDanmakuView = findViewById(R.id.sv_danmaku);
        mDanmakuView.enableDanmakuDrawingCache(true);
        mDanmakuView.setCallback(new DrawHandler.Callback() {

            @Override
            public void prepared() {
                showDanmaku = true;
                mDanmakuView.start();
                addDanmaku("11111111111111111111111111111111111111",true);
            }

            @Override
            public void updateTimer(DanmakuTimer timer) {

            }

            @Override
            public void danmakuShown(BaseDanmaku danmaku) {

            }

            @Override
            public void drawingFinished() {

            }
        });
        mContext = DanmakuContext.create();
        mDanmakuView.prepare(parser, mContext);

        mLikeView = findViewById(R.id.heart_view);

        //添加心
        hearts.add(R.drawable.heart0);
        hearts.add(R.drawable.heart1);
        hearts.add(R.drawable.heart2);

        mLikeView.addLikeImages(hearts);

        //获取roomId
        String roomId = getIntent().getStringExtra("roomId");
        live_view = findViewById(R.id.live_view);

        live_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLikeView.addFavor();
            }
        });

        //创建 player 对象
        mLivePlayer = new TXLivePlayer(this);
        //关键 player 对象与界面 view
        mLivePlayer.setPlayerView(live_view);
        live_view.setRenderMode(TXLiveConstants.RENDER_MODE_ADJUST_RESOLUTION);
        RetrofitSingle.getInstance()
                .getIPresenter(new HomeModel(),this)
                .getLiveIO(roomId);
    }

    @Override
    public void onSuccess(BaseEntity baseEntity) {
        if(baseEntity != null){
            LiveEntity entity = (LiveEntity) baseEntity;
            int live = entity.getMessage().getLive();
            if(live == 0){
                MyUtils.showToast(this,"对不起，主播已下播");
            }else{
                String rUrl = entity.getMessage().getRUrl();
                //进行切割获取流地址
                String[] split = rUrl.split("\\?");
                mLivePlayer.startPlay(split[0],TXLivePlayer.PLAY_TYPE_LIVE_FLV);
            }
        }
    }

    @Override
    public void onError(Throwable throwable) {
        MyUtils.showToast(this,"请求失败");
    }

    /**
     * 向弹幕View中添加一条弹幕
     * @param content
     *          弹幕的具体内容
     * @param  withBorder
     *          弹幕是否有边框
     */
    private void addDanmaku(String content, boolean withBorder) {
        BaseDanmaku danmaku = mContext.mDanmakuFactory.createDanmaku(BaseDanmaku.TYPE_SCROLL_RL);
        danmaku.text = content;
        danmaku.padding = 5;
        danmaku.textSize = sp2px(20);
        danmaku.textColor = Color.WHITE;
        danmaku.setTime(mDanmakuView.getCurrentTime());
        if (withBorder) {
            danmaku.borderColor = Color.GREEN;
        }
        mDanmakuView.addDanmaku(danmaku);
    }

    /**
     * sp转px的方法。
     */
    public int sp2px(float spValue) {
        final float fontScale = getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLivePlayer.stopPlay(true); // true 代表清除最后一帧画面
        live_view.onDestroy();
        showDanmaku = false;
        if (mDanmakuView != null) {
            mDanmakuView.release();
            mDanmakuView = null;
        }
    }
}
