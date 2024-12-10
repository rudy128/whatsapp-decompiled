package X;

import java.util.concurrent.Executor;

public class DDD implements E4W {
    public final C25052CVg A00;
    public final Executor A01;
    public final E4W A02;
    public final E4X A03;
    public final boolean A04;

    public void CCn(C25268CcD ccD, ECs eCs) {
        C25268CcD ccD2 = ccD;
        ECs eCs2 = eCs;
        this.A02.CCn(new BSY(ccD2, eCs2, this, this.A03, this.A04), eCs);
    }

    public DDD(C25052CVg cVg, E4W e4w, E4X e4x, Executor executor, boolean z) {
        C26208Cuj.A01(executor);
        this.A01 = executor;
        C26208Cuj.A01(cVg);
        this.A00 = cVg;
        this.A02 = e4w;
        C26208Cuj.A01(e4x);
        this.A03 = e4x;
        this.A04 = z;
    }
}
