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

public class Car extends AppCompatActivity {

    private ArrayList<ExampleItem2> nExampleList;

    private RecyclerView mRecyclerView;
    private ExampleAdapter2 mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        createExampleList();
        buildRecyclerView();

        EditText editText = findViewById(R.id.edittext);
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
        ArrayList<ExampleItem2> filteredList = new ArrayList<>();

        for (ExampleItem2 item : nExampleList) {
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
        nExampleList.add(new ExampleItem2(R.drawable.ferrari, "Ferrari", "Country: Italy", "Year: 1947"));
        nExampleList.add(new ExampleItem2(R.drawable.lambo, "Lamborghini", "Country: Italy", "Year: 1964"));
        nExampleList.add(new ExampleItem2(R.drawable.toyata, "Toyota", "Country: Japan", "Year: 1936"));
        nExampleList.add(new ExampleItem2(R.drawable.lexus, "Lexus", "Country: Japan", "Year: 1983"));
        nExampleList.add(new ExampleItem2(R.drawable.kia, "Kia", "Country: South Korea", "Year: 1944"));
        nExampleList.add(new ExampleItem2(R.drawable.honda, "Honda", "Country: Japan", "Year: 1949"));
        nExampleList.add(new ExampleItem2(R.drawable.ivm, "Innoson", "Country: Nigeria", "Year: 2007"));
        nExampleList.add(new ExampleItem2(R.drawable.maybach, "Maybach", "Country: Germany", "Year: 1909"));
        nExampleList.add(new ExampleItem2(R.drawable.bmw, "BMW", "Country: Germany", "Year: 1916"));
        nExampleList.add(new ExampleItem2(R.drawable.tesla, "Tesla", "Country: USA", "Year: 2003"));
        nExampleList.add(new ExampleItem2(R.drawable.jeep, "Jeep", "Country: USA", "Year: 1941"));
        nExampleList.add(new ExampleItem2(R.drawable.ford, "Ford", "Country: USA", "Year: 1903"));
        nExampleList.add(new ExampleItem2(R.drawable.bugatti, "Bugatti", "Country: France", "Year: 1909"));
        nExampleList.add(new ExampleItem2(R.drawable.bentley, "Bentley", "Country: UK", "Year: 1919"));
        nExampleList.add(new ExampleItem2(R.drawable.cadillac, "Cadillac", "Country: USA", "Year: 1902"));
        nExampleList.add(new ExampleItem2(R.drawable.nissan, "Nissan", "Country: Japan", "Year: 1933"));
        nExampleList.add(new ExampleItem2(R.drawable.volkswagen, "Volkswagen", "Country: Germany", "Year: 1937"));
        nExampleList.add(new ExampleItem2(R.drawable.benz, "Mercedes-Benz", "Country: Germany", "Year: 1926"));
        nExampleList.add(new ExampleItem2(R.drawable.audi, "Audi", "Country: Germany", "Year: 1909"));
        nExampleList.add(new ExampleItem2(R.drawable.land, "Land Rover", "Country: England", "Year: 1948"));
        nExampleList.add(new ExampleItem2(R.drawable.porsech, "Porsche", "Country: Germany", "Year: 1931"));
        nExampleList.add(new ExampleItem2(R.drawable.mini, "Mini", "Country: ", "Year: 1959"));
        nExampleList.add(new ExampleItem2(R.drawable.buick, "Buick", "Country: USA", "Year: 1903"));
        nExampleList.add(new ExampleItem2(R.drawable.chevrolet, "Chevrolet", "Country: USA", "Year: 1911"));
        nExampleList.add(new ExampleItem2(R.drawable.jaguar, "Jaguar", "Country: England", "Year: 1922"));
        nExampleList.add(new ExampleItem2(R.drawable.aston, "Aston Martin", "Country: UK", "Year: 1913"));
        nExampleList.add(new ExampleItem2(R.drawable.renault, "Renault", "Country: France", "Year: 1899"));
        nExampleList.add(new ExampleItem2(R.drawable.seat, "Seat", "Country: Spain", "Year: 1950"));
        nExampleList.add(new ExampleItem2(R.drawable.masarati, "Maserati", "Country: Italy", "Year: 1914"));
        nExampleList.add(new ExampleItem2(R.drawable.dodge, "Dodge", "Country: USA", "Year: 1900"));
        nExampleList.add(new ExampleItem2(R.drawable.fiat, "Fiat", "Country: Italy", "Year: 1899"));
        nExampleList.add(new ExampleItem2(R.drawable.rolls, "Rolls-Royce", "Country: UK", "Year: 1906"));
        nExampleList.add(new ExampleItem2(R.drawable.infiniti, "Infiniti", "Country: Japan", "Year: 1989"));
        nExampleList.add(new ExampleItem2(R.drawable.daewoo, "Daewoo", "Country: South Korea", "Year: 1982"));
        nExampleList.add(new ExampleItem2(R.drawable.peugeot, "Peugeot", "Country: France", "Year: 1896"));
        nExampleList.add(new ExampleItem2(R.drawable.opel, "Opel", "Country: Germany", "Year: 1862"));
        nExampleList.add(new ExampleItem2(R.drawable.suzuki, "Suzuki", "Country: Japan", "Year: 1909"));
        nExampleList.add(new ExampleItem2(R.drawable.hyundai, "Hyundai", "Country: South Korea", "Year: 1967"));
        nExampleList.add(new ExampleItem2(R.drawable.volvo, "Volvo", "Country: Sweden", "Year: 1927"));
        nExampleList.add(new ExampleItem2(R.drawable.mitsubishi, "Mitsubishi", "Country: Japan", "Year: 1970"));
        nExampleList.add(new ExampleItem2(R.drawable.subaru, "Subaru", "Country: Japan", "Year: 1953"));
        nExampleList.add(new ExampleItem2(R.drawable.acura, "Acura", "Country: Japan", "1986"));
        nExampleList.add(new ExampleItem2(R.drawable.chrysler, "Chrysler", "Country: USA", "Year: 1925"));
        nExampleList.add(new ExampleItem2(R.drawable.citreon, "Citroen", "Country: France", "Year: 1919"));
        nExampleList.add(new ExampleItem2(R.drawable.dancia, "Dacia", "Country: Romania", "Year: 1968"));
        nExampleList.add(new ExampleItem2(R.drawable.gmc, "GMC", "Country: USA", "Year: 1911"));
        nExampleList.add(new ExampleItem2(R.drawable.humm, "Hummer", "Country: USA", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.lotus, "Lotus", "Country: England", "Year: 1952"));
        nExampleList.add(new ExampleItem2(R.drawable.viper, "Dodge Viper", "Country: USA", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.skoda, "Skoda", "Country: Czech", "Year: 1895"));
        nExampleList.add(new ExampleItem2(R.drawable.genesis, "Genesis", "Country: South Korea", "Year: 2015"));
        nExampleList.add(new ExampleItem2(R.drawable.mazda, "Mazda", "Country: Japan", "Year: 1920"));
        nExampleList.add(new ExampleItem2(R.drawable.mg, "MG", "Country: British", "Year: 1924"));
        nExampleList.add(new ExampleItem2(R.drawable.alfa, "Alfa Romeo", "Country: Italy", "Year: 1910"));
        nExampleList.add(new ExampleItem2(R.drawable.pontiac, "Pontiac", "Country: USA", "Year: 1926"));
        nExampleList.add(new ExampleItem2(R.drawable.ktm, "KTM", "Country: Austria", "Year: 1934"));
        nExampleList.add(new ExampleItem2(R.drawable.isuzu, "Isuzu", "Country: Japan", "Year: 1934"));
        nExampleList.add(new ExampleItem2(R.drawable.gac, "GAC Group", "Country: China", "Year: 1997"));
        nExampleList.add(new ExampleItem2(R.drawable.ram, "Ram", "Country: USA", "Year: 2010"));
        nExampleList.add(new ExampleItem2(R.drawable.hindustan, "Hindustan Motors", "Country: India", "Year: 1942"));
        nExampleList.add(new ExampleItem2(R.drawable.arcfox, "Arcfox", "Country: China", "Year: 2017"));
        nExampleList.add(new ExampleItem2(R.drawable.xpeng, "XPeng", "Country: China", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.lancia, "Lancia", "Country: Italy", "Year: 1908"));
        nExampleList.add(new ExampleItem2(R.drawable.smart, "Smart", "Country: Germany", "Year: 1994"));
        nExampleList.add(new ExampleItem2(R.drawable.lincoln, "Lincoln", "Country: USA", "Year: 1917"));
        nExampleList.add(new ExampleItem2(R.drawable.byd, "BYD", "Country: China", "Year: 2003"));
        nExampleList.add(new ExampleItem2(R.drawable.lada, "Lada", "Country: Russia", "Year: 1973"));
        nExampleList.add(new ExampleItem2(R.drawable.ssang, "SsangYong", "Country: South Korea", "Year: 1954"));
        nExampleList.add(new ExampleItem2(R.drawable.saic, "SAIC Motor", "Country: China", "Year: 1955"));
        nExampleList.add(new ExampleItem2(R.drawable.datsun, "Datsun", "Country: Japan", "Year: 1931"));
        nExampleList.add(new ExampleItem2(R.drawable.daihatsu, "Daihatsu", "Country: Japan", "Year: 1907"));
        nExampleList.add(new ExampleItem2(R.drawable.morgan, "Morgan", "Country: UK", "Year: 1928"));
        nExampleList.add(new ExampleItem2(R.drawable.artega, "Artega", "Country: Spain", "Year: 2006"));
        nExampleList.add(new ExampleItem2(R.drawable.alpina, "Alpina", "Country: Germany", "Year: 1965"));
        nExampleList.add(new ExampleItem2(R.drawable.man, "MAN", "Country: Germany", "Year: 1758"));
        nExampleList.add(new ExampleItem2(R.drawable.laraki, "Laraki", "Country: Morocco", "Year: 1999"));
        nExampleList.add(new ExampleItem2(R.drawable.paccar, "Paccar", "Country: USA", "Year: 1905"));
        nExampleList.add(new ExampleItem2(R.drawable.lucid, "Lucid", "Country: USA", "Year: 2007"));
        nExampleList.add(new ExampleItem2(R.drawable.caterham, "Caterham", "Country: England", "Year: 1973"));
        nExampleList.add(new ExampleItem2(R.drawable.devel, "Devel Sixteen", "Country: UAE", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.borg, "Borgward", "Country: Germany", "Year: 1919"));
        nExampleList.add(new ExampleItem2(R.drawable.mahindra, "Mahindra", "Country: India", "Year: 1945"));
        nExampleList.add(new ExampleItem2(R.drawable.roush, "Roush", "Country: USA", "Year: 1995"));
        nExampleList.add(new ExampleItem2(R.drawable.saleen, "Saleen", "Country: USA", "Year: 1984"));
        nExampleList.add(new ExampleItem2(R.drawable.scania, "Scania", "Country: Sweden", "Year: 1891"));
        nExampleList.add(new ExampleItem2(R.drawable.hino, "Hino", "Country: Japan", "Year: 1942"));
        nExampleList.add(new ExampleItem2(R.drawable.rezvani, "Rezvani", "Country: USA", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.lusitano, "Lusitano", "Country: Sweden", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.perodua, "Perodua", "Country: Malaysia", "Year: 1993"));
        nExampleList.add(new ExampleItem2(R.drawable.brabus, "Brabus", "Country: Germany", "Year: 1977"));
        nExampleList.add(new ExampleItem2(R.drawable.koenigsegg, "Koenigsegg", "Country: Sweden", "Year: 1994"));
        nExampleList.add(new ExampleItem2(R.drawable.briliance, "Brilliance", "Country: China", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.radical, "Radical", "Country: British", "Year: 1997"));
        nExampleList.add(new ExampleItem2(R.drawable.bac, "BAC", "Country: UK", "Year: 2009"));
        nExampleList.add(new ExampleItem2(R.drawable.hennessey, "Hennessy", "Country: USA", "Year: 1991"));
        nExampleList.add(new ExampleItem2(R.drawable.proton, "Proton", "Country: Malaysia", "Year: 1985"));
        nExampleList.add(new ExampleItem2(R.drawable.donker, "Donkervoort", "Country: Netherlands", "Year: 1978"));
        nExampleList.add(new ExampleItem2(R.drawable.manhart, "Manhart", "Country: Germany", "Year: 1986"));
        nExampleList.add(new ExampleItem2(R.drawable.ffe, "9ff", "Country: Germany", "Year: 2001"));
        nExampleList.add(new ExampleItem2(R.drawable.baojun, "Baojun", "Country: China", "Year: 2010"));
        nExampleList.add(new ExampleItem2(R.drawable.vencer, "Vencer", "Country: Dutch", "Year: 2010"));
        nExampleList.add(new ExampleItem2(R.drawable.ariel, "Ariel", "Country: Belgium", "Year: 2001"));
        nExampleList.add(new ExampleItem2(R.drawable.elemental, "Elemental", "UK", "Year: 2012"));
        nExampleList.add(new ExampleItem2(R.drawable.appolo, "Apollo", "Country: Germany", "Year: 2004"));
        nExampleList.add(new ExampleItem2(R.drawable.faraday, "Faraday Future", "Country: USA", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.dina, "Dina", "Country: Mexico", "Year: 1951"));
        nExampleList.add(new ExampleItem2(R.drawable.dong, "Dongfeng", "Country: China", "Year: 1969"));
        nExampleList.add(new ExampleItem2(R.drawable.arash, "Arash", "Country: UK", "Year: 1999"));
        nExampleList.add(new ExampleItem2(R.drawable.ic, "IC Bus", "Country: USA", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.chevcor, "Chevrolet Corvette", "Country: USA", "Year: 1953"));
        nExampleList.add(new ExampleItem2(R.drawable.saab, "Saab", "Country: Sweden", "Year: 1937"));
        nExampleList.add(new ExampleItem2(R.drawable.mustang, "Ford Mustang", "Country: USA", "Year: 1964"));
        nExampleList.add(new ExampleItem2(R.drawable.laren, "McLaren", "Country: UK", "Year: 1963"));
        nExampleList.add(new ExampleItem2(R.drawable.peterblit, "Peterbilt", "Country: USA", "Year: 1939"));
        nExampleList.add(new ExampleItem2(R.drawable.bmwm, "BMW M", "Country: Germany", "Year: 1972"));
        nExampleList.add(new ExampleItem2(R.drawable.general, "General Motors", "Country: USA", "Year: 1908"));
        nExampleList.add(new ExampleItem2(R.drawable.kenworth, "Kenworth", "Country: USA", "Year: 1912"));
        nExampleList.add(new ExampleItem2(R.drawable.mack, "Mack", "Country: USA", "Year: 1900"));
        nExampleList.add(new ExampleItem2(R.drawable.daimler, "Daimler", "Country: Germany", "Year: 1886"));
        nExampleList.add(new ExampleItem2(R.drawable.holden, "Holden", "Country: Australia", "Year: 1856"));
        nExampleList.add(new ExampleItem2(R.drawable.alpine, "Alpine", "Country: France", "Year: 1955"));
        nExampleList.add(new ExampleItem2(R.drawable.pagani, "Pagani", "Country: Italy", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.vauxhall, "Vauxhall", "Country: UK", "Year: 1857"));
        nExampleList.add(new ExampleItem2(R.drawable.tata, "Tata", "Country: India", "Year: 1945"));
        nExampleList.add(new ExampleItem2(R.drawable.abarth, "Abarth", "Country: Italy", "Year: 1949"));
        nExampleList.add(new ExampleItem2(R.drawable.western, "Western Star", "Country: Canada", "Year: 1967"));
        nExampleList.add(new ExampleItem2(R.drawable.amg, "Mercedes-AMG", "Country: Germany", "Year: 1967"));
        nExampleList.add(new ExampleItem2(R.drawable.audisport, "Audi Sport", "Country: Germany", "Year: 1983"));
        nExampleList.add(new ExampleItem2(R.drawable.eicher, "Eicher", "Country: India", "Year: 1948"));
        nExampleList.add(new ExampleItem2(R.drawable.abt, "ABT", "Country: Germany", "Year: 1896"));
        nExampleList.add(new ExampleItem2(R.drawable.great, "Great Wall", "Country: China", "1984"));
        nExampleList.add(new ExampleItem2(R.drawable.byd, "BYD", "Country: China", "Year: 1995"));
        nExampleList.add(new ExampleItem2(R.drawable.geely, "Geely", "Country: China", "Year: 1986"));
        nExampleList.add(new ExampleItem2(R.drawable.lada, "Lada", "Country: Russia", "Year: 1966"));
        nExampleList.add(new ExampleItem2(R.drawable.polestar, "Polestar", "Country: Sweden", "Year: 1996"));
        nExampleList.add(new ExampleItem2(R.drawable.vinfast, "Vinfast", "Country: Vietnamese", "Year: 2017"));
        nExampleList.add(new ExampleItem2(R.drawable.jetta, "Jetta", "Country: China", "Year: 2019"));
        nExampleList.add(new ExampleItem2(R.drawable.ssc, "SSC", "Country: USA", "Year: 1998"));
        nExampleList.add(new ExampleItem2(R.drawable.irizer, "Irizar", "Country: Spain", "Year: 1889"));
        nExampleList.add(new ExampleItem2(R.drawable.nio, "NIO", "Country: China", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.spyker, "Spyker", "Country: Dutch", "Year: 1898"));
        nExampleList.add(new ExampleItem2(R.drawable.hongqi, "Hongqi", "Country: China", "Year: 1958"));
        nExampleList.add(new ExampleItem2(R.drawable.rivian, "Rivian", "Country: USA", "Year: 2009"));
        nExampleList.add(new ExampleItem2(R.drawable.wey, "WEY", "Country: China", "Year: 2016"));
        nExampleList.add(new ExampleItem2(R.drawable.tomaso, "De Tomaso", "Country: Italy", "Year: 1959"));
        nExampleList.add(new ExampleItem2(R.drawable.tramontana, "Tramontana", "Country: Spain", "Year: 2007"));
        nExampleList.add(new ExampleItem2(R.drawable.toyotacrown, "Toyota Crown", "Country: Japan", "Year: 1955"));
        nExampleList.add(new ExampleItem2(R.drawable.freight, "Freightliner", "Country: USA", "Year: 1942"));
        nExampleList.add(new ExampleItem2(R.drawable.wuling, "Wuling", "Country: Cina", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.carlsson, "Carlsson", "Country: Germany", "Year: 1989"));
        nExampleList.add(new ExampleItem2(R.drawable.tauro, "Tauro Sport Auto", "Country: Spain", "Year: 2010"));
        nExampleList.add(new ExampleItem2(R.drawable.sisu, "Sisu", "Country: Finland", "Year: 1931"));
        nExampleList.add(new ExampleItem2(R.drawable.troller, "Troller", "Country: Brazil", "Year: 1995"));
        nExampleList.add(new ExampleItem2(R.drawable.vector, "Vector", "Country: USA", "Year: 1971"));
        nExampleList.add(new ExampleItem2(R.drawable.tatra, "Tatra", "Country: Czech", "Year: 1850"));
        nExampleList.add(new ExampleItem2(R.drawable.lagonda, "Lagonda", "Country: British", "Year: 1906"));
        nExampleList.add(new ExampleItem2(R.drawable.gta, "Spania GTA", "Country: Spain", "Year: 1994"));
        nExampleList.add(new ExampleItem2(R.drawable.mansory, "Mansory", "Country: Germany", "Year: 1989"));
        nExampleList.add(new ExampleItem2(R.drawable.canoo, "Canoo", "Country: USA", "Year: 2017"));
        nExampleList.add(new ExampleItem2(R.drawable.panoz, "Panoz", "Country: USA", "Year: 1989"));
        nExampleList.add(new ExampleItem2(R.drawable.rossion, "Rossion", "Country: USA", "Year: 2006"));
        nExampleList.add(new ExampleItem2(R.drawable.arrinera, "Arrinera", "Country: Poland", "Year: 2008"));
        nExampleList.add(new ExampleItem2(R.drawable.arrival, "Arrival", "Country: UK", "Year: 2015"));
        nExampleList.add(new ExampleItem2(R.drawable.lordstown, "Lordstown", "Country: USA", "Year: 2018"));
        nExampleList.add(new ExampleItem2(R.drawable.trion, "Trion", "Country: USA", "Year: 2012"));
        nExampleList.add(new ExampleItem2(R.drawable.haval, "Haval", "Country: China", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.changan, "Changan", "Country: China", "Year: 1862"));
        nExampleList.add(new ExampleItem2(R.drawable.ruf, "RUF", "Country: Germany", "Year: 1939"));
        nExampleList.add(new ExampleItem2(R.drawable.david, "David Brown", "Country: England", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.techart, "TechArt", "Country: Germany", "Year: 1987"));
        nExampleList.add(new ExampleItem2(R.drawable.iveco, "Iveco", "Country: Italy", "Year: 1975"));
        nExampleList.add(new ExampleItem2(R.drawable.century, "Toyota Century", "Japan", "Year: 1967"));
        nExampleList.add(new ExampleItem2(R.drawable.zenvo, "Zenvo", "Country: Zealand", "Year: 2009"));
        nExampleList.add(new ExampleItem2(R.drawable.tvr, "TVR", "Country: British", "Year: 1947"));
        nExampleList.add(new ExampleItem2(R.drawable.li, "Li Auto", "Country: China", "Year: 2015"));
        nExampleList.add(new ExampleItem2(R.drawable.nikola, "Nikola", "Country: USA", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.nevs, "NEVS", "Country: Sweden", "Year: 2012"));
        nExampleList.add(new ExampleItem2(R.drawable.singulato, "Singulato", "Country: China", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.work, "Workhorse", "Country: USA", "Year: 1998"));
        nExampleList.add(new ExampleItem2(R.drawable.exed, "Exeed", "Country: China", "Year: 2017"));
        nExampleList.add(new ExampleItem2(R.drawable.best, "Bestune", "Country: China", "Year: 2006"));
        nExampleList.add(new ExampleItem2(R.drawable.intermec, "Intermeccanica", "Country: Italy", "Year: 1959"));
        nExampleList.add(new ExampleItem2(R.drawable.autobacs, "Autobacs", "Country: Japan", "Year: 1947"));
        nExampleList.add(new ExampleItem2(R.drawable.geo, "Geometry", "Country: China", "Year: 2019"));
        nExampleList.add(new ExampleItem2(R.drawable.caparo, "Caparo", "Country: England", "Year: 2004"));
        nExampleList.add(new ExampleItem2(R.drawable.daf, "DAF", "Country: Dutch", "Year: 1993"));
        nExampleList.add(new ExampleItem2(R.drawable.brammo, "Brammo", "Country: USA", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.faw, "FAW", "Country: China", "Year: 1953"));
        nExampleList.add(new ExampleItem2(R.drawable.kamaz, "Kamaz", "Country: Russia", "Year: 1969"));
        nExampleList.add(new ExampleItem2(R.drawable.luxgen, "Luxgen", "Country: Taiwan", "Year: 1906"));
        nExampleList.add(new ExampleItem2(R.drawable.grinnal, "Grinnall", "Country: UK", "Year: 1991"));
        nExampleList.add(new ExampleItem2(R.drawable.ligier, "Ligier", "Country: France", "Year: 1968"));
        nExampleList.add(new ExampleItem2(R.drawable.pinin, "Pininfarina", "Country: Italy", "Year: 1930"));
        nExampleList.add(new ExampleItem2(R.drawable.mitsuoka, "Mitsuoka", "Country: Japan", "Year: 1968"));
        nExampleList.add(new ExampleItem2(R.drawable.setra, "Setra", "Country: Germany", "Year: 1951"));
        nExampleList.add(new ExampleItem2(R.drawable.ud, "UD", "Country: Japan", "Year: 1935"));
        nExampleList.add(new ExampleItem2(R.drawable.praga, "Praga", "Country: Czech", "Year: 1907"));
        nExampleList.add(new ExampleItem2(R.drawable.byton, "Byton", "Country: China", "Year: 2016"));
        nExampleList.add(new ExampleItem2(R.drawable.qoros, "Qoros", "Country: China", "Year: 2007"));
        nExampleList.add(new ExampleItem2(R.drawable.resamsung, "Renault Samsung", "Country: South Korea", "Year: 1994"));
        nExampleList.add(new ExampleItem2(R.drawable.radical, "Radical", "Country: British", "Year: 1997"));
        nExampleList.add(new ExampleItem2(R.drawable.lancia, "Lancia", "Country: Italy", "Year: 1906"));
        nExampleList.add(new ExampleItem2(R.drawable.ginetta, "Ginetta", "Country: UK", "Year: 1958"));
        nExampleList.add(new ExampleItem2(R.drawable.zenos, "Zenos", "Country: UK", "Year: 2012"));
        nExampleList.add(new ExampleItem2(R.drawable.prodrive, "Prodrive", "Country: England", "Year: 1983"));
        nExampleList.add(new ExampleItem2(R.drawable.yulon, "Yulon", "Country: Taiwan", "Year: 1953"));
        nExampleList.add(new ExampleItem2(R.drawable.wmotor, "W Motors", "Country: Lebanon", "Year: 2012"));
        nExampleList.add(new ExampleItem2(R.drawable.zaroog, "Zarooq Motors", "Country: UAE", "Year: 2014"));
        nExampleList.add(new ExampleItem2(R.drawable.aixam, "Aixam", "Country: France", "Year: 1983"));
        nExampleList.add(new ExampleItem2(R.drawable.foton, "Foton", "Country: China", "Year: 1996"));
        nExampleList.add(new ExampleItem2(R.drawable.nisgtr, "Nissan GT-R", "Country: Japan", "Year: 2007"));
        nExampleList.add(new ExampleItem2(R.drawable.melkus, "Melkus", "Country: Germany", "1959"));
        nExampleList.add(new ExampleItem2(R.drawable.lister, "Lister", "Country: British", "Year: 1954"));
        nExampleList.add(new ExampleItem2(R.drawable.zaz, "ZAZ", "Country: Ukraine", "Year: 1923"));
        nExampleList.add(new ExampleItem2(R.drawable.hsv, "HSV", "Country: Australia", "Year: 1987"));
        nExampleList.add(new ExampleItem2(R.drawable.beiben, "Beiben", "Country: China", "Year: 1988"));
        nExampleList.add(new ExampleItem2(R.drawable.fso, "FSO", "Country: Poland", "Year: 1948"));
        nExampleList.add(new ExampleItem2(R.drawable.leap, "Leapmotor", "Country: China", "Year: 2015"));
        nExampleList.add(new ExampleItem2(R.drawable.camc, "CAMC", "Country: China", "Year: 1999"));
        nExampleList.add(new ExampleItem2(R.drawable.king, "Karlmann King", "Country: China", "Year: 2017"));
        nExampleList.add(new ExampleItem2(R.drawable.yutong, "Yutong", "Country: China", "Year: 1963"));
        nExampleList.add(new ExampleItem2(R.drawable.shacman, "Shacman", "Country: China", "Year: 1968"));
        nExampleList.add(new ExampleItem2(R.drawable.roewe, "Roewe", "Country: China", "Year: 2006"));
        nExampleList.add(new ExampleItem2(R.drawable.drako, "Drako Motors", "Country: USA", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.aiways, "Aiways", "China", "Year: 2017"));
        nExampleList.add(new ExampleItem2(R.drawable.dragon, "Golden Dragon", "Country: China", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.jba, "JBA Motors", "Country: British", "Year: 1982"));
        nExampleList.add(new ExampleItem2(R.drawable.ac, "AC", "Country: England", "Year: 1901"));
        nExampleList.add(new ExampleItem2(R.drawable.zeek, "Zeekr", "Country: China", "Year: 2021"));
        nExampleList.add(new ExampleItem2(R.drawable.aspark, "Aspark", "Country: Japan", "Year: 2005"));
        nExampleList.add(new ExampleItem2(R.drawable.zenos, "Zenos", "Country: British", "Year: 2012"));
        nExampleList.add(new ExampleItem2(R.drawable.zinoro, "Zinoro", "Country: China", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.atalanta, "Atalanta", "Country: British", "Year: 2011"));
        nExampleList.add(new ExampleItem2(R.drawable.dayun, "Dayun", "Country: China", "Year: 1987"));
        nExampleList.add(new ExampleItem2(R.drawable.higer, "Higer", "Country: China", "Year: 1998"));
        nExampleList.add(new ExampleItem2(R.drawable.longg, "King Long", "Country: China", "Year: 1988"));
        nExampleList.add(new ExampleItem2(R.drawable.jawa, "Jawa", "Country: Czech", "Year: 1929"));
        nExampleList.add(new ExampleItem2(R.drawable.dartz, "Dartz", "Country: Latvia", "Year: 2009"));
        nExampleList.add(new ExampleItem2(R.drawable.morgan, "Morgan", "Country: British", "Year: 1910"));
        nExampleList.add(new ExampleItem2(R.drawable.venucia, "Venucia", "Country: China", "2010"));
        nExampleList.add(new ExampleItem2(R.drawable.bow, "Bowler", "Country: England", "Year: 1985"));
        nExampleList.add(new ExampleItem2(R.drawable.westfield, "Westfield", "Country: England", "Year: 1982"));
        nExampleList.add(new ExampleItem2(R.drawable.haima, "Haima", "Country: China", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.bristol, "Bristol", "Country: England", "Year: 1945"));
        nExampleList.add(new ExampleItem2(R.drawable.jmc, "JMC", "Country: China", "Year: 1968"));
        nExampleList.add(new ExampleItem2(R.drawable.wies, "Wiesmann", "Country: Germany", "Year: 1988"));
        nExampleList.add(new ExampleItem2(R.drawable.bufori, "Bufori", "Country: Malaysia", "Year: 1986"));
        nExampleList.add(new ExampleItem2(R.drawable.spirra, "Spirra", "Country: South Korea", "Year: 2007"));
        nExampleList.add(new ExampleItem2(R.drawable.maxus, "Maxus", "Country: British", "Year: 2011"));
        nExampleList.add(new ExampleItem2(R.drawable.chengfeng, "Changfeng", "Country: China", "Year: 1950"));
        nExampleList.add(new ExampleItem2(R.drawable.hiphi, "HiPhi", "Country: China", "Year: 2019"));
        nExampleList.add(new ExampleItem2(R.drawable.force, "Force", "Country: Germany", "Year: 1958"));
        nExampleList.add(new ExampleItem2(R.drawable.land, "Landwind", "Country: China", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.bitter, "Bitter", "Country: Germany", "Year: 1971"));
        nExampleList.add(new ExampleItem2(R.drawable.elfin, "Elfin", "Country: Australia", "Year: 1957"));
        nExampleList.add(new ExampleItem2(R.drawable.ranz, "Ranz", "Country: China", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.fiora, "Fioravanti", "Country: Italy", "Year: 1987"));
        nExampleList.add(new ExampleItem2(R.drawable.merlin, "Marlin", "Country: British", "Year: 1979"));
        nExampleList.add(new ExampleItem2(R.drawable.mkk, "MK", "Country: Germany", "Year: 1996"));
        nExampleList.add(new ExampleItem2(R.drawable.mev, "MEV", "Country: British", "Year: 2003"));
        nExampleList.add(new ExampleItem2(R.drawable.brooke, "Brooke", "Country: British", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.ronart, "Ronart", "Country: British", "Year: 1984"));
        nExampleList.add(new ExampleItem2(R.drawable.mastreta, "Mastretta", "Country: Mexico", "Year: 1987"));
        nExampleList.add(new ExampleItem2(R.drawable.gardner, "Gardner Douglas", "Country: England", "Year: 1990"));
        nExampleList.add(new ExampleItem2(R.drawable.axon, "Axon", "Country: British", "Year: 2005"));
        nExampleList.add(new ExampleItem2(R.drawable.gillet, "Gillet", "Country: Belgium", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.soueast, "Soueast", "Country: China", "Year: 1995"));
        nExampleList.add(new ExampleItem2(R.drawable.venturi, "Venturi", "Country: Monaco", "Year: 1984"));
        nExampleList.add(new ExampleItem2(R.drawable.rinspeed, "Rinspeed", "Country: Switzerland", "Year: 1979"));
        nExampleList.add(new ExampleItem2(R.drawable.ultima, "Ultima", "Country: England", "Year: 1992"));
        nExampleList.add(new ExampleItem2(R.drawable.premier, "Premier", "Country: India", "Year: 1944"));
        nExampleList.add(new ExampleItem2(R.drawable.vanden, "Vandenbrink", "Country: Netherlands", "2006"));
        nExampleList.add(new ExampleItem2(R.drawable.zastava, "Zastava", "Country: Serbian", "Year: 2000"));
        nExampleList.add(new ExampleItem2(R.drawable.sinotruck, "Sinotruck CNHTC", "Country: China", "Year: 1935"));
        nExampleList.add(new ExampleItem2(R.drawable.levc, "LEVC", "Country: British", "Year: 2013"));
        nExampleList.add(new ExampleItem2(R.drawable.mazzanti, "Mazzanti", "Country: Italy", "Year: 2002"));
        nExampleList.add(new ExampleItem2(R.drawable.zenvo, "Zenvo", "Country: Denmark", "Year: 2009"));
        nExampleList.add(new ExampleItem2(R.drawable.lynk, "Lynk & Co", "Country: Sweden", "Year: 2016"));
        nExampleList.add(new ExampleItem2(R.drawable.ikco, "IKCO", "Country: Iran", "Year: 1962"));
        nExampleList.add(new ExampleItem2(R.drawable.isdera, "Isdera", "Country: Germany", "Year: 1969"));
        nExampleList.add(new ExampleItem2(R.drawable.mitsuoka, "Mitsuoka", "Country: Japan", "Year: 1968"));
        nExampleList.add(new ExampleItem2(R.drawable.tvr, "TVR", "Country: British", "Year: 1947"));
        nExampleList.add(new ExampleItem2(R.drawable.pgo, "PGO", "Country: France", "Year: 1985"));
        nExampleList.add(new ExampleItem2(R.drawable.edag, "EDAG", "Country: Germany", "Year: 1969force.PNG"));
        nExampleList.add(new ExampleItem2(R.drawable.jiefang, "FAW Jiefang", "Country: China", "Year: 2003"));
        nExampleList.add(new ExampleItem2(R.drawable.jac, "JAC", "Country: China", "Year: 1964"));
        nExampleList.add(new ExampleItem2(R.drawable.alphard, "Toyota Alphard", "Country: Japan", "Year: 2002"));

    }

    private void buildRecyclerView() {
        mRecyclerView = findViewById(R.id.recyclerView2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter2 = new ExampleAdapter2(nExampleList);


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