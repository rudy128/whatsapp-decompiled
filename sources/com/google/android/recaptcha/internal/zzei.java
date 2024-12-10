package com.google.android.recaptcha.internal;

import X.AnonymousClass8BR;
import X.BE6;
import X.BE8;
import X.BEA;
import X.C17880vN;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public final class zzei implements zzen {
    public final Context zzb;

    public zzei(Context context) {
        this.zzb = context;
    }

    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }

    public final Object zza(Object... objArr) {
        Intent registerReceiver = this.zzb.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("health", -1);
            int intExtra2 = registerReceiver.getIntExtra("level", -1);
            int intExtra3 = registerReceiver.getIntExtra("plugged", -1);
            boolean booleanExtra = registerReceiver.getBooleanExtra("present", false);
            int intExtra4 = registerReceiver.getIntExtra("scale", -1);
            int intExtra5 = registerReceiver.getIntExtra("status", -1);
            String stringExtra = registerReceiver.getStringExtra("technology");
            if (stringExtra == null) {
                stringExtra = "";
            }
            int intExtra6 = registerReceiver.getIntExtra("temperature", -1);
            int intExtra7 = registerReceiver.getIntExtra("voltage", -1);
            Object[] objArr2 = new Object[9];
            BEA.A1U(objArr2, intExtra, intExtra2);
            BE8.A1M(objArr2, intExtra3);
            AnonymousClass8BR.A1L(objArr2, 3, booleanExtra);
            C17880vN.A1T(objArr2, intExtra4, 4);
            C17880vN.A1T(objArr2, intExtra5, 5);
            BE8.A1A(stringExtra, objArr2, 6, intExtra6, 7);
            C17880vN.A1T(objArr2, intExtra7, 8);
            return objArr2;
        }
        throw BE6.A0V((Throwable) null, 7, 19);
    }
}
