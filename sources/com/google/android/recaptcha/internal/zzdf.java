package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;

public final class zzdf implements zzdd {
    public static final zzdf zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 1) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Object) || A0k == null) {
                throw BE8.A0Q();
            }
            try {
                if (A0k instanceof String) {
                    A0k = zzcj.zzi.zza((String) A0k);
                }
                zzcj.zze.zzf(i, zzci.zza(A0k));
            } catch (zzae e) {
                throw e;
            } catch (Exception e2) {
                throw BE6.A0V(e2, 6, 8);
            }
        } else {
            throw BE8.A0P();
        }
    }
}
