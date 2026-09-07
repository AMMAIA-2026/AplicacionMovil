package com.ispc.sangreyamovil;


import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    // 1. Declaramos los componentes Java
    private EditText etUsuario;
    private EditText etPassword;
    private Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // 2. Enlazamos las variables Java con las vistas del XML por su ID
        etUsuario = findViewById(R.id.etUsuario);
        etPassword = findViewById(R.id.etPassword);
        btnIngresar = findViewById(R.id.btnIngresar);

        // 3. Programamos la acción al hacer clic en el botón "Ingresar"
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarEIngresar();
            }
        });
    }

    // Método que realiza las comprobaciones necesarias
    private void validarEIngresar() {
        // Leemos el texto escrito en cada caja y quitamos espacios sobrantes (.trim())
        String usuario = etUsuario.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Validamos si alguno de los campos está vacío
        if (TextUtils.isEmpty(usuario) || TextUtils.isEmpty(password)) {
            // Si falta información, mostramos un mensaje Toast de advertencia
            Toast.makeText(LoginActivity.this, "Por favor, completá todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            // Si ambos campos tienen texto, preparamos el viaje a la MainActivity
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);

            // Adjuntamos el nombre de usuario al Intent para llevarlo a la siguiente pantalla
            intent.putExtra("USUARIO_INGRESADO", usuario);

            // Iniciamos la MainActivity
            startActivity(intent);

            // Cerramos el Login para que no se pueda regresar con el botón "Atrás"
            finish();
        }
    }
}