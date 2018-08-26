package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Veiculo implements Serializable{

    //Atributos

    private String prefixo;
    private boolean bloqueado;
    private String chassi;
    private String empresa;
    private String placa;
    private String id;

    public Veiculo(String prefixo, boolean bloqueado, String chassi, String empresa, String placa) {

        this.prefixo = prefixo;
        this.bloqueado = bloqueado;
        this.chassi = chassi;
        this.empresa = empresa;
        this.placa = placa;

    }

    public Veiculo(){


    }

    public void update(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Veiculos").child(getId()).setValue(this);
    }

    //Get´s
    public String getPrefixo() {
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


    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
