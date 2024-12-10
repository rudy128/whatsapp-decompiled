package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BEB;
import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public abstract class zzmh {
    public static final Charset zza = StandardCharsets.UTF_16;

    public static String zzb(String str, byte[] bArr, zzmi zzmi) {
        int i = 0;
        byte[] decode = Base64.decode(str, 0);
        char c = 12;
        byte[] bArr2 = new byte[12];
        int length = decode.length - 12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(decode, 0, bArr2, 0, 12);
        System.arraycopy(decode, 12, bArr3, 0, length);
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        byte[] bArr4 = bArr;
        if (bArr4.length == 32) {
            int[] iArr2 = new int[16];
            int i2 = 0;
            do {
                iArr2[i2] = zza(iArr[i2], 2131181306);
                i2++;
            } while (i2 < 4);
            int i3 = 4;
            do {
                iArr2[i3] = BEB.A09(bArr4, (i3 - 4) * 4);
                i3++;
            } while (i3 < 12);
            iArr2[12] = 1;
            int i4 = 13;
            do {
                iArr2[i4] = BEB.A09(bArr2, (i4 - 13) * 4);
                i4++;
            } while (i4 < 16);
            int[] iArr3 = new int[16];
            System.arraycopy(iArr2, 0, iArr3, 0, 16);
            byte[] bArr5 = new byte[length];
            int i5 = 1;
            int i6 = 0;
            while (length > 0) {
                System.arraycopy(iArr3, i, iArr2, i, 16);
                iArr2[c] = i5;
                int i7 = 0;
                do {
                    int[] iArr4 = iArr;
                    byte[] bArr6 = bArr4;
                    byte[] bArr7 = bArr2;
                    int[] iArr5 = iArr2;
                    int[] iArr6 = iArr3;
                    zzc(i, 4, 8, 12, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(1, 5, 9, 13, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(2, 6, 10, 14, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(3, 7, 11, 15, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(i, 5, 10, 15, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(1, 6, 11, 12, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(2, 7, 8, 13, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    zzc(3, 4, 9, 14, iArr4, bArr6, bArr7, i5, iArr5, iArr6);
                    i7++;
                } while (i7 < 10);
                byte[] bArr8 = new byte[64];
                int i8 = 0;
                do {
                    int i9 = iArr2[i8];
                    int i10 = i8 * 4;
                    bArr8[i10] = (byte) (i9 & 255);
                    bArr8[i10 + 1] = (byte) ((i9 >> 8) & 255);
                    bArr8[i10 + 2] = (byte) ((i9 >> 16) & 255);
                    i8 = BE6.A0A((i9 >> 24) & 255, bArr8, i10 + 3, i8);
                } while (i8 < 16);
                int i11 = 0;
                while (i11 < Math.min(64, length)) {
                    int i12 = i6 + i11;
                    i11 = BE6.A0A(zza(bArr8[i11], bArr3[i12]), bArr5, i12, i11);
                }
                i5++;
                length -= 64;
                i6 += 64;
                i = 0;
                c = 12;
            }
            return BE6.A0q(zza, bArr5);
        }
        throw BE6.A0j();
    }

    public static final void zzd(int i, int i2, int i3, int i4, int[] iArr, byte[] bArr, byte[] bArr2, int i5, int[] iArr2, int[] iArr3) {
        int i6 = iArr2[i] + iArr2[i2];
        iArr2[i] = i6;
        int zza2 = zza(iArr2[i3], i6);
        iArr2[i3] = (zza2 << i4) | (zza2 >>> (32 - i4));
    }

    public static int zza(int i, int i2) {
        if (i % 2 == 0) {
            return BE8.A08(i2 ^ -1, i, i2);
        }
        return (i | i2) - (i & i2);
    }

    public static final void zzc(int i, int i2, int i3, int i4, int[] iArr, byte[] bArr, byte[] bArr2, int i5, int[] iArr2, int[] iArr3) {
        int i6 = iArr2[i] + iArr2[i2];
        iArr2[i] = i6;
        int zza2 = zza(iArr2[i4], i6);
        int i7 = (zza2 << 16) | (zza2 >>> 16);
        iArr2[i4] = i7;
        int i8 = iArr2[i3] + i7;
        iArr2[i3] = i8;
        int zza3 = zza(iArr2[i2], i8);
        int i9 = (zza3 << 12) | (zza3 >>> 20);
        iArr2[i2] = i9;
        int i10 = iArr2[i] + i9;
        iArr2[i] = i10;
        int zza4 = zza(iArr2[i4], i10);
        int i11 = (zza4 << 8) | (zza4 >>> 24);
        iArr2[i4] = i11;
        int i12 = iArr2[i3] + i11;
        iArr2[i3] = i12;
        int zza5 = zza(iArr2[i2], i12);
        iArr2[i2] = (zza5 << 7) | (zza5 >>> 25);
    }

    public static final int zze(byte[] bArr, int i) {
        return BEB.A09(bArr, i);
    }
}
