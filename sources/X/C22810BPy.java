package X;

/* renamed from: X.BPy  reason: case insensitive filesystem */
public final class C22810BPy extends DDR implements ED6 {
    public int A00;
    public EDA A01;
    public EDD A02;
    public EDE A03;
    public final EDJ A04;
    public final C28499E4e A05;
    public final EDI A06 = ((EDI) DDR.A09(this, EDI.A00));
    public final Object A07 = C17880vN.A0p();
    public volatile C24852CMv A08;
    public volatile boolean A09 = true;

    public static final void A00(C22810BPy bPy) {
        synchronized (bPy.A07) {
            bPy.A08 = null;
        }
    }

    public C22892BUd BTg() {
        return ED6.A01;
    }

    public C22810BPy(C28592E9h e9h) {
        EDJ edj;
        this.A00 = e9h;
        C9Z c9z = EDJ.A00;
        C28592E9h e9h2 = this.A00;
        C26159CtX.A01(e9h2);
        if (e9h2.BeM(c9z)) {
            edj = (EDJ) DDR.A09(this, c9z);
        } else {
            edj = null;
        }
        this.A04 = edj;
        this.A05 = new DED(this, 0);
    }
}
