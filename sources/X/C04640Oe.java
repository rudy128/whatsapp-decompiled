package X;

/* renamed from: X.0Oe  reason: invalid class name and case insensitive filesystem */
public abstract class C04640Oe {
    public float A00 = 1.0f;
    public AnonymousClass0HD A01;
    public C24246By4 A02 = C24246By4.Ltr;
    public final C22821Di A03 = new C09930hW(this);

    public abstract long A02();

    public abstract void A03(float f);

    public abstract void A04(AnonymousClass0HD r1);

    public abstract void A06(C17770vC r1);

    private final void A00(AnonymousClass0HD r2) {
        if (!C18070vi.A18(this.A01, r2)) {
            A04(r2);
            this.A01 = r2;
        }
    }

    private final void A01(C24246By4 by4) {
        if (this.A02 != by4) {
            this.A02 = by4;
        }
    }

    public final void A05(AnonymousClass0HD r7, C17770vC r8, float f, long j) {
        if (this.A00 != f) {
            A03(f);
            this.A00 = f;
        }
        A00(r7);
        A01(r8.getLayoutDirection());
        long BZL = r8.BZL();
        float A022 = AnonymousClass0QG.A02(BZL) - AnonymousClass0QG.A02(j);
        float A002 = AnonymousClass0QG.A00(BZL) - AnonymousClass0QG.A00(j);
        C16800tF r3 = ((AnonymousClass0WZ) r8.BQs()).A00;
        r3.Bdg(0.0f, 0.0f, A022, A002);
        if (f > 0.0f && AnonymousClass0QG.A02(j) > 0.0f && AnonymousClass0QG.A00(j) > 0.0f) {
            A06(r8);
        }
        r3.Bdg(-0.0f, -0.0f, -A022, -A002);
    }
}
