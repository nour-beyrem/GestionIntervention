 package com.example.gestionintervention;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

 public class MainActivity extends AppCompatActivity {
     ListView _lsvInterventions;
     SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = openOrCreateDatabase("Intervention",MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS INTERVENTIONS(id number primary key, titreIntervention varchar, client varchar, adressClient varchar, heureIntervention DATE);");
        _lsvInterventions = (ListView) findViewById(R.id.lsvInterventions);

        final ArrayList<Intervention> interventions = new ArrayList<Intervention>();
        interventions.add(new Intervention("Titre intervention 1","Client 1","adresse client 1", "08:00-12:00",false));
        interventions.add(new Intervention("Titre intervention 2","Client 2","adresse client 2", "13:00-18:00",true));


        AdaptateurInterv adaptIntervention = new AdaptateurInterv(this,interventions);
        _lsvInterventions.setAdapter(adaptIntervention);
    }
}