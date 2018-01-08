package com.example.ravi.osm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OSMworld extends AppCompatActivity {
    Button addplace1,contribution,resolveerror;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osmworld);

        addplace1 = findViewById(R.id.addplace);
        contribution = findViewById(R.id.contribution);
        resolveerror = findViewById(R.id.resolveerror);

        addplace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OSMworld.this,ContributeToOSM.class);
                startActivity(i);
            }
        });

        contribution.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OSMworld.this,OSMcontribution.class);
                startActivity(i);

            }
        });

        resolveerror.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(OSMworld.this,ErrorsCorrection.class);
                startActivity(i);
            }
        });
    }
}
