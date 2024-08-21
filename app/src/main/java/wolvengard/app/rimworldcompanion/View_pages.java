package wolvengard.app.rimworldcompanion;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.example.rimworldcompanion.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class View_pages extends AppCompatActivity {
    private Group categoryButtons;
    private Group itemsButtons;
    private Group resourcesButtons;
    private ViewGroup rootLayout;
    private FragmentContainerView RecordListFragment;

    private static final Map<String, String> iconUrls = new HashMap<>();
    private static final Map<String, View.OnClickListener> clickListeners = new HashMap<>();

    private static final String GEAR = "Gear";
    private static final String RESOURCES = "Resources";
    private static final String TECHNOLOGY = "Technology";
    private static final String BUILDING = "Building";
    private static final String CHARACTERS = "Characters";
    private static final String FLORA = "Flora";
    private static final String FAUNA = "Fauna";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pages);

        categoryButtons = findViewById(R.id.CategoryButtons);
        itemsButtons = findViewById(R.id.ItemsButtons);
        resourcesButtons = findViewById(R.id.ResourceButtons);
        rootLayout = findViewById(R.id.rootLayout);
        RecordListFragment = findViewById(R.id.RecordListFragment);

        initializeIconUrls();
        setupClickListeners();
        setupBackButtonHandler();

        for (int i = 0; i < rootLayout.getChildCount(); i++) {
            View view = rootLayout.getChildAt(i);
            if (view instanceof ImageButton) {
                String viewName = getResources().getResourceEntryName(view.getId());
                String iconUrl = iconUrls.get(viewName);
                if (iconUrl != null) {
                    Glide.with(this).load(iconUrl).into((ImageButton) view);
                }
                view.setOnClickListener(clickListeners.get(viewName));
            }
        }

        for (int i = 0; i < rootLayout.getChildCount(); i++) {
            View view = rootLayout.getChildAt(i);
            if (view instanceof Button) {
                String viewName = getResources().getResourceEntryName(view.getId());
                String url = "https://rimworldwiki.com/wiki/" + viewName;

                view.setOnClickListener(v -> displayRecords(viewName));
            }
        }
    }

    private void initializeIconUrls() {
        iconUrls.put(GEAR, "https://rimworldwiki.com/images/4/40/CowboyHat.png");
        iconUrls.put(RESOURCES, "https://rimworldwiki.com/images/3/33/Woodlog_c.png");
        iconUrls.put(TECHNOLOGY, "https://rimworldwiki.com/images/thumb/7/73/LongRangeMineralScanner.png/72px-LongRangeMineralScanner.png");
        iconUrls.put(BUILDING, "https://rimworldwiki.com/images/2/28/Granite_blocks.png");
        iconUrls.put(CHARACTERS, "https://rimworldwiki.com/images/thumb/b/b0/Colonist.png/72px-Colonist.png");
        iconUrls.put(FLORA, "https://rimworldwiki.com/images/thumb/7/72/Alocasia_a.png/72px-Alocasia_a.png");
        iconUrls.put(FAUNA, "https://rimworldwiki.com/images/thumb/b/b3/Turkey.png/72px-Turkey.png");
    }

    private void setupClickListeners() {
        clickListeners.put(GEAR, view -> showButtons(itemsButtons));
        clickListeners.put(RESOURCES, view -> showButtons(resourcesButtons));
    }

    private void setupBackButtonHandler() {
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                if (categoryButtons.getVisibility() == View.VISIBLE) {
                    setEnabled(false);
                    getOnBackPressedDispatcher().onBackPressed();
                } else {
                    showButtons(categoryButtons);
                }
            }
        });
    }

    private void displayRecords(String pageName){
        String url = "https://rimworldwiki.com/wiki/" + pageName;

        new Thread(() -> {
            try {
                Document doc = Jsoup.connect(url).get();

                Element table = doc.select("table").first();
                Elements rows = table.select("tr");

                for (Element row : rows) {
                    Elements cells = row.select("td");

                    if (!cells.isEmpty()) {
                        String buttonText = cells.get(0).text();

                        Button button = new Button(this);
                        button.setText(buttonText);

                        runOnUiThread(() -> RecordListFragment.addView(button));
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }


    private void showButtons(Group groupToShow) {
        categoryButtons.setVisibility(View.GONE);
        itemsButtons.setVisibility(View.GONE);
        resourcesButtons.setVisibility(View.GONE);
        groupToShow.setVisibility(View.VISIBLE);
    }
}