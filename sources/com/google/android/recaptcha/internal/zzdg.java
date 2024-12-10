package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import X.C200410p;
import java.util.Arrays;

public final class zzdg implements zzdd {
    public static final zzdg zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length != 0) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Class)) {
                A0k = null;
            }
            Class cls = (Class) A0k;
            if (cls != null) {
                Class[] zzg = zzcj.zze.zzg(C200410p.A0Q(zzpqArr).subList(1, length));
                try {
                    zzcj.zze.zzf(i, cls.getConstructor((Class[]) Arrays.copyOf(zzg, zzg.length)));
                } catch (Exception e) {
                    throw BE6.A0V(e, 6, 9);
                }
            } else {
                throw BE8.A0Q();
            }
        } else {
            throw BE8.A0P();
        }
    }
}
