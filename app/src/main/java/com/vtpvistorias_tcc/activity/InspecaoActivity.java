package com.vtpvistorias_tcc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class InspecaoActivity extends AppCompatActivity {

    private TextView tvInspecao;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspecao);

        tvInspecao = findViewById(R.id.textViewInspecao);
        tvInspecao.setMovementMethod(new ScrollingMovementMethod());

        inspecao = (Inspecao) getIntent().getSerializableExtra("inspecao");

        tvInspecao.setText(
                "\nCodigo da Inspeção: "+ inspecao.getIdInspecao()+
                "\nResultado: "+inspecao.getResultado()+
                "\nData e hora: "+ inspecao.getDataHoraRegistro()+
                "\n\nDados Inspetor"+
                "\nNome: "+inspecao.getInspetor().getNome()+
                "\nEmail: "+ inspecao.getInspetor().getEmail());

        if(inspecao.getGrupoA()!= null || inspecao.getGrupoA1() != null || inspecao.getGrupoB() != null){

            tvInspecao.setText(tvInspecao.getText()+
            "\n\nDetalhes: ");

            if(inspecao.getGrupoA1()!= null){

                tvInspecao.setText(tvInspecao.getText()+
                        "\n\nGrupo A1");

                if(inspecao.getGrupoA1().getTacografo()!=null) {

                    //Coloca no Text View o titulo do item
                    tvInspecao.setText(tvInspecao.getText()+"\n\nTacografo:\n");

                    //percorre o Array do item para preencher o Text View
                    for (int a = 0;a<inspecao.getGrupoA1().getTacografo().size();a++){

                        //preenche o text view com o item selecionado
                        tvInspecao.setText(tvInspecao.getText()+inspecao.getGrupoA1().getTacografo().get(a)+"\n");

                    }//fim for

                }//fim if do item


                //demais itens A1

            }

            if(inspecao.getGrupoA()!= null){

                tvInspecao.setText(tvInspecao.getText()+"\nGrupo A:\n");
                //1 - SISTEMA DE FREIO
                //VALVULA PEDAL
                if(inspecao.getGrupoA().getValvulaPedal()!=null) {

                    tvInspecao.setText(tvInspecao.getText() + "\nValvula Pedal:\n");

                    for (int a = 0; a < inspecao.getGrupoA().getValvulaPedal().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoA().getValvulaPedal().get(a) + "\n");

                    }

                }

                //demais itens A

            }

            if (inspecao.getGrupoB()!=null) {

                tvInspecao.setText(tvInspecao.getText() + "\nGrupo B:\n");

                if (inspecao.getGrupoB().getParaBrisa().size() >= 1) {

                    tvInspecao.setText(tvInspecao.getText() + "\nPara Brisa:\n");

                    for (int a = 0; a < inspecao.getGrupoB().getParaBrisa().size(); a++) {

                        tvInspecao.setText(tvInspecao.getText() + inspecao.getGrupoB().getParaBrisa().get(a) + "\n");

                    }

                }

                //demais intens B

            }


        }else{

            tvInspecao.setText(tvInspecao.getText()+
            "\n\nObservações: "+
            "\nJustifica: "+ inspecao.getJustificativa());


        }





    }
}
