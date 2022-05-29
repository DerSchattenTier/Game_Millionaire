package com.nemez.myapplication.millionaire2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.levels);

        //Во весь экран
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //Прогресс игры
        Dialog progress = new Dialog(this);
        progress.setCancelable(false);
        progress.setContentView(R.layout.progress);

        //Кнопка Продолжить в диалоге Прогресса
        TextView next = (TextView) progress.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обработка нажатия кнопки.
                progress.dismiss();
            }
        });

        //Показать прогресс перед игрой
        progress.show();

        //Игра
        game();

        //Конец Create
    }

    //Плеер
    MediaPlayer mPlayer;

    //Подсказки
    boolean isFifty = true;
    boolean isHelp = true;
    boolean isCall = true;

    //Счётчик уровней
    int levels = 0;

    //Создание Массива вопросов.
    ArrayOfQuestions arrayQ = new ArrayOfQuestions();

    //Количество оставшихся вопросов.
    int quantity = 41;

    //Рандомное число.
    Random r = new Random();
    int random;

    //системная кнопка Назад
    long backPressedTime;
    Toast backToast;
    @Override
    public void onBackPressed(){
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            mPlayer.stop();
            Intent intent = new Intent(Game.this, MainActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            backToast = Toast.makeText(getBaseContext(), R.string.backtext, Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }

    // 50/50
    void fifty(int random){

        //Отключаем кнопку.
        isFifty = false;

        if(random%3==0) {
            if(arrayQ.array.get(random).boolA || arrayQ.array.get(random).boolB){
                TextView c = (TextView) findViewById(R.id.button_c);
                c.setText("   ");
                c.setEnabled(false);
                TextView d = (TextView) findViewById(R.id.button_d);
                d.setText("   ");
                d.setEnabled(false);
            }
            else{
                TextView a = (TextView) findViewById(R.id.button_a);
                a.setText("   ");
                a.setEnabled(false);
                TextView b = (TextView) findViewById(R.id.button_b);
                b.setText("   ");
                b.setEnabled(false);
            }
        }
        else if(random%2==0){
            if(arrayQ.array.get(random).boolA || arrayQ.array.get(random).boolC){
                TextView b = (TextView) findViewById(R.id.button_b);
                b.setText("   ");
                b.setEnabled(false);
                TextView d = (TextView) findViewById(R.id.button_d);
                d.setText("   ");
                d.setEnabled(false);
            }
            else{
                TextView a = (TextView) findViewById(R.id.button_a);
                a.setText("   ");
                a.setEnabled(false);
                TextView c = (TextView) findViewById(R.id.button_c);
                c.setText("   ");
                c.setEnabled(false);
            }
        }
        else{
            if(arrayQ.array.get(random).boolA || arrayQ.array.get(random).boolD){
                TextView b = (TextView) findViewById(R.id.button_b);
                b.setText("   ");
                b.setEnabled(false);
                TextView c = (TextView) findViewById(R.id.button_c);
                c.setText("   ");
                c.setEnabled(false);
            }
            else{
                TextView a = (TextView) findViewById(R.id.button_a);
                a.setText("   ");
                a.setEnabled(false);
                TextView d = (TextView) findViewById(R.id.button_d);
                d.setText("   ");
                d.setEnabled(false);
            }
        }
    }

    //Помощь зала
    void help(int random){

        //Отключаем кнопку.
        isHelp = false;

        //Находим кнопки
        TextView a = (TextView) findViewById(R.id.button_a);
        TextView b = (TextView) findViewById(R.id.button_b);
        TextView c = (TextView) findViewById(R.id.button_c);
        TextView d = (TextView) findViewById(R.id.button_d);

        //Если все кнопки активны(нет 50/50)
        if(a.isEnabled() && b.isEnabled() && c.isEnabled() && d.isEnabled()) {
            if (arrayQ.array.get(random).boolA) {
                if (a.isEnabled()) {
                    a.setText(arrayQ.array.get(random).a + " 55%");
                }
                if (b.isEnabled()) {
                    b.setText(arrayQ.array.get(random).b + " 15%");
                }
                if (c.isEnabled()) {
                    c.setText(arrayQ.array.get(random).c + " 25%");
                }
                if (d.isEnabled()) {
                    d.setText(arrayQ.array.get(random).d + " 5%");
                }
            } else if (arrayQ.array.get(random).boolB) {
                if (a.isEnabled()) {
                    a.setText(arrayQ.array.get(random).a + " 1%");
                }
                if (b.isEnabled()) {
                    b.setText(arrayQ.array.get(random).b + " 92%");
                }
                if (c.isEnabled()) {
                    c.setText(arrayQ.array.get(random).c + " 2%");
                }
                if (d.isEnabled()) {
                    d.setText(arrayQ.array.get(random).d + " 5%");
                }
            } else if (arrayQ.array.get(random).boolC) {
                if (a.isEnabled()) {
                    a.setText(arrayQ.array.get(random).a + " 15%");
                }
                if (b.isEnabled()) {
                    b.setText(arrayQ.array.get(random).b + " 18%");
                }
                if (c.isEnabled()) {
                    c.setText(arrayQ.array.get(random).c + " 52%");
                }
                if (d.isEnabled()) {
                    d.setText(arrayQ.array.get(random).d + " 15%");
                }
            } else if (arrayQ.array.get(random).boolD) {
                if (a.isEnabled()) {
                    a.setText(arrayQ.array.get(random).a + " 10%");
                }
                if (b.isEnabled()) {
                    b.setText(arrayQ.array.get(random).b + " 21%");
                }
                if (c.isEnabled()) {
                    c.setText(arrayQ.array.get(random).c + " 29%");
                }
                if (d.isEnabled()) {
                    d.setText(arrayQ.array.get(random).d + " 40%");
                }
            }
        }
        else {
            //Если 50/50 включено
            if (arrayQ.array.get(random).boolA){
                a.setText(arrayQ.array.get(random).a + " 71%");
                if(b.isEnabled()){
                    b.setText(arrayQ.array.get(random).b + " 29%");
                }
                if(c.isEnabled()){
                    c.setText(arrayQ.array.get(random).c + " 29%");
                }
                if(d.isEnabled()){
                    d.setText(arrayQ.array.get(random).d + " 29%");
                }
            }
            if (arrayQ.array.get(random).boolB){
                b.setText(arrayQ.array.get(random).b + " 80%");
                if(a.isEnabled()){
                    a.setText(arrayQ.array.get(random).a + " 20%");
                }
                if(c.isEnabled()){
                    c.setText(arrayQ.array.get(random).c + " 20%");
                }
                if(d.isEnabled()){
                    d.setText(arrayQ.array.get(random).d + " 20%");
                }
            }
            if (arrayQ.array.get(random).boolC){
                c.setText(arrayQ.array.get(random).c + " 89%");
                if(b.isEnabled()){
                    b.setText(arrayQ.array.get(random).b + " 11%");
                }
                if(a.isEnabled()){
                    a.setText(arrayQ.array.get(random).a + " 11%");
                }
                if(d.isEnabled()){
                    d.setText(arrayQ.array.get(random).d + " 11%");
                }
            }
            if (arrayQ.array.get(random).boolD){
                d.setText(arrayQ.array.get(random).d + " 69%");
                if(b.isEnabled()){
                    b.setText(arrayQ.array.get(random).b + " 31%");
                }
                if(c.isEnabled()){
                    c.setText(arrayQ.array.get(random).c + " 31%");
                }
                if(a.isEnabled()){
                    a.setText(arrayQ.array.get(random).a + " 31%");
                }
            }
        }
    }

    //Звонок другу
    void call(int random){

        //Отключаем кнопку
        isCall = false;

        String answer = null;
        
        if(arrayQ.array.get(random).boolA)
            answer = " - A.";
        if(arrayQ.array.get(random).boolB)
            answer = " - B.";
        if(arrayQ.array.get(random).boolC)
            answer = " - C.";
        if(arrayQ.array.get(random).boolD)
            answer = " - D.";

        TextView q = (TextView) findViewById(R.id.question);
        q.setText("Я думаю, что ответ на вопрос: " + arrayQ.array.get(random).question + answer);
    }

    //Отображение вопроса.
    void showQuestion(Question quest){
        //Установка вопроса
        TextView q = (TextView) findViewById(R.id.question);
        q.setText(quest.question);
        //Установка ответов
        TextView a = (TextView) findViewById(R.id.button_a);
        a.setText("A: " + quest.a);
        TextView b = (TextView) findViewById(R.id.button_b);
        b.setText("B: " + quest.b);
        TextView c = (TextView) findViewById(R.id.button_c);
        c.setText("C: " + quest.c);
        TextView d = (TextView) findViewById(R.id.button_d);
        d.setText("D: " + quest.d);
    }

    //Установка кнопок ответа
    void buttons(int random){
        //Кнопка А:
        Button btnA = (Button)findViewById(R.id.button_a);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer(arrayQ.array.get(random).boolA, random);
            }
        });
        //Кнопка B:
        Button btnB = (Button)findViewById(R.id.button_b);
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer(arrayQ.array.get(random).boolB, random);
            }
        });
        //Кнопка C:
        Button btnC = (Button)findViewById(R.id.button_c);
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer(arrayQ.array.get(random).boolC, random);
            }
        });
        //Кнопка D:
        Button btnD = (Button)findViewById(R.id.button_d);
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer(arrayQ.array.get(random).boolD, random);
            }
        });
    }

    //Обработка ответа
    void answer(boolean bool, int random){
        if(bool){
            green(random);
        }
        else{
            red();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }

    //Диалог при правильном ответе
    void green(int random){

        //Стоп плеер
        mPlayer.stop();

        //Удаляем заданный вопрос для избежания повторений.
        arrayQ.array.remove(random);

        //Диалог
        Dialog trueimg = new Dialog(this);
        trueimg.setCancelable(false);
        trueimg.setContentView(R.layout.dialog_true);
        trueimg.show();

        //Кнопка Продолжить
        TextView next = (TextView) trueimg.findViewById(R.id.buttonfalse);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Закрыть диалог
                trueimg.dismiss();

                //переход на концовку
                if (levels==15){
                    mPlayer.stop();
                    Intent intent = new Intent(Game.this, Win.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        //Вызов нового витка игры
        game();
    }

    //Диалог при неправильном ответе
    void red(){

        //Диалог
        Dialog falseimg = new Dialog(this);
        falseimg.setCancelable(false);
        falseimg.setContentView(R.layout.dialog_false);
        falseimg.show();

        //Плеер стоп
        mPlayer.stop();

        //Кнопка Продолжить
        TextView next = (TextView) falseimg.findViewById(R.id.buttonfalse);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обработка нажатия кнопки.
                falseimg.dismiss();
                Intent intent = new Intent(Game.this, Fail.class);
                startActivity(intent);
                Fail.setLevels(levels);
                finish();
            }
        });
    }

    //Прогресс
    void progress(int random){

        //Создание диалога
        Dialog progress = new Dialog(this);
        progress.setCancelable(false);
        progress.setContentView(R.layout.progress);

        //Кнопка 50/50
        if(isFifty) {
            ImageView fifty = (ImageView) progress.findViewById(R.id.fifty);
            fifty.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    fifty(random);
                    fifty.setEnabled(false);
                    fifty.setBackgroundResource(R.color.black);
                }
            });
        }
        else{
            ImageView fifty = (ImageView) progress.findViewById(R.id.fifty);
            fifty.setEnabled(false);
            fifty.setBackgroundResource(R.color.black);
        }

        //Помощь зала
        if (isHelp){
            ImageView help = (ImageView) progress.findViewById(R.id.help);
            help.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    help(random);
                    help.setEnabled(false);
                    help.setBackgroundResource(R.color.black);
                }
            });
        }
        else{
            ImageView help = (ImageView) progress.findViewById(R.id.help);
            help.setEnabled(false);
            help.setBackgroundResource(R.color.black);
        }

        //Звонок другу
        if (isCall){
            ImageView call = (ImageView) progress.findViewById(R.id.call);
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    call(random);
                    call.setEnabled(false);
                    call.setBackgroundResource(R.color.black);
                }
            });
        }
        else{
            ImageView call = (ImageView) progress.findViewById(R.id.call);
            call.setEnabled(false);
            call.setBackgroundResource(R.color.black);
        }

        //Кнопка Прогресса
        ImageView prog = (ImageView) findViewById(R.id.progressbutton);
        prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обработка нажатия кнопки.
                progress.show();
            }
        });

        //Кнопка Продолжить в диалоге Прогресса
        TextView next = (TextView) progress.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Обработка нажатия кнопки.
                progress.dismiss();
            }
        });

        //Окраска прогресса
        TextView view1000 = (TextView) progress.findViewById(R.id.level1000);
        view1000.setBackgroundResource(R.color.red50);
        TextView view100000 = (TextView) progress.findViewById(R.id.level100000);
        view100000.setBackgroundResource(R.color.red50);
        TextView view1000000 = (TextView) progress.findViewById(R.id.level1000000);
        view1000000.setBackgroundResource(R.color.red50);
        if (levels==1) {
            TextView view = (TextView) progress.findViewById(R.id.level100);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==2) {
            TextView view = (TextView) progress.findViewById(R.id.level200);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==3) {
            TextView view = (TextView) progress.findViewById(R.id.level300);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==4) {
            TextView view = (TextView) progress.findViewById(R.id.level500);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==5) {
            TextView view = (TextView) progress.findViewById(R.id.level1000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==6) {
            TextView view = (TextView) progress.findViewById(R.id.level5000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==7) {
            TextView view = (TextView) progress.findViewById(R.id.level10000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==8) {
            TextView view = (TextView) progress.findViewById(R.id.level25000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==9) {
            TextView view = (TextView) progress.findViewById(R.id.level50000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==10) {
            TextView view = (TextView) progress.findViewById(R.id.level100000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==11) {
            TextView view = (TextView) progress.findViewById(R.id.level200000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==12) {
            TextView view = (TextView) progress.findViewById(R.id.level300000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==13) {
            TextView view = (TextView) progress.findViewById(R.id.level400000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==14) {
            TextView view = (TextView) progress.findViewById(R.id.level500000);
            view.setBackgroundResource(R.color.yellow50);
        }
        if (levels==15) {
            TextView view = (TextView) progress.findViewById(R.id.level1000000);
            view.setBackgroundResource(R.color.yellow50);
        }
    }

    //Игра
    void game(){

        //Плеер
        mPlayer = MediaPlayer.create(this, R.raw.gamenoise);
        mPlayer.start();

        //Счётчик плюс
        levels++;

        random = r.nextInt(quantity);//Новое число
        quantity--;//Уменьшаем количество оставшихся.

        //Установка сложности.
        if(levels > 10){
            while (random < 20){
                random = r.nextInt(quantity);
            }
        }
        else if(levels > 5){
            while (random < 15 || random > 25){
                random = r.nextInt(quantity);
            }
        }
        else{
            while (random > 20){
                random = r.nextInt(quantity);
            }
        }


        //Диалог
        progress(random);

        //Отображение вопроса
        showQuestion(arrayQ.array.get(random));

        //Вызов метода обработки кнопок
        buttons(random);

        //Включаем все кнопки
        TextView a = (TextView) findViewById(R.id.button_a);
        a.setEnabled(true);
        TextView b = (TextView) findViewById(R.id.button_b);
        b.setEnabled(true);
        TextView c = (TextView) findViewById(R.id.button_c);
        c.setEnabled(true);
        TextView d = (TextView) findViewById(R.id.button_d);
        d.setEnabled(true);

    }
}