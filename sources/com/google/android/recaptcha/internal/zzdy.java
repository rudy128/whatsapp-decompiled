package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;

public final class zzdy implements zzdd {
    public static final zzdy zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof zzz)) {
                    A0b = null;
                }
                zzz zzz = (zzz) A0b;
                if (zzz != null) {
                    byte[] zzd = zzbp.zza(zzcj.zzg, zzz).zzd();
                    zzcj.zzh.zzb(str, zzfy.zzb.zzi(zzd, 0, zzd.length));
                    return;
                }
                throw BE6.A0V((Throwable) null, 4, 5);
            }
            throw BE6.A0V((Throwable) null, 4, 5);
        } else if (length == 0) {
            zzcj.zze.zzf(i, new zzz());
        } else {
            throw BE8.A0P();
        }
    }
}
