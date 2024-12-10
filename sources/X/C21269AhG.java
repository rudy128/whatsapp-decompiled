package X;

/* renamed from: X.AhG  reason: case insensitive filesystem */
public final class C21269AhG implements C22470B9c {
    public static final C21269AhG A00 = new C21269AhG();

    public final Object BCF(C29621ca r12, C62672rm r13) {
        C178169Cb A06;
        C29621ca r6 = r12;
        int A17 = C18070vi.A17(r12, r13);
        if (!r13.A09(r12, "message")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "plaintext";
        if (!r13.A0A(r12, strArr) || (A06 = A96.A06(r12, r13)) == null) {
            return null;
        }
        C178169Cb A05 = A96.A05(r12, r13);
        C178169Cb A04 = A96.A04(r12, r13);
        C22470B9c[] b9cArr = new C22470B9c[3];
        b9cArr[0] = C21270AhH.A00;
        b9cArr[A17] = C21271AhI.A00;
        Object A062 = r13.A06(r12, "ContentTypeText|ContentTypeMedia|ContentTypePollCreation", C18070vi.A0O(C21272AhJ.A00, b9cArr, 2), new String[0]);
        if (A062 != null) {
            return new C24160BwS(r6, A06, A05, A04, (B6Q) A062);
        }
        return null;
    }
}
