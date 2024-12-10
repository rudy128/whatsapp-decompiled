package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;

public final class zzml extends zzit implements zzkf {
    public static final zzml zzb;
    public int zzd;
    public zzib zze;
    public int zzf;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.recaptcha.internal.zzit, com.google.android.recaptcha.internal.zzml] */
    static {
        ? zzit = new zzit();
        zzb = zzit;
        zzit.zzD(zzml.class, zzit);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[3];
            BE9.A1O(objArr);
            objArr[2] = "zzf";
            return BE6.A0Z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", objArr);
        } else if (i2 == 3) {
            return new zzit();
        } else {
            if (i2 == 4) {
                return new zzin(zzb);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
