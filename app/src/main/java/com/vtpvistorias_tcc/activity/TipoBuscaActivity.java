package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.BuscarPorInspetor.ListaInspetoresActivity;
import com.vtpvistorias_tcc.activity.BuscarPorVeiculo.ListaVeiculoActivity;

public class TipoBuscaActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imageButtonPorVeiculo,imageButtonPorInspetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_busca);

        imageButtonPorInspetor = findViewById(R.id.imageButtonPorInspetor);
        imageButtonPorVeiculo = findViewById(R.id.imageButtonPorVeiculo);


        imageButtonPorVeiculo.setOnClickListener(this);
        imageButtonPorInspetor.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.imageButtonPorInspetor:

                startActivity(
                        new Intent(TipoBuscaActivity.this, ListaInspetoresActivity.class));

                break;


            case R.id.imageButtonPorVeiculo:



                startActivity(
                        new Intent(TipoBuscaActivity.this, ListaVeiculoActivity.class));

                break;

        }






    }
}
