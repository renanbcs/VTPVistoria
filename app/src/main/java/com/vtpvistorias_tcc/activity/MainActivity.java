package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button botaoNovaInspecao;
    private Button botaoLacharVeiculo;
    private Button botaoConsultarInspecao;
    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(R.string.app_name);
            setSupportActionBar(toolbar);

        botaoNovaInspecao = (Button) findViewById(R.id.botaoNovaInspecao);
        botaoLacharVeiculo = (Button) findViewById(R.id.botaoLacharVeiculo);
        botaoConsultarInspecao = (Button) findViewById(R.id.botaoConsultarInspecao);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        //Toast.makeText(this, ""+usuarioFirebase.getCurrentUser().getUid(),Toast.LENGTH_SHORT).show();

        botaoNovaInspecao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(
                        new Intent(MainActivity.this, IniciarInspecaoActivity.class)
                );

            }
        });

        botaoLacharVeiculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(
                        new Intent(MainActivity.this, LacrarVeiculoActivity.class)
                );

            }
        });


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
