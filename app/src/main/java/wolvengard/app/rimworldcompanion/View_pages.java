package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class View_pages extends AppCompatActivity {
    Button btn_creatures;
    Button btn_plants;
    Button btn_valuables;
    Button btn_traits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pages);

        btn_creatures = findViewById(R.id.btn_creatures);
        btn_creatures.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent ToCreatures = new Intent(View_pages.this, Creatures.class);
                startActivity(ToCreatures);
            }
        });

        btn_plants = findViewById(R.id.btn_plants);
        btn_plants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(View_pages.this, Plants.class);
                startActivity(ToPages);
            }
        });

        btn_valuables = findViewById(R.id.btn_valuables);
        btn_valuables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(View_pages.this, Valuables.class);
                startActivity(ToPages);
            }
        });

        btn_traits = findViewById(R.id.btn_traits);
        btn_traits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(View_pages.this, Traits_Buffs.class);
                startActivity(ToPages);
            }
        });
    }
}
