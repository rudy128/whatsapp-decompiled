package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: X.BeH  reason: case insensitive filesystem */
public abstract class C23267BeH extends DJN {
    public static final Map zzb = AnonymousClass8BR.A17();
    public C26136Csz zzc = C26136Csz.A04;
    public int zzd = -1;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C25658Cjo.A02.A00(cls).CTg(this, obj);
    }

    public final int hashCode() {
        if ((this.zzd & Integer.MIN_VALUE) != 0) {
            return C25658Cjo.A02.A00(getClass()).zza(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = C25658Cjo.A02.A00(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public static Object A00(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw BE6.A0o("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw BE6.A0o("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = C25907CoL.A00;
        StringBuilder A0t = BEA.A0t(obj);
        C25907CoL.A00(this, A0t, 0);
        return A0t.toString();
    }
}
