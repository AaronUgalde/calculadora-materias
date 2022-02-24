package com.example.calculadoramaterias;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText fisI;
    public EditText ingI;
    public EditText inglI;
    public EditText labI;
    public EditText metI;
    public EditText oriI;
    public EditText probI;
    public EditText piI;
    public EditText quiI;
    public EditText sopI;

    public EditText fisII;
    public EditText ingII;
    public EditText inglII;
    public EditText labII;
    public EditText metII;
    public EditText oriII;
    public EditText probII;
    public EditText piII;
    public EditText quiII;
    public EditText sopII;

    public EditText fisIII;
    public EditText ingIII;
    public EditText inglIII;
    public EditText labIII;
    public EditText metIII;
    public EditText oriIII;
    public EditText probIII;
    public EditText piIII;
    public EditText quiIII;
    public EditText sopIII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fisI = (EditText)findViewById(R.id.fisI);
        ingI = (EditText)findViewById(R.id.ingI);
        inglI = (EditText)findViewById(R.id.inglI);
        labI = (EditText)findViewById(R.id.labI);
        metI = (EditText)findViewById(R.id.metI);
        oriI = (EditText)findViewById(R.id.oriI);
        probI = (EditText)findViewById(R.id.probI);
        piI = (EditText)findViewById(R.id.piI);
        quiI = (EditText)findViewById(R.id.quiI);
        sopI = (EditText)findViewById(R.id.sopI);

        fisII = (EditText)findViewById(R.id.fisII);
        ingII = (EditText)findViewById(R.id.ingII);
        inglII = (EditText)findViewById(R.id.inglII);
        labII = (EditText)findViewById(R.id.labII);
        metII = (EditText)findViewById(R.id.metII);
        oriII = (EditText)findViewById(R.id.oriII);
        probII = (EditText)findViewById(R.id.probII);
        piII = (EditText)findViewById(R.id.piII);
        quiII = (EditText)findViewById(R.id.quiII);
        sopII = (EditText)findViewById(R.id.sopII);

        fisIII = (EditText)findViewById(R.id.fisIII);
        ingIII = (EditText)findViewById(R.id.ingIII);
        inglIII = (EditText)findViewById(R.id.inglIII);
        labIII = (EditText)findViewById(R.id.labIII);
        metIII = (EditText)findViewById(R.id.metIII);
        oriIII = (EditText)findViewById(R.id.oriIII);
        probIII = (EditText)findViewById(R.id.probIII);
        piIII = (EditText)findViewById(R.id.piIII);
        quiIII = (EditText)findViewById(R.id.quiIII);
        sopIII = (EditText)findViewById(R.id.sopIII);
    }

    public void enviar(View view){
        Intent i = new Intent(this, resultado.class);

        i.putExtra("fisI",fisI.getText().toString());
        i.putExtra("ingI",ingI.getText().toString());
        i.putExtra("inglI",inglI.getText().toString());
        i.putExtra("labI",labI.getText().toString());
        i.putExtra("metI",metI.getText().toString());
        i.putExtra("oriI",oriI.getText().toString());
        i.putExtra("probI",probI.getText().toString());
        i.putExtra("piI",piI.getText().toString());
        i.putExtra("quiI",quiI.getText().toString());
        i.putExtra("sopI",sopI.getText().toString());

        i.putExtra("fisII",fisII.getText().toString());
        i.putExtra("ingII",ingII.getText().toString());
        i.putExtra("inglII",inglII.getText().toString());
        i.putExtra("labII",labII.getText().toString());
        i.putExtra("metII",metII.getText().toString());
        i.putExtra("oriII",oriII.getText().toString());
        i.putExtra("probII",probII.getText().toString());
        i.putExtra("piII",piII.getText().toString());
        i.putExtra("quiII",quiII.getText().toString());
        i.putExtra("sopII",sopII.getText().toString());

        i.putExtra("fisIII",fisIII.getText().toString());
        i.putExtra("ingIII",ingIII.getText().toString());
        i.putExtra("inglIII",inglIII.getText().toString());
        i.putExtra("labIII",labIII.getText().toString());
        i.putExtra("metIII",metIII.getText().toString());
        i.putExtra("oriIII",oriIII.getText().toString());
        i.putExtra("probIII",probIII.getText().toString());
        i.putExtra("piIII",piIII.getText().toString());
        i.putExtra("quiIII",quiIII.getText().toString());
        i.putExtra("sopIII",sopIII.getText().toString());

        startActivity(i);
    }
}