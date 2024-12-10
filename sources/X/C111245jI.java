package X;

/* renamed from: X.5jI  reason: invalid class name and case insensitive filesystem */
public final class C111245jI extends AnonymousClass1J2 implements AnonymousClass1GC, AnonymousClass884 {
    public C22801Dg A00 = C108945cZ.A0R();
    public C116735yX A01;
    public final C18100vl A02;
    public final C124686Zh A03;
    public final boolean A04;
    public final /* synthetic */ C111255jJ A05;

    public void C6U(C27581Wq r2, AnonymousClass1F9 r3) {
        C139186yN r0;
        C18070vi.A0d(r2, 1);
        if (r2 == C27581Wq.ON_PAUSE) {
            C108955ca.A1O(this.A01);
        } else if (r2 == C27581Wq.ON_RESUME && (r0 = (C139186yN) this.A05.A05.A06()) != null) {
            A00(r0, this);
        }
    }

    public void C6m(C139186yN r2) {
        this.A05.C6m(r2);
    }

    public static final void A00(C139186yN r5, C111245jI r6) {
        C108955ca.A1O(r6.A01);
        C124686Zh r0 = r6.A03;
        C116735yX r4 = new C116735yX(r5, AnonymousClass10G.ADu(r0.A00.A01.A00), r6.A04);
        ((C37471pb) r6.A02.getValue()).A00(new C143617Ec(r6.A00, 3), r4);
        r6.A01 = r4;
    }

    public C111245jI(C124686Zh r5, C111255jJ r6, AnonymousClass10I r7, boolean z) {
        C18070vi.A0j(r7, r5);
        this.A03 = r5;
        this.A04 = z;
        this.A05 = r6;
        this.A02 = AnonymousClass1DF.A01(new C154587rN(r7));
        AnonymousClass7AS.A01(r6.A05, this.A00, new C1585881g(this), 29);
    }
}
