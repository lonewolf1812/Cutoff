package com.example.cutoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button engg,ms,ps,arts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engg=findViewById(R.id.ebut);
        ms=findViewById(R.id.msbut);
        ps=findViewById(R.id.psbut);
        arts=findViewById(R.id.abut);

        engg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,EnggActivity.class);
                startActivity(intent);
            }
        });

        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MSActivity.class);
                startActivity(intent);
            }
        });

        ps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PSActivity.class);
                startActivity(intent);
            }
        });

        arts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ArtsActivity.class);
                startActivity(intent);
            }
        });
    }
}
