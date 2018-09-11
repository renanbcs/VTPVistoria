package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.GrupoA1;
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class SelecionarFichaActivity extends AppCompatActivity implements View.OnClickListener{

    private Button fichaA1,fichaA,fichaB,cancela, botalVoltarTelaIniciarProcesso;
    private Button botaoSalvar;
    private Intent i;
    private Inspecao inspecao;
    private GrupoA grupoA;
    private GrupoB grupoB;
    private GrupoA1 grupoA1;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_ficha);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        fichaA = findViewById(R.id.botaoGrupoA);
        fichaA1 = findViewById(R.id.botaoGrupoA1);
        fichaB = findViewById(R.id.botaoGrupoB);
        cancela = findViewById(R.id.botalVoltarTelaIniciarProcesso);

        fichaA.setOnClickListener(this);
        fichaA1.setOnClickListener(this);
        fichaB.setOnClickListener(this);
        cancela.setOnClickListener(this);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");

        botaoSalvar = (Button) findViewById(R.id.botaoSalvar);
        botaoSalvar.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.botaoGrupoA:

                Intent intentNovo = new Intent(getApplicationContext(),ItensFichaActivity.class);
                intentNovo.putExtra("ficha","FichaA");
                intentNovo.putExtra("inspecao",inspecao);
                startActivity(intentNovo);

                break;

            case R.id.botaoGrupoA1:

                Intent intentNovo2 = new Intent(getApplicationContext(),ItensFichaActivity.class);
                intentNovo2.putExtra("ficha","FichaA1");
                intentNovo2.putExtra("inspecao",inspecao);
                startActivity(intentNovo2);

                break;

            case R.id.botaoGrupoB:

                Intent intentNovo3 = new Intent(getApplicationContext(),ItensFichaActivity.class);
                intentNovo3.putExtra("ficha","FichaB");
                intentNovo3.putExtra("inspecao",inspecao);
                startActivity(intentNovo3);

                break;

            case R.id.botalVoltarTelaIniciarProcesso:

                finish();

                break;

            case R.id.botaoSalvar:

                if(inspecao.getGrupoA() == null && inspecao.getGrupoA1() == null && inspecao.getGrupoB() == null)

                    Toast.makeText(getApplicationContext(), "Preencha pelo menos uma ficha!", Toast.LENGTH_SHORT).show();

                else {

                    //Toast.makeText(getApplicationContext(), "Salvo Com Sucesso", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(getApplicationContext(), DetalhesVistoriaActivity.class);

                    i.putExtra("inspecao",inspecao);

                    startActivity(i);
                }

                break;
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
