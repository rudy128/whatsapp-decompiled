package com.google.android.recaptcha.internal;

import X.BE8;
import X.BE9;

public final class zzds implements zzdd {
    public static final zzds zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 1) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof String)) {
                A0k = null;
            }
            String str = (String) A0k;
            if (str != null) {
                zzcj.zzc = str;
                return;
            }
            throw BE8.A0Q();
        }
        throw BE8.A0P();
    }
}
