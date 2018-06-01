package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import android.widget.TextView;

import com.vtpvistorias_tcc.R;

public class ItensFichaActivity extends Activity {

    private TextView itensFicha;
    private String fichaSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_itens_ficha);

        itensFicha = findViewById(R.id.textViewConteudo);

        Intent i = getIntent();
        fichaSelecionada = i.getStringExtra("ficha");
        itensFicha.setMovementMethod(new ScrollingMovementMethod());

        if(fichaSelecionada.equals("FichaA1"))itensFicha.setText(getString(R.string.itens_fichaA1));
        else if(fichaSelecionada.equals("FichaA")) itensFicha.setText(getString(R.string.itens_fichaA));
        else itensFicha.setText(getString(R.string.itens_fichaB));


    }
}
