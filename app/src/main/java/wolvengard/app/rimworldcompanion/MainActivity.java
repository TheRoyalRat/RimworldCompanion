package wolvengard.app.rimworldcompanion;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rimworldcompanion.R;

public class MainActivity extends AppCompatActivity {
    Button btn_view;
    Button btn_product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_view = findViewById(R.id.btn_view); //From Title to View Pages.
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(MainActivity.this, View_pages.class);
                startActivity(ToPages);
            }
        });

        btn_product = findViewById(R.id.btn_product); //From Title to View Pages.
        btn_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ToPages = new Intent(MainActivity.this, ProductInfo.class);
                startActivity(ToPages);
            }
        });
    }
}
