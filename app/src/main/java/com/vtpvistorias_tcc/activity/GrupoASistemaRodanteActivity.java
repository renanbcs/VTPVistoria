package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoASistemaRodanteActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox pneuDesgastado;
    private CheckBox pneuIrregular;
    private CheckBox pneuDanificado;
    private CheckBox pneuTalao;

    private CheckBox rodaFaltaPorca;
    private CheckBox rodaFaltaEspelho;
    private CheckBox rodaDanificada;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_sistema_rodante);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        pneuDesgastado = (CheckBox)findViewById(R.id.pneuDesgastado);
        pneuIrregular = (CheckBox)findViewById(R.id.pneuIrregular);
        pneuDanificado = (CheckBox)findViewById(R.id.pneuDanificado);
        pneuTalao = (CheckBox)findViewById(R.id.pneuTalao);

        rodaFaltaPorca = (CheckBox)findViewById(R.id.rodaFaltaPorca);
        rodaFaltaEspelho = (CheckBox)findViewById(R.id.rodaFaltaEspelho);
        rodaDanificada = (CheckBox)findViewById(R.id.rodaDanificada);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoA = inspecao.getGrupoA();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:
                salvarDados();
                Intent intent = new Intent(getApplicationContext(),GrupoASistemaEixoDianteiroActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoA == null)
            grupoA = new GrupoA();

        //grupoA.setIdFicha(1l);
        grupoA.setPneuDesgastado(pneuDesgastado.isChecked());
        grupoA.setPneuIrregular(pneuIrregular.isChecked());
        grupoA.setPneuDanificado(pneuDanificado.isChecked());
        grupoA.setPneuTalao(pneuTalao.isChecked());

        grupoA.setRodaFaltaPorca(rodaFaltaPorca.isChecked());
        grupoA.setRodaFaltaEspelho(rodaFaltaEspelho.isChecked());
        grupoA.setRodaDanificada(rodaDanificada.isChecked());

        inspecao.setGrupoA(grupoA);
        //grupoA.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
