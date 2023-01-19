package com.maldonadoismael.tema7_ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.maldonadoismael.tema7_ejercicios.accesopreferencias.OpcionesActivity;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        Button btnDefinirPreferencias = findViewById(R.id.btnDefinirPreferencias);
        Button btnRecuperarPreferencias = findViewById(R.id.btnRecuperarPreferencias);

        btnDefinirPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Actividad2.this, OpcionesActivity.class));
            }
        });

        btnRecuperarPreferencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(Actividad2.this);

                Log.i("Preferencias", "SO : " + pref.getBoolean("opcion1",false));
                Log.i("Preferencias", "Opción 2: " + pref.getString("opcion2","W"));
                Log.i("Preferencias", "Opción 3: " + pref.getString("opcion3",""));
            }
        });
    }
}