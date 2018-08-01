package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;

import java.io.Serializable;

public class IniciarInspecaoActivity extends AppCompatActivity implements View.OnClickListener{

    private Toolbar toolbar;
    private EditText editTextPrefixo;
    private Button botaoBuscarPrefixo;
    private Button botaoVoltarTelaPrincipal;
    private Button botaoConsultarInspecao;
    private DatabaseReference firebase;
    private Veiculo veiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_inspecao);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        setSupportActionBar(toolbar);

        editTextPrefixo = findViewById(R.id.editText_prefixo_inciarInpecao);
        botaoBuscarPrefixo = findViewById(R.id.botaoBuscarPrefixo);

        botaoBuscarPrefixo.setOnClickListener(this);

        botaoVoltarTelaPrincipal = (Button) findViewById(R.id.botaoVoltarTelaPrincipal);
        botaoVoltarTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public void onPause(){
        super.onPause();
    }

    //metodo para criar os menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //exibir os menus
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true ;
    }

    public void startDialog(View v) {
        Intent intent = new Intent(IniciarInspecaoActivity.this, DetalhesVeiculoActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.botaoBuscarPrefixo:

                if (!editTextPrefixo.getText().toString().equals("")) {

                    firebase = FirebaseDatabase.getInstance().getReference().child("Veiculos").child(editTextPrefixo.getText().toString());

                    firebase.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            if (dataSnapshot.getValue() != null) {

                                veiculo = dataSnapshot.getValue(Veiculo.class);

                                Intent i = new Intent(getApplicationContext(),DetalhesVeiculoActivity.class);
                                i.putExtra("veiculo", veiculo);
                                startActivity(i);

                            } else {

                                Toast.makeText(getApplicationContext(), "Número Invalido", Toast.LENGTH_SHORT).show();

                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                }else {
                    Toast.makeText(getApplicationContext(), "Digite um valor válido", Toast.LENGTH_SHORT).show();
                }

                break;

        }
    }
}
