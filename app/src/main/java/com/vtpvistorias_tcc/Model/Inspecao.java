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
    private Date dataHoraRegistro;
    private GrupoA grupoA;
    private GrupoB grupoB;
    private GrupoC grupoC;
    private String titulo;

    public Inspecao(){

    }

    public Inspecao(Long idInspecao, Date dataHoraRegistro){
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
            System.out.print("Passei aqui");
        }
        if(getGrupoB() != null){
            hashMapInspecao.put("grupoB",getGrupoB());
        }
        if(getGrupoC() != null){
            hashMapInspecao.put("grupoC",getGrupoC());
        }

        return hashMapInspecao;
    }

    public Long getIdInspecao(){
        return idInspecao;
    }

    public void setIdInspecao(Long idInspecao){
        this.idInspecao=idInspecao;
    }

    public Date getDataHoraRegistro(){
        return dataHoraRegistro;
    }

    public void setDataHoraRegistro(Date dataHoraRegistro){
        this.dataHoraRegistro=dataHoraRegistro;
    }

    public GrupoA getGrupoA() {
        return grupoA;
    }

    public void setGrupoB(GrupoB grupoB) {
        this.grupoB = grupoB;
    }

    public void setGrupoC(GrupoC grupoC) {
        this.grupoC = grupoC;
    }

    public void setGrupoA(GrupoA grupoA) {
        this.grupoA = grupoA;
    }

    public GrupoB getGrupoB() {
        return grupoB;
    }

    public GrupoC getGrupoC() {
        return grupoC;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}




