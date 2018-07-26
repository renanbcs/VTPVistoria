package com.vtpvistorias_tcc.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.GrupoA;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;

public class GrupoAActivity extends AppCompatActivity implements View.OnClickListener {

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

    private DatabaseReference firebase;
    private GrupoA grupoA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_a);

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

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.botaoVoltarSelecionarFicha:
                finish();
                break;
            case R.id.botaoProximo:
                salvarDados();
                Intent intent = new Intent(getApplicationContext(),GrupoBActivity.class);
                startActivity(intent);
                break;
        }

    }

    public void salvarDados(){

        grupoA = new GrupoA();

        //grupoA.setIdFicha(1l);
        grupoA.setValvulaPedalVazando(valvulaPedalVazando.isChecked());
        grupoA.setValvulaPedalContaminada(valvulaPedalContaminada.isChecked());
        grupoA.setAlmofadaPedalFalta(almofadaPedalFalta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());
        grupoA.setAlmofadaPedalGasta(almofadaPedalGasta.isChecked());


       grupoA.salvar();
    }

    @Override
    public void onPause(){
        super.onPause();
    }


}
