package com.vtpvistorias_tcc.Model;

public class Veiculo {

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

    //Get´s
    public int getPrefixo() {
        return prefixo;
    }

    public boolean isBloqueado() {
        return bloqueado;
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

    public void setPrefixo(int prefixo) {
        this.prefixo = prefixo;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
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
