package X;

public class DEL implements AnonymousClass86M {
    public final int A00;
    public final Object A01;

    public DEL(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BxD(String str, String str2) {
        switch (this.A00) {
            case 0:
                DAU dau = (DAU) this.A01;
                dau.A0R.CEN();
                Object[] A1a = AnonymousClass8BR.A1a();
                AnonymousClass8BX.A1K(dau.A0P.A00, str, str2, A1a);
                C108955ca.A1F(dau.A0I, A1a, 4);
                return;
            case 1:
                C22808BPw bPw = (C22808BPw) this.A01;
                bPw.A0b = true;
                EAW eaw = bPw.A0T;
                if (eaw == null) {
                    eaw = ((EDE) DDR.A07(bPw, EDE.A00)).Ba2();
                    bPw.A0T = eaw;
                }
                C26159CtX.A01(eaw);
                eaw.CEN();
                C26379Cyf.A05(C22808BPw.A00(bPw), str, str2, bPw.A0g.A00);
                return;
            default:
                C26808DEq dEq = (C26808DEq) this.A01;
                C28611EAf eAf = dEq.A01;
                int i = C26175Cts.A00;
                if (eAf != null) {
                    C26175Cts.A01.A02(eAf);
                }
                dEq.A01 = null;
                dEq.A02 = null;
                return;
        }
    }
}
