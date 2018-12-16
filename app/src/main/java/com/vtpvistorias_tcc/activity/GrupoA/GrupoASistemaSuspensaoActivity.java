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

public class GrupoASistemaSuspensaoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox amortecedorFaltando;
    private CheckBox amortecedorVazando;
    private CheckBox amortecedorSolto;
    private CheckBox amortecedorDanificado,suporteAmortecedorDanificado	,	buchaAmortecedorDanificada,	feixeMolasDanificado,	buchaMolasFolga,	espigaoMolasCortado,	grampoMolasDanificado,	suporteMolasDanificado,	algemaDanificado,	pinoSuporteMolaSolto,	molaHelicoidalQuebrada,	suporteMolaHelicoidalQuebrada,	bolsaoDeArDanificada,	valculaNivelDanificada,	barraEstabilizadoraSolta,	buchaBarraEstabilizadoraFalta,	bananaBeanSolta,hasteSuporteReacaoTraseiraEmpenada;
    private CheckBox suporteAmortecedorSolto	, buchaAmortecedorSolta	, feixeMolasSolta	, espigaoMolasQuebrado	, grampoMolasSolto	, suporteMolasSolto	, algemaSolto	, pinoSuporteMolaQuebrado	, molaHelicoidalSolta	, suporteMolaHelicoidalSolto	, bolsaoDeArSolto	, valculaNivelSolta	, barraEstabilizadoraFalta	, buchaBarraEstabilizadoraFolga	, bananaBeanDanificada	, hasteSuporteReacaoTraseiraFolga	;
    private CheckBox pinoSuporteMolaFalta	, bolsaoDeArVazando	, valculaNivelVazando	, barraEstabilizadoraFolga	, bananaBeanDesalinhada	, hasteSuporteReacaoTraseiraSolta	;
    private CheckBox barraEstabilizadoraQuebrada,bananaBeanFolga,hasteSuporteReacaoTraseiraQuebrada;

    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;

    private FirebaseAuth usuarioFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_asistema_suspensao);

        usuarioFirebase = ConfiguracaoFirebase.getFirebaseAutenticacao();

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        amortecedorFaltando = (CheckBox)findViewById(R.id.amortecedorFaltando);
        amortecedorVazando = (CheckBox)findViewById(R.id.amortecedorVazando);
        amortecedorSolto = (CheckBox)findViewById(R.id.amortecedorSolto);
        amortecedorDanificado = (CheckBox)findViewById(R.id.amortecedorDanificado);
        suporteAmortecedorDanificado=findViewById(R.id.suporteAmortecedorDanificado);
        buchaAmortecedorDanificada=findViewById(R.id.buchaAmortecedorDanificada);
        feixeMolasDanificado=findViewById(R.id.feixeMolasDanificado);
        buchaMolasFolga=findViewById(R.id.buchaMolasFolga);
        espigaoMolasCortado=findViewById(R.id.espigaoMolasCortado);
        grampoMolasDanificado=findViewById(R.id.grampoMolasDanificado);
        suporteMolasDanificado=findViewById(R.id.suporteMolasDanificado);
        algemaDanificado=findViewById(R.id.algemaDanificado);
        pinoSuporteMolaSolto=findViewById(R.id.pinoSuporteMolaSolto);
        molaHelicoidalQuebrada=findViewById(R.id.molaHelicoidalQuebrada);
        suporteMolaHelicoidalQuebrada=findViewById(R.id.suporteMolaHelicoidalQuebrada);
        bolsaoDeArDanificada=findViewById(R.id.bolsaoDeArDanificada);
        valculaNivelDanificada=findViewById(R.id.valculaNivelDanificada);
        barraEstabilizadoraSolta=findViewById(R.id.barraEstabilizadoraSolta);
        buchaBarraEstabilizadoraFalta=findViewById(R.id.buchaBarraEstabilizadoraFalta);
        bananaBeanSolta=findViewById(R.id.bananaBeanSolta);
        hasteSuporteReacaoTraseiraEmpenada=findViewById(R.id.hasteSuporteReacaoTraseiraEmpenada);
        suporteAmortecedorSolto=findViewById(R.id.suporteAmortecedorSolto);
        buchaAmortecedorSolta=findViewById(R.id.buchaAmortecedorSolta);
        feixeMolasSolta=findViewById(R.id.feixeMolasSolta);
        espigaoMolasQuebrado=findViewById(R.id.espigaoMolasQuebrado);
        grampoMolasSolto=findViewById(R.id.grampoMolasSolto);
        suporteMolasSolto=findViewById(R.id.suporteMolasSolto);
        algemaSolto=findViewById(R.id.algemaSolto);
        pinoSuporteMolaQuebrado=findViewById(R.id.pinoSuporteMolaQuebrado);
        molaHelicoidalSolta=findViewById(R.id.molaHelicoidalSolta);
        suporteMolaHelicoidalSolto=findViewById(R.id.suporteMolaHelicoidalSolto);
        bolsaoDeArSolto=findViewById(R.id.bolsaoDeArSolto);
        valculaNivelSolta=findViewById(R.id.valculaNivelSolta);
        barraEstabilizadoraFalta=findViewById(R.id.barraEstabilizadoraFalta);
        buchaBarraEstabilizadoraFolga=findViewById(R.id.buchaBarraEstabilizadoraFolga);
        bananaBeanDanificada=findViewById(R.id.bananaBeanDanificada);
        hasteSuporteReacaoTraseiraFolga=findViewById(R.id.hasteSuporteReacaoTraseiraFolga);

        pinoSuporteMolaFalta=findViewById(R.id.pinoSuporteMolaFalta);
        bolsaoDeArVazando=findViewById(R.id.bolsaoDeArVazando);
        valculaNivelVazando=findViewById(R.id.valculaNivelVazando);
        barraEstabilizadoraFolga=findViewById(R.id.barraEstabilizadoraFolga);
        bananaBeanDesalinhada=findViewById(R.id.bananaBeanDesalinhada);
        hasteSuporteReacaoTraseiraSolta=findViewById(R.id.hasteSuporteReacaoTraseiraSolta);

        barraEstabilizadoraQuebrada=findViewById(R.id.pinoSuporteMolaFalta);
        bananaBeanFolga=findViewById(R.id.bolsaoDeArVazando);
        hasteSuporteReacaoTraseiraQuebrada=findViewById(R.id.valculaNivelVazando);

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

                Intent intent = new Intent(getApplicationContext(),GrupoASistemaTracaoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);

                break;
        }

    }

    public void salvarDados(){

        if(amortecedorFaltando.isChecked()){
            grupoA.getAmortecedor().add("Faltando");
        }
        if(amortecedorVazando.isChecked()){
            grupoA.getAmortecedor().add("Vazando");
        }
        if(amortecedorSolto.isChecked()){
            grupoA.getAmortecedor().add("Solto");
        }
        if(amortecedorDanificado.isChecked()){
            grupoA.getAmortecedor().add("Danificado");
        }

        if(suporteAmortecedorDanificado.isChecked()){grupoA.getSuporteDoAmortecedor().add("Danificada");}
        if(buchaAmortecedorDanificada.isChecked()){grupoA.getBuchaDoAmortecedor().add("Danificada");}
        if(feixeMolasDanificado.isChecked()){grupoA.getFeixeDeMolas().add("Danificada");}
        if(buchaMolasFolga.isChecked()){grupoA.getBuchaDasMolas().add("Com Folga");}
        if(espigaoMolasCortado.isChecked()){grupoA.getEspigaoDasMolas().add("Cortado");}
        if(grampoMolasDanificado.isChecked()){grupoA.getGrampoDasMolas().add("Danificada");}
        if(suporteMolasDanificado.isChecked()){grupoA.getSuporteDasMolas().add("Danificada");}
        if(algemaDanificado.isChecked()){grupoA.getAlgema().add("Danificada");}
        if(pinoSuporteMolaSolto.isChecked()){grupoA.getPinoDoSuporteDaMola().add("Solto");}
        if(molaHelicoidalQuebrada.isChecked()){grupoA.getMolaHelicoidal().add("Quebrada");}
        if(suporteMolaHelicoidalQuebrada.isChecked()){grupoA.getSuporteEParafusoDaMolaHelicoidal().add("Quebrada");}
        if(bolsaoDeArDanificada.isChecked()){grupoA.getBolsaoDeAr().add("Danificada");}
        if(valculaNivelDanificada.isChecked()){grupoA.getValvulaDeNivel().add("Danificada");}
        if(barraEstabilizadoraSolta.isChecked()){grupoA.getBarraEstabilizadora().add("Solto");}
        if(buchaBarraEstabilizadoraFalta.isChecked()){grupoA.getBuchaDaBarraEstabilizadora().add("Falta");}
        if(bananaBeanSolta.isChecked()){grupoA.getBananaBean().add("Solto");}
        if(hasteSuporteReacaoTraseiraEmpenada.isChecked()){grupoA.getHasteSuporteDeReacaoTraseira().add("Empenada");}

        if(suporteAmortecedorSolto.isChecked()){grupoA.getSuporteDoAmortecedor().add("Solto");}
        if(buchaAmortecedorSolta.isChecked()){grupoA.getBuchaDoAmortecedor().add("Solto");}
        if(feixeMolasSolta.isChecked()){grupoA.getFeixeDeMolas().add("Solto");}

        if(espigaoMolasQuebrado.isChecked()){grupoA.getEspigaoDasMolas().add("Quebrado");}
        if(grampoMolasSolto.isChecked()){grupoA.getGrampoDasMolas().add("Solto");}
        if(suporteMolasSolto.isChecked()){grupoA.getSuporteDasMolas().add("Solto");}
        if(algemaSolto.isChecked()){grupoA.getAlgema().add("Solto");}
        if(pinoSuporteMolaQuebrado.isChecked()){grupoA.getPinoDoSuporteDaMola().add("Quebrado");}
        if(molaHelicoidalSolta.isChecked()){grupoA.getMolaHelicoidal().add("Solto");}
        if(suporteMolaHelicoidalSolto.isChecked()){grupoA.getSuporteEParafusoDaMolaHelicoidal().add("Solto");}
        if(bolsaoDeArSolto.isChecked()){grupoA.getBolsaoDeAr().add("Solto");}
        if(valculaNivelSolta.isChecked()){grupoA.getValvulaDeNivel().add("Solto");}
        if(barraEstabilizadoraFalta.isChecked()){grupoA.getBarraEstabilizadora().add("Em Falta");}
        if(buchaBarraEstabilizadoraFolga.isChecked()){grupoA.getBuchaDaBarraEstabilizadora().add("Com Folga");}
        if(bananaBeanDanificada.isChecked()){grupoA.getBananaBean().add("Danificada");}
        if(hasteSuporteReacaoTraseiraFolga.isChecked()){grupoA.getHasteSuporteDeReacaoTraseira().add("Com Folga");}

        if(pinoSuporteMolaFalta.isChecked()){grupoA.getPinoDoSuporteDaMola().add("Em Falta");}
        if(bolsaoDeArVazando.isChecked()){grupoA.getBolsaoDeAr().add("Vazando");}
        if(valculaNivelVazando.isChecked()){grupoA.getValvulaDeNivel().add("Vazando");}
        if(barraEstabilizadoraFolga.isChecked()){grupoA.getBarraEstabilizadora().add("Com Folga");}
        if(bananaBeanDesalinhada.isChecked()){grupoA.getBananaBean().add("Desalinhada");}
        if(hasteSuporteReacaoTraseiraSolta.isChecked()){grupoA.getHasteSuporteDeReacaoTraseira().add("Solta");}

        if(barraEstabilizadoraQuebrada.isChecked()){grupoA.getBarraEstabilizadora().add("Quebrada");}
        if(bananaBeanFolga.isChecked()){grupoA.getBananaBean().add("Com Folga");}
        if(hasteSuporteReacaoTraseiraQuebrada.isChecked()){grupoA.getHasteSuporteDeReacaoTraseira().add("Quebrada");}
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
