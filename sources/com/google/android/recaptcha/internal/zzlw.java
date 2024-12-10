package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import X.BEB;
import X.C108975cc;

public abstract class zzlw {
    public static /* bridge */ /* synthetic */ void zza(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (C108975cc.A1D(b2, -65) || BE8.A05(b, b2) != 0 || C108975cc.A1D(b3, -65) || C108975cc.A1D(b4, -65)) {
            throw BE6.A0Y("Protocol message had invalid UTF-8.");
        }
        BEB.A0j(((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6), b4 & 63, cArr, i);
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!C108975cc.A1D(b2, -65)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            } else if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!C108975cc.A1D(b3, -65)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw BE6.A0Y("Protocol message had invalid UTF-8.");
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || C108975cc.A1D(b2, -65)) {
            throw BE6.A0Y("Protocol message had invalid UTF-8.");
        }
        BE9.A14(b, b2, cArr, i);
    }

    public static boolean zze(byte b) {
        return C108975cc.A1D(b, -65);
    }
}
