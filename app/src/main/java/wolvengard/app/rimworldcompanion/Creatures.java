package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Creatures extends AppCompatActivity {
    Button btn_animals;
    Button btn_mechanoids;
    Button btn_raiders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creatures);
        ViewUpdater.titleStatus = true;

        btn_animals = findViewById(R.id.btn_animals); //From Creatures to Animals.
        btn_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Creatures.this, Animals.class);
                startActivity(ToPages);
            }
        });

        btn_mechanoids = findViewById(R.id.btn_mechanoids); //From Creatures to Mechanoids.
        btn_mechanoids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Creatures.this, Mechanoids.class);
                startActivity(ToPages);
            }
        });

        btn_raiders = findViewById(R.id.btn_raiders); //From Creatures to Raiders.
        btn_raiders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Creatures.this, Raiders.class);
                startActivity(ToPages);
            }
        });
    }
}
