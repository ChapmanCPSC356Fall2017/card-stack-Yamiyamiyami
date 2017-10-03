package com.example.kevin.cardstack;

import android.nfc.cardemulation.CardEmulation;
import android.support.annotation.DrawableRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Collections;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    Stack<Card> CardStack = new Stack<>();
    private TextView topLeftTV;
    private ImageView centerIV;
    private ImageView botRightIV;
    private ImageView topLeftIV;
    private TextView botRightTV;
    int clicks =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        topLeftTV = (TextView) findViewById(R.id.topleftTV);
        botRightTV = (TextView) findViewById(R.id.botrightTV);
        topLeftIV = (ImageView) findViewById(R.id.topleftIV);
        botRightIV = (ImageView) findViewById(R.id.botrightIV);
        centerIV = (ImageView) findViewById(R.id.centerIV);

        deckInit();
        Collections.shuffle(CardStack);

        int temp = CardStack.peek().getCardNum();
        String tempS = CardStack.peek().getCardSuit();
        if (temp == 1){
            topLeftTV.setText("A");
            botRightTV.setText("A");
        }else if (temp == 11){
            topLeftTV.setText("J");
            botRightTV.setText("J");
        }else if (temp == 12){
            topLeftTV.setText("Q");
            botRightTV.setText("Q");
        }else if (temp == 13){
            topLeftTV.setText("K");
            botRightTV.setText("K");
        }
        else{
            topLeftTV.setText(String.valueOf(temp));
            botRightTV.setText(String.valueOf(temp));
        }
        if (tempS == "hearts"){
            topLeftIV.setImageResource(R.mipmap.hearts);
            centerIV.setImageResource(R.mipmap.hearts);
            botRightIV.setImageResource(R.mipmap.hearts);
            topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.holo_red_light));
            botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.holo_red_light));
        }else if (tempS == "diamond"){
            topLeftIV.setImageResource(R.mipmap.diamond);
            centerIV.setImageResource(R.mipmap.diamond);
            botRightIV.setImageResource(R.mipmap.diamond);
            topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.holo_red_light));
            botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.holo_red_light));
        }else if (tempS == "spade"){
            topLeftIV.setImageResource(R.mipmap.spade);
            centerIV.setImageResource(R.mipmap.spade);
            botRightIV.setImageResource(R.mipmap.spade);
            topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.black));
            botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.black));
        }else if (tempS == "clover"){
            topLeftIV.setImageResource(R.mipmap.clover);
            centerIV.setImageResource(R.mipmap.clover);
            botRightIV.setImageResource(R.mipmap.clover);
            topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.black));
            botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.black));
        }


    }


    public void deckInit(){

        for (int i = 1; i <= 13; ++i){
            CardStack.push(new Card(i, "hearts"));
            CardStack.push(new Card(i, "diamond"));
            CardStack.push(new Card(i, "spade"));
            CardStack.push(new Card(i, "clover"));
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return true;
    }

    public void click(View view) {
        clicks++;
        CardStack.pop();
        if (CardStack.isEmpty()) {
            Log.i("meow", "good job Kevin!");
            Log.i("meow", String.valueOf(clicks));
            finish();
        }else {

            int temp = CardStack.peek().getCardNum();
            String tempS = CardStack.peek().getCardSuit();
            if (temp == 1) {
                topLeftTV.setText("A");
                botRightTV.setText("A");
            } else if (temp == 11) {
                topLeftTV.setText("J");
                botRightTV.setText("J");
            } else if (temp == 12) {
                topLeftTV.setText("Q");
                botRightTV.setText("Q");
            } else if (temp == 13) {
                topLeftTV.setText("K");
                botRightTV.setText("K");
            } else {
                topLeftTV.setText(String.valueOf(temp));
                botRightTV.setText(String.valueOf(temp));
            }
            if (tempS == "hearts") {
                topLeftIV.setImageResource(R.mipmap.hearts);
                centerIV.setImageResource(R.mipmap.hearts);
                botRightIV.setImageResource(R.mipmap.hearts);
                topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_light));
                botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_light));
            } else if (tempS == "diamond") {
                topLeftIV.setImageResource(R.mipmap.diamond);
                centerIV.setImageResource(R.mipmap.diamond);
                botRightIV.setImageResource(R.mipmap.diamond);
                topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_light));
                botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.holo_red_light));
            } else if (tempS == "spade") {
                topLeftIV.setImageResource(R.mipmap.spade);
                centerIV.setImageResource(R.mipmap.spade);
                botRightIV.setImageResource(R.mipmap.spade);
                topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.black));
                botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.black));
            } else if (tempS == "clover") {
                topLeftIV.setImageResource(R.mipmap.clover);
                centerIV.setImageResource(R.mipmap.clover);
                botRightIV.setImageResource(R.mipmap.clover);
                topLeftTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.black));
                botRightTV.setTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.black));
            }
        }
    }
}




