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

public class GrupoASistemaTracaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox eixoCardanFolga;
    private CheckBox eixoCardanDesalinhado;
    private CheckBox eixoCardanSolto;
    private CheckBox eixoCardanBorrachaDanificada;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_sistema_tracao);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        eixoCardanFolga = (CheckBox)findViewById(R.id.eixoCardanFolga);
        eixoCardanDesalinhado = (CheckBox)findViewById(R.id.eixoCardanDesalinhado);
        eixoCardanSolto = (CheckBox)findViewById(R.id.eixoCardanSolto);
        eixoCardanBorrachaDanificada = (CheckBox)findViewById(R.id.eixoCardanBorrachaDanificada);

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

                inspecao.setGrupoA(grupoA);

                Intent intent = new Intent(getApplicationContext(),GrupoASistemaRodanteActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(eixoCardanFolga.isChecked()){
            grupoA.getEixoCardan().add("Folga");
        }
        if(eixoCardanDesalinhado.isChecked()){
            grupoA.getEixoCardan().add("Desalinhado");
        }
        if(eixoCardanSolto.isChecked()){
            grupoA.getEixoCardan().add("Solto");
        }
        if(eixoCardanBorrachaDanificada.isChecked()){
            grupoA.getEixoCardan().add("Borracha Danificada");
        }
    }

}
