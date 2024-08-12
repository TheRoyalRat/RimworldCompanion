package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Valuables extends AppCompatActivity {
    Button fabrics;
    Button drugs;
    Button exotics;
    Button security;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valuables);

        fabrics = findViewById(R.id.btn_fabrics);
        fabrics.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Valuables.this, Fabrics.class);
                startActivity(intent);
            }
        });

        drugs = findViewById(R.id.btn_drugs);
        drugs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Valuables.this, Drugs.class);
                startActivity(intent);
            }
        });

        exotics = findViewById(R.id.btn_exotics);
        exotics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Valuables.this, Exotics.class);
                startActivity(intent);
            }
        });

        security = findViewById(R.id.btn_security);
        security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Valuables.this, Security.class);
            }
        });
    }
}
