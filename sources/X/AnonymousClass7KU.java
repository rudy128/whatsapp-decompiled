package X;

/* renamed from: X.7KU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7KU implements C23691Hg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C24561Ku A01;
    public final /* synthetic */ boolean A02;

    public final void CGE(Object obj) {
        C122516Qr r0;
        boolean z = this.A02;
        int i = this.A00;
        C24731Ll r4 = (C24731Ll) obj;
        if (i != 15) {
            if (i == 60) {
                r0 = C122516Qr.HIGH;
            } else if (i != 80) {
                r0 = C122516Qr.MODERATE;
            }
            r4.C9L(r0, z);
        }
        r0 = C122516Qr.CRITICAL;
        r4.C9L(r0, z);
    }

    public /* synthetic */ AnonymousClass7KU(C24561Ku r1, int i, boolean z) {
        this.A01 = r1;
        this.A02 = z;
        this.A00 = i;
    }
}
