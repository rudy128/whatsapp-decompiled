package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import java.lang.reflect.Array;
import java.util.List;

public final class zzcn implements zzdd {
    public static final zzcn zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Object obj;
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
                            obj = String.valueOf(((String) A0k).charAt(intValue));
                        } else if (A0k instanceof List) {
                            obj = ((List) A0k).get(intValue);
                        } else {
                            obj = Array.get(A0k, intValue);
                        }
                        zzcj.zze.zzf(i, obj);
                    } catch (Exception e) {
                        if (e instanceof ArrayIndexOutOfBoundsException) {
                            throw BE6.A0V(e, 4, 22);
                        }
                        throw BE6.A0V(e, 4, 23);
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
