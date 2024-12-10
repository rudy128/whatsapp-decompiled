package com.whatsapp.core;

import X.C18070vi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public final class RuntimeReceiverCompat$Api34Utils {
    public static final RuntimeReceiverCompat$Api34Utils INSTANCE = new Object();

    public final Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        C18070vi.A0i(context, intentFilter);
        int i = 4;
        if (z) {
            i = 2;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, i);
    }

    public final Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, boolean z) {
        Context context2 = context;
        IntentFilter intentFilter2 = intentFilter;
        C18070vi.A0i(context, intentFilter);
        int i = 4;
        if (z) {
            i = 2;
        }
        return context2.registerReceiver(broadcastReceiver, intentFilter2, str, handler, i);
    }
}
