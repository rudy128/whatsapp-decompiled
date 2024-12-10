package com.google.android.recaptcha.internal;

import X.C18070vi;
import X.C18460wS;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class zzch extends zzce {
    public final zzcg zza;
    public final String zzb;

    public zzch(zzcg zzcg, String str, Object obj) {
        super(obj);
        this.zza = zzcg;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!C18070vi.A18(method.getName(), this.zzb)) {
            return false;
        }
        zzcg zzcg = this.zza;
        if (objArr != null) {
            list = Arrays.asList(objArr);
            C18070vi.A0X(list);
        } else {
            list = C18460wS.A00;
        }
        zzcg.zzb(list);
        return true;
    }
}
