package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.69I  reason: invalid class name */
public class AnonymousClass69I extends AnonymousClass6q1 {
    public float A00;
    public int A01;
    public PointF A02;
    public boolean A03;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r1 == 3) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(float r8) {
        /*
            r0 = 0
            r6 = 1
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            boolean r7 = X.C108975cc.A19(r0)
            float r5 = java.lang.Math.abs(r8)
            r0 = 1127481344(0x43340000, float:180.0)
            float r5 = r5 % r0
            r4 = 1110704128(0x42340000, float:45.0)
            float r0 = r5 / r4
            double r0 = (double) r0
            double r2 = java.lang.Math.floor(r0)
            int r1 = (int) r2
            float r5 = r5 % r4
            r0 = 1108869120(0x42180000, float:38.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0030
            int r1 = r1 + 1
        L_0x0022:
            if (r7 == 0) goto L_0x002e
            r0 = 3
            if (r1 != r6) goto L_0x002b
            r6 = 3
        L_0x0028:
            int r0 = r6 % 4
            return r0
        L_0x002b:
            if (r1 != r0) goto L_0x002e
            goto L_0x0028
        L_0x002e:
            r6 = r1
            goto L_0x0028
        L_0x0030:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass69I.A00(float):int");
    }

    public void A02() {
        super.A02();
        View view = this.A05;
        if (view.getVisibility() == 0) {
            view.invalidate();
        }
    }
}
