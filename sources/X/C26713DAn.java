package X;

/* renamed from: X.DAn  reason: case insensitive filesystem */
public class C26713DAn implements E4D {
    public final int A00;
    public final Object A01;

    public C26713DAn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void CCr(DDv dDv) {
        switch (this.A00) {
            case 0:
                C22805BPt bPt = (C22805BPt) this.A01;
                bPt.A00 = dDv;
                bPt.A02.A01(bPt.A03, bPt.A04, dDv);
                return;
            case 1:
                ((C22804BPs) this.A01).A00 = dDv;
                return;
            default:
                dDv.A08 = DDR.A0B((DDR) this.A01, EBD.A06, false);
                return;
        }
    }
}
