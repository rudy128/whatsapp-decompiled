package com.google.android.recaptcha.internal;

import X.BE6;

public final class zzox extends zzit implements zzkf {
    public static final zzox zzb;
    public int zzd;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.recaptcha.internal.zzit, com.google.android.recaptcha.internal.zzox] */
    static {
        ? zzit = new zzit();
        zzb = zzit;
        zzit.zzD(zzox.class, zzit);
    }

    public static zzox zzg(byte[] bArr) {
        return (zzox) zzit.zzu(zzb, bArr);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return BE6.A0Z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
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
        zzpb zzb2 = zzpb.zzb(this.zzd);
        if (zzb2 == null) {
            return zzpb.UNRECOGNIZED;
        }
        return zzb2;
    }
}
