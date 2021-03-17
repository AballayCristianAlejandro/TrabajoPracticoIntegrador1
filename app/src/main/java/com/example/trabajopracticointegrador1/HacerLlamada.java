package com.example.trabajopracticointegrador1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;



public class HacerLlamada extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        boolean estado= intent.getAction().equals(Intent.ACTION_POWER_CONNECTED);
        if (estado) {
            Intent i = new Intent(Intent.ACTION_CALL,Uri.parse("tel: 911"));
            context.startActivity(i);
        }
    }
}

