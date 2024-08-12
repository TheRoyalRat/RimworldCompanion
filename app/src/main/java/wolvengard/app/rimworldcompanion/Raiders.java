package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Raiders extends AppCompatActivity {
    Button btn_tribals;
    Button btn_pirates;
    Button btn_outlanders;
    Button btn_mechanoids;
    Button btn_mercenaries;
    Button btn_ancientsoldiers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiders);

        btn_tribals = findViewById(R.id.btn_tribals); //From Raiders to Tribals.
        btn_tribals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Raiders.this, Tribals.class);
                startActivity(ToPages);
            }
        });

        btn_pirates = findViewById(R.id.btn_pirates); //From Raiders to Pirates.
        btn_pirates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Raiders.this, Pirates.class);
                startActivity(ToPages);
            }
        });

        btn_outlanders = findViewById(R.id.btn_outlanders); //From Raiders to Outlanders.
        btn_outlanders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Raiders.this, Outlanders.class);
                startActivity(ToPages);
            }
        });

        btn_mechanoids = findViewById(R.id.btn_mechanoids2); //From Raiders to Mechanoids.
        btn_mechanoids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Raiders.this, Mechanoids.class);
                startActivity(ToPages);
            }
        });

        btn_ancientsoldiers = findViewById(R.id.btn_ancientsoldiers); //From Raiders to Ancient Soldiers.
        btn_ancientsoldiers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewUpdater.name = "The Ancient Soldier";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/6b/SpaceSoldier1722.png";
                ViewUpdater.desc = "- Combat Power: 100 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 0-3800 \n- Weapon Budget: 300-900 \n- Available Weapons: Assault rifle, Autopistol, Bolt-action rifle, Chain shotgun, Heavy SMG, Incendiary launcher, LMG, Machine pistol, Pump shotgun, Revolver \n- Age Range: Any \n- May have bionics or power claws.";
                ViewUpdater.subDesc = "Spacers: These people don't appear in normal raids but are found in ancient shrines. This variety is always hostile to the player's faction.";
                Intent ToPages = new Intent(Raiders.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        btn_mercenaries = findViewById(R.id.btn_mercenaries); //From Raiders to Mercenaries.
        btn_mercenaries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(Raiders.this, Mercenaries.class);
                startActivity(ToPages);
            }
        });
    }
}
