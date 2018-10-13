package com.vtpvistorias_tcc.activity.BuscarPorInspetor;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
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
import com.vtpvistorias_tcc.R;
import com.vtpvistorias_tcc.activity.InspecaoActivity;
import com.vtpvistorias_tcc.config.ConfiguracaoFirebase;

import java.util.ArrayList;
import java.util.List;

public class ListaInspecaoActivity extends AppCompatActivity {

    private ListView inspecaoListView;
    private DatabaseReference firebase;
    private Inspetor inspetor;
    private List<Inspecao> listaInspecao;
    private List<Inspecao> listaInspecaoPorInspetor;
    private List<String> viewInspecao;
    private Inspecao inspecao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_inspecao);

        inspecaoListView = findViewById(R.id.inspecaoListView);

        inspetor = (Inspetor) getIntent().getSerializableExtra("inspetor");

        firebase = ConfiguracaoFirebase.getFirebase().child("Inspecao");

        listaInspecao = new ArrayList<>();
        viewInspecao = new ArrayList<>();
        listaInspecaoPorInspetor = new ArrayList<>();

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

                    if(listaInspecao.get(a).getInspetor().getNome().equals(inspetor.getNome())){

                        listaInspecaoPorInspetor.add(listaInspecao.get(a));
                        viewInspecao.add("Veiculo: "+ listaInspecao.get(a).getVeiculo().getPrefixo()+" Placa: "+listaInspecao.get(a).getVeiculo()
                        .getPlaca()+"\nData: "+listaInspecao.get(a).getDataHoraRegistro());

                    }

                }

                if(listaInspecaoPorInspetor.size()==0){

                    Toast.makeText(getApplicationContext(),"Não foi encontrada nenhuma inspeção para esse Inspetor",Toast.LENGTH_LONG).show();

                    finish();

                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, viewInspecao);
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

                    inspecao = listaInspecaoPorInspetor.get(indice);

                    i.putExtra("inspecao",inspecao);

                    startActivity(i);

                }
        });

    }
}
