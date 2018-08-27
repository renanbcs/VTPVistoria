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

public class GrupoASistemaFreioActivity extends AppCompatActivity implements View.OnClickListener {

    private Button botaoVoltarSelecionarFicha;
    private Button botaoProximo;

    private CheckBox valvulaPedalVazando;
    private CheckBox valvulaPedalContaminada;

    private CheckBox almofadaPedalGasta;
    private CheckBox almofadaPedalFalta;

    private CheckBox freioEstacionamentoVazando;
    private CheckBox freioEstacionamentoNaoFunciona;

    private CheckBox varaoFreioMaoDespressurizada;
    private CheckBox varaoFreioMaoSolta;
    private CheckBox varaoFreioMaoSemAcao;

    private CheckBox catracaFalta;

    private CheckBox pinoCatracaFalta;

    private CheckBox lonasFreioContaminada;
    private CheckBox lonasFreioSolta;
    private CheckBox lonasFreioQuebrada;
    private CheckBox lonasFreioDesrregulada;
    private CheckBox lonasFreioFina;

    private CheckBox cilindrosPneumaticosVazando;
    private CheckBox cilindrosPneumaticosDesativado;

    private CheckBox servoFreioVazando;
    private CheckBox servoFreioSolto;
    private CheckBox cilindroRodaVazando;
    private CheckBox cilindroRodaSolto;
    private CheckBox cilindroMestreVazando;
    private CheckBox cilindroMestreSolto;
    private CheckBox flexivelRodaVazando;
    private CheckBox flexivelRodaDanificado;
    private CheckBox flexivelRodaDesalinhado;
    private CheckBox flexivelRodaIrregular;
    private CheckBox valvulaTubularReservatorioVazando;
    private CheckBox valvulaTubularReservatorioContaminada;

    private GrupoA grupoA;
    private Intent i;
    private Inspecao inspecao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a_sistema_freio);

        botaoVoltarSelecionarFicha = (Button) findViewById(R.id.botaoVoltarSelecionarFicha);
        botaoVoltarSelecionarFicha.setOnClickListener(this);

        botaoProximo = (Button) findViewById(R.id.botaoProximo);
        botaoProximo.setOnClickListener(this);

        valvulaPedalVazando = (CheckBox)findViewById(R.id.valvulaPedalVazando);
        valvulaPedalContaminada = (CheckBox)findViewById(R.id.valvulaPedalContaminada);

        almofadaPedalGasta = (CheckBox)findViewById(R.id.almofadaPedalGasta);
        almofadaPedalFalta = (CheckBox)findViewById(R.id.almofadaPedalFalta);

        freioEstacionamentoVazando = (CheckBox)findViewById(R.id.freioEstacionamentoVazando);
        freioEstacionamentoNaoFunciona = (CheckBox)findViewById(R.id.freioEstacionamentoNaoFunciona);

        varaoFreioMaoDespressurizada = (CheckBox)findViewById(R.id.varaoFreioMaoDespressurizada);
        varaoFreioMaoSolta = (CheckBox)findViewById(R.id.varaoFreioMaoSolta);
        varaoFreioMaoSemAcao = (CheckBox)findViewById(R.id.varaoFreioMaoSemAcao);

        catracaFalta = (CheckBox)findViewById(R.id.catracaFalta);

        pinoCatracaFalta = (CheckBox)findViewById(R.id.pinoCatracaFalta);

        lonasFreioContaminada = (CheckBox)findViewById(R.id.lonasFreioContaminada);
        lonasFreioSolta = (CheckBox)findViewById(R.id.lonasFreioSolta);
        lonasFreioQuebrada = (CheckBox)findViewById(R.id.lonasFreioQuebrada);
        lonasFreioDesrregulada = (CheckBox)findViewById(R.id.lonasFreioDesrregulada);
        lonasFreioFina = (CheckBox)findViewById(R.id.lonasFreioFina);

        cilindrosPneumaticosVazando = (CheckBox)findViewById(R.id.cilindrosPneumaticosVazando);
        cilindrosPneumaticosDesativado = (CheckBox)findViewById(R.id.cilindrosPneumaticosDesativado);

        servoFreioVazando = (CheckBox)findViewById(R.id.servoFreioVazando);
        servoFreioSolto = (CheckBox)findViewById(R.id.servoFreioSolto);

        cilindroRodaVazando = (CheckBox)findViewById(R.id.cilindroRodaVazando);
        cilindroRodaSolto = (CheckBox)findViewById(R.id.cilindroRodaSolto);

        cilindroMestreVazando = (CheckBox)findViewById(R.id.cilindroMestreVazando);
        cilindroMestreSolto = (CheckBox)findViewById(R.id.cilindroMestreSolto);

        flexivelRodaVazando = (CheckBox)findViewById(R.id.flexivelRodaVazando);
        flexivelRodaDanificado = (CheckBox)findViewById(R.id.flexivelRodaDanificado);
        flexivelRodaDesalinhado = (CheckBox)findViewById(R.id.flexivelRodaDesalinhado);
        flexivelRodaIrregular = (CheckBox)findViewById(R.id.flexivelRodaIrregular);

        valvulaTubularReservatorioVazando = (CheckBox)findViewById(R.id.valvulaTubularReservatorioVazando);
        valvulaTubularReservatorioContaminada = (CheckBox)findViewById(R.id.valvulaTubularReservatorioContaminada);

        i = getIntent();
        inspecao = (Inspecao) i.getSerializableExtra("inspecao");

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:
                salvarDados();
                Intent intent = new Intent(getApplicationContext(),GrupoASistemaSuspensaoActivity.class);
                intent.putExtra("inspecao",inspecao);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        if(valvulaPedalVazando.isChecked()){
            grupoA.getValvulaPedal().add("Vazando");
        }
        if(valvulaPedalContaminada.isChecked()){
            grupoA.getValvulaPedal().add("Contaminada");
        }
        if(almofadaPedalFalta.isChecked()){
            grupoA.getAlmofadaPedal().add("Faltando");
        }
        if(almofadaPedalGasta.isChecked()){
            grupoA.getAlmofadaPedal().add("Gasta");
        }
        if(freioEstacionamentoVazando.isChecked()){
            grupoA.getFreioDeEstacionamento().add("Vazando");
        }
        if(freioEstacionamentoNaoFunciona.isChecked()){
            grupoA.getFreioDeEstacionamento().add("Não Funciona");
        }
        if(varaoFreioMaoDespressurizada.isChecked()){
            grupoA.getVaraoDoFreioDeMao().add("Despressurizado");
        }
        if(varaoFreioMaoSolta.isChecked()){
            grupoA.getVaraoDoFreioDeMao().add("Solto");
        }
        if(varaoFreioMaoSemAcao.isChecked()){
            grupoA.getVaraoDoFreioDeMao().add("Sem Ação");
        }
        if(catracaFalta.isChecked()){
            grupoA.getCatracasAutomaticaMecanica().add("Faltando");
        }
        if(pinoCatracaFalta.isChecked()){
            grupoA.getPinoDaCatraca().add("Faltando");
        }
        if(lonasFreioContaminada.isChecked()){
            grupoA.getLonasDeFreio().add("Contaminado");
        }
        if(lonasFreioSolta.isChecked()){
            grupoA.getLonasDeFreio().add("Solto");
        }
        if(lonasFreioQuebrada.isChecked()){
            grupoA.getLonasDeFreio().add("Quebrado");
        }
        if(lonasFreioDesrregulada.isChecked()){
            grupoA.getLonasDeFreio().add("Desrregulada");
        }
        if(lonasFreioFina.isChecked()){
            grupoA.getLonasDeFreio().add("Fino");
        }
        if(almofadaPedalGasta.isChecked()){
            grupoA.getAlmofadaPedal().add("Gasto");
        }
        if(cilindrosPneumaticosVazando.isChecked()){
            grupoA.getCilindrosPneumaticos().add("Vazando");
        }
        if(cilindrosPneumaticosDesativado.isChecked()){
            grupoA.getCilindrosPneumaticos().add("Desativados");
        }
        if(servoFreioVazando.isChecked()){
            grupoA.getServoDoFreio().add("Vazando");
        }
        if(servoFreioSolto.isChecked()){
            grupoA.getServoDoFreio().add("Solto");
        }
        if(cilindroRodaVazando.isChecked()){
            grupoA.getCilindroDeRoda().add("Vazando");
        }
        if(cilindroRodaSolto.isChecked()){
            grupoA.getCilindroDeRoda().add("Solto");
        }
        if(cilindroMestreVazando.isChecked()){
            grupoA.getCilintroMestre().add("Vazando");
        }
        if(cilindroMestreSolto.isChecked()){
            grupoA.getCilintroMestre().add("Solto");
        }
        if(flexivelRodaVazando.isChecked()){
            grupoA.getFlexivelDaRoda().add("Vazando");
        }
        if(flexivelRodaDanificado.isChecked()){
            grupoA.getFlexivelDaRoda().add("Danificado");
        }
        if(flexivelRodaDesalinhado.isChecked()){
            grupoA.getFlexivelDaRoda().add("Desalinhado");
        }
        if(flexivelRodaIrregular.isChecked()){
            grupoA.getFlexivelDaRoda().add("Irregular");
        }
        if(valvulaTubularReservatorioVazando.isChecked()){
            grupoA.getValvulasTubularReservatorio().add("Vazando");
        }
        if(valvulaTubularReservatorioContaminada.isChecked()){
            grupoA.getValvulasTubularReservatorio().add("Contaminado");
        }
    }

    @Override
    public void onPause(){
        super.onPause();
    }


}
