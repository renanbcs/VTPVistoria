package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class ItensFichaActivity extends Activity  implements View.OnClickListener {

    private TextView itensFicha;
    private String fichaSelecionada;
    private Button buttonSimA, buttonNao;
    private Inspecao inspecao;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_itens_ficha);

        itensFicha = findViewById(R.id.textViewConteudo);
        buttonSimA = findViewById(R.id.button_nao_FichaA);
        buttonNao = findViewById(R.id.button_sim_FichaA);

        i = getIntent();
        fichaSelecionada = i.getStringExtra("ficha");
        itensFicha.setMovementMethod(new ScrollingMovementMethod());

        inspecao = (Inspecao) i.getSerializableExtra("inspecao");

        if(fichaSelecionada.equals("FichaA1"))itensFicha.setText(getString(R.string.itens_fichaA1));
        else if(fichaSelecionada.equals("FichaA")) itensFicha.setText(getString(R.string.itens_fichaA));
        else itensFicha.setText(getString(R.string.itens_fichaB));

        buttonNao.setOnClickListener(this);
        buttonSimA.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.button_nao_FichaA:

                finish();

                break;

            case R.id.button_sim_FichaA:

                finish();
                if(fichaSelecionada.equals("FichaA")) {
                    Intent intentNovo = new Intent(getApplicationContext(), GrupoASistemaFreioActivity.class);
                    intentNovo.putExtra("inspecao", inspecao);
                    startActivity(intentNovo);
                }
                if(fichaSelecionada.equals("FichaA1")) {
                    Intent intentNovo = new Intent(getApplicationContext(), GrupoA1SistemaCarroceriaNivelBActivity.class);
                    intentNovo.putExtra("inspecao", inspecao);
                    startActivity(intentNovo);
                }
                if(fichaSelecionada.equals("FichaB")) {
                    Intent intentNovo = new Intent(getApplicationContext(), GrupoBSistemaCarroceriaActivity.class);
                    intentNovo.putExtra("inspecao", inspecao);
                    startActivity(intentNovo );
                }

                break;



        }

    }
}
