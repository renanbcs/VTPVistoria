package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Inspetor;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class DetalhesVeiculoActivity extends Activity implements View.OnClickListener {

    private TextView labelPrefixo,labelPlaca,labelChassi,labelBloqueado,labelEmpresa;
    private Veiculo veiculo;
    private Button buttonSim, buttonNao;
    private Inspecao inspecao;
    private String tela;
    private FirebaseAuth usuarioFirebase;
    private DatabaseReference firebase;
    private Inspetor inspetor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_detalhes_veiculo);

        labelPrefixo = findViewById(R.id.textView_Prefixo);
        labelPlaca = findViewById(R.id.textView_PlacaLabel);
        labelChassi = findViewById(R.id.textView_Chassi);
        labelBloqueado = findViewById(R.id.textView_Bloqueado);
        labelEmpresa = findViewById(R.id.textView_Empresa);
        buttonSim = findViewById(R.id.button_Sim);
        buttonNao = findViewById(R.id.button_Não);

        Intent i = getIntent();

        veiculo = (Veiculo) i.getSerializableExtra("veiculo");
        tela = (String) i.getSerializableExtra("tela");

        labelPrefixo.setText(""+veiculo.getPrefixo());
        labelPlaca.setText(""+veiculo.getPlaca());
        labelChassi.setText(""+veiculo.getChassi());
        labelEmpresa.setText(""+veiculo.getEmpresa());
        labelBloqueado.setText(""+veiculo.isBloqueado());

        buttonNao.setOnClickListener(this);
        buttonSim.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.button_Não:

                finish();

                break;

            case R.id.button_Sim:

                finish();

                if(tela.equals("lacrarVeiculo")){

                    Intent intent = new Intent(getApplicationContext(), EfetuarLacracaoVeiculoActivity.class);
                    intent.putExtra("veiculo", veiculo);

                    startActivity(intent);

                }else {

                    inspecao = new Inspecao();
                    inspecao.setVeiculo(veiculo);

                    //Pega referencia do usuario na classe Configuração Firebase
                    usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

                    //pega o ID do usuario logado
                    String x = usuarioFirebase.getCurrentUser().getUid();

                    //cria referencia do firebase
                    firebase = FirebaseDatabase.getInstance().getReference().child("Inspetor").child(x);

                    //busca no banco de dados
                    firebase.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            inspetor = dataSnapshot.getValue(Inspetor.class);

                            //esse Toast Funciona
                            Toast.makeText(getApplicationContext(), ""+inspetor.getNome(), Toast.LENGTH_SHORT).show();
                        }
                        @Override
                        public void onCancelled(DatabaseError databaseError) {



                        }

                    });


                    //Esse Toast Não funciona
                    //Toast.makeText(getApplicationContext(), ""+inspetor.getNome(), Toast.LENGTH_SHORT).show();

                    //gostaria de colocar o objeto inspetor como um atributo de uma
                    // Inspeção, para no futuro salvar o usuario que realiozou a inspeção

                    Intent intent = new Intent(getApplicationContext(), SelecionarFichaActivity.class);
                    intent.putExtra("inspecao", inspecao);

                    startActivity(intent);
                }

                break;


        }

    }
}
