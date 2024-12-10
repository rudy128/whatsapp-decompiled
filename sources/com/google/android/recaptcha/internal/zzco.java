package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import java.lang.reflect.Array;

public final class zzco implements zzdd {
    public static final zzco zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
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
                    Object zza2 = zzcj.zze.zza(zzpqArr[2]);
                    if (true != (zza2 instanceof Object) || zza2 == null) {
                        throw BE6.A0V((Throwable) null, 4, 5);
                    }
                    try {
                        Array.set(A0k, intValue, zza2);
                    } catch (Exception e) {
                        if (e instanceof ArrayIndexOutOfBoundsException) {
                            throw BE6.A0V(e, 4, 22);
                        }
                        throw BE6.A0V(e, 4, 25);
                    }
                } else {
                    throw BE6.A0V((Throwable) null, 4, 5);
                }
            } else {
                throw BE6.A0V((Throwable) null, 4, 5);
            }
        } else {
            throw BE6.A0V((Throwable) null, 4, 3);
        }
    }
}
