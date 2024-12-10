package X;

/* renamed from: X.CdS  reason: case insensitive filesystem */
public abstract class C25321CdS {
    public static final String A00(Class cls) {
        C18070vi.A0d(cls, 0);
        String name = cls.getName();
        String simpleName = cls.getSimpleName();
        if (simpleName.length() >= 5) {
            return simpleName;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("<cls>");
        A10.append(name);
        return AnonymousClass000.A0y("</cls>", A10);
    }

    public static String A01(Object obj) {
        return A00(obj.getClass());
    }
}
