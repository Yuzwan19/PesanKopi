package com.xyzlabs.pesankopi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int quantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void setupView(){

    }

    public void increment(){
        quantity = quantity + 1;
        tampilKuantitas(quantity);

    }

    public void decrement(){
        quantity = quantity - 1;
        tampilKuantitas(quantity);

    }

    private void tampilKuantitas(int qty){

    }

    private void checkWhip(){
//        if (ctx.isChecked()) {
//            ctx.setChecked(false);
//
//        } else {
//            ctx.setChecked(true);
//        }
    }

    private void checkChoco(){

    }

    private void orderKopi(){

    }
}
