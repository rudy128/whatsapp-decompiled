package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import X.BE9;
import X.C18070vi;
import X.C200410p;
import java.util.Arrays;

public final class zzdi implements zzdd {
    public static final zzdi zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        Class<?> cls;
        int length = zzpqArr.length;
        if (length >= 2) {
            Object A0k = BE9.A0k(zzcj, zzpqArr);
            if (true != (A0k instanceof Object)) {
                A0k = null;
            }
            if (A0k != null) {
                if (A0k instanceof Class) {
                    cls = (Class) A0k;
                } else {
                    cls = A0k.getClass();
                }
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof String)) {
                    A0b = null;
                }
                String str = (String) A0b;
                if (str != null) {
                    String zza2 = zzcj.zzi.zza(str);
                    if (!C18070vi.A18(zza2, "forName")) {
                        Class[] zzg = zzcj.zze.zzg(C200410p.A0Q(zzpqArr).subList(2, length));
                        try {
                            zzcj.zze.zzf(i, cls.getMethod(zza2, (Class[]) Arrays.copyOf(zzg, zzg.length)));
                        } catch (Exception e) {
                            throw BE6.A0V(e, 6, 13);
                        }
                    } else {
                        throw BE6.A0V((Throwable) null, 6, 48);
                    }
                } else {
                    throw BE6.A0V((Throwable) null, 4, 5);
                }
            } else {
                throw BE6.A0V((Throwable) null, 4, 5);
            }
        } else {
            throw BE8.A0P();
        }
    }
}
