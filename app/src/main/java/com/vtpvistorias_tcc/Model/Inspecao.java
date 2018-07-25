package com.vtpvistorias_tcc.Model;

import android.text.method.DateTimeKeyListener;

import java.io.Serializable;
import java.util.Date;

public class Inspecao implements Serializable {
    //Atributos
    private Long idInspecao;
    private Date dataHoraRegistro;

    public Inspecao(){

    }

    public Inspecao(Long idInspecao, Date dataHoraRegistro){
        this.idInspecao=idInspecao;
        this.dataHoraRegistro=dataHoraRegistro;
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

}




