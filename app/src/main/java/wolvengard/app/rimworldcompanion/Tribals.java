package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Tribals extends AppCompatActivity {

    Button penitentButton;
    Button archerButton;
    Button warriorButton;
    Button hunterButton;
    Button berserkerButton;
    Button heavyArcherButton;
    Button archerChiefButton;
    Button berserkerChiefButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tribals);

        penitentButton = findViewById(R.id.btn_tribals_penitent);
        archerButton = findViewById(R.id.btn_tribals_archer);
        warriorButton = findViewById(R.id.btn_tribals_warrior);
        hunterButton = findViewById(R.id.btn_tribals_hunter);
        berserkerButton = findViewById(R.id.btn_tribals_berserker);
        heavyArcherButton = findViewById(R.id.btn_tribals_heavyarcher);
        archerChiefButton = findViewById(R.id.btn_tribals_archerchief);
        berserkerChiefButton = findViewById(R.id.btn_tribals_berserkerchief);

        penitentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Penitent";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/e2/Penitent2056.png";
                ViewUpdater.desc = "- Combat Power: 35 \n- Gear Health: 20-110% \n- Avg. Gear Quality: Poor \n- Clothing Budget: 50-100 \n- Weapon Budget: 90-150 \n- Available Weapons: Club, Knife \n- Age Range: Up to 60 \n- Occasionally has wooden prostheses.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        archerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Archer";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/bd/Archer1557.png";
                ViewUpdater.desc = "- Combat Power: 48 \n- Gear Health: 50-180% \n- Avg. Gear Quality: Poor \n- Clothing Budget: 180-350 \n- Weapon Budget: 80 \n- Available Weapons: Shortbow \n- Age Range: Up to 60 \n- Rarely has wooden prostheses.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        warriorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Warrior";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/a7/Warrior1557.png";
                ViewUpdater.desc = "- Combat Power: 60 \n- Gear Health: 50-180% \n- Avg. Gear Quality: Poor \n- Clothing Budget: 200-300 \n- Weapon Budget: 150 \n- Available Weapons: Ikwa \n- Age Range: Up to 60 \n- Always has a war veil.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        hunterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Hunter";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/7/7e/Hunter1722.png";
                ViewUpdater.desc = "- Combat Power: 65 \n- Gear Health: 50-180% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 200-300 \n- Weapon Budget: 100 \n- Available Weapons: Recurve bow \n- Age Range: Up to 60 \n- Always has war veil. Tribal traders are based on this pawn, though they have tribal headdresses instead.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        berserkerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Berserker";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/48/Berserker1722.png";
                ViewUpdater.desc = "- Combat Power: 90 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 200-550 \n- Weapon Budget: 300 \n- Available Weapons: Spear \n- Age Range: Up to 60 \n- Always has war mask.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        heavyArcherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Heavy Archer";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/e0/HeavyArcher1722.png";
                ViewUpdater.desc = "- Combat Power: 90 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 200-550 \n- Weapon Budget: 250 \n- Available Weapons: Greatbow, Pila \n- Age Range: Up to 60 \n- Always has war mask.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        archerChiefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Archer Chief";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/e0/Chief1557.png";
                ViewUpdater.desc = "- Combat Power: 130 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 450-750 \n- Weapon Budget: 500-1000 \n- Available Weapons: Greatbow \n- Age Range: At least 30 \n- Always has tribal headdress and plate armor. Difficult to recruit. Can be faction leader.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        berserkerChiefButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Berserker Chief";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/25/MeleeChief2056.png";
                ViewUpdater.desc = "- Combat Power: 130 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: 450-750 \n- Weapon Budget: 500-1000 \n- Available Weapons: Longsword, Spear \n- Age Range: At least 30 \n- Always has tribal headdress and plate armor. Difficult to recruit. Can be faction leader.";
                ViewUpdater.subDesc = "Tribals: Tribal fighters, weak but expendable. They never carry silver or medicine.";
                Intent ToPages = new Intent(Tribals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });
    }
}
