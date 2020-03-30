package wolvengard.app.rimworldcompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


// Class to change layout depending on attacker type.
public class EntityInfo extends AppCompatActivity {

    private ImageView entityImage;
    private TextView entityDescription;
    private TextView entityTitle;
    private TextView entitySubDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entity_info);

        this.entityImage = findViewById(R.id.entityImage);
        this.entityDescription = findViewById(R.id.entityDesc);
        this.entityTitle = findViewById(R.id.entityName);
        this.entitySubDesc = findViewById(R.id.entitySubDesc);

        entitySubDesc.setMovementMethod(new ScrollingMovementMethod());
        entityDescription.setMovementMethod(new ScrollingMovementMethod());
        UpdateView();
    }

    private void SetImage(String imagename) {
        Glide.with(this).load(ViewUpdater.imagename).into(entityImage);
    }

    private void SetTitle(String name) {
        this.entityTitle.setText(name);
    }

    private void SetDescription(String desc) {
        this.entityDescription.setText(desc);
    }

    private void SetFaction(String desc) { this.entitySubDesc.setText(desc); }

    private void TitleStatus (Boolean bool) {
        if (bool) {this.entitySubDesc.setVisibility(View.VISIBLE); }
        else{this.entitySubDesc.setVisibility(View.GONE); }
    }

    private void UpdateView() {
        SetImage(ViewUpdater.imagename);
        SetDescription(ViewUpdater.desc);
        SetTitle(ViewUpdater.name);
        SetFaction(ViewUpdater.subDesc);
        TitleStatus(ViewUpdater.titleStatus);
    }
}

