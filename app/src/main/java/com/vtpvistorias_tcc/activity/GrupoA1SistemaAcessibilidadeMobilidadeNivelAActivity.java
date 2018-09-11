package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA1;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

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

    private GrupoA1 grupoA1;
    private Intent i;
    private Inspecao inspecao;
    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a1_sistema_acessibilidade_mobilidade_nivel_a);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = findViewById(R.id.botaoProximo);
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

                inspecao.setGrupoA1(grupoA1);

                Intent intent = new Intent(getApplicationContext(),SelecionarFichaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        if(areaCadeirasRodasMenorEspecificacao.isChecked()){

            grupoA1.getAreaParaCadeiraDeRodas().add("Menor que a Especifição");
        }
        if(comunicacaoVisualInternaAdesivosObstaculos.isChecked()){

            grupoA1.getComunicacaoVisualInternaAdesivos().add("Com Obstaculos");
        }
        if(areaManobrasObstaculos.isChecked()){

            grupoA1.getAreaParaManobras().add("Com Obstaculos");
        }
        if(portasFechamentoDeficiente.isChecked()){

            grupoA1.getPortas().add("Fechamento Deficiente");
        }
        if(portasConservacao.isChecked()){

            grupoA1.getPortas().add("Ruim");
        }
        if(portasNaoTrava.isChecked()){

            grupoA1.getPortas().add("Não Trava");
        }
        if(elevadorIncompativel.isChecked()){

            grupoA1.getElevador().add("Incompativel");
        }
        if(elevadorCursoIncompativel.isChecked()){

            grupoA1.getElevador().add("Curso Incompleto");
        }
        if(elevadorVaoLivre.isChecked()){

            grupoA1.getElevador().add("Vão Livre Maior que o Permitido");
        }
        if(elevadorSeparado.isChecked()){

            grupoA1.getElevador().add("Separado");
        }
        if(elevadorInacessivel.isChecked()){

            grupoA1.getElevador().add("Inacessivel");
        }
        if(elevadorInexistente.isChecked()){

            grupoA1.getElevador().add("Inexistente");
        }
        if(elevadorNaoFunciona.isChecked()){

            grupoA1.getElevador().add("Não Funciona");
        }
        if(elevadorPinturaForaPadrao.isChecked()){

            grupoA1.getElevador().add("Fora do padrão");
        }
        if(elevadorObstaculo.isChecked()){

            grupoA1.getElevador().add("Com Obstaculos");
        }
        if(elevadorRapido.isChecked()){

            grupoA1.getElevador().add("Rapido");
        }
        if(elevadorBrusco.isChecked()){

            grupoA1.getElevador().add("Brucos");
        }
        if(elevadorBarulho.isChecked()){

            grupoA1.getElevador().add("Com Barulho");
        }
        if(elevadorOutros.isChecked()){

            grupoA1.getElevador().add("Com outros problemas");
        }
        if(elevadorBarulhoExcessivo.isChecked()){

            grupoA1.getElevador().add("Excessivo");
        }
        if(elevadorVazamento.isChecked()){

            grupoA1.getElevador().add("Vazando");
        }
        if(elevadorInoperante.isChecked()){

            grupoA1.getElevador().add("Inoperante");
        }
        if(itensSegurancaInexistente.isChecked()){

            grupoA1.getItensDeSeguranca().add("Inexistente");
        }
        if(itensSegurancaFuncionamento.isChecked()){

            grupoA1.getItensDeSeguranca().add("Não Funcionando");
        }
        if(itensSegurancaInoperante.isChecked()){

            grupoA1.getItensDeSeguranca().add("Inoperantes");
        }
        if(itensSegurancaConservacao.isChecked()){

            grupoA1.getItensDeSeguranca().add("Ruim");
        }
        if(itensSegurancaTransporteDeficiente.isChecked()){

            grupoA1.getItensDeSeguranca().add("Deficiente");
        }
        if(itensSegurancaMaterialNaoResiliente.isChecked()){

            grupoA1.getItensDeSeguranca().add("Material Não resiliente");
        }

    }

    //metodo para criar os menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //exiir os menus
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_main,menu);

        return true ;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item_sair) {
            deslogarUsuario();
        }

        return super.onOptionsItemSelected(item);
    }


    private void deslogarUsuario(){
        usuarioFirebase.signOut();
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }


}
