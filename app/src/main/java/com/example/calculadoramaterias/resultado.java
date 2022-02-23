package com.example.calculadoramaterias;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    public boolean estaReprobada(int a,int b,int c){
        if ((a+b+c)/3>6){
            return true;
        }else{
            return false;
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
}