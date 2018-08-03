package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoASistemaSuspensaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox amortecedorFaltando;
    private CheckBox amortecedorVazando;
    private CheckBox amortecedorSolto;
    private CheckBox amortecedorDanificado;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_asistema_suspensao);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        amortecedorFaltando = (CheckBox)findViewById(R.id.amortecedorFaltando);
        amortecedorVazando = (CheckBox)findViewById(R.id.amortecedorVazando);
        amortecedorSolto = (CheckBox)findViewById(R.id.amortecedorSolto);
        amortecedorDanificado = (CheckBox)findViewById(R.id.amortecedorDanificado);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:
                salvarDados();
                Intent intent = new Intent(getApplicationContext(),GrupoASistemaTracaoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoA == null)
            grupoA = new GrupoA();

        //grupoA.setIdFicha(1l);
        //grupoA.setValvulaPedalVazando(valvulaPedalVazando.isChecked());


        inspecao.setGrupoA(grupoA);
        //grupoA.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

}
