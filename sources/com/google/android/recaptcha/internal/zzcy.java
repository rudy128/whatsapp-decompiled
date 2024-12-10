package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import java.lang.reflect.Proxy;

public final class zzcy implements zzdd {
    public static final zzcy zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int i2;
        int length = zzpqArr.length;
        if (length == 4 || length == 5) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof Object) || A0b == null) {
                    throw BE6.A0V((Throwable) null, 4, 5);
                }
                Object zza3 = zzcj.zze.zza(zzpqArr[2]);
                if (true != (zza3 instanceof String)) {
                    zza3 = null;
                }
                String str2 = (String) zza3;
                if (str2 != null) {
                    String zza4 = zzcj.zzi.zza(str2);
                    Object A0b2 = BE8.A0b(zzcj, zzpqArr, 3);
                    if (length == 5) {
                        Object A0b3 = BE8.A0b(zzcj, zzpqArr, 4);
                        if (true != (A0b3 instanceof Integer)) {
                            A0b3 = null;
                        }
                        Number number = (Number) A0b3;
                        if (number != null) {
                            i2 = number.intValue();
                        } else {
                            throw BE6.A0V((Throwable) null, 4, 5);
                        }
                    } else {
                        i2 = -1;
                    }
                    try {
                        if (A0b instanceof String) {
                            A0b = zzcj.zzi.zza((String) A0b);
                        }
                        Class zza5 = zzci.zza(A0b);
                        zzcj.zze.zzf(i, Proxy.newProxyInstance(zza5.getClassLoader(), new Class[]{zza5}, new zzcf(new zzcx(zzcj, str, i2), zza4, A0b2)));
                    } catch (Exception e) {
                        throw BE6.A0V(e, 6, 20);
                    }
                } else {
                    throw BE6.A0V((Throwable) null, 4, 5);
                }
            } else {
                throw BE6.A0V((Throwable) null, 4, 5);
            }
        } else {
            throw BE6.A0V((Throwable) null, 4, 3);
        }
    }
}
