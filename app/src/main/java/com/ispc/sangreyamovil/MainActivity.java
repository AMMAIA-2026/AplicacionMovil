package com.ispc.sangreyamovil; // <-- Verificá que mantenga el paquete de tu proyecto

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvNombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1. Enlazamos la variable Java con la ID del TextView en el XML
        tvNombreUsuario = findViewById(R.id.tvNombreUsuario);

        // 2. Recuperamos el Intent que abrió esta pantalla
        if (getIntent() != null && getIntent().hasExtra("USUARIO_INGRESADO")) {
            // Extraemos el texto asociado a la clave que usamos en LoginActivity
            String usuario = getIntent().getStringExtra("USUARIO_INGRESADO");

            // 3. Mostramos el nombre en el TextView
            tvNombreUsuario.setText(usuario);
        }
    }
}