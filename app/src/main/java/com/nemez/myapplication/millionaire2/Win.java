package com.nemez.myapplication.millionaire2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Win extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        //Фанфары.
        mPlayer = MediaPlayer.create(this, R.raw.winnoise);
        mPlayer.start();

    }

    //Плеер
    MediaPlayer mPlayer;

    //Закрыть
    public void menu(View view){
        mPlayer.stop();
        Intent intent = new Intent(Win.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    //системная кнопка Назад
    long backPressedTime;
    Toast backToast;
    @Override
    public void onBackPressed(){
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            mPlayer.stop();
            Intent intent = new Intent(Win.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            backToast = Toast.makeText(getBaseContext(), R.string.backtext, Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}