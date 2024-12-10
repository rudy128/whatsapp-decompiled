package X;

import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.Camera;

/* renamed from: X.CkL  reason: case insensitive filesystem */
public class C25690CkL {
    public int A00;
    public Camera A01;
    public C28500E4g A02;
    public CK8 A03;
    public boolean A04;
    public final C25202Cav A05;
    public final C25850CnB A06;
    public volatile boolean A07;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile boolean A0A;

    public static void A00(Point point, C28500E4g e4g, C25690CkL ckL, Integer num) {
        if (e4g != null) {
            CK8 ck8 = ckL.A03;
            if (!(point == null || ck8 == null)) {
                float[] A1V = C108945cZ.A1V();
                A1V[0] = (float) point.x;
                A1V[1] = (float) point.y;
                Matrix matrix = ck8.A00;
                Matrix A0J = C108945cZ.A0J();
                matrix.invert(A0J);
                A0J.mapPoints(A1V);
                point.set((int) A1V[0], (int) A1V[1]);
            }
            C26078Crs.A00(new C27081DTg(point, e4g, num, 21));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (X.AnonymousClass3Ma.A1b(r1, 6) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            X.CnB r1 = r4.A06
            java.lang.String r0 = "Setting focus mode for video must happen on the Optic thread."
            r1.A06(r0)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0015
            r0 = 1
            r4.A0A = r0
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0016
            r0 = 0
            r4.A04 = r0
        L_0x0015:
            return
        L_0x0016:
            X.Cav r1 = r4.A05
            int r0 = r4.A00
            X.BUu r3 = r1.A00(r0)
            X.BUo r1 = r3.A00
            android.graphics.Rect r0 = X.C26170Ctm.A00
            X.CKI r0 = X.C25632CjI.A0s
            java.util.List r1 = X.BE6.A11(r0, r1)
            r2 = 3
            boolean r0 = X.AnonymousClass3Ma.A1b(r1, r2)
            if (r0 != 0) goto L_0x0036
            r2 = 6
            boolean r0 = X.AnonymousClass3Ma.A1b(r1, r2)
            if (r0 == 0) goto L_0x003d
        L_0x0036:
            X.Csq r1 = r3.A00
            X.CKJ r0 = X.C25971Cpe.A0D
            X.C26128Csq.A01(r0, r1, r2)
        L_0x003d:
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25690CkL.A01():void");
    }

    public C25690CkL(C25202Cav cav, C25850CnB cnB) {
        this.A06 = cnB;
        this.A05 = cav;
    }
}
