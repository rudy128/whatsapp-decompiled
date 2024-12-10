package X;

/* renamed from: X.0jI  reason: invalid class name and case insensitive filesystem */
public final class C10980jI extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C16300s2 $dotRadius;
    public final /* synthetic */ C16300s2 $radioColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10980jI(C16300s2 r2, C16300s2 r3) {
        super(1);
        this.$radioColor = r2;
        this.$dotRadius = r3;
    }

    public final void A00(C17770vC r14) {
        C17770vC r5 = r14;
        C18070vi.A0d(r14, 0);
        float CPQ = r14.CPQ(2.0f);
        long A0W = AnonymousClass000.A0W(this.$radioColor);
        float f = CPQ / 2.0f;
        C04820Pb.A04(r5, new C016809l(CPQ, 4.0f, 0, 0), r14.CPQ(20.0f / 2.0f) - f, AnonymousClass74N.A03, A0W, 0);
        if (Float.compare(((DSH) this.$dotRadius.getValue()).A02(), 0.0f) > 0) {
            long A0W2 = AnonymousClass000.A0W(this.$radioColor);
            C04820Pb.A04(r5, C016909m.A00, r14.CPQ(((DSH) this.$dotRadius.getValue()).A02()) - f, AnonymousClass74N.A03, A0W2, 0);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17770vC) obj);
        return C27621Wu.A00;
    }
}
