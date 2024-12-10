package X;

/* renamed from: X.Afb  reason: case insensitive filesystem */
public final class C21166Afb implements C22470B9c {
    public static final C21166Afb A00 = new C21166Afb();

    public final Object BCF(C29621ca r11, C62672rm r12) {
        C178249Cj A06;
        C29621ca r3 = r11;
        C62672rm r2 = r12;
        int A17 = C18070vi.A17(r11, r12);
        if (!r12.A09(r11, "card")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "image";
        if (r2.A05(r3, String.class, C108975cc.A0X(), Long.valueOf(C20113A7w.A0L), (Object) null, strArr, false) == null || (A06 = A8Z.A06(r11, r12)) == null) {
            return null;
        }
        return new C178419Da(r11, A06);
    }
}
