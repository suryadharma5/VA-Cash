package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class ProfilePage extends AppCompatActivity implements ProfileInterface{
    NumberFormat numberFormat = NumberFormat.getNumberInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        RecyclerView recyclerView = findViewById(R.id.repeater);
        TextView balance = findViewById(R.id.balance);
        balance.setText("IDR " +numberFormat.format(Integer.parseInt(GlobalData.topUp_value)));

        ArrayList<Transaction> test= new ArrayList<Transaction>();
        test.add(new Transaction("coba1", "item1", "2", "10000"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if(GlobalData.transactions.size() > 0){
            recyclerView.setAdapter(new RecycleAdapter(this, GlobalData.transactions, this));
        }

        TextView error = findViewById(R.id.error);
        error.setVisibility(View.GONE);

        EditText topUp_input = findViewById(R.id.topup_field);
        Button button = findViewById(R.id.topup_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String topUp_value = topUp_input.getText().toString();

                if(TextUtils.isDigitsOnly(topUp_value)){
                    int amount = Integer.parseInt(topUp_value);
                    if(amount > 0){
                        GlobalData.topUp_value = String.valueOf( Integer.parseInt(GlobalData.topUp_value) + Integer.parseInt(topUp_value));
                        TextView balance = findViewById(R.id.balance);
                        balance.setText("IDR " + numberFormat.format(Integer.parseInt(GlobalData.topUp_value)));
                        error.setVisibility(View.GONE);
                    }else {
                        error.setText("Value must > 0");
                        error.setVisibility(View.VISIBLE);
                    }

                }else {
                    error.setText("Value must be a number");
                    error.setVisibility(View.VISIBLE);
                }
            }
        });

        Animation slideDownAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);
        Animation slideUpAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        Animation fadeInAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
        Animation fadeOutAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_out);

        ImageView drawer_btn = findViewById(R.id.drawer_btn);
        LinearLayout dropdownList = findViewById(R.id.dropdownList);
        RelativeLayout overlay = findViewById(R.id.overlay);

        drawer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (dropdownList.getVisibility() == View.VISIBLE) {
                    dropdownList.startAnimation(slideUpAnimation);
                    dropdownList.setVisibility(View.INVISIBLE);
                } else {
                    dropdownList.setVisibility(View.VISIBLE);
                    dropdownList.startAnimation(slideDownAnimation);
                }

                if (overlay.getVisibility() == View.VISIBLE) {
                    overlay.startAnimation(fadeOutAnimation);
                    overlay.setVisibility(View.INVISIBLE);
                } else {
                    overlay.setVisibility(View.VISIBLE);
                    overlay.startAnimation(fadeInAnimation);
                }
            }
        });



    }

    @Override
    public void onItemClick(int position) {
        Game game = GlobalData.games.get(0);
        System.out.println("halo");

        for (Game g:GlobalData.games) {
            if (g.getName().equals(GlobalData.transactions.get(position).getName())) {
                game = g;
                break;
            }
        }

        Intent intent = new Intent(ProfilePage.this, ItemActivity.class);
        intent.putExtra("items", game.getItems());
        intent.putExtra("gameName", game.getName());
        intent.putExtra("gameType", game.getGameType());
        startActivity(intent);
    }
}