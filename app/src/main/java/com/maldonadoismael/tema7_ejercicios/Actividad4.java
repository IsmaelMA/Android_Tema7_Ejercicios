package com.maldonadoismael.tema7_ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Actividad4 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Actividad4.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad4);

        EditText etActividad4 = findViewById(R.id.etActividad4);
        TextView tvActividad4 = findViewById(R.id.tvActividad4);
        Button btnGuardarActividad4 = findViewById(R.id.btnGuardarActividad4);
        Button btnRecuperarActividad4 = findViewById(R.id.btnRecuperarActividad4);

        btnGuardarActividad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    OutputStreamWriter miFichero = new OutputStreamWriter(openFileOutput("fichero.txt", Context.MODE_PRIVATE));
                    String textoEscrito = etActividad4.getText().toString();
                    miFichero.write(textoEscrito);
                    miFichero.close();
                    etActividad4.setText("");

                } catch (Exception ex) {
                    Log.e("Ficheros", "Error al escribir fichero en memoria interna");
                }

            }
        });

        btnRecuperarActividad4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    BufferedReader miFichero = new BufferedReader(new InputStreamReader(openFileInput("fichero.txt")));
                    String texto = miFichero.readLine();
                    tvActividad4.setText(texto);
                    miFichero.close();
                } catch (Exception e) {
                    Log.e("Ficheros","Error al leer desde la memoria interna");
                }
            }
        });


    }
}