package X;

import java.io.IOException;

public class D9R implements C22563BCy {
    public C25238CbZ A00;
    public final C26381Cyh A01;
    public final C27066DRp A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public void BsG(C25199Caq caq, CTB ctb, int i) {
    }

    public void Bwp(C25199Caq caq, CJ1 cj1, CTB ctb, int i) {
    }

    public void Bx2(C25199Caq caq, CJ1 cj1, CTB ctb, int i) {
    }

    public void Bxw(C25199Caq caq, int i) {
    }

    public void Bxx(C25199Caq caq, int i) {
    }

    public void C2X(C25199Caq caq, int i) {
    }

    public void Bwv(C25199Caq caq, CJ1 cj1, CTB ctb, IOException iOException, int i, boolean z) {
        int i2 = ctb.A00;
        if (this.A04 && ctb.A02 == 3 && i2 == 1 && (iOException instanceof BPM) && ((BPM) iOException).responseCode == 404) {
            this.A01.A0N();
        }
        if (this.A06 && ctb.A02 == 3 && i2 == 1 && (iOException instanceof BPM) && ((BPM) iOException).responseCode >= 500) {
            this.A01.A0N();
        }
        if (this.A03 && ctb.A02 == 3 && i2 == 2 && (iOException instanceof BPM) && ((BPM) iOException).responseCode == 404) {
            this.A01.A0N();
        }
        if (this.A05 && ctb.A02 == 3 && i2 == 2 && (iOException instanceof BPM) && ((BPM) iOException).responseCode >= 500) {
            this.A01.A0N();
        }
    }

    public D9R(C26381Cyh cyh, C27066DRp dRp, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = cyh;
        this.A04 = z;
        this.A03 = z2;
        this.A05 = z4;
        this.A06 = z3;
        this.A02 = dRp;
    }

    public void Bwr(C25199Caq caq, CJ1 cj1, CTB ctb, Object obj, int i) {
    }
}
