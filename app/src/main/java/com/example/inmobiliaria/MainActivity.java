package com.example.inmobiliaria;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button logeo;
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        logeo = (Button)findViewById(R.id.button);
        email = findViewById(R.id.editText1);
        password = findViewById(R.id.editText2);

        logeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar(email.getText().toString(), password.getText().toString());
            }
        });
    }
    private boolean validar(String user, String pass) {
        if (user.equals("admin@mail.com") && pass.equals("123")) {
            Intent logeo = new Intent(MainActivity.this, MenuActivity.class);
            startActivity(logeo);
            return true;
        } else {
            Toast.makeText(getApplicationContext(), "Usuario o Password incorrectos", Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
