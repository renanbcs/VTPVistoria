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

public class GrupoBIluminacaoExternaSinalizacaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox faroisOculosAlto;
    private CheckBox faroisOculosBaixo;
    private CheckBox faroisOculosFalta;
    private CheckBox faroisOculosSolto;
    private CheckBox faroisOculosQuebrado;
    private CheckBox luzesSetaEmergenciaDanificada;
    private CheckBox luzesSetaEmergenciaNaoFunciona;
    private CheckBox luzesSetaEmergenciaFalta;
    private CheckBox luzesSetaEmergenciaQuebrada;
    private CheckBox lanternasLentesDanificada;
    private CheckBox lanternasLentesNaoFunciona;
    private CheckBox luzesDelimitadorasVigiasLentesFaltando;
    private CheckBox luzesDelimitadorasVigiasLentesNaoFunciona;
    private CheckBox luzFreioLentesDanificada;
    private CheckBox luzFreioLentesNaoFunciona;
    private CheckBox luzFreioLentesConservacaoIrregular;
    private CheckBox brakeLightNaoFunciona;
    private CheckBox brakeLightFalta;
    private CheckBox brakeLightConservacaoIrregular;
    private CheckBox luzReFalta;
    private CheckBox luzReNaoFunciona;
    private CheckBox luzReSemLente;
    private CheckBox luzReConservacaoIrregular;
    private CheckBox luzPlacaNaoFunciona;
    private CheckBox luzPlacaFalta;
    private CheckBox luzPlacaConservacaoIrregular;


    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_iluminacao_externa_sinalizacao);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        faroisOculosAlto = (CheckBox)findViewById(R.id.faroisOculosAlto);
        faroisOculosBaixo = (CheckBox)findViewById(R.id.faroisOculosBaixo);
        faroisOculosFalta = (CheckBox)findViewById(R.id.faroisOculosFalta);
        faroisOculosSolto = (CheckBox)findViewById(R.id.faroisOculosSolto);
        faroisOculosQuebrado = (CheckBox)findViewById(R.id.faroisOculosQuebrado);
        luzesSetaEmergenciaDanificada = (CheckBox)findViewById(R.id.luzesSetaEmergenciaDanificada);
        luzesSetaEmergenciaNaoFunciona = (CheckBox)findViewById(R.id.luzesSetaEmergenciaNaoFunciona);
        luzesSetaEmergenciaFalta = (CheckBox)findViewById(R.id.luzesSetaEmergenciaFalta);
        luzesSetaEmergenciaQuebrada = (CheckBox)findViewById(R.id.luzesSetaEmergenciaQuebrada);
        lanternasLentesDanificada = (CheckBox)findViewById(R.id.lanternasLentesDanificada);
        lanternasLentesNaoFunciona = (CheckBox)findViewById(R.id.lanternasLentesNaoFunciona);
        luzesDelimitadorasVigiasLentesFaltando = (CheckBox)findViewById(R.id.luzesDelimitadorasVigiasLentesFaltando);
        luzesDelimitadorasVigiasLentesNaoFunciona = (CheckBox)findViewById(R.id.luzesDelimitadorasVigiasLentesNaoFunciona);
        luzFreioLentesDanificada = (CheckBox)findViewById(R.id.luzFreioLentesDanificada);
        luzFreioLentesNaoFunciona = (CheckBox)findViewById(R.id.luzFreioLentesNaoFunciona);
        luzFreioLentesConservacaoIrregular = (CheckBox)findViewById(R.id.luzFreioLentesConservacaoIrregular);
        brakeLightNaoFunciona = (CheckBox)findViewById(R.id.brakeLightNaoFunciona);
        brakeLightFalta = (CheckBox)findViewById(R.id.brakeLightFalta);
        brakeLightConservacaoIrregular = (CheckBox)findViewById(R.id.brakeLightConservacaoIrregular);
        luzReFalta = (CheckBox)findViewById(R.id.luzReFalta);
        luzReNaoFunciona = (CheckBox)findViewById(R.id.luzReNaoFunciona);
        luzReSemLente = (CheckBox)findViewById(R.id.luzReSemLente);
        luzReConservacaoIrregular = (CheckBox)findViewById(R.id.luzReConservacaoIrregular);
        luzPlacaNaoFunciona = (CheckBox)findViewById(R.id.luzPlacaNaoFunciona);
        luzPlacaFalta = (CheckBox)findViewById(R.id.luzPlacaFalta);
        luzPlacaConservacaoIrregular = (CheckBox)findViewById(R.id.luzPlacaConservacaoIrregular);


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
                Intent intent = new Intent(getApplicationContext(),GrupoBSistemaEletricoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoB == null)
            grupoB = new GrupoB();

        //grupoB.setIdFicha(1l);
        grupoB.setFaroisOculosAlto(faroisOculosAlto.isChecked());
        grupoB.setFaroisOculosBaixo(faroisOculosBaixo.isChecked());
        grupoB.setFaroisOculosFalta(faroisOculosFalta.isChecked());
        grupoB.setFaroisOculosSolto(faroisOculosSolto.isChecked());
        grupoB.setFaroisOculosQuebrado(faroisOculosQuebrado.isChecked());
        grupoB.setLuzesSetaEmergenciaDanificada(luzesSetaEmergenciaDanificada.isChecked());
        grupoB.setLuzesSetaEmergenciaNaoFunciona	(luzesSetaEmergenciaNaoFunciona.isChecked());
        grupoB.setLuzesSetaEmergenciaFalta(luzesSetaEmergenciaFalta.isChecked());
        grupoB.setLuzesSetaEmergenciaQuebrada(luzesSetaEmergenciaQuebrada.isChecked());
        grupoB.setLanternasLentesDanificada(lanternasLentesDanificada.isChecked());
        grupoB.setLanternasLentesNaoFunciona(lanternasLentesNaoFunciona.isChecked());
        grupoB.setLuzesDelimitadorasVigiasLentesFaltando	(luzesDelimitadorasVigiasLentesFaltando.isChecked());
        grupoB.setLuzesDelimitadorasVigiasLentesNaoFunciona(luzesDelimitadorasVigiasLentesNaoFunciona.isChecked());
        grupoB.setLuzFreioLentesConservacaoIrregular(luzFreioLentesDanificada.isChecked());
        grupoB.setLuzFreioLentesNaoFunciona(luzFreioLentesNaoFunciona.isChecked());
        grupoB.setLuzFreioLentesConservacaoIrregular(luzFreioLentesConservacaoIrregular.isChecked());
        grupoB.setBrakeLightNaoFunciona(brakeLightNaoFunciona.isChecked());
        grupoB.setBrakeLightFalta(brakeLightFalta.isChecked());
        grupoB.setBrakeLightConservacaoIrregular(brakeLightConservacaoIrregular.isChecked());
        grupoB.setLuzReFalta(luzReFalta.isChecked());
        grupoB.setLuzReNaoFunciona(luzReNaoFunciona.isChecked());
        grupoB.setLuzReSemLente(luzReSemLente.isChecked());
        grupoB.setLuzReConservacaoIrregular(luzReConservacaoIrregular.isChecked());
        grupoB.setLuzPlacaNaoFunciona(luzPlacaNaoFunciona.isChecked());
        grupoB.setLuzPlacaFalta(luzPlacaFalta.isChecked());
        grupoB.setLuzPlacaConservacaoIrregular(luzPlacaConservacaoIrregular.isChecked());

        inspecao.setGrupoB(grupoB);
        //grupoB.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
