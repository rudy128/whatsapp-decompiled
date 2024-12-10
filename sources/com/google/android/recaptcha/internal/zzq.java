package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass8BR;
import X.C17880vN;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;

public final class zzq {
    public final SharedPreferences zza;

    public final String zza(String str) {
        return this.zza.getString("_GRECAPTCHA_KC", (String) null);
    }

    public final void zzb(Map map) {
        SharedPreferences.Editor edit = this.zza.edit();
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            edit.putString(C17880vN.A0x(A16), AnonymousClass8BR.A10(A16));
        }
        edit.commit();
    }

    public zzq(Context context) {
        this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
    }
}
