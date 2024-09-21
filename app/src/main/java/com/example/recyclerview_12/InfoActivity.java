package com.example.recyclerview_12;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        String GunName = getIntent().getStringExtra("gun_name");
        String GunDescription = getIntent().getStringExtra("gun_description");

        TextView countryTV = findViewById(R.id.gun);
        TextView capitalTV = findViewById(R.id.gun_description);

        if (GunName != null && GunDescription != null) {
            countryTV.setText(GunName);
            capitalTV.setText(GunDescription);
        }
    };
}