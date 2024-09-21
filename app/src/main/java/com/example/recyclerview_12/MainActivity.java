package com.example.recyclerview_12;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Info> infoList = new ArrayList<Info>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        setInitialData();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new InfoAdapter(getApplicationContext(), infoList));
    }

    private void setInitialData()
    {
        infoList.add(new Info("AK-47", "Мощный автомат с высоким уроном.", R.drawable.ak));
        infoList.add(new Info("Deagle", "Точный автомат с глушителем.", R.drawable.deaglee));
        infoList.add(new Info("M4A1-S", "Универсальный автомат с высокой скорострельностью.", R.drawable.m4));
        infoList.add(new Info("M4A4", "Мощный пистолет с высокой отдачей.", R.drawable.m4a4));
        infoList.add(new Info("Revolver", "Пистолет с высоким уроном и низкой скорострельностью.", R.drawable.revolver));
        infoList.add(new Info("SG 553", "Точный автомат с высоким уроном на дальних дистанциях.", R.drawable.sg));
    }
}