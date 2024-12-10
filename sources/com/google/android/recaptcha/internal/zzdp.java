package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.C200410p;
import java.lang.reflect.Constructor;
import java.util.Arrays;

public final class zzdp implements zzdd {
    public static final zzdp zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Constructor<?> constructor;
        int length = zzpqArr.length;
        if (length != 0) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof Object) || zza2 == null) {
                throw BE8.A0Q();
            }
            if (zza2 instanceof Constructor) {
                constructor = (Constructor) zza2;
            } else {
                constructor = zza2.getClass().getConstructor(new Class[0]);
            }
            Object[] zzh = zzcj.zze.zzh(C200410p.A0Q(zzpqArr).subList(1, length));
            try {
                zzcj.zze.zzf(i, constructor.newInstance(Arrays.copyOf(zzh, zzh.length)));
            } catch (Exception e) {
                throw BE6.A0V(e, 6, 14);
            }
        } else {
            throw BE8.A0P();
        }
    }
}
