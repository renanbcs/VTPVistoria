package com.vtpvistorias_tcc.activity.BuscarPorInspetor;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Inspetor;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.config.AdapterPersonalizado;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.ArrayList;
import java.util.List;


public class ListaInspetoresActivity extends AppCompatActivity {

    private DatabaseReference firebase;
    private List<Inspetor> listaInspetor;
    private Inspecao inspecao;
    private ListView listView;
    private FloatingActionButton botaoBuscar;
    private Inspetor inspetor;
    private Intent i;
    private Activity act = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_inspetores);

        listView = findViewById(R.id.listViewInspetores);

        listaInspetor = new ArrayList<>();

        firebase = ConfiguracaoFirebase.getFirebase().child("Inspetor");

        firebase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                List<String> nomes = new ArrayList<>();

                for(DataSnapshot child : dataSnapshot.getChildren()){

                    listaInspetor.add(child.getValue(Inspetor.class));

                }

                for(int a = 0;a<listaInspetor.size();a++){

                    nomes.add(listaInspetor.get(a).getNome());

                }

                AdapterPersonalizado adapter = new AdapterPersonalizado(listaInspetor,act);
                //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, nomes);
                listView.setAdapter(adapter);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int indice, long l) {

                inspetor = listaInspetor.get(indice);

                //Toast.makeText(getApplicationContext(),""+ inspetor.getNome(),Toast.LENGTH_SHORT).show();

                i = new Intent(getApplicationContext(),ListaInspecaoActivity.class);

                i.putExtra("inspetor",inspetor);

                startActivity(i);

            }
        });


    }

}
