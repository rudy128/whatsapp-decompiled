package X;

/* renamed from: X.AhF  reason: case insensitive filesystem */
public final class C21268AhF implements C22470B9c {
    public static final C21268AhF A00 = new C21268AhF();

    public final Object BCF(C29621ca r5, C62672rm r6) {
        AnonymousClass9EK A0A;
        int A17 = C18070vi.A17(r5, r6);
        if (r6.A09(r5, "message")) {
            String[] strArr = new String[A17];
            C29621ca A0Z = AnonymousClass8BT.A0Z(r5, "plaintext", strArr);
            if (A0Z == null) {
                AnonymousClass8BY.A11(r5, r6, strArr, 0);
            } else {
                AnonymousClass9DM A09 = A96.A09(A0Z, r6);
                if (!(A09 == null || (A0A = A96.A0A(r5, r6)) == null)) {
                    return new C24161BwT(r5, A96.A06(r5, r6), A09, A0A);
                }
            }
        }
        return null;
    }
}
