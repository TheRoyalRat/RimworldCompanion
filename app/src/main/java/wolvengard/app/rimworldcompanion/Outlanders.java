package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Outlanders extends AppCompatActivity {

    Button villagerButton;
    Button councilmanButton;
    Button guardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outlanders);

        villagerButton = findViewById(R.id.btn_outlanders_villager);
        councilmanButton = findViewById(R.id.btn_outlanders_towncouncilman);
        guardButton = findViewById(R.id.btn_outlanders_townguard);

        villagerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Villager";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/62/Villager1557.png";
                ViewUpdater.desc = "- Combat Power: 35 \n- Gear Health: 20-200% \n- Avg. Gear Quality: Poor \n- Clothing Budget: 200-400 \n- Weapon Budget: 65-250 \n- Available Weapons: Autopistol, Knife, Machine pistol, Revolver \n- Age Range: Any \n- Rarely has wooden or standard prostheses.";
                ViewUpdater.subDesc = "Outlanders: As friendly units, they show up in caravans or friendly reinforcements. Rough outlander unions will also send these to attack your colony in the early game.";
                Intent ToPages = new Intent(Outlanders.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        councilmanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Town Councilman";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/68/Councilman2056.png";
                ViewUpdater.desc = "- Combat Power: 40 \n- Gear Health: 100% \n- Avg. Gear Quality: Good \n- Clothing Budget: 700-1200 \n- Weapon Budget: 200 \n- Available Weapons: Autopistol, Revolver \n- Age Range: At least 30 \n- Always has bowler hat. Only one can show in a raid. Occasionally has standard prostheses or bionics.";
                ViewUpdater.subDesc = "Outlanders: As friendly units, they show up in caravans or friendly reinforcements. Rough outlander unions will also send these to attack your colony in the early game.";
                Intent ToPages = new Intent(Outlanders.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        guardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Town Guard";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/64/Guard1557.png";
                ViewUpdater.desc = "- Combat Power: 55 \n- Gear Health: 60-200% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 400-600 \n- Weapon Budget: 250-400 \n- Available Weapons: Autopistol, Bolt-action rifle, Heavy SMG, Incendiary launcher, Machine pistol, Pump shotgun, Revolver \n- Age Range: Any \n- Rarely has wooden or standard prostheses";
                ViewUpdater.subDesc = "Outlanders: As friendly units, they show up in caravans or friendly reinforcements. Rough outlander unions will also send these to attack your colony in the early game.";
                Intent ToPages = new Intent(Outlanders.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

    }
}
