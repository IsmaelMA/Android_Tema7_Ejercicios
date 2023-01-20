package com.maldonadoismael.tema7_ejercicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Actividad5 extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        Actividad5.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad5);

        EditText etActividad5 = findViewById(R.id.etActividad5);
        TextView tvActividad5 = findViewById(R.id.tvActividad5);
        Button btnGuardarActividad5 = findViewById(R.id.btnGuardarActividad5);
        Button btnRecuperarActividad5 = findViewById(R.id.btnRecuperarActividad5);

        boolean sdDisponible = false;
        boolean sdAccesoEscritura = false;

        String estado = Environment.getExternalStorageState();

        if (estado.equals(Environment.MEDIA_MOUNTED)) {
            sdAccesoEscritura = true;
            sdDisponible = true;

        } else if (estado.equals(Environment.MEDIA_MOUNTED_READ_ONLY)) {

            sdDisponible = true;
            sdAccesoEscritura = false;
        }

        btnGuardarActividad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    File rutaSd = getExternalFilesDir(null);
                    File f = new File(rutaSd.getAbsolutePath(), "prueba_sd.txt");
                    OutputStreamWriter fout = new OutputStreamWriter(new FileOutputStream(f));

                    String textoRecuperado = etActividad5.getText().toString();
                    fout.write(textoRecuperado);
                    fout.close();
                    etActividad5.setText("");
                } catch (Exception ex) {
                    Log.e("Ficheros", "Error al escribir en la tarjeta SD");
                }
            }
        });

        btnRecuperarActividad5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    File rutaSd = getExternalFilesDir(null);
                    File f = new File(rutaSd.getAbsolutePath(), "prueba_sd.txt");
                    BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
                    String textoRecuperado = fin.readLine();
                    fin.close();
                    tvActividad5.setText(textoRecuperado);
                } catch (Exception ex) {
                    Log.e("Ficheros", "Error al leer en la tarjeta SD");
                }
            }
        });

    }
}