package X;

public class DEH implements C28552E7c {
    public final int A00;
    public final Object A01;

    public DEH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void Bhc(C28592E9h e9h, C25054CVi cVi) {
        if (this.A00 == 0) {
            cVi.A00(new C22805BPt(e9h));
            BTP btp = (BTP) this.A01;
            C26723DAz dAz = new C26723DAz(btp.A07);
            C26719DAt dAt = new C26719DAt(btp.A04.Bbi());
            DDP ddp = new DDP(btp, 1);
            int i = btp.A01;
            cVi.A00(new C22804BPs(dAt, btp.A06, dAz, ddp, e9h, i));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.DEE, java.lang.Object, X.E4f] */
    public /* synthetic */ void Bhd(C28592E9h e9h, CZ2 cz2) {
        E4f bux;
        if (this.A00 != 0) {
            cz2.A01(new C22889BUa(e9h));
            ? obj = new Object();
            obj.A00 = e9h;
            cz2.A01(obj);
            C28574E8g e8g = (C28574E8g) this.A01;
            if (e8g != null) {
                bux = new BUY(e8g.BV5(), e9h, e8g.BS8());
            } else {
                bux = new BUX(e9h);
            }
            cz2.A01(bux);
        }
    }
}
