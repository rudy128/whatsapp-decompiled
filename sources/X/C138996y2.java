package X;

/* renamed from: X.6y2  reason: invalid class name and case insensitive filesystem */
public final class C138996y2 {
    public final AnonymousClass118 A00;
    public final C18000vb A01;
    public final C26521Sl A02;

    public final String A01(String str) {
        String replaceAll = str.replaceAll("[?:\\\\/*\"<>|\n\t\r]", "");
        C18070vi.A0X(replaceAll);
        String A09 = C64062u9.A09(replaceAll);
        C18070vi.A0X(A09);
        if (!A00(C26511Sk.A0N(A09))) {
            return "";
        }
        return replaceAll;
    }

    public C138996y2(AnonymousClass118 r1, C18000vb r2, C26521Sl r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static final boolean A00(String str) {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "image";
        for (Object next : C18070vi.A0O("video", A1Z, 1)) {
            if (AnonymousClass1YE.A0A(str, (String) next, false)) {
                if (next != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
