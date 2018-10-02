package com.vtpvistorias_tcc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vtpvistorias_tcc.R;

public class TipoInspecaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button porVeiculo,porInnspetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo_inspecao);

        porInnspetor = findViewById(R.id.buttonPorInspetor);
        porVeiculo = findViewById(R.id.buttonPorVeiculo);

        porInnspetor.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.buttonPorInspetor:



                break;

        }






    }
}
