package com.vtpvistorias_tcc.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class GrupoA implements Serializable {

    private ArrayList<String> valvulaPedal ;
    private ArrayList<String> almofadaPedal ;
    private ArrayList<String> freioDeEstacionamento ;
    private ArrayList<String> varaoDoFreioDeMao ;
    private ArrayList<String> catracasAutomaticaMecanica ;
    private ArrayList<String> pinoDaCatraca ;
    private ArrayList<String> lonasDeFreio ;
    private ArrayList<String> cilindrosPneumaticos ;
    private ArrayList<String> servoDoFreio ;
    private ArrayList<String> cilindroDeRoda ;
    private ArrayList<String> cilintroMestre ;
    private ArrayList<String> flexivelDaRoda ;
    private ArrayList<String> valvulasTubularReservatorio ;

    private ArrayList<String> amortecedor ;
    private ArrayList<String> suporteDoAmortecedor ;
    private ArrayList<String> buchaDoAmortecedor ;
    private ArrayList<String> feixeDeMolas ;
    private ArrayList<String> buchaDasMolas ;
    private ArrayList<String> espigaoDasMolas ;
    private ArrayList<String> grampoDasMolas ;
    private ArrayList<String> suporteDasMolas ;
    private ArrayList<String> algema ;
    private ArrayList<String> pinoDoSuporteDaMola ;
    private ArrayList<String> molaHelicoidal ;
    private ArrayList<String> suporteEParafusoDaMolaHelicoidal ;
    private ArrayList<String> bolsaoDeAr ;
    private ArrayList<String> valvulaDeNivel ;
    private ArrayList<String> barraEstabilizadora ;
    private ArrayList<String> buchaDaBarraEstabilizadora ;
    private ArrayList<String> bananaBean ;
    private ArrayList<String> hasteSuporteDeReacaoTraseira ;

    private ArrayList<String> eixoCardan ;

    private ArrayList<String> pneus ;
    private ArrayList<String> rodas ;

    private ArrayList<String> caixaDeDirecao ;
    private ArrayList<String> suporteDaCaixa ;
    private ArrayList<String> bracoTerminalDaCaixa ;
    private ArrayList<String> amortecedorDirecao ;
    private ArrayList<String> eixoDianteiro ;
    private ArrayList<String> rolamentoDaMangaDoEixo ;
    private ArrayList<String> parafusoDoBatenteDaManga ;
    private ArrayList<String> bracoDoEixoDianteiro ;
    private ArrayList<String> terminaisDaBarraLonga ;
    private ArrayList<String> bracoIntermediario ;
    private ArrayList<String> hasteSuporteDeReacao ;

    private ArrayList<String> tanqueDeCombustivel ;
    private ArrayList<String> cintaSuporteDoTanque ;
    private ArrayList<String> estruturaDosDegraus ;
    private ArrayList<String> chassisEPlataforma ;
    private ArrayList<String> sistemaSegurancaDoCintoMotoristaEBloqueioPortas ;

    public GrupoA(){

        valvulaPedal  = new ArrayList<>();
        almofadaPedal  = new ArrayList<>();
        freioDeEstacionamento  = new ArrayList<>();
        varaoDoFreioDeMao  = new ArrayList<>();
        catracasAutomaticaMecanica  = new ArrayList<>();
        pinoDaCatraca  = new ArrayList<>();
        lonasDeFreio  = new ArrayList<>();
        cilindrosPneumaticos  = new ArrayList<>();
        servoDoFreio  = new ArrayList<>();
        cilindroDeRoda  = new ArrayList<>();
        cilintroMestre  = new ArrayList<>();
        flexivelDaRoda  = new ArrayList<>();
        valvulasTubularReservatorio  = new ArrayList<>();

        amortecedor  = new ArrayList<>();
        suporteDoAmortecedor  = new ArrayList<>();
        buchaDoAmortecedor  = new ArrayList<>();
        feixeDeMolas  = new ArrayList<>();
        buchaDasMolas  = new ArrayList<>();
        espigaoDasMolas  = new ArrayList<>();
        grampoDasMolas  = new ArrayList<>();
        suporteDasMolas  = new ArrayList<>();
        algema  = new ArrayList<>();
        pinoDoSuporteDaMola  = new ArrayList<>();
        molaHelicoidal  = new ArrayList<>();
        suporteEParafusoDaMolaHelicoidal  = new ArrayList<>();
        bolsaoDeAr  = new ArrayList<>();
        valvulaDeNivel  = new ArrayList<>();
        barraEstabilizadora  = new ArrayList<>();
        buchaDaBarraEstabilizadora  = new ArrayList<>();
        bananaBean  = new ArrayList<>();
        hasteSuporteDeReacaoTraseira  = new ArrayList<>();

        eixoCardan  = new ArrayList<>();

        pneus  = new ArrayList<>();
        rodas  = new ArrayList<>();

        caixaDeDirecao  = new ArrayList<>();
        suporteDaCaixa  = new ArrayList<>();
        bracoTerminalDaCaixa  = new ArrayList<>();
        amortecedorDirecao  = new ArrayList<>();
        eixoDianteiro  = new ArrayList<>();
        rolamentoDaMangaDoEixo  = new ArrayList<>();
        parafusoDoBatenteDaManga  = new ArrayList<>();
        bracoDoEixoDianteiro  = new ArrayList<>();
        terminaisDaBarraLonga  = new ArrayList<>();
        bracoIntermediario  = new ArrayList<>();
        hasteSuporteDeReacao  = new ArrayList<>();

        tanqueDeCombustivel  = new ArrayList<>();
        cintaSuporteDoTanque  = new ArrayList<>();
        estruturaDosDegraus  = new ArrayList<>();
        chassisEPlataforma  = new ArrayList<>();
        sistemaSegurancaDoCintoMotoristaEBloqueioPortas  = new ArrayList<>();

    }

    public ArrayList<String> getValvulaPedal() {
        return valvulaPedal;
    }

    public void setValvulaPedal(ArrayList<String> valvulaPedal) {
        this.valvulaPedal = valvulaPedal;
    }

    public ArrayList<String> getAlmofadaPedal() {
        return almofadaPedal;
    }

    public void setAlmofadaPedal(ArrayList<String> almofadaPedal) {
        this.almofadaPedal = almofadaPedal;
    }

    public ArrayList<String> getFreioDeEstacionamento() {
        return freioDeEstacionamento;
    }

    public void setFreioDeEstacionamento(ArrayList<String> freioDeEstacionamento) {
        this.freioDeEstacionamento = freioDeEstacionamento;
    }

    public ArrayList<String> getVaraoDoFreioDeMao() {
        return varaoDoFreioDeMao;
    }

    public void setVaraoDoFreioDeMao(ArrayList<String> varaoDoFreioDeMao) {
        this.varaoDoFreioDeMao = varaoDoFreioDeMao;
    }

    public ArrayList<String> getCatracasAutomaticaMecanica() {
        return catracasAutomaticaMecanica;
    }

    public void setCatracasAutomaticaMecanica(ArrayList<String> catracasAutomaticaMecanica) {
        this.catracasAutomaticaMecanica = catracasAutomaticaMecanica;
    }

    public ArrayList<String> getPinoDaCatraca() {
        return pinoDaCatraca;
    }

    public void setPinoDaCatraca(ArrayList<String> pinoDaCatraca) {
        this.pinoDaCatraca = pinoDaCatraca;
    }

    public ArrayList<String> getLonasDeFreio() {
        return lonasDeFreio;
    }

    public void setLonasDeFreio(ArrayList<String> lonasDeFreio) {
        this.lonasDeFreio = lonasDeFreio;
    }

    public ArrayList<String> getCilindrosPneumaticos() {
        return cilindrosPneumaticos;
    }

    public void setCilindrosPneumaticos(ArrayList<String> cilindrosPneumaticos) {
        this.cilindrosPneumaticos = cilindrosPneumaticos;
    }

    public ArrayList<String> getServoDoFreio() {
        return servoDoFreio;
    }

    public void setServoDoFreio(ArrayList<String> servoDoFreio) {
        this.servoDoFreio = servoDoFreio;
    }

    public ArrayList<String> getCilindroDeRoda() {
        return cilindroDeRoda;
    }

    public void setCilindroDeRoda(ArrayList<String> cilindroDeRoda) {
        this.cilindroDeRoda = cilindroDeRoda;
    }

    public ArrayList<String> getCilintroMestre() {
        return cilintroMestre;
    }

    public void setCilintroMestre(ArrayList<String> cilintroMestre) {
        this.cilintroMestre = cilintroMestre;
    }

    public ArrayList<String> getFlexivelDaRoda() {
        return flexivelDaRoda;
    }

    public void setFlexivelDaRoda(ArrayList<String> flexivelDaRoda) {
        this.flexivelDaRoda = flexivelDaRoda;
    }

    public ArrayList<String> getValvulasTubularReservatorio() {
        return valvulasTubularReservatorio;
    }

    public void setValvulasTubularReservatorio(ArrayList<String> valvulasTubularReservatorio) {
        this.valvulasTubularReservatorio = valvulasTubularReservatorio;
    }

    public ArrayList<String> getAmortecedor() {
        return amortecedor;
    }

    public void setAmortecedor(ArrayList<String> amortecedor) {
        this.amortecedor = amortecedor;
    }

    public ArrayList<String> getSuporteDoAmortecedor() {
        return suporteDoAmortecedor;
    }

    public void setSuporteDoAmortecedor(ArrayList<String> suporteDoAmortecedor) {
        this.suporteDoAmortecedor = suporteDoAmortecedor;
    }

    public ArrayList<String> getBuchaDoAmortecedor() {
        return buchaDoAmortecedor;
    }

    public void setBuchaDoAmortecedor(ArrayList<String> buchaDoAmortecedor) {
        this.buchaDoAmortecedor = buchaDoAmortecedor;
    }

    public ArrayList<String> getFeixeDeMolas() {
        return feixeDeMolas;
    }

    public void setFeixeDeMolas(ArrayList<String> feixeDeMolas) {
        this.feixeDeMolas = feixeDeMolas;
    }

    public ArrayList<String> getBuchaDasMolas() {
        return buchaDasMolas;
    }

    public void setBuchaDasMolas(ArrayList<String> buchaDasMolas) {
        this.buchaDasMolas = buchaDasMolas;
    }

    public ArrayList<String> getEspigaoDasMolas() {
        return espigaoDasMolas;
    }

    public void setEspigaoDasMolas(ArrayList<String> espigaoDasMolas) {
        this.espigaoDasMolas = espigaoDasMolas;
    }

    public ArrayList<String> getGrampoDasMolas() {
        return grampoDasMolas;
    }

    public void setGrampoDasMolas(ArrayList<String> grampoDasMolas) {
        this.grampoDasMolas = grampoDasMolas;
    }

    public ArrayList<String> getSuporteDasMolas() {
        return suporteDasMolas;
    }

    public void setSuporteDasMolas(ArrayList<String> suporteDasMolas) {
        this.suporteDasMolas = suporteDasMolas;
    }

    public ArrayList<String> getAlgema() {
        return algema;
    }

    public void setAlgema(ArrayList<String> algema) {
        this.algema = algema;
    }

    public ArrayList<String> getPinoDoSuporteDaMola() {
        return pinoDoSuporteDaMola;
    }

    public void setPinoDoSuporteDaMola(ArrayList<String> pinoDoSuporteDaMola) {
        this.pinoDoSuporteDaMola = pinoDoSuporteDaMola;
    }

    public ArrayList<String> getMolaHelicoidal() {
        return molaHelicoidal;
    }

    public void setMolaHelicoidal(ArrayList<String> molaHelicoidal) {
        this.molaHelicoidal = molaHelicoidal;
    }

    public ArrayList<String> getSuporteEParafusoDaMolaHelicoidal() {
        return suporteEParafusoDaMolaHelicoidal;
    }

    public void setSuporteEParafusoDaMolaHelicoidal(ArrayList<String> suporteEParafusoDaMolaHelicoidal) {
        this.suporteEParafusoDaMolaHelicoidal = suporteEParafusoDaMolaHelicoidal;
    }

    public ArrayList<String> getBolsaoDeAr() {
        return bolsaoDeAr;
    }

    public void setBolsaoDeAr(ArrayList<String> bolsaoDeAr) {
        this.bolsaoDeAr = bolsaoDeAr;
    }

    public ArrayList<String> getValvulaDeNivel() {
        return valvulaDeNivel;
    }

    public void setValvulaDeNivel(ArrayList<String> valvulaDeNivel) {
        this.valvulaDeNivel = valvulaDeNivel;
    }

    public ArrayList<String> getBarraEstabilizadora() {
        return barraEstabilizadora;
    }

    public void setBarraEstabilizadora(ArrayList<String> barraEstabilizadora) {
        this.barraEstabilizadora = barraEstabilizadora;
    }

    public ArrayList<String> getBuchaDaBarraEstabilizadora() {
        return buchaDaBarraEstabilizadora;
    }

    public void setBuchaDaBarraEstabilizadora(ArrayList<String> buchaDaBarraEstabilizadora) {
        this.buchaDaBarraEstabilizadora = buchaDaBarraEstabilizadora;
    }

    public ArrayList<String> getBananaBean() {
        return bananaBean;
    }

    public void setBananaBean(ArrayList<String> bananaBean) {
        this.bananaBean = bananaBean;
    }

    public ArrayList<String> getHasteSuporteDeReacaoTraseira() {
        return hasteSuporteDeReacaoTraseira;
    }

    public void setHasteSuporteDeReacaoTraseira(ArrayList<String> hasteSuporteDeReacaoTraseira) {
        this.hasteSuporteDeReacaoTraseira = hasteSuporteDeReacaoTraseira;
    }

    public ArrayList<String> getEixoCardan() {
        return eixoCardan;
    }

    public void setEixoCardan(ArrayList<String> eixoCardan) {
        this.eixoCardan = eixoCardan;
    }

    public ArrayList<String> getPneus() {
        return pneus;
    }

    public void setPneus(ArrayList<String> pneus) {
        this.pneus = pneus;
    }

    public ArrayList<String> getRodas() {
        return rodas;
    }

    public void setRodas(ArrayList<String> rodas) {
        this.rodas = rodas;
    }

    public ArrayList<String> getCaixaDeDirecao() {
        return caixaDeDirecao;
    }

    public void setCaixaDeDirecao(ArrayList<String> caixaDeDirecao) {
        this.caixaDeDirecao = caixaDeDirecao;
    }

    public ArrayList<String> getSuporteDaCaixa() {
        return suporteDaCaixa;
    }

    public void setSuporteDaCaixa(ArrayList<String> suporteDaCaixa) {
        this.suporteDaCaixa = suporteDaCaixa;
    }

    public ArrayList<String> getBracoTerminalDaCaixa() {
        return bracoTerminalDaCaixa;
    }

    public void setBracoTerminalDaCaixa(ArrayList<String> bracoTerminalDaCaixa) {
        this.bracoTerminalDaCaixa = bracoTerminalDaCaixa;
    }

    public ArrayList<String> getAmortecedorDirecao() {
        return amortecedorDirecao;
    }

    public void setAmortecedorDirecao(ArrayList<String> amortecedorDirecao) {
        this.amortecedorDirecao = amortecedorDirecao;
    }

    public ArrayList<String> getEixoDianteiro() {
        return eixoDianteiro;
    }

    public void setEixoDianteiro(ArrayList<String> eixoDianteiro) {
        this.eixoDianteiro = eixoDianteiro;
    }

    public ArrayList<String> getRolamentoDaMangaDoEixo() {
        return rolamentoDaMangaDoEixo;
    }

    public void setRolamentoDaMangaDoEixo(ArrayList<String> rolamentoDaMangaDoEixo) {
        this.rolamentoDaMangaDoEixo = rolamentoDaMangaDoEixo;
    }

    public ArrayList<String> getParafusoDoBatenteDaManga() {
        return parafusoDoBatenteDaManga;
    }

    public void setParafusoDoBatenteDaManga(ArrayList<String> parafusoDoBatenteDaManga) {
        this.parafusoDoBatenteDaManga = parafusoDoBatenteDaManga;
    }

    public ArrayList<String> getBracoDoEixoDianteiro() {
        return bracoDoEixoDianteiro;
    }

    public void setBracoDoEixoDianteiro(ArrayList<String> bracoDoEixoDianteiro) {
        this.bracoDoEixoDianteiro = bracoDoEixoDianteiro;
    }

    public ArrayList<String> getTerminaisDaBarraLonga() {
        return terminaisDaBarraLonga;
    }

    public void setTerminaisDaBarraLonga(ArrayList<String> terminaisDaBarraLonga) {
        this.terminaisDaBarraLonga = terminaisDaBarraLonga;
    }

    public ArrayList<String> getBracoIntermediario() {
        return bracoIntermediario;
    }

    public void setBracoIntermediario(ArrayList<String> bracoIntermediario) {
        this.bracoIntermediario = bracoIntermediario;
    }

    public ArrayList<String> getHasteSuporteDeReacao() {
        return hasteSuporteDeReacao;
    }

    public void setHasteSuporteDeReacao(ArrayList<String> hasteSuporteDeReacao) {
        this.hasteSuporteDeReacao = hasteSuporteDeReacao;
    }

    public ArrayList<String> getTanqueDeCombustivel() {
        return tanqueDeCombustivel;
    }

    public void setTanqueDeCombustivel(ArrayList<String> tanqueDeCombustivel) {
        this.tanqueDeCombustivel = tanqueDeCombustivel;
    }

    public ArrayList<String> getCintaSuporteDoTanque() {
        return cintaSuporteDoTanque;
    }

    public void setCintaSuporteDoTanque(ArrayList<String> cintaSuporteDoTanque) {
        this.cintaSuporteDoTanque = cintaSuporteDoTanque;
    }

    public ArrayList<String> getEstruturaDosDegraus() {
        return estruturaDosDegraus;
    }

    public void setEstruturaDosDegraus(ArrayList<String> estruturaDosDegraus) {
        this.estruturaDosDegraus = estruturaDosDegraus;
    }

    public ArrayList<String> getChassisEPlataforma() {
        return chassisEPlataforma;
    }

    public void setChassisEPlataforma(ArrayList<String> chassisEPlataforma) {
        this.chassisEPlataforma = chassisEPlataforma;
    }

    public ArrayList<String> getSistemaSegurancaDoCintoMotoristaEBloqueioPortas() {
        return sistemaSegurancaDoCintoMotoristaEBloqueioPortas;
    }

    public void setSistemaSegurancaDoCintoMotoristaEBloqueioPortas(ArrayList<String> sistemaSegurancaDoCintoMotoristaEBloqueioPortas) {
        this.sistemaSegurancaDoCintoMotoristaEBloqueioPortas = sistemaSegurancaDoCintoMotoristaEBloqueioPortas;
    }
}

