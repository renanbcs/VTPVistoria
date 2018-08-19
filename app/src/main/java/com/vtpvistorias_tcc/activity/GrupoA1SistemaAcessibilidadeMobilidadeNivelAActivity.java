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
    private GrupoA1 grupoA1;
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
                Intent intent = new Intent(getApplicationContext(),SelecionarFichaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoA1 == null)
            grupoA1 = new GrupoA1();

        //grupoC.setIdFicha(1l);

        grupoA1.setAreaCadeirasRodasMenorEspecificacao(areaCadeirasRodasMenorEspecificacao.isChecked());
        grupoA1.setComunicacaoVisualInternaAdesivosObstaculos(comunicacaoVisualInternaAdesivosObstaculos.isChecked());
        grupoA1.setAreaManobrasObstaculos(areaManobrasObstaculos.isChecked());
        grupoA1.setPortasFechamentoDeficiente(portasFechamentoDeficiente.isChecked());
        grupoA1.setPortasConservacao(portasConservacao.isChecked());
        grupoA1.setPortasNaoTrava(portasNaoTrava.isChecked());
        grupoA1.setElevadorIncompativel(elevadorIncompativel.isChecked());
        grupoA1.setElevadorVaoLivre(elevadorVaoLivre.isChecked());
        grupoA1.setElevadorCursoIncompativel(elevadorCursoIncompativel.isChecked());
        grupoA1.setElevadorSeparado(elevadorSeparado.isChecked());
        grupoA1.setElevadorInacessivel(elevadorInacessivel.isChecked());
        grupoA1.setElevadorInexistente(elevadorInexistente.isChecked());
        grupoA1.setElevadorNaoFunciona(elevadorNaoFunciona.isChecked());
        grupoA1.setElevadorPinturaForaPadrao(elevadorPinturaForaPadrao.isChecked());
        grupoA1.setElevadorObstaculo(elevadorObstaculo.isChecked());
        grupoA1.setElevadorRapido(elevadorRapido.isChecked());
        grupoA1.setElevadorBrusco(elevadorBrusco.isChecked());
        grupoA1.setElevadorBarulho(elevadorBarulho.isChecked());
        grupoA1.setElevadorOutros(elevadorOutros.isChecked());
        grupoA1.setElevadorBarulhoExcessivo(elevadorBarulhoExcessivo.isChecked());
        grupoA1.setElevadorVazamento(elevadorVazamento.isChecked());
        grupoA1.setElevadorInoperante(elevadorInoperante.isChecked());
        grupoA1.setItensSegurancaInexistente(itensSegurancaInexistente.isChecked());
        grupoA1.setItensSegurancaFuncionamento(itensSegurancaFuncionamento.isChecked());
        grupoA1.setItensSegurancaInoperante(itensSegurancaInoperante.isChecked());
        grupoA1.setItensSegurancaConservacao(itensSegurancaConservacao.isChecked());
        grupoA1.setItensSegurancaTransporteDeficiente(itensSegurancaTransporteDeficiente.isChecked());
        grupoA1.setItensSegurancaMaterialNaoResiliente(itensSegurancaMaterialNaoResiliente.isChecked());

        inspecao.setGrupoA1(grupoA1);
        //grupoC.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
