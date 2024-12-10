package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE8;

public final class zzdx implements zzdd {
    public static final zzdx zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof int[])) {
                zza2 = null;
            }
            int[] iArr = (int[]) zza2;
            if (iArr != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof String)) {
                    A0b = null;
                }
                String str = (String) A0b;
                if (str != null) {
                    zzck zzck = zzcj.zze;
                    StringBuilder A10 = AnonymousClass000.A10();
                    try {
                        for (int charAt : iArr) {
                            A10.append(str.charAt(charAt));
                        }
                        zzck.zzf(i, A10.toString());
                    } catch (Exception e) {
                        throw BE6.A0V(e, 4, 22);
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
