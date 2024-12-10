package X;

/* renamed from: X.B1x  reason: case insensitive filesystem */
public final class C22294B1x extends AnonymousClass11G implements C22821Di {
    public static final C22294B1x A00 = new C22294B1x();

    public C22294B1x() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        String A0d = C108975cc.A0d(str);
        if (A0d.length() <= 0) {
            return A0d;
        }
        char titleCase = Character.toTitleCase(A0d.charAt(0));
        String substring = A0d.substring(1);
        return C17890vO.A0Z(substring, C108955ca.A15(substring), titleCase);
    }
}
