package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;

public final class zzib extends zzit implements zzkf {
    public static final zzib zzb;
    public long zzd;
    public int zze;

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.recaptcha.internal.zzit, com.google.android.recaptcha.internal.zzib] */
    static {
        ? zzit = new zzit();
        zzb = zzit;
        zzit.zzD(zzib.class, zzit);
    }

    public static zzia zzi() {
        return (zzia) zzb.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[2];
            BE9.A1O(objArr);
            return BE6.A0Z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", objArr);
        } else if (i2 == 3) {
            return new zzit();
        } else {
            if (i2 == 4) {
                return new zzin(zzb);
            }
            if (i2 == 5) {
                return zzb;
            }
            return null;
        }
    }
}
