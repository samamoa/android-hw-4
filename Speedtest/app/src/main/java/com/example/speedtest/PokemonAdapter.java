package com.example.speedtest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter {
  ArrayList<Pokemon> pArray;
  Context context;

    public PokemonAdapter(ArrayList<Pokemon> pArray, Context context) {
        this.pArray = pArray;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       //  return null;
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon,parent,false);
        ViewHolder vh =new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder)holder).img.setImageResource(pArray.get(position).getImage());
        ((ViewHolder) holder).total.setText(pArray.get(position).getTotal()+"");
        ((ViewHolder)holder).name.setText(pArray.get(position).getName());
        ((ViewHolder)holder).view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i=new Intent(context,MainActivity2.class);
                i.putExtra("pokemon",pArray.get(position) );
                context.startActivity(i);

            }
                                                     }
        );
        ((ViewHolder)holder).delete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                pArray.remove(position);
                notifyDataSetChanged();
                Toast.makeText(context,"item is deleted",Toast.LENGTH_SHORT).show();
            }
                                                       }
        );
      }

    @Override
    public int getItemCount() {
        return   pArray.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder{
public ImageView img;
public TextView name;
public TextView total;
public View view;
public ImageView delete ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view =itemView;//mhm
            img=view.findViewById(R.id.imageView2);
            name=view.findViewById(R.id.textView);
            total=view. findViewById(R.id.textView2);
            delete=view.findViewById(R.id.imageView3);
        }
    }

}
