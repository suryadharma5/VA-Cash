package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

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
                        String topUp_val = GlobalData.topUp_value;
                        balance.setText("Rp." + topUp_val);
                    }else {
                        topUp_input.setError("Value must be greater than 0");
                    }

                }else {
                    topUp_input.setError("Value must be a number");
                }
            }
        });



    }
}