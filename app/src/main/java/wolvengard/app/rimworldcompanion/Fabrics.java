package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Fabrics extends AppCompatActivity {

    Button alpacaWool;
    Button camelHair;
    Button cloth;
    Button devilStrand;
    Button hyperWeave;
    Button megaslothWool;
    Button muffaloWool;
    Button synthread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fabrics);

        alpacaWool = findViewById(R.id.btn_alpaca_wool);
        alpacaWool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = false;
                ViewUpdater.name = "Alpaca Wool";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/34/Wool.png";
                ViewUpdater.desc = "Alpaca wool is gathered by animal handlers from tamed alpacas. It's base market value is 2.7 Silver.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        camelHair = findViewById(R.id.btn_camelhair);
        camelHair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = false;
                ViewUpdater.name = "Camel Hair";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/2f/Camelhair.png";
                ViewUpdater.desc = "Camelhair is gathered by animal handlers from tamed dromedary. It's base market value is 2.7 Silver. ";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        cloth = findViewById(R.id.btn_cloth);
        cloth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = false;
                ViewUpdater.name = "Cloth";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/51/Cloth.png";
                ViewUpdater.desc = "A basic plant-based fabric that can be grown by planting the cotton plant. It can be used for creating clothes at the Tailor's workbench, though it does not provide good clothing quality overall. It is also used to make carpet flooring, medicine (after being researched), armchairs or billiards tables.\nWhile players can only grow cotton to harvest light grey cloth, bulk goods traders or faction bases offer dyed cloth for sale. The base market value is 1.5 Silver.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        devilStrand = findViewById(R.id.btn_devilstrand);
        devilStrand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.name = "Devilstrand";
                ViewUpdater.subDesc = "Fabric spun from microfibers extracted from Devilstrand mushrooms. It is very tough, good at insulating, and protects exceptionally well against flame.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/f/f7/Devilstrand.png";
                ViewUpdater.desc = "Devilstrand makes a good mid-late game fabric, as it provides good protection and can be farmed, unlike synthread or hyperweave. \n\nIt is less insulating than anything else but cloth. For insulation, it is recommended that you use wool instead. It is a mediocre cash crop. While netting large amounts of money with each harvest, it takes very long to grow, so it isn't really profitable versus faster growing crops.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        hyperWeave = findViewById(R.id.btn_hyperweave);
        hyperWeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.name = "Hyperweave";
                ViewUpdater.subDesc = "High-tech nano-fibers woven into sheets. It is somewhat heavy, but is incredibly difficult to break. The secrets of its production are known only to the most advanced glitterworld cultures.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b8/Hyperweave.png";
                ViewUpdater.desc = "Top-of-the-shelf, incredibly tough and expensive fabric produced only in high-tech Glitterworlds. The only way to acquire it is via trading, or through random drops. \n\n If you can somehow afford to outfit your colonists with clothing made of this material, then give yourself a pat on the back.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        megaslothWool = findViewById(R.id.btn_megasloth_wool);
        megaslothWool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.name = "Megasloth Wool";
                ViewUpdater.subDesc = "While somewhat coarse, megasloth wool's long fibers make it very strong. It is very warm.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/34/Wool.png";
                ViewUpdater.desc = "Megasloth wool is gathered by animal handlers from tamed megasloth. It's base market value is 2.7 Silver.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        muffaloWool = findViewById(R.id.btn_muffalo_wool);
        muffaloWool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.name = "Muffalo Wool";
                ViewUpdater.subDesc = "Soft, light and provides very good insulation. Wool clothes can keep the body warm even in extreme conditions.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/34/Wool.png";
                ViewUpdater.desc = "Muffalo wool is sheared by animal handlers from tamed muffalos only. Muffalos produce 100 wool every 25 days, so taming them before needed is recommended. The base market value is 2.7 Silver.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });

        synthread = findViewById(R.id.btn_synthread);
        synthread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.name = "Synthread";
                ViewUpdater.subDesc = "Spacer-tech synthetic fabric designed for making ordinary clothes. It is soft, light, strong, and insulates well.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/60/Synthread.png";
                ViewUpdater.desc = "Space age fabric. Cannot be grown, only acquired by trading or through random drops. The starting gear on any New Arrivals scenario is a synthread T-shirt and pants, and occasionally a jacket as well. Some raiders and outlanders will occasionally come wearing synthread apparel, as well.";
                Intent ToPages = new Intent(Fabrics.this, EntityInfo.class);
                startActivity(ToPages);

            }
        });
    }
}
