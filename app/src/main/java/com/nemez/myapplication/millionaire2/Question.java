package com.nemez.myapplication.millionaire2;

public class Question {
    final String question;
    final String a;
    final String b;
    final String c;
    final String d;
    final boolean boolA;
    final boolean boolB;
    final boolean boolC;
    final boolean boolD;


    public Question(String question, String a, String b, String c, String d, boolean boolA, boolean boolB, boolean boolC, boolean boolD) {
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.boolA = boolA;
        this.boolB = boolB;
        this.boolC = boolC;
        this.boolD = boolD;
    }
}
