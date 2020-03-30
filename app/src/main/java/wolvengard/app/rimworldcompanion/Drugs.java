package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drugs extends AppCompatActivity {

    Button ambrosia;
    Button beer;
    Button flake;
    Button glitterworld;
    Button gojuice;
    Button herbal;
    Button medicine;
    Button neutroamine;
    Button penox;
    Button psychite;
    Button smokeleaf;
    Button wakeup;
    Button yayo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drugs);

        ambrosia = findViewById(R.id.btn_ambrosia);
        ambrosia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Ambrosia is a raw drug (not a vegetarian food) that can be harvested only after an ambrosia sprout event (also available through trade), but cannot be grown by the player. It provides a +5 mood buff, +50% to joy and is slightly addictive. Ambrosia does spoil if not refrigerated.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/a2/Ambrosia.png";
                ViewUpdater.name = "Ambrosia";
                ViewUpdater.subDesc = "A soft fruit. Ambrosia has a wonderful smell and taste, and produces a soft chemical high, which increases mood. However, it is slightly addictive if eaten too often.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        beer = findViewById(R.id.btn_beer);
        beer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Beer is a beverage product that provides a little food replenishment and joy. While not so nutritionally effective, its main use is to improve a colonist's mood to prevent mental breaks. But, overuse may lead to alcohol addiction. The default drug policy setting is both for addicted and for joy. \n\n Beer is produced in three steps: \n\n1- Plant hops, which is an easy task. \n\n2-Construction of a brewery (research required), to process 25 hops for 5 units of wort, a task that requires a cook to perform the action, another relatively easy task assuming the colony has enough meals to divert the cook to other purposes. \n\n3- Place 25 units of wort into a fermenting barrel for 10 days. The difficulty of this depends greatly on your biome and its current weather conditions, as the room hosting the barrels must be kept between -1 °C (30.2 °F) and 32 °C (89.6 °F). Temperatures below this value will only halt the process, but any above it will waste the whole product and all the previous work.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b3/Beer.png";
                ViewUpdater.name = "Beer";
                ViewUpdater.subDesc = "The first beverage besides water ever consumed by mankind. Beer can taste good, but its main effect is intoxication. Excessive consumption can lead to alcohol addiction.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        flake = findViewById(R.id.btn_flake);
        flake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "A flaky substance that can be smoked to induce a short but powerful euphoric state. Flake provides an incredible +35 mood buff while it remains in the user's system. It is a cheaper and less powerful version of yayo but has a significantly higher addiction rate which makes using this drug somewhat impractical.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/69/Flake.png";
                ViewUpdater.name = "Flake";
                ViewUpdater.subDesc = "A flaky substance that can be smoked to induce a short but powerful euphoric state. While it is cheap to produce, it is exceptionally addictive.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        glitterworld = findViewById(R.id.btn_glitterworld);
        glitterworld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Glitterworld medicine is produced using highly advanced techniques and technology only found on Glitterworlds. It is the most powerful medicine in RimWorld, being 60% more powerful than ordinary medicine, and over twice as powerful as herbal medicine. Like other medicines, glitterworld medicine is used in doctoring practices.\n\n In terms of its optimal use in regards to its medical potency: Glitterworld medicine is best used in surgical operations and bringing people from the brink of death when it comes to diseases such as the dreaded plague. In the case of wound treatment and normal disease treatment, it is significantly overkill unless you have a highly incompetent doctor who simply can't get the job done with ordinary medicine.\n\nThe only way to obtain it is to purchase it from exotic goods traders or faction bases for around 55 - 70 silver";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/c6/Glitterworld_medicine.png";
                ViewUpdater.name = "Glitterworld Medicine";
                ViewUpdater.subDesc = "A kit of advanced ultra-tech medical supplies, probably manufactured on a distant glitterworld. It contains advanced polymorphic drugs, nanite diagnostic and healing assisters, a mini-imager, and various multi-use tools.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        gojuice = findViewById(R.id.btn_gojuice);
        gojuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Go-Juice is a drug that can be purchased, found on raiders, or manufactured at a drug lab. It acts as a potent stimulant and pain-killer, reducing pain by 90% and boosting consciousness, movement, and sight. It has a significant impact on combat performance due to the mobility improvement, along with the enhancement to sight and consciousness which are vital for shooting accuracy. \n\nThe high for go-juice lasts 1.875 days from 75% severity (one injection), but can last as long as 2.5 days from 100% severity (multiple injections). One can get addicted to Go-Juice even without any tolerance build up; no injection of Go-juice is without risk of addiction.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/2a/Go-juice.png";
                ViewUpdater.name = "Go-juice";
                ViewUpdater.subDesc = "A synthetic combat drug developed for space marines during the early days of interplanetary warfare. Go-juice blocks pain and increases the user's melee and shooting abilities. It also enhances movement speed.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        herbal = findViewById(R.id.btn_herbal);
        herbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Herbal medicine is an organic medicine used in doctoring to improve the results of medical treatment over not using medicine at all, but is significantly less effective than medicine and glitterworld medicine. In addition, herbal medicine will spoil if not frozen.\nHerbal medicine can either be harvested from healroot or purchased from neolithic traders.\n\n Herbal medicine is a cost-efficient choice for treating injuries or minor illness, where its maximun tend quality of 70% will suffice. If a sick colonist's immunity is sufficiently far ahead of the disease progress, herbal medicine can be used in place of better medicine.\n\nUnder most circumstances it is not practical to use herbal medicine for surgery, as a 60% medical potency means surgery has a greater chance to fail, unless when using your most enhanced doctors.\nHerbal medicine can be used to make medicine when combined with cloth and neutroamine at a drug lab, which requires somebody who has at least 4 intellectual and 4 crafting in order to do.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/af/Herbal_medicine.png";
                ViewUpdater.name = "Herbal Medicine";
                ViewUpdater.subDesc = "A pack of herbal concoctions typically extracted from the healroot plant. It is less potent than industrial pharmaceuticals, but much better than nothing.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        medicine = findViewById(R.id.btn_medicine);
        medicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Medicine can either be purchased from traders, looted from raiders, or crafted at a drug lab using 3 cloth, 1 herbal medicine and 1 neutroamine (skill requirement: intellectual 4+ and crafting 4+). Superior to herbal medicine but inferior to glitterworld medicine.\n\nBest used for treating diseases and infections; misused if for standard injuries (unless a colonist is bleeding out faster than the herbal medicine completes to patch the wound).\nGood enough for surgical operations in many cases, with a low chance of failure. If the doctor is bionic-enhanced, trauma savant, drug-enhanced or inspired then you can guarantee 100% success rate for most surgeries.\nIt is adequate against plague and malaria with ordinary beds so long as the patients are resting full-time, well-fed, constantly treated and the doctor is healthy with medicine skill 8+.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/27/Medicine.png";
                ViewUpdater.name = "Medicine";
                ViewUpdater.subDesc = "A kit of industrial-era medical equipment. It contains basic drugs, tools for suturing and bone setting, diagnostic devices, and various pads and fluids.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        neutroamine = findViewById(R.id.btn_neutroamine);
        neutroamine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Neutroamine is an item only available from traders and cargo pods. It can be combined with herbal medicine and cloth to create standard medicine, or synthesize various drugs with it at a drug lab, such as Penoxycyline and wake-up.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/94/Neutroamine.png";
                ViewUpdater.name = "Neutroamine";
                ViewUpdater.subDesc = "A synthetic precursor chemical. Useless on its own, many drugs require neutroamine as an ingredient.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        penox = findViewById(R.id.btn_penox);
        penox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Penoxycyline can either be crafted at a drug lab (however skill points progress is attributed to Intellectual) or purchased from traders. Administering Penoxycyline provides true immunity against diseases over its duration, preventing the protected pawn from catching the protected diseases. It does nothing to stop a disease that has started and is already in progress. Since diseases have a hidden latent stage, taking penoxycyline during this stage still results in a full-blown infection.\n\nWhile the description says to take every five days, the effect actually lasts for around 5.556 days, giving you some time to take the pills without receiving an illness during the downtime of the effect (if administered every 5 days).\nPenoxycyline is not addictive and proper usage does not result in other consequences.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/99/Penoxycyline.png";
                ViewUpdater.name = "Penoxycyline";
                ViewUpdater.subDesc = "A drug for preventing diseases from starting. Blocks malaria, sleeping sickness, and plague. Take every five days. Note: This drug does nothing to cure existing infections - it only prevents new ones.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        psychite = findViewById(R.id.btn_psychite);
        psychite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Psychite tea is a tea made at a fueled stove or electric stove using 4 psychoid leaves with requirement of minimum 2 Cooking skill. It provides a simple +12 mood buff as well as slightly reduces pain (10% reduction) and tiredness (20% reduction). It raises Recreation by 40. Production of this drug gives skill points in Intellectual. To produce it, a player should research Psychoid Brewing first.\n\n In comparison:\nIt is less cost-efficient than the other psychoid drugs, flake and yayo, as it is worth the least and takes the longest to make. However, its minor research requirement makes it good in the early game, and it does not require a drug lab. This is an especially good option for tribal colonies, who start the game with psychoid brewing already researched.\nIt is also much less addictive than flake or yayo. Psychite tea has only 2% chance to be addicted per drink - the same as smokeleaf - without smokeleaf's penalties to movement and consciousness. A colonist can drink one every 2 days with a very low chance of becoming addicted.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/28/Psychite_tea.png";
                ViewUpdater.name = "Psychite Tea";
                ViewUpdater.subDesc = "A fragrant tea infused with leaves of the psychoid plant. Drinking it induces a subtle psychite euphoria. this tea is easy to produce at cooking facilities, but can produce psychite addiction if consumed too often. Many tribes use psychite tea, both as a daily energizer and part of social and religious rituals";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        smokeleaf = findViewById(R.id.btn_smokeleaf);
        smokeleaf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "The Smokeleaf joint is a drug of low addiction rate that can be crafted on a crafting spot using 4 Smokeleaf leaves (but does not improve Crafting skill) from early stage as it doesn't require any research (unlike other drugs). It can also be crafted in a Drug lab at an higher speed. Consumption will generate the \"I'm, like, stoned, man.\" thought which has a +13 mood effect and affects the body with:\n=Pain: -20%\n=Consciousness: -30%\n=Moving: -10%\n=Hunger rate: x130%\n\nThe default drug policy is set to \"Social drugs\", which allows colonists to smoke a toke whenever they feel like it for joy and social purposes.\nConsumption of one smokeleaf joint every two days will not cause dependency. Those with visible tolerance will develop asthma or carcinoma in the lungs in a mean time of 180 days.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/d/d3/Smokeleaf_joint.png";
                ViewUpdater.name = "Smokeleaf Joints";
                ViewUpdater.subDesc = "Smokeleaf leaves prepared in small rolls for smoking. The drug improves mood, but also increases appetite, reduces focus and slows movement. Smokeleaf use can produce a dependency. Can be produced without equipment, at a crafting spot.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        wakeup = findViewById(R.id.btn_wakeup);
        wakeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "An addictive stimulant. Fills the need for rest, and allows users to work for extended periods without getting tired. Addiction causes reduced mental performance and, sometimes, psychotic breaks with reality. Can cause heart attacks rarely.\n\nWake-up is a highly addictive drug that can be purchased, found on raiders, or manufactured at a drug lab. It is a powerful stimulant that fully satisfies one's need for rest, slows the tiredness progression rate, and boosts consciousness, movement, and global work speed. The high for wake-up typically lasts 12 in-game hours from 75% severity (one pill), but can last as long as 16 hours from 100% severity (multiple pills). One can only get addicted to Wake-up if they have at least an 8% tolerance to it. Therefore, a pawn may safely consume one pill per 3 days without risk of becoming addicted. It may be preferable to manually take each pill, both to get the most out of the complete satisfaction of the need to rest but also to make sure that a pawn only consumes a pill after exactly 3 days have passed.\nWhile high on wake-up, there is a small chance the pawn will develop a heart attack. It occurs on average once every 120 days the colonist is high.\nA surgeon can take Wake-up to improve their surgery success chance due to the consciousness enhancement, so it may not be the worst of ideas to have them take a pill beforehand. Taking a hit of Go-juice stacks with it as well for better buffs, though you risk a drug overdose this way, ruining the stat buffs.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ef/Wake-up.png";
                ViewUpdater.name = "Wakeup";
                ViewUpdater.subDesc = "An addictive stimulant. Fills the need for rest, and allows users to work for extended periods without getting tired. Addiction causes reduced mental performance and, sometimes, psychotic breaks with reality.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });

        yayo = findViewById(R.id.btn_yayo);
        yayo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.titleStatus = true;
                ViewUpdater.desc = "Yayo is a drug of 10% addiction rate that can be produced at a drug lab with 8 psychoid leaves after researching Psychite refining. Consumption will generate the Feeling pumped! Let's do this! thought which has a +35 mood effect and affects the body with:\n=Moving: +15%\n=Improves joy 80%\n=Suppresses pain x50%\n=Reduces need for rest 40%\n\nThose with visible tolerance to psychite, will develop chemical damage in the kidneys in a mean time of 120 days.";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b7/Yayo.png";
                ViewUpdater.name = "Yayo";
                ViewUpdater.subDesc = "A fine white powder snorted to produce a euphoric high. Yayo reduces the user's need for rest, and suppresses pain. It is, however, addictive.";
                Intent intent = new Intent(Drugs.this, EntityInfo.class);
                startActivity(intent);
            }
        });
    }
}
