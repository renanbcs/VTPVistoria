package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.HashMap;
import java.util.Map;

public class GrupoB extends Inspecao {

    //Atributos
    private Long idFicha;

    private Boolean valvulaPedalVazando = false;
    private Boolean valvulaPedalContaminada = false;

    private Boolean almofadaPedalGasta = false;
    private Boolean almofadaPedalFalta = false;

    private Boolean freioEstacionamentoVazando = false;
    private Boolean freioEstacionamentoNaoFunciona = false;

    private Boolean varaoFreioMaoDespressurizada = false;
    private Boolean varaoFreioMaoSolta = false;
    private Boolean varaoFreioMaoSemAcao = false;

    private Boolean catracaFalta = false;

    private Boolean pinoCatracaFalta = false;

    private Boolean lonasFreioContaminada = false;
    private Boolean lonasFreioSolta = false;
    private Boolean lonasFreioQuebrada = false;
    private Boolean lonasFreioDesrregulada = false;
    private Boolean lonasFreioFina = false;

    private Boolean cilindrosPneumaticosVazando = false;
    private Boolean cilindrosPneumaticosDesativado = false;

    private Boolean servoFreioVazando = false;
    private Boolean servoFreioSolto = false;

    private Boolean cilindroRodaVazando = false;
    private Boolean cilindroRodaSolto = false;

    private Boolean cilindroMestreVazando = false;
    private Boolean cilindroMestreSolto = false;

    private Boolean flexivelRodaVazando = false;
    private Boolean flexivelRodaDanificado = false;
    private Boolean flexivelRodaDesalinhado = false;
    private Boolean flexivelRodaIrregular = false;

    private Boolean valvulaTubularReservatorioVazando = false;
    private Boolean valvulaTubularReservatorioContaminada = false;

    public GrupoB() {
    }

    public void salvar(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Grupo A").push().setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap(){
        HashMap<String, Object> hashMapFichaA = new HashMap<>();

        hashMapFichaA.put("idFicha",getIdFicha());

        hashMapFichaA.put("valvulaPedalVazando",getValvulaPedalVazando());
        hashMapFichaA.put("valvulaPedalContaminada",getValvulaPedalContaminada());

        hashMapFichaA.put("almofadaPedalGasta",getAlmofadaPedalGasta());
        hashMapFichaA.put("almofadaPedalFalta",getAlmofadaPedalFalta());

        hashMapFichaA.put("freioEstacionamentoVazando",getFreioEstacionamentoVazando());
        hashMapFichaA.put("freioEstacionamentoNaoFunciona",getFreioEstacionamentoNaoFunciona());

        hashMapFichaA.put("varaoFreioMaoDespressurizada",getVaraoFreioMaoDespressurizada());
        hashMapFichaA.put("varaoFreioMaoSolta",getVaraoFreioMaoSolta());
        hashMapFichaA.put("varaoFreioMaoSemAcao",getVaraoFreioMaoSemAcao());

        hashMapFichaA.put("catracaFalta",getCatracaFalta());

        hashMapFichaA.put("pinoCatracaFalta",getPinoCatracaFalta());

        hashMapFichaA.put("lonasFreioContaminada",getLonasFreioContaminada());
        hashMapFichaA.put("lonasFreioSolta",getLonasFreioSolta());
        hashMapFichaA.put("lonasFreioQuebrada",getLonasFreioQuebrada());
        hashMapFichaA.put("lonasFreioDesrregulada",getLonasFreioDesrregulada());
        hashMapFichaA.put("lonasFreioFina",getLonasFreioFina());

        hashMapFichaA.put("cilindrosPneumaticosVazando",getCilindrosPneumaticosVazando());
        hashMapFichaA.put("cilindrosPneumaticosDesativado",getCilindrosPneumaticosDesativado());

        hashMapFichaA.put("servoFreioVazando",getServoFreioVazando());
        hashMapFichaA.put("servoFreioSolto",getServoFreioSolto());
        hashMapFichaA.put("cilindroRodaVazando",getCilindroRodaVazando());
        hashMapFichaA.put("cilindroRodaSolto",getCilindroRodaSolto());
        hashMapFichaA.put("cilindroMestreVazando",getCilindroMestreVazando());
        hashMapFichaA.put("cilindroMestreSolto",getCilindroMestreSolto());
        hashMapFichaA.put("flexivelRodaVazando",getFlexivelRodaVazando());
        hashMapFichaA.put("flexivelRodaDanificado",getFlexivelRodaDanificado());
        hashMapFichaA.put("flexivelRodaDesalinhado",getFlexivelRodaDesalinhado());
        hashMapFichaA.put("flexivelRodaIrregular",getFlexivelRodaIrregular());
        hashMapFichaA.put("valvulaTubularReservatorioVazando",getValvulaTubularReservatorioVazando());
        hashMapFichaA.put("valvulaTubularReservatorioContaminada",getValvulaTubularReservatorioContaminada());

        return hashMapFichaA;
    }


    public Long getIdFicha(){
        return idFicha;
    }

    public void setIdFicha(Long idFicha){
        this.idFicha=idFicha;
    }

    public Boolean getValvulaPedalVazando() {
        return valvulaPedalVazando;
    }

    public void setValvulaPedalVazando(Boolean valvulaPedalVazando) {
        this.valvulaPedalVazando = valvulaPedalVazando;
    }

    public Boolean getValvulaPedalContaminada() {
        return valvulaPedalContaminada;
    }

    public void setValvulaPedalContaminada(Boolean valvulaPedalContaminada) {
        this.valvulaPedalContaminada = valvulaPedalContaminada;
    }

    public Boolean getAlmofadaPedalGasta() {
        return almofadaPedalGasta;
    }

    public void setAlmofadaPedalGasta(Boolean almofadaPedalGasta) {
        this.almofadaPedalGasta = almofadaPedalGasta;
    }

    public Boolean getAlmofadaPedalFalta() {
        return almofadaPedalFalta;
    }

    public void setAlmofadaPedalFalta(Boolean almofadaPedalFalta) {
        this.almofadaPedalFalta = almofadaPedalFalta;
    }

    public Boolean getFreioEstacionamentoVazando() {
        return freioEstacionamentoVazando;
    }

    public void setFreioEstacionamentoVazando(Boolean freioEstacionamentoVazando) {
        this.freioEstacionamentoVazando = freioEstacionamentoVazando;
    }

    public Boolean getFreioEstacionamentoNaoFunciona() {
        return freioEstacionamentoNaoFunciona;
    }

    public void setFreioEstacionamentoNaoFunciona(Boolean freioEstacionamentoNaoFunciona) {
        this.freioEstacionamentoNaoFunciona = freioEstacionamentoNaoFunciona;
    }

    public Boolean getVaraoFreioMaoDespressurizada() {
        return varaoFreioMaoDespressurizada;
    }

    public void setVaraoFreioMaoDespressurizada(Boolean varaoFreioMaoDespressurizada) {
        this.varaoFreioMaoDespressurizada = varaoFreioMaoDespressurizada;
    }

    public Boolean getVaraoFreioMaoSolta() {
        return varaoFreioMaoSolta;
    }

    public void setVaraoFreioMaoSolta(Boolean varaoFreioMaoSolta) {
        this.varaoFreioMaoSolta = varaoFreioMaoSolta;
    }

    public Boolean getVaraoFreioMaoSemAcao() {
        return varaoFreioMaoSemAcao;
    }

    public void setVaraoFreioMaoSemAcao(Boolean varaoFreioMaoSemAcao) {
        this.varaoFreioMaoSemAcao = varaoFreioMaoSemAcao;
    }

    public Boolean getCatracaFalta() {
        return catracaFalta;
    }

    public void setCatracaFalta(Boolean catracaFalta) {
        this.catracaFalta = catracaFalta;
    }

    public Boolean getPinoCatracaFalta() {
        return pinoCatracaFalta;
    }

    public void setPinoCatracaFalta(Boolean pinoCatracaFalta) {
        this.pinoCatracaFalta = pinoCatracaFalta;
    }

    public Boolean getLonasFreioContaminada() {
        return lonasFreioContaminada;
    }

    public void setLonasFreioContaminada(Boolean lonasFreioContaminada) {
        this.lonasFreioContaminada = lonasFreioContaminada;
    }

    public Boolean getLonasFreioSolta() {
        return lonasFreioSolta;
    }

    public void setLonasFreioSolta(Boolean lonasFreioSolta) {
        this.lonasFreioSolta = lonasFreioSolta;
    }

    public Boolean getLonasFreioDesrregulada() {
        return lonasFreioDesrregulada;
    }

    public void setLonasFreioDesrregulada(Boolean lonasFreioDesrregulada) {
        this.lonasFreioDesrregulada = lonasFreioDesrregulada;
    }

    public Boolean getLonasFreioFina() {
        return lonasFreioFina;
    }

    public void setLonasFreioFina(Boolean lonasFreioFina) {
        this.lonasFreioFina = lonasFreioFina;
    }

    public Boolean getCilindrosPneumaticosVazando() {
        return cilindrosPneumaticosVazando;
    }

    public void setCilindrosPneumaticosVazando(Boolean cilindrosPneumaticosVazando) {
        this.cilindrosPneumaticosVazando = cilindrosPneumaticosVazando;
    }

    public Boolean getCilindrosPneumaticosDesativado() {
        return cilindrosPneumaticosDesativado;
    }

    public void setCilindrosPneumaticosDesativado(Boolean cilindrosPneumaticosDesativado) {
        this.cilindrosPneumaticosDesativado = cilindrosPneumaticosDesativado;
    }

    public Boolean getServoFreioVazando() {
        return servoFreioVazando;
    }

    public void setServoFreioVazando(Boolean servoFreioVazando) {
        this.servoFreioVazando = servoFreioVazando;
    }

    public Boolean getServoFreioSolto() {
        return servoFreioSolto;
    }

    public void setServoFreioSolto(Boolean servoFreioSolto) {
        this.servoFreioSolto = servoFreioSolto;
    }

    public Boolean getCilindroRodaVazando() {
        return cilindroRodaVazando;
    }

    public void setCilindroRodaVazando(Boolean cilindroRodaVazando) {
        this.cilindroRodaVazando = cilindroRodaVazando;
    }

    public Boolean getCilindroRodaSolto() {
        return cilindroRodaSolto;
    }

    public void setCilindroRodaSolto(Boolean cilindroRodaSolto) {
        this.cilindroRodaSolto = cilindroRodaSolto;
    }

    public Boolean getCilindroMestreVazando() {
        return cilindroMestreVazando;
    }

    public void setCilindroMestreVazando(Boolean cilindroMestreVazando) {
        this.cilindroMestreVazando = cilindroMestreVazando;
    }

    public Boolean getCilindroMestreSolto() {
        return cilindroMestreSolto;
    }

    public void setCilindroMestreSolto(Boolean cilindroMestreSolto) {
        this.cilindroMestreSolto = cilindroMestreSolto;
    }

    public Boolean getFlexivelRodaVazando() {
        return flexivelRodaVazando;
    }

    public void setFlexivelRodaVazando(Boolean flexivelRodaVazando) {
        this.flexivelRodaVazando = flexivelRodaVazando;
    }

    public Boolean getFlexivelRodaDanificado() {
        return flexivelRodaDanificado;
    }

    public void setFlexivelRodaDanificado(Boolean flexivelRodaDanificado) {
        this.flexivelRodaDanificado = flexivelRodaDanificado;
    }

    public Boolean getFlexivelRodaDesalinhado() {
        return flexivelRodaDesalinhado;
    }

    public void setFlexivelRodaDesalinhado(Boolean flexivelRodaDesalinhado) {
        this.flexivelRodaDesalinhado = flexivelRodaDesalinhado;
    }

    public Boolean getFlexivelRodaIrregular() {
        return flexivelRodaIrregular;
    }

    public void setFlexivelRodaIrregular(Boolean flexivelRodaIrregular) {
        this.flexivelRodaIrregular = flexivelRodaIrregular;
    }

    public Boolean getValvulaTubularReservatorioVazando() {
        return valvulaTubularReservatorioVazando;
    }

    public void setValvulaTubularReservatorioVazando(Boolean valvulaTubularReservatorioVazando) {
        this.valvulaTubularReservatorioVazando = valvulaTubularReservatorioVazando;
    }

    public Boolean getValvulaTubularReservatorioContaminada() {
        return valvulaTubularReservatorioContaminada;
    }

    public void setValvulaTubularReservatorioContaminada(Boolean valvulaTubularReservatorioContaminada) {
        this.valvulaTubularReservatorioContaminada = valvulaTubularReservatorioContaminada;
    }

    public Boolean getLonasFreioQuebrada() {
        return lonasFreioQuebrada;
    }

    public void setLonasFreioQuebrada(Boolean lonasFreioQuebrada) {
        this.lonasFreioQuebrada = lonasFreioQuebrada;
    }
}

