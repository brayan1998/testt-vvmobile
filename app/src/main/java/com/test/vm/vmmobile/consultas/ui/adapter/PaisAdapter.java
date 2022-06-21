package com.test.vm.vmmobile.consultas.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.test.vm.vmmobile.R;
import com.test.vm.vmmobile.consultas.util.Pais;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PaisAdapter extends RecyclerView.Adapter<PaisAdapter.PaisViewHolderViewHolder> {

    private List<Pais> listaPais;
    private List<Pais> listaSearch;
    final PaisAdapter.OnItemClickListener listener;



    public PaisAdapter(List<Pais> listaPais, OnItemClickListener listener){
        this.listaPais = listaPais;
        this.listener = listener;
        listaSearch = new ArrayList<>();
        listaSearch.addAll(listaPais);
    }

    public interface  OnItemClickListener{
        void onItemClick(Pais pais);
    }

    @NonNull
    @Override
    public PaisViewHolderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_buscador_pais , parent , false);
        return new PaisViewHolderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PaisViewHolderViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.textViewNombre.setText(listaPais.get(position).getName().getCommon());
        holder.textViewRegion.setText(listaPais.get(position).getRegion());
        if(listaPais.get(position).getCapital() != null){
            holder.textViewCapital.setText(listaPais.get(position).getCapital().get(0));
        }


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClick(listaPais.get(position));
            }
        });

    }

    public void filtrado (String txtBuscar){
        int longitud = txtBuscar.length();
        if(longitud == 0){
            listaPais.clear();
            listaPais.addAll(listaSearch);
        } else {
            List<Pais> collection = listaPais.stream()
                    .filter(i -> i.getName().getCommon().toLowerCase().contains(txtBuscar.toLowerCase()))
                    .collect(Collectors.toList());

            listaPais.clear();
            listaPais.addAll(collection);
        }

        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return listaPais.size();
    }

    public class PaisViewHolderViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.item_list_pais_nombre)
        TextView textViewNombre;
        @BindView(R.id.item_list_pais_region)
        TextView textViewRegion;
        @BindView(R.id.item_list_pais_capital)
        TextView textViewCapital;

        public PaisViewHolderViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewNombre = itemView.findViewById(R.id.item_list_pais_nombre);
            textViewRegion = itemView.findViewById(R.id.item_list_pais_region);
            textViewCapital = itemView.findViewById(R.id.item_list_pais_capital);
        }
    }
    public void clearData() {
        listaPais.clear(); // clear list
       notifyDataSetChanged(); // let your adapter know about the changes and reload view.
    }

}