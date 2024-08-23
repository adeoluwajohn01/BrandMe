package com.example.brandme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import java.util.ArrayList;
import android.os.Bundle;

public class Bicycle extends AppCompatActivity {

    private ArrayList<ExampleItem4> nExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter4 mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicycle);

        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.edittext3);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });
    }

    private void filter(String text) {
        ArrayList<ExampleItem4> filteredList = new ArrayList<>();

        for (ExampleItem4 item : nExampleList) {
            if (item.getText1().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
            else if (item.getText2().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
            else if (item.getText3().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(item);
            }
        }

        mAdapter2.filterList2(filteredList);
    }

    private void createExampleList() {
        nExampleList = new ArrayList<>();
        nExampleList.add(new ExampleItem4(R.drawable.urban, "Urban Terrain", "Top 10", "2017"));
        nExampleList.add(new ExampleItem4(R.drawable.scott, "Scott bike", "Top 10", "1958"));
        nExampleList.add(new ExampleItem4(R.drawable.trek, "Trek", "Top 10", "1976"));
        nExampleList.add(new ExampleItem4(R.drawable.bmc, "BMC", "Top 10", "1986"));
        nExampleList.add(new ExampleItem4(R.drawable.canon, "Cannondale", "Top 10", "1971"));
        nExampleList.add(new ExampleItem4(R.drawable.orbea, "Orbea", "Top 20", "1840"));
        nExampleList.add(new ExampleItem4(R.drawable.mongoose, "Mongoose", "", "1974"));
        nExampleList.add(new ExampleItem4(R.drawable.special, "Specialized", "Top 10", "1974"));
        nExampleList.add(new ExampleItem4(R.drawable.giant, "Giant", "Top 10", "1972"));
        nExampleList.add(new ExampleItem4(R.drawable.gt, "GT", "Top 20", "1972"));
        nExampleList.add(new ExampleItem4(R.drawable.santa, "Santa Cruz", "Top 10", "1993"));
        nExampleList.add(new ExampleItem4(R.drawable.rad, "Rad Power Bikes", "Top 10", "2015"));
        nExampleList.add(new ExampleItem4(R.drawable.electra, "Electra", "", "1993"));
        nExampleList.add(new ExampleItem4(R.drawable.marin, "Marin", "Top 20", "1986"));
        nExampleList.add(new ExampleItem4(R.drawable.felt, "Felt", "", "1994"));
        nExampleList.add(new ExampleItem4(R.drawable.ride, "Ride1Up", "", "2019"));
        nExampleList.add(new ExampleItem4(R.drawable.cervelo, "Cervélo", "Top 20", "1995"));
        nExampleList.add(new ExampleItem4(R.drawable.kona, "Kona", "Top 10", "1988"));
        nExampleList.add(new ExampleItem4(R.drawable.raleigh, "Raleigh", "Top 20", "1887"));
        nExampleList.add(new ExampleItem4(R.drawable.lapierre, "Lapierre", "", "1946"));
        nExampleList.add(new ExampleItem4(R.drawable.colnago, "Colnago", "", "1952"));
        nExampleList.add(new ExampleItem4(R.drawable.focus, "Focus", "", "1992"));
        nExampleList.add(new ExampleItem4(R.drawable.salsa, "Salsa", "", "1982"));
        nExampleList.add(new ExampleItem4(R.drawable.surly, "Surly", "", "1998"));
        nExampleList.add(new ExampleItem4(R.drawable.davinci, "Devinci", "", "1987"));
        nExampleList.add(new ExampleItem4(R.drawable.haro, "Haro", "", "1978"));
        nExampleList.add(new ExampleItem4(R.drawable.jamis, "Jamis", "Top 20", "1979"));
        nExampleList.add(new ExampleItem4(R.drawable.dahon, "Dahon", "", "1982"));
        nExampleList.add(new ExampleItem4(R.drawable.brompton, "Brompton", "", "1975"));
        nExampleList.add(new ExampleItem4(R.drawable.cenelli, "Cinelli", "", "1947"));
        nExampleList.add(new ExampleItem4(R.drawable.look, "Look", "", "1951"));
        nExampleList.add(new ExampleItem4(R.drawable.rosa, "De Rosa", "", "1953"));
        nExampleList.add(new ExampleItem4(R.drawable.boardman, "Boardman", "", "2007"));
        nExampleList.add(new ExampleItem4(R.drawable.ridge, "Ridgeback", "", "1983"));
        nExampleList.add(new ExampleItem4(R.drawable.ghost, "Ghost", "", "1993"));
        nExampleList.add(new ExampleItem4(R.drawable.corratec, "Corratec", "", "1990"));
        nExampleList.add(new ExampleItem4(R.drawable.diamond, "Diamondback", "Top 20", "1977"));
        nExampleList.add(new ExampleItem4(R.drawable.niner, "Niner", "", "2005"));
        nExampleList.add(new ExampleItem4(R.drawable.marc, "Merckx", "", "1980"));
        nExampleList.add(new ExampleItem4(R.drawable.khs, "KHS", "", "1974"));
        nExampleList.add(new ExampleItem4(R.drawable.avanti, "Avanti", "", "1985"));
        nExampleList.add(new ExampleItem4(R.drawable.norco, "Norco", "", "1964"));
        nExampleList.add(new ExampleItem4(R.drawable.merida, "Merida", "", "1972"));
        nExampleList.add(new ExampleItem4(R.drawable.shimano, "Shimano", "", "1921"));
        nExampleList.add(new ExampleItem4(R.drawable.bianchi, "Bianchi", "", "1885"));
        nExampleList.add(new ExampleItem4(R.drawable.ktm, "KTM", "", "1964"));
        nExampleList.add(new ExampleItem4(R.drawable.cube, "Cube", "", "1993"));
        nExampleList.add(new ExampleItem4(R.drawable.fuji, "Fuji", "", "1899"));
        nExampleList.add(new ExampleItem4(R.drawable.lectric, "Lectric", "", "2018"));
        nExampleList.add(new ExampleItem4(R.drawable.pinarello, "Pinarello", "", "1952"));
        nExampleList.add(new ExampleItem4(R.drawable.wilier, "Wilier", "", "1906"));
        nExampleList.add(new ExampleItem4(R.drawable.yeti, "Yeti", "", "1985"));
        nExampleList.add(new ExampleItem4(R.drawable.allcity, "All-City", "", "2007"));
        nExampleList.add(new ExampleItem4(R.drawable.aventon, "Aventon", "", "2012"));
        nExampleList.add(new ExampleItem4(R.drawable.benno, "Benno", "", "2015"));
        nExampleList.add(new ExampleItem4(R.drawable.breezzer, "Breezer", "", "1977"));
        nExampleList.add(new ExampleItem4(R.drawable.buzz, "Buzz", "", ""));
        nExampleList.add(new ExampleItem4(R.drawable.charge, "Charge Bikes", "", "2004"));
        nExampleList.add(new ExampleItem4(R.drawable.coop, "Co-op Cycles", "", "2016"));
        nExampleList.add(new ExampleItem4(R.drawable.electra, "Electra", "", "1993"));
        nExampleList.add(new ExampleItem4(R.drawable.canyon, "Canyon", "Top 20", "2002"));
        nExampleList.add(new ExampleItem4(R.drawable.enigwe, "Engwe", "", "2014"));
        nExampleList.add(new ExampleItem4(R.drawable.evil, "Evil Bikes", "", "2009"));
        nExampleList.add(new ExampleItem4(R.drawable.gazelle, "Gazelle", "", "1892"));
        nExampleList.add(new ExampleItem4(R.drawable.hai, "Haibike", "", "1995"));
        nExampleList.add(new ExampleItem4(R.drawable.himiway, "Himiway", "", "2017"));
        nExampleList.add(new ExampleItem4(R.drawable.huffy, "Huffy", "Top 20", "1892"));
        nExampleList.add(new ExampleItem4(R.drawable.ibis, "Ibis", "", "1981"));
        nExampleList.add(new ExampleItem4(R.drawable.izip, "IZIP", "", "1998"));
        nExampleList.add(new ExampleItem4(R.drawable.juiced, "Juiced", "", "2009"));
        nExampleList.add(new ExampleItem4(R.drawable.juliana, "Juliana", "", "2013"));
        nExampleList.add(new ExampleItem4(R.drawable.knolly, "Knolly", "", "2002"));
        nExampleList.add(new ExampleItem4(R.drawable.liv, "Liv", "", "2008"));
        nExampleList.add(new ExampleItem4(R.drawable.look, "Look", "", "1951"));
        nExampleList.add(new ExampleItem4(R.drawable.marin, "Marin", "", "1986"));
        nExampleList.add(new ExampleItem4(R.drawable.momentum, "Momentum", "", "2015"));
        nExampleList.add(new ExampleItem4(R.drawable.mondraker, "Mondraker", "", "2011"));
        nExampleList.add(new ExampleItem4(R.drawable.ns, "NS", "", "2003"));
        nExampleList.add(new ExampleItem4(R.drawable.pivot, "Pivot", "", "2007"));
        nExampleList.add(new ExampleItem4(R.drawable.priority, "Priority", "", "2012"));
        nExampleList.add(new ExampleItem4(R.drawable.publicbike, "Public", "", "2010"));
        nExampleList.add(new ExampleItem4(R.drawable.pure, "Pure", "", "2010"));
        nExampleList.add(new ExampleItem4(R.drawable.quietkat, "QuietKat", "", "2014"));
        nExampleList.add(new ExampleItem4(R.drawable.retrospec, "Retrospec", "", "2009"));
        nExampleList.add(new ExampleItem4(R.drawable.revel, "Revel", "", "2016"));
        nExampleList.add(new ExampleItem4(R.drawable.ridley, "Ridley", "", "1997"));
        nExampleList.add(new ExampleItem4(R.drawable.road, "Roadmaster", "", "1935"));
        nExampleList.add(new ExampleItem4(R.drawable.rocky, "Rocky Mountain", "", "1981"));
        nExampleList.add(new ExampleItem4(R.drawable.rondo, "Rondo", "", "2015"));
        nExampleList.add(new ExampleItem4(R.drawable.schwin, "Schwinn", "Top 20", "1895"));
        nExampleList.add(new ExampleItem4(R.drawable.serial, "Serial 1", "", "2020"));
        nExampleList.add(new ExampleItem4(R.drawable.six, "Sixthreezero", "", "2005"));
        nExampleList.add(new ExampleItem4(R.drawable.sole, "Solé", "", "2009"));
        nExampleList.add(new ExampleItem4(R.drawable.strider, "Strider", "", "2007"));
        nExampleList.add(new ExampleItem4(R.drawable.stromer, "Stromer", "", "2009"));
        nExampleList.add(new ExampleItem4(R.drawable.zize, "Zize", "", "2005"));
        nExampleList.add(new ExampleItem4(R.drawable.tern, "Tern", "", "2011"));
        nExampleList.add(new ExampleItem4(R.drawable.tom, "Tommaso", "", "1985"));
        nExampleList.add(new ExampleItem4(R.drawable.vaast, "VAAST", "", "2018"));
        nExampleList.add(new ExampleItem4(R.drawable.vvolt, "Vvolt", "", "2019"));
        nExampleList.add(new ExampleItem4(R.drawable.wing, "Wing", "", "2018"));
        nExampleList.add(new ExampleItem4(R.drawable.woom, "woom", "", "2013"));
        nExampleList.add(new ExampleItem4(R.drawable.yuba, "Yuba", "", "2006"));
        nExampleList.add(new ExampleItem4(R.drawable.transition, "Transition Bike", "", "2001"));





    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView4);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter2 = new ExampleAdapter4(nExampleList);


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