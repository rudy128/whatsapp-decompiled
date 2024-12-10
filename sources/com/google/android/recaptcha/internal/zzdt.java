package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import java.lang.reflect.Field;

public final class zzdt implements zzdd {
    public static final zzdt zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 3) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Field)) {
                A0k = null;
            }
            Field field = (Field) A0k;
            if (field != null) {
                try {
                    field.set(BE8.A0b(zzcj, zzpqArr, 1), zzcj.zze.zza(zzpqArr[2]));
                } catch (Exception e) {
                    throw BE6.A0V(e, 6, 11);
                }
            } else {
                throw BE8.A0Q();
            }
        } else {
            throw BE6.A0V((Throwable) null, 4, 3);
        }
    }
}
