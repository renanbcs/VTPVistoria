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
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoBSistemaCarroceriaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox parabrisaSolto;
    private CheckBox parabrisaTrincado;

    private CheckBox vidroTraseiroFalta;
    private CheckBox vidroTraseiroQuebrado;
    private CheckBox vidroTraseiroSolto;
    private CheckBox vidroTraseiroTrincado;
    private CheckBox vidroTraseiroOutro;

    private CheckBox estruturaColunaDanificada;

    private CheckBox oculosTrincado;

    private CheckBox revestimentoExternoChapariaSolto;
    private CheckBox revestimentoExternoChapariaDanificado;

    private CheckBox bancosRasgado;
    private CheckBox bancosSolto;
    private CheckBox bancosQuebrado;
    private CheckBox bancosDanificado;
    private CheckBox bancosFalta;

    private CheckBox bancosPassageirosRasgado;
    private CheckBox bancosPassageirosSolto;
    private CheckBox bancosPassageirosQuebrado;
    private CheckBox bancosPassageirosDanificado;
    private CheckBox bancosPassageirosFalta;

    private CheckBox sistemasPortasMancalNaoFunciona;
    private CheckBox sistemasPortasMancalQuebrada;
    private CheckBox sistemasPortasMancalSolta;

    private CheckBox folhasPortasRevestimentoQuebrada;
    private CheckBox folhasPortasRevestimentoDanificada;
    private CheckBox folhasPortasRevestimentoSolta;

    private CheckBox borrachaPortasFalta;
    private CheckBox borrachaPortasQuebrada;

    private CheckBox tampaoPistaoPortasFalta;
    private CheckBox tampaoPistaoPortasQuebrada;
    private CheckBox tampaoPistaoPortasSolta;

    private CheckBox cilindroPortasVazando;
    private CheckBox cilindroPortasDanificada;
    private CheckBox cilindroPortasSolta;

    private CheckBox janelaLateralMotoristaDanificada;
    private CheckBox janelaLateralMotoristaEmpenada;
    private CheckBox janelaLateralMotoristaFalta;

    private CheckBox quadroJanelaQuebrado;
    private CheckBox quadroJanelaSolto;

    private CheckBox separadorLimitadorPuxadorFalta;
    private CheckBox separadorLimitadorPuxadorDanificado;

    private CheckBox parachoquePonteiraFalta;
    private CheckBox parachoquePonteiraSolta;
    private CheckBox parachoquePonteiraDanificado;

    private CheckBox espelhosRetrovisoresConvexosFalta;
    private CheckBox espelhosRetrovisoresConvexosQuebrado;
    private CheckBox espelhosRetrovisoresConvexosSolto;

    private CheckBox limpadorParaBrisaNaoFunciona;
    private CheckBox limpadorParaBrisaFalta;

    private CheckBox limpezaInterna;
    private CheckBox limpezaExterna;
    private CheckBox limpezaInferior;

    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_sistema_carroceria);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        parabrisaSolto = (CheckBox)findViewById(R.id.parabrisaSolto);
        parabrisaTrincado = (CheckBox)findViewById(R.id.parabrisaTrincado);

        vidroTraseiroFalta = (CheckBox)findViewById(R.id.vidroTraseiroFalta);
        vidroTraseiroQuebrado = (CheckBox)findViewById(R.id.vidroTraseiroQuebrado);
        vidroTraseiroSolto = (CheckBox)findViewById(R.id.vidroTraseiroSolto);
        vidroTraseiroTrincado = (CheckBox)findViewById(R.id.vidroTraseiroTrincado);
        vidroTraseiroOutro = (CheckBox)findViewById(R.id.vidroTraseiroOutro);

        estruturaColunaDanificada = (CheckBox)findViewById(R.id.estruturaColunaDanificada);

        oculosTrincado = (CheckBox)findViewById(R.id.oculosTrincado);

        revestimentoExternoChapariaSolto = (CheckBox)findViewById(R.id.revestimentoExternoChapariaSolto);
        revestimentoExternoChapariaDanificado = (CheckBox)findViewById(R.id.revestimentoExternoChapariaDanificado);

        bancosRasgado = (CheckBox)findViewById(R.id.bancosRasgado);
        bancosSolto = (CheckBox)findViewById(R.id.bancosSolto);
        bancosQuebrado = (CheckBox)findViewById(R.id.bancosQuebrado);
        bancosDanificado = (CheckBox)findViewById(R.id.bancosDanificado);
        bancosFalta = (CheckBox)findViewById(R.id.bancosFalta);

        bancosPassageirosRasgado = (CheckBox)findViewById(R.id.bancosPassageirosRasgado);
        bancosPassageirosSolto = (CheckBox)findViewById(R.id.bancosPassageirosSolto);
        bancosPassageirosQuebrado = (CheckBox)findViewById(R.id.bancosPassageirosQuebrado);
        bancosPassageirosDanificado = (CheckBox)findViewById(R.id.bancosPassageirosDanificado);
        bancosPassageirosFalta = (CheckBox)findViewById(R.id.bancosPassageirosFalta);

        sistemasPortasMancalNaoFunciona = (CheckBox)findViewById(R.id.sistemasPortasMancalNaoFunciona);
        sistemasPortasMancalQuebrada = (CheckBox)findViewById(R.id.sistemasPortasMancalQuebrada);
        sistemasPortasMancalSolta = (CheckBox)findViewById(R.id.sistemasPortasMancalSolta);

        folhasPortasRevestimentoQuebrada = (CheckBox)findViewById(R.id.folhasPortasRevestimentoQuebrada);
        folhasPortasRevestimentoDanificada = (CheckBox)findViewById(R.id.folhasPortasRevestimentoDanificada);
        folhasPortasRevestimentoSolta = (CheckBox)findViewById(R.id.folhasPortasRevestimentoSolta);

        borrachaPortasFalta = (CheckBox)findViewById(R.id.borrachaPortasFalta);
        borrachaPortasQuebrada = (CheckBox)findViewById(R.id.borrachaPortasQuebrada);

        tampaoPistaoPortasFalta = (CheckBox)findViewById(R.id.tampaoPistaoPortasFalta);
        tampaoPistaoPortasQuebrada = (CheckBox)findViewById(R.id.tampaoPistaoPortasQuebrada);
        tampaoPistaoPortasSolta = (CheckBox)findViewById(R.id.tampaoPistaoPortasSolta);

        cilindroPortasVazando = (CheckBox)findViewById(R.id.cilindroPortasVazando);
        cilindroPortasDanificada = (CheckBox)findViewById(R.id.cilindroPortasDanificada);
        cilindroPortasSolta = (CheckBox)findViewById(R.id.cilindroPortasSolta);

        janelaLateralMotoristaDanificada = (CheckBox)findViewById(R.id.janelaLateralMotoristaDanificada);
        janelaLateralMotoristaEmpenada = (CheckBox)findViewById(R.id.janelaLateralMotoristaEmpenada);
        janelaLateralMotoristaFalta = (CheckBox)findViewById(R.id.janelaLateralMotoristaFalta);

        quadroJanelaQuebrado = (CheckBox)findViewById(R.id.quadroJanelaQuebrado);
        quadroJanelaSolto = (CheckBox)findViewById(R.id.quadroJanelaSolto);

        separadorLimitadorPuxadorFalta = (CheckBox)findViewById(R.id.separadorLimitadorPuxadorFalta);
        separadorLimitadorPuxadorDanificado = (CheckBox)findViewById(R.id.separadorLimitadorPuxadorDanificado);

        parachoquePonteiraFalta = (CheckBox)findViewById(R.id.parachoquePonteiraFalta);
        parachoquePonteiraSolta = (CheckBox)findViewById(R.id.parachoquePonteiraSolta);
        parachoquePonteiraDanificado = (CheckBox)findViewById(R.id.parachoquePonteiraDanificado);

        espelhosRetrovisoresConvexosFalta = (CheckBox)findViewById(R.id.espelhosRetrovisoresConvexosFalta);
        espelhosRetrovisoresConvexosQuebrado = (CheckBox)findViewById(R.id.espelhosRetrovisoresConvexosQuebrado);
        espelhosRetrovisoresConvexosSolto = (CheckBox)findViewById(R.id.espelhosRetrovisoresConvexosSolto);

        limpadorParaBrisaNaoFunciona = (CheckBox)findViewById(R.id.limpadorParaBrisaNaoFunciona);
        limpadorParaBrisaFalta = (CheckBox)findViewById(R.id.limpadorParaBrisaFalta);

        limpezaInterna = (CheckBox)findViewById(R.id.limpezaInterna);
        limpezaExterna = (CheckBox)findViewById(R.id.limpezaExterna);
        limpezaInferior = (CheckBox)findViewById(R.id.limpezaInferior);

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

                Intent intent = new Intent(getApplicationContext(),GrupoBIluminacaoInternaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        grupoB = new GrupoB();

        if(parabrisaSolto.isChecked()){

            grupoB.getParaBrisa().add("Solto");
        }
        if(parabrisaTrincado.isChecked()){

            grupoB.getParaBrisa().add("Trincado");
        }
        if(vidroTraseiroFalta.isChecked()){

            grupoB.getVidroTraseiro().add("Faltando");
        }
        if(vidroTraseiroQuebrado.isChecked()){

            grupoB.getVidroTraseiro().add("Quebrado");
        }
        if(vidroTraseiroSolto.isChecked()){

            grupoB.getVidroTraseiro().add("Solta");
        }
        if(vidroTraseiroTrincado.isChecked()){

            grupoB.getVidroTraseiro().add("Trincado");
        }
        if(vidroTraseiroOutro.isChecked()){

            grupoB.getVidroTraseiro().add("Outro");
        }
        if(estruturaColunaDanificada.isChecked()){

            grupoB.getEstrutura().add("Danificada");
        }
        if(oculosTrincado.isChecked()){

            grupoB.getOculos().add("Trincado");
        }
        if(revestimentoExternoChapariaSolto.isChecked()){

            grupoB.getRevestimentoExternoChaparia().add("Solto");
        }
        if(revestimentoExternoChapariaDanificado.isChecked()){

            grupoB.getRevestimentoExternoChaparia().add("Danificado");
        }
        if(bancosRasgado.isChecked()){

            grupoB.getBancos().add("Rasgado");
        }
        if(bancosSolto.isChecked()){

            grupoB.getBancos().add("Solto");
        }
        if(bancosQuebrado.isChecked()){

            grupoB.getBancos().add("Quebrado");
        }
        if(bancosDanificado.isChecked()){

            grupoB.getBancos().add("Danificado");
        }
        if(bancosFalta.isChecked()){

            grupoB.getBancos().add("Falta");
        }
        if(bancosPassageirosRasgado.isChecked()){

            grupoB.getBancosPassageiros().add("Rasgado");
        }
        if(bancosPassageirosSolto.isChecked()){

            grupoB.getBancosPassageiros().add("Solto");
        }
        if(bancosPassageirosQuebrado.isChecked()){

            grupoB.getBancosPassageiros().add("Quebrado");
        }
        if(bancosPassageirosDanificado.isChecked()){

            grupoB.getBancosPassageiros().add("Danificado");
        }
        if(bancosPassageirosFalta.isChecked()){

            grupoB.getBancosPassageiros().add("Falta");
        }
        if(sistemasPortasMancalNaoFunciona.isChecked()){

            grupoB.getSistemasDePortasMancal().add("Não Funciona");
        }
        if(sistemasPortasMancalQuebrada.isChecked()){

            grupoB.getSistemasDePortasMancal().add("Quebrado");
        }
        if(sistemasPortasMancalSolta.isChecked()){

            grupoB.getSistemasDePortasMancal().add("Solta");
        }
        if(folhasPortasRevestimentoQuebrada.isChecked()){

            grupoB.getFolhasDasPortasRevestimento().add("Revestimento");
        }
        if(folhasPortasRevestimentoDanificada.isChecked()){

            grupoB.getFolhasDasPortasRevestimento().add("Danificada");
        }
        if(folhasPortasRevestimentoSolta.isChecked()){

            grupoB.getFolhasDasPortasRevestimento().add("Solta");
        }
        if(borrachaPortasFalta.isChecked()){

            grupoB.getBorrachaDasPortas().add("Falta");
        }
        if(borrachaPortasQuebrada.isChecked()){

            grupoB.getBorrachaDasPortas().add("Quebrada");
        }
        if(tampaoPistaoPortasFalta.isChecked()){

            grupoB.getTampaoPistaoDasPortas().add("Falta");
        }
        if(tampaoPistaoPortasQuebrada.isChecked()){

            grupoB.getTampaoPistaoDasPortas().add("Quebrada");
        }
        if(tampaoPistaoPortasSolta.isChecked()){

            grupoB.getTampaoPistaoDasPortas().add("Solta");
        }
        if(cilindroPortasVazando.isChecked()){

            grupoB.getCilindroDasPortas().add("Vazando");
        }
        if(cilindroPortasDanificada.isChecked()){

            grupoB.getCilindroDasPortas().add("Danificada");
        }
        if(cilindroPortasSolta.isChecked()){

            grupoB.getCilindroDasPortas().add("Solta");
        }
        if(janelaLateralMotoristaDanificada.isChecked()){

            grupoB.getJanelaLateralDoMotorista().add("Danificada");
        }
        if(janelaLateralMotoristaEmpenada.isChecked()){

            grupoB.getJanelaLateralDoMotorista().add("Empenada");
        }
        if(janelaLateralMotoristaFalta.isChecked()){

            grupoB.getJanelaLateralDoMotorista().add("Falta");
        }
        if(quadroJanelaQuebrado.isChecked()){

            grupoB.getQuadroDaJanela().add("Quebrado");
        }
        if(quadroJanelaSolto.isChecked()){

            grupoB.getQuadroDaJanela().add("Solta");
        }
        if(separadorLimitadorPuxadorFalta.isChecked()){

            grupoB.getSeparadorLimitadorPuxador().add("Falta");
        }
        if(separadorLimitadorPuxadorDanificado.isChecked()){

            grupoB.getSeparadorLimitadorPuxador().add("Danificado");
        }
        if(parachoquePonteiraDanificado.isChecked()){

            grupoB.getParachoquePonteira().add("Danificado");
        }
        if(parachoquePonteiraFalta.isChecked()){

            grupoB.getParachoquePonteira().add("Falta");
        }
        if(parachoquePonteiraSolta.isChecked()){

            grupoB.getParachoquePonteira().add("Solta");
        }
        if(espelhosRetrovisoresConvexosFalta.isChecked()){

            grupoB.getEspelhosRetrovisoresConvexos().add("Falta");
        }
        if(espelhosRetrovisoresConvexosQuebrado.isChecked()){

            grupoB.getEspelhosRetrovisoresConvexos().add("Quebrado");
        }
        if(espelhosRetrovisoresConvexosSolto.isChecked()){

            grupoB.getEspelhosRetrovisoresConvexos().add("Solto");
        }
        if(limpadorParaBrisaFalta.isChecked()){

            grupoB.getLimpadorParaBrisa().add("Falta");
        }
        if(limpadorParaBrisaNaoFunciona.isChecked()){

            grupoB.getLimpadorParaBrisa().add("Não Funciona");
        }
        if(limpezaInterna.isChecked()){

            grupoB.getLimpeza().add("Interna");
        }
        if(limpezaExterna.isChecked()){

            grupoB.getLimpeza().add("Externa");
        }
        if(limpezaInferior.isChecked()){

            grupoB.getLimpeza().add("Inferior");
        }

    }

    @Override
    public void onPause(){
        super.onPause();
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
