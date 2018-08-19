package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA1;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoA1SistemaCarroceriaNivelBActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox tacografoFalta;
    private CheckBox tacografoFaltaLacre;
    private CheckBox tacografoNaoFunciona;
    private CheckBox tacografoEstadoConservacao;
    private CheckBox pisoLiso;
    private CheckBox pisoSujo;
    private CheckBox pisoDerrapante;
    private CheckBox quebraSolInexistente;
    private CheckBox quebraSolDesregulado;
    private CheckBox quebraSolSolto;
    private CheckBox desembacadorParaBrisaNaoFunciona;
    private CheckBox desembacadorParaBrisaFalta;
    private CheckBox bancosAltosSimplesInexistentes;
    private CheckBox bancosAltosSimplesConservacao;
    private CheckBox bancosAltosSimplesFixacao;
    private CheckBox radioComunicacaoNaoFunciona;
    private CheckBox radioComunicacaoFixacao;
    private CheckBox radioComunicacaoConservacao;
    private CheckBox radioComunicacaoLenteDanificada;
    private CheckBox brakeLightInexistente;
    private CheckBox brakeLightSolto;
    private CheckBox comunicacaoVisualInternaAdesivosInexistente;
    private CheckBox comunicacaoVisualInternaAdesivosConservacao;
    private CheckBox comunicacaoVisualInternaAdesivosForaPadrao;



    private DatabaseReference firebase;
    private GrupoA1 grupoA1;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a1_sistema_carroceria_nivel_b);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        tacografoFalta = (CheckBox)findViewById(R.id.tacografoFalta);
        tacografoFaltaLacre = (CheckBox)findViewById(R.id.tacografoFaltaLacre);
        tacografoNaoFunciona = (CheckBox)findViewById(R.id.tacografoNaoFunciona);
        tacografoEstadoConservacao = (CheckBox)findViewById(R.id.tacografoEstadoConservacao);
        pisoLiso = (CheckBox)findViewById(R.id.pisoLiso);
        pisoSujo = (CheckBox)findViewById(R.id.pisoSujo);
        pisoDerrapante = (CheckBox)findViewById(R.id.pisoDerrapante);
        quebraSolInexistente = (CheckBox)findViewById(R.id.quebraSolInexistente);
        quebraSolDesregulado = (CheckBox)findViewById(R.id.quebraSolDesregulado);
        quebraSolSolto = (CheckBox)findViewById(R.id.quebraSolSolto);
        desembacadorParaBrisaNaoFunciona = (CheckBox)findViewById(R.id.desembacadorParaBrisaNaoFunciona);
        desembacadorParaBrisaFalta = (CheckBox)findViewById(R.id.desembacadorParaBrisaFalta);
        bancosAltosSimplesInexistentes = (CheckBox)findViewById(R.id.bancosAltosSimplesInexistentes);
        bancosAltosSimplesConservacao = (CheckBox)findViewById(R.id.bancosAltosSimplesConservacao);
        bancosAltosSimplesFixacao = (CheckBox)findViewById(R.id.bancosAltosSimplesFixacao);
        radioComunicacaoNaoFunciona = (CheckBox)findViewById(R.id.radioComunicacaoNaoFunciona);
        radioComunicacaoFixacao = (CheckBox)findViewById(R.id.radioComunicacaoFixacao);
        radioComunicacaoConservacao = (CheckBox)findViewById(R.id.radioComunicacaoConservacao);
        radioComunicacaoLenteDanificada = (CheckBox)findViewById(R.id.radioComunicacaoLenteDanificada);
        brakeLightInexistente = (CheckBox)findViewById(R.id.brakeLightInexistente);
        brakeLightSolto = (CheckBox)findViewById(R.id.brakeLightSolto);
        comunicacaoVisualInternaAdesivosInexistente = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosInexistente);
        radioComunicacaoNaoFunciona = (CheckBox)findViewById(R.id.radioComunicacaoNaoFunciona);
        comunicacaoVisualInternaAdesivosConservacao = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosConservacao);
        comunicacaoVisualInternaAdesivosForaPadrao = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosForaPadrao);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoA1 = inspecao.getGrupoA1();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:
                salvarDados();
                Intent intent = new Intent(getApplicationContext(),GrupoA1SistemaAcessibilidadeMobilidadeNivelAActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoA1 == null)
            grupoA1 = new GrupoA1();

        //grupoC.setIdFicha(1l);
        grupoA1.setTacografoFalta(tacografoFalta.isChecked());
        grupoA1.setTacografoFaltaLacre(tacografoFaltaLacre.isChecked());
        grupoA1.setTacografoNaoFunciona(tacografoNaoFunciona.isChecked());
        grupoA1.setTacografoEstadoConservacao(tacografoEstadoConservacao.isChecked());
        grupoA1.setPisoLiso(pisoLiso.isChecked());
        grupoA1.setPisoSujo(pisoSujo.isChecked());
        grupoA1.setQuebraSolInexistente(quebraSolInexistente.isChecked());
        grupoA1.setQuebraSolDesregulado(quebraSolDesregulado.isChecked());
        grupoA1.setQuebraSolSolto(quebraSolSolto.isChecked());
        grupoA1.setDesembacadorParaBrisaFalta(desembacadorParaBrisaFalta.isChecked());
        grupoA1.setBancosAltosSimplesInexistentes(bancosAltosSimplesInexistentes.isChecked());
        grupoA1.setBancosAltosSimplesConservacao(bancosAltosSimplesConservacao.isChecked());
        grupoA1.setBancosAltosSimplesFixacao(bancosAltosSimplesFixacao.isChecked());
        grupoA1.setRadioComunicacaoNaoFunciona(radioComunicacaoNaoFunciona.isChecked());
        grupoA1.setRadioComunicacaoFixacao(radioComunicacaoFixacao.isChecked());
        grupoA1.setRadioComunicacaoConservacao(radioComunicacaoConservacao.isChecked());
        grupoA1.setRadioComunicacaoLenteDanificada(radioComunicacaoLenteDanificada.isChecked());
        grupoA1.setBrakeLightInexistente(brakeLightInexistente.isChecked());
        grupoA1.setBrakeLightSolto(brakeLightSolto.isChecked());
        grupoA1.setComunicacaoVisualInternaAdesivosInexistente(comunicacaoVisualInternaAdesivosInexistente.isChecked());
        grupoA1.setComunicacaoVisualInternaAdesivosConservacao(comunicacaoVisualInternaAdesivosConservacao.isChecked());
        grupoA1.setComunicacaoVisualInternaAdesivosForaPadrao(comunicacaoVisualInternaAdesivosForaPadrao.isChecked());


        inspecao.setGrupoA1(grupoA1);
        //grupoC.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
