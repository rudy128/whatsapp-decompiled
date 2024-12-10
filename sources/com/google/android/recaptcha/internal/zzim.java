package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.BE6;
import X.BE7;

public final class zzim implements zzkc {
    public static final zzim zza = new Object();

    public static zzim zza() {
        return zza;
    }

    public final zzkb zzb(Class cls) {
        Class<zzit> cls2 = zzit.class;
        if (cls2.isAssignableFrom(cls)) {
            try {
                return (zzkb) zzit.zzr(cls.asSubclass(cls2)).zzh(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw BE6.A0o("Unable to get message info for ".concat(BE7.A0l(cls)), e);
            }
        } else {
            throw AnonymousClass000.A0k("Unsupported message type: ".concat(BE7.A0l(cls)));
        }
    }

    public final boolean zzc(Class cls) {
        return zzit.class.isAssignableFrom(cls);
    }
}
