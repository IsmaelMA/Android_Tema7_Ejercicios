package com.maldonadoismael.tema7_ejercicios.accesopreferencias;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.maldonadoismael.tema7_ejercicios.R;

public class OpcionesActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferencia_actividad2);
    }
}
