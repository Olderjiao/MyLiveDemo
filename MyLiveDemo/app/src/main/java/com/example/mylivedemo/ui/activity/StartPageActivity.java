package com.example.mylivedemo.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import com.example.mylivedemo.R;

public class StartPageActivity extends AppCompatActivity {

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if(msg.what == 1){
                //跳转到其他界面
                Intent intent = new Intent(StartPageActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
    }

    @Override
    protected void onStart() {
        super.onStart();
        new MyThreadStartPage().start();
    }

    class MyThreadStartPage extends Thread{

        @Override
        public void run() {
            super.run();

            for(int i = 1;i <= 3;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message obtain = Message.obtain();
            obtain.what = 1;
            handler.sendMessage(obtain);
        }
    }

}
