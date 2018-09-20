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
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.LoginActivity;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoBIluminacaoExternaSinalizacaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox faroisOculosAlto;
    private CheckBox faroisOculosBaixo;
    private CheckBox faroisOculosFalta;
    private CheckBox faroisOculosSolto;
    private CheckBox faroisOculosQuebrado;
    private CheckBox luzesSetaEmergenciaDanificada;
    private CheckBox luzesSetaEmergenciaNaoFunciona;
    private CheckBox luzesSetaEmergenciaFalta;
    private CheckBox luzesSetaEmergenciaQuebrada;
    private CheckBox lanternasLentesDanificada;
    private CheckBox lanternasLentesNaoFunciona;
    private CheckBox luzesDelimitadorasVigiasLentesFaltando;
    private CheckBox luzesDelimitadorasVigiasLentesNaoFunciona;
    private CheckBox luzFreioLentesDanificada;
    private CheckBox luzFreioLentesNaoFunciona;
    private CheckBox luzFreioLentesConservacaoIrregular;
    private CheckBox brakeLightNaoFunciona;
    private CheckBox brakeLightFalta;
    private CheckBox brakeLightConservacaoIrregular;
    private CheckBox luzReFalta;
    private CheckBox luzReNaoFunciona;
    private CheckBox luzReSemLente;
    private CheckBox luzReConservacaoIrregular;
    private CheckBox luzPlacaNaoFunciona;
    private CheckBox luzPlacaFalta;
    private CheckBox luzPlacaConservacaoIrregular;

    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_iluminacao_externa_sinalizacao);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        faroisOculosAlto = (CheckBox)findViewById(R.id.faroisOculosAlto);
        faroisOculosBaixo = (CheckBox)findViewById(R.id.faroisOculosBaixo);
        faroisOculosFalta = (CheckBox)findViewById(R.id.faroisOculosFalta);
        faroisOculosSolto = (CheckBox)findViewById(R.id.faroisOculosSolto);
        faroisOculosQuebrado = (CheckBox)findViewById(R.id.faroisOculosQuebrado);
        luzesSetaEmergenciaDanificada = (CheckBox)findViewById(R.id.luzesSetaEmergenciaDanificada);
        luzesSetaEmergenciaNaoFunciona = (CheckBox)findViewById(R.id.luzesSetaEmergenciaNaoFunciona);
        luzesSetaEmergenciaFalta = (CheckBox)findViewById(R.id.luzesSetaEmergenciaFalta);
        luzesSetaEmergenciaQuebrada = (CheckBox)findViewById(R.id.luzesSetaEmergenciaQuebrada);
        lanternasLentesDanificada = (CheckBox)findViewById(R.id.lanternasLentesDanificada);
        lanternasLentesNaoFunciona = (CheckBox)findViewById(R.id.lanternasLentesNaoFunciona);
        luzesDelimitadorasVigiasLentesFaltando = (CheckBox)findViewById(R.id.luzesDelimitadorasVigiasLentesFaltando);
        luzesDelimitadorasVigiasLentesNaoFunciona = (CheckBox)findViewById(R.id.luzesDelimitadorasVigiasLentesNaoFunciona);
        luzFreioLentesDanificada = (CheckBox)findViewById(R.id.luzFreioLentesDanificada);
        luzFreioLentesNaoFunciona = (CheckBox)findViewById(R.id.luzFreioLentesNaoFunciona);
        luzFreioLentesConservacaoIrregular = (CheckBox)findViewById(R.id.luzFreioLentesConservacaoIrregular);
        brakeLightNaoFunciona = (CheckBox)findViewById(R.id.brakeLightNaoFunciona);
        brakeLightFalta = (CheckBox)findViewById(R.id.brakeLightFalta);
        brakeLightConservacaoIrregular = (CheckBox)findViewById(R.id.brakeLightConservacaoIrregular);
        luzReFalta = (CheckBox)findViewById(R.id.luzReFalta);
        luzReNaoFunciona = (CheckBox)findViewById(R.id.luzReNaoFunciona);
        luzReSemLente = (CheckBox)findViewById(R.id.luzReSemLente);
        luzReConservacaoIrregular = (CheckBox)findViewById(R.id.luzReConservacaoIrregular);
        luzPlacaNaoFunciona = (CheckBox)findViewById(R.id.luzPlacaNaoFunciona);
        luzPlacaFalta = (CheckBox)findViewById(R.id.luzPlacaFalta);
        luzPlacaConservacaoIrregular = (CheckBox)findViewById(R.id.luzPlacaConservacaoIrregular);


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

                Intent intent = new Intent(getApplicationContext(),GrupoBSistemaEletricoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        if(faroisOculosAlto.isChecked()){
            grupoB.getFaroisOculos().add("Farol Alto");
        }
        if(faroisOculosBaixo.isChecked()){
            grupoB.getFaroisOculos().add("Farol Baixo");
        }
        if(faroisOculosFalta.isChecked()){
            grupoB.getFaroisOculos().add("Farol Faltando");
        }
        if(faroisOculosSolto.isChecked()){
            grupoB.getFaroisOculos().add("Farol Solto");
        }
        if(faroisOculosQuebrado.isChecked()){
            grupoB.getFaroisOculos().add("Farol Quebrado");
        }
        if(luzesSetaEmergenciaDanificada.isChecked()){
            grupoB.getLuzesDeSetaEDeEmergencia().add("Danificado");
        }
        if(luzesSetaEmergenciaNaoFunciona.isChecked()){
            grupoB.getLuzesDeSetaEDeEmergencia().add("Não Funciona");
        }
        if(luzesSetaEmergenciaFalta.isChecked()){
            grupoB.getLuzesDeSetaEDeEmergencia().add("Faltando");
        }
        if(luzesSetaEmergenciaQuebrada.isChecked()){
            grupoB.getLuzesDeSetaEDeEmergencia().add("Quebrada");
        }
        if(lanternasLentesDanificada.isChecked()){
            grupoB.getLanternasLentes().add("Lentes Danificadas");
        }
        if(lanternasLentesNaoFunciona.isChecked()){
            grupoB.getLanternasLentes().add("Não Funciona");
        }
        if(luzesDelimitadorasVigiasLentesFaltando.isChecked()){
            grupoB.getLuzesDelimitadorasVigiasLentes().add("Lentes Faltando");
        }
        if(luzesDelimitadorasVigiasLentesNaoFunciona.isChecked()){
            grupoB.getLuzesDelimitadorasVigiasLentes().add("Lentes Não Funcionam");
        }
        if(luzFreioLentesDanificada.isChecked()){
            grupoB.getLuzDoFreioLentes().add("Danificada");
        }
        if(luzFreioLentesNaoFunciona.isChecked()){
            grupoB.getLuzDoFreioLentes().add("Não Funciona");
        }
        if(luzFreioLentesConservacaoIrregular.isChecked()){
            grupoB.getLuzDoFreioLentes().add("Conservação Irregular");
        }
        if(brakeLightNaoFunciona.isChecked()){
            grupoB.getBrakeLight().add("Não Funciona");
        }
        if(brakeLightFalta.isChecked()){
            grupoB.getBrakeLight().add("Faltando");
        }
        if(brakeLightConservacaoIrregular.isChecked()){
            grupoB.getBrakeLight().add("Conservação Irregular");
        }
        if(luzReFalta.isChecked()){
            grupoB.getLuzDeRe().add("Faltando");
        }
        if(luzReNaoFunciona.isChecked()){
            grupoB.getLuzDeRe().add("Não Funciona");
        }
        if(luzReSemLente.isChecked()){
            grupoB.getLuzDeRe().add("Sem Lente");
        }
        if(luzReConservacaoIrregular.isChecked()){
            grupoB.getLuzDeRe().add("Conservação Irregular");
        }
        if(luzPlacaNaoFunciona.isChecked()){
            grupoB.getLuzDaPlaca().add("Não Funciona");
        }
        if(luzPlacaFalta.isChecked()){
            grupoB.getLuzDaPlaca().add("Faltando");
        }
        if(luzPlacaConservacaoIrregular.isChecked()){
            grupoB.getLuzDaPlaca().add("Conservação Irregular");
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
