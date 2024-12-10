package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;

public final class zzdh implements zzdd {
    public static final zzdh zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Class<?> cls;
        if (zzpqArr.length == 2) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Object)) {
                A0k = null;
            }
            if (A0k != null) {
                if (A0k instanceof Class) {
                    cls = (Class) A0k;
                } else {
                    cls = A0k.getClass();
                }
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof String)) {
                    A0b = null;
                }
                String str = (String) A0b;
                if (str != null) {
                    try {
                        zzcj.zze.zzf(i, cls.getField(zzcj.zzi.zza(str)));
                    } catch (Exception e) {
                        throw BE6.A0V(e, 6, 10);
                    }
                } else {
                    throw BE6.A0V((Throwable) null, 4, 5);
                }
            } else {
                throw BE6.A0V((Throwable) null, 4, 5);
            }
        } else {
            throw BE8.A0P();
        }
    }
}
