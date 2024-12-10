package X;

/* renamed from: X.4i8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4i8 implements C72073Kn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1E2 A01;
    public final /* synthetic */ AnonymousClass4VP A02;

    public final void C3p(boolean z) {
        AnonymousClass4VP r5 = this.A02;
        AnonymousClass1E2 r4 = this.A01;
        int i = this.A00;
        if (z) {
            r5.A01.runOnUiThread(new C70863Cu(r5, i, 30, r4));
        }
    }

    public /* synthetic */ AnonymousClass4i8(AnonymousClass1E2 r1, AnonymousClass4VP r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
