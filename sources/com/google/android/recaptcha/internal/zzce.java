package com.google.android.recaptcha.internal;

import X.AnonymousClass001;
import X.AnonymousClass8BX;
import X.C17890vO;
import X.C18070vi;
import X.C27621Wu;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public abstract class zzce implements InvocationHandler {
    public final Object zza;

    public zzce(Object obj) {
        this.zza = obj;
    }

    public abstract boolean zza(Object obj, Method method, Object[] objArr);

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (C18070vi.A18(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (C18070vi.A18(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (!C18070vi.A18(method.getName(), "equals") || method.getParameterTypes().length == 0) {
            if (zza(obj, method, objArr)) {
                if ((this.zza != null || !C18070vi.A18(method.getReturnType(), Void.TYPE)) && ((obj2 = this.zza) == null || !C18070vi.A18(zzgd.zza(obj2.getClass()), zzgd.zza(method.getReturnType())))) {
                    throw AnonymousClass8BX.A0V(method.getReturnType(), " cannot be returned from method with return type ", C17890vO.A0f(this.zza));
                }
                Object obj3 = this.zza;
                if (obj3 != null) {
                    return obj3;
                }
            }
            return C27621Wu.A00;
        }
        boolean z = false;
        if (!(objArr == null || objArr.length == 0 || AnonymousClass001.A0l(objArr[0]) != obj.hashCode())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
