package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;

public final class zznz extends zzit implements zzkf {
    public static final zznz zzb;
    public int zzd;
    public zznx zze;
    public zznx zzf;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.recaptcha.internal.zzit, com.google.android.recaptcha.internal.zznz] */
    static {
        ? zzit = new zzit();
        zzb = zzit;
        zzit.zzD(zznz.class, zzit);
    }

    public static zznz zzj(byte[] bArr) {
        return (zznz) zzit.zzu(zzb, bArr);
    }

    public final zznx zzf() {
        zznx zznx = this.zze;
        if (zznx == null) {
            return zznx.zzb;
        }
        return zznx;
    }

    public final zznx zzg() {
        zznx zznx = this.zzf;
        if (zznx == null) {
            return zznx.zzb;
        }
        return zznx;
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
            return BE6.A0Z(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", objArr);
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
