package com.example.mylivedemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mylivedemo.R;
import com.example.mylivedemo.entity.BaseEntity;
import com.example.mylivedemo.entity.LiveEntity;
import com.example.mylivedemo.mvp.model.HomeModel;
import com.example.mylivedemo.mvp.view.HomeView;
import com.example.mylivedemo.myuitils.MyUtils;
import com.example.mylivedemo.myuitils.RetrofitSingle;
import com.tencent.rtmp.TXLiveConstants;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class LiveActivity extends AppCompatActivity implements HomeView<LiveEntity> {

    private TXCloudVideoView live_view;
    private TXLivePlayer mLivePlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        initView();
    }

    private void initView() {
        //获取roomId
        String roomId = getIntent().getStringExtra("roomId");
        live_view = findViewById(R.id.live_view);
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mLivePlayer.stopPlay(true); // true 代表清除最后一帧画面
        live_view.onDestroy();
    }
}
