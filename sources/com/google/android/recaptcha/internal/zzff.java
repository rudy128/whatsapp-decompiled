package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.BE6;
import X.BE8;
import X.BEA;

public abstract class zzff {
    public static String zzf(int i, int i2, String str) {
        Object[] A1a;
        String str2;
        if (i < 0) {
            A1a = new Object[2];
            BE8.A1A(str, A1a, 0, i, 1);
            str2 = "%s (%s) must not be negative";
        } else {
            A1a = AnonymousClass8BR.A1a();
            A1a[0] = str;
            BEA.A1V(A1a, i, 1, i2, 2);
            str2 = "%s (%s) must not be greater than size (%s)";
        }
        return zzfi.zza(str2, A1a);
    }

    public static void zza(boolean z) {
        if (!z) {
            throw BE6.A0j();
        }
    }

    public static void zzb(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass000.A0k((String) obj);
        }
    }

    public static void zzc(boolean z, String str, char c) {
        if (!z) {
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = Character.valueOf(c);
            throw AnonymousClass000.A0k(zzfi.zza(str, A1a));
        }
    }

    public static void zzd(int i, int i2, int i3) {
        String str;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    str = zzf(i2, i3, "end index");
                } else {
                    Object[] A1b = AnonymousClass3MW.A1b();
                    BEA.A1U(A1b, i2, i);
                    str = zzfi.zza("end index (%s) must not be less than start index (%s)", A1b);
                }
                throw BE6.A0l(str);
            }
        }
        str = zzf(i, i3, "start index");
        throw BE6.A0l(str);
    }

    public static void zze(boolean z, Object obj) {
        if (!z) {
            throw AnonymousClass000.A0n((String) obj);
        }
    }
}
