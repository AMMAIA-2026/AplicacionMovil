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

        //temporizador para cambiar de pantalla automaticamente
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //crear el intent explicito hacia loginactivity
                Intent intent = new Intent(
                        SplashActivity.this,
                        LoginActivity.class
                );

                startActivity(intent);

                //cerrar SplashActivity para que el usuario
                //no vuelva a ella con el boton atras
                finish();
            }
        }, 2500);
    }
}
