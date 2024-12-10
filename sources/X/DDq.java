package X;

import android.os.SystemClock;

public class DDq implements E98, E8l, C28496E4b {
    public int A00;
    public int A01;
    public EAJ A02;
    public final DE1 A03 = new Object();
    public final C26246Cvk A04 = new BUV();
    public volatile C28497E4c A05;

    public void Bd8(C26045Cr9 cr9) {
    }

    public void release() {
    }

    public static void A00(DDq dDq) {
        if (dDq.A02 != null) {
            DE1 de1 = dDq.A03;
            if (de1.A04 == null) {
                C25008CTi cTi = new C25008CTi("BlankInput");
                cTi.A02 = 3553;
                cTi.A03 = 8;
                cTi.A01 = 8;
                BEB.A0p(cTi.A08);
                de1.A04 = new CZB(cTi);
            }
            C28497E4c e4c = dDq.A05;
            if (e4c != null) {
                e4c.Bv1();
            }
        }
    }

    public void BCi(EAJ eaj) {
        this.A02 = eaj;
        A00(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BIY() {
        /*
            r2 = this;
            X.EAJ r0 = r2.A02
            if (r0 == 0) goto L_0x0010
            X.DE1 r1 = r2.A03
            X.CZB r0 = r1.A04
            if (r0 == 0) goto L_0x0010
            r0.A01()
            r0 = 0
            r1.A04 = r0
        L_0x0010:
            r0 = 0
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDq.BIY():void");
    }

    public EA3 BRy() {
        DE1 de1 = this.A03;
        de1.A05 = this.A04.A06();
        de1.A03 = SystemClock.elapsedRealtimeNanos();
        return de1;
    }

    public /* synthetic */ int BT4() {
        return 0;
    }

    public CWX CQm(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        C26246Cvk cvk = this.A04;
        cvk.A07(this.A01, this.A00, i, i2, 0, false, false);
        this.A03.A01 = i6;
        return cvk.A06();
    }

    public void CJe(C28497E4c e4c) {
        this.A05 = e4c;
    }
}
