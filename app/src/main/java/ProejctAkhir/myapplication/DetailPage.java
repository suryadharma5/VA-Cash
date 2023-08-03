package ProejctAkhir.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.ArrayList;

public class DetailPage extends AppCompatActivity {
    public ArrayList<Transaction> transactions = new ArrayList<>();
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final int[] num = {0};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        Intent detail = getIntent();
        final int[] price = {10000};

        NumberFormat numberFormat = NumberFormat.getNumberInstance();

        TextView textNum = findViewById(R.id.stepper_num);
        TextView total = findViewById(R.id.total);
        TextView totalprice = findViewById(R.id.totalprice);
        TextView hargaItem = findViewById(R.id.harga_item);
        TextView error = findViewById(R.id.errormsg);
        TextView itemName = findViewById(R.id.item_name);
        TextView detailName = findViewById(R.id.detail_name);
        TextView description = findViewById(R.id.itemdesc);
        TextView detailGameName = findViewById(R.id.detaile_game_name);

        detailGameName.setText(detail.getStringExtra("gameName"));
        itemName.setText(detail.getStringExtra("nameitem"));
        hargaItem.setText("Rp " + numberFormat.format(Integer.parseInt(detail.getStringExtra("price"))));
        description.setText(detail.getStringExtra("description"));
        detailName.setText(detail.getStringExtra("nameitem") );

        EditText emailInput = findViewById(R.id.pay_email);
        EditText usernameInput = findViewById(R.id.pay_username);

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
               totalprice.setText("Rp. " + String.valueOf(numberFormat.format(num[0] * Integer.parseInt(detail.getStringExtra("price")))));
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
                totalPrice[0] = String.valueOf(num[0] * Integer.parseInt(detail.getStringExtra("price")));
                String emailField = emailInput.getText().toString().trim();
                String username = usernameInput.getText().toString().trim();

                if(TextUtils.isEmpty(emailField)){
                    new AlertDialog.Builder(DetailPage.this)
                            .setTitle("Input your email")
                            .setMessage("Email field can't be empty")
                            .setPositiveButton("Close", (dialog, which) -> dialog.dismiss())
                            .show();
                }else if(TextUtils.isEmpty(username)){
                    new AlertDialog.Builder(DetailPage.this)
                            .setTitle("Input your username")
                            .setMessage("Username field can't be empty")
                            .setPositiveButton("Close", (dialog, which) -> dialog.dismiss())
                            .show();
                }else if (num[0] == 0){
                    new AlertDialog.Builder(DetailPage.this)
                            .setTitle("Input Quantity")
                            .setMessage("Quantity must > 0")
                            .setPositiveButton("Close", (dialog, which) -> dialog.dismiss())
                            .show();
                }else  if(Integer.parseInt(totalPrice[0]) > Integer.parseInt(GlobalData.topUp_value)) {
                    new AlertDialog.Builder(DetailPage.this)
                            .setTitle("Not enough balance")
                            .setMessage("Top up your balance now")
                            .setPositiveButton("Topup", (dialog, which) -> {
                                intent = new Intent(DetailPage.this, ProfilePage.class);
                                startActivity(intent);
                                finish();
                            })
                            .show();
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