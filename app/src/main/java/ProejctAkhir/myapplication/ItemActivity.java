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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ItemActivity extends AppCompatActivity implements ItemInterface{

    RecyclerView recyclerView;
    ItemAdapter adapter;
    LinearLayout back;

    private DrawerLayout drawerLayout;
    private ImageView ivMenuIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Intent item = getIntent();
        ImageView imageView = findViewById(R.id.game_img);
        imageView.setImageResource(item.getIntExtra("image",0));

        ArrayList<Item> items = item.getParcelableArrayListExtra("items");

        TextView textView = findViewById(R.id.pubg_mobile);
        textView.setText( item.getStringExtra("gameName"));

        TextView gametype = findViewById(R.id.mobileTitle);
        gametype.setText(item.getStringExtra("gameType"));

        LinearLayout backBtn = findViewById(R.id.arrow_back);
        LinearLayout phoneIcon = findViewById(R.id.phone_icon);

        if(item.getStringExtra("gameType").equals("mobile")){
            phoneIcon.setBackgroundResource(R.drawable.phone_icon);
        }else if(item.getStringExtra("gameType").equals("PC")){
            phoneIcon.setBackgroundResource(R.drawable.pc);
        }else if (item.getStringExtra("gameType").equals("Console")){
            phoneIcon.setBackgroundResource(R.drawable.console);
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false));

        adapter = new ItemAdapter(items, this);
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

    @Override
    public void onItemClick(int position) {
        Intent item = getIntent();
        ArrayList<Item> items = item.getParcelableArrayListExtra("items");
        Intent intent = new Intent(ItemActivity.this, DetailPage.class);
        intent.putExtra("nameitem", items.get(position).getName());
        intent.putExtra("description", items.get(position).getDescription());
        intent.putExtra("price", items.get(position).getPrice());
        intent.putExtra("gameName", item.getStringExtra("gameName"));
        startActivity(intent);
    }
}