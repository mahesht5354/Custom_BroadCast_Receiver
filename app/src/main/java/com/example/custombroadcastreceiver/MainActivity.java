package com.example.custombroadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String CUSTOM_BROADCAST = "AnyUniqueStringCanBeGivenHere";
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textview);

        IntentFilter filter = new IntentFilter(CUSTOM_BROADCAST);
        registerReceiver(new MyReceiver(tv),filter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(new MyReceiver(tv));
    }
}