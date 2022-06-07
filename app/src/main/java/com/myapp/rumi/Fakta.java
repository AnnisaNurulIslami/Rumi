package com.myapp.rumi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Fakta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakta);

        ImageButton imageButton = findViewById(R.id.btn);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Home.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView1 = findViewById(R.id.f_cv1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta1.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView2 = findViewById(R.id.f_cv2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta2.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView3 = findViewById(R.id.f_cv3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta3.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView4 = findViewById(R.id.f_cv4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta4.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView5 = findViewById(R.id.f_cv5);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta5.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView6 = findViewById(R.id.f_cv6);
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta6.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView7 = findViewById(R.id.f_cv7);
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta7.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView8 = findViewById(R.id.f_cv8);
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta8.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView9 = findViewById(R.id.f_cv9);
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta9.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView10 = findViewById(R.id.f_cv10);
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta10.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView11 = findViewById(R.id.f_cv11);
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta11.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView12 = findViewById(R.id.f_cv12);
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta12.class);
                startActivity(intent);
                finish();
            }
        });

        CardView cardView13 = findViewById(R.id.f_cv13);
        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fakta.this, Fakta13.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Fakta.this, Home.class));
        finish();
    }
}