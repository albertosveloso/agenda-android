package br.com.albertoveloso.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario); //pega todo layout e cria instancia para cada componente da view

        Button botaoSalvar = (Button) findViewById(R.id.formulario_salvar); //recuperando botao do formulário

        //ouvindo evento de click + classe anonima
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //criando instancia de toast (torrada) e exibindo mensagem .show()
                Toast.makeText(FormularioActivity.this, "Aluno salvo.", Toast.LENGTH_SHORT).show();
                finish(); //acabei de usar o formulário então terminar a activity do formulário
            }
        });


    }
}
