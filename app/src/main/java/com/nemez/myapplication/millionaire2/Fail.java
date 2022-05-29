package com.nemez.myapplication.millionaire2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Fail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail);

        //Выводим выигрыш
        coins();

        //Плеер - фейл.
        mPlayer = MediaPlayer.create(this, R.raw.failnoise);
        mPlayer.start();

    }

    //Плеер
    MediaPlayer mPlayer;

    //Достигнутый уровень
    static int level = 0;
    public static void setLevels(int levels){
        level = levels;
    }

    //Выигрыш
    void coins(){
        TextView c = findViewById(R.id.failcoins);
        if (level > 10){
            c.setText("Выигрыш составляет\n 100 000");
        }
        else if(level > 5){
            c.setText("Выигрыш составляет\n 1 000");
        }
        else{
            c.setText("Выигрыш составляет\n 0");
        }
    }

    //Закрыть
    public void menu(View view){
        mPlayer.stop();
        Intent intent = new Intent(Fail.this, MainActivity.class);
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
            Intent intent = new Intent(Fail.this, MainActivity.class);
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