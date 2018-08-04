package com.vtpvistorias_tcc.Model;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Exclude;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.HashMap;
import java.util.Map;

public class GrupoB extends Inspecao {

    //Atributos
    private Long idFicha;
    private Boolean parabrisaQuebrado = false;
    private Boolean parabrisaSolto = false;
    private Boolean parabrisaTrincado = false;

    public GrupoB() {
    }

    public void salvar(){
        DatabaseReference referenciaFiReference = ConfiguracaoFirebase.getFirebase();
        referenciaFiReference.child("Grupo B").push().setValue(this);
    }

    @Exclude

    public Map<String, Object> toMap(){
        HashMap<String, Object> hashMapFichaB = new HashMap<>();

        //hashMapFichaB.put("idFicha",getIdFicha());
        hashMapFichaB.put("parabrisaQuebrado", getParabrisaQuebrado());
        hashMapFichaB.put("parabrisaSolto",getParabrisaSolto());

        return hashMapFichaB;
    }


    public Long getIdFicha(){
        return idFicha;
    }

    public void setIdFicha(Long idFicha){
        this.idFicha=idFicha;
    }

    public Boolean getParabrisaQuebrado() {
        return parabrisaQuebrado;
    }

    public void setParabrisaQuebrado(Boolean parabrisaQuebrado) {
        this.parabrisaQuebrado = parabrisaQuebrado;
    }

    public Boolean getParabrisaSolto() {
        return parabrisaSolto;
    }

    public void setParabrisaSolto(Boolean parabrisaSolto) {
        this.parabrisaSolto = parabrisaSolto;
    }

    public Boolean getParabrisaTrincado() {
        return parabrisaTrincado;
    }

    public void setParabrisaTrincado(Boolean parabrisaTrincado) {
        this.parabrisaTrincado = parabrisaTrincado;
    }
}

