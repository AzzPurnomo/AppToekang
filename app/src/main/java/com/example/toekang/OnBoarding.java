package com.example.toekang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;
import android.widget.Button;


public class OnBoarding extends AppCompatActivity {
    int hitung = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        Button lanjut = findViewById(R.id.btnLanjut);
        Button lewat = findViewById(R.id.btnLewat);
        ImageView logo1 = findViewById(R.id.logo1);
        TextView judulText = findViewById(R.id.headtext);
        TextView tailText = findViewById(R.id.tailteks1);
        TextView tailText2 = findViewById(R.id.tailteks2);
        ImageView geser1 = findViewById(R.id.geser1);
        ImageView geser2 = findViewById(R.id.geser2);



        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (hitung == 0) {
                    judulText.setText("Join the projext");
                    tailText.setText("Bergabung bersama");
                    tailText2.setText("pekerja hebat lainnya");
                    logo1.setImageResource(R.drawable.onboarding_logo2);
                    geser1.setImageResource(R.drawable.onboarding_ellipse2);
                    geser2.setImageResource(R.drawable.onboarding_ellipse1);
                    lewat.setVisibility(View.GONE);
                    lanjut.getLayoutParams().width= ViewGroup.LayoutParams.MATCH_PARENT;
                    lanjut.setText("Mulai");
                    hitung++;

                }else if(hitung == 1){
                    Intent intent = new Intent(OnBoarding.this,MainActivity.class);
                    startActivity(intent);

                }


            }
        });


    }

}



