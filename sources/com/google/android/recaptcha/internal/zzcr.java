package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;

public final class zzcr implements zzdd {
    public static final zzcr zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (A0b == null) {
                    throw new zzae(4, 4, (Throwable) null);
                } else if ((A0b instanceof Integer) || (A0b instanceof Short) || (A0b instanceof Byte) || (A0b instanceof Long) || (A0b instanceof Double) || (A0b instanceof Float) || (A0b instanceof Boolean) || (A0b instanceof Character) || (A0b instanceof String)) {
                    zzcj.zzh.zzb(str, A0b.toString());
                } else {
                    throw BE6.A0V((Throwable) null, 4, 7);
                }
            } else {
                throw BE8.A0Q();
            }
        } else {
            throw BE8.A0P();
        }
    }
}
