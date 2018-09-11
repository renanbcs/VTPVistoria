package com.vtpvistorias_tcc.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EfetuarLacracaoVeiculoActivity extends AppCompatActivity implements View.OnClickListener {

    private Veiculo veiculo;
    private TextView labelPrefixo,labelPlaca,labelChassi,labelBloqueado,labelEmpresa;
    private Button botaoLacrar, botaoVoltar;
    private Inspecao inspecao;
    private String tela;
    final Context context = this;
    private String justificativa;
    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_efetuar_lacracao_veiculo);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        labelPrefixo = findViewById(R.id.textView_Prefixo);
        labelPlaca = findViewById(R.id.textView_PlacaLabel);
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

                if(veiculo.isBloqueado().equals("Sim")){
                    Toast.makeText(getApplicationContext(), "Veículo já se encontra bloqueado!", Toast.LENGTH_LONG).show();
                        finish();
                }else {
                    criarDialogJustificativa();

                }

                break;
        }
    }

    public void criarDialogJustificativa(){

        // get prompts.xml view
        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.dialog_justificativa, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set prompts.xml to alertdialog builder
        alertDialogBuilder.setView(promptsView);

        final EditText userInput = (EditText) promptsView
                .findViewById(R.id.editTextDialogUserInput);

        // set dialog message
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Salvar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                justificativa = userInput.getText().toString();
                                criarDialog();
                            }
                        })
                .setNegativeButton("Cancelar",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                dialog.cancel();
                            }
                        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }

    public void criarDialog(){
        new AlertDialog.Builder(this)
                .setTitle("Confirmação Lacração")
                .setMessage("Deseja realmente lacrar este veículo?")
                .setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                veiculo.setBloqueado("Sim");
                                Inspecao inspecao = new Inspecao();
                                inspecao.setJustificativa(justificativa);
                                inspecao.setDataHoraRegistro(getPegaDataAtual());
                                inspecao.setResultado("Reprovado");
                                inspecao.setVeiculo(veiculo);
                                inspecao.salvar();

                                veiculo.update();

                                labelBloqueado.setText("Sim");

                                botaoLacrar.setEnabled(false);
                                Toast.makeText(getApplicationContext(), "Veículo Bloqueado com Sucesso", Toast.LENGTH_LONG).show();
                            }
                        })
                .setNegativeButton("Não",null)
                .show();
    }

    @Override
    public void onPause(){
        super.onPause();
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
