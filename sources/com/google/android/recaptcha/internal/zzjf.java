package com.google.android.recaptcha.internal;

import X.AnonymousClass8BV;
import X.BE7;
import X.C17890vO;

public enum zzjf {
    VOID(r6, r6, (Class) null),
    INT(r7, r8, 0),
    LONG(Long.TYPE, Long.class, C17890vO.A0L()),
    FLOAT(Float.TYPE, Float.class, BE7.A0W()),
    DOUBLE(Double.TYPE, Double.class, AnonymousClass8BV.A0Q()),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(r16, r16, ""),
    BYTE_STRING(r19, r19, zzgw.zzb),
    ENUM(r7, r8, (Class) null),
    MESSAGE(r26, r26, (Class) null);
    
    public final Class zzl;
    public final Class zzm;
    public final Object zzn;

    public final Class zza() {
        return this.zzm;
    }

    /* access modifiers changed from: public */
    zzjf(Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }
}
