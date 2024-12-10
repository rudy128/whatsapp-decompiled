package X;

public final class CZL {
    public final DAT A00;
    public final DDU A01;
    public final DDm A02;
    public final DAP A03 = new DAP(0);
    public final C18100vl A04;
    public final C18100vl A05;
    public final C25639CjS A06;
    public final DDq A07;
    public final DE8 A08 = new DE8(this, 7);

    public CZL(C25761ClW clW, C24812CLf cLf, E6T e6t, C22360B4o b4o, C25073CWg cWg, C22382B5l b5l, C136796uQ r22) {
        C24812CLf cLf2 = cLf;
        E6T e6t2 = e6t;
        C22360B4o b4o2 = b4o;
        C22382B5l b5l2 = b5l;
        C136796uQ r14 = r22;
        C18070vi.A0w(cLf2, r14, e6t2, b5l2, b4o2);
        C25073CWg cWg2 = cWg;
        C18070vi.A0d(cWg2, 6);
        AnonymousClass10E r1 = cLf2.A00.A00;
        AnonymousClass10G r12 = r1.A00;
        C26705DAe A95 = AnonymousClass10G.A95(r12);
        C25761ClW clW2 = clW;
        DDU ddu = (DDU) new CM0(C000500i.A00(r1.Ao9), new C26706DAf(3), clW2, (CQQ) r1.A0X.get(), (C28478E2t) r12.A1i.get(), A95).A00.getValue();
        this.A01 = ddu;
        DDq dDq = new DDq();
        this.A07 = dDq;
        C25639CjS cjS = new C25639CjS();
        this.A06 = cjS;
        this.A02 = new DDm(cjS, dDq);
        this.A00 = new DAT(ddu);
        Integer num = AnonymousClass00R.A0C;
        this.A04 = AnonymousClass1DF.A00(num, new C27832DmT(e6t2, this));
        this.A05 = AnonymousClass1DF.A00(num, new C22039Awf(clW2, b4o2, cWg2, b5l2, this, r14));
    }

    public final void A00() {
        DAT dat = this.A00;
        dat.BB3(this.A03);
        C22808BPw bPw = (C22808BPw) ((EDA) dat.A00.BP7(EDA.A00));
        if (bPw.A0a) {
            bPw.A0a = false;
            if (!bPw.A0b) {
                C22808BPw.A01(bPw);
            }
        }
        ((EDD) this.A01.BP7(EDD.A00)).BBf(this.A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x002a, code lost:
        r1 = r5.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r15, int r16) {
        /*
            r14 = this;
            X.DDq r5 = new X.DDq
            r5.<init>()
            X.DDU r3 = r14.A01
            X.BUd r0 = X.EDB.A00
            X.EDK r0 = r3.BP7(r0)
            X.EDB r0 = (X.EDB) r0
            X.E9S r2 = r0.BY3()
            X.C18070vi.A0X(r2)
            r1 = 3
            X.DE5 r0 = new X.DE5
            r0.<init>(r2, r1)
            r5.A05 = r0
            r11 = 0
            r9 = r16
            r5.A01 = r9
            r10 = r15
            r5.A00 = r15
            X.EAJ r0 = r5.A02
            if (r0 == 0) goto L_0x0036
            X.DE1 r1 = r5.A03
            X.CZB r0 = r1.A04
            if (r0 == 0) goto L_0x0036
            r0.A01()
            r0 = 0
            r1.A04 = r0
        L_0x0036:
            X.DDq.A00(r5)
            X.BUd r4 = X.EDC.A01
            X.EDK r0 = r3.BP7(r4)
            X.EDC r0 = (X.EDC) r0
            X.Cmv r6 = X.DDR.A08(r0)
            X.CjS r1 = new X.CjS
            r1.<init>()
            X.DDm r0 = new X.DDm
            r0.<init>(r1, r5)
            r6.A04(r0, r11)
            X.Cvk r6 = r5.A04
            int r7 = r5.A01
            int r8 = r5.A00
            r13 = r11
            r12 = r11
            r6.A07(r7, r8, r9, r10, r11, r12, r13)
            X.DE1 r0 = r5.A03
            r0.A01 = r11
            X.CWX r1 = r6.A06()
            X.C18070vi.A0X(r1)
            X.DEA r0 = new X.DEA
            r0.<init>(r2, r14)
            r2.CNc(r0)
            X.EDK r6 = r3.BP7(r4)
            X.EDC r6 = (X.EDC) r6
            int r7 = r1.A01
            int r8 = r1.A00
            r6.CRF(r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZL.A01(int, int):void");
    }
}
