package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Inspecao implements Serializable {
    //Atributos
    private String idInspecao;
    private String dataHoraRegistro;
    private GrupoA grupoA;
    private GrupoB grupoB;
    private GrupoA1 grupoA1;
    private Veiculo veiculo;
    private String justificativa;
    private String resultado;
    private Inspetor inspetor;

    public Inspecao(){

    }

    public Inspecao(String idInspecao, String dataHoraRegistro){
        this.idInspecao=idInspecao;
        this.dataHoraRegistro=dataHoraRegistro;
    }

    public void salvar(){

        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Inspecao").push().setValue(this);

    }

    public String getIdInspecao(){
        return idInspecao;
    }

    public void setIdInspecao(String idInspecao){
        this.idInspecao=idInspecao;
    }

    public String getDataHoraRegistro(){
        return dataHoraRegistro;
    }

    public void setDataHoraRegistro(String dataHoraRegistro){
        this.dataHoraRegistro=dataHoraRegistro;
    }

    public GrupoA getGrupoA() {
        return grupoA;
    }

    public void setGrupoB(GrupoB grupoB) {
        this.grupoB = grupoB;
    }

    public void setGrupoA1(GrupoA1 grupoA1) {
        this.grupoA1 = grupoA1;
    }

    public void setGrupoA(GrupoA grupoA) {
        this.grupoA = grupoA;
    }

    public GrupoB getGrupoB() {
        return grupoB;
    }

    public GrupoA1 getGrupoA1() {
        return grupoA1;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Inspetor getInspetor() {
        return inspetor;
    }

    public void setInspetor(Inspetor inspetor) {
        this.inspetor = inspetor;
    }
}




