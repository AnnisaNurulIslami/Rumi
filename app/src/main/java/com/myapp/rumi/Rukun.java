package com.myapp.rumi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Rukun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun);

        ImageButton imageButton = findViewById(R.id.btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rukun.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView1 = findViewById(R.id.r_cv1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rukun.this, Rukun1.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView2 = findViewById(R.id.r_cv2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rukun.this, Rukun2.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView3 = findViewById(R.id.r_cv3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Rukun.this, Rukun3.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Rukun.this, Home.class));
        finish();
    }
}