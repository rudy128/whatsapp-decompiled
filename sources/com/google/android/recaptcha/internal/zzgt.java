package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE9;
import java.nio.charset.Charset;

public class zzgt extends zzgs {
    public final byte[] zza;

    public final boolean equals(Object obj) {
        int zzd;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if ((obj instanceof zzgw) && (zzd = zzd()) == ((zzgw) obj).zzd()) {
            if (zzd == 0) {
                return true;
            }
            if (!(obj instanceof zzgt)) {
                return obj.equals(this);
            }
            zzgt zzgt = (zzgt) obj;
            int i2 = this.zzc;
            int i3 = zzgt.zzc;
            if (i2 == 0 || i3 == 0 || i2 == i3) {
                if (zzd <= zzgt.zzd()) {
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgt.zza;
                    int i4 = 0;
                    while (i4 < zzd) {
                        if (bArr[i4] != bArr2[i]) {
                            return false;
                        }
                        i4++;
                        i++;
                    }
                    return true;
                }
                StringBuilder A10 = AnonymousClass000.A10();
                BE9.A1K(A10, zzd);
                throw AnonymousClass000.A0j(A10);
            }
        }
        return false;
    }

    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    public byte zza(int i) {
        return this.zza[i];
    }

    public byte zzb(int i) {
        return this.zza[i];
    }

    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, 0, bArr, 0, i3);
    }

    public final int zzf(int i, int i2, int i3) {
        byte[] bArr = this.zza;
        Charset charset = zzjc.zza;
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public zzgt(byte[] bArr) {
        if (bArr != null) {
            this.zza = bArr;
            return;
        }
        throw null;
    }

    public final zzgw zzg(int i, int i2) {
        int zzk = zzgw.zzk(0, i2, zzd());
        if (zzk == 0) {
            return zzgw.zzb;
        }
        return new zzgq(this.zza, 0, zzk);
    }

    public final String zzh(Charset charset) {
        return BE6.A0r(charset, this.zza, 0, zzd());
    }

    public final void zzi(zzgm zzgm) {
        ((zzhe) zzgm).zzc(this.zza, 0, zzd());
    }

    public final boolean zzj() {
        return zzma.zzf(this.zza, 0, zzd());
    }
}
