package com.example.gestionintervention;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AdaptateurInterv extends ArrayAdapter<Intervention> {

    public AdaptateurInterv(@NonNull Context context, ArrayList<Intervention> interventions) {
        super(context,0, interventions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View lsvElementView = convertView;
        if (lsvElementView == null){
            lsvElementView = LayoutInflater.from(getContext()).inflate(R.layout.eintervention,parent,false);
        }
        Intervention interventionCourant = getItem(position);

        TextView txtTitreIntervention = (TextView) lsvElementView.findViewById(R.id.txtTitreIntervention);
        txtTitreIntervention.setText(interventionCourant.getTitreIntervention());

        TextView txtClient = (TextView) lsvElementView.findViewById(R.id.txtClient);
        txtClient.setText(interventionCourant.getClient());

        TextView txtAdresseClient = (TextView) lsvElementView.findViewById(R.id.txtAdresseClient);
        txtAdresseClient.setText(interventionCourant.getAdresseClient());
        TextView txtHeureIntervention = (TextView) lsvElementView.findViewById(R.id.txtHeureIntervention);
        txtHeureIntervention.setText(interventionCourant.getHeureIntervention());

        CheckBox chkTerminer = (CheckBox) lsvElementView.findViewById(R.id.chkTerminer);
        chkTerminer.setChecked(interventionCourant.getTerminer());

        return lsvElementView;
    }




}
