package ProejctAkhir.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;

public class DetailPage extends AppCompatActivity {
    public ArrayList<Transaction> transactions = new ArrayList<>();
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int[] num = {0};
        final int[] price = {10000};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        TextView textNum = findViewById(R.id.stepper_num);
        TextView total = findViewById(R.id.total);
        TextView totalprice = findViewById(R.id.totalprice);
        TextView error = findViewById(R.id.errormsg);

        final String[] totalPrice = new String[1];

        Button button_plus = findViewById(R.id.plus_btn);
        Button button_min = findViewById(R.id.minus);
        Button paybutton = findViewById(R.id.paybutton);
        //OnClick Handler
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               num[0] = num[0] + 1;
               textNum.setText(String.valueOf(num[0]));
               total.setText(String.valueOf(num[0]));
               totalprice.setText("Rp. " + String.valueOf(numberFormat.format(num[0] * price[0])));
               error.setVisibility(View.GONE);
            }
        });

        button_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(num[0] > 0){
                   num[0] -= 1;
                   textNum.setText(String.valueOf(num[0]));
                   total.setText(String.valueOf(num[0]));
                   totalprice.setText("Rp. " + String.valueOf(numberFormat.format(num[0] * price[0])));
               }else if (num[0] == 0){
                   error.setVisibility(View.VISIBLE);
               }
            }
        });

        paybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalPrice[0] = String.valueOf(num[0] * price[0]);

                if(Integer.parseInt(totalPrice[0]) > Integer.parseInt(GlobalData.topUp_value)){
                    System.out.println(GlobalData.topUp_value);
                    new AlertDialog.Builder(DetailPage.this)
                            .setTitle("Not enough balance")
                            .setMessage("Top up your balance now")
                            .setPositiveButton("Topup", (dialog, which) -> {
                                intent = new Intent(DetailPage.this, ProfilePage.class);
                                startActivity(intent);
                                finish();
                            })
                            .show();

                }

                if (num[0] == 0){
                    error.setVisibility(View.VISIBLE);
                }else {
                    Transaction transaction = new Transaction("Valorant", "Newbie Pack", String.valueOf(num[0]), totalPrice[0]);
                    transactions.add(transaction);
                    GlobalData.transactions.add(transaction);
                    error.setVisibility(View.GONE);
                }
            }
        });


    }

    public void openDialog(){
        ErrorDialog errorDialog = new ErrorDialog();
    }
}