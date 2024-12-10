package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE8;
import X.C17880vN;
import X.C17890vO;
import java.util.ArrayList;

public final class zzcm implements zzdd {
    public static final zzcm zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Object array;
        if (zzpqArr.length == 2) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof Object)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof Integer)) {
                    A0b = null;
                }
                Number number = (Number) A0b;
                if (number != null) {
                    int intValue = number.intValue();
                    if (zza2 instanceof Integer) {
                        array = Integer.valueOf(AnonymousClass000.A0M(zza2) + intValue);
                    } else if (zza2 instanceof int[]) {
                        ArrayList A0z = C17880vN.A0z(r3);
                        for (int i2 : (int[]) zza2) {
                            C17890vO.A1D(A0z, i2 + intValue);
                        }
                        array = A0z.toArray(new Integer[0]);
                    } else {
                        throw BE6.A0V((Throwable) null, 4, 5);
                    }
                    zzcj.zze.zzf(i, array);
                    return;
                }
                throw BE6.A0V((Throwable) null, 4, 5);
            }
            throw BE6.A0V((Throwable) null, 4, 5);
        }
        throw BE8.A0P();
    }
}
