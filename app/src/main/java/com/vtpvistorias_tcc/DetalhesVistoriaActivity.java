package com.vtpvistorias_tcc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.activity.SelecionarFichaActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.EventListener;

public class DetalhesVistoriaActivity extends AppCompatActivity implements View.OnClickListener{

    private Inspecao inspecao;
    private TextView detalhesVistoriaTextView;
    private String detalhesVistoria;
    private Button salvarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_vistoria);

        detalhesVistoriaTextView = findViewById(R.id.detalhesVistoriaTextView);
        salvarButton = findViewById(R.id.salvarButton);

        Intent i = getIntent();

        inspecao = (Inspecao) i.getSerializableExtra("inspecao");

        pegarDados();

        salvarButton.setOnClickListener(this);



    }

    public void pegarDados(){


        //verifica se a ficha A1 foi iniciada
        if (inspecao.getGrupoA1()!=null){

            //Coloca no Text View o titulo da Ficha
            detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Grupo A1:\n\n");

            //verifica se algo foi preenchido para o item
            if(inspecao.getGrupoA1().getTacografo().size()>=1) {

                //Coloca no Text View o titulo do item
                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Tacografo:\n\n");

                //percorre o Array do item para preencher o Text View
                for (int a = 0;a<inspecao.getGrupoA1().getTacografo().size();a++){

                    //preenche o text view com o item selecionado
                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA1().getTacografo().get(a)+"\n");

                }//fim for

            }//fim if do item

            //criar IF dos outros itens entre essas duas chaves, seguir a logica ou melhorar-la.

        }//fim if da ficha

        //inicio ficha A mesmo aspectos do item acima
        if (inspecao.getGrupoA()!=null){

            detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"\nGrupo A:\n\n");

            if(inspecao.getGrupoA().getValvulaPedal().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Valvula Pedal:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getValvulaPedal().size();a++){


                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getValvulaPedal().get(a)+"\n");

                }

            }

            if(inspecao.getGrupoA().getAlmofadaPedal().size()>=1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+"Almofada Pedal:\n\n");

                for (int a = 0;a<inspecao.getGrupoA().getAlmofadaPedal().size();a++){


                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText()+inspecao.getGrupoA().getAlmofadaPedal().get(a)+"\n");

                }

            }

            //demais Itens

        }

        if (inspecao.getGrupoA()!=null) {

            detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "\nGrupo :B\n\n");

            if (inspecao.getGrupoB().getParaBrisa().size() >= 1) {

                detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + "Para Brisa:\n\n");

                for (int a = 0; a < inspecao.getGrupoB().getParaBrisa().size(); a++) {


                    detalhesVistoriaTextView.setText(detalhesVistoriaTextView.getText() + inspecao.getGrupoB().getParaBrisa().get(a) + "\n");

                }

            }

        }


    }

    public void salvarDados(){

        inspecao.setDataHoraRegistro(getPegaDataAtual());

        inspecao.salvar();
    }

    public String getPegaDataAtual() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43

        //Calendar calendar = Calendar.getInstance();
        //Date date = new Date();
        //calendar.setTime(date);
        //return calendar.getTime();
        return dateFormat.format(date);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.salvarButton:

                salvarDados();

                Toast.makeText(getApplicationContext(), "Salvo Com Sucesso", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(getApplicationContext(), SelecionarFichaActivity.class);

                startActivity(i);


                break;
        }
    }
}
