package X;

/* renamed from: X.4f4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91054f4 implements AnonymousClass02j {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FY A01;
    public final /* synthetic */ C31191fA A02;

    public final void Bkx(Object obj) {
        C31191fA r5 = this.A02;
        int i = this.A00;
        AnonymousClass1FY r3 = this.A01;
        C005702m r7 = (C005702m) obj;
        C18070vi.A0d(r7, 3);
        if (r7.A00 == -1) {
            r5.A03 = true;
            AnonymousClass3MX.A0a(r5.A0A).A01(i, 0);
        } else {
            r3.finish();
            if (!r5.A01) {
                r5.A02 = false;
            }
        }
        r5.A00 = false;
    }

    public /* synthetic */ C91054f4(AnonymousClass1FY r1, C31191fA r2, int i) {
        this.A02 = r2;
        this.A00 = i;
        this.A01 = r1;
    }
}
