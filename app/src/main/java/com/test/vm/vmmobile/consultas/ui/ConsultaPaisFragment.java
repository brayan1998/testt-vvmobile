package com.test.vm.vmmobile.consultas.ui;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.test.vm.vmmobile.R;
import com.test.vm.vmmobile.consultas.model.remote.response.PaisSearch;
import com.test.vm.vmmobile.consultas.presenter.ConsultaPaisPresenter;
import com.test.vm.vmmobile.consultas.ui.adapter.PaisAdapter;
import com.test.vm.vmmobile.consultas.ui.dialogs.ModalDetallePaisDialog;
import com.test.vm.vmmobile.consultas.ui.view.ConsultaPaisView;
import com.test.vm.vmmobile.consultas.util.Pais;
import com.test.vm.vmmobile.core.base.BaseFragment;

import java.util.List;

import butterknife.BindView;


public class ConsultaPaisFragment extends BaseFragment<ConsultaPaisPresenter> implements ConsultaPaisView, SearchView.OnQueryTextListener {


    @BindView(R.id.fragment_component_searchView)
    SearchView searchView;

    @BindView(R.id.fragment_component_recyclerview)
    RecyclerView recyclerViewPais;

    PaisAdapter buscadorPaisAdapter;

    @Override
    public ConsultaPaisPresenter createPresenter() {
        return new ConsultaPaisPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = super.onCreateView(inflater, container, savedInstanceState);
        getPresenter().init();
        searchView.setOnQueryTextListener(this);
        recyclerViewPais.setHasFixedSize(true);
        recyclerViewPais.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_dashboard;
    }


    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String texto) {
        if(buscadorPaisAdapter != null){
            buscadorPaisAdapter.filtrado(texto);
        }
        return false;
    }

    @Override
    public void setListPais(List<Pais> paisSearchList) {
        this.buscadorPaisAdapter = new PaisAdapter(paisSearchList, new PaisAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Pais pais) {
                abrirDialog(pais);
            }
        });
        recyclerViewPais.setAdapter(buscadorPaisAdapter);
        buscadorPaisAdapter.notifyDataSetChanged();
    }

    private void abrirDialog(Pais pais) {
        ModalDetallePaisDialog dialogo = new ModalDetallePaisDialog();
        dialogo.setPaisInfo(pais);
        dialogo.show(getFragmentManager(),"TAG");
    }

}