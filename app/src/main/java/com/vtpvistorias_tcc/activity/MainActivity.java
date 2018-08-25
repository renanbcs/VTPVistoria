package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

import com.vtpvistorias_tcc.R;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button botaoNovaInspecao;
    private Button botaoLacharVeiculo;
    private Button botaoConsultarInspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(R.string.app_name);
            setSupportActionBar(toolbar);

        botaoNovaInspecao = (Button) findViewById(R.id.botaoNovaInspecao);
        botaoLacharVeiculo = (Button) findViewById(R.id.botaoLacharVeiculo);
        botaoConsultarInspecao = (Button) findViewById(R.id.botaoConsultarInspecao);

        botaoNovaInspecao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(
                        new Intent(MainActivity.this, IniciarInspecaoActivity.class)
                );

            }
        });

        botaoLacharVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(
                        new Intent(MainActivity.this, LacrarVeiculoActivity.class)
                );

            }
        });


    }

    //metodo para criar os menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //exiir os menus
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_main,menu);

        return true ;
    }
}
