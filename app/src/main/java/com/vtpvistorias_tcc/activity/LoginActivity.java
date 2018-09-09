package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.vtpvistorias_tcc.Model.Usuarios;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class LoginActivity extends AppCompatActivity  {

    private EditText edtEmail;
    private EditText edtSenha;
    private Button btnLogar;
    private TextView textCadastroLogin;
    private FirebaseAuth autenticacao;
    private Usuarios usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        btnLogar = (Button) findViewById(R.id.btnLogar);
        textCadastroLogin = (TextView) findViewById(R.id.textCadastroLogin);

        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edtEmail.getText().toString().equals("") && !edtSenha.getText().toString().equals("")){
                    usuario = new Usuarios();
                    usuario.setEmail(edtEmail.getText().toString());
                    usuario.setSenha(edtSenha.getText().toString());

                    System.out.print("Email: " + usuario.getEmail());
                    System.out.print("Senha: " + usuario.getSenha());

                    validarLogin();
                }
                else{
                    Toast.makeText(LoginActivity.this,"Preencha os campos de login e senha!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private void validarLogin(){
        autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        autenticacao.signInWithEmailAndPassword(usuario.getEmail(), usuario.getSenha()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){

                    abrirTelaPrincipal();

                    Toast.makeText(LoginActivity.this,"Login efetuado com sucesso!", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(LoginActivity.this,"Email e/ou Senha incorreto(s)!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void abrirTelaPrincipal(){
        Intent intentAbrirTelaPrincipal = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intentAbrirTelaPrincipal);
    }
}
