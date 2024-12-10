package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;

public final class zzcu implements zzdd {
    public static final zzcu zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof String)) {
                A0k = null;
            }
            String str = (String) A0k;
            if (str != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof String)) {
                    A0b = null;
                }
                String str2 = (String) A0b;
                if (str2 != null) {
                    zzcj.zze.zzf(i, str.concat(str2));
                    return;
                }
                throw BE6.A0V((Throwable) null, 4, 5);
            }
            throw BE6.A0V((Throwable) null, 4, 5);
        }
        throw BE8.A0P();
    }
}
