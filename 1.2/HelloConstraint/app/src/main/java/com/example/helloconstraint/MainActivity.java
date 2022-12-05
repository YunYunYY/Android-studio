package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button Buttoncount;
    private Button Buttonzero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Buttoncount = (Button) findViewById(R.id.button_count);
        Buttonzero = (Button) findViewById(R.id.button_zero);

    }
    public void showToast(View view){
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        Buttonzero.setBackgroundColor(Color.parseColor("#aaff88"));
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount%2==0){
            Buttoncount.setBackgroundColor(Color.parseColor("#afe3ff"));
        }
        else{
            Buttoncount.setBackgroundColor(Color.parseColor("#ffcccc"));
        }
    }

    public void makeZero(View view) {
        mCount=0;
        Buttonzero.setBackgroundColor(Color.parseColor("#999999"));
        Buttoncount.setBackgroundColor(Color.parseColor("#afe3ff"));
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}