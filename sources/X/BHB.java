package X;

import android.view.ScaleGestureDetector;
import android.view.View;

public class BHB extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float A00;
    public final /* synthetic */ C22806BPu A01;

    public BHB(C22806BPu bPu) {
        this.A01 = bPu;
    }

    private boolean A00() {
        CSK csk;
        C25632CjI cjI;
        C22806BPu bPu = this.A01;
        if (!(bPu.A03 == null || (csk = bPu.A04) == null)) {
            C28614EAk eAk = csk.A04;
            if (eAk.isConnected()) {
                try {
                    cjI = eAk.BOK();
                } catch (C27206DZg unused) {
                }
                if (csk.A03 || cjI == null || !BE9.A1T(C25632CjI.A0e, cjI)) {
                    return false;
                }
                return true;
            }
            cjI = null;
            if (csk.A03) {
            }
        }
        return false;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C22806BPu bPu = this.A01;
        if (!A00()) {
            return false;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - this.A00;
        View view = bPu.A03;
        C199610h.A04(view);
        CSK csk = bPu.A04;
        int i = csk.A01;
        int i2 = csk.A02;
        csk.A04.CLX(new C22896BUh(), Math.min(i, Math.max(i2, ((int) ((currentSpan / C108945cZ.A03(view)) * ((float) (i - i2)))) + csk.A00)));
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[SYNTHETIC, Splitter:B:13:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onScaleBegin(android.view.ScaleGestureDetector r5) {
        /*
            r4 = this;
            boolean r0 = r4.A00()
            if (r0 == 0) goto L_0x005f
            float r0 = r5.getCurrentSpan()
            r4.A00 = r0
            X.BPu r2 = r4.A01
            android.view.View r0 = r2.A03
            X.C199610h.A04(r0)
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L_0x001d
            r0 = 1
            r1.requestDisallowInterceptTouchEvent(r0)
        L_0x001d:
            X.CSK r3 = r2.A04
            X.EAk r1 = r3.A04
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x002c
            X.CjI r2 = r1.BOK()     // Catch:{ DZg -> 0x002c }
            goto L_0x002d
        L_0x002c:
            r2 = 0
        L_0x002d:
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x0038
            X.Cpe r1 = r1.BZ5()     // Catch:{ DZg -> 0x0038 }
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r2 == 0) goto L_0x005f
            if (r1 == 0) goto L_0x005f
            X.CKJ r0 = X.C25971Cpe.A11
            java.lang.Object r0 = r1.A04(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x005f
            int r0 = r0.intValue()
            r3.A00 = r0
            X.CKI r0 = X.C25632CjI.A0i
            int r0 = X.BE9.A0B(r0, r2)
            r3.A01 = r0
            X.CKI r0 = X.C25632CjI.A0k
            int r0 = X.BE9.A0B(r0, r2)
            r3.A02 = r0
            r0 = 1
            return r0
        L_0x005f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BHB.onScaleBegin(android.view.ScaleGestureDetector):boolean");
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        A00();
    }
}
