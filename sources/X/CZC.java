package X;

import java.util.List;

public class CZC {
    public int A00 = 0;
    public long A01;
    public CUI A02;
    public List A03 = null;
    public final C25746ClG A04 = new C25746ClG();
    public final /* synthetic */ C26205Cuc A05;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r2.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r3, int r4) {
        /*
            r2 = this;
            r0 = 3
            if (r4 != r0) goto L_0x0012
            X.Cuc r1 = r2.A05
            X.CbZ r0 = r1.A09
            if (r0 == 0) goto L_0x0012
            X.D47 r0 = r0.A0C
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0012
            X.C26205Cuc.A02(r1)
        L_0x0012:
            X.Cuc r0 = r2.A05
            java.util.List r0 = r0.A0P
            java.util.Iterator r1 = r0.iterator()
        L_0x001a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.E9x r0 = (X.C28606E9x) r0
            r0.C0r(r4, r3)
            goto L_0x001a
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZC.A01(boolean, int):void");
    }

    public CZC(C26205Cuc cuc) {
        this.A05 = cuc;
    }

    public void A00(int i) {
        C26205Cuc cuc = this.A05;
        C25238CbZ cbZ = cuc.A09;
        if (cbZ != null && cbZ.A0C.A0R) {
            C26205Cuc.A02(cuc);
        }
        if (cuc.A0O.improveLooping) {
            for (C28606E9x C0z : cuc.A0P) {
                C0z.C0z(i);
            }
        }
    }
}
