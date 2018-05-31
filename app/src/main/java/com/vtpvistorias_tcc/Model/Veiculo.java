package com.vtpvistorias_tcc.Model;

import com.vtpvistorias_tcc.R;

import java.io.Serializable;

public class Veiculo implements Serializable{

    //Atributos

    private int prefixo;
    private boolean bloqueado;
    private String chassi;
    private String empresa;
    private String placa;

    public Veiculo(int prefixo, boolean bloqueado, String chassi, String empresa, String placa) {

        this.prefixo = prefixo;
        this.bloqueado = bloqueado;
        this.chassi = chassi;
        this.empresa = empresa;
        this.placa = placa;

    }

    public Veiculo(){


    }

    //Get´s
    public int getPrefixo() {
        return prefixo;
    }

    public String isBloqueado() {

        if(bloqueado == true) return "Sim";
        else return "Não";

    }

    public String getChassi() {
        return chassi;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getPlaca() {
        return placa;
    }

    //Set's

    public void setPrefixo(String prefixo) { this.prefixo = Integer.parseInt(prefixo); }

    public void setBloqueado(String bloqueado) {

        if(bloqueado.equals("Sim"))this.bloqueado = true;
        else this.bloqueado = false;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
