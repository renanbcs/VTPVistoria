package com.vtpvistorias_tcc.activity.GrupoA;

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
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.LoginActivity;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoASistemaRodanteActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox pneuDesgastado;
    private CheckBox pneuIrregular;
    private CheckBox pneuDanificado;
    private CheckBox pneuTalao;

    private CheckBox rodaFaltaPorca;
    private CheckBox rodaFaltaEspelho;
    private CheckBox rodaDanificada;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_sistema_rodante);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        pneuDesgastado = (CheckBox)findViewById(R.id.pneuDesgastado);
        pneuIrregular = (CheckBox)findViewById(R.id.pneuIrregular);
        pneuDanificado = (CheckBox)findViewById(R.id.pneuDanificado);
        pneuTalao = (CheckBox)findViewById(R.id.pneuTalao);

        rodaFaltaPorca = (CheckBox)findViewById(R.id.rodaFaltaPorca);
        rodaFaltaEspelho = (CheckBox)findViewById(R.id.rodaFaltaEspelho);
        rodaDanificada = (CheckBox)findViewById(R.id.rodaDanificada);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoA = inspecao.getGrupoA();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:

                salvarDados();

                inspecao.setGrupoA(grupoA);

                Intent intent = new Intent(getApplicationContext(),GrupoASistemaEixoDianteiroActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(pneuDesgastado.isChecked()){
            grupoA.getPneus().add("Desgastados");
        }
        if(pneuIrregular.isChecked()){
            grupoA.getPneus().add("Irregular");
        }
        if(pneuDanificado.isChecked()){
            grupoA.getPneus().add("Danificado");
        }
        if(pneuTalao.isChecked()){
            grupoA.getPneus().add("Talão");
        }
        if(rodaFaltaPorca.isChecked()){
            grupoA.getRodas().add("Falta Porca");
        }
        if(rodaFaltaEspelho.isChecked()){
            grupoA.getRodas().add("Falta Espelho");
        }
        if(rodaDanificada.isChecked()){
            grupoA.getRodas().add("Danificada");
        }
    }

    @Override
    public void onPause(){
        super.onPause();
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
