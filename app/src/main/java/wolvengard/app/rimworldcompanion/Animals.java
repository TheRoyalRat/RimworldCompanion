package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Animals extends AppCompatActivity {

    Button alpacaButton;
    Button alphaBeaverButton;
    Button arcticFoxButton;
    Button arcticWolfButton;
    Button boomalopeButton;
    Button boomratButton;
    Button capybaraButton;
    Button caribouButton;
    Button cassowaryButton;
    Button catButton;
    Button chickenButton;
    Button chinchillaButton;
    Button cobraButton;
    Button cougarButton;
    Button cowButton;
    Button deerButton;
    Button dromedaryButton;
    Button elephantButton;
    Button elkButton;
    Button emuButton;
    Button fennecFoxButton;
    Button gazelleButton;
    Button grizzlyBearButton;
    Button hareButton;
    Button huskyButton;
    Button ibexButton;
    Button iguanaButton;
    Button labradorRetrieverButton;
    Button lynxButton;
    Button megascarabButton;
    Button megaspiderButton;
    Button megaslothButton;
    Button monkeyButton;
    Button muffaloButton;
    Button ostrichButton;
    Button pantherButton;
    Button pigButton;
    Button polarBearButton;
    Button raccoonButton;
    Button ratButton;
    Button redFoxButton;
    Button rhinocerosButton;
    Button snowhareButton;
    Button spelopedeButton;
    Button squirrelButton;
    Button thrumboButton;
    Button timberWolfButton;
    Button tortoiseButton;
    Button turkeyButton;
    Button wargButton;
    Button wildBoarButton;
    Button yorkshireTerrierButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        alpacaButton = findViewById(R.id.btn_alpaca);
        alphaBeaverButton = findViewById(R.id.btn_alphabeaver);
        arcticFoxButton = findViewById(R.id.btn_arctic_fox);
        arcticWolfButton = findViewById(R.id.btn_arctic_wolf);
        boomalopeButton = findViewById(R.id.btn_Boomalope);
        boomratButton = findViewById(R.id.btn_boomrat);
        capybaraButton = findViewById(R.id.btn_Capybara);
        caribouButton = findViewById(R.id.btn_caribou);
        cassowaryButton = findViewById(R.id.btn_cassowary);
        catButton = findViewById(R.id.btn_cat);
        chickenButton = findViewById(R.id.btn_chicken);
        chinchillaButton = findViewById(R.id.btn_chinchilla);
        cobraButton = findViewById(R.id.btn_cobra);
        cougarButton = findViewById(R.id.btn_cougar);
        cowButton = findViewById(R.id.btn_cow);
        deerButton = findViewById(R.id.btn_deer);
        dromedaryButton = findViewById(R.id.btn_dromedary);
        elephantButton = findViewById(R.id.btn_elephant);
        elkButton = findViewById(R.id.btn_elk);
        emuButton = findViewById(R.id.btn_emu);
        fennecFoxButton = findViewById(R.id.btn_fennec_fox);
        gazelleButton = findViewById(R.id.btn_gazelle);
        grizzlyBearButton = findViewById(R.id.btn_grizzly_bear);
        hareButton = findViewById(R.id.btn_hare);
        huskyButton = findViewById(R.id.btn_husky);
        ibexButton = findViewById(R.id.btn_ibex);
        iguanaButton = findViewById(R.id.btn_iguana);
        labradorRetrieverButton = findViewById(R.id.btn_labrador_retriever);
        lynxButton = findViewById(R.id.btn_lynx);
        megascarabButton = findViewById(R.id.btn_megascarab);
        megaspiderButton = findViewById(R.id.btn_megaspider);
        megaslothButton = findViewById(R.id.btn_megasloth);
        monkeyButton = findViewById(R.id.btn_monkey);
        muffaloButton = findViewById(R.id.btn_muffalo);
        ostrichButton = findViewById(R.id.btn_ostrich);
        pantherButton = findViewById(R.id.btn_panther);
        pigButton = findViewById(R.id.btn_pig);
        polarBearButton = findViewById(R.id.btn_polar_bear);
        raccoonButton = findViewById(R.id.btn_raccoon);
        ratButton = findViewById(R.id.btn_rat);
        redFoxButton = findViewById(R.id.btn_red_fox);
        rhinocerosButton = findViewById(R.id.btn_rhinoceros);
        snowhareButton = findViewById(R.id.btn_snowhare);
        spelopedeButton = findViewById(R.id.btn_spelopede);
        squirrelButton = findViewById(R.id.btn_squirrel);
        thrumboButton = findViewById(R.id.btn_thrumbo);
        timberWolfButton = findViewById(R.id.btn_timber_wolf);
        tortoiseButton = findViewById(R.id.btn_tortoise);
        turkeyButton = findViewById(R.id.btn_turkey);
        wargButton = findViewById(R.id.btn_warg);
        wildBoarButton = findViewById(R.id.btn_wild_boar);
        yorkshireTerrierButton = findViewById(R.id.btn_yorkshire_terrier);

        alpacaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Alpaca";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/9f/Alpaca.png";
                ViewUpdater.desc = "Alpacas can be found in Arid Shrubland, Temperate Forest and Tropical Rainforest. They can either be tamed by a handler or self-tame in a random event. Alpacas can be sheared once every 15 days, giving 100 pieces of alpaca wool worth 270 silver. The ease of maintaining alpacas makes it a cheap source of decent quality wool (250% hot/cold) for your colony.";
                ViewUpdater.subDesc = "A medium-sized ungulate closely related to the llama, the alpaca is often farmed for its remarkably soft wool.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        alphaBeaverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Dendrovore: Alphabeaver";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/5a/AlphaBeaver.png";
                ViewUpdater.desc = "Instead of silently spawning as other animals do, Alphabeavers appear in a group only when the Alphabeavers event triggers. Their hunger bar depletes so rapidly that they must eat at a near constant rate - and they eat nothing but trees, including any you are farming. Alphabeavers will not attack your structures, so you may construct walls to resolve the issue.";
                ViewUpdater.subDesc = "A large beaver-like creature genetically engineered to harvest wood with machine-like efficiency. In the absence of specialized feed, these animals will enter a manic state that compels them to eat trees whole.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        arcticFoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Arctic Fox";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/e1/Arctic_fox.png";
                ViewUpdater.desc = "Arctic foxes can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Arctic foxes have two attacks: scratch (paw), bite (teeth), and a blunt attack (head). In addition to the base damage, scratches and bites apply a stun for 280 ticks (4.67 secs).";
                ViewUpdater.subDesc = "A small predator adapted for cold climates. It usually hunts small game like mice and voles, sometimes burrowing through a meter of snow to reach its prey.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        arcticWolfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Arctic Wolf";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/42/Arctic_wolf.png";
                ViewUpdater.desc = "The arctic wolf is a pack hunter but it's often seen alone or in pairs in-game. They live in boreal forests, tundras, ice sheets and sea ice.";
                ViewUpdater.subDesc = "An arctic variant of the old Earth wolf. As pack hunters, wolves have a complex social life and are fiercely intelligent.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        boomalopeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Boomalope ";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/2f/Boomalope.png";
                ViewUpdater.desc =  "Boomalopes are herbivores with a high hunger rate. They produce chemfuel and explode when dying. Boomalopes can be found in Arid Shrubland, Desert, Temperate Forest and Tropical Rainforest. They can either be tamed by a Handler or self-tame in a random event. Tamed boomalopes (including males) can be milked to produce chemfuel, at a rate of 12 every 2 days.";
                ViewUpdater.subDesc = "Engineered for chemicals production, the boomalope grows a large sac of volatile chemicals on its back. Though it is weak and fragile for its size, other animals have learned to avoid it because of the huge explosion it produces when it dies.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        boomratButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Boomrat";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/0/05/Boomrat.png";
                ViewUpdater.desc = "Boomrats inhabit arid shrublands and temperate forests. They create a powerful fire-starting explosion when killed, including when they are slaughtered, so be careful of that. Boomrats are best hunted while it is raining because the rain will extinguish the fire that they make when they die, saving the colonists the job of putting it out. ";
                ViewUpdater.subDesc = "Either by deliberate genetic weaponization, or as an unusual defense mechanism, these rodent-like creatures create a powerful fire-starting explosion when killed.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        capybaraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Capybara";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/6e/Capybara.png";
                ViewUpdater.desc = "Capybaras can be found in Tropical Rainforest only. They can either be tamed by a handler or self-tame in a random event. Capybaras can be bought and sold in other fraction bases and from exotic goods traders. Capybaras purchased from traders will be already tamed.";
                ViewUpdater.subDesc = "The largest natural rodent, the capybara is well-adapted for steaming jungle environments.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        caribouButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Caribou";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/27/Caribou.png";
                ViewUpdater.desc = "Caribou can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Female caribou can be milked once every 2 days and when milked they give 12 milk.";
                ViewUpdater.subDesc = "A large member of the deer family, well-adapted to life in cold climates.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cassowaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Cassowary";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/5c/Cassowary.png";
                ViewUpdater.desc = "Cassowary can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship or trade caravans. Cassowary lay a clutch of 1 cassowary egg every 20 days. Cassowary have two attacks: scratch (feet) and bite (beak). In addition to the base damage, both attacks apply a stun for 20 ticks (0.33 secs).";
                ViewUpdater.subDesc = "A large flightless bird with brightly-colored feathers. While it looks beautiful, its kick is vicious.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        catButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore & Ovivore: Cat";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/0/05/Cat.png";
                ViewUpdater.desc = "Cats can randomly join your colony in an event, or bought pre-tamed from a trading ship or trade caravans. Cats have two attacks: scratch (paw) and bite (teeth). In addition to the base damage, both attacks apply a stun for 20 ticks (0.33 secs). Aka not enough for rats.";
                ViewUpdater.subDesc = "One of mankind's first pets, the cat is a small mammal which hunts vermin. Known for their aloofness, cats are nevertheless popular companions because of their independence, calm disposition, and fine, pettable fur.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });


        chickenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Chicken";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/a3/Chicken.png";
                ViewUpdater.desc = "Chickens can not be found in the wild; they must be bought from a merchant or join the colony in a self-taming event. Hens will happily lay unfertilized eggs without a rooster or they can be bred to start chicken farming.  If you also have a rooster, he may fertilize eggs before a hen lays them. These eggs will then hatch into a chick, so long as it is left alone and does not experience extreme temperatures (Less than 0C, greater than 50C).";
                ViewUpdater.subDesc = "The most traditional farm bird, the chicken is raised for its eggs and meat.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        chinchillaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Chinchilla";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/e8/Chinchilla.png";
                ViewUpdater.desc = "Chinchillas can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship or trade caravans. By far, hands down, the cutest man hunter event.";
                ViewUpdater.subDesc = "A small, nimble rodent famous for its exceptionally soft fur.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cobraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Cobra";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/0/0e/Cobra.png";
                ViewUpdater.desc = "Cobras are a carnivorous and ovivorous snakes found only in tropical rainforest. Their bite causes toxic buildup. ";
                ViewUpdater.subDesc = "A large predatory snake. Cobras can be highly aggressive if provoked, and their bite injects toxic venom into the victim.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cougarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carniviore: Cougar";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/55/Cougar.png";
                ViewUpdater.desc = "Cougars can be tamed wild, randomly join your colony in an event, or be bought pre-tamed from a trading ship. When being tamed they have a base 10% chance to attack the tamer.";
                ViewUpdater.subDesc = "One of the most dangerous big cats, cougars are solitary hunters with long, sharp teeth and claws. They stalk prey from hidden positions before pouncing. While humans are not their normal diet, they won't turn down a meal of vulnerable human meat.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Cow";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/84/Cow.png";
                ViewUpdater.desc = "Cows don't spawn in the wild and thus cannot be tamed. They can only be obtained via trading or received through the animal self-taming event. A cow can be milked for up to 15 units of milk per day (depending on your pawns animals skill) which means that a single cow can provide enough nutrition for one and a half meals a day if cooked into a simple meal, or three meals if cooked into a fine meal.";
                ViewUpdater.subDesc = "A very common domestic animal. It can produce large amounts of milk, or be slaughtered for delicious food.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        deerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Deer";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/27/Deer.png";
                ViewUpdater.desc = "Deer are herding herbivores that are only found in the temperate and boreal forests. Although the male of the species (The Buck) appears slightly larger than the doe, they both actually have the same body size, and the relevant stats (body HP, leather yield, meat yield).";
                ViewUpdater.subDesc = "A medium-sized herding herbivore. Deer are very quick.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        dromedaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Dromedary";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/6a/Dromedary.png";
                ViewUpdater.desc = "Desert-dwelling, shrub-eating quadrupeds, dromedaries are one-humped camels. They can often be found in small herds. Dromedaries can be sheared once every 25 days, producing 100 camelhair. Female dromedaries can be milked once every 2 days, producing 10 milk.";
                ViewUpdater.subDesc = "Adapted to survival in arid environments, this distant cousin of the horse can go weeks without water.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        elephantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Elephant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/thumb/6/60/Elephant.png/180px-Elephant.png";
                ViewUpdater.desc = "Elephants are large land animals often found in arid shrublands. They have two Elephant tusks which are highly priced in the ivory market and can be butchered for trade.";
                ViewUpdater.subDesc = "The largest unmodified land animal. It can use its tusks as tools for moving objects - or as deadly weapons.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        elkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Elk";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/32/Elk.png";
                ViewUpdater.desc = "Elk are a large species of herbivore that appear in herds. They have a Muffalo's tolerance to subzero temperatures so they are quite comfortable living in the cold biomes of the boreal forest and tundra. Female elk can be milked once every 2 days, producing 12 milk.";
                ViewUpdater.subDesc = "A large member of the deer family, well-adapted to life in cold climates.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        emuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Emu";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/5d/Emu.png";
                ViewUpdater.desc = "Emu can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Emu lay a clutch of 1 emu egg every 18 days.";
                ViewUpdater.subDesc = "A large flightless bird with beady eyes on its ugly face. With its bad attitude, it is the jerk of the natural world.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        fennecFoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Fennec Fox";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ea/Fennec_fox.png";
                ViewUpdater.desc = "Fennec foxes can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship.";
                ViewUpdater.subDesc = "A small fox originally from the northern part of Earth's Africa continent. It hunts small creatures and has very large ears for cooling itself in the heat.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        gazelleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Gazelle";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/4a/Gazelle.png";
                ViewUpdater.desc = "Gazelle can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship.";
                ViewUpdater.subDesc = "A small, extremely quick antelope known for its amazingly long leap.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        grizzlyBearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Grizzly Bear";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/94/GrizzlyBear.png";
                ViewUpdater.desc = "Grizzly bears can be tamed wild, randomly join your colony in an event, or be bought pre-tamed from a trader. While their usual diet consists of fish, berries, honey and scavenged meat, the grizzly is capable of using its massive strength and deadly claws to kill live prey.";
                ViewUpdater.subDesc = "A huge omnivorous mammal adapted for cold climates. Bears' thick blubber and fur keep them warm in winter.  They are startlingly quick for such lumbering creatures.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        hareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Hare";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/47/Hare.png";
                ViewUpdater.desc = "Hares are a fast-moving cold-loving species found in the boreal forests and tundra. Not being a social creature they are seen foraging for plants alone. Their small bodies with limited health means that they are easily killed with one shot from a bolt-action rifle.";
                ViewUpdater.subDesc = "This small, solitary herbivore can swiftly hop away from danger.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        huskyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore & Ovivore: Husky";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/50/Husky.png";
                ViewUpdater.desc = "The husky is a cold weather canine found on the boreal forest and tundra biomes. They are sometimes selected as a starter pet.";
                ViewUpdater.subDesc = "A large, energetic dog with a thick fur coat for remaining comfortable in arctic environments.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        ibexButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Ibex";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/af/Ibex.png";
                ViewUpdater.desc = "Ibex can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship.";
                ViewUpdater.subDesc = "The hardy wild ancestor of the domesticated goat. Ibexes live on marginal territory that most antelopes couldn't survive, eating lichens and sparse mountain plants. They're famous for dextrously hopping across bare cliff faces - and for their violent ramming attack.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        iguanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Iguana";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/af/Iguana.png";
                ViewUpdater.desc = "Iguanas are solitary omnivorous lizards that live in the warm dry climates of the arid shrubland, desert, and extreme desert. Despite their small size, their scratch and bite attacks are twice that of the squirrel's.";
                ViewUpdater.subDesc = "These large lizards normally feed on plant matter. However, when angered, their tough hide and sharp claws make them quite dangerous.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        labradorRetrieverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore & Ovivore: Labrador Retriever";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/1/1f/Labrador_retriever.png";
                ViewUpdater.desc = "Labrador retrievers are a species of highly trainable breed of canine. They are sometimes selected as the starter animal. Labrador retrievers are notable for not having a minimum skill level to tame.";
                ViewUpdater.subDesc = "A very versatile, medium-sized dog. Originally bred to retrieve birds shot on the hunt, the lab is also an excellent guard dog, play pal, and family friend.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        lynxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore & Ovivore: Lynx";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b8/Lynx.png";
                ViewUpdater.desc = "Lynx can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Lynxes are fast and will always turn manhunter upon being attacked. Their fur is the 3rd highest in terms of insulation (1.15x), with only Arctic Wolfskin (1.25x) and Thrumbofur (1.35x) being better in the Leathers category.";
                ViewUpdater.subDesc = "A wildcat larger than a housecat, but smaller than a cougar. Lynxes survive on a diet of small birds and animals. Their very warm fur keeps them safe from the brutally cold temperatures of their frozen territories.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        megaspiderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Megaspider";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/cc/Megaspider.png";
                ViewUpdater.desc = "Megaspiders spawn in three circumstances; in caves, when opening an ancient shrine or during an infestation.";
                ViewUpdater.subDesc = "Not actually a spider, the megaspider is a genetically-engineered giant insectoid the size of a bear. Designed for heavy work and combat, its thick chitinous armor makes it hard to kill, while its long deadly ripper-blades make it deadly. It is, however, quite slow in open terrain.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        megascarabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Megascarab";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/42/Megascarab.png";
                ViewUpdater.desc = "Megascarabs are found in regular and extreme deserts, infestations or inside ancient shrines, including inside the caskets. They are ground beetles of metallic color that posses elytra, a protective shell resistant to blunt damage by 10% and sharp damage by 40%.";
                ViewUpdater.subDesc = "A large, genetically-engineered beetle. Once the worker caste of an artificial ecosystem of insectoids designed to fight mechanoid invasions, it is now usually seen without its deadlier insectoid cousins. Still, its size and hard shell make it dangerous when it attacks. A eusocial creature, it cannot reproduce individually.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        megaslothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Megasloth";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/37/Megatherium.png";
                ViewUpdater.desc = "The Megasloth is the second hardest animal after the Thrumbo to tame and the manhunter chance is higher than the taming chance. Wounding then saving the megasloth is the recommended way to tame one. Although they can only be sheared every 50 days (the longest interval of any shearable animal), they give 400 wool per shearing, making them the most efficient source of wool in the game.";
                ViewUpdater.subDesc = "Giant, solitary herbivores. Long extinct after being wiped out by the natives of Earth's America continent, the megasloth was later brought back using advanced cloning and artificial gestators.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        monkeyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Monkey";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/27/Monkey.png";
                ViewUpdater.desc = "Monkeys are omnivorous primates which live in the tropical rainforest. Their small size and relatively low damage caused by the monkey makes them ill-suited for life as a domesticated animals, as they can neither haul nor fight particularly well. They do produce an almost half a stack of meat when butchered, making them better targets for your hunters rather than your tamers.";
                ViewUpdater.subDesc = "This monkey can use its curly tail to grab on to branches, leaving its hands free to do other things. Monkeys are selfish but clever, and can be trained to carry out fairly complex tasks.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        muffaloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Muffalo";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/thumb/a/a0/Animal_Muffalo_side.png/200px-Animal_Muffalo_side.png";
                ViewUpdater.desc = "Muffalo can be found in Arid Shrubland, Boreal Forest, Ice Sheet, Sea Ice, Temperate Forest and Tundra. They can either be tamed by a Handler or self-tame in a random event. Tamed muffalo can be sheared once each 25 days for 100 muffalo wool. Tamed females can also be milked once each 2 days for 16 milk.";
                ViewUpdater.subDesc = "A large herding herbivore descended from buffalo and adapted for both cold and warm environments. While enraged muffalo are deadly, tamed muffalo are quite docile and can be used as pack animals.Nobody is quite sure why they're blue - it might even be some early genetic modification test that just never got changed.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        ostrichButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Ostrich";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/ad/Ostrich.png";
                ViewUpdater.desc = "Ostriches can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Ostriches lay a clutch of 1 ostrich egg every 23 days.";
                ViewUpdater.subDesc = "The largest unmodified bird species, ostriches are known for their fast run, huge eggs, and powerful kick.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        pantherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore & Ovivore: Panther";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/55/Cougar.png";
                ViewUpdater.desc = "Panthers can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Panthers are medium-sized predators, good guardians when tamed. They can only be found in tropical rainforests.";
                ViewUpdater.subDesc = "An agile and powerful big cat native to the jungles of old Earth. As solitary ambush predators, panthers are masters of taking down both large and small prey. Onlookers tend to focus on their graceful movements, while those in closer contact usually notice their skull-crushing strength.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        pigButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Pig";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/30/Pig.png";
                ViewUpdater.desc = "Pigs are a domesticated animal, obtainable from both land and space traders. Pigs are omnivorous, making them easy to feed. Pigs can be butchered for more meat, produce more leather, and carry a higher market value.";
                ViewUpdater.subDesc = "The pig was one of the first animals domesticated by humans. It is commonly raised for meat and leather, and is easy to feed because of its omnivorous diet. Though pigs are self-serving by disposition, they can be trained in complex tasks.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        polarBearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore & Ovivore: Polar Bear";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/1/1a/Polar_bear.png";
                ViewUpdater.desc = "Polar bears can be tamed wild, randomly join your colony in an event, or be bought pre-tamed from a trader. They are startlingly quick for such lumbering creatures.";
                ViewUpdater.subDesc = "A great white bear that lives in the far north. Their thick blubber and fur keep them warm in winter.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        raccoonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Raccoon";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/7/7c/Raccoon.png";
                ViewUpdater.desc = "The raccoon is a small ground mammal which scavenges for most of its food.";
                ViewUpdater.subDesc = "A small, hardy animal that ranges wide across forests and shrubland. It is happy to break into your garbage container, or your kitchen, to eat almost anything.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        ratButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Rat";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/8b/Rat.png";
                ViewUpdater.desc = "The rat is a small ground mammal which scavenges for most of its food.";
                ViewUpdater.subDesc = "A widely-hated rodent famous for soiling kitchens and spreading disease. Eats almost anything; lives almost anywhere.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        redFoxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Red Fox";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/f/f0/Red_fox.png";
                ViewUpdater.desc = "Red foxes can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship.";
                ViewUpdater.subDesc = "A small solitary canine evolved for hunting small prey in temperate climates.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        rhinocerosButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Rhinoceros";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/33/Rhinoceros.png";
                ViewUpdater.desc = "Rhinoceros are a large species of herbivore that tend to travel alone or in small packs. They are found in the arid shrubland, temperate swamp and temperate forest biomes.";
                ViewUpdater.subDesc = "Despite being herbivorous, this large mammal is very easy to enrage. Once angered, its massive strength and sharp horn make it a brutal opponent. It has more muscle in one leg than most humans do in their whole body.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        snowhareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Snowhare";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/c6/Snowhare.png";
                ViewUpdater.desc = "Snowhares are a fast-moving cold-loving species found on the tundra and ice sheets. Not being a social creature they are seen foraging for plants alone. Their small bodies with limited health means that they are easily killed with one shot from a bolt-action rifle.";
                ViewUpdater.subDesc = "This hardy animal survives the brutal winters of its homelands by burrowing through snow to find edible plants.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        spelopedeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Spelopede";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/34/Spelopede.png";
                ViewUpdater.desc = "Spelopedes can inhabit any terrain where an infestation has spawned. They are dangerous in combat, but slow on open ground.";
                ViewUpdater.subDesc = "A medium-sized bioengineered bug the size of a sheep. The spelopede is the middle caste of a hive, taking care of most work tasks as well as fighting with its digging claws.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        squirrelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Squirrel";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/41/Squirrel.png";
                ViewUpdater.desc = "Squirrels are one of the smallest and generally most harmless animals on rimworlds. Storytellers often make this the target of your first maddened animal encounter, sending it to attack your colonists.";
                ViewUpdater.subDesc = "One of the many hardy, versatile rodent species that follows humankind everywhere it spreads.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        thrumboButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore & Dendrovore: Thrumbo";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/22/Thrumbo.png";
                ViewUpdater.desc = "Thrumbos are large, powerful animals not native to any biome, instead appearing in all biomes through a random event. Thrumbos are sought by hunters for their valuable horn (800 silver) and fur. Their fur makes the most valuable and highly protective clothing (a legendary Parka of Thrumbofur is worth 16,105 silver) and they yield more meat than any other animal when butchered.";
                ViewUpdater.subDesc = "A gigantic, graceful creature of unknown origin. The thrumbo is gentle by nature, but extremely dangerous when enraged. While its long fur is exceptionally beautiful, its hide is also incredibly resistant to damage. Its razor-sharp horn fetches a huge price. Legends say that an old thrumbo is the wisest creature in the universe - it simply chooses not to speak.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        timberWolfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Timber Wolf";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/af/Timber_wolf.png";
                ViewUpdater.desc = "The timber wolf is a pack hunter but often seen alone or in pairs. They live in arid shrubland, boreal forest, tundra and temperate forest biomes.";
                ViewUpdater.subDesc = "A rugged predator long feared by many ancient Earth cultures. As pack hunters, wolves have a complex social life and are fiercely intelligent.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        tortoiseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Tortoise";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/cd/Tortoise.png";
                ViewUpdater.desc = "Tortoises are crawling omnivores which live in the moderate climates of the temperate forest and the sweltering humidity of the tropical rainforest. Its thick shell gives it 35% blunt damage resistance and 50% sharp damage resistance.";
                ViewUpdater.subDesc = "This heavily armored land-dwelling reptile is known for its slow moving speed and surprisingly vicious bite. Because of its natural armor, it is tough to kill and can do serious damage during drawn-out melee fights.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        turkeyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Herbivore: Turkey";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b3/Turkey.png";
                ViewUpdater.desc = "Turkeys can be tamed wild, randomly join your colony in an event, or bought pre-tamed from a trading ship. Turkeys lay a clutch of 1-3 turkey eggs every 11 days.";
                ViewUpdater.subDesc = "A short, fat, flightless bird known for its hilarious 'gobbling' call. It has been long domesticated, but also lives in the wild.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        wargButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Carnivore: Warg";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/27/Warg.png";
                ViewUpdater.desc = "Wargs are cold-loving, wolf-like carnivores that roam through temperate forests, boreal forests, and tundra. While most carnivores can eat meat, corpses, kibble, and meals, Wargs can only eat raw meat and corpses.";
                ViewUpdater.subDesc = "Heavily-muscled wolf-like creatures. If disturbed in the wild, they are very likely to attack. Scientists say wargs are the descendants of weaponized military animals created for population suppression. The superstitious see them as the tools of an angry god.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        wildBoarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore: Wild Board";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/6f/Boar.png";
                ViewUpdater.desc = "Boars are omnivorous wild pigs. They are quite pervasive, being found in boreal and temperate forests, tropical rainforests, and arid shrubland. If slain, they can be butchered for 63 pork and 14 pigskin.";
                ViewUpdater.subDesc = "This hairy omnivore is descended from escaped pigs and evolved for living in the wild. Its tusks make it a better fighter than its domesticated pig cousins. Unfortunately, it is too unruly to be trained in the most complex tasks.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        yorkshireTerrierButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Omnivore & Ovivore: Yorkshire Terrier";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/94/Yorkshire_terrier.png";
                ViewUpdater.desc = "The yorkshire terrier is a small, fluffy dog originally bred for show. They may be chosen as one of the starter pets. Some consider it useless, but the mood boost it gives by nuzzling can outweigh the cost of feeding it.";
                ViewUpdater.subDesc = "A small, even-tempered dog. Originally bred to hunt rats, it later became a show and companionship animal.";
                Intent ToPages = new Intent(Animals.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

    }
}
