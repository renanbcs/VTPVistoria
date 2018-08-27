package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.GrupoB;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoBInteriorVeiculoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox degrausLiso;
    private CheckBox degrausDanificado;
    private CheckBox pisoLiso;
    private CheckBox pisoDanificado;
    private CheckBox tampaInspecaoSolta;
    private CheckBox tampaInspecaoDanificada;
    private CheckBox tampaInspecaoFaltaManutencao;
    private CheckBox tampaMotorSolta;
    private CheckBox tampaMotorSemTrava;
    private CheckBox tampaMotorSemVedacao;
    private CheckBox revestimentoInternoSolto;
    private CheckBox revestimentoInternoDanificada;
    private CheckBox revestimentoInternoFaltando;
    private CheckBox revestimentoInternoIrregular;
    private CheckBox balaustresSolto;
    private CheckBox balaustresFalta;
    private CheckBox derrapanteFalta;
    private CheckBox derrapanteSolto;
    private CheckBox derrapanteLiso;
    private CheckBox postoCobrancaDanificado;
    private CheckBox postoCobrancaFalta;
    private CheckBox postoCobrancaSolto;
    private CheckBox escotilhasCupulasFalta;
    private CheckBox escotilhasCupulasDanificada;
    private CheckBox escotilhasCupulasSolta;
    private CheckBox escotilhasCupulasTrincada;
    private CheckBox saidaEmergenciaSemIdentificacao;
    private CheckBox saidaEmergenciaSemLacre;
    private CheckBox saidaEmergenciaDanificada;


    private DatabaseReference firebase;
    private GrupoB grupoB;
    private Intent i;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_b_interior_veiculo);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        degrausLiso = (CheckBox)findViewById(R.id.degrausLiso);
        degrausDanificado = (CheckBox)findViewById(R.id.degrausDanificado);
        pisoLiso = (CheckBox)findViewById(R.id.pisoLiso);
        pisoDanificado = (CheckBox)findViewById(R.id.pisoDanificado);
        tampaInspecaoSolta = (CheckBox)findViewById(R.id.tampaInspecaoSolta);
        tampaInspecaoDanificada = (CheckBox)findViewById(R.id.tampaInspecaoDanificada);
        tampaInspecaoFaltaManutencao = (CheckBox)findViewById(R.id.tampaInspecaoFaltaManutencao);
        tampaMotorSolta = (CheckBox)findViewById(R.id.tampaMotorSolta);
        tampaMotorSemTrava = (CheckBox)findViewById(R.id.tampaMotorSemTrava);
        tampaMotorSemVedacao = (CheckBox)findViewById(R.id.tampaMotorSemVedacao);
        revestimentoInternoSolto = (CheckBox)findViewById(R.id.revestimentoInternoSolto);
        revestimentoInternoDanificada = (CheckBox)findViewById(R.id.revestimentoInternoDanificada);
        revestimentoInternoFaltando = (CheckBox)findViewById(R.id.revestimentoInternoFaltando);
        revestimentoInternoIrregular = (CheckBox)findViewById(R.id.revestimentoInternoIrregular);
        balaustresSolto = (CheckBox)findViewById(R.id.balaustresSolto);
        balaustresFalta = (CheckBox)findViewById(R.id.balaustresFalta);
        derrapanteFalta = (CheckBox)findViewById(R.id.derrapanteFalta);
        derrapanteSolto = (CheckBox)findViewById(R.id.derrapanteSolto);
        derrapanteLiso = (CheckBox)findViewById(R.id.derrapanteLiso);
        postoCobrancaDanificado = (CheckBox)findViewById(R.id.postoCobrancaDanificado);
        postoCobrancaFalta = (CheckBox)findViewById(R.id.postoCobrancaFalta);
        postoCobrancaSolto = (CheckBox)findViewById(R.id.postoCobrancaSolto);
        escotilhasCupulasFalta = (CheckBox)findViewById(R.id.escotilhasCupulasFalta);
        escotilhasCupulasDanificada = (CheckBox)findViewById(R.id.escotilhasCupulasDanificada);
        escotilhasCupulasSolta = (CheckBox)findViewById(R.id.escotilhasCupulasSolta);
        escotilhasCupulasTrincada = (CheckBox)findViewById(R.id.escotilhasCupulasTrincada);
        saidaEmergenciaSemIdentificacao = (CheckBox)findViewById(R.id.saidaEmergenciaSemIdentificacao);
        saidaEmergenciaSemLacre = (CheckBox)findViewById(R.id.saidaEmergenciaSemLacre);
        saidaEmergenciaDanificada = (CheckBox)findViewById(R.id.saidaEmergenciaDanificada);


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
                Intent intent = new Intent(getApplicationContext(),GrupoBIluminacaoExternaSinalizacaoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(degrausLiso.isChecked()){

            grupoB.getDegraus().add("Liso");
        }
        if(degrausDanificado.isChecked()){

            grupoB.getDegraus().add("Danificado");
        }
        if(pisoLiso.isChecked()){

            grupoB.getPiso().add("Lisp");
        }
        if(pisoDanificado.isChecked()){

            grupoB.getPiso().add("Danificado");
        }
        if(tampaInspecaoSolta.isChecked()){

            grupoB.getTampaDeInspecao().add("Solta");
        }
        if(tampaInspecaoDanificada.isChecked()){

            grupoB.getTampaDeInspecao().add("Danificada");
        }
        if(tampaInspecaoFaltaManutencao.isChecked()){

            grupoB.getTampaDeInspecao().add("Falta Manutenção");
        }
        if(tampaMotorSolta.isChecked()){

            grupoB.getTampaDoMotor().add("Solta");
        }
        if(tampaMotorSemTrava.isChecked()){

            grupoB.getTampaDoMotor().add("Sem Trava");
        }
        if(tampaMotorSemVedacao.isChecked()){

            grupoB.getTampaDoMotor().add("Sem Vedação");
        }
        if(revestimentoInternoSolto.isChecked()){

            grupoB.getRevestimentoInterno().add("Solto");
        }
        if(revestimentoInternoDanificada.isChecked()){

            grupoB.getRevestimentoInterno().add("Danificada");
        }
        if(revestimentoInternoFaltando.isChecked()){

            grupoB.getRevestimentoInterno().add("Faltando");
        }
        if(revestimentoInternoIrregular.isChecked()){

            grupoB.getRevestimentoInterno().add("Irregular");
        }
        if(balaustresSolto.isChecked()){

            grupoB.getBalaustres().add("Solto");
        }
        if(balaustresFalta.isChecked()){

            grupoB.getBalaustres().add("Falta");
        }
        if(derrapanteFalta.isChecked()){

            grupoB.getDerrapante().add("Falta");
        }
        if(derrapanteSolto.isChecked()){

            grupoB.getDerrapante().add("Solto");
        }
        if(derrapanteLiso.isChecked()){

            grupoB.getDerrapante().add("Liso");
        }
        if(postoCobrancaDanificado.isChecked()){

            grupoB.getPostoDeCobranca().add("Danificado");
        }
        if(postoCobrancaFalta.isChecked()){

            grupoB.getPostoDeCobranca().add("Falta");
        }
        if(postoCobrancaSolto.isChecked()){

            grupoB.getPostoDeCobranca().add("Solto");
        }
        if(escotilhasCupulasFalta.isChecked()){

            grupoB.getEscotilhasECupulas().add("Falta");
        }
        if(escotilhasCupulasDanificada.isChecked()){

            grupoB.getEscotilhasECupulas().add("Danificada");
        }
        if(escotilhasCupulasSolta.isChecked()){

            grupoB.getEscotilhasECupulas().add("Solta");
        }
        if(escotilhasCupulasTrincada.isChecked()){

            grupoB.getEscotilhasECupulas().add("Trincada");
        }
        if(saidaEmergenciaSemIdentificacao.isChecked()){

            grupoB.getSaidaDeEmergencia().add("Sem identificação");
        }
        if(saidaEmergenciaSemLacre.isChecked()){

            grupoB.getSaidaDeEmergencia().add("Sem  Lacre");
        }
        if(saidaEmergenciaDanificada.isChecked()){

            grupoB.getSaidaDeEmergencia().add("Danificada");
        }

    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
