package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Traits_Buffs extends AppCompatActivity {
    Button traits;
    Button buffs;
    Button debuffs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traits__buffs);

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
