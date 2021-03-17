package com.example.trabajopracticointegrador1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

import static android.content.Intent.ACTION_CALL;

public class HacerLlamada extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel: 911"));

            context.startActivity(i);

    }
}

