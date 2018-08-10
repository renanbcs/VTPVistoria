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

public class GrupoBIluminacaoInternaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox caixaItinerarioIluminacaoInsulficiente;
    private CheckBox caixaItinerarioTampaSolta;
    private CheckBox caixaItinerarioMecanicaDefeito;
    private CheckBox caixaItinerariaVidroQuebrado;
    private CheckBox caixaItinerarioFaltaBorracha;
    private CheckBox iluminacaoSalaoInternaNaoFunciona;
    private CheckBox iluminacaoSalaoInternaQuebrada;
    private CheckBox iluminacaoSalaoInternaFalta;
    private CheckBox solicitacaoParadaLampadaQueimada;
    private CheckBox solicitacaoParadaSonoroNaoFunciona;
    private CheckBox solicitacaoParadaSemCordao;
    private CheckBox luzDegrauFalta;
    private CheckBox luzDegrauNaoFunciona;

    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_iluminacao_interna);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        caixaItinerarioIluminacaoInsulficiente = (CheckBox)findViewById(R.id.caixaItinerarioIluminacaoInsulficiente);
        caixaItinerarioTampaSolta = (CheckBox)findViewById(R.id.caixaItinerarioTampaSolta);
        caixaItinerarioMecanicaDefeito = (CheckBox)findViewById(R.id.caixaItinerarioMecanicaDefeito);
        caixaItinerariaVidroQuebrado = (CheckBox)findViewById(R.id.caixaItinerariaVidroQuebrado);
        caixaItinerarioFaltaBorracha = (CheckBox)findViewById(R.id.caixaItinerarioFaltaBorracha);
        iluminacaoSalaoInternaNaoFunciona = (CheckBox)findViewById(R.id.iluminacaoSalaoInternaNaoFunciona);
        iluminacaoSalaoInternaQuebrada = (CheckBox)findViewById(R.id.iluminacaoSalaoInternaQuebrada);
        iluminacaoSalaoInternaFalta = (CheckBox)findViewById(R.id.iluminacaoSalaoInternaFalta);
        solicitacaoParadaLampadaQueimada = (CheckBox)findViewById(R.id.solicitacaoParadaLampadaQueimada);
        solicitacaoParadaSonoroNaoFunciona = (CheckBox)findViewById(R.id.solicitacaoParadaSonoroNaoFunciona);
        solicitacaoParadaSemCordao = (CheckBox)findViewById(R.id.solicitacaoParadaSemCordao);
        luzDegrauFalta = (CheckBox)findViewById(R.id.luzDegrauFalta);
        luzDegrauNaoFunciona = (CheckBox)findViewById(R.id.luzDegrauNaoFunciona);

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
                Intent intent = new Intent(getApplicationContext(),GrupoBIluminacaoInternaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoB == null)
            grupoB = new GrupoB();

        //grupoB.setIdFicha(1l);
        grupoB.setCaixaItinerarioIluminacaoInsulficiente(caixaItinerarioIluminacaoInsulficiente.isChecked());
        grupoB.setCaixaItinerarioTampaSolta(caixaItinerarioTampaSolta.isChecked());
        grupoB.setCaixaItinerarioMecanicaDefeito(caixaItinerarioMecanicaDefeito.isChecked());
        grupoB.setCaixaItinerariaVidroQuebrado(caixaItinerariaVidroQuebrado.isChecked());
        grupoB.setCaixaItinerarioFaltaBorracha(caixaItinerarioFaltaBorracha.isChecked());
        grupoB.setIluminacaoSalaoInternaNaoFunciona(iluminacaoSalaoInternaNaoFunciona.isChecked());
        grupoB.setIluminacaoSalaoInternaQuebrada(iluminacaoSalaoInternaQuebrada.isChecked());
        grupoB.setIluminacaoSalaoInternaFalta(iluminacaoSalaoInternaFalta.isChecked());
        grupoB.setSolicitacaoParadaLampadaQueimada(solicitacaoParadaLampadaQueimada.isChecked());
        grupoB.setSolicitacaoParadaSonoroNaoFunciona(solicitacaoParadaSonoroNaoFunciona.isChecked());
        grupoB.setSolicitacaoParadaSemCordao(solicitacaoParadaSemCordao.isChecked());
        grupoB.setLuzDegrauFalta(luzDegrauFalta.isChecked());
        grupoB.setLuzDegrauNaoFunciona(luzDegrauNaoFunciona.isChecked());



        //inspecao.setGrupoB(grupoB);
        //grupoB.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
