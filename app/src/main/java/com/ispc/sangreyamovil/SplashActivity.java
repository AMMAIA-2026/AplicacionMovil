package com.ispc.sangreyamovil;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Creamos un temporizador de 2.5 segundos (2500 ms)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Definimos el origen (SplashActivity.this) y el destino (LoginActivity.class)
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);

                // Cerramos el Splash para quitarlo de la memoria y la pila de pantallas
                finish();
            }
        }, 2500); // Tiempo en milisegundos
    }
}
