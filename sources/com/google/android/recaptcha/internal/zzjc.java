package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import com.facebook.msys.mci.DefaultCrypto;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public abstract class zzjc {
    public static final Charset zza = Charset.forName("US-ASCII");
    public static final Charset zzb = Charset.forName(DefaultCrypto.UTF_8);
    public static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzhc zzf;

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzhc.zzH(bArr, 0, 0, false);
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw AnonymousClass000.A0s("messageType");
    }

    public static String zzd(byte[] bArr) {
        return BE6.A0q(zzb, bArr);
    }
}
