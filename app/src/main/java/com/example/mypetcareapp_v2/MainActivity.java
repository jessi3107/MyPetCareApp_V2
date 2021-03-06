package com.example.mypetcareapp_v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);
    }

    public void sendMessage2(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, RegistroPerfilMascotaActivity.class);
        startActivity(intent);
    }
}