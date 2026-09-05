package com.ispc.sangreyamovil;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvNombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombreUsuario = findViewById(R.id.tvNombreUsuario);

        if (getIntent() != null && getIntent().hasExtra("USUARIO_INGRESADO")) {
            String usuario = getIntent().getStringExtra("USUARIO_INGRESADO");
            tvNombreUsuario.setText(usuario);
        }
    }
}
