package com.example.mylivedemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.mylivedemo.R;
import com.example.mylivedemo.myuitils.MyUtils;
import com.example.mylivedemo.ui.fragment.FragmentHome;
import com.example.mylivedemo.ui.fragment.FragmentMine;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup group;
    private RadioButton home_rb;
    private RadioButton mine_rb;

    private FrameLayout frameLayout;
    private ImageView live_btn;

    private FragmentManager manager;

    private FragmentHome fragmentHome;
    private FragmentMine fragmentMine;

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
        live_btn = findViewById(R.id.start_live_btn);
        live_btn.setOnClickListener(this);
        manager = getSupportFragmentManager();

        //默认加载第一页
        showFragment(0);

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.bottom_home:
                        showFragment(0);
                        break;
                    case R.id.bottom_mine:
                        showFragment(1);
                        break;
                }
            }
        });

    }

    /**
     * 切换到对应的fragment
     */
    private void showFragment(int index) {

        FragmentTransaction transaction = manager.beginTransaction();
        HideFragment(transaction);

        switch (index){
            case 0:
                if(fragmentHome == null){
                    fragmentHome = new FragmentHome();
                    transaction.add(R.id.main_fra,fragmentHome);
                }else{
                    transaction.show(fragmentHome);
                }
                break;
            case 1:
                if(fragmentMine == null){
                    fragmentMine = new FragmentMine();
                    transaction.add(R.id.main_fra,fragmentMine);
                }else{
                    transaction.show(fragmentMine);
                }
                break;
        }

        transaction.commit();//提示事件

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.start_live_btn:
                MyUtils.showToast(this,"直播");
                break;
        }

    }

    /**
     * 隐藏全部fragment
     * @param transaction
     */
    private void HideFragment(FragmentTransaction transaction){

        if(fragmentHome != null){
            transaction.hide(fragmentHome);
        }

        if(fragmentMine != null){
            transaction.hide(fragmentMine);
        }

    }

}
