package com.maldonadoismael.tema7_ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //region butones
        Button btn1 = findViewById(R.id.btnActividad1);
        Button btn2 = findViewById(R.id.btnActividad2);
        Button btn3 = findViewById(R.id.btnActividad3);
        Button btn4 = findViewById(R.id.btnActividad4);
        Button btn5 = findViewById(R.id.btnActividad5);
        Button btn6 = findViewById(R.id.btnActividad6);
        Button btn7 = findViewById(R.id.btnActividad7);
        Button btn8 = findViewById(R.id.btnActividad8);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad1 = new Intent(Menu.this,Actividad1.class);
                startActivity(intentActividad1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad2 = new Intent(Menu.this,Actividad2.class);
                startActivity(intentActividad2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad3 = new Intent(Menu.this,Actividad3.class);
                startActivity(intentActividad3);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad4 = new Intent(Menu.this,Actividad4.class);
                startActivity(intentActividad4);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad5 = new Intent(Menu.this,Actividad5.class);
                startActivity(intentActividad5);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad6 = new Intent(Menu.this,Actividad6.class);
                startActivity(intentActividad6);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad7 = new Intent(Menu.this,Actividad7.class);
                startActivity(intentActividad7);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActividad8 = new Intent(Menu.this,Actividad8.class);
                startActivity(intentActividad8);
            }
        });
        //endregion



    }
}