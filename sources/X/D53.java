package X;

import android.view.View;
import android.view.ViewConfiguration;

public class D53 implements View.OnTouchListener {
    public D8K A00;
    public final DOZ A01;
    public final DFL A02;
    public final DFL A03;
    public final float A04;

    public D53(DOZ doz, DFL dfl, DFL dfl2) {
        this.A03 = dfl;
        this.A01 = doz;
        this.A02 = dfl2;
        this.A00 = (D8K) C26272CwJ.A04(doz, dfl);
        this.A04 = (float) ViewConfiguration.get(doz.A00).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        if (r6.A00 != false) goto L_0x0072;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            int r1 = r9.getAction()
            r4 = 0
            if (r1 == 0) goto L_0x0077
            r0 = 1
            if (r1 == r0) goto L_0x0015
            r0 = 3
            if (r1 == r0) goto L_0x006c
            r0 = 4
            if (r1 == r0) goto L_0x006c
        L_0x0010:
            X.D8K r0 = r7.A00
            boolean r0 = r0.A00
            return r0
        L_0x0015:
            X.D8K r6 = r7.A00
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0010
            float r5 = r9.getX()
            float r3 = r9.getY()
            float r2 = r7.A04
            X.C18070vi.A0d(r8, r4)
            float r1 = -r2
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            int r1 = r8.getRight()
            int r0 = r8.getLeft()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            int r1 = r8.getBottom()
            int r0 = r8.getTop()
            int r1 = r1 - r0
            float r0 = (float) r1
            float r0 = r0 + r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0072
            X.DFL r5 = r7.A03
            r0 = 38
        L_0x0053:
            X.E8A r3 = r5.A0A(r0)
            if (r3 == 0) goto L_0x0069
            X.A4p r2 = new X.A4p
            r2.<init>()
            X.DFL r0 = r7.A02
            r2.A03(r0, r4)
            r1 = 1
            X.DOZ r0 = r7.A01
            X.C26209Cul.A04(r0, r5, r2, r3, r1)
        L_0x0069:
            r6.A00 = r4
            goto L_0x0010
        L_0x006c:
            X.D8K r6 = r7.A00
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0010
        L_0x0072:
            X.DFL r5 = r7.A03
            r0 = 35
            goto L_0x0053
        L_0x0077:
            X.DFL r3 = r7.A03
            r0 = 36
            X.E8A r2 = r3.A0A(r0)
            if (r2 != 0) goto L_0x0082
            return r4
        L_0x0082:
            X.A4p r1 = new X.A4p
            r1.<init>()
            X.DFL r0 = r7.A02
            X.9zJ r1 = X.BE7.A0R(r1, r0, r4)
            X.DOZ r0 = r7.A01
            java.lang.Object r2 = X.C25681CkC.A03(r0, r3, r1, r2)
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x00a8
            java.lang.String r1 = "bk.components.FoaTouchExtension"
            java.lang.String r0 = "Got non-boolean result while evaluating touch down expression"
            X.C25913CoX.A01(r1, r0)
            X.D8K r0 = r7.A00
            r0.A00 = r4
            goto L_0x0010
        L_0x00a8:
            X.D8K r1 = r7.A00
            boolean r0 = X.C25343Ce2.A01(r2)
            r1.A00 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D53.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
