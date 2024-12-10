package com.google.android.recaptcha.internal;

import X.BE6;
import X.BE8;
import java.lang.reflect.Proxy;

public final class zzcz implements zzdd {
    public static final zzcz zza = new Object();

    public final void zza(int i, zzcj zzcj, zzpq... zzpqArr) {
        int length = zzpqArr.length;
        Object obj = null;
        if (length == 4 || length == 5) {
            Object zza2 = zzcj.zze.zza(zzpqArr[0]);
            if (true != (zza2 instanceof Integer)) {
                zza2 = null;
            }
            Number number = (Number) zza2;
            if (number != null) {
                int intValue = number.intValue();
                Object A0b = BE8.A0b(zzcj, zzpqArr, 1);
                if (true != (A0b instanceof Integer)) {
                    A0b = null;
                }
                Number number2 = (Number) A0b;
                if (number2 != null) {
                    int intValue2 = number2.intValue();
                    Object zza3 = zzcj.zze.zza(zzpqArr[2]);
                    if (true != (zza3 instanceof String)) {
                        zza3 = null;
                    }
                    String str = (String) zza3;
                    if (str != null) {
                        String zza4 = zzcj.zzi.zza(str);
                        Object A0b2 = BE8.A0b(zzcj, zzpqArr, 3);
                        if (true != (A0b2 instanceof String)) {
                            A0b2 = null;
                        }
                        String str2 = (String) A0b2;
                        if (str2 != null) {
                            String zza5 = zzcj.zzi.zza(str2);
                            if (length == 5) {
                                obj = BE8.A0b(zzcj, zzpqArr, 4);
                            }
                            zzcg zzcg = new zzcg(intValue2);
                            try {
                                Class zza6 = zzci.zza(zza4);
                                zzcj.zze.zzf(intValue, Proxy.newProxyInstance(zza6.getClassLoader(), new Class[]{zza6}, new zzch(zzcg, zza5, obj)));
                                zzcj.zze.zzf(i, zzcg);
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
