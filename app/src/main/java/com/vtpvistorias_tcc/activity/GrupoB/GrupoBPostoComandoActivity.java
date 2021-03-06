package com.vtpvistorias_tcc.activity.GrupoB;

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
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.LoginActivity;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoBPostoComandoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox comandoPainelManometroNaoFunciona;
    private CheckBox comandoPainelVelocimentoNaoFunciona;
    private CheckBox comandoPainelLuzesNaoAcende;
    private CheckBox comandoPainelSistemaVentilacaoNaoFunciona;
    private CheckBox chaveSetaBuzinaNaoFunciona;
    private CheckBox chaveSetaBuzinaDanificada;
    private CheckBox chaveSetaBuzinaFalta;

    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;
    private FirebaseAuth usuarioFirebase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_posto_de_comando);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        comandoPainelManometroNaoFunciona = (CheckBox)findViewById(R.id.comandoPainelManometroNaoFunciona);
        comandoPainelVelocimentoNaoFunciona = (CheckBox)findViewById(R.id.comandoPainelVelocimentoNaoFunciona);
        comandoPainelLuzesNaoAcende = (CheckBox)findViewById(R.id.comandoPainelLuzesNaoAcende);
        comandoPainelSistemaVentilacaoNaoFunciona = (CheckBox)findViewById(R.id.comandoPainelSistemaVentilacaoNaoFunciona);
        chaveSetaBuzinaNaoFunciona = (CheckBox)findViewById(R.id.chaveSetaBuzinaNaoFunciona);
        chaveSetaBuzinaDanificada = (CheckBox)findViewById(R.id.chaveSetaBuzinaDanificada);
        chaveSetaBuzinaFalta = (CheckBox)findViewById(R.id.chaveSetaBuzinaFalta);

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

                Intent intent = new Intent(getApplicationContext(),GrupoBInteriorVeiculoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        if(comandoPainelManometroNaoFunciona.isChecked()){

            grupoB.getComandosDoPainel().add("Manometro Não Funciona");
        }
        if(comandoPainelVelocimentoNaoFunciona.isChecked()){

            grupoB.getComandosDoPainel().add("Velecimetro Não Funciona");
        }
        if(comandoPainelLuzesNaoAcende.isChecked()){

            grupoB.getComandosDoPainel().add("Luzes Não Funciona");
        }
        if(comandoPainelSistemaVentilacaoNaoFunciona.isChecked()){

            grupoB.getComandosDoPainel().add("Sistema de Ventilação não Funciona");
        }
        if(chaveSetaBuzinaNaoFunciona.isChecked()){

            grupoB.getChaveDeSetaBuzina().add("Não Funciona");
        }
        if(chaveSetaBuzinaDanificada.isChecked()){

            grupoB.getChaveDeSetaBuzina().add("Danificada");
        }
        if(chaveSetaBuzinaFalta.isChecked()){

            grupoB.getChaveDeSetaBuzina().add("Falta");
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
