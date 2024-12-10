package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;
import java.util.List;

public final class zzpn extends zzit implements zzkf {
    public static final zzpn zzb;
    public String zzd = "";
    public zziy zze = zziu.zza;
    public zzja zzf = zzjt.zza;

    public final String zzi() {
        return this.zzd;
    }

    public final List zzj() {
        return this.zzf;
    }

    static {
        zzpn zzpn = new zzpn();
        zzb = zzpn;
        zzit.zzD(zzpn.class, zzpn);
    }

    public static zzpn zzg(byte[] bArr) {
        return (zzpn) zzit.zzu(zzb, bArr);
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
            return BE6.A0Z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%", objArr);
        } else if (i2 == 3) {
            return new zzpn();
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
