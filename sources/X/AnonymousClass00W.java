package X;

/* renamed from: X.00W  reason: invalid class name */
public abstract class AnonymousClass00W {
    public static void A00(Class cls, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getCanonicalName());
            sb.append(" must be set");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void A01(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
    }

    public static void A02(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
