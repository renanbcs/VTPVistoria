package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoBSistemaCarroceriaExternaActivity extends AppCompatActivity implements View.OnClickListener{

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox silenciosoSolto;
    private CheckBox silenciosoDanificado;

    private CheckBox tuboDescargaSolto;
    private CheckBox tuboDescargaFalta;
    private CheckBox tuboDescargaIrregular;

    private CheckBox protecaoTuboDescargaFalta;
    private CheckBox protecaoTuboDescargaSolta;

    private CheckBox articulacaoSolto;
    private CheckBox articulacaoFalta;
    private CheckBox articulacaoRasgado;
    private CheckBox articulacaoGasto;

    private CheckBox vazamentoExcessivoMotor;
    private CheckBox vazamentoExcessivoCambio;


    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_sistema_carroceria_externa);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        silenciosoSolto = (CheckBox)findViewById(R.id.silenciosoSolto);
        silenciosoDanificado = (CheckBox)findViewById(R.id.silenciosoDanificado);

        tuboDescargaSolto = (CheckBox)findViewById(R.id.tuboDescargaSolto);
        tuboDescargaFalta = (CheckBox)findViewById(R.id.tuboDescargaFalta);
        tuboDescargaIrregular = (CheckBox)findViewById(R.id.tuboDescargaIrregular);

        protecaoTuboDescargaFalta = (CheckBox)findViewById(R.id.protecaoTuboDescargaFalta);
        protecaoTuboDescargaSolta = (CheckBox)findViewById(R.id.protecaoTuboDescargaSolta);

        articulacaoSolto = (CheckBox)findViewById(R.id.articulacaoSolto);
        articulacaoFalta = (CheckBox)findViewById(R.id.articulacaoFalta);
        articulacaoRasgado = (CheckBox)findViewById(R.id.articulacaoRasgado);
        articulacaoGasto = (CheckBox)findViewById(R.id.articulacaoGasto);

        vazamentoExcessivoMotor = (CheckBox)findViewById(R.id.vazamentoExcessivoMotor);
        vazamentoExcessivoCambio = (CheckBox)findViewById(R.id.vazamentoExcessivoCambio);


        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoB = inspecao.getGrupoB();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:

                salvarDados();

                inspecao.setGrupoB(grupoB);

                Intent intent = new Intent(getApplicationContext(),SelecionarFichaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        if(silenciosoDanificado.isChecked()){
            grupoB.getSilencioso().add("Danificado");
        }
        if(silenciosoSolto.isChecked()){
            grupoB.getSilencioso().add("Solto");
        }
        if(tuboDescargaSolto.isChecked()){
            grupoB.getTuboDeDescarga().add("Solto");
        }
        if(tuboDescargaFalta.isChecked()){
            grupoB.getTuboDeDescarga().add("Faltando");
        }
        if(tuboDescargaIrregular.isChecked()){
            grupoB.getTuboDeDescarga().add("Irregular");
        }
        if(protecaoTuboDescargaFalta.isChecked()){
            grupoB.getProtecaoTuboDescarga().add("Faltando");
        }
        if(protecaoTuboDescargaSolta.isChecked()){
            grupoB.getProtecaoTuboDescarga().add("Solto");
        }
        if(articulacaoSolto.isChecked()){
            grupoB.getArticulacao().add("Solto");
        }
        if(articulacaoRasgado.isChecked()){
            grupoB.getArticulacao().add("Rasgado");
        }
        if(articulacaoFalta.isChecked()){
            grupoB.getArticulacao().add("Faltando");
        }
        if(articulacaoGasto.isChecked()){
            grupoB.getArticulacao().add("Gasto");
        }
        if(vazamentoExcessivoMotor.isChecked()){
            grupoB.getVazamentoExcessivo().add("Vazamento Motor");
        }
        if(vazamentoExcessivoCambio.isChecked()){
            grupoB.getVazamentoExcessivo().add("Vazamento Cambio");
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
