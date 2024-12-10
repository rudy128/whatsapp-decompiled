package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import X.C200410p;
import java.lang.reflect.Method;
import java.util.Arrays;

public final class zzdm implements zzdd {
    public static final zzdm zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        if (length != 0) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Method)) {
                A0k = null;
            }
            Method method = (Method) A0k;
            if (method != null) {
                Object[] zzh = zzcj.zze.zzh(C200410p.A0Q(zzpqArr).subList(1, length));
                try {
                    zzcj.zze.zzf(i, method.invoke((Object) null, Arrays.copyOf(zzh, zzh.length)));
                } catch (Exception e) {
                    throw BE6.A0V(e, 6, 15);
                }
            } else {
                throw BE8.A0Q();
            }
        } else {
            throw BE8.A0P();
        }
    }
}
