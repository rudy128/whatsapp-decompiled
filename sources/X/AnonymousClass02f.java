package X;

/* renamed from: X.02f  reason: invalid class name */
public final class AnonymousClass02f implements C005102e, AnonymousClass1GC {
    public C005102e A00;
    public final AnonymousClass01T A01;
    public final C23381Fv A02;
    public final /* synthetic */ AnonymousClass02V A03;

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        C18070vi.A0d(r3, 1);
        if (r3 == C27581Wq.ON_START) {
            this.A00 = this.A03.A06(this.A01);
        } else if (r3 == C27581Wq.ON_STOP) {
            C005102e r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
            }
        } else if (r3 == C27581Wq.ON_DESTROY) {
            cancel();
        }
    }

    public AnonymousClass02f(AnonymousClass01T r1, AnonymousClass02V r2, C23381Fv r3) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        r3.A05(this);
    }

    public void cancel() {
        this.A02.A06(this);
        this.A01.A02.remove(this);
        C005102e r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A00 = null;
    }
}
