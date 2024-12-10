package X;

/* renamed from: X.2vf  reason: invalid class name and case insensitive filesystem */
public final class C64992vf implements AnonymousClass1GC {
    public boolean A00;
    public final C37361pP A01;
    public final String A02;

    public final void A00(C23381Fv r3, AnonymousClass1GB r4) {
        if (!this.A00) {
            this.A00 = true;
            r3.A05(this);
            r4.A03(this.A01.A00, this.A02);
            return;
        }
        throw AnonymousClass000.A0n("Already attached to lifecycleOwner");
    }

    public C64992vf(C37361pP r1, String str) {
        this.A02 = str;
        this.A01 = r1;
    }

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        boolean A15 = C18070vi.A15(r4, r3);
        if (r3 == C27581Wq.ON_DESTROY) {
            this.A00 = A15;
            r4.getLifecycle().A06(this);
        }
    }
}
