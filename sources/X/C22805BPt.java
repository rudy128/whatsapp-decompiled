package X;

/* renamed from: X.BPt  reason: case insensitive filesystem */
public final class C22805BPt extends DDR implements ED4 {
    public DDv A00;
    public C26376Cyc A01;
    public final C25747ClH A02;
    public final CJH A03;
    public final C25376Ceb A04;
    public final EDJ A05;
    public final EDI A06;
    public final EDH A07;

    public static final void A00(C22805BPt bPt) {
        if (bPt.A02.A02 == null) {
            C22892BUd bUd = ED8.A01;
            if (DDR.A0C(bPt, bUd)) {
                DDv dDv = ((BUJ) ((ED8) DDR.A07(bPt, bUd))).A00;
                C18070vi.A0X(dDv);
                new C26713DAn(bPt, 0).CCr(dDv);
            }
        }
    }

    public C22892BUd BTg() {
        C22892BUd bUd = ED4.A01;
        C18070vi.A0Z(bUd);
        return bUd;
    }

    public C22805BPt(C28592E9h e9h) {
        EDJ edj;
        this.A00 = e9h;
        C9Z c9z = EDJ.A00;
        EDH edh = null;
        if (e9h.BeM(c9z)) {
            edj = (EDJ) e9h.BP8(c9z);
        } else {
            edj = null;
        }
        this.A05 = edj;
        C9Z c9z2 = EDH.A00;
        this.A07 = e9h.BeM(c9z2) ? (EDH) e9h.BP8(c9z2) : edh;
        EDI edi = (EDI) e9h.BP8(EDI.A00);
        this.A06 = edi;
        CJH cjh = new CJH(this);
        this.A03 = cjh;
        C25376Ceb ceb = C25376Ceb.A00;
        this.A04 = ceb;
        if (DDR.A0B(this, EBD.A06, false)) {
            EDK A072 = DDR.A07(this, EDC.A01);
            C18070vi.A0X(A072);
            C25675Ck6 ck6 = ((C22807BPv) ((EDC) A072)).A05;
            if (ck6 != null) {
                C22889BUa.A00().A00("ArEngineRenderThread", 0);
                DE6 de6 = new DE6();
                C25313CdJ cdJ = EBD.A00;
                Object cjS = new C25639CjS();
                Object A0A = DDR.A0A(this, cdJ);
                this.A01 = new C26376Cyc((C25639CjS) (A0A != null ? A0A : cjS), ck6.A00(edi.BSH("ArEngineRenderThread").getLooper()), de6, DDR.A0B(this, EB0.A00, false));
            }
        }
        C26376Cyc cyc = this.A01;
        int i = 0;
        Object A0A2 = DDR.A0A(this, EBD.A0J);
        C25747ClH clH = new C25747ClH(cyc, AnonymousClass000.A0M(A0A2 != null ? A0A2 : i), DDR.A0B(this, EBD.A05, false));
        this.A02 = clH;
        DDv dDv = (DDv) DDR.A0A(this, EB3.A01);
        this.A00 = dDv;
        if (dDv != null) {
            if (edj != null) {
                dDv.A05 = edj;
            }
            clH.A01(cjh, ceb, dDv);
        }
    }
}
