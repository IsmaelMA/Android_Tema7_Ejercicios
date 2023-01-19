package com.maldonadoismael.tema7_ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Actividad1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1);

        Button botonGuardar = findViewById(R.id.btnGuardar);
        Button botonRecuperar = findViewById(R.id.btnRecuperar);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        SharedPreferences pref = getSharedPreferences("preferencias", Context.MODE_PRIVATE);


        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            SharedPreferences.Editor editor = pref.edit();
            editor.putString("valor1",et1.getText().toString());
            editor.putString("valor2",et2.getText().toString());
            editor.apply();

            et1.setText("");
            et2.setText("");
            }
        });

        botonRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(pref.getString("valor1","Funcionando"));
                tv2.setText(pref.getString("valor2","Funcionando bien"));
            }
        });
    }
}