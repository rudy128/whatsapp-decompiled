package com.google.android.recaptcha.internal;

import X.AnonymousClass3MW;
import X.BE8;
import X.C17880vN;

public abstract class zzme {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzia zzi = zzib.zzi();
        zzi.zze(-315576000000L);
        zzi.zzd(-999999999);
        zza = (zzib) zzi.zzj();
        zzia zzi2 = zzib.zzi();
        zzi2.zze(315576000000L);
        zzi2.zzd(999999999);
        zzb = (zzib) zzi2.zzj();
        zzia zzi3 = zzib.zzi();
        zzi3.zze(0);
        zzi3.zzd(0);
        zzc = (zzib) zzi3.zzj();
    }

    public static zzib zza(long j) {
        int i = (int) (j % 1000000000);
        long j2 = j / 1000000000;
        if (i <= -1000000000 || i >= 1000000000) {
            j2 = zzgb.zza(j2, (long) (i / 1000000000));
            i %= 1000000000;
        }
        if (j2 > 0 && i < 0) {
            i += 1000000000;
            j2--;
        }
        if (j2 < 0 && i > 0) {
            i -= 1000000000;
            j2++;
        }
        zzia zzi = zzib.zzi();
        zzi.zze(j2);
        zzi.zzd(i);
        zzib zzib = (zzib) zzi.zzj();
        long j3 = zzib.zzd;
        int i2 = zzib.zze;
        if (j3 >= -315576000000L && j3 <= 315576000000L && ((long) i2) >= -999999999 && i2 < 1000000000 && ((j3 >= 0 && i2 >= 0) || (j3 <= 0 && i2 <= 0))) {
            return zzib;
        }
        Object[] A1b = AnonymousClass3MW.A1b();
        BE8.A1N(A1b, j3);
        C17880vN.A1T(A1b, i2, 1);
        throw BE8.A0X("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", A1b);
    }
}
