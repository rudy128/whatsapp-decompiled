package X;

public final class C65 {
    public DAE A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;

    public void A00() {
        if (this.A01) {
            DAE dae = this.A00;
            if (dae.A0M && dae.A0G != null) {
                if (dae.A0F == null) {
                    BPR bpr = new BPR(dae);
                    dae.A0F = bpr;
                    dae.A0B(bpr);
                    return;
                }
                return;
            }
        }
        DAE dae2 = this.A00;
        BPR bpr2 = dae2.A0F;
        if (bpr2 != null) {
            dae2.A0C(bpr2);
            dae2.A0F = null;
        }
    }
}
