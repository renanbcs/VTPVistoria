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
import com.vtpvistorias_tcc.Model.GrupoC;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoA1SistemaAcessibilidadeMobilidadeNivelAActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox areaCadeirasRodasMenorEspecificacao;
    private CheckBox comunicacaoVisualInternaAdesivosObstaculos;
    private CheckBox areaManobrasObstaculos;
    private CheckBox portasFechamentoDeficiente;
    private CheckBox portasConservacao;
    private CheckBox portasNaoTrava;
    private CheckBox elevadorIncompativel;
    private CheckBox elevadorCursoIncompativel;
    private CheckBox elevadorVaoLivre;
    private CheckBox elevadorSeparado;
    private CheckBox elevadorInacessivel;
    private CheckBox elevadorInexistente;
    private CheckBox elevadorNaoFunciona;
    private CheckBox elevadorPinturaForaPadrao;
    private CheckBox elevadorObstaculo;
    private CheckBox elevadorRapido;
    private CheckBox elevadorBrusco;
    private CheckBox elevadorBarulho;
    private CheckBox elevadorBarulhoExcessivo;
    private CheckBox elevadorVazamento;
    private CheckBox elevadorOutros;
    private CheckBox elevadorInoperante;
    private CheckBox itensSegurancaInexistente;
    private CheckBox itensSegurancaFuncionamento;
    private CheckBox itensSegurancaInoperante;
    private CheckBox itensSegurancaConservacao;
    private CheckBox itensSegurancaTransporteDeficiente;
    private CheckBox itensSegurancaMaterialNaoResiliente;


    private DatabaseReference firebase;
    private GrupoC grupoC;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a1_sistema_acessibilidade_mobilidade_nivel_a);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        areaCadeirasRodasMenorEspecificacao = (CheckBox)findViewById(R.id.areaCadeirasRodasMenorEspecificacao);
        comunicacaoVisualInternaAdesivosObstaculos = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosObstaculos);
        areaManobrasObstaculos = (CheckBox)findViewById(R.id.areaManobrasObstaculos);
        portasFechamentoDeficiente = (CheckBox)findViewById(R.id.portasFechamentoDeficiente);
        portasConservacao = (CheckBox)findViewById(R.id.portasConservacao);
        portasNaoTrava = (CheckBox)findViewById(R.id.portasNaoTrava);
        elevadorIncompativel = (CheckBox)findViewById(R.id.elevadorIncompativel);
        elevadorVaoLivre = (CheckBox)findViewById(R.id.elevadorVaoLivre);
        elevadorCursoIncompativel = (CheckBox)findViewById(R.id.elevadorCursoIncompativel);
        elevadorSeparado = (CheckBox)findViewById(R.id.elevadorSeparado);
        elevadorInacessivel = (CheckBox)findViewById(R.id.elevadorInacessivel);
        elevadorInexistente = (CheckBox)findViewById(R.id.elevadorInexistente);
        elevadorNaoFunciona = (CheckBox)findViewById(R.id.elevadorNaoFunciona);
        elevadorPinturaForaPadrao = (CheckBox)findViewById(R.id.elevadorPinturaForaPadrao);
        elevadorObstaculo = (CheckBox)findViewById(R.id.elevadorObstaculo);
        elevadorRapido = (CheckBox)findViewById(R.id.elevadorRapido);
        elevadorBrusco = (CheckBox)findViewById(R.id.elevadorBrusco);
        elevadorBarulho = (CheckBox)findViewById(R.id.elevadorBarulho);
        elevadorOutros = (CheckBox)findViewById(R.id.elevadorOutros);
        elevadorBarulhoExcessivo = (CheckBox)findViewById(R.id.elevadorBarulhoExcessivo);
        elevadorVazamento = (CheckBox)findViewById(R.id.elevadorVazamento);
        elevadorInoperante = (CheckBox)findViewById(R.id.elevadorInoperante);
        itensSegurancaInexistente = (CheckBox)findViewById(R.id.itensSegurancaInexistente);
        itensSegurancaFuncionamento = (CheckBox)findViewById(R.id.itensSegurancaFuncionamento);
        itensSegurancaInoperante = (CheckBox)findViewById(R.id.itensSegurancaInoperante);
        itensSegurancaConservacao = (CheckBox)findViewById(R.id.itensSegurancaConservacao);
        itensSegurancaTransporteDeficiente = (CheckBox)findViewById(R.id.itensSegurancaTransporteDeficiente);
        itensSegurancaMaterialNaoResiliente = (CheckBox)findViewById(R.id.itensSegurancaMaterialNaoResiliente);



        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoC = inspecao.getGrupoC();
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

        if(grupoC == null)
            grupoC = new GrupoC();

        //grupoC.setIdFicha(1l);

        grupoC.setAreaCadeirasRodasMenorEspecificacao(areaCadeirasRodasMenorEspecificacao.isChecked());
        grupoC.setComunicacaoVisualInternaAdesivosObstaculos(comunicacaoVisualInternaAdesivosObstaculos.isChecked());
        grupoC.setAreaManobrasObstaculos(areaManobrasObstaculos.isChecked());
        grupoC.setPortasFechamentoDeficiente(portasFechamentoDeficiente.isChecked());
        grupoC.setPortasConservacao(portasConservacao.isChecked());
        grupoC.setPortasNaoTrava(portasNaoTrava.isChecked());
        grupoC.setElevadorIncompativel(elevadorIncompativel.isChecked());
        grupoC.setElevadorVaoLivre(elevadorVaoLivre.isChecked());
        grupoC.setElevadorCursoIncompativel(elevadorCursoIncompativel.isChecked());
        grupoC.setElevadorSeparado(elevadorSeparado.isChecked());
        grupoC.setElevadorInacessivel(elevadorInacessivel.isChecked());
        grupoC.setElevadorInexistente(elevadorInexistente.isChecked());
        grupoC.setElevadorNaoFunciona(elevadorNaoFunciona.isChecked());
        grupoC.setElevadorPinturaForaPadrao(elevadorPinturaForaPadrao.isChecked());
        grupoC.setElevadorObstaculo(elevadorObstaculo.isChecked());
        grupoC.setElevadorRapido(elevadorRapido.isChecked());
        grupoC.setElevadorBrusco(elevadorBrusco.isChecked());
        grupoC.setElevadorBarulho(elevadorBarulho.isChecked());
        grupoC.setElevadorOutros(elevadorOutros.isChecked());
        grupoC.setElevadorBarulhoExcessivo(elevadorBarulhoExcessivo.isChecked());
        grupoC.setElevadorVazamento(elevadorVazamento.isChecked());
        grupoC.setElevadorInoperante(elevadorInoperante.isChecked());
        grupoC.setItensSegurancaInexistente(itensSegurancaInexistente.isChecked());
        grupoC.setItensSegurancaFuncionamento(itensSegurancaFuncionamento.isChecked());
        grupoC.setItensSegurancaInoperante(itensSegurancaInoperante.isChecked());
        grupoC.setItensSegurancaConservacao(itensSegurancaConservacao.isChecked());
        grupoC.setItensSegurancaTransporteDeficiente(itensSegurancaTransporteDeficiente.isChecked());
        grupoC.setItensSegurancaMaterialNaoResiliente(itensSegurancaMaterialNaoResiliente.isChecked());

        //inspecao.setGrupoC(grupoC);
        //grupoC.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
