package com.vtpvistorias_tcc.activity.BuscarPorVeiculo;

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
import com.google.firebase.database.ValueEventListener;
import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Inspetor;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.BuscarPorInspetor.ListaInspecaoActivity;
import com.vtpvistorias_tcc.config.AdapterPersonalizado;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.ArrayList;
import java.util.List;

public class ListaVeiculoActivity extends AppCompatActivity implements View.OnClickListener {

    private DatabaseReference firebase;
    private List<Veiculo> listaVeiculo;
    private Veiculo veiculo;
    private ListView listView;
    private Inspetor inspetor;
    private Intent i;
    private Activity act = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_veiculo);

        listView = findViewById(R.id.listViewVeiculos);

        listaVeiculo = new ArrayList<>();

        firebase = ConfiguracaoFirebase.getFirebase().child("Veiculos");

        List<String> dadosVeiculos = new ArrayList<>();
        dadosVeiculos.add("Carregando...");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, dadosVeiculos);
        listView.setAdapter(adapter);

        firebase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                for(DataSnapshot child : dataSnapshot.getChildren()){

                    listaVeiculo.add(child.getValue(Veiculo.class));

                }

                AdapterPersonalizado adapter = new AdapterPersonalizado(listaVeiculo,act,"E");
                listView.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int indice, long l) {

                veiculo = listaVeiculo.get(indice);

                i = new Intent(getApplicationContext(),ListaInspecaoVeiculosActivity.class);

                i.putExtra("veiculo",veiculo);

                startActivity(i);

            }
        });


    }

    @Override
    public void onClick(View view) {

    }
}
