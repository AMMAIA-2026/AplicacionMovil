package com.ispc.sangreyamovil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    //declaramos los componentes
    private EditText etUsuario;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //1. enlazar componente Java con su ID XML
        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        //2. escuchar el evento de click del boton
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                String usuario =
                        etUsuario.getText().toString().trim();

                String password =
                        etPassword.getText().toString().trim();

                //validar que los campos no esten vacios
                if(!usuario.isEmpty() && !password.isEmpty()) {
                    //crear intent para ir a mainactivity
                    Intent intent = new Intent(
                            LoginActivity.this,
                            MainActivity.class
                    );

                    //adjuntar un dato 'extra'
                    //para llevarlo a la siguiente pantalla
                    intent.putExtra(
                            "EXTRA_USUARIO",
                            usuario
                    );

                    startActivity(intent);

                    //cerrar la pantalla de login al ingresar
                    finish();
                } else {
                    //mostrar mensaje de advertencia
                    Toast.makeText(
                            LoginActivity.this,
                            "Por favor complete todos los campos",
                            Toast.LENGTH_SHORT
                    ).show();
                }
            }
        });
    }
}
