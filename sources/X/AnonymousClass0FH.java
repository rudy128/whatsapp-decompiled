package X;

import java.util.Arrays;

/* renamed from: X.0FH  reason: invalid class name */
public abstract class AnonymousClass0FH {
    public static final String A00(Object obj) {
        String simpleName;
        Class<?> cls = obj.getClass();
        if (cls.isAnonymousClass()) {
            simpleName = cls.getName();
        } else {
            simpleName = cls.getSimpleName();
        }
        StringBuilder A11 = AnonymousClass000.A11(simpleName);
        A11.append('@');
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, System.identityHashCode(obj));
        String format = String.format("%07x", Arrays.copyOf(objArr, 1));
        C18070vi.A0X(format);
        return AnonymousClass000.A0y(format, A11);
    }
}
