package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mechanoids extends AppCompatActivity {

    Button scytherButton;
    Button lancerButton;
    Button centipedeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanoids);

        scytherButton = findViewById(R.id.btn_scythers);
        lancerButton = findViewById(R.id.btn_lancers);
        centipedeButton = findViewById(R.id.btn_centipedes);

        scytherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Scyther";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/1/17/Scyther1557.png";
                ViewUpdater.desc = "- Combat Power: 160 \n- Gear Health: 100% \n- Avg. Gear Quality: X \n- Clothing Budget: X \n- Weapon Budget: X \n- Available Weapons: Melee (Blades) \n- Age Range: Any";
                ViewUpdater.subDesc = "Mechanoids: Mechanical enemies that neither feel pain nor seek cover.";
                Intent ToPages = new Intent(Mechanoids.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        lancerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Lancer";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b4/Lancer2056.png";
                ViewUpdater.desc = "- Combat Power: 160 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: X \n- Weapon Budget: 9999 \n- Available Weapons: Charge lance \n- Age Range: Any:";
                ViewUpdater.subDesc = "Mechanoids: Mechanical enemies that neither feel pain nor seek cover.";
                Intent ToPages = new Intent(Mechanoids.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        centipedeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Centipede";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/f/f3/Centipede1557.png";
                ViewUpdater.desc = "- Combat Power: 400 \n- Gear Health: 100% \n- Avg. Gear Quality: Normal \n- Clothing Budget: X \n- Weapon Budget: 9999 \n- Heavy charge blaster, Inferno cannon \n- Age Range: Any";
                ViewUpdater.subDesc = "Mechanoids: Mechanical enemies that neither feel pain nor seek cover.";
                Intent ToPages = new Intent(Mechanoids.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });
    }
}
