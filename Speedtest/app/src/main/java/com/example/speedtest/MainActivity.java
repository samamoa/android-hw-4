package com.example.speedtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pokemon> pokeball=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Pokemon p1 = new Pokemon("Koffing",R.drawable.koffing,200,400,600);
        Pokemon p2= new Pokemon("marowak",R.drawable.marowak,200,300,800);
        Pokemon p3= new Pokemon("silcon",R.drawable.silcoon,150,350,500);
        Pokemon p4= new Pokemon("wurmple",R.drawable.wurmple,100,500,600);
        Pokemon p5= new Pokemon("lotad",R.drawable.lotad,250,450,700);
        pokeball.add(p1);
    pokeball.add(p2);
    pokeball.add(p3);
    pokeball.add(p4);
    pokeball.add(p5);
        RecyclerView rv=findViewById(R.id.rv);
rv.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    rv.setHasFixedSize(true);
    RecyclerView.LayoutManager lm=new LinearLayoutManager(this);
    rv.setLayoutManager(lm);
   PokemonAdapter pa =new PokemonAdapter(pokeball, this);
   rv.setAdapter(pa);
    }
}