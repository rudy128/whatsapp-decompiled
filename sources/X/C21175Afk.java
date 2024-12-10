package X;

/* renamed from: X.Afk  reason: case insensitive filesystem */
public final class C21175Afk implements C22470B9c {
    public static final C21175Afk A00 = new C21175Afk();

    public final Object BCF(C29621ca r11, C62672rm r12) {
        C178249Cj A01;
        C29621ca r3 = r11;
        C62672rm r2 = r12;
        int A17 = C18070vi.A17(r11, r12);
        if (!r12.A09(r11, "card")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "image";
        if (r2.A05(r3, String.class, C108975cc.A0X(), Long.valueOf(C20113A7w.A0L), (Object) null, strArr, false) == null || (A01 = A6w.A01(r11, r12)) == null) {
            return null;
        }
        return new C178529Dl(r11, A01);
    }
}
