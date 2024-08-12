package wolvengard.app.rimworldcompanion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.example.rimworldcompanion.R;

public class ProductInfo extends AppCompatActivity {
    TextView productinfo;
    TextView versioninfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_info);

        productinfo = findViewById(R.id.product_desc);
        versioninfo = findViewById(R.id.version_desc);

        productinfo.setMovementMethod(new ScrollingMovementMethod());
        versioninfo.setMovementMethod(new ScrollingMovementMethod());
    }
}
