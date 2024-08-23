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

public class Bag extends AppCompatActivity {

    private ArrayList<ExampleItem3> nExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter3 mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);

        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.edittext2);
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
        ArrayList<ExampleItem3> filteredList = new ArrayList<>();

        for (ExampleItem3 item : nExampleList) {
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
        nExampleList.add(new ExampleItem3(R.drawable.dg, "Dolce & Gabbana", "Domenico Dolce, Stefano Gabbana", "year: 1985",""));
        nExampleList.add(new ExampleItem3(R.drawable.hermes, "Hermés", "Thierry Hermés", "year: 1837", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.givenchy, "Givenchy", "Hubert de Givenchy", "year: 1952", "Top 20"));
        nExampleList.add(new ExampleItem3(R.drawable.gucci, "Gucci", "Guccio Gucci", "year: 1921", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.louis, "Louis Vuitton", "Louis Vuitton", "year: 1854", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.prada, "Prada", "Mario Prada", "year: 1913", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.balenciaga, "Balenciaga", "Donostia-San Sebastian", "year: 1919", "Top 20"));
        nExampleList.add(new ExampleItem3(R.drawable.chanel, "Chanel", "Coco Chanel", "year: 1910", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.mc, "Alexander McQueen", "Alexander McQueen", "year: 1992", ""));
        nExampleList.add(new ExampleItem3(R.drawable.wang, "Alexander Wang", "Alexander Wang", "year: 2005", ""));
        nExampleList.add(new ExampleItem3(R.drawable.bottega, "Bottega Veneta", "Kering", "year: 1966", "Top 20"));
        nExampleList.add(new ExampleItem3(R.drawable.berry, "Burberry", "Thomas Burberry", "year: 1856", "Top 20"));
        nExampleList.add(new ExampleItem3(R.drawable.hermes, "Hermés Birkin", "Robert", "year: 1837", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.chloe, "Chloé", "Gaby Aghion, Jacques Lenoir", "year: 1952", "Top 20"));
        nExampleList.add(new ExampleItem3(R.drawable.coach, "Coach", "Miles Cahn, Lillian Cahn", "year: 1941", ""));
        nExampleList.add(new ExampleItem3(R.drawable.fendi, "Fendi", "Adele and Edoardo Fendi", "year: 1925", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.miu, "Miu Miu", "Miuccia Prada", "year: 1993", ""));
        nExampleList.add(new ExampleItem3(R.drawable.mul, "Mulberry", "Roger John Saul", "year: 1971", ""));
        nExampleList.add(new ExampleItem3(R.drawable.pro, "Proenza Schouler", "Jack McCollough, Lazaro Hernandez", "year: 2002", ""));
        nExampleList.add(new ExampleItem3(R.drawable.vera, "Vera Bradley", "Patricia Miller, Barbara Bradley", "year: 1982", ""));
        nExampleList.add(new ExampleItem3(R.drawable.saint, "Yves Saint Laurent", "Yves Saint Laurent, Pierra Bergé", "year: 1961", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.cartier, "Cartier", "Founder: Louis-François Cartier", "year: 1847", ""));
        nExampleList.add(new ExampleItem3(R.drawable.versace, "Versace", "Gianni Maria Versace", "year: 1978", ""));
        nExampleList.add(new ExampleItem3(R.drawable.armani, "Giorgio Armani", "Giorgio Armani, Sergio Galeotti", "year: 1975", ""));
        nExampleList.add(new ExampleItem3(R.drawable.gari, "Bvlgari", "Sotirios Voulgaris", "year: 1884", ""));
        nExampleList.add(new ExampleItem3(R.drawable.celine, "Celine", "Céline Vipiana", "year: 1945", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.mk, "Micheal Kors", "Capri Holdings", "year: 1981", ""));
        nExampleList.add(new ExampleItem3(R.drawable.dior, "Christian Dior", "Christian Dior", "year: 1946", "Top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.coomi, "Coomi", "Coomi", "year: 2002", ""));
        nExampleList.add(new ExampleItem3(R.drawable.kate, "Kate Spade", "Kate Spade", "year: 1993", ""));
        nExampleList.add(new ExampleItem3(R.drawable.lana, "Lana Marks", "Lana J. Mark", "year: 1988", ""));
        nExampleList.add(new ExampleItem3(R.drawable.marc, "Marc Jacobs", "Marc Jacobs", "year: 1984", "top 10"));
        nExampleList.add(new ExampleItem3(R.drawable.oscar, "Oscar de la Renta", "Oscar de la Renta", "year: 1965", ""));
        nExampleList.add(new ExampleItem3(R.drawable.ferragamo, "Salvatore Ferragamo", "Salvatore Ferragamo", "year: 1927", ""));
        nExampleList.add(new ExampleItem3(R.drawable.tom, "Tom Ford", "Tom Ford", "year: 2005", ""));
        nExampleList.add(new ExampleItem3(R.drawable.valentino, "Valentino", "Valentino Garavani, Giancarlo Giammetti", "year: 1960", ""));
        nExampleList.add(new ExampleItem3(R.drawable.thom, "Thom Browne", "Thom Browne", "year: 2003", ""));
        nExampleList.add(new ExampleItem3(R.drawable.escada, "Escada", "Margaretha Ley, Wolfgang Ley", "year: 1978", ""));
        nExampleList.add(new ExampleItem3(R.drawable.dkny, "Donna Karan New York", "Donna Karan", "year: 1984", ""));
        nExampleList.add(new ExampleItem3(R.drawable.west, "Vivienne Westwood", "Vivienne Westwood", "year: 1971", ""));

    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView3);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter2 = new ExampleAdapter3(nExampleList);


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