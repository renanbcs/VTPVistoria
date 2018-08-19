package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoBPostoComandoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox comandoPainelManometroNaoFunciona;
    private CheckBox comandoPainelVelocimentoNaoFunciona;
    private CheckBox comandoPainelLuzesNaoAcende;
    private CheckBox comandoPainelSistemaVentilacaoNaoFunciona;
    private CheckBox chaveSetaBuzinaNaoFunciona;
    private CheckBox chaveSetaBuzinaDanificada;
    private CheckBox chaveSetaBuzinaFalta;

    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_posto_de_comando);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        comandoPainelManometroNaoFunciona = (CheckBox)findViewById(R.id.comandoPainelManometroNaoFunciona);
        comandoPainelVelocimentoNaoFunciona = (CheckBox)findViewById(R.id.comandoPainelVelocimentoNaoFunciona);
        comandoPainelLuzesNaoAcende = (CheckBox)findViewById(R.id.comandoPainelLuzesNaoAcende);
        comandoPainelSistemaVentilacaoNaoFunciona = (CheckBox)findViewById(R.id.comandoPainelSistemaVentilacaoNaoFunciona);
        chaveSetaBuzinaNaoFunciona = (CheckBox)findViewById(R.id.chaveSetaBuzinaNaoFunciona);
        chaveSetaBuzinaDanificada = (CheckBox)findViewById(R.id.chaveSetaBuzinaDanificada);
        chaveSetaBuzinaFalta = (CheckBox)findViewById(R.id.chaveSetaBuzinaFalta);

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
                Intent intent = new Intent(getApplicationContext(),GrupoBInteriorVeiculoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoB == null)
            grupoB = new GrupoB();

        //grupoB.setIdFicha(1l);
        grupoB.setComandoPainelManometroNaoFunciona(comandoPainelManometroNaoFunciona.isChecked());
        grupoB.setComandoPainelVelocimentoNaoFunciona(comandoPainelVelocimentoNaoFunciona.isChecked());
        grupoB.setComandoPainelLuzesNaoAcende(comandoPainelLuzesNaoAcende.isChecked());
        grupoB.setComandoPainelSistemaVentilacaoNaoFunciona(comandoPainelSistemaVentilacaoNaoFunciona.isChecked());
        grupoB.setChaveSetaBuzinaNaoFunciona(chaveSetaBuzinaNaoFunciona.isChecked());
        grupoB.setChaveSetaBuzinaDanificada(chaveSetaBuzinaDanificada.isChecked());
        grupoB.setChaveSetaBuzinaFalta(chaveSetaBuzinaFalta.isChecked());


        inspecao.setGrupoB(grupoB);
        //grupoB.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
