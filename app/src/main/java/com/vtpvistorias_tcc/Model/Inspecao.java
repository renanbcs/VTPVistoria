package com.vtpvistorias_tcc.Model;

import android.text.method.DateTimeKeyListener;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Inspecao implements Serializable {
    //Atributos
    private Long idInspecao;
    private String dataHoraRegistro;
    private GrupoA grupoA;
    private GrupoB grupoB;
    private GrupoA1 grupoA1;
    private String titulo;
    private Veiculo veiculo;

    public Inspecao(){

    }

    public Inspecao(Long idInspecao, String dataHoraRegistro){
        this.idInspecao=idInspecao;
        this.dataHoraRegistro=dataHoraRegistro;
    }

    public void salvar(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Inspecao").push().setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap(){
        HashMap<String, Object> hashMapInspecao = new HashMap<>();

        hashMapInspecao.put("idInspecao",getIdInspecao());
        hashMapInspecao.put("dataHoraRegistro",getDataHoraRegistro());

        if(getGrupoA() != null){
            hashMapInspecao.put("grupoA",getGrupoA());
        }
        if(getGrupoB() != null){
            hashMapInspecao.put("grupoB",getGrupoB());
        }
        if(getGrupoA1() != null){
            hashMapInspecao.put("grupoA1",getGrupoA1());
        }

        return hashMapInspecao;
    }

    public Long getIdInspecao(){
        return idInspecao;
    }

    public void setIdInspecao(Long idInspecao){
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}




