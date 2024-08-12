package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Mercenaries extends AppCompatActivity {

    Button grenadierButton;
    Button empGrenadierButton;
    Button mercenaryGunnerButton;
    Button sniperButton;
    Button slasherButton;
    Button heavyMercButton;
    Button eliteMercButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercenaries);

        grenadierButton = findViewById(R.id.btn_mercenaries_grenadier);
        empGrenadierButton = findViewById(R.id.btn_mercenaries_empgrenadier);
        mercenaryGunnerButton = findViewById(R.id.btn_mercenaries_mercenarygunner);
        sniperButton = findViewById(R.id.btn_mercenaries_mercenarysniper);
        slasherButton = findViewById(R.id.btn_mercenaries_slasher);
        heavyMercButton = findViewById(R.id.btn_mercenaries_heavymercenary);
        eliteMercButton = findViewById(R.id.btn_mercenaries_elitemercenary);

        grenadierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Grenadier";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ed/Grenadier1557.png";
                ViewUpdater.desc = "- Combat Power: 55 \n- Gear Health: 70-230% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 400-700 \n- Weapon Budget: 500 \n- Available Weapons: Frag grenades, Molotov cocktails \n- Age Range: Up to 65 \n- Rarely has wooden or standard prostheses";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        empGrenadierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The EMP Grenadier";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ef/EMPGrenadier2056.png";
                ViewUpdater.desc = "- Combat Power: 65 \n- Gear Health: 70-230% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 400-700 \n- Weapon Budget: 500 \n- Available Weapons: EMP grenades \n- Age Range: Up to 65 \n- Rarely has wooden or standard prostheses";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        mercenaryGunnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Mercenary Gunner";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b0/Gunner1557.png";
                ViewUpdater.desc = "- Combat Power: 90 \n- Gear Health: 70-320% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 1000-1500 \n- Weapon Budget: 330-650 \n- Available Weapons: Assault rifle, Autopistol, Bolt-action rifle, Chain shotgun, Heavy SMG, Incendiary launcher, LMG, Machine pistol, Pump shotgun, Revolver \n- Age Range: Up to 65 \n- Occasionally has standard prostheses or bionics.";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        sniperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Mercenary Sniper";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/f/fc/Sniper1557.png";
                ViewUpdater.desc = "- Combat Power: 110 \n- Gear Health: 70-320% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 1000-1500 \n- Weapon Budget: 600 \n- Available Weapons: Sniper rifle \n- Age Range: Up to 65 \n- Occasionally has standard prostheses or bionics.";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        slasherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Mercenary Slasher";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/e7/Slasher1557.png";
                ViewUpdater.desc = "- Combat Power: 150 \n- Gear Health: 70-320% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 300-1400 \n- Weapon Budget: 200-500 \n- Available Weapons: Gladius, Longsword, Mace, Spear \n- Age Range: Up to 65 \n- Always has shield belt. Occasionally has standard prostheses or bionics.";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        heavyMercButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Heavy Mercenary";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ee/Heavy1557.png";
                ViewUpdater.desc = "- Combat Power: 150 \n- Gear Health: 70-320% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 200-350 \n- Weapon Budget: 1200 \n- Available Weapons: Doomsday rocket launcher, Minigun, Triple rocket launcher \n- Age Range: Up to 65 \n- Occasionally has standard prostheses or bionics.";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        eliteMercButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Elite Mercenary";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/59/Elite1557.png";
                ViewUpdater.desc = "- Combat Power: 150 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 2500-3500 \n- Weapon Budget: 500-1400 \n- Available Weapons: Assault rifle, LMG \n- Age Range: Up to 45 \n- May have bionics. Bosses are functionally identical and may be faction leader.";
                ViewUpdater.subDesc = "Mercenaries: Elite units typically encountered from mid-game onwards. Joins the Outlanders or Pirates in their ranks.";
                Intent ToPages = new Intent(Mercenaries.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });
    }
}
