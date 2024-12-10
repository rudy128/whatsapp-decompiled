package X;

/* renamed from: X.Afn  reason: case insensitive filesystem */
public final class C21178Afn implements C22470B9c {
    public static final C21178Afn A00 = new C21178Afn();

    public final Object BCF(C29621ca r8, C62672rm r9) {
        int A17 = C18070vi.A17(r8, r9);
        if (r9.A09(r8, "pay")) {
            String[] strArr = new String[A17];
            C29621ca A0Z = AnonymousClass8BT.A0Z(r8, "card", strArr);
            if (A0Z == null) {
                AnonymousClass8BY.A11(r8, r9, strArr, 0);
            } else if (r9.A09(A0Z, "card")) {
                C22470B9c[] b9cArr = new C22470B9c[3];
                b9cArr[0] = C21174Afj.A00;
                b9cArr[A17] = C21175Afk.A00;
                Object A06 = r9.A06(A0Z, "BRCard|MXCard|ESCard", C18070vi.A0O(C21176Afl.A00, b9cArr, 2), new String[0]);
                if (A06 != null) {
                    return new C178559Do(r8, new AnonymousClass9DN(A0Z, (B6G) A06));
                }
            }
        }
        return null;
    }
}
