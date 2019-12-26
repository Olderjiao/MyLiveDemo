package com.example.mylivedemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.mylivedemo.R;
import com.google.android.material.tabs.TabLayout;
import com.tencent.rtmp.TXLivePlayer;
import com.tencent.rtmp.TXLivePushConfig;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.ui.TXCloudVideoView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup group;
    private RadioButton home_rb;
    private RadioButton mine_rb;

    private FrameLayout frameLayout;
    private ImageView live_btn;

    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化布局控件与数据
     */
    private void initView() {

        //获取控件
        group = findViewById(R.id.main_bottom);
        home_rb = findViewById(R.id.bottom_home);
        mine_rb = findViewById(R.id.bottom_mine);
        //设置点击事件
        findViewById(R.id.start_live_btn).setOnClickListener(this);

        manager = getSupportFragmentManager();



        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.bottom_home:

                        break;
                    case R.id.bottom_mine:

                        break;
                }
            }
        });

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.start_live_btn:

                break;
        }

    }



}
