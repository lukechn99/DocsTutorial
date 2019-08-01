package com.example.docstutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
    }

    public void changeColor(View view) {
        Random r = new Random();
        int n = r.nextInt(6);
        //if (this.getColor(R.color.black) == R.color.black) {
        //    changeColor(this);
        //}
        /*
        * if (this color == black) {
        *   make this tile white #FFFFFF
        *   use random number to change other tiles to black
        */
    }
}
