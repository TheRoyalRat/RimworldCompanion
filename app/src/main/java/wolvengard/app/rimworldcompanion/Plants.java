package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class Plants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plants);

        Button agariluxButton = findViewById(R.id.btn_agarilux);
        Button agaveButton =  findViewById(R.id.btn_agave);
        Button ambrosiaButton = findViewById(R.id.btn_ambrosia);
        Button astragalusButton =  findViewById(R.id.btn_astragalus);
        Button berryButton = findViewById(R.id.btn_berry);
        Button bushButton = findViewById(R.id.btn_bush);
        Button cocoaButton = findViewById(R.id.btn_cocoa);
        Button cornButton = findViewById(R.id.btn_corn);
        Button cottonButton = findViewById(R.id.btn_cotton);
        Button dandelionButton = findViewById(R.id.btn_dandelion);
        Button daylilyButton = findViewById(R.id.btn_daylily);
        Button devilstrandButton = findViewById(R.id.btn_devilstrand);
        Button glowstoolButton = findViewById(R.id.btn_glowstool);
        Button grassButton = findViewById(R.id.btn_grass);
        Button hayButton = findViewById(R.id.btn_hay);
        Button healrootButton = findViewById(R.id.btn_healroot);
        Button hopButton = findViewById(R.id.btn_hop);
        Button mossButton = findViewById(R.id.btn_moss);
        Button pinButton = findViewById(R.id.btn_pin_cactus);
        Button potatoButton = findViewById(R.id.btn_potato);
        Button psychoidButton = findViewById(R.id.btn_psychoid);
        Button riceButton = findViewById(R.id.btn_rice);
        Button roseButton = findViewById(R.id.btn_rose);
        Button smokeleafButton = findViewById(R.id.btn_smokeleaf);
        Button strawberryButton = findViewById(R.id.btn_strawberry);
        Button tallgrassButton = findViewById(R.id.btn_tall_grass);


        agariluxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Agarilux";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/thumb/f/f5/Agarilux.png/64px-Agarilux.png";
                ViewUpdater.desc = "An Agarilux, is a wild plant that only spawns inside caves and cannot be grown by the player. It has a slow grow time, and harvesting a fully grown specimen produces up to 35 raw fungus. It reproduces by spores to nearby dark areas. After a certain growth period it emits 41% light source on spot.";
                ViewUpdater.subDesc = "An enormous purple mushroom. Its size and glowing protrusions make this fungus beautiful to look at. It dies when exposed to light.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        agaveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Agave";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/47/Agave.png";
                ViewUpdater.desc = "Agave is a plant that naturally occurs in arid shrublands, deserts, and extreme deserts. As with any other bush-type plant; agave's growth progress goes back to 30% when harvested, and agave can't be grown by the player. A mature agave plant yields 10 pieces of agave fruit.";
                ViewUpdater.subDesc = "A large-leafed desert plant with edible flowers and stalks.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        ambrosiaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Ambrosia Bush";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/c6/Ambrosia_bush.png";
                ViewUpdater.desc = "Ambrosia bushes are an exotic plant in RimWorld which only naturally occur through the ambrosia sprout event, and therefore can't be grown by the player. A mature ambrosia bush yields 4 pieces of ambrosia fruit.";
                ViewUpdater.subDesc = "A rarely-sprouting bush which yields the ambrosia fruit. Ambrosia is pleasurable to eat and produces a slightly addictive chemical warmth effect.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        astragalusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Astralagus";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ee/Astragalus.png";
                ViewUpdater.desc = "A small perennial wildflower that grows in alpine climates.";
                ViewUpdater.subDesc = "A cool name for such a boring plant.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        berryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Berry Bush";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/e/ee/Berry_bush.png";
                ViewUpdater.desc = "Berry bushes are a plant that naturally occurs in arid shrublands, boreal forests, temperate forests, tropical rainforests, and tundras. A berry bush's growth progress goes back to 30% when harvested, and they can't be grown by the player. A mature berry bush yields 10 berries.";
                ViewUpdater.subDesc = "A bushy wild plant which yields delicious berries. Berries can be cooked, but they're also good to eat even when raw.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        bushButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Bush";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/a/a1/Bush.png";
                ViewUpdater.desc = "A short shrub which provides 25% cover bonus. Bland, but better than no cover.";
                ViewUpdater.subDesc = "B u s h.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cocoaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Cocoa Tree";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/thumb/c/cf/Oak_tree.png/64px-Oak_tree.png";
                ViewUpdater.desc = "The Cocoa trees is a plant not native to any biome, and can be grown to produce chocolate. Unlike most trees, cutting them down does not yield any useful wood. Also unlike trees, when exposed to extreme temperatures, instead of going dormant, they will die like any crop. Provides recreation when consumed, but has low nutrition value and can't be used as a cooking ingredient.";
                ViewUpdater.subDesc = "A tropical tree that produces chocolate, genetically engineered to sweeten its own product, and survive in slightly less-warm climates.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cornButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Corn Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/3/31/Corn_plant.png";
                ViewUpdater.desc = "The corn plant has a long growing cycle and a very high yield of 22 pieces of corn. It cannot be sown in hydroponics. Corn has the second-highest base yield per day (approx. 2.7% less than rice), but requires the least farming labor to maintain due to its long growing cycle.";
                ViewUpdater.subDesc = "A large grain plant which produces ears of delicious yellow seeds. Takes a relatively long time to grow, but yields lots of food, and takes a long time to spoil. Needs fertile soil to grow well.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        cottonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Cotton Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/86/Cotton_plant.png";
                ViewUpdater.desc = "The cotton plant is a player-growable production crop with a moderate yield, and slightly longer growing cycle. A mature cotton plant yields 10 cloth.  ";
                ViewUpdater.subDesc = "Yields cotton, a fine plant fiber used to make cloth.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        dandelionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Dandelion";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/8d/Dandelions.png";
                ViewUpdater.desc = "Dandelions can't be planted in pots, unlike roses and daylilies. They can however be grown in growing zones, usually as quick-growing grazing animal feed.";
                ViewUpdater.subDesc = "A common small flower. Though it is often considered a weed, it is pleasant to look at, and easy to grow.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        daylilyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Daylily";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/b8/Daylily.png";
                ViewUpdater.desc = "A kind of plant that can provide lots of beauty, but needs to be replanted often. It can be grown indoors, simply using the light from standing lamps.";
                ViewUpdater.subDesc = "Not to be confused with Lemons.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        devilstrandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Devilstrand Mushroom";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/f/f3/Devilstrand_mushroom.png";
                ViewUpdater.desc = "Devilstrand is a player-growable production crop with a low yield, and very long growing cycle. Can't be sown in hydroponics, and is immune to blight. Mature devilstrand yields 6 devilstrand.";
                ViewUpdater.subDesc = "This fragile mushroom was genetically engineered to produce a silk net of the highest grade. Long rumored to have mystical properties, it owes its name to the greed it inspires in people.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        glowstoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Glowstool Mushroom";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/4a/Glowstool.png";
                ViewUpdater.desc = "A small brown mushroom typically found in caves. It smells like an old, dirty rag pulled from the stomach of a rotting muffalo - but it tastes surprisingly good when cooked. Dies when exposed to light.";
                ViewUpdater.subDesc = "Good for eating, not for smelling.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        grassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Grass";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/c5/Grass.png";
                ViewUpdater.desc = "Wild grass. Grows anywhere there is a little light and minimally fertile ground.";
                ViewUpdater.subDesc = "G r a s s.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        hayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Haygrass";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/2/25/Haygrass.png";
                ViewUpdater.desc = "Haygrass is a player-growable food crop with a high yield, and a slightly longer growing cycle. Haygrass can't be sown in hydroponics. Mature haygrass yields 18 hay.";
                ViewUpdater.subDesc = "A mixture of nutrient-rich grasses which yield large amounts of hay. Hay is edible for animals, but not humans.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        healrootButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Healroot Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/c9/Healroot.png";
                ViewUpdater.desc = "Planted in the growing zone or hydroponics basins and yields herbal medicine. Sowing healroot requires a minimum growing skill of 8, but any colonist capable of plant cutting can harvest them. Each healroot plant yields 1 herbal medicine when fully grown. Harvesting it early results in a chance of failing to receive anything from the harvest even though it is not marked as failed.";
                ViewUpdater.subDesc = "A slow-growing plant which yields herbal medicine when harvested.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        hopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Hop Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/c/ce/Hop_plant.png";
                ViewUpdater.desc = "A plant that when harvested, yields hops that can then be used to produce beer. Hop plants can be planted in a growing zone or a hydroponics basin.";
                ViewUpdater.subDesc = "A flowering plant that yields hops, an essential ingredient in beer.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        mossButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Moss";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/64/Moss.png";
                ViewUpdater.desc = "Moss is a wild plant found in the tundra and boreal forests. It's only edible by plant-eating animals.";
                ViewUpdater.subDesc = "Make sure to not slip on it!";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        pinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Pincushion Cactus";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/9/94/Pincushion_cactus.png";
                ViewUpdater.desc = "Short cactus, so named because it resembles a pincushion. It doesn't give any materials when cut using the cut plants order.";
                ViewUpdater.subDesc = "Not an actual pincushion. Use your prisoners for that.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        potatoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Potato Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/5/52/Potato_plant.png";
                ViewUpdater.desc = "The Potato Plant is a domesticated plant which yields 11 potatoes at 100% growth.";
                ViewUpdater.subDesc = "A simple, highly nutritious tuber. Grows well even in somewhat poor soil. Harvests quickly. A strong, versatile crop.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        psychoidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Psychoid Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/6/67/Psychoid_plant.png";
                ViewUpdater.desc = "A leafy plant. Its leaves can be brewed into psychite tea and refined into flake and yayo.";
                ViewUpdater.subDesc = "A leafy plant which generates the chemical compound psychite. Originally evolved as a defense mechanism to ward off plant-eating animals by overstimulating and sickening them, the psychite drug can be extracted and refined into various forms for recreational use. It is addictive.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        riceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Rice Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/84/Rice_plant.png";
                ViewUpdater.desc = "Rice plants yields up to 6 rice after 3 days (or 5.54 days when accounting for nightly resting period) until harvest, making it the most productive crop and the fastest food supply to establish a colony, ideal for limited growing seasons, but also makes it the most labor-intensive plant to farm.";
                ViewUpdater.subDesc = "A low grain plant that thrives in rich soil and yields food fast, but is not nice to eat uncooked.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        roseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Roses";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/4/4f/Rose.png";
                ViewUpdater.desc = "A rose is a thorny plant that yields a large red flower often associated with love. It can be planted in growing zones and plant pots, and increases the beauty of the general area it is planted in.";
                ViewUpdater.subDesc = "Turn every day into Valentine's Day.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        smokeleafButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Smokeleaf Plant";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/8/8b/Smokeleaf_plant.png";
                ViewUpdater.desc = "Smokeleaf leaves can be prepared into joints at a crafting spot.";
                ViewUpdater.subDesc = "A leafy plant cultivated for its psychological effects. Smokeleaf leaves can be prepared into joints at the crafting spot.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        strawberryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "The Strawberry Bush";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/d/dc/Strawberry_plant.png";
                ViewUpdater.desc = "Unlike wild raspberry bushes, strawberry plants are completely removed when harvested and must be replanted to be harvested again. Strawberries are greatly affected by fertility of the soil, and as such, they are best suited to be grown in hydroponics basins, where their yield outperforms all other crops except rice.";
                ViewUpdater.subDesc = "A fragile but tasty fruit. Delicious even when raw.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });

        tallgrassButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ViewUpdater.name = "Tall Grass";
                ViewUpdater.imagename = "https://rimworldwiki.com/images/b/bf/Tall_grass.png";
                ViewUpdater.desc = "Wild tall grass. Significantly slows down anyone moving over it.";
                ViewUpdater.subDesc = "Don't worry, there's no Pokemon hiding inside it.";
                Intent ToPages = new Intent(Plants.this, EntityInfo.class);
                startActivity(ToPages);
            }
        });
    }
}
