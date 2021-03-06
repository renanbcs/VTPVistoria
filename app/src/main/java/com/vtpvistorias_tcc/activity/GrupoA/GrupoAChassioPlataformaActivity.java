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
import com.vtpvistorias_tcc.activity.SelecionarFichaActivity;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoAChassioPlataformaActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox tanqueCombustivelVazando;
    private CheckBox tanqueCombustivelSolto;
    private CheckBox cintaSuporteTanqueFalta;
    private CheckBox cintaSuporteTanqueQuebrada;
    private CheckBox charrisPlatTrincado;
    private CheckBox charrisPlatQuebrado;
    private CheckBox charrisPlatReparoInadequado;
    private CheckBox segCintoBloqueioPortasNFunciona;
    private CheckBox segCintoBloqueioPortasFalta;

    private CheckBox estruturaDegrausAlturaIrregular,estruturaDegrausSolta,estruturaDegrausQuebrada;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_chassio_plataforma);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        tanqueCombustivelVazando = (CheckBox)findViewById(R.id.tanqueCombustivelVazando);
        tanqueCombustivelSolto = (CheckBox)findViewById(R.id.tanqueCombustivelSolto);

        cintaSuporteTanqueFalta = (CheckBox)findViewById(R.id.cintaSuporteTanqueFalta);
        cintaSuporteTanqueQuebrada = (CheckBox)findViewById(R.id.cintaSuporteTanqueQuebrada);

        charrisPlatTrincado = (CheckBox)findViewById(R.id.charrisPlatTrincado);
        charrisPlatQuebrado = (CheckBox)findViewById(R.id.charrisPlatQuebrado);
        charrisPlatReparoInadequado = (CheckBox)findViewById(R.id.charrisPlatReparoInadequado);

        segCintoBloqueioPortasNFunciona = (CheckBox)findViewById(R.id.segCintoBloqueioPortasNFunciona);
        segCintoBloqueioPortasFalta = (CheckBox)findViewById(R.id.segCintoBloqueioPortasFalta);

        estruturaDegrausAlturaIrregular = (CheckBox)findViewById(R.id.estruturaDegrausAlturaIrregular);
        estruturaDegrausSolta = (CheckBox)findViewById(R.id.estruturaDegrausSolta);
        estruturaDegrausQuebrada = (CheckBox)findViewById(R.id.estruturaDegrausQuebrada);

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

                Intent intent = new Intent(getApplicationContext(),SelecionarFichaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        if(tanqueCombustivelVazando.isChecked()){
            grupoA.getTanqueDeCombustivel().add("Vazando");
        }
        if(tanqueCombustivelSolto.isChecked()){
            grupoA.getTanqueDeCombustivel().add("Solto");
        }
        if(cintaSuporteTanqueFalta.isChecked()){
            grupoA.getCintaSuporteDoTanque().add("Falta");
        }
        if(cintaSuporteTanqueQuebrada.isChecked()){
            grupoA.getCintaSuporteDoTanque().add("Quebrada");
        }
        if(charrisPlatTrincado.isChecked()){
            grupoA.getChassisEPlataforma().add("Trincado");
        }
        if(charrisPlatQuebrado.isChecked()){
            grupoA.getChassisEPlataforma().add("Quebrado");
        }
        if(charrisPlatReparoInadequado.isChecked()){
            grupoA.getChassisEPlataforma().add("Reparo Inadequado");
        }
        if(segCintoBloqueioPortasFalta.isChecked()){
            grupoA.getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().add("Faltando");
        }
        if(segCintoBloqueioPortasNFunciona.isChecked()){
            grupoA.getSistemaSegurancaDoCintoMotoristaEBloqueioPortas().add("Não Funciona");
        }

        if(estruturaDegrausAlturaIrregular.isChecked()){
            grupoA.getEstruturaDosDegraus().add("Altura Irregular");
        }

        if(estruturaDegrausQuebrada.isChecked()){
            grupoA.getEstruturaDosDegraus().add("Quebrada");
        }

        if(estruturaDegrausSolta.isChecked()){
            grupoA.getEstruturaDosDegraus().add("Solta");
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
