package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private static final String VUN = "user";
    private static final String VP = "pass";
    private EditText username;
    private EditText password;
    private Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.uname);
        password = findViewById(R.id.pwd);
        loginbtn = findViewById(R.id.lbtn);
        loginbtn.setOnClickListener(view -> {

            String enteredUname = username.getText().toString().trim();
            String enteredPwd = password.getText().toString().trim();
            if (enteredUname.isEmpty() || enteredPwd.isEmpty()) {
                showToast("Please enter both username and password");
            } else if (isValid(enteredUname, enteredPwd)) {
                showToast("Login Success");
            } else {
                showToast("Invalid credentials");
            }
        });
    }
    public boolean isValid(String euname, String epwd) {
        return VUN.equals(euname) && VP.equals(epwd);
    }
    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}