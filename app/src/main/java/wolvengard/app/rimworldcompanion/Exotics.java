package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Exotics extends AppCompatActivity {
    Button glitterworld2;
    Button personaCore;
    Button warhead;
    Button tusk;
    Button healerMech;
    Button neurotrainerMech;
    Button resurrectorMech;
    Button subpersonaCore;
    Button thrumboHorn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exotics);

        glitterworld2 = findViewById(R.id.btn_glitterworld2);
        glitterworld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Glitterworld medicine is produced using highly advanced techniques and technology only found on Glitterworlds. It is the most powerful medicine in RimWorld, being 60% more powerful than ordinary medicine, and over twice as powerful as herbal medicine. Like other medicines, glitterworld medicine is used in doctoring practices.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/c6/Glitterworld_medicine.png";
                ViewUpdater.name = "Glitterworld Medicine";
                ViewUpdater.subDesc = "A kit of advanced ultra-tech medical supplies, probably manufactured on a distant glitterworld. It contains advanced polymorphic drugs, nanite diagnostic and healing assisters, a mini-imager, and various multi-use tools.";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        personaCore = findViewById(R.id.btn_core);
        personaCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "The AI persona core is a highly valuable component used to build the ship computer core, which is one of the ship parts required to get off the planet. It can only be found in an item stash world quest, or earned as a reward for completing quests for other factions. From Beta 19 onwards you may also pay other allied factions a cost of 1500 silver for the location of one.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/f/f2/AI_persona_core.png";
                ViewUpdater.subDesc = "A hyper-advanced computer core that houses a superhumanlike artificial intelligence. In its isolated state the core is dormant. Installed in a proper support structure, however, it can become a mind of frightening power.";
                ViewUpdater.name = "AI Persona Core";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        warhead = findViewById(R.id.btn_warhead);
        warhead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "The antigrain warhead is a mortar shell that can be fired by using a mortar or used as material to make an IED antigrain warhead trap. It detonates in a 15-tile radius dealing 400 damage and causes fire. Said explosion might occur in your base if the warhead is damaged down to 20 hp or is left to deteriorate to nothing. As with all mortar shells, it is heavily advised that you do not leave this in an area where it can deteriorate or come under fire, or you might find that large parts of your base no longer exist and you are missing a very rare item.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/97/Antigrain_warhead.png";
                ViewUpdater.subDesc = "A tiny ultra-tech warhead usually used by spacecraft or glitterworld war machines. Powered by a grain of antimatter, it creates a huge explosion and starts fires around the target. Can be fired from mortars or installed as a trap. Explodes when damaged.";
                ViewUpdater.name = "Antigrain Warhead";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        tusk = findViewById(R.id.btn_tusk);
        tusk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "An elephant tusk is ivory obtained from butchering an elephant. Tusks can be sold to exotic goods traders, or used as a melee weapon.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/30/Elephant_tusk.png";
                ViewUpdater.subDesc = "An elephant's tusk. Very durable and valuable. Deadly but somewhat unwieldy as a weapon.";
                ViewUpdater.name = "Elephant Tusk";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        healerMech = findViewById(R.id.btn_healer);
        healerMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "The Healer mech serum is an item that can be awarded from quests. Pawns can be directed to use it, or it can be administered by medical procedure. When used, it instantly removes the most severe health problem on the pawn, with few exceptions. If there are no healable conditions, the serum will still be used up.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b2/Healer_mech_serum.png";
                ViewUpdater.subDesc = "A one-use super-dose of mechanites tuned to heal health conditions. The mechanites will target and heal the single worst health condition affecting someone at any given time. Works even on health conditions that would otherwise be incurable. The mechanites can even transmute themselves into organic matter, forming new limbs or organs as needed.";
                ViewUpdater.name = "Healer Mech Serum";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        neurotrainerMech = findViewById(R.id.btn_neurotrainer);
        neurotrainerMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "The neurotrainer mech serum is a rare item that will substantially increase a single, specific skill of the colonist using the serum. It will then be used up and disappear. Each serum is attuned to one specific skill and will increase this skill only, which is given as part of the name, as in \"melee neurotrainer mech serum\".";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/2d/Neurotrainer_mech_serum.png";
                ViewUpdater.subDesc = "A one-use super-dose of mechanites tuned to train a specific skill. The dose is administered through the orbit of the eye. Once released into the brain, the mechanites quickly improve the subject's skills in a specific area, transmuting themselves into neural tissue as needed.";
                ViewUpdater.name = "Neurotrainer Mech Serum";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        resurrectorMech = findViewById(R.id.btn_resurrector);
        resurrectorMech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "The resurrector mech serum is an item found in quests that can resurrect any deceased human or animal.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/d/d8/Resurrector_mech_serum.png";
                ViewUpdater.subDesc = "A one-use super-dose of mechanites tuned to resurrect the dead. Administered to a corpse soon after death, mechanites repair broken-down tissues and kickstart the body back to life. Unfortunately, the resurrected sometimes come back with brain damage, blindness, or progressive psychosis. Outcomes are better when the mechanites are administered to a fresher body. Well-preserved bodies can be resurrected, even long after death.";
                ViewUpdater.name = "Resurrector Mech Serum";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        subpersonaCore = findViewById(R.id.btn_techprof);
        subpersonaCore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "A techprof subpersona core instantly completes the current research project when used.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/8b/Techprof_subpersona_core.png";
                ViewUpdater.subDesc = "A small AI core housing a low-grade subpersona specialized in teaching technology. When used, the AI will teach you the technology you're currently researching, instantly and for free. Can only be used once";
                ViewUpdater.name = "Techprof Subpersona Core";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        thrumboHorn = findViewById(R.id.btn_thrumbo_horn);
        thrumboHorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Dropped by thrumbos after butchering, the thrumbo horn is a fairly powerful melee weapon which can be sold for a hefty amount of silver to Exotic Goods Traders.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/0/0c/Thrumbo_horn.png";
                ViewUpdater.subDesc = "A thrumbo's horn. It's razor sharp, very hard, and priceless in most markets. This is a true trophy.";
                ViewUpdater.name = "Thrumbo Horn";
                Intent intent = new Intent(Exotics.this, EntityInfo.class);
                startActivity(intent);
            }
        });
    }
}
