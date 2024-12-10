package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE9;
import X.BEB;
import java.io.InputStream;
import java.util.List;

public final class zzoe extends zzit implements zzkf {
    public static final zzoe zzb;
    public int zzd;
    public String zze = "";
    public String zzf = "";
    public String zzg = "";
    public String zzh = "";
    public String zzi = "";
    public String zzj = "";
    public zzja zzk = zzjt.zza;
    public zzgw zzl = zzgw.zzb;
    public String zzm = "";

    public final String zzH() {
        return this.zzg;
    }

    public final String zzI() {
        return this.zzi;
    }

    public final String zzJ() {
        return this.zzj;
    }

    public final List zzK() {
        return this.zzk;
    }

    public final zzgw zzf() {
        return this.zzl;
    }

    public final String zzj() {
        return this.zzf;
    }

    public final String zzk() {
        return this.zzh;
    }

    static {
        zzoe zzoe = new zzoe();
        zzb = zzoe;
        zzit.zzD(zzoe.class, zzoe);
    }

    public static zzoe zzi(InputStream inputStream) {
        return (zzoe) zzit.zzt(zzb, inputStream);
    }

    public final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            Object[] objArr = new Object[10];
            BEB.A1W(objArr);
            BE9.A1P(objArr);
            objArr[7] = "zzk";
            objArr[8] = "zzl";
            objArr[9] = "zzm";
            return BE6.A0Z(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\tለ\u0007", objArr);
        } else if (i2 == 3) {
            return new zzoe();
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
