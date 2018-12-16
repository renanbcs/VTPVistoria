package com.vtpvistorias_tcc.config;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.vtpvistorias_tcc.Model.Inspecao;
import com.vtpvistorias_tcc.Model.Inspetor;
import com.vtpvistorias_tcc.Model.Veiculo;
import com.vtpvistorias_tcc.R;
import java.util.List;

public class AdapterPersonalizado extends BaseAdapter {

    private List<String> lista;
    private Activity act;
    private List<Veiculo> veiculos;
    private List<Inspecao> inspecoes;
    private List<Inspetor> inspetores;

    public AdapterPersonalizado(List<Veiculo> veiculos, Activity act, String v) {
        this.veiculos = veiculos;
        this.act = act;
    }

    public AdapterPersonalizado(List<Inspecao> inspecoes, Activity act, int i) {
        this.inspecoes = inspecoes;
        this.act = act;
    }

    public AdapterPersonalizado(List<Inspetor> inspetores, Activity act) {
        this.inspetores = inspetores;
        this.act = act;
    }

    @Override
    public int getCount() {

        if(inspetores != null) return inspetores.size();
        else if(inspecoes != null) return inspecoes.size();
        else return veiculos.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = act.getLayoutInflater().inflate(R.layout.templetelistas,parent,false);

        TextView titulo = (TextView) view.findViewById(R.id.textViewTitulo);

        TextView subtitulo = view.findViewById(R.id.textViewSubTitulo);

        ImageView imagem = (ImageView) view.findViewById(R.id.imageViewIcone);

        LinearLayout linearLayout = view.findViewById(R.id.linearlayout);

        if(position%2==0){

            linearLayout.setBackgroundResource(R.color.fundopar);

        }else linearLayout.setBackgroundResource(R.color.fundoimpar);


        if(inspetores != null){

            titulo.setText(inspetores.get(position).getNome());
            subtitulo.setText(inspetores.get(position).getEmail());
            imagem.setImageResource(R.drawable.person);

        }else{

            if(inspecoes != null){

                titulo.setText(inspecoes.get(position).getIdInspecao());
                subtitulo.setText(inspecoes.get(position).getDataHoraRegistro());
                imagem.setImageResource(R.drawable.ficha);

            }else{

                titulo.setText("Prefixo: "+veiculos.get(position).getPrefixo());
                subtitulo.setText("Placa: "+veiculos.get(position).getPlaca());
                imagem.setImageResource(R.drawable.bus);

            }

        }

        return view;
    }
}
