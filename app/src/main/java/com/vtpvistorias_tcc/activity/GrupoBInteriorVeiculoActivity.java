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
                Intent intent = new Intent(getApplicationContext(),GrupoBInteriorVeiculoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoB == null)
            grupoB = new GrupoB();

        //grupoB.setIdFicha(1l);
        grupoB.setDegrausLiso(degrausLiso.isChecked());
        grupoB.setDegrausDanificado(degrausDanificado.isChecked());
        grupoB.setPisoLiso(pisoLiso.isChecked());
        grupoB.setPisoDanificado(pisoDanificado.isChecked());
        grupoB.setTampaInspecaoSolta(tampaInspecaoSolta.isChecked());
        grupoB.setTampaInspecaoDanificada(tampaInspecaoDanificada.isChecked());
        grupoB.setTampaInspecaoFaltaManutencao(tampaInspecaoFaltaManutencao.isChecked());
        grupoB.setTampaMotorSolta(tampaMotorSolta.isChecked());
        grupoB.setTampaMotorSemTrava(tampaMotorSemTrava.isChecked());
        grupoB.setTampaMotorSemVedacao(tampaMotorSemVedacao.isChecked());
        grupoB.setRevestimentoInternoSolto(revestimentoInternoSolto.isChecked());
        grupoB.setRevestimentoInternoDanificada(revestimentoInternoDanificada.isChecked());
        grupoB.setRevestimentoInternoFaltando(revestimentoInternoFaltando.isChecked());
        grupoB.setRevestimentoInternoIrregular(revestimentoInternoIrregular.isChecked());
        grupoB.setBalaustresSolto(balaustresSolto.isChecked());
        grupoB.setBalaustresFalta(balaustresFalta.isChecked());
        grupoB.setDerrapanteFalta(derrapanteFalta.isChecked());
        grupoB.setDerrapanteSolto(derrapanteSolto.isChecked());
        grupoB.setDerrapanteLiso(derrapanteLiso.isChecked());
        grupoB.setPostoCobrancaDanificado(postoCobrancaDanificado.isChecked());
        grupoB.setPostoCobrancaFalta(postoCobrancaFalta.isChecked());
        grupoB.setPostoCobrancaSolto(postoCobrancaSolto.isChecked());
        grupoB.setEscotilhasCupulasFalta(escotilhasCupulasFalta.isChecked());
        grupoB.setEscotilhasCupulasDanificada(escotilhasCupulasDanificada.isChecked());
        grupoB.setEscotilhasCupulasSolta(escotilhasCupulasSolta.isChecked());
        grupoB.setEscotilhasCupulasTrincada(escotilhasCupulasTrincada.isChecked());
        grupoB.setSaidaEmergenciaSemIdentificacao(saidaEmergenciaSemIdentificacao.isChecked());
        grupoB.setSaidaEmergenciaSemLacre(saidaEmergenciaSemLacre.isChecked());
        grupoB.setSaidaEmergenciaDanificada(saidaEmergenciaDanificada.isChecked());



        //inspecao.setGrupoB(grupoB);
        //grupoB.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }
}
