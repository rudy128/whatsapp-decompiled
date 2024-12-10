package X;

/* renamed from: X.AHu  reason: case insensitive filesystem */
public final class C20364AHu implements C22401B6e {
    public final AnonymousClass8JG A00;
    public final C20076A6c A01;
    public final C19955A0m A02;
    public final C19955A0m A03;

    public void BIB(String str) {
        C20076A6c a6c = this.A01;
        a6c.A06();
        C19955A0m a0m = this.A03;
        BDc A012 = C20076A6c.A01(a6c, a0m, str);
        try {
            AHW.A00(a6c, A012);
        } finally {
            C20076A6c.A02(a6c);
            a0m.A02(A012);
        }
    }

    public C20364AHu(C20076A6c a6c) {
        this.A01 = a6c;
        this.A00 = new AnonymousClass8JE(a6c, this, 4);
        this.A03 = new AnonymousClass8JH(a6c, this, 2);
        this.A02 = new AnonymousClass8JH(a6c, this, 3);
    }
}
