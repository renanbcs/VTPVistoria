package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vtpvistorias_tcc.R;

public class SelecionarFichaActivity extends AppCompatActivity implements View.OnClickListener{

    private Button fichaA1,fichaA,fichaB,cancela, botalVoltarTelaIniciarProcesso;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_ficha);

        fichaA = findViewById(R.id.botaoGrupoA);
        fichaA1 = findViewById(R.id.botaoGrupoA1);
        fichaB = findViewById(R.id.botaoGrupoB);
        cancela = findViewById(R.id.botalVoltarTelaIniciarProcesso);

        fichaA.setOnClickListener(this);
        fichaA1.setOnClickListener(this);
        fichaB.setOnClickListener(this);
        cancela.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.botaoGrupoA:

                i = new Intent(getApplicationContext(),ItensFichaActivity.class);
                i.putExtra("ficha","FichaA");
                startActivity(i);

                break;

            case R.id.botaoGrupoA1:

                i = new Intent(getApplicationContext(),ItensFichaActivity.class);
                i.putExtra("ficha","FichaA1");
                startActivity(i);

                break;

            case R.id.botaoGrupoB:

                i = new Intent(getApplicationContext(),ItensFichaActivity.class);
                i.putExtra("ficha","FichaB");
                startActivity(i);

                break;

            case R.id.botalVoltarTelaIniciarProcesso:

                finish();

                break;
        }

    }
}
