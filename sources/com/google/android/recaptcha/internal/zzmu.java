package com.google.android.recaptcha.internal;

import X.BE6;
import X.BEB;

public final class zzmu extends zzit implements zzkf {
    public static final zzmu zzb;
    public String zzd = "";
    public String zze = "";
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";

    static {
        zzmu zzmu = new zzmu();
        zzb = zzmu;
        zzit.zzD(zzmu.class, zzmu);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[6];
            BEB.A1W(objArr);
            objArr[5] = "zzi";
            return BE6.A0Z(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ", objArr);
        } else if (i2 == 3) {
            return new zzmu();
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
