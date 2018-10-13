package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.BuscarPorInspetor.ListaInspetoresActivity;
import com.vtpvistorias_tcc.activity.BuscarPorVeiculo.ListaVeiculoActivity;

public class TipoBuscaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button porVeiculo,porInnspetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_busca);

        porInnspetor = findViewById(R.id.buttonPorInspetor);
        porVeiculo = findViewById(R.id.buttonPorVeiculo);

        porInnspetor.setOnClickListener(this);
        porVeiculo.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.buttonPorInspetor:

                startActivity(
                        new Intent(TipoBuscaActivity.this, ListaInspetoresActivity.class));

                break;


            case R.id.buttonPorVeiculo:



                startActivity(
                        new Intent(TipoBuscaActivity.this, ListaVeiculoActivity.class));

                break;

        }






    }
}
