package com.vtpvistorias_tcc.activity.GrupoA1;

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
import com.vtpvistorias_tcc.Model.GrupoA1;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.LoginActivity;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

public class GrupoA1SistemaCarroceriaNivelBActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox tacografoFalta;
    private CheckBox tacografoFaltaLacre;
    private CheckBox tacografoNaoFunciona;
    private CheckBox tacografoEstadoConservacao;
    private CheckBox pisoLiso;
    private CheckBox pisoSujo;
    private CheckBox pisoDerrapante;
    private CheckBox quebraSolInexistente;
    private CheckBox quebraSolDesregulado;
    private CheckBox quebraSolSolto;
    private CheckBox desembacadorParaBrisaNaoFunciona;
    private CheckBox desembacadorParaBrisaFalta;
    private CheckBox bancosAltosSimplesInexistentes;
    private CheckBox bancosAltosSimplesConservacao;
    private CheckBox bancosAltosSimplesFixacao;
    private CheckBox radioComunicacaoNaoFunciona;
    private CheckBox radioComunicacaoFixacao;
    private CheckBox radioComunicacaoConservacao;
    private CheckBox radioComunicacaoLenteDanificada;
    private CheckBox brakeLightInexistente;
    private CheckBox brakeLightSolto;
    private CheckBox comunicacaoVisualInternaAdesivosInexistente;
    private CheckBox comunicacaoVisualInternaAdesivosConservacao;
    private CheckBox comunicacaoVisualInternaAdesivosForaPadrao;


    private DatabaseReference firebase;
    private GrupoA1 grupoA1;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a1_sistema_carroceria_nivel_b);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        tacografoFalta = (CheckBox)findViewById(R.id.tacografoFalta);
        tacografoFaltaLacre = (CheckBox)findViewById(R.id.tacografoFaltaLacre);
        tacografoNaoFunciona = (CheckBox)findViewById(R.id.tacografoNaoFunciona);
        tacografoEstadoConservacao = (CheckBox)findViewById(R.id.tacografoEstadoConservacao);
        pisoLiso = (CheckBox)findViewById(R.id.pisoLiso);
        pisoSujo = (CheckBox)findViewById(R.id.pisoSujo);
        pisoDerrapante = (CheckBox)findViewById(R.id.pisoDerrapante);
        quebraSolInexistente = (CheckBox)findViewById(R.id.quebraSolInexistente);
        quebraSolDesregulado = (CheckBox)findViewById(R.id.quebraSolDesregulado);
        quebraSolSolto = (CheckBox)findViewById(R.id.quebraSolSolto);
        desembacadorParaBrisaNaoFunciona = (CheckBox)findViewById(R.id.desembacadorParaBrisaNaoFunciona);
        desembacadorParaBrisaFalta = (CheckBox)findViewById(R.id.desembacadorParaBrisaFalta);
        bancosAltosSimplesInexistentes = (CheckBox)findViewById(R.id.bancosAltosSimplesInexistentes);
        bancosAltosSimplesConservacao = (CheckBox)findViewById(R.id.bancosAltosSimplesConservacao);
        bancosAltosSimplesFixacao = (CheckBox)findViewById(R.id.bancosAltosSimplesFixacao);
        radioComunicacaoNaoFunciona = (CheckBox)findViewById(R.id.radioComunicacaoNaoFunciona);
        radioComunicacaoFixacao = (CheckBox)findViewById(R.id.radioComunicacaoFixacao);
        radioComunicacaoConservacao = (CheckBox)findViewById(R.id.radioComunicacaoConservacao);
        radioComunicacaoLenteDanificada = (CheckBox)findViewById(R.id.radioComunicacaoLenteDanificada);
        brakeLightInexistente = (CheckBox)findViewById(R.id.brakeLightInexistente);
        brakeLightSolto = (CheckBox)findViewById(R.id.brakeLightSolto);
        comunicacaoVisualInternaAdesivosInexistente = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosInexistente);
        radioComunicacaoNaoFunciona = (CheckBox)findViewById(R.id.radioComunicacaoNaoFunciona);
        comunicacaoVisualInternaAdesivosConservacao = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosConservacao);
        comunicacaoVisualInternaAdesivosForaPadrao = (CheckBox)findViewById(R.id.comunicacaoVisualInternaAdesivosForaPadrao);


        salvarDados();
        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");
        grupoA1 = inspecao.getGrupoA1();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:

                finish();

                break;

            case R.id.botaoProximo:

                salvarDados();

                inspecao.setGrupoA1(grupoA1);

                Intent intent = new Intent(getApplicationContext(),GrupoA1SistemaAcessibilidadeMobilidadeNivelAActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        grupoA1 = new GrupoA1();

        if(tacografoFalta.isChecked()){

            grupoA1.getTacografo().add("Em Falta");
        }
        if(tacografoFaltaLacre.isChecked()){

            grupoA1.getTacografo().add("Falta Lacre");
        }
        if(tacografoNaoFunciona.isChecked()){

            grupoA1.getTacografo().add("Não Funciona");
        }
        if(tacografoEstadoConservacao.isChecked()){

            grupoA1.getTacografo().add("Ruim");
        }
        if(pisoLiso.isChecked()){

            grupoA1.getPiso().add("Liso");
        }
        if(pisoSujo.isChecked()){

            grupoA1.getPiso().add("Sujo");
        }
        if(pisoDerrapante.isChecked()){

            grupoA1.getPiso().add("Derrapante");
        }
        if(quebraSolInexistente.isChecked()){

            grupoA1.getQuebraSol().add("Inexistente");
        }
        if(quebraSolDesregulado.isChecked()){

            grupoA1.getQuebraSol().add("Desregulado");
        }
        if(quebraSolSolto.isChecked()){

            grupoA1.getQuebraSol().add("Solto");
        }
        if(desembacadorParaBrisaFalta.isChecked()){

            grupoA1.getDesembacadorParaBrisa().add("Em Falta");
        }
        if(desembacadorParaBrisaNaoFunciona.isChecked()){

            //grupoA1.getDesembacadorParaBrisa().add("Não Funciona");
        }
        if(bancosAltosSimplesInexistentes.isChecked()){

            grupoA1.getBancosAltosSimples().add("Inexistentes");
        }
        if(bancosAltosSimplesConservacao.isChecked()){

            grupoA1.getBancosAltosSimples().add("Ruim");
        }
        if(bancosAltosSimplesFixacao.isChecked()){

            grupoA1.getBancosAltosSimples().add("Não Fixado");
        }
        if(radioComunicacaoNaoFunciona.isChecked()){

            grupoA1.getRadioComunicacao().add("Não Funciona");
        }
        if(radioComunicacaoFixacao.isChecked()){

            grupoA1.getRadioComunicacao().add("Não Fixado");
        }
        if(radioComunicacaoConservacao.isChecked()){

            grupoA1.getRadioComunicacao().add("Ruim");
        }
        if(radioComunicacaoLenteDanificada.isChecked()){

            grupoA1.getRadioComunicacao().add("Danificado");
        }
        if(brakeLightInexistente.isChecked()){

            grupoA1.getBrakeLight().add("Inexistente");
        }
        if(brakeLightSolto.isChecked()){

            grupoA1.getBrakeLight().add("Solto");
        }
        if(comunicacaoVisualInternaAdesivosInexistente.isChecked()){

            grupoA1.getComunicacaoVisualInternaAdesivos().add("Inexistente");
        }
        if(comunicacaoVisualInternaAdesivosConservacao.isChecked()){

            grupoA1.getComunicacaoVisualInternaAdesivos().add("Ruim");
        }
        if(comunicacaoVisualInternaAdesivosForaPadrao.isChecked()){

            grupoA1.getComunicacaoVisualInternaAdesivos().add("Fora do Padrão");
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
