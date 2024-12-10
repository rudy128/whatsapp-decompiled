package X;

import android.os.Bundle;

/* renamed from: X.C9f  reason: case insensitive filesystem */
public abstract class C24559C9f {
    public static Object A00(Bundle bundle, String str) {
        Class<Long> cls = Long.class;
        if (bundle.containsKey(str)) {
            Object obj = bundle.get(str);
            if (cls.isInstance(obj)) {
                Long cast = cls.cast(obj);
                if (cast != null) {
                    return cast;
                }
                throw AnonymousClass000.A0n(BE7.A0o("value for required key %s is null", new Object[]{str}));
            }
            Object[] A1b = AnonymousClass3MX.A1b(str, 0);
            A1b[1] = cls.getSimpleName();
            throw AnonymousClass000.A0n(BE7.A0o("value for required key %s is not of type $s", A1b));
        }
        throw AnonymousClass000.A0n(BE7.A0o("key %s is missing but required", new Object[]{str}));
    }
}
