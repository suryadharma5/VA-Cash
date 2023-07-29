package ProejctAkhir.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import ProejctAkhir.myapplication.HomePage;
import ProejctAkhir.myapplication.R;

public class MainActivity extends AppCompatActivity {
    boolean emailCorrect = false;
    boolean passCorrect = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText emailField = findViewById(R.id.loginEmail);
        EditText passField = findViewById(R.id.loginPass);
        RelativeLayout emailBox = findViewById(R.id.email_field);
        RelativeLayout passBox = findViewById(R.id.pass_field);
        Button loginBtn = findViewById(R.id.loginBtn);
        TextView errEmail = findViewById(R.id.emailErr);
        TextView errPass = findViewById(R.id.passErr);


        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String email = emailField.getText().toString().trim();
                String password = passField.getText().toString().trim();

                // Check if the email field is empty
                if (TextUtils.isEmpty(email)) {
                    errEmail.setText("Email field must be filled!");
                    emailBox.setBackgroundResource(R.drawable.login_field_err);
                    emailCorrect = false;
                }
                // Check if the email does not contain the "@" symbol
                else if (!email.contains("@")) {
                    errEmail.setText("Email must contain '@'!");
                    emailBox.setBackgroundResource(R.drawable.login_field_err);
                    emailCorrect = false;
                }
                // Check if the email does not end with ".com"
                else if (!email.endsWith(".com")) {
                    errEmail.setText("Email must end with '.com'!");
                    emailBox.setBackgroundResource(R.drawable.login_field_err);
                    emailCorrect = false;
                }else {
                    errEmail.setText("");
                    emailBox.setBackgroundResource(R.drawable.login_field);
                    emailCorrect = true;
                }

                // Check if the password field is empty
                if (TextUtils.isEmpty(password)) {
                    errPass.setText("Password field must be filled!");
                    passBox.setBackgroundResource(R.drawable.login_field_err);
                    passCorrect = false;
                }
                // Check if the password length is less than 8
                else if (password.length() < 8) {
                    errPass.setText("Password’s length must be at least 8 characters!");
                    passBox.setBackgroundResource(R.drawable.login_field_err);
                    passCorrect = false;
                }else {
                    errPass.setText("");
                    passBox.setBackgroundResource(R.drawable.login_field);
                    passCorrect = true;
                }

                if(emailCorrect == true && passCorrect == true){
                    GlobalData.username = email.split("@")[0];
                    Intent toHome = new Intent(getApplicationContext(), HomePage.class);
                    startActivity(toHome);
                    overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                }

            }
        });
    }
}