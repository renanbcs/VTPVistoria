package com.vtpvistorias_tcc.Model;

import java.io.Serializable;
import java.util.ArrayList;


public class GrupoA1 implements Serializable{

    private ArrayList<String> tacografo ;
    private ArrayList<String> piso ;
    private ArrayList<String> quebraSol ;
    private ArrayList<String> desembacadorParaBrisa ;
    private ArrayList<String> bancosAltosSimples ;
    private ArrayList<String> radioComunicacao ;
    private ArrayList<String> brakeLight ;
    private ArrayList<String> comunicacaoVisualInternaAdesivos ;

    private ArrayList<String> areaParaCadeiraDeRodas ;
    private ArrayList<String> areaParaManobras ;
    private ArrayList<String> portas ;
    private ArrayList<String> elevador ;
    private ArrayList<String> itensDeSeguranca ;

    public GrupoA1() {

        tacografo = new ArrayList<>();
        piso = new ArrayList<>();
        quebraSol = new ArrayList<>();
        desembacadorParaBrisa = new ArrayList<>();
        bancosAltosSimples = new ArrayList<>();
        radioComunicacao = new ArrayList<>();
        brakeLight = new ArrayList<>();
        comunicacaoVisualInternaAdesivos = new ArrayList<>();

        areaParaCadeiraDeRodas = new ArrayList<>();
        areaParaManobras = new ArrayList<>();
        portas = new ArrayList<>();
        elevador = new ArrayList<>();
        itensDeSeguranca = new ArrayList<>();

    }

    public ArrayList<String> getTacografo() {
        return tacografo;
    }

    public void setTacografo(ArrayList<String> tacografo) {
        this.tacografo = tacografo;
    }

    public ArrayList<String> getPiso() {
        return piso;
    }

    public void setPiso(ArrayList<String> piso) {
        this.piso = piso;
    }

    public ArrayList<String> getQuebraSol() {
        return quebraSol;
    }

    public void setQuebraSol(ArrayList<String> quebraSol) {
        this.quebraSol = quebraSol;
    }

    public ArrayList<String> getDesembacadorParaBrisa() {
        return desembacadorParaBrisa;
    }

    public void setDesembacadorParaBrisa(ArrayList<String> desembacadorParaBrisa) {
        this.desembacadorParaBrisa = desembacadorParaBrisa;
    }

    public ArrayList<String> getBancosAltosSimples() {
        return bancosAltosSimples;
    }

    public void setBancosAltosSimples(ArrayList<String> bancosAltosSimples) {
        this.bancosAltosSimples = bancosAltosSimples;
    }

    public ArrayList<String> getRadioComunicacao() {
        return radioComunicacao;
    }

    public void setRadioComunicacao(ArrayList<String> radioComunicacao) {
        this.radioComunicacao = radioComunicacao;
    }

    public ArrayList<String> getBrakeLight() {
        return brakeLight;
    }

    public void setBrakeLight(ArrayList<String> brakeLight) {
        this.brakeLight = brakeLight;
    }

    public ArrayList<String> getComunicacaoVisualInternaAdesivos() {
        return comunicacaoVisualInternaAdesivos;
    }

    public void setComunicacaoVisualInternaAdesivos(ArrayList<String> comunicacaoVisualInternaAdesivos) {
        this.comunicacaoVisualInternaAdesivos = comunicacaoVisualInternaAdesivos;
    }

    public ArrayList<String> getAreaParaCadeiraDeRodas() {
        return areaParaCadeiraDeRodas;
    }

    public void setAreaParaCadeiraDeRodas(ArrayList<String> areaParaCadeiraDeRodas) {
        this.areaParaCadeiraDeRodas = areaParaCadeiraDeRodas;
    }

    public ArrayList<String> getAreaParaManobras() {
        return areaParaManobras;
    }

    public void setAreaParaManobras(ArrayList<String> areaParaManobras) {
        this.areaParaManobras = areaParaManobras;
    }

    public ArrayList<String> getPortas() {
        return portas;
    }

    public void setPortas(ArrayList<String> portas) {
        this.portas = portas;
    }

    public ArrayList<String> getElevador() {
        return elevador;
    }

    public void setElevador(ArrayList<String> elevador) {
        this.elevador = elevador;
    }

    public ArrayList<String> getItensDeSeguranca() {
        return itensDeSeguranca;
    }

    public void setItensDeSeguranca(ArrayList<String> itensDeSeguranca) {
        this.itensDeSeguranca = itensDeSeguranca;
    }
}