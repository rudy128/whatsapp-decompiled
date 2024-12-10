package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;

public final class zzcp implements zzdd {
    public static final zzcp zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Integer)) {
                A0k = null;
            }
            Number number = (Number) A0k;
            if (number != null) {
                int intValue = number.intValue();
                if (intValue != 0) {
                    Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                    if (true != (A0b instanceof Object) || A0b == null) {
                        throw BE6.A0V((Throwable) null, 4, 5);
                    }
                    Object zza2 = zzcj.zze.zza(zzpqArr[2]);
                    if (true != (zza2 instanceof Object) || zza2 == null) {
                        throw BE6.A0V((Throwable) null, 4, 5);
                    } else if (A0b.equals(zza2)) {
                        zzcj.zzd += intValue;
                    }
                } else {
                    throw BE6.A0V((Throwable) null, 4, 6);
                }
            } else {
                throw BE6.A0V((Throwable) null, 4, 5);
            }
        } else {
            throw BE6.A0V((Throwable) null, 4, 3);
        }
    }
}
