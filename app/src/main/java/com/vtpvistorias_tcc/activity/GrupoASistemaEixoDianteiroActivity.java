package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DatabaseReference;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.R;

public class GrupoASistemaEixoDianteiroActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox caixaDirecaoSolta;
    private CheckBox caixaDirecaoVazamFlexEncanamento;
    private CheckBox suporteCaixaSolto;
    private CheckBox suporteCaixaTrincado;
    private CheckBox bracoTerminalCaixaFolga;
    private CheckBox bracoTerminalCaixaSolto;
    private CheckBox amortecedorDirecaoSolto;
    private CheckBox amortecedorDirecaoVazando;
    private CheckBox amortecedorDirecaoFalta;
    private CheckBox eixoDianteiroEmpenado;
    private CheckBox eixoDianteiroTrincado;
    private CheckBox rolamentoMangaEixoDanificado;
    private CheckBox rolamentoMangaEixoFolga;
    private CheckBox parafusoBatenteMangaFalta;
    private CheckBox parafusoBatenteMangaSolto;
    private CheckBox bracoEixoDianteiroSolto;
    private CheckBox bracoEixoDianteiroDanificado;
    private CheckBox terminaisBarraLongaSolto;
    private CheckBox terminaisBarraLongaFolga;
    private CheckBox bracoIntermediarioSolto;
    private CheckBox bracoIntermediarioFolga;
    private CheckBox hasteSuporteReacaoEmpenada;
    private CheckBox hasteSuporteReacaoFolga;
    private CheckBox hasteSuporteReacaoSolta;
    private CheckBox hasteSuporteReacaoQuebrada;



    private DatabaseReference firebase;
    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_sistema_eixo_dianteiro);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        caixaDirecaoSolta = (CheckBox)findViewById(R.id.caixaDirecaoSolta);
        caixaDirecaoVazamFlexEncanamento = (CheckBox)findViewById(R.id.caixaDirecaoVazamFlexEncanamento);

        suporteCaixaSolto    = (CheckBox)findViewById(R.id.suporteCaixaSolto);
        suporteCaixaTrincado = (CheckBox)findViewById(R.id.suporteCaixaTrincado);

        bracoTerminalCaixaFolga = (CheckBox)findViewById(R.id.bracoTerminalCaixaFolga);
        bracoTerminalCaixaSolto = (CheckBox)findViewById(R.id.bracoTerminalCaixaSolto);

        amortecedorDirecaoSolto	  = (CheckBox)findViewById(R.id.amortecedorDirecaoSolto);
        amortecedorDirecaoVazando = (CheckBox)findViewById(R.id.amortecedorDirecaoVazando);
        amortecedorDirecaoFalta   = (CheckBox)findViewById(R.id.amortecedorDirecaoFalta);

        eixoDianteiroEmpenado = (CheckBox)findViewById(R.id.eixoDianteiroEmpenado);
        eixoDianteiroTrincado = (CheckBox)findViewById(R.id.eixoDianteiroTrincado);

        rolamentoMangaEixoDanificado = (CheckBox)findViewById(R.id.rolamentoMangaEixoDanificado);
        rolamentoMangaEixoFolga      = (CheckBox)findViewById(R.id.rolamentoMangaEixoFolga);

        parafusoBatenteMangaFalta = (CheckBox)findViewById(R.id.parafusoBatenteMangaFalta);
        parafusoBatenteMangaSolto = (CheckBox)findViewById(R.id.parafusoBatenteMangaSolto);

        bracoEixoDianteiroSolto = (CheckBox)findViewById(R.id.bracoEixoDianteiroSolto);
        bracoEixoDianteiroDanificado = (CheckBox)findViewById(R.id.bracoEixoDianteiroDanificado);

        terminaisBarraLongaSolto = (CheckBox)findViewById(R.id.terminaisBarraLongaSolto);
        terminaisBarraLongaFolga = (CheckBox)findViewById(R.id.terminaisBarraLongaFolga);

        bracoIntermediarioSolto = (CheckBox)findViewById(R.id.bracoIntermediarioSolto);
        bracoIntermediarioFolga = (CheckBox)findViewById(R.id.bracoIntermediarioFolga);

        hasteSuporteReacaoEmpenada = (CheckBox)findViewById(R.id.hasteSuporteReacaoEmpenada);
        hasteSuporteReacaoFolga = (CheckBox)findViewById(R.id.hasteSuporteReacaoFolga);
        hasteSuporteReacaoSolta = (CheckBox)findViewById(R.id.hasteSuporteReacaoSolta);
        hasteSuporteReacaoQuebrada = (CheckBox)findViewById(R.id.hasteSuporteReacaoQuebrada);



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
                Intent intent = new Intent(getApplicationContext(),GrupoAChassioPlataformaActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(grupoA == null)
            grupoA = new GrupoA();

        //grupoA.setIdFicha(1l);
        grupoA.setCaixaDirecaoSolta(caixaDirecaoSolta.isChecked());
        grupoA.setCaixaDirecaoVazamFlexEncanamento(caixaDirecaoVazamFlexEncanamento.isChecked());

        grupoA.setSuporteCaixaTrincado(suporteCaixaTrincado.isChecked());
        grupoA.setSuporteCaixaSolto(suporteCaixaSolto.isChecked());

        grupoA.setBracoTerminalCaixaFolga(bracoTerminalCaixaFolga.isChecked());
        grupoA.setBracoTerminalCaixaSolto(bracoTerminalCaixaSolto.isChecked());

        grupoA.setAmortecedorDirecaoSolto(amortecedorDirecaoSolto.isChecked());
        grupoA.setAmortecedorDirecaoVazando(amortecedorDirecaoVazando.isChecked());
        grupoA.setAmortecedorDirecaoFalta(amortecedorDirecaoFalta.isChecked());

        grupoA.setEixoDianteiroEmpenado(eixoDianteiroEmpenado.isChecked());
        grupoA.setEixoDianteiroTrincado(eixoDianteiroTrincado.isChecked());

        grupoA.setRolamentoMangaEixoDanificado(rolamentoMangaEixoDanificado.isChecked());
        grupoA.setRolamentoMangaEixoFolga(rolamentoMangaEixoFolga.isChecked());

        grupoA.setParafusoBatenteMangaFalta(parafusoBatenteMangaFalta.isChecked());
        grupoA.setParafusoBatenteMangaSolto(parafusoBatenteMangaSolto.isChecked());

        grupoA.setBracoEixoDianteiroSolto(bracoEixoDianteiroSolto.isChecked());
        grupoA.setBracoEixoDianteiroDanificado(bracoEixoDianteiroDanificado.isChecked());

        grupoA.setTerminaisBarraLongaSolto(terminaisBarraLongaSolto.isChecked());
        grupoA.setTerminaisBarraLongaFolga(terminaisBarraLongaFolga.isChecked());

        grupoA.setBracoIntermediarioSolto(bracoIntermediarioSolto.isChecked());
        grupoA.setBracoIntermediarioFolga(bracoIntermediarioFolga.isChecked());

        grupoA.setHasteSuporteReacaoEmpenada(hasteSuporteReacaoEmpenada.isChecked());
        grupoA.setHasteSuporteReacaoFolga(hasteSuporteReacaoFolga.isChecked());
        grupoA.setHasteSuporteReacaoSolta(hasteSuporteReacaoSolta.isChecked());
        grupoA.setHasteSuporteReacaoQuebrada(hasteSuporteReacaoQuebrada.isChecked());


        inspecao.setGrupoA(grupoA);
        //grupoA.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

}
