package com.example.custombroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    TextView tv;

    public MyReceiver(TextView tv) {
        this.tv = tv;
    }

    @Override
    public void onReceive(Context context, Intent intent) {

       if (intent.getAction() == MainActivity.CUSTOM_BROADCAST)
       {
           Toast.makeText(context, "Custom BroadCast Received from other app", Toast.LENGTH_LONG).show();
           tv.setText("Custom BroadCast Received from other app");
       }
    }
}