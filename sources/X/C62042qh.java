package X;

/* renamed from: X.2qh  reason: invalid class name and case insensitive filesystem */
public final class C62042qh {
    public final AnonymousClass11P A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass121 A02;
    public final C18030ve A03;
    public final AnonymousClass18K A04;

    public final void A01(AnonymousClass1E7 r10, AnonymousClass1BI r11) {
        C29691ci A002;
        boolean z;
        double d;
        double d2;
        C18070vi.A0d(r11, 0);
        if (C18020vd.A05(C18040vf.A02, this.A03, 5245) && (A002 = AnonymousClass1CJ.A00(this.A01, r11)) != null) {
            long longValue = A002.A09().longValue();
            AnonymousClass2G8 r5 = new AnonymousClass2G8();
            r5.A04 = r11.getRawString();
            if (r10 == null || (r10.A0H == null && r10.A0I == null)) {
                z = false;
            } else {
                z = true;
            }
            r5.A00 = Boolean.valueOf(z);
            long A012 = AnonymousClass11P.A01(this.A00);
            AnonymousClass121 r8 = this.A02;
            r5.A03 = Double.valueOf(A00(A012 - r8.BVc(longValue)));
            long BVU = r8.BVU(longValue, 1000);
            if (BVU < 1000) {
                d = A00(BVU);
            } else {
                d = 2000.0d;
            }
            r5.A01 = Double.valueOf(d);
            long BVV = r8.BVV(longValue, 1000);
            if (BVV < 1000) {
                d2 = A00(BVV);
            } else {
                d2 = 2000.0d;
            }
            r5.A02 = Double.valueOf(d2);
            this.A04.CC7(r5);
        }
    }

    public static final double A00(long j) {
        Boolean bool = C17960vV.A01;
        return ((double) j) * (1.0d + (Math.pow((2.0d * Math.random()) - 1.0d, 5.0d) * 0.5d));
    }

    public C62042qh(AnonymousClass11P r1, AnonymousClass1CJ r2, AnonymousClass121 r3, C18030ve r4, AnonymousClass18K r5) {
        C18070vi.A0w(r1, r4, r2, r5, r3);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
    }
}
