package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import ProejctAkhir.myapplication.ItemAdapter;
import ProejctAkhir.myapplication.Game;
import ProejctAkhir.myapplication.GlobalData;
import ProejctAkhir.myapplication.Item;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Vector;

public class ItemActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ItemAdapter adapter;
    LinearLayout back;

    private DrawerLayout drawerLayout;
    private ImageView ivMenuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        LinearLayout backBtn = findViewById(R.id.arrow_back);
        LinearLayout phoneIcon = findViewById(R.id.phone_icon);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));

        Game selectedGame = null;
        ArrayList<Game> games = new GlobalData().createGame();
        for (Game game : games) {
            if (game.getName().equals(GlobalData.currentGame) && game.getGameType().equals(GlobalData.currentType)) {
                selectedGame = game;
                break;
            }
        }

          ArrayList<Item> itemList = selectedGame.getItems();
//        itemVector.add(new Item(1, "Item1", "Shop Grak", 10000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(2, "Item2", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(3, "Item3", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(4, "Item4", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(5, "Item5", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(6, "Item6", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(7, "Item7", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(8, "Item8", "Shop Grak", 20000, R.drawable.pubg_250uc));
//        itemVector.add(new Item(9, "Item9", "Shop Grak", 20000, R.drawable.pubg_250uc));

        adapter = new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);

        phoneIcon.requestFocus();

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toHome = new Intent(ItemActivity.this, HomePage.class);
                toHome.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(toHome);
                overridePendingTransition(R.anim.slide_in_back, R.anim.slide_out_back);
            }
        });
    }
}