package X;

public class DDH implements E4W {
    public final BSI A00;
    public final C25052CVg A01;
    public final C25946CpE A02;

    public void CCn(C25268CcD ccD, ECs eCs) {
        ((DDI) eCs).A05.C1r(eCs, "NetworkFetchProducer");
        C25946CpE cpE = this.A02;
        C24990CSq cSq = new C24990CSq(ccD, eCs);
        CNG cng = new CNG(cSq, this);
        cSq.A03 = cpE.A01.now();
        cSq.A05.BB2(new C22853BSf(cng, cpE, cpE.A02.submit(new C27081DTg(cSq, cpE, cng, 20)), 0));
    }

    public DDH(BSI bsi, C25052CVg cVg, C25946CpE cpE) {
        this.A01 = cVg;
        this.A00 = bsi;
        this.A02 = cpE;
    }

    public static void A00(C24230Bxi bxi, C25268CcD ccD, int i) {
        DRN A012 = DRN.A01(bxi.A00());
        try {
            DRJ drj = new DRJ(A012);
            try {
                DRJ.A02(drj);
                ccD.A07(drj, i);
                drj.close();
                A012.close();
            } catch (Throwable th) {
                th = th;
                drj.close();
                A012.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            A012.close();
            throw th;
        }
    }
}
