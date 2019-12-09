package com.example.mrpeter1.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    new CountDownTimer(10000, 100){

    public  void  onTick(long millisecongsUntilDone){
        Log.i("secong left", String.valueOf((millisecongsUntilDone / 1000)));
    }

        @Override
        public void onFinish() {
            Log.i("were done", "no more countdown");
        }

}.start();;
      //  final Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                Log.i("hey it's us", "A second passed by");
//                handler.postDelayed(this, 1000);
//            }
//        };
//        handler.post(run);

    }
}
