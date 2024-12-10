package X;

public class DBL implements E4M {
    public final /* synthetic */ CSN A00;
    public final /* synthetic */ C26757DCm A01;

    public DBL(CSN csn, C26757DCm dCm) {
        this.A01 = dCm;
        this.A00 = csn;
    }

    public void CEE(Object obj) {
        boolean z;
        DRN A012;
        C24775CJs cJs;
        C26757DCm dCm = this.A01;
        CSN csn = this.A00;
        C26208Cuj.A01(csn);
        synchronized (dCm) {
            C26208Cuj.A01(csn);
            int i = csn.A00;
            C26208Cuj.A05(AnonymousClass000.A1R(i));
            int i2 = i - 1;
            csn.A00 = i2;
            if (csn.A01 || i2 != 0) {
                z = false;
            } else {
                dCm.A03.A03(csn.A04, csn);
                z = true;
            }
            A012 = C26757DCm.A01(csn, dCm);
        }
        if (A012 != null) {
            A012.close();
        }
        if (z && (cJs = csn.A03) != null) {
            Object obj2 = csn.A04;
            CRI cri = cJs.A00;
            synchronized (cri) {
                cri.A03.add(obj2);
            }
        }
        C26757DCm.A03(dCm);
        dCm.A04();
    }
}
