package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity implements AdapterView.OnItemClickListener {

    int currImg = 0;
    int [] carouselImages = {R.drawable.bg_0, R.drawable.bg_3, R.drawable.bg_2};
    ArrayList<Game> allGames;
    TabLayout tabLayout;
    ViewPager2 tabPager;
    HomePagerAdapter homePagerAdapter;
    Integer toggle = 1;
    ViewPager imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        LinearLayout mobileBtn = findViewById(R.id.mobile_btn);
        ImageView mobileIcon = findViewById(R.id.mobile_icon);
        TextView mobileText = findViewById(R.id.mobile_txt);

        LinearLayout pcBtn = findViewById(R.id.pc_btn);
        ImageView pcIcon = findViewById(R.id.pc_icon);
        TextView pcText = findViewById(R.id.pc_txt);

        LinearLayout consoleBtn = findViewById(R.id.console_btn);
        ImageView consoleIcon = findViewById(R.id.console_icon);
        TextView consoleText = findViewById(R.id.console_txt);

        TextView username = findViewById(R.id.username);

        username.setText(GlobalData.username);

        imageSlider = findViewById(R.id.slider);

        CarouselAdapter carouselAdapter = new CarouselAdapter(this, carouselImages);
        imageSlider.setAdapter(carouselAdapter);

        if(toggle == 1){
            replaceFragment(new mobileFragment());
        }else if(toggle == 2){
            replaceFragment(new pcFragment());
        }else if (toggle == 3){
            replaceFragment(new consoleFragment());
        }

        mobileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle = 1;
                mobileBtn.setBackgroundResource(R.drawable.bg_selected);
                mobileIcon.setImageResource(R.drawable.mobile_selected);
                mobileText.setTextColor(getResources().getColor(R.color.ungu_gelap));

                consoleBtn.setBackgroundResource(R.drawable.bg_wallet);
                consoleIcon.setImageResource(R.drawable.console_vector);
                consoleText.setTextColor(getResources().getColor(R.color.white));

                pcBtn.setBackgroundResource(R.drawable.bg_wallet);
                pcIcon.setImageResource(R.drawable.pc_vector);
                pcText.setTextColor(getResources().getColor(R.color.white));

                replaceFragment(new mobileFragment());
            }
        });

        pcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle = 2;
                mobileBtn.setBackgroundResource(R.drawable.bg_wallet);
                mobileIcon.setImageResource(R.drawable.mobile_vector);
                mobileText.setTextColor(getResources().getColor(R.color.white));

                consoleBtn.setBackgroundResource(R.drawable.bg_wallet);
                consoleIcon.setImageResource(R.drawable.console_vector);
                consoleText.setTextColor(getResources().getColor(R.color.white));

                pcBtn.setBackgroundResource(R.drawable.bg_selected);
                pcIcon.setImageResource(R.drawable.pc_selected);
                pcText.setTextColor(getResources().getColor(R.color.ungu_gelap));

                replaceFragment(new pcFragment());
            }
        });

        consoleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggle = 3;
                mobileBtn.setBackgroundResource(R.drawable.bg_wallet);
                mobileIcon.setImageResource(R.drawable.mobile_vector);
                mobileText.setTextColor(getResources().getColor(R.color.white));

                pcBtn.setBackgroundResource(R.drawable.bg_wallet);
                pcIcon.setImageResource(R.drawable.pc_vector);
                pcText.setTextColor(getResources().getColor(R.color.white));

                consoleBtn.setBackgroundResource(R.drawable.bg_selected);
                consoleIcon.setImageResource(R.drawable.console_selected);
                consoleText.setTextColor(getResources().getColor(R.color.ungu_gelap));

                replaceFragment(new consoleFragment());
            }
        });

        autoImage();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Game game = (Game) parent.getItemAtPosition(position);
        Toast.makeText(HomePage.this, "Clicked", Toast.LENGTH_SHORT).show();
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_containet, fragment);
        fragmentTransaction.commit();
    }

    void autoImage(){
        imageSlider.postDelayed(new Runnable() {
            @Override
            public void run() {
                currImg = (imageSlider.getCurrentItem()+1)% carouselImages.length;
                imageSlider.setCurrentItem(currImg);
                autoImage();
            }
        }, 3000);
    }
}