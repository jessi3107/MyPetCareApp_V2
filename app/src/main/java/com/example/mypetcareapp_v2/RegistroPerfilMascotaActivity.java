package com.example.mypetcareapp_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;

public class RegistroPerfilMascotaActivity extends AppCompatActivity {

    Spinner spinnerTipoMas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_perfil_mascota);

        spinnerTipoMas = (Spinner) findViewById(R.id.spinnerTipoMascota);

        ArrayList<String> tipoMascota = new ArrayList<> ();
        //final String tipoMascota[] = new String[9];

        tipoMascota.add("Perro");
        tipoMascota.add("Gato");
        tipoMascota.add("Caballo");
        tipoMascota.add("Hamster");
        tipoMascota.add("Ave");
        tipoMascota.add("Pez");

        ArrayAdapter adp = new ArrayAdapter(RegistroPerfilMascotaActivity.this, android.R.layout.simple_spinner_dropdown_item, tipoMascota);

        spinnerTipoMas.setAdapter(adp);

        spinnerTipoMas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String tipo = (String) spinnerTipoMas.getAdapter().getItem(position);

                Toast.makeText(RegistroPerfilMascotaActivity.this, "Seleccionaste: " + tipo, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}