package com.example.brandme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.ArrayList;


public class Home extends AppCompatActivity {

    private ArrayList<ExampleItem> nExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        createExampleList();
        buildRecyclerView();

    }
    private void filter(String text) {
        ArrayList<ExampleItem> filteredList = new ArrayList<>();

        for (ExampleItem item : nExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter2.filterList2(filteredList);
    }

    private void createExampleList() {
        nExampleList = new ArrayList<>();
        nExampleList.add(new ExampleItem(R.drawable.car, "Vehicle"));
        nExampleList.add(new ExampleItem(R.drawable.motorcycle, "Motorcycle"));
        nExampleList.add(new ExampleItem(R.drawable.bycicle, "Bicycle"));
        nExampleList.add(new ExampleItem(R.drawable.phone, "Mobile Phones"));
        nExampleList.add(new ExampleItem(R.drawable.computer, "Computer"));
        nExampleList.add(new ExampleItem(R.drawable.game2, "Game Console"));
        nExampleList.add(new ExampleItem(R.drawable.bag, "Bag"));
        nExampleList.add(new ExampleItem(R.drawable.jewel, "Jewelry"));
        nExampleList.add(new ExampleItem(R.drawable.perfume2, "Perfume"));
        nExampleList.add(new ExampleItem(R.drawable.makeup, "Makeup kit"));
        nExampleList.add(new ExampleItem(R.drawable.cream, "Body Cream"));
        nExampleList.add(new ExampleItem(R.drawable.waist, "Waist Trainer"));
        nExampleList.add(new ExampleItem(R.drawable.shoe, "Shoe"));
        nExampleList.add(new ExampleItem(R.drawable.cloth, "Cloth"));
        nExampleList.add(new ExampleItem(R.drawable.wig, "Wig"));
        nExampleList.add(new ExampleItem(R.drawable.whiskey, "Whiskey"));
        nExampleList.add(new ExampleItem(R.drawable.wine, "Wine"));
    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter2 = new ExampleAdapter(nExampleList);


        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                String Body = "Share and Download this App";
                String Sub = "http://play.google.com";
                intent.putExtra(Intent.EXTRA_TEXT, Body);
                intent.putExtra(Intent.EXTRA_TEXT, Sub);
                startActivity(Intent.createChooser(intent, "Share using"));
                break;
            case R.id.more:
                String developerName = "Lorddra";
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:" + developerName)));
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=")));
                }
            case R.id.exit:
                finish();
                break;
            case R.id.rate:
                Uri uri = Uri.parse("http://play.google.com/store/apps/details?id=");
                Intent i = new Intent(Intent.ACTION_VIEW, uri);
                try {
                    startActivity(i);
                }catch (ActivityNotFoundException e){
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=")));
                }
        }
        return super.onOptionsItemSelected(item);
    }
}