package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;

public class DetalhesVeiculoActivity extends Activity implements View.OnClickListener {

    private TextView labelPrefixo,labelPlaca,labelChassi,labelBloqueado,labelEmpresa;
    private Veiculo veiculo;
    private Button buttonSim, buttonNao;
    private Inspecao inspecao;
    private String tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detalhes_veiculo);

        labelPrefixo = findViewById(R.id.textView_Prefixo);
        labelPlaca = findViewById(R.id.textView_PlacaLabel);
        labelChassi = findViewById(R.id.textView_Chassi);
        labelBloqueado = findViewById(R.id.textView_Bloqueado);
        labelEmpresa = findViewById(R.id.textView_Empresa);
        buttonSim = findViewById(R.id.button_Sim);
        buttonNao = findViewById(R.id.button_Não);

        Intent i = getIntent();

        veiculo = (Veiculo) i.getSerializableExtra("veiculo");
        tela = (String) i.getSerializableExtra("tela");

        labelPrefixo.setText(""+veiculo.getPrefixo());
        labelPlaca.setText(""+veiculo.getPlaca());
        labelChassi.setText(""+veiculo.getChassi());
        labelEmpresa.setText(""+veiculo.getEmpresa());
        labelBloqueado.setText(""+veiculo.isBloqueado());

        buttonNao.setOnClickListener(this);
        buttonSim.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button_Não:

                finish();

                break;

            case R.id.button_Sim:

                finish();

                if(tela.equals("lacrarVeiculo")){

                    Intent intent = new Intent(getApplicationContext(), EfetuarLacracaoVeiculoActivity.class);
                    intent.putExtra("veiculo", veiculo);

                    startActivity(intent);

                }else {

                    inspecao = new Inspecao();
                    inspecao.setVeiculo(veiculo);

                    Intent intent = new Intent(getApplicationContext(), SelecionarFichaActivity.class);
                    intent.putExtra("inspecao", inspecao);

                    startActivity(intent);
                }

                break;


        }

    }
}
