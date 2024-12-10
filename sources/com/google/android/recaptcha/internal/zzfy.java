package com.google.android.recaptcha.internal;

import X.AnonymousClass8BR;
import X.BE6;
import java.io.IOException;

public abstract class zzfy {
    public static final zzfy zza = new zzfv("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final zzfy zzb = new zzfv("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final zzfy zzc = new zzfx("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    public static final zzfy zzd = new zzfx("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    public static final zzfy zze = new zzfu("base16()", "0123456789ABCDEF");

    public static zzfy zzg() {
        return zza;
    }

    public static zzfy zzh() {
        return zzb;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence);

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2);

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public abstract CharSequence zze(CharSequence charSequence);

    public final String zzi(byte[] bArr, int i, int i2) {
        zzff.zzd(0, i2, bArr.length);
        StringBuilder A0t = BE6.A0t(zzd(i2));
        try {
            zzb(A0t, bArr, 0, i2);
            return A0t.toString();
        } catch (IOException e) {
            throw AnonymousClass8BR.A0v(e);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zze2 = zze(charSequence);
            int zzc2 = zzc(zze2.length());
            byte[] bArr = new byte[zzc2];
            int zza2 = zza(bArr, zze2);
            if (zza2 == zzc2) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzfw e) {
            throw new IllegalArgumentException(e);
        }
    }
}
