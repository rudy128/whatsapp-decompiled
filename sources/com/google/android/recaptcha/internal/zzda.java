package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import java.lang.reflect.Array;

public final class zzda implements zzdd {
    public static final zzda zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Object)) {
                A0k = null;
            }
            if (A0k != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof Integer)) {
                    A0b = null;
                }
                Number number = (Number) A0b;
                if (number != null) {
                    int intValue = number.intValue();
                    try {
                        if (A0k instanceof String) {
                            A0k = zzcj.zzi.zza((String) A0k);
                        }
                        zzcj.zze.zzf(i, Array.newInstance(zzci.zza(A0k), intValue));
                    } catch (Exception e) {
                        throw BE6.A0V(e, 6, 21);
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
