package com.example.avengermovieapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycleView);

        arrayList.add(new ModelClass(R.drawable.captain_america,"Captain America","Hindi/English","2:43","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.iron_man_1,"Iron Man 1","Hindi/English","2:33","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.iron_man_2,"Iron Man 2","Hindi/English","2:13","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.increadiable_hulk,"Hulk","Hindi/English","2:00","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.ant_man,"Ant Man","Hindi/English","2:21","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.first_image,"Avenger","Hindi/English","2:56","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.captain_marvel,"captain Marvel","Hindi/English","2:02","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.doctor_starnge,"Doctor Strange","Hindi/English","2:14","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.thor_the_dark_world,"Thor","Hindi/English","3:00","Hotstar"));
        arrayList.add(new ModelClass(R.drawable.spider_man,"Spider Man","Hindi/English","3:00","Hotstar"));

        CustomAdapter adapter=new CustomAdapter(arrayList,this);
        recyclerView.setAdapter(adapter);


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);


    }
}