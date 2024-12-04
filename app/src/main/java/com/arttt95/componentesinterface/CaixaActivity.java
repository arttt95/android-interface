package com.arttt95.componentesinterface;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class CaixaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_caixa);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        /*  Usando uma função anônima para instânciar uma View
        Button botao = findViewById(R.id.botao_salvar);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("Botão foi clicado!");

            }
        });*/

        // Utilizando uma função lambda
        Button botao = findViewById(R.id.botao_salvar);
        TextInputEditText email = findViewById(R.id.edit_email);

        botao.setOnClickListener(v -> {

            String emailUsuario = email.getText().toString();
            System.out.println("Email selecionado: " + emailUsuario);

        });

    }


}