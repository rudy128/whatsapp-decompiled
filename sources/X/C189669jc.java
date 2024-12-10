package X;

/* renamed from: X.9jc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C189669jc {
    public final /* synthetic */ AnonymousClass8FZ A00;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.A46, java.lang.Object] */
    public final void A00(AnonymousClass1KN r6, AnonymousClass1KN r7, A7B a7b) {
        AnonymousClass8FZ r4 = this.A00;
        AnonymousClass1DT r1 = r4.A01;
        ? obj = new Object();
        obj.A01 = true;
        r1.A0F(obj);
        if (a7b != null || r6 == null || r7 == null) {
            AnonymousClass1QE r2 = r4.A06;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("error: ");
            r2.A04(AnonymousClass000.A0y(a7b.A07, A10));
            C186949f1 r12 = new C186949f1(1);
            r12.A00 = a7b;
            r4.A07.A0F(r12);
            return;
        }
        C186949f1 r3 = new C186949f1(0);
        AnonymousClass1KJ r22 = AnonymousClass1KL.A0B;
        C18000vb r13 = r4.A03;
        r3.A01 = r22.BLc(r13, r6);
        r3.A02 = r22.BLc(r13, r7);
        r4.A07.A0F(r3);
    }

    public /* synthetic */ C189669jc(AnonymousClass8FZ r1) {
        this.A00 = r1;
    }
}
