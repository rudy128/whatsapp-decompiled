package com.google.android.recaptcha.internal;

import X.BE6;

public final class zzmo extends zzit implements zzkf {
    public static final zziz zzb = new Object();
    public static final zzmo zzd;
    public int zze;
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public zziy zzk = zziu.zza;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.google.android.recaptcha.internal.zziz] */
    static {
        zzmo zzmo = new zzmo();
        zzd = zzmo;
        zzit.zzD(zzmo.class, zzmo);
    }

    public static zzmn zzf() {
        return (zzmn) zzd.zzp();
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return BE6.A0Z(zzd, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzmo();
        } else {
            if (i2 == 4) {
                return new zzin(zzd);
            }
            if (i2 != 5) {
                return null;
            }
            return zzd;
        }
    }

    public static /* synthetic */ void zzH(zzmo zzmo, String str) {
        str.getClass();
        zzmo.zzf = str;
    }

    public static /* synthetic */ void zzJ(zzmo zzmo, String str) {
        str.getClass();
        zzmo.zzh = str;
    }

    public static /* synthetic */ void zzj(zzmo zzmo, String str) {
        str.getClass();
        zzmo.zzi = str;
    }

    public static /* synthetic */ void zzk(zzmo zzmo, String str) {
        str.getClass();
        zzmo.zzj = str;
    }
}
