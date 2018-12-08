package com.vtpvistorias_tcc.activity.BuscarPorVeiculo;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
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
import com.vtpvistorias_tcc.activity.InspecaoActivity;
import com.vtpvistorias_tcc.config.AdapterPersonalizado;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.ArrayList;
import java.util.List;

public class ListaInspecaoVeiculosActivity extends AppCompatActivity {

    private ListView inspecaoListView;
    private DatabaseReference firebase;
    private List<Inspecao> listaInspecao;
    private Veiculo veiculo;
    private List<Inspecao> listaInspecaoPorVeiculo;
    private List<String> viewInspecao;
    private Inspecao inspecao;
    private Activity act = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_inspecao_veiculos);

        inspecaoListView = findViewById(R.id.inspecoesVeiculosListView);

        veiculo = (Veiculo) getIntent().getSerializableExtra("veiculo");

        firebase = ConfiguracaoFirebase.getFirebase().child("Inspecao");

        listaInspecao = new ArrayList<>();
        viewInspecao = new ArrayList<>();
        listaInspecaoPorVeiculo = new ArrayList<>();

        firebase.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for(DataSnapshot child : dataSnapshot.getChildren()){

                    inspecao = child.getValue(Inspecao.class);
                    inspecao.setIdInspecao(child.getKey());
                    listaInspecao.add(inspecao);


                }

                //Toast.makeText(getApplicationContext(),""+listaInspecao.get(0).getDataHoraRegistro(),Toast.LENGTH_LONG).show();

                for(int a = 0; a<listaInspecao.size();a++){

                    if(listaInspecao.get(a).getVeiculo().getPrefixo().equals(veiculo.getPrefixo())){

                        listaInspecaoPorVeiculo.add(listaInspecao.get(a));
                        viewInspecao.add("Inspetor: "+ listaInspecao.get(a).getInspetor().getNome()+
                                "\nData: "+listaInspecao.get(a).getDataHoraRegistro());

                    }

                }

                if(listaInspecaoPorVeiculo.size()==0){

                    Toast.makeText(getApplicationContext(),"Não foi encontrada nenhuma inspeção para esse Veiculo",Toast.LENGTH_LONG).show();

                    finish();

                }

                //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, viewInspecao);
                //inspecaoListView.setAdapter(adapter);

                AdapterPersonalizado adapter = new AdapterPersonalizado(listaInspecaoPorVeiculo,act,1);
                inspecaoListView.setAdapter(adapter);

            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        inspecaoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int indice, long l) {

                Intent i =  new Intent(getApplicationContext(),InspecaoActivity.class);

                inspecao = listaInspecaoPorVeiculo.get(indice);

                i.putExtra("inspecao",inspecao);

                startActivity(i);

            }
        });

    }
}