package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;

public class GrupoAActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox valvulaPedalVazando;
    private CheckBox valvulaPedalContaminada;
    private CheckBox almofadaPedalGasta;
    private CheckBox almofadaPedalFalta;

    private DatabaseReference firebase;
    private GrupoA grupoA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        valvulaPedalVazando = (CheckBox)findViewById(R.id.valvulaPedalVazando);
        valvulaPedalContaminada = (CheckBox)findViewById(R.id.valvulaPedalContaminada);
        almofadaPedalGasta = (CheckBox)findViewById(R.id.almofadaPedalGasta);
        almofadaPedalFalta = (CheckBox)findViewById(R.id.almofadaPedalFalta);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:
                salvarDados();
                Intent intent = new Intent(getApplicationContext(),GrupoBActivity.class);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        grupoA = new GrupoA();

        grupoA.setIdFicha(1l);
        grupoA.setValvulaPedalVazando(valvulaPedalVazando.isChecked());
        grupoA.setValvulaPedalContaminada(valvulaPedalContaminada.isChecked());
        grupoA.setValvulaPedalContaminada(almofadaPedalGasta.isChecked());
        grupoA.setValvulaPedalContaminada(almofadaPedalFalta.isChecked());

       grupoA.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }


}
