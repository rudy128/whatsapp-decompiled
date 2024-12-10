package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;

public final class zzci {
    public static final zzci zza = new Object();

    public static final Class zza(Object obj) {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int A0M = AnonymousClass000.A0M(obj);
            if (A0M == 1) {
                cls = Integer.TYPE;
            } else if (A0M == 2) {
                cls = Short.TYPE;
            } else if (A0M == 3) {
                cls = Byte.TYPE;
            } else if (A0M == 4) {
                cls = Long.TYPE;
            } else if (A0M == 5) {
                cls = Character.TYPE;
            } else if (A0M == 6) {
                cls = Float.TYPE;
            } else if (A0M == 7) {
                cls = Double.TYPE;
            } else if (A0M == 8) {
                cls = Boolean.TYPE;
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls;
            }
            throw BE6.A0V((Throwable) null, 4, 6);
        } else if (obj instanceof String) {
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                if (zzcb.zzb(str)) {
                    return cls2;
                }
                throw BE6.A0V((Throwable) null, 6, 47);
            } catch (Exception e) {
                throw BE6.A0V(e, 6, 8);
            }
        } else {
            throw BE6.A0V((Throwable) null, 4, 5);
        }
    }
}
