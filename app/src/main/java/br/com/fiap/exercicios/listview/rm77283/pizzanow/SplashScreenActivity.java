package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent it = new Intent(SplashScreenActivity.this, PizzaNowActivity.class);
                startActivity(it);
            }
        }, 3000);
    }
}
