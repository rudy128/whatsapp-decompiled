package X;

/* renamed from: X.253  reason: invalid class name */
public final class AnonymousClass253 implements C447624r {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public AnonymousClass253(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = r4;
    }

    public void CCZ(AnonymousClass206 r4, C49702Rn r5) {
        C18070vi.A0d(r4, 0);
        if (AnonymousClass25A.A0V((AnonymousClass1CJ) this.A01.get(), r4) || ((AnonymousClass1PW) this.A00.get()).A0D(r4)) {
            byte[] A012 = ((AnonymousClass1W7) this.A02.get()).A01(r4.A0x);
            if (A012 != null) {
                r4.A1D = A012;
                r4.A0o = true;
            }
            if (r5 != null) {
                new AnonymousClass20F(AnonymousClass253.class);
                throw new NullPointerException("onProcessorExecuted");
            }
        }
    }
}
