package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Traits_Buffs extends AppCompatActivity {
    Button traits;
    Button buffs;
    Button debuffs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traits__buffs);

        traits = findViewById(R.id.btn_traits);
        traits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Traits_Buffs.this, Traits.class);
                startActivity(ToPages);
            }
        });

        debuffs = findViewById(R.id.btn_debuffs);
        debuffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Traits_Buffs.this, Debuffs.class);
                startActivity(ToPages);
            }
        });

        buffs = findViewById(R.id.btn_buffs);
        buffs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Traits_Buffs.this, Buffs.class);
                startActivity(ToPages);
            }
        });
    }
}
