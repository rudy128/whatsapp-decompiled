package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;
import java.io.InputStream;

public final class zzoz extends zzit implements zzkf {
    public static final zzoz zzb;
    public int zzd;
    public int zze;
    public int zzf;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.recaptcha.internal.zzit, com.google.android.recaptcha.internal.zzoz] */
    static {
        ? zzit = new zzit();
        zzb = zzit;
        zzit.zzD(zzoz.class, zzit);
    }

    public static zzoz zzg(InputStream inputStream) {
        return (zzoz) zzit.zzt(zzb, inputStream);
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
            return BE6.A0Z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", objArr);
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

    public final zzpb zzi() {
        zzpb zzb2 = zzpb.zzb(this.zzf);
        if (zzb2 == null) {
            return zzpb.UNRECOGNIZED;
        }
        return zzb2;
    }
}
