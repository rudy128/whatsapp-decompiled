package X;

/* renamed from: X.CrN  reason: case insensitive filesystem */
public final class C26053CrN {
    public final long A00;
    public final long A01;
    public final long A02;
    public final AnonymousClass0NG A03;
    public final C02000Cg A04;
    public final C25706Ckc A05;
    public final C24693CGf A06;
    public final C25823Cma A07;
    public final C25824Cmb A08;
    public final DSF A09;
    public final DUE A0A;
    public final C25825Cmc A0B;
    public final C25827Cme A0C;
    public final EBX A0D;
    public final C26040Cr4 A0E;
    public final String A0F;

    public final boolean A0E(C26053CrN crN) {
        if (this != crN) {
            long j = this.A01;
            long j2 = crN.A01;
            C25759ClU[] clUArr = C26130Cst.A02;
            if (AnonymousClass000.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1))) && C18070vi.A18(this.A09, crN.A09) && C18070vi.A18(this.A07, crN.A07) && C18070vi.A18(this.A08, crN.A08) && C18070vi.A18(this.A06, crN.A06) && C18070vi.A18(this.A0F, crN.A0F) && this.A02 == crN.A02 && C18070vi.A18(this.A0B, crN.A0B) && C18070vi.A18(this.A0E, crN.A0E) && C18070vi.A18(this.A0A, crN.A0A)) {
                long j3 = this.A00;
                long j4 = crN.A00;
                long j5 = C05100Qk.A01;
                if (j3 != j4 || !C18070vi.A18(this.A05, crN.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26053CrN)) {
            return false;
        }
        C26053CrN crN = (C26053CrN) obj;
        return A0E(crN) && A0F(crN);
    }

    public static void A00(C26053CrN crN, EBX ebx, StringBuilder sb) {
        sb.append(", brush=");
        sb.append(ebx.BNh());
        sb.append(", alpha=");
        sb.append(ebx.BMz());
        sb.append(", fontSize=");
        sb.append(C26130Cst.A01(crN.A01));
        sb.append(", fontWeight=");
        sb.append(crN.A09);
        sb.append(", fontStyle=");
        sb.append(crN.A07);
        sb.append(", fontSynthesis=");
        sb.append(crN.A08);
        sb.append(", fontFamily=");
        sb.append(crN.A06);
        sb.append(", fontFeatureSettings=");
        sb.append(crN.A0F);
        sb.append(", letterSpacing=");
        sb.append(C26130Cst.A01(crN.A02));
        sb.append(", baselineShift=");
        sb.append(crN.A0B);
        sb.append(", textGeometricTransform=");
        sb.append(crN.A0E);
        sb.append(", localeList=");
        sb.append(crN.A0A);
        sb.append(", background=");
    }

    public final long A01() {
        return this.A00;
    }

    public final long A02() {
        return this.A0D.BOw();
    }

    public final long A03() {
        return this.A01;
    }

    public final long A04() {
        return this.A02;
    }

    public final AnonymousClass0NG A05() {
        return this.A03;
    }

    public final C26053CrN A06(C26053CrN crN) {
        C26053CrN crN2 = crN;
        if (crN == null) {
            return this;
        }
        EBX ebx = crN2.A0D;
        long BOw = ebx.BOw();
        C03380Hv BNh = ebx.BNh();
        float BMz = ebx.BMz();
        long j = crN2.A01;
        DSF dsf = crN2.A09;
        C25823Cma cma = crN2.A07;
        C25824Cmb cmb = crN2.A08;
        C24693CGf cGf = crN2.A06;
        String str = crN2.A0F;
        long j2 = crN2.A02;
        C25825Cmc cmc = crN2.A0B;
        C26040Cr4 cr4 = crN2.A0E;
        DUE due = crN2.A0A;
        long j3 = crN2.A00;
        C25827Cme cme = crN2.A0C;
        AnonymousClass0NG r8 = crN2.A03;
        C25706Ckc ckc = crN2.A05;
        DUE due2 = due;
        C25825Cmc cmc2 = cmc;
        C25827Cme cme2 = cme;
        C26040Cr4 cr42 = cr4;
        String str2 = str;
        C24693CGf cGf2 = cGf;
        C25823Cma cma2 = cma;
        C25824Cmb cmb2 = cmb;
        DSF dsf2 = dsf;
        return C26095CsF.A01(BNh, r8, crN2.A04, ckc, this, cGf2, cma2, cmb2, dsf2, due2, cmc2, cme2, cr42, str2, BMz, BOw, j, j2, j3);
    }

    public final C25823Cma A07() {
        return this.A07;
    }

    public final C25824Cmb A08() {
        return this.A08;
    }

    public final DSF A09() {
        return this.A09;
    }

    public final C25825Cmc A0A() {
        return this.A0B;
    }

    public final C25827Cme A0B() {
        return this.A0C;
    }

    public final C26040Cr4 A0C() {
        return this.A0E;
    }

    public final String A0D() {
        return this.A0F;
    }

    public final boolean A0F(C26053CrN crN) {
        if (!C18070vi.A18(this.A0D, crN.A0D) || !C18070vi.A18(this.A0C, crN.A0C) || !C18070vi.A18(this.A03, crN.A03) || !C18070vi.A18(this.A04, crN.A04)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        EBX ebx = this.A0D;
        long BOw = ebx.BOw();
        long j = C05100Qk.A01;
        int i4 = 0;
        int A0B2 = AnonymousClass000.A0B((AnonymousClass8BV.A00(BOw) + AnonymousClass001.A0l(ebx.BNh())) * 31, ebx.BMz());
        long j2 = this.A01;
        C25759ClU[] clUArr = C26130Cst.A02;
        int A0K = (AnonymousClass001.A0K(j2, A0B2) + AnonymousClass001.A0l(this.A09)) * 31;
        C25823Cma cma = this.A07;
        if (cma != null) {
            i = cma.A00;
        } else {
            i = 0;
        }
        int i5 = (A0K + i) * 31;
        C25824Cmb cmb = this.A08;
        if (cmb != null) {
            i2 = cmb.A00;
        } else {
            i2 = 0;
        }
        int A0K2 = AnonymousClass001.A0K(this.A02, (((((i5 + i2) * 31) + AnonymousClass001.A0l(this.A06)) * 31) + AnonymousClass8BW.A02(this.A0F)) * 31);
        C25825Cmc cmc = this.A0B;
        if (cmc != null) {
            i3 = Float.floatToIntBits(cmc.A00);
        } else {
            i3 = 0;
        }
        int A0K3 = (((((AnonymousClass001.A0K(this.A00, (((((A0K2 + i3) * 31) + AnonymousClass001.A0l(this.A0E)) * 31) + AnonymousClass001.A0l(this.A0A)) * 31) + AnonymousClass001.A0l(this.A0C)) * 31) + AnonymousClass001.A0l(this.A03)) * 31) + AnonymousClass001.A0l(this.A05)) * 31;
        C02000Cg r0 = this.A04;
        if (r0 != null) {
            i4 = r0.hashCode();
        }
        return A0K3 + i4;
    }

    public C26053CrN(AnonymousClass0NG r3, C02000Cg r4, C25706Ckc ckc, C24693CGf cGf, C25823Cma cma, C25824Cmb cmb, DSF dsf, DUE due, C25825Cmc cmc, C25827Cme cme, EBX ebx, C26040Cr4 cr4, String str, long j, long j2, long j3) {
        this.A0D = ebx;
        this.A01 = j;
        this.A09 = dsf;
        this.A07 = cma;
        this.A08 = cmb;
        this.A06 = cGf;
        this.A0F = str;
        this.A02 = j2;
        this.A0B = cmc;
        this.A0E = cr4;
        this.A0A = due;
        this.A00 = j3;
        this.A0C = cme;
        this.A03 = r3;
        this.A05 = ckc;
        this.A04 = r4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SpanStyle(color=");
        EBX ebx = this.A0D;
        A10.append(C05100Qk.A08(ebx.BOw()));
        A00(this, ebx, A10);
        A10.append(C05100Qk.A08(this.A00));
        A10.append(", textDecoration=");
        A10.append(this.A0C);
        A10.append(", shadow=");
        A10.append(this.A03);
        A10.append(", platformStyle=");
        A10.append(this.A05);
        A10.append(", drawStyle=");
        return AnonymousClass001.A1F(this.A04, A10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C26053CrN(X.AnonymousClass0NG r22, X.C24693CGf r23, X.C25823Cma r24, X.C25824Cmb r25, X.DSF r26, X.C25825Cmc r27, X.C25827Cme r28, X.C26040Cr4 r29, java.lang.String r30, int r31, long r32, long r34, long r36, long r38) {
        /*
            r21 = this;
            r2 = r22
            r11 = r28
            r13 = r29
            r10 = r27
            r14 = r30
            r17 = r36
            r5 = r23
            r19 = r38
            r7 = r25
            r6 = r24
            r8 = r26
            r15 = r34
            r3 = 0
            r0 = r31
            r1 = r31 & 1
            if (r1 == 0) goto L_0x0021
            long r32 = X.C05100Qk.A05
        L_0x0021:
            r1 = r31 & 2
            if (r1 == 0) goto L_0x0027
            long r15 = X.C26130Cst.A01
        L_0x0027:
            r1 = r31 & 4
            if (r1 == 0) goto L_0x002c
            r8 = 0
        L_0x002c:
            r1 = r31 & 8
            if (r1 == 0) goto L_0x0031
            r6 = 0
        L_0x0031:
            r1 = r31 & 16
            if (r1 == 0) goto L_0x0036
            r7 = 0
        L_0x0036:
            r1 = r31 & 32
            if (r1 == 0) goto L_0x003b
            r5 = 0
        L_0x003b:
            r1 = r31 & 64
            if (r1 == 0) goto L_0x0040
            r14 = 0
        L_0x0040:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0046
            long r17 = X.C26130Cst.A01
        L_0x0046:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x004b
            r10 = 0
        L_0x004b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0050
            r13 = 0
        L_0x0050:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0056
            long r19 = X.C05100Qk.A05
        L_0x0056:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r11 = 0
        L_0x005b:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0060
            r2 = 0
        L_0x0060:
            X.EBX r12 = X.C25969Cpb.A00(r32)
            r1 = r21
            r9 = r3
            r4 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26053CrN.<init>(X.0NG, X.CGf, X.Cma, X.Cmb, X.DSF, X.Cmc, X.Cme, X.Cr4, java.lang.String, int, long, long, long, long):void");
    }
}
