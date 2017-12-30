package com.example.ravi.osm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ravi on 12/23/2017.
 */

public class Main_activity extends AppCompatActivity {
    Button addplace;

    public void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.main_layout);
        addplace = findViewById(R.id.addplace1);

        addplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Main_activity.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }
}
