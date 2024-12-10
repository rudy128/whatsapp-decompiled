package X;

/* renamed from: X.DBw  reason: case insensitive filesystem */
public final class C26743DBw implements C28576E8j {
    public final C96 A00;
    public final C26202CuY A01;
    public final C25383Cej A02 = new Object();
    public final C25510Ch8 A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.C96, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.Cej] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.C97, java.lang.Object] */
    public C26743DBw(AnonymousClass74k r7) {
        C18070vi.A0d(r7, 1);
        ? obj = new Object();
        this.A00 = obj;
        C25510Ch8 ch8 = new C25510Ch8(r7);
        this.A03 = ch8;
        C27334Dc6 dc6 = C27334Dc6.A01;
        if (dc6 == null) {
            dc6 = new C27334Dc6();
            C27334Dc6.A01 = dc6;
        }
        this.A01 = new C26202CuY(obj, new Object(), ch8, dc6, dc6);
    }

    public C26202CuY BPN() {
        return this.A01;
    }

    public C25510Ch8 BSn() {
        return this.A03;
    }

    public C25383Cej BXQ() {
        return this.A02;
    }
}
