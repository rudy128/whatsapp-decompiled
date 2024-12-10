package X;

/* renamed from: X.259  reason: invalid class name */
public final class AnonymousClass259 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass259(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void CCZ(AnonymousClass206 r4, C49702Rn r5) {
        C18070vi.A0d(r4, 0);
        if (r4.A10(16)) {
            C202711m r1 = (C202711m) this.A00.get();
            if (r4 instanceof C444323k) {
                AnonymousClass212 A06 = r1.A06(r4, 86);
                if (A06 instanceof C444923q) {
                    ((C444323k) r4).A00.A02(new C693136s(A06));
                }
            }
            if (r5 != null) {
                new AnonymousClass20F(AnonymousClass259.class);
                throw new NullPointerException("onProcessorExecuted");
            }
        }
    }
}
