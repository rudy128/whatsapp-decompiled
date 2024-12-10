package X;

/* renamed from: X.Dq5  reason: case insensitive filesystem */
public final class C28030Dq5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C17330uU $particles;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28030Dq5(C17330uU r2) {
        super(1);
        this.$particles = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C17770vC r5 = (C17770vC) obj;
        C18070vi.A0d(r5, 0);
        for (C25235CbW cbW : (Iterable) this.$particles.getValue()) {
            AnonymousClass0t6 BQs = r5.BQs();
            long BZL = BQs.BZL();
            BQs.BOJ().CGe();
            C16800tF r11 = ((AnonymousClass0WZ) BQs).A00;
            float f = cbW.A01;
            float f2 = cbW.A04;
            float f3 = cbW.A03;
            float f4 = f3 / 2.0f;
            float f5 = f2 + f4;
            float f6 = cbW.A05;
            float f7 = cbW.A00;
            long A0p = AnonymousClass001.A0p(f5, (f7 / 2.0f) + f6);
            long j = AnonymousClass0QY.A03;
            r11.CG8(f, A0p);
            r11.CGs(cbW.A02, 1.0f, AnonymousClass001.A0p(f5, f6));
            E34 e34 = cbW.A07;
            if (C18070vi.A18(e34, DY9.A00)) {
                long j2 = C05100Qk.A01;
                C17770vC r17 = r5;
                r17.BJQ(C016909m.A00, f4, 1.0f, 3, ((long) cbW.A06) << 32, AnonymousClass001.A0p(f5, f6 + f4));
            } else if (C18070vi.A18(e34, DY8.A00)) {
                long j3 = C05100Qk.A01;
                long A0p2 = AnonymousClass001.A0p(f2, f6);
                long A0p3 = AnonymousClass001.A0p(f3, f7);
                long j4 = AnonymousClass0QG.A01;
                r5.BJi(C016909m.A00, 1.0f, 3, ((long) cbW.A06) << 32, A0p2, A0p3);
            }
            BQs.BOJ().CFz();
            BQs.CKn(BZL);
        }
        return C27621Wu.A00;
    }
}
