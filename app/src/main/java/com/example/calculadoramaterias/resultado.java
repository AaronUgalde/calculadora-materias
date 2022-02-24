package com.example.calculadoramaterias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class resultado extends AppCompatActivity {

    private TextView PriAlta;
    private TextView PriBaja;
    private TextView PriMed;
    private TextView SegAlta;
    private TextView SegBaja;
    private TextView SegMed;
    private TextView TerAlta;
    private TextView TerBaja;
    private TextView TerMed;
    private TextView Med;
    private TextView Extras;

    private String queEs(int a){
        if(a==0){
            return "FisicaIV";
        }
        if(a==1){
            return "Ingenieria de software";
        }
        if(a==2){
            return "InglesVI";
        }
        if(a==3){
            return "LaboratorioIV";
        }
        if(a==4){
            return "Metodologias";
        }
        if(a==5){
            return "Orientacion";
        }
        if(a==6){
            return "Probabilidad";
        }
        if(a==7){
            return "Proyecto";
        }
        if(a==8){
            return "QuimicaIV";
        }
        else{
            return "Soporte";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        PriAlta = (TextView)findViewById(R.id.PriAlta);
        PriBaja = (TextView)findViewById(R.id.PriBaja);
        PriMed = (TextView)findViewById(R.id.PriMed);
        SegAlta = (TextView)findViewById(R.id.SegAlta);
        SegBaja = (TextView)findViewById(R.id.SegBaja);
        SegMed = (TextView)findViewById(R.id.SegMed);
        TerAlta = (TextView)findViewById(R.id.TerAlta);
        TerBaja = (TextView)findViewById(R.id.TerBaja);
        TerMed = (TextView)findViewById(R.id.TerMed);
        Med = (TextView)findViewById(R.id.Med);
        Extras = (TextView)findViewById(R.id.Extras);

        int fisI = Integer.parseInt(getIntent().getStringExtra("fisI"));
        int ingI = Integer.parseInt(getIntent().getStringExtra("ingI"));
        int inglI = Integer.parseInt(getIntent().getStringExtra("inglI"));
        int labI = Integer.parseInt(getIntent().getStringExtra("labI"));
        int metI = Integer.parseInt(getIntent().getStringExtra("metI"));
        int oriI = Integer.parseInt(getIntent().getStringExtra("oriI"));
        int probI = Integer.parseInt(getIntent().getStringExtra("probI"));
        int piI = Integer.parseInt(getIntent().getStringExtra("piI"));
        int quiI = Integer.parseInt(getIntent().getStringExtra("quiI"));
        int sopI = Integer.parseInt(getIntent().getStringExtra("sopI"));

        int[] calificacionesI = new int[] {fisI,ingI,inglI,labI,metI,oriI,probI,piI,quiI,sopI};

        int indiceDelMayorI = 0;
        int indiceDelMenorI = 0;
        for (int x = 1; x < calificacionesI.length; x++) {
            if (calificacionesI[x] > calificacionesI[indiceDelMayorI]) {
                indiceDelMayorI = x;
            }
            if (calificacionesI[x]<calificacionesI[indiceDelMenorI]){
                indiceDelMenorI = x;
            }
        }
        PriAlta.setText(queEs(indiceDelMayorI));
        PriBaja.setText(queEs(indiceDelMenorI));

        int fisII = Integer.parseInt(getIntent().getStringExtra("fisII"));
        int ingII = Integer.parseInt(getIntent().getStringExtra("ingII"));
        int inglII = Integer.parseInt(getIntent().getStringExtra("inglII"));
        int labII = Integer.parseInt(getIntent().getStringExtra("labII"));
        int metII = Integer.parseInt(getIntent().getStringExtra("metII"));
        int oriII = Integer.parseInt(getIntent().getStringExtra("oriII"));
        int probII = Integer.parseInt(getIntent().getStringExtra("probII"));
        int piII = Integer.parseInt(getIntent().getStringExtra("piII"));
        int quiII = Integer.parseInt(getIntent().getStringExtra("quiII"));
        int sopII = Integer.parseInt(getIntent().getStringExtra("sopII"));

        int[] calificacionesII = new int[] {fisII,ingII,inglII,labII,metII,oriII,probII,piII,quiII,sopII};

        int indiceDelMayorII = 0;
        int indiceDelMenorII = 0;
        for (int x = 1; x < calificacionesII.length; x++) {
            if (calificacionesII[x] > calificacionesII[indiceDelMayorII]) {
                indiceDelMayorII = x;
            }
            if (calificacionesII[x]<calificacionesII[indiceDelMenorII]){
                indiceDelMenorII = x;
            }
        }
        SegAlta.setText(queEs(indiceDelMayorII));
        SegBaja.setText(queEs(indiceDelMenorII));

        int fisIII = Integer.parseInt(getIntent().getStringExtra("fisIII"));
        int ingIII = Integer.parseInt(getIntent().getStringExtra("ingIII"));
        int inglIII = Integer.parseInt(getIntent().getStringExtra("inglIII"));
        int labIII = Integer.parseInt(getIntent().getStringExtra("labIII"));
        int metIII = Integer.parseInt(getIntent().getStringExtra("metIII"));
        int oriIII = Integer.parseInt(getIntent().getStringExtra("oriIII"));
        int probIII = Integer.parseInt(getIntent().getStringExtra("probIII"));
        int piIII = Integer.parseInt(getIntent().getStringExtra("piIII"));
        int quiIII = Integer.parseInt(getIntent().getStringExtra("quiIII"));
        int sopIII = Integer.parseInt(getIntent().getStringExtra("sopIII"));

        int[] calificacionesIII = new int[] {fisIII,ingIII,inglIII,labIII,metIII,oriIII,probIII,piIII,quiIII,sopIII};

        int indiceDelMayorIII = 0;
        int indiceDelMenorIII = 0;
        for (int x = 1; x < calificacionesIII.length; x++) {
            if (calificacionesIII[x] > calificacionesIII[indiceDelMayorIII]) {
                indiceDelMayorIII = x;
            }
            if (calificacionesIII[x]<calificacionesIII[indiceDelMenorIII]){
                indiceDelMenorIII = x;
            }
        }
        TerAlta.setText(queEs(indiceDelMayorIII));
        TerBaja.setText(queEs(indiceDelMenorIII));
        //Extras
        String extras = "";
        if((fisI+fisII+fisIII)/3<6){
            extras += " FisicaIV";
        }
        if ((ingI+ingII+ingIII)/3<6){
            extras += " Ingenieria";
        }
        if ((inglI+inglII+inglIII)/3<6){
            extras += " InglesVI";
        }
        if ((labI+labII+labIII)/3<6){
            extras += " LaboratorioIV";
        }
        if ((metI+metII+metIII)/3<6){
            extras += "Metodologias";
        }
        if ((oriI+oriII+oriIII)/3<6){
            extras += " Orientacion";
        }
        if ((probI+probII+probIII)/3<6){
            extras += " Probabilidad";
        }
        if ((piI+piII+piIII)/3<6){
            extras += " Proyecto";
        }
        if ((quiI+quiII+quiIII)/3<6){
            extras += " QuimicaIV";
        }
        if ((sopI+sopII+sopIII)/3<6){
            extras += " Soporte";
        }
        Extras.setText(extras);

        //medias
        float mediaP1 = (fisI+ingI+inglI+labI+metI+oriI+probI+piI+quiI+sopI)/10;
        PriMed.setText(Float.toString(mediaP1));

        float mediaP2 = (fisII+ingII+inglII+labII+metII+oriII+probII+piII+quiII+sopII)/10;
        SegMed.setText(Float.toString(mediaP2));

        float mediaP3 = (fisIII+ingIII+inglIII+labIII+metIII+oriIII+probIII+piIII+quiIII+sopIII)/10;
        TerMed.setText(Float.toString(mediaP3));

        float media = (mediaP1+mediaP2+mediaP3)/3;
        Med.setText(Float.toString(media));

    }
    private void regresar(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}