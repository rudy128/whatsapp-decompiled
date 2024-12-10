package X;

/* renamed from: X.090  reason: invalid class name */
public final class AnonymousClass090 extends AnonymousClass0XW implements C17640uz {
    public long A00;
    public C16370s9 A01;
    public AnonymousClass0QG A02;
    public C01990Cf A03;
    public C16370s9 A04;
    public C24246By4 A05;

    public /* synthetic */ void Bxi() {
    }

    public static final void A00(C01990Cf r17, C17770vC r18, C02000Cg r19, long j) {
        C01990Cf r1 = r17;
        C17770vC r6 = r18;
        C02000Cg r7 = r19;
        long j2 = j;
        if (r1 instanceof C015709a) {
            AnonymousClass0NU r4 = ((C015709a) r1).A00;
            float f = r4.A01;
            float f2 = r4.A03;
            long A0p = AnonymousClass001.A0p(f, f2);
            long j3 = AnonymousClass0QY.A03;
            long A0p2 = AnonymousClass001.A0p(r4.A02 - f, r4.A00 - f2);
            long j4 = AnonymousClass0QG.A02;
            r6.BJi(r7, 1.0f, 3, j2, A0p, A0p2);
        } else if (r1 instanceof C015809b) {
            C015809b r12 = (C015809b) r1;
            C17040te r0 = r12.A01;
            if (r0 != null) {
                r6.BJf(r0, r7, j2);
                return;
            }
            AnonymousClass0NJ r5 = r12.A00;
            long j5 = r5.A04;
            long j6 = C04140Lz.A00;
            float A022 = AnonymousClass001.A02(j5);
            float f3 = r5.A01;
            float f4 = r5.A03;
            long A0p3 = AnonymousClass001.A0p(f3, f4);
            long j7 = AnonymousClass0QY.A03;
            long A0p4 = AnonymousClass001.A0p(r5.A02 - f3, r5.A00 - f4);
            long j8 = AnonymousClass0QG.A02;
            r6.BJl(r7, j2, A0p3, A0p4, AnonymousClass001.A0p(A022, A022));
        } else {
            throw new AnonymousClass3EW();
        }
    }

    public void BJM(C17480uj r12) {
        C17480uj r3 = r12;
        if (this.A01 == AnonymousClass0GC.A00) {
            long j = this.A00;
            if (j != C05100Qk.A05) {
                C04820Pb.A03(r3, 126, j, 0, 0);
            }
        } else {
            A01(r12);
        }
        r12.BJR();
    }

    private final void A01(C17480uj r7) {
        C01990Cf BHh;
        long BZL = r7.BZL();
        AnonymousClass0QG r2 = this.A02;
        long j = AnonymousClass0QG.A02;
        if (r2 == null || BZL != r2.A00 || r7.getLayoutDirection() != this.A05 || !C18070vi.A18(this.A04, this.A01)) {
            BHh = this.A01.BHh(r7, r7.getLayoutDirection(), r7.BZL());
        } else {
            BHh = this.A03;
            C18070vi.A0b(BHh);
        }
        long j2 = this.A00;
        if (j2 != C05100Qk.A05) {
            A00(BHh, r7, C016909m.A00, j2);
        }
        this.A03 = BHh;
        this.A02 = new AnonymousClass0QG(r7.BZL());
        this.A05 = r7.getLayoutDirection();
        this.A04 = this.A01;
    }
}
