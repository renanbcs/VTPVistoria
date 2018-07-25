package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GrupoA extends Inspecao {

    //Atributos
    private Long idFicha;

    private Boolean valvulaPedalVazando = false;
    private Boolean valvulaPedalContaminada = false;

    private Boolean almofadaPedalGasta = false;
    private Boolean almofadaPedalFalta = false;

    public GrupoA() {
    }

    public void salvar(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("fichaA").child(String.valueOf(getIdFicha())).setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap(){
        HashMap<String, Object> hashMapFichaA = new HashMap<>();

        hashMapFichaA.put("idFicha",getIdFicha());
        hashMapFichaA.put("valvulaPedalVazando",getValvulaPedalVazando());
        hashMapFichaA.put("valvulaPedalContaminada",getValvulaPedalContaminada());
        hashMapFichaA.put("almofadaPedalGasta",getAlmofadaPedalGasta());
        hashMapFichaA.put("almofadaPedalFalta",getAlmofadaPedalFalta());

        return hashMapFichaA;
    }


    public Long getIdFicha(){
        return idFicha;
    }

    public void setIdFicha(Long idFicha){
        this.idFicha=idFicha;
    }

    public Boolean getValvulaPedalVazando(){
        return valvulaPedalVazando;
    }

    public void setValvulaPedalVazando(Boolean valvulaPedalVazando){
        this.valvulaPedalVazando=valvulaPedalVazando;
    }

    public Boolean getValvulaPedalContaminada(){
        return valvulaPedalContaminada;
    }

    public void setValvulaPedalContaminada(Boolean valvulaPedalContaminada){
        this.valvulaPedalContaminada=valvulaPedalContaminada;
    }

    public Boolean getAlmofadaPedalGasta(){
        return almofadaPedalGasta;
    }

    public void setAlmofadaPedalGasta(Boolean almofadaPedalGasta){
        this.almofadaPedalGasta=almofadaPedalGasta;
    }

    public Boolean getAlmofadaPedalFalta(){
        return almofadaPedalFalta;
    }

    public void setAlmofadaPedalFalta(Boolean almofadaPedalFalta){
        this.almofadaPedalFalta=almofadaPedalFalta;
    }







}

