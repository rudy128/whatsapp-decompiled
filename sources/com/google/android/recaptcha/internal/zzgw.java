package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE7;
import X.BE8;
import X.BEB;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzgw implements Iterable, Serializable {
    public static final Comparator zza = new Object();
    public static final zzgw zzb = new zzgt(zzjc.zzd);
    public static final zzgv zzd = new Object();
    public int zzc = 0;

    public abstract boolean equals(Object obj);

    public final /* synthetic */ Iterator iterator() {
        return new zzgn(this);
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf(int i, int i2, int i3);

    public abstract zzgw zzg(int i, int i2);

    public abstract String zzh(Charset charset);

    public abstract void zzi(zzgm zzgm);

    public abstract boolean zzj();

    public final int zzl() {
        return this.zzc;
    }

    public final String zzn(Charset charset) {
        return zzd() == 0 ? "" : zzh(charset);
    }

    public static int zzk(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            if (i2 < i) {
                A10.append("Beginning index larger than ending index: ");
                A10.append(i);
                throw BE6.A0l(AnonymousClass001.A1I(", ", A10, i2));
            }
            A10.append("End index: ");
            A10.append(i2);
            throw BE6.A0l(AnonymousClass001.A1I(" >= ", A10, i3));
        }
        throw BEB.A0U(AnonymousClass000.A10(), i);
    }

    public static zzgw zzm(byte[] bArr, int i, int i2) {
        zzk(i, i + i2, bArr.length);
        return new zzgt(BE7.A1Z(bArr, i2, i));
    }

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzf(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = BE8.A0h(this);
        int zzd2 = zzd();
        AnonymousClass000.A1M(A1a, zzd2);
        if (zzd2 <= 50) {
            concat = zzlg.zza(this);
        } else {
            concat = zzlg.zza(zzg(0, 47)).concat("...");
        }
        A1a[2] = concat;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", A1a);
    }

    public final byte[] zzo() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzjc.zzd;
        }
        byte[] bArr = new byte[zzd2];
        System.arraycopy(((zzgt) this).zza, 0, bArr, 0, zzd2);
        return bArr;
    }
}
