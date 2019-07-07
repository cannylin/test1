package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 抓元件
        Button btnStart = (Button) findViewById(R.id.btnStart);
        TextView tvResult = (TextView) findViewById(R.id.tvResult);
        // 陣列大小

        //   Random random =new Random();
        //   int[] positions = { 1, 2, 3, 4, 5, 6, 9, 7, 8, 0 };//
        Toast.makeText(this, "Toast 基本用法", Toast.LENGTH_LONG).show();

        Log.v(  "TAG" ,"TAG");
        Log.i("TAG","");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
      //  Log.println(Log.ERROR,"","" );

        Log.v(  "TAG" ,"TAG");
        Log.i("TAG","");
        Log.v(  "TAG" ,"TAG");
    }

    //public static void main(String[] args) {
        // changePosition();
   // }
        
        
        
        
        
    }




