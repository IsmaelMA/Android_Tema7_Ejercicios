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
        //endregion

    }
}