package com.jp.formulariospinner;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine);

        TextView tvDatos = findViewById(R.id.tvDatosCine);
        Button btnVolver = findViewById(R.id.btnVolverCine);

        SharedPreferences preferences = getSharedPreferences("datos_usuario", MODE_PRIVATE);
        String nombre = preferences.getString("nombre", "N/A");
        String edad = preferences.getString("edad", "N/A");

        tvDatos.setText("Hola " + nombre + ", tienes " + edad + " años y te gusta el Cine.");

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}