package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class LacrarVeiculoActivity extends AppCompatActivity implements View.OnClickListener {

    private Toolbar toolbar;
    private EditText editTextPrefixo;
    private Button botaoBuscarPrefixo;
    private Button botaoVoltarTelaPrincipal;
    private Button botaoConsultarInspecao;
    private DatabaseReference firebase =  FirebaseDatabase.getInstance().getReference();;
    private Veiculo veiculo;
    private Query query;
    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lacrar_veiculo);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        editTextPrefixo = findViewById(R.id.editText_prefixo_inciarInpecao);
        botaoBuscarPrefixo = findViewById(R.id.botaoBuscarPrefixo);

        botaoBuscarPrefixo.setOnClickListener(this);

        botaoVoltarTelaPrincipal = (Button) findViewById(R.id.botaoVoltarTelaPrincipal);
        botaoVoltarTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        firebase.keepSynced(true);




    }

    @Override
    public void onPause(){
        super.onPause();
    }

    public void startDialog(View v) {
        Intent intent = new Intent(LacrarVeiculoActivity.this, DetalhesVeiculoActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.botaoBuscarPrefixo:

                if (!editTextPrefixo.getText().toString().equals("")) {

                    firebase = FirebaseDatabase.getInstance().getReference().child("Veiculos").child(editTextPrefixo.getText().toString());

                    firebase.addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {

                            if (dataSnapshot.getValue() != null) {

                                veiculo = dataSnapshot.getValue(Veiculo.class);

                                Intent i = new Intent(getApplicationContext(),DetalhesVeiculoActivity.class);
                                i.putExtra("veiculo", veiculo);
                                i.putExtra("tela", "lacrarVeiculo");
                                startActivity(i);

                            } else {

                                Toast.makeText(getApplicationContext(), "Número Invalido", Toast.LENGTH_SHORT).show();

                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });

                }else {
                    Toast.makeText(getApplicationContext(), "Digite um valor válido", Toast.LENGTH_SHORT).show();
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
