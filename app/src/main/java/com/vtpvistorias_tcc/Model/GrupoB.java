package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GrupoB extends Inspecao {

    private ArrayList<String> paraBrisa ;
    private ArrayList<String> vidroTraseiro ;
    private ArrayList<String> estrutura ;
    private ArrayList<String> oculos ;
    private ArrayList<String> revestimentoExternoChaparia ;
    private ArrayList<String> bancos ;
    private ArrayList<String> bancosPassageiros ;
    private ArrayList<String> sistemasDePortasMancal ;
    private ArrayList<String> folhasDasPortasRevestimento ;
    private ArrayList<String> borrachaDasPortas ;
    private ArrayList<String> tampaoPistaoDasPortas ;
    private ArrayList<String> cilindroDasPortas ;
    private ArrayList<String> janelaLateralDoMotorista ;
    private ArrayList<String> quadroDaJanela ;
    private ArrayList<String> separadorLimitadorPuxador ;
    private ArrayList<String> parachoquePonteira ;
    private ArrayList<String> espelhosRetrovisoresConvexos ;
    private ArrayList<String> limpadorParaBrisa ;
    private ArrayList<String> limpeza ;

    private ArrayList<String> caixaDeItinerario ;
    private ArrayList<String> iluminacaoSalaoInterna ;
    private ArrayList<String> solicitacaoDeParada ;
    private ArrayList<String> luzDoDegrau ;

    private ArrayList<String> comandosDoPainel ;
    private ArrayList<String> chaveDeSetaBuzina ;

    private ArrayList<String> degraus ;
    private ArrayList<String> piso ;
    private ArrayList<String> tampaDeInspecao ;
    private ArrayList<String> tampaDoMotor ;
    private ArrayList<String> revestimentoInterno ;
    private ArrayList<String> balaustres ;
    private ArrayList<String> derrapante ;
    private ArrayList<String> postoDeCobranca ;
    private ArrayList<String> escotilhasECupulas ;
    private ArrayList<String> saidaDeEmergencia ;

    private ArrayList<String> faroisOculos ;
    private ArrayList<String> luzesDeSetaEDeEmergencia ;
    private ArrayList<String> lanternasLentes ;
    private ArrayList<String> luzesDelimitadorasVigiasLentes ;
    private ArrayList<String> luzDoFreioLentes ;
    private ArrayList<String> brakeLight ;
    private ArrayList<String> luzDeRe ;
    private ArrayList<String> luzDaPlaca ;

    private ArrayList<String> partida ;

    private ArrayList<String> extintor ;
    private ArrayList<String> triangulo ;

    private ArrayList<String> silencioso ;
    private ArrayList<String> tuboDeDescarga ;
    private ArrayList<String> protecaoTuboDescarga ;
    private ArrayList<String> articulacao ;
    private ArrayList<String> vazamentoExcessivo ;


    public GrupoB(){

        paraBrisa  = new ArrayList<>();
        vidroTraseiro  = new ArrayList<>();
        estrutura  = new ArrayList<>();
        oculos  = new ArrayList<>();
        revestimentoExternoChaparia  = new ArrayList<>();
        bancos  = new ArrayList<>();
        bancosPassageiros  = new ArrayList<>();
        sistemasDePortasMancal  = new ArrayList<>();
        folhasDasPortasRevestimento  = new ArrayList<>();
        borrachaDasPortas  = new ArrayList<>();
        tampaoPistaoDasPortas  = new ArrayList<>();
        cilindroDasPortas  = new ArrayList<>();
        janelaLateralDoMotorista  = new ArrayList<>();
        quadroDaJanela  = new ArrayList<>();
        separadorLimitadorPuxador  = new ArrayList<>();
        parachoquePonteira  = new ArrayList<>();
        espelhosRetrovisoresConvexos  = new ArrayList<>();
        limpadorParaBrisa  = new ArrayList<>();
        limpeza  = new ArrayList<>();

        caixaDeItinerario  = new ArrayList<>();
        iluminacaoSalaoInterna  = new ArrayList<>();
        solicitacaoDeParada  = new ArrayList<>();
        luzDoDegrau  = new ArrayList<>();

        comandosDoPainel  = new ArrayList<>();
        chaveDeSetaBuzina  = new ArrayList<>();

        degraus  = new ArrayList<>();
        piso  = new ArrayList<>();
        tampaDeInspecao  = new ArrayList<>();
        tampaDoMotor  = new ArrayList<>();
        revestimentoInterno  = new ArrayList<>();
        balaustres  = new ArrayList<>();
        derrapante  = new ArrayList<>();
        postoDeCobranca  = new ArrayList<>();
        escotilhasECupulas  = new ArrayList<>();
        saidaDeEmergencia  = new ArrayList<>();

        faroisOculos  = new ArrayList<>();
        luzesDeSetaEDeEmergencia  = new ArrayList<>();
        lanternasLentes  = new ArrayList<>();
        luzesDelimitadorasVigiasLentes  = new ArrayList<>();
        luzDoFreioLentes  = new ArrayList<>();
        brakeLight  = new ArrayList<>();
        luzDeRe  = new ArrayList<>();
        luzDaPlaca  = new ArrayList<>();

        partida  = new ArrayList<>();

        extintor  = new ArrayList<>();
        triangulo  = new ArrayList<>();

        silencioso  = new ArrayList<>();
        tuboDeDescarga  = new ArrayList<>();
        protecaoTuboDescarga  = new ArrayList<>();
        articulacao  = new ArrayList<>();
        vazamentoExcessivo  = new ArrayList<>();

    }

    public ArrayList<String> getParaBrisa() {
        return paraBrisa;
    }

    public void setParaBrisa(ArrayList<String> paraBrisa) {
        this.paraBrisa = paraBrisa;
    }

    public ArrayList<String> getVidroTraseiro() {
        return vidroTraseiro;
    }

    public void setVidroTraseiro(ArrayList<String> vidroTraseiro) {
        this.vidroTraseiro = vidroTraseiro;
    }

    public ArrayList<String> getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(ArrayList<String> estrutura) {
        this.estrutura = estrutura;
    }

    public ArrayList<String> getOculos() {
        return oculos;
    }

    public void setOculos(ArrayList<String> oculos) {
        this.oculos = oculos;
    }

    public ArrayList<String> getRevestimentoExternoChaparia() {
        return revestimentoExternoChaparia;
    }

    public void setRevestimentoExternoChaparia(ArrayList<String> revestimentoExternoChaparia) {
        this.revestimentoExternoChaparia = revestimentoExternoChaparia;
    }

    public ArrayList<String> getBancos() {
        return bancos;
    }

    public void setBancos(ArrayList<String> bancos) {
        this.bancos = bancos;
    }

    public ArrayList<String> getBancosPassageiros() {
        return bancosPassageiros;
    }

    public void setBancosPassageiros(ArrayList<String> bancosPassageiros) {
        this.bancosPassageiros = bancosPassageiros;
    }

    public ArrayList<String> getSistemasDePortasMancal() {
        return sistemasDePortasMancal;
    }

    public void setSistemasDePortasMancal(ArrayList<String> sistemasDePortasMancal) {
        this.sistemasDePortasMancal = sistemasDePortasMancal;
    }

    public ArrayList<String> getFolhasDasPortasRevestimento() {
        return folhasDasPortasRevestimento;
    }

    public void setFolhasDasPortasRevestimento(ArrayList<String> folhasDasPortasRevestimento) {
        this.folhasDasPortasRevestimento = folhasDasPortasRevestimento;
    }

    public ArrayList<String> getBorrachaDasPortas() {
        return borrachaDasPortas;
    }

    public void setBorrachaDasPortas(ArrayList<String> borrachaDasPortas) {
        this.borrachaDasPortas = borrachaDasPortas;
    }

    public ArrayList<String> getTampaoPistaoDasPortas() {
        return tampaoPistaoDasPortas;
    }

    public void setTampaoPistaoDasPortas(ArrayList<String> tampaoPistaoDasPortas) {
        this.tampaoPistaoDasPortas = tampaoPistaoDasPortas;
    }

    public ArrayList<String> getCilindroDasPortas() {
        return cilindroDasPortas;
    }

    public void setCilindroDasPortas(ArrayList<String> cilindroDasPortas) {
        this.cilindroDasPortas = cilindroDasPortas;
    }

    public ArrayList<String> getJanelaLateralDoMotorista() {
        return janelaLateralDoMotorista;
    }

    public void setJanelaLateralDoMotorista(ArrayList<String> janelaLateralDoMotorista) {
        this.janelaLateralDoMotorista = janelaLateralDoMotorista;
    }

    public ArrayList<String> getQuadroDaJanela() {
        return quadroDaJanela;
    }

    public void setQuadroDaJanela(ArrayList<String> quadroDaJanela) {
        this.quadroDaJanela = quadroDaJanela;
    }

    public ArrayList<String> getSeparadorLimitadorPuxador() {
        return separadorLimitadorPuxador;
    }

    public void setSeparadorLimitadorPuxador(ArrayList<String> separadorLimitadorPuxador) {
        this.separadorLimitadorPuxador = separadorLimitadorPuxador;
    }

    public ArrayList<String> getParachoquePonteira() {
        return parachoquePonteira;
    }

    public void setParachoquePonteira(ArrayList<String> parachoquePonteira) {
        this.parachoquePonteira = parachoquePonteira;
    }

    public ArrayList<String> getEspelhosRetrovisoresConvexos() {
        return espelhosRetrovisoresConvexos;
    }

    public void setEspelhosRetrovisoresConvexos(ArrayList<String> espelhosRetrovisoresConvexos) {
        this.espelhosRetrovisoresConvexos = espelhosRetrovisoresConvexos;
    }

    public ArrayList<String> getLimpadorParaBrisa() {
        return limpadorParaBrisa;
    }

    public void setLimpadorParaBrisa(ArrayList<String> limpadorParaBrisa) {
        this.limpadorParaBrisa = limpadorParaBrisa;
    }

    public ArrayList<String> getLimpeza() {
        return limpeza;
    }

    public void setLimpeza(ArrayList<String> limpeza) {
        this.limpeza = limpeza;
    }

    public ArrayList<String> getCaixaDeItinerario() {
        return caixaDeItinerario;
    }

    public void setCaixaDeItinerario(ArrayList<String> caixaDeItinerario) {
        this.caixaDeItinerario = caixaDeItinerario;
    }

    public ArrayList<String> getIluminacaoSalaoInterna() {
        return iluminacaoSalaoInterna;
    }

    public void setIluminacaoSalaoInterna(ArrayList<String> iluminacaoSalaoInterna) {
        this.iluminacaoSalaoInterna = iluminacaoSalaoInterna;
    }

    public ArrayList<String> getSolicitacaoDeParada() {
        return solicitacaoDeParada;
    }

    public void setSolicitacaoDeParada(ArrayList<String> solicitacaoDeParada) {
        this.solicitacaoDeParada = solicitacaoDeParada;
    }

    public ArrayList<String> getLuzDoDegrau() {
        return luzDoDegrau;
    }

    public void setLuzDoDegrau(ArrayList<String> luzDoDegrau) {
        this.luzDoDegrau = luzDoDegrau;
    }

    public ArrayList<String> getComandosDoPainel() {
        return comandosDoPainel;
    }

    public void setComandosDoPainel(ArrayList<String> comandosDoPainel) {
        this.comandosDoPainel = comandosDoPainel;
    }

    public ArrayList<String> getChaveDeSetaBuzina() {
        return chaveDeSetaBuzina;
    }

    public void setChaveDeSetaBuzina(ArrayList<String> chaveDeSetaBuzina) {
        this.chaveDeSetaBuzina = chaveDeSetaBuzina;
    }

    public ArrayList<String> getDegraus() {
        return degraus;
    }

    public void setDegraus(ArrayList<String> degraus) {
        this.degraus = degraus;
    }

    public ArrayList<String> getPiso() {
        return piso;
    }

    public void setPiso(ArrayList<String> piso) {
        this.piso = piso;
    }

    public ArrayList<String> getTampaDeInspecao() {
        return tampaDeInspecao;
    }

    public void setTampaDeInspecao(ArrayList<String> tampaDeInspecao) {
        this.tampaDeInspecao = tampaDeInspecao;
    }

    public ArrayList<String> getTampaDoMotor() {
        return tampaDoMotor;
    }

    public void setTampaDoMotor(ArrayList<String> tampaDoMotor) {
        this.tampaDoMotor = tampaDoMotor;
    }

    public ArrayList<String> getRevestimentoInterno() {
        return revestimentoInterno;
    }

    public void setRevestimentoInterno(ArrayList<String> revestimentoInterno) {
        this.revestimentoInterno = revestimentoInterno;
    }

    public ArrayList<String> getBalaustres() {
        return balaustres;
    }

    public void setBalaustres(ArrayList<String> balaustres) {
        this.balaustres = balaustres;
    }

    public ArrayList<String> getDerrapante() {
        return derrapante;
    }

    public void setDerrapante(ArrayList<String> derrapante) {
        this.derrapante = derrapante;
    }

    public ArrayList<String> getPostoDeCobranca() {
        return postoDeCobranca;
    }

    public void setPostoDeCobranca(ArrayList<String> postoDeCobranca) {
        this.postoDeCobranca = postoDeCobranca;
    }

    public ArrayList<String> getEscotilhasECupulas() {
        return escotilhasECupulas;
    }

    public void setEscotilhasECupulas(ArrayList<String> escotilhasECupulas) {
        this.escotilhasECupulas = escotilhasECupulas;
    }

    public ArrayList<String> getSaidaDeEmergencia() {
        return saidaDeEmergencia;
    }

    public void setSaidaDeEmergencia(ArrayList<String> saidaDeEmergencia) {
        this.saidaDeEmergencia = saidaDeEmergencia;
    }

    public ArrayList<String> getFaroisOculos() {
        return faroisOculos;
    }

    public void setFaroisOculos(ArrayList<String> faroisOculos) {
        this.faroisOculos = faroisOculos;
    }

    public ArrayList<String> getLuzesDeSetaEDeEmergencia() {
        return luzesDeSetaEDeEmergencia;
    }

    public void setLuzesDeSetaEDeEmergencia(ArrayList<String> luzesDeSetaEDeEmergencia) {
        this.luzesDeSetaEDeEmergencia = luzesDeSetaEDeEmergencia;
    }

    public ArrayList<String> getLanternasLentes() {
        return lanternasLentes;
    }

    public void setLanternasLentes(ArrayList<String> lanternasLentes) {
        this.lanternasLentes = lanternasLentes;
    }

    public ArrayList<String> getLuzesDelimitadorasVigiasLentes() {
        return luzesDelimitadorasVigiasLentes;
    }

    public void setLuzesDelimitadorasVigiasLentes(ArrayList<String> luzesDelimitadorasVigiasLentes) {
        this.luzesDelimitadorasVigiasLentes = luzesDelimitadorasVigiasLentes;
    }

    public ArrayList<String> getLuzDoFreioLentes() {
        return luzDoFreioLentes;
    }

    public void setLuzDoFreioLentes(ArrayList<String> luzDoFreioLentes) {
        this.luzDoFreioLentes = luzDoFreioLentes;
    }

    public ArrayList<String> getBrakeLight() {
        return brakeLight;
    }

    public void setBrakeLight(ArrayList<String> brakeLight) {
        this.brakeLight = brakeLight;
    }

    public ArrayList<String> getLuzDeRe() {
        return luzDeRe;
    }

    public void setLuzDeRe(ArrayList<String> luzDeRe) {
        this.luzDeRe = luzDeRe;
    }

    public ArrayList<String> getLuzDaPlaca() {
        return luzDaPlaca;
    }

    public void setLuzDaPlaca(ArrayList<String> luzDaPlaca) {
        this.luzDaPlaca = luzDaPlaca;
    }

    public ArrayList<String> getPartida() {
        return partida;
    }

    public void setPartida(ArrayList<String> partida) {
        this.partida = partida;
    }

    public ArrayList<String> getExtintor() {
        return extintor;
    }

    public void setExtintor(ArrayList<String> extintor) {
        this.extintor = extintor;
    }

    public ArrayList<String> getTriangulo() {
        return triangulo;
    }

    public void setTriangulo(ArrayList<String> triangulo) {
        this.triangulo = triangulo;
    }

    public ArrayList<String> getSilencioso() {
        return silencioso;
    }

    public void setSilencioso(ArrayList<String> silencioso) {
        this.silencioso = silencioso;
    }

    public ArrayList<String> getTuboDeDescarga() {
        return tuboDeDescarga;
    }

    public void setTuboDeDescarga(ArrayList<String> tuboDeDescarga) {
        this.tuboDeDescarga = tuboDeDescarga;
    }

    public ArrayList<String> getProtecaoTuboDescarga() {
        return protecaoTuboDescarga;
    }

    public void setProtecaoTuboDescarga(ArrayList<String> protecaoTuboDescarga) {
        this.protecaoTuboDescarga = protecaoTuboDescarga;
    }

    public ArrayList<String> getArticulacao() {
        return articulacao;
    }

    public void setArticulacao(ArrayList<String> articulacao) {
        this.articulacao = articulacao;
    }

    public ArrayList<String> getVazamentoExcessivo() {
        return vazamentoExcessivo;
    }

    public void setVazamentoExcessivo(ArrayList<String> vazamentoExcessivo) {
        this.vazamentoExcessivo = vazamentoExcessivo;
    }

}

