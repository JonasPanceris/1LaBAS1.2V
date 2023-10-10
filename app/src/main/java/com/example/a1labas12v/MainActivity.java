package com.example.a1labas12v;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button butChandeeColor;
    private TextView tvTextChaningColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTextChaningColor = (TextView) findViewById(R.id.tvTextChaningColor);
        butChandeeColor = (Button) findViewById(R.id.butChandeeColor);
        butChandeeColor.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId()==R.id.butChandeeColor) {

                tvTextChaningColor.setTextColor(Color.LTGRAY);

        }
    }



}

