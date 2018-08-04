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

public class GrupoASistemaEixoDianteiroActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox caixaDirecaoSolta;
    private CheckBox caixaDirecaoVazamFlexEncanamento;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_sistema_eixo_dianteiro);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        caixaDirecaoSolta = (CheckBox)findViewById(R.id.caixaDirecaoSolta);
        caixaDirecaoVazamFlexEncanamento = (CheckBox)findViewById(R.id.caixaDirecaoVazamFlexEncanamento);

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
                Intent intent = new Intent(getApplicationContext(),GrupoAChassioPlataformaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoA == null)
            grupoA = new GrupoA();

        //grupoA.setIdFicha(1l);
        grupoA.setCaixaDirecaoSolta(caixaDirecaoSolta.isChecked());
        grupoA.setCaixaDirecaoVazamFlexEncanamento(caixaDirecaoVazamFlexEncanamento.isChecked());


        //inspecao.setGrupoA(grupoA);
        //grupoA.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

}
