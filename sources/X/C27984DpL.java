package X;

/* renamed from: X.DpL  reason: case insensitive filesystem */
public final class C27984DpL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26127Csp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27984DpL(C26127Csp csp) {
        super(1);
        this.this$0 = csp;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C18070vi.A0d(th, 0);
        C26294Cx6.A0A("lam:LinkedDevice", "Failed to switch link", th);
        C25691CkM ckM = this.this$0.A03;
        if (ckM != null) {
            ckM.A01();
        }
        C26193CuL cuL = this.this$0.A02;
        if (cuL != null) {
            cuL.A04();
        }
        return C27621Wu.A00;
    }
}
