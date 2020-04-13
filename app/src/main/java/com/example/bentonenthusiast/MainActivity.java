package com.example.bentonenthusiast;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private BottomNavigationView bottomNavigationView;
    public static final String name[] = new String[] {"Cacao Moist and Mild Toner 150ml",
            "Cacao Most and Mild Serum 30ml", "Cacao Most and Mild Cream 50g",
            "Dear My Best Friend Bar-Soap", "Shea Butter and Coconut Hand Cream 50g",
            "Shea Butter and Olive Hand Cream 50g", "Fermentation Eye Cream 30g",
            "Fermentation Essence 100ml", "Honest Cleansing Foam 150g", "Snail Bee High Content Mask",
            "Snail Bee High Content Skin 150ml", "Snail Bee High Content Steam Cream 50g",
            "Snail Bee High Content Essence 60ml", "Snail Bee High Content Lotion 120ml",
            "Aloe Propolis Soothing Gel 100ml", "Aloe BHA Skin Toner 200ml",
            "Papaya-S Sun Cream SPF50+ / PA++++ 50g", "Papaya-D Sun Cream SPF38 / PA++++ 50g",
            "Benton Deep Green Tea Toner 150ml", "Benton Deep Green Tea Lotion 120ml"};
    public static final String price[] = new String[] {"IDR 218,571",
            "IDR 206,428", "IDR 182,857", "IDR 160,714", "IDR 117,857", "IDR 125,714", "IDR 289,285",
            "IDR 308,571", "IDR 125,714", "IDR 35,714", "IDR 242,857", "IDR 242,857", "IDR 242,857", "IDR 242,857",
            "IDR 271,428", "IDR 230,714", "IDR 225,000", "IDR 214,285", "IDR 182,857", "IDR 182,857"};
    public static final Integer image[] = {R.drawable.cacaotoner, R.drawable.cacaoserum, R.drawable.cacaocream, R.drawable.dearmybf,
            R.drawable.bentonshea, R.drawable.bentonsheaoliv, R.drawable.bentoneyecream, R.drawable.bentonfermenessence,
            R.drawable.bentoncleansing, R.drawable.bentonmask, R.drawable.bentonskin, R.drawable.bentonsteam,
            R.drawable.bentonessence, R.drawable.bentonlotion, R.drawable.bentonshooting, R.drawable.bentonaloetoner,
            R.drawable.bentonsuncream, R.drawable.bentonsuncreamd, R.drawable.bentongreentea, R.drawable.bentongreentealotion };

    List<RowItem> rowItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView) findViewById(R.id.listview);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Product");
        }

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_product :
                        break;
                    case R.id.action_tips :
                        Intent b = new Intent(MainActivity.this, Tips.class);
                        startActivity(b);
                        break;
                    case R.id.action_about :
                        Intent c = new Intent(MainActivity.this, About.class);
                        startActivity(c);
                        break;
                }

                return true;
            }
        });

        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i<name.length; i++) {
            RowItem item = new RowItem(image[i], name[i], price[i]);
            rowItems.add(item);
        }

        CustomListAdapter adapter = new CustomListAdapter(this, R.layout.item_row_product, rowItems);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(this);

    }
    public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3){
        if(position==0){
            Intent i = new Intent(this, CacaoToner.class);
            startActivity(i);
        } else if(position==1){
            Intent i = new Intent(this, CacaoSerum.class);
            startActivity(i);
        } else if(position==2){
            Intent i = new Intent(this, CacaoCream.class);
            startActivity(i);
        } else if(position==3){
            Intent i = new Intent(this, DearBf.class);
            startActivity(i);
        } else if(position==4){
            Intent i = new Intent(this, Coconut.class);
            startActivity(i);
        } else if(position==5){
            Intent i = new Intent(this, CoconutOlive.class);
            startActivity(i);
        } else if(position==6){
            Intent i = new Intent(this, EyeCream.class);
            startActivity(i);
        } else if(position==7){
            Intent i = new Intent(this, FermenEssence.class);
            startActivity(i);
        } else if(position==8){
            Intent i = new Intent(this, Cleansing.class);
            startActivity(i);
        } else if(position==9){
            Intent i = new Intent(this, SnailMask.class);
            startActivity(i);
        } else if(position==10){
            Intent i = new Intent(this, SnailSkin.class);
            startActivity(i);
        } else if(position==11){
            Intent i = new Intent(this, SnailCream.class);
            startActivity(i);
        } else if(position==12){
            Intent i = new Intent(this, SnailEssence.class);
            startActivity(i);
        } else if(position==13){
            Intent i = new Intent(this, SnailLotion.class);
            startActivity(i);
        } else if(position==14){
            Intent i = new Intent(this, SoothingGel.class);
            startActivity(i);
        } else if(position==15){
            Intent i = new Intent(this, AloeToner.class);
            startActivity(i);
        } else if(position==16){
            Intent i = new Intent(this, PapayaS.class);
            startActivity(i);
        } else if(position==17){
            Intent i = new Intent(this, PapayaD.class);
            startActivity(i);
        } else if(position==18){
            Intent i = new Intent(this, GreenTeaToner.class);
            startActivity(i);
        } else if(position==19){
            Intent i = new Intent(this, GreenTeaLotion.class);
            startActivity(i);
        }
    }
}
