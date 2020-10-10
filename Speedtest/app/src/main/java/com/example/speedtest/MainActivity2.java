package com.example.speedtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
        Pokemon p = (Pokemon) b.getSerializable("pokemon");
        ImageView img= findViewById(R.id.imageView3);
        TextView name=findViewById(R.id.textView3);
        TextView attack=findViewById(R.id.textView4);
        TextView def=findViewById(R.id.textView);

        img.setImageResource(p.getImage());
        name.setText(p.getName());
        attack.setText("Attack"+p.getAttack());
def.setText("Defence"+p.getDefence());
    }
}