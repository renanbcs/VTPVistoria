package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;

public class EfetuarLacracaoVeiculoActivity extends Activity implements View.OnClickListener {

    private Veiculo veiculo;
    private TextView labelPrefixo,labelPlaca,labelChassi,labelBloqueado,labelEmpresa;
    private Button botaoLacrar, botaoVoltar;
    private Inspecao inspecao;
    private String tela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efetuar_lacracao_veiculo);

        labelPrefixo = findViewById(R.id.textView_Prefixo);
        labelPlaca = findViewById(R.id.textView_Placa);
        labelChassi = findViewById(R.id.textView_Chassi);
        labelBloqueado = findViewById(R.id.textView_Bloqueado);
        labelEmpresa = findViewById(R.id.textView_Empresa);
        botaoLacrar = findViewById(R.id.botaoLacrar);
        botaoVoltar = findViewById(R.id.botaoVoltar);

        Intent i = getIntent();

        veiculo = (Veiculo) i.getSerializableExtra("veiculo");

        labelPrefixo.setText(""+veiculo.getPrefixo());
        labelPlaca.setText(""+veiculo.getPlaca());
        labelChassi.setText(""+veiculo.getChassi());
        labelEmpresa.setText(""+veiculo.getEmpresa());
        labelBloqueado.setText(""+veiculo.isBloqueado());

        botaoLacrar.setOnClickListener(this);
        botaoVoltar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.botaoVoltar:

                finish();

                break;

            case R.id.botaoLacrar:

                if(tela.equals("lacrarVeiculo")){

                    if(veiculo.isBloqueado().equals("Sim")){
                        Toast.makeText(getApplicationContext(), "Veículo já se encontra bloqueado!", Toast.LENGTH_LONG).show();
                        finish();
                    }else {

                        Intent intent = new Intent(getApplicationContext(), EfetuarLacracaoVeiculoActivity.class);
                        intent.putExtra("veiculo", veiculo);

                        startActivity(intent);
                    }

                }else {

                    inspecao = new Inspecao();
                    inspecao.setVeiculo(veiculo);

                    Intent intent = new Intent(getApplicationContext(), SelecionarFichaActivity.class);
                    intent.putExtra("inspecao", inspecao);

                    startActivity(intent);
                }

                break;


        }



    }

    public void criarDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
        // Add the buttons
        builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User clicked OK button
            }
        });
        builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                // User cancelled the dialog
            }
        });

        AlertDialog dialog = builder.create();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    //metodo para criar os menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //exibir os menus
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true ;
    }


}
