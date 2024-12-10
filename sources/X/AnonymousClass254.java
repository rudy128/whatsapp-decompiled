package X;

/* renamed from: X.254  reason: invalid class name */
public final class AnonymousClass254 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass254(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r4, C49702Rn r5) {
        C18070vi.A0d(r4, 0);
        if (r4.A11(4096)) {
            C54272ds A002 = ((C57482j9) this.A00.get()).A00(r4.A0x);
            if (A002 != null) {
                r4.A0Z = A002.A01;
                r4.A0O = A002.A00;
            }
            if (r5 != null) {
                new AnonymousClass20F(AnonymousClass254.class);
                throw new NullPointerException("onProcessorExecuted");
            }
        }
    }
}
