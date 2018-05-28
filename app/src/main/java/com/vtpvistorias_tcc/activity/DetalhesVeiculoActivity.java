package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;

public class DetalhesVeiculoActivity extends Activity {

    private TextView labelPrefixo,labelPlaca,labelChassi,labelBloqueado,labelEmpresa;
    private Veiculo veiculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detalhes_veiculo);

        labelPrefixo = findViewById(R.id.textView_Prefixo);
        labelPlaca = findViewById(R.id.textView_Placa);
        labelChassi = findViewById(R.id.textView_Chassi);
        labelBloqueado = findViewById(R.id.textView_Bloqueado);
        labelEmpresa = findViewById(R.id.textView_Empresa);

        Intent i = getIntent();

        veiculo = (Veiculo) i.getSerializableExtra("veiculo");

        labelPrefixo.setText(""+veiculo.getPrefixo());
        labelPlaca.setText(""+veiculo.getPlaca());
        labelChassi.setText(""+veiculo.getChassi());
        labelEmpresa.setText(""+veiculo.getEmpresa());

        if(veiculo.isBloqueado())labelBloqueado.setText(R.string.sim);
        else labelBloqueado.setText(R.string.não);

    }
}
