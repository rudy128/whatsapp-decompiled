package com.whatsapp;

import X.AnonymousClass000;
import X.C161138Bw;
import X.C17890vO;
import X.C25081Mu;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public class AlarmBroadcastReceiver extends C161138Bw {
    public C25081Mu A00;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Class<AlarmService> cls = AlarmService.class;
        Intent intent2 = new Intent(intent).setClass(context, cls);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        A10.append(intent);
        A10.append("; elapsedRealtime=");
        C17890vO.A16(A10, SystemClock.elapsedRealtime());
        try {
            this.A00.A01(context, intent2, cls, 3);
        } catch (IllegalArgumentException e) {
            Log.e("AlarmService/start-failed-with-exception", e);
        }
    }
}
