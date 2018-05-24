package com.vtpvistorias_tcc.config;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public final class ConfiguracaoFirebase {

    private static DatabaseReference referenciaFirebase;

    //Metodo para pegar a referencia do firebase
    public static DatabaseReference getFirebase(){

        //caso ela não exista ira criar
        if(referenciaFirebase==null) {

            referenciaFirebase = FirebaseDatabase.getInstance().getReference();
        }

        return referenciaFirebase;

    }
}
