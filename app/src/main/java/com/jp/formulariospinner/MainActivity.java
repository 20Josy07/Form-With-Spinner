package com.jp.formulariospinner;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre, etEdad;
    private Spinner spCategorias;
    private Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        spCategorias = findViewById(R.id.spCategorias);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarDatos();
            }
        });
    }

    private void guardarDatos() {
        String nombre = etNombre.getText().toString();
        String edad = etEdad.getText().toString();
        String categoria = spCategorias.getSelectedItem().toString();

        if (nombre.isEmpty() || edad.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        SharedPreferences preferences = getSharedPreferences("datos_usuario", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("nombre", nombre);
        editor.putString("edad", edad);
        editor.putString("categoria", categoria);
        editor.apply();

        String catSeleccionada = preferences.getString("categoria", "");

        Intent intent;
        if (catSeleccionada.equals("Deportes")) {
            intent = new Intent(MainActivity.this, DeportesActivity.class);
        } else if (catSeleccionada.equals("Música")) {
            intent = new Intent(MainActivity.this, MusicaActivity.class);
        } else if (catSeleccionada.equals("Cine")) {
            intent = new Intent(MainActivity.this, CineActivity.class);
        } else {
            Toast.makeText(this, "Categoría no válida", Toast.LENGTH_SHORT).show();
            return;
        }

        startActivity(intent);
    }
}