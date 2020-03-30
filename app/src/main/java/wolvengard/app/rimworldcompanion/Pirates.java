package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pirates extends AppCompatActivity {

    Button drifterButton;
    Button scavengerThrasherButton;
    Button scavengerGunnerButton;
    Button pirateGunnerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pirates);
        drifterButton = findViewById(R.id.btn_pirates_drifter);
        scavengerGunnerButton = findViewById(R.id.btn_pirates_scavengergunner);
        scavengerThrasherButton = findViewById(R.id.btn_pirates_scavengerthrasher);
        pirateGunnerButton = findViewById(R.id.btn_pirates_pirategunner);

        drifterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Drifter";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/34/Drifter1557.png";
                ViewUpdater.desc = "- Combat Power: 35 \n- Gear Health: 20-60% \n- Avg. Gear Quality: Poor \n- Clothing Budget: 90-280 \n- Weapon Budget: 60-200 \n- Available Weapons: Club, Knife \n- Age Range: Any \n- Never carries food. Occasionally has wooden prostheses.";
                ViewUpdater.subDesc = "Pirate: These units are encountered most frequently in the early game, but you'll see these units throughout the game. All easily dispatched once you get armor and high-grade weapons.";
                Intent ToPages = new Intent(Pirates.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        scavengerGunnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Scavenger Gunner";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/26/Scavenger1557.png";
                ViewUpdater.desc = "- Combat Power: 45 \n- Gear Health: 40-110% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 300-800 \n- Weapon Budget: 100-160 \n- Available Weapons: Club, Gladius, Knife, Mace \n- Age Range: Any \n- Rarely has wooden prostheses.";
                ViewUpdater.subDesc = "Pirate: These units are encountered most frequently in the early game, but you'll see these units throughout the game. All easily dispatched once you get armor and high-grade weapons.";
                Intent ToPages = new Intent(Pirates.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        scavengerThrasherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Scavenger Thrasher";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/bd/Thrasher1557.png";
                ViewUpdater.desc = "- Combat Power: 45 \n- Gear Health: 40-110% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 300-500 \n- Weapon Budget: 200-300 \n- Autopistol, Bolt-action rifle, Machine pistol, Pump shotgun, Revolver \n- Age Range: Any \n- Rarely has wooden prostheses.";
                ViewUpdater.subDesc = "Pirate: These units are encountered most frequently in the early game, but you'll see these units throughout the game. All easily dispatched once you get armor and high-grade weapons.";
                Intent ToPages = new Intent(Pirates.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        pirateGunnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Pirate Gunner";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/31/Pirate1557.png";
                ViewUpdater.desc = "- Combat Power: 65 \n- Gear Health: 70-230% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 400-1000 \n- Weapon Budget: 250-345 \n- Available Weapons: Autopistol, Bolt-action rifle, Incendiary launcher, Machine pistol, Pump shotgun, Revolver \n- Age Range: Up to 65 \n- Rarely has wooden or standard prostheses.";
                ViewUpdater.subDesc = "Pirate: These units are encountered most frequently in the early game, but you'll see these units throughout the game. All easily dispatched once you get armor and high-grade weapons.";
                Intent ToPages = new Intent(Pirates.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });
    }
}
