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





    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_sistema_carroceria);

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
        grupoB.setParabrisaSolto(parabrisaSolto.isChecked());
        grupoB.setParabrisaTrincado(parabrisaTrincado.isChecked());

        grupoB.setVidroTraseiroFalta(vidroTraseiroFalta.isChecked());
        grupoB.setVidroTraseiroQuebrado(vidroTraseiroQuebrado.isChecked());
        grupoB.setVidroTraseiroSolto(vidroTraseiroSolto.isChecked());
        grupoB.setVidroTraseiroTrincado(vidroTraseiroTrincado.isChecked());
        grupoB.setVidroTraseiroOutro(vidroTraseiroOutro.isChecked());

        grupoB.setEstruturaColunaDanificada(estruturaColunaDanificada.isChecked());

        grupoB.setOculosTrincado(oculosTrincado.isChecked());

        grupoB.setRevestimentoExternoChapariaSolto(revestimentoExternoChapariaSolto.isChecked());
        grupoB.setRevestimentoExternoChapariaDanificado(revestimentoExternoChapariaDanificado.isChecked());

        grupoB.setBancosRasgado(bancosRasgado.isChecked());
        grupoB.setBancosSolto(bancosSolto.isChecked());
        grupoB.setBancosQuebrado(bancosQuebrado.isChecked());
        grupoB.setBancosDanificado(bancosDanificado.isChecked());
        grupoB.setBancosFalta(bancosFalta.isChecked());

        grupoB.setBancosPassageirosRasgado(bancosPassageirosRasgado.isChecked());
        grupoB.setBancosPassageirosSolto(bancosPassageirosSolto.isChecked());
        grupoB.setBancosPassageirosQuebrado(bancosPassageirosQuebrado.isChecked());
        grupoB.setBancosPassageirosDanificado(bancosPassageirosDanificado.isChecked());
        grupoB.setBancosPassageirosFalta(bancosPassageirosFalta.isChecked());

        grupoB.setSistemasPortasMancalNaoFunciona(sistemasPortasMancalNaoFunciona.isChecked());
        grupoB.setSistemasPortasMancalQuebrada(sistemasPortasMancalQuebrada.isChecked());
        grupoB.setSistemasPortasMancalSolta(sistemasPortasMancalSolta.isChecked());

        grupoB.setFolhasPortasRevestimentoQuebrada(folhasPortasRevestimentoQuebrada.isChecked());
        grupoB.setFolhasPortasRevestimentoDanificada(folhasPortasRevestimentoDanificada.isChecked());
        grupoB.setFolhasPortasRevestimentoSolta(folhasPortasRevestimentoSolta.isChecked());

        grupoB.setBorrachaPortasFalta(borrachaPortasFalta.isChecked());
        grupoB.setBorrachaPortasQuebrada(borrachaPortasQuebrada.isChecked());

        grupoB.setTampaoPistaoPortasFalta(tampaoPistaoPortasFalta.isChecked());
        grupoB.setTampaoPistaoPortasQuebrada(tampaoPistaoPortasQuebrada.isChecked());
        grupoB.setTampaoPistaoPortasSolta(tampaoPistaoPortasSolta.isChecked());

        grupoB.setCilindroPortasVazando(cilindroPortasVazando.isChecked());
        grupoB.setCilindroPortasDanificada(cilindroPortasDanificada.isChecked());
        grupoB.setCilindroPortasSolta(cilindroPortasSolta.isChecked());

        grupoB.setJanelaLateralMotoristaDanificada(janelaLateralMotoristaDanificada.isChecked());
        grupoB.setJanelaLateralMotoristaEmpenada(janelaLateralMotoristaEmpenada.isChecked());
        grupoB.setJanelaLateralMotoristaFalta(janelaLateralMotoristaFalta.isChecked());

        grupoB.setQuadroJanelaQuebrado(quadroJanelaQuebrado.isChecked());
        grupoB.setQuadroJanelaSolto(quadroJanelaSolto.isChecked());

        grupoB.setSeparadorLimitadorPuxadorFalta(separadorLimitadorPuxadorFalta.isChecked());
        grupoB.setSeparadorLimitadorPuxadorDanificado(separadorLimitadorPuxadorDanificado.isChecked());

        grupoB.setParachoquePonteiraDanificado(parachoquePonteiraDanificado.isChecked());
        grupoB.setParachoquePonteiraFalta(parachoquePonteiraFalta.isChecked());
        grupoB.setParachoquePonteiraSolta(parachoquePonteiraSolta.isChecked());

        grupoB.setEspelhosRetrovisoresConvexosFalta(espelhosRetrovisoresConvexosFalta.isChecked());
        grupoB.setEspelhosRetrovisoresConvexosQuebrado(espelhosRetrovisoresConvexosQuebrado.isChecked());
        grupoB.setEspelhosRetrovisoresConvexosSolto(espelhosRetrovisoresConvexosSolto.isChecked());

        grupoB.setLimpadorParaBrisaFalta(limpadorParaBrisaFalta.isChecked());
        grupoB.setLimpadorParaBrisaNaoFunciona(limpadorParaBrisaNaoFunciona.isChecked());

        grupoB.setLimpezaInterna(limpezaInterna.isChecked());
        grupoB.setLimpezaExterna(limpezaExterna.isChecked());
        grupoB.setLimpezaInferior(limpezaInferior.isChecked());




        inspecao.setGrupoB(grupoB);
        //grupoB.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
