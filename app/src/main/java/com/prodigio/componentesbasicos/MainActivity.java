package com.prodigio.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;

    private CheckBox checkVerde, checkBranco, checkVermelho;

    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioGroup opcaoSexo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome           = findViewById(R.id.editNome);
        campoEmail          = findViewById(R.id.editEmail);
        textoResultado      = findViewById(R.id.textResultado);

        //Checkbox
        checkVerde          = findViewById(R.id.checkVerde);
        checkBranco         = findViewById(R.id.checkBranco);
        checkVermelho       = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino  = findViewById(R.id.radioButtonF);
        sexoMasculino = findViewById(R.id.radioButtonM);
        opcaoSexo     = findViewById(R.id.radioGroupSexo);
    }



    public void radiobutton(){

     if (sexoMasculino.isChecked()){
        textoResultado.setText("Masculino");
      }else if (sexoFeminino.isChecked()) {
          textoResultado.setText("Feminino");

      }



    }

    public void enviar (View view){
        radiobutton();
        //checkbox();


        /* String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();
        textoResultado.setText( "nome: " + nome +    "email:    " + email);
        */



    }

    public void checkbox(){

        String texto = "";
        if (checkVerde.isChecked()) {
            texto = "Verde selecionado        ";
        }
        if (checkBranco.isChecked()) {
            texto = texto       + "Branco selecionado       ";
        }
        if (checkVermelho.isChecked()) {
            texto = texto       + "Vermelho selecionado";
        }


        textoResultado.setText(texto);

    }



    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

    }
}