package X;

/* renamed from: X.0iv  reason: invalid class name and case insensitive filesystem */
public final class C10800iv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C04920Pn this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10800iv(C04920Pn r2) {
        super(1);
        this.this$0 = r2;
    }

    public final void A00(Object obj) {
        C04920Pn r2 = this.this$0;
        if (!r2.A02) {
            synchronized (r2.A05) {
                C04680Oi r0 = r2.A01;
                C18070vi.A0b(r0);
                r0.A04(obj);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(obj);
        return C27621Wu.A00;
    }
}
