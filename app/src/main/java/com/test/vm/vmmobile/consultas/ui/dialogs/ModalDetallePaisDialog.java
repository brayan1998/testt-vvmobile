package com.test.vm.vmmobile.consultas.ui.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.squareup.picasso.Picasso;
import com.test.vm.vmmobile.R;
import com.test.vm.vmmobile.consultas.util.Pais;

import java.util.ArrayList;
import java.util.List;



public class ModalDetallePaisDialog  extends DialogFragment {

    private Pais paisInfo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_modal_detalle, container, false);
        StringBuilder bordersTmp = new StringBuilder();
        StringBuilder timeZonesTmp = new StringBuilder();


        TextView textViewNombre = (TextView) view.findViewById(R.id.dialog_modal_nombre_edit);
        TextView textViewCapital = (TextView) view.findViewById(R.id.dialog_modal_detalle_capital_edit);
        TextView textViewLatlng = (TextView) view.findViewById(R.id.dialog_modal_detalle_latlng_edit);
        TextView textViewBorder= (TextView) view.findViewById(R.id.dialog_modal_detalle_border_edit);
        TextView textViewPopulation= (TextView) view.findViewById(R.id.dialog_modal_detalle_population_edit);
        TextView textViewTimeZon= (TextView) view.findViewById(R.id.dialog_modal_detalle_timez_edit);
        TextView textViewCurrencie = (TextView) view.findViewById(R.id.dialog_modal_detalle_currencie_edit);
        ImageView imageView = (ImageView) view.findViewById(R.id.imagePais);

        List<Pais.currencie> currencieList = new ArrayList<>();

        for (String key : paisInfo.getCurrencies().keySet()) {
            currencieList.add(paisInfo.getCurrencies().get(key));
        }

        textViewCurrencie.setText(currencieList.get(0).getName().toString() + "  (" + currencieList.get(0).getSymbol().toString() + ")" );
        if(paisInfo.getCapital() != null || paisInfo.getLatlng() !=null || paisInfo.getFlags().getPng() != null
                || paisInfo.getTimezones()!=null || paisInfo.getName().getCommon() !=null) {
            textViewCapital.setText(paisInfo.getCapital().get(0));
            textViewLatlng.setText(paisInfo.getLatlng().get(0)+ " / " +paisInfo.getLatlng().get(1));
            Picasso.get().load(paisInfo.getFlags().getPng()).error(R.mipmap.ic_launcher).into(imageView);
            textViewNombre.setText(paisInfo.getName().getCommon());
            for (String line: paisInfo.getBorders()) {
                bordersTmp.append(line).append(System.lineSeparator());
            }

            for (String line: paisInfo.getTimezones()) {
                timeZonesTmp.append(line).append(System.lineSeparator());
            }
        }

        textViewBorder.setText(bordersTmp);
        textViewTimeZon.setText(timeZonesTmp);
        textViewPopulation.setText(String.valueOf(new Double((paisInfo.getPopulation()))));
        return view;
    }

    public void setPaisInfo(Pais pais) {
       this.paisInfo = pais;
    }
}
