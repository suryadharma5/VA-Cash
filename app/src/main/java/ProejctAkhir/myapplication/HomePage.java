package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity implements AdapterView.OnItemClickListener {

    int [] carouselImages = {R.drawable.bg_1, R.drawable.bg_valo, R.drawable.bg_ml};
    ArrayList<Game> allGames;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        LinearLayout mobileBtn = findViewById(R.id.mobile_btn);
        LinearLayout pcBtn = findViewById(R.id.pc_btn);
        LinearLayout consoleBtn = findViewById(R.id.console_btn);

        TextView username = findViewById(R.id.username);

        username.setText(GlobalData.username);

        ViewPager imageSlider = findViewById(R.id.slider);

        CarouselAdapter carouselAdapter = new CarouselAdapter(this, carouselImages);
        imageSlider.setAdapter(carouselAdapter);


        GridView gridView = findViewById(R.id.grid_view);
        allGames = new GlobalData().createGame();

        ArrayList<Game> mobileGames = new ArrayList<>();
        ArrayList<Game> pcGames = new ArrayList<>();
        ArrayList<Game> consoleGames = new ArrayList<>();


        for (Game game : allGames) {
            if ("mobile".equalsIgnoreCase(game.getGameType())) {
                mobileGames.add(game);
            }else if("PC".equalsIgnoreCase(game.getGameType())){
                pcGames.add(game);
            }else if ("console".equalsIgnoreCase(game.getGameType())){
                consoleGames.add(game);
            }
        }

        GridViewAdapter gridViewAdapter = new GridViewAdapter(HomePage.this, mobileGames);
        gridView.setAdapter(gridViewAdapter);
        gridView.setOnItemClickListener(this);

        mobileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gridViewAdapter.setData(mobileGames);
            }
        });

        pcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gridViewAdapter.setData(pcGames);
            }
        });

        consoleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gridViewAdapter.setData(consoleGames);
            }
        });


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Game game = (Game) parent.getItemAtPosition(position);
        Toast.makeText(HomePage.this, "Clicked", Toast.LENGTH_SHORT).show();
    }
}