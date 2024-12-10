package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;

public final class zzot extends zzit implements zzkf {
    public static final zzot zzb;
    public String zzd = "";
    public String zze = "";
    public String zzf = "";

    static {
        zzot zzot = new zzot();
        zzb = zzot;
        zzit.zzD(zzot.class, zzot);
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
            return BE6.A0Z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", objArr);
        } else if (i2 == 3) {
            return new zzot();
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
