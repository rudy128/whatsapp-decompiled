package X;

/* renamed from: X.9FT  reason: invalid class name */
public final class AnonymousClass9FT extends AnonymousClass9CP implements B6K {
    public final AnonymousClass9DG A00;
    public final AnonymousClass4A1 A01;

    public AnonymousClass9FT(C29621ca r8, AnonymousClass9F6 r9) {
        int A1X = AnonymousClass8BU.A1X(r9);
        C29621ca A002 = AnonymousClass9F6.A00(r8, r9);
        C62672rm A0s = AnonymousClass8BR.A0s();
        A8H a8h = A8H.A00;
        String[] strArr = new String[A1X];
        C29621ca A0Z = AnonymousClass8BT.A0Z(r8, "error", strArr);
        if (A0Z == null) {
            AnonymousClass8BY.A11(r8, A0s, strArr, 0);
        } else {
            C18070vi.A0d(a8h, 0);
            AnonymousClass4A1 A04 = A8H.A04(A0Z, A0s);
            if (A04 != null) {
                this.A01 = A04;
                C18070vi.A0d(A002, A1X);
                AnonymousClass9DG A003 = A8H.A00(r8, A002, A0s);
                if (A003 != null) {
                    this.A00 = A003;
                    this.A00 = r8;
                    return;
                }
                throw AnonymousClass1O9.A00(A0s);
            }
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
