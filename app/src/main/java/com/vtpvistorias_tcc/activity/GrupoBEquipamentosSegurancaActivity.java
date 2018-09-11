package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoBEquipamentosSegurancaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox extintorIrregular;
    private CheckBox extintorSuporteQuebrado;
    private CheckBox extintorSuporteSolto;
    private CheckBox extintorFalta;
    private CheckBox trianguloFalta;
    private CheckBox trianguloDanificado;

    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_equipamentos_de_seguranca);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        extintorIrregular = (CheckBox)findViewById(R.id.extintorIrregular);
        extintorSuporteQuebrado = (CheckBox)findViewById(R.id.extintorSuporteQuebrado);
        extintorSuporteSolto = (CheckBox)findViewById(R.id.extintorSuporteSolto);
        extintorFalta = (CheckBox)findViewById(R.id.extintorFalta);
        trianguloFalta = (CheckBox)findViewById(R.id.trianguloFalta);
        trianguloDanificado = (CheckBox)findViewById(R.id.trianguloDanificado);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoB = inspecao.getGrupoB();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:

                salvarDados();

                inspecao.setGrupoB(grupoB);

                Intent intent = new Intent(getApplicationContext(),GrupoBSistemaCarroceriaExternaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(extintorIrregular.isChecked()){
            grupoB.getExtintor().add("Irregular");
        }
        if(extintorSuporteQuebrado.isChecked()){
            grupoB.getExtintor().add("Suporte Quebrado");
        }
        if(extintorSuporteSolto.isChecked()){
            grupoB.getExtintor().add("Suporte Solto");
        }
        if(extintorFalta.isChecked()){
            grupoB.getExtintor().add("Faltando");
        }
        if(trianguloFalta.isChecked()){
            grupoB.getTriangulo().add("Faltando");
        }
        if(trianguloDanificado.isChecked()){
            grupoB.getTriangulo().add("Danificado");
        }
    }

    //metodo para criar os menus
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //exiir os menus
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_main,menu);

        return true ;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.item_sair) {
            deslogarUsuario();
        }

        return super.onOptionsItemSelected(item);
    }


    private void deslogarUsuario(){
        usuarioFirebase.signOut();
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

}
