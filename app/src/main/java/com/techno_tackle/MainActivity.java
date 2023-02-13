package com.techno_tackle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.techno_tackle.utills.BaseActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    RecyclerView rv_doctors;

    LayoutAdapter adapter;

    List<Items> itemsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv_doctors = findViewById(R.id.rv_doctors);

        rv_doctors.setLayoutManager(new LinearLayoutManager(this));
        rv_doctors.setHasFixedSize(true);

        itemsList.add(new Items(R.drawable.doctor_01,"Dr. Tharani","Cardio Specialist | Hts Hospital","4.9","(4,874 reviews)"));
        itemsList.add(new Items(R.drawable.doctor_02,"Dr. jereena","Cardio Specialist | Hts Hospital","4.9","(4,874 reviews)"));
        itemsList.add(new Items(R.drawable.doctor_03,"Dr. Dhuruv","Cardio Specialist | Hts Hospital","4.9","(4,874 reviews)"));
        itemsList.add(new Items(R.drawable.doctor_04,"Dr. Vinitha","Cardio Specialist | Hts Hospital","4.9","(4,874 reviews)"));
        itemsList.add(new Items(R.drawable.doctor_05,"Dr. jereena","Cardio Specialist | Hts Hospital","4.9","(4,874 reviews)"));
        itemsList.add(new Items(R.drawable.doctor_06,"Dr. Dhuruv","Cardio Specialist | Hts Hospital","4.9","(4,874 reviews)"));

        adapter = new LayoutAdapter(this, itemsList);
        rv_doctors.setAdapter(adapter);
    }
}