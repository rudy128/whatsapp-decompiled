package X;

public class DDm implements E98 {
    public int A00;
    public EAJ A01;
    public C26045Cr9 A02;
    public C26781DDl A03;
    public boolean A04;
    public final C25639CjS A05;
    public final EA3 A06;
    public final E8l A07;
    public final CNM A08;

    public DDm(C25639CjS cjS, E8l e8l) {
        this(cjS, (EA3) null, e8l, false, false);
    }

    public void BIY() {
        this.A01 = null;
        E8l e8l = this.A07;
        if (e8l instanceof E98) {
            ((E98) e8l).BIY();
        }
        C26781DDl dDl = this.A03;
        if (dDl != null) {
            dDl.BIY();
            this.A03.A01 = null;
            this.A03 = null;
        }
    }

    public void release() {
        this.A02 = null;
        E8l e8l = this.A07;
        if (e8l instanceof E98) {
            ((E98) e8l).release();
        }
    }

    public void BCi(EAJ eaj) {
        this.A01 = eaj;
        E8l e8l = this.A07;
        if (e8l instanceof E98) {
            ((E98) e8l).BCi(eaj);
        }
    }

    public void Bd8(C26045Cr9 cr9) {
        this.A02 = cr9;
        E8l e8l = this.A07;
        if (e8l instanceof E98) {
            ((E98) e8l).Bd8(cr9);
        }
    }

    public DDm(C25639CjS cjS, EA3 ea3, E8l e8l, boolean z, boolean z2) {
        this.A05 = cjS;
        this.A08 = new CNM(cjS, z2);
        this.A07 = e8l;
        this.A06 = ea3;
        this.A04 = z;
        this.A00 = 0;
    }
}
