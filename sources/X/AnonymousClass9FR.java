package X;

/* renamed from: X.9FR  reason: invalid class name */
public final class AnonymousClass9FR extends AnonymousClass9CP implements B6J {
    public final C107755aX A00;
    public final AnonymousClass9DG A01;

    public AnonymousClass9FR(C29621ca r8, AnonymousClass9F6 r9) {
        C18070vi.A0d(r9, 2);
        C29621ca A002 = AnonymousClass9F6.A00(r8, r9);
        C62672rm A0s = AnonymousClass8BR.A0s();
        A8H a8h = A8H.A00;
        boolean A1T = AnonymousClass8BV.A1T(a8h, A002, 1);
        AnonymousClass9DG A003 = A8H.A00(r8, A002, A0s);
        if (A003 != null) {
            this.A01 = A003;
            C22470B9c[] b9cArr = new C22470B9c[2];
            C21283AhU.A00(b9cArr, 8, A1T ? 1 : 0, a8h);
            Object A06 = A0s.A06(r8, "IQErrorBadRequest|IQErrorInternalServerError", C18070vi.A0O(new C21283AhU(a8h, 9), b9cArr, 1), AnonymousClass8BS.A1b(1, A1T));
            if (A06 != null) {
                this.A00 = (C107755aX) A06;
                this.A00 = r8;
                return;
            }
            throw AnonymousClass1O9.A00(A0s);
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
