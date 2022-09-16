package br.edu.uniritter.mobile.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cria as variáveis que armazenam o texto inserido nos campos TextView do XML
        TextView username = (TextView) findViewById(R.id.username);
        TextView password = (TextView) findViewById(R.id.password);

        //Cria um objeto de View.OnClickListener para ser utilizado no Listener do botão
        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Condicional para validar o login, é utilizado um método da classe Login que criei
                if(Login.loginValidation(username, password)) {
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(view.getContext(), Activity2.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!", Toast.LENGTH_SHORT).show();
                }
            }
        };

        //Listener do botão de login
        findViewById(R.id.loginbtn).setOnClickListener(ocl);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.loginbtn) {
            Intent intent = new Intent(view.getContext(), Activity2.class);
            startActivity(intent);
        }
    }
}