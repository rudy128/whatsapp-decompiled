package X;

/* renamed from: X.6zO  reason: invalid class name and case insensitive filesystem */
public final class C139756zO {
    public final AnonymousClass18K A00;

    public C139756zO(AnonymousClass18K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final AnonymousClass632 A00(Integer num, Integer num2, int i) {
        Integer valueOf;
        AnonymousClass632 r2 = new AnonymousClass632();
        int i2 = 4;
        if (i != 0) {
            i2 = 1;
            if (i != 4) {
                i2 = 2;
                if (i != 5) {
                    i2 = 0;
                    if (i != 6) {
                        i2 = 3;
                        if (i != 7) {
                            valueOf = null;
                            r2.A02 = valueOf;
                            r2.A03 = num;
                            r2.A01 = num2;
                            return r2;
                        }
                    }
                }
            }
        }
        valueOf = Integer.valueOf(i2);
        r2.A02 = valueOf;
        r2.A03 = num;
        r2.A01 = num2;
        return r2;
    }

    public final void A01(int i) {
        C170888qp r1 = new C170888qp();
        r1.A01 = 49;
        r1.A00 = Integer.valueOf(i);
        this.A00.CC7(r1);
    }

    public final void A02(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Integer A0f = AnonymousClass3MY.A0f();
        AnonymousClass632 A002 = A00(valueOf, A0f, i);
        A002.A00 = A0f;
        this.A00.CC4(A002);
    }

    public final void A03(Integer num, Integer num2, int i) {
        AnonymousClass632 A002 = A00(num, num2, i);
        A002.A00 = C17880vN.A0h();
        this.A00.CC4(A002);
    }
}
