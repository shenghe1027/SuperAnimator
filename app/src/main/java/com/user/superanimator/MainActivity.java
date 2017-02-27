package com.user.superanimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.user.superanimator.activity.BezierShoppingActivity;
import com.user.superanimator.activity.VectorDemoActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button shopcartBtn = (Button) findViewById(R.id.shopping_cart_btn);
        Button waveBtn = (Button) findViewById(R.id.wave_btn);
        Button vectorBtn = (Button) findViewById(R.id.vector_btn);
        vectorBtn.setOnClickListener(this);
        waveBtn.setOnClickListener(this);
        shopcartBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.shopping_cart_btn:
                Intent intent = new Intent(MainActivity.this, BezierShoppingActivity.class);
                startActivity(intent);
                break;
            case R.id.wave_btn:

                break;
            case R.id.vector_btn:
                Intent vectorIntent = new Intent(MainActivity.this, VectorDemoActivity.class);
                startActivity(vectorIntent);
                break;
        }
    }
}
