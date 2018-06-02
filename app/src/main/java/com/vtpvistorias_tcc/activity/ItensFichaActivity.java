package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.vtpvistorias_tcc.R;

public class ItensFichaActivity extends Activity  implements View.OnClickListener {

    private TextView itensFicha;
    private String fichaSelecionada;
    private Button buttonSim, buttonNao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_itens_ficha);

        itensFicha = findViewById(R.id.textViewConteudo);
        buttonSim = findViewById(R.id.button_nao_FichaA);
        buttonNao = findViewById(R.id.button_sim_FichaA);

        Intent i = getIntent();
        fichaSelecionada = i.getStringExtra("ficha");
        itensFicha.setMovementMethod(new ScrollingMovementMethod());

        if(fichaSelecionada.equals("FichaA1"))itensFicha.setText(getString(R.string.itens_fichaA1));
        else if(fichaSelecionada.equals("FichaA")) itensFicha.setText(getString(R.string.itens_fichaA));
        else itensFicha.setText(getString(R.string.itens_fichaB));

        buttonNao.setOnClickListener(this);
        buttonSim.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button_nao_FichaA:

                finish();

                break;

            case R.id.button_sim_FichaA:

                finish();
                Intent intent = new Intent(getApplicationContext(),GrupoAActivity.class);
                startActivity(intent);

                break;


        }

    }
}
