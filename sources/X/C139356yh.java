package X;

import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.6yh  reason: invalid class name and case insensitive filesystem */
public class C139356yh {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public RectF A02 = AnonymousClass3MW.A08();
    public Vibrator A03;
    public C1409773u A04;
    public Map A05 = C17880vN.A11();
    public boolean A06 = false;
    public boolean A07 = false;
    public final float A08;
    public final Handler A09;
    public final ViewGroup A0A;

    public static void A00(C139356yh r3) {
        AnonymousClass69I r2 = (AnonymousClass69I) AnonymousClass000.A0w(r3.A05, 3);
        if (r2 != null) {
            r2.A00 = 0.0f;
            r2.A03 = false;
        }
        r3.A06 = false;
        r3.A07 = false;
        r3.A01 = 0.0f;
        r3.A00 = 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1 == 2) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float A01(android.graphics.PointF r11, X.C1409773u r12, float r13) {
        /*
            r10 = this;
            X.73u r0 = r10.A04
            if (r0 == r12) goto L_0x0009
            r10.A04 = r12
            A00(r10)
        L_0x0009:
            java.util.Map r4 = r10.A05
            r0 = 3
            java.lang.Object r3 = X.AnonymousClass000.A0w(r4, r0)
            X.69I r3 = (X.AnonymousClass69I) r3
            float r5 = r12.A02
            boolean r2 = r3.A03
            r1 = -1
            if (r2 == 0) goto L_0x0059
            float r6 = r3.A00
            float r6 = r6 + r13
            int r0 = X.AnonymousClass69I.A00(r6)
            if (r0 == r1) goto L_0x004f
            r3.A00 = r6
            r13 = 0
        L_0x0025:
            float r5 = r5 + r13
            int r1 = X.AnonymousClass69I.A00(r5)
            r0 = -1
            if (r1 == r0) goto L_0x002f
            r3.A01 = r1
        L_0x002f:
            r3.A02 = r11
            if (r2 == 0) goto L_0x00c9
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0047
            r0 = 2
            if (r1 != r0) goto L_0x0047
        L_0x003a:
            java.lang.Object r0 = X.AnonymousClass000.A0w(r4, r0)
            X.6q1 r0 = (X.AnonymousClass6q1) r0
            r0.A01()
        L_0x0043:
            r3.A02()
            return r13
        L_0x0047:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0043
            if (r1 != 0) goto L_0x0043
            r0 = 1
            goto L_0x003a
        L_0x004f:
            float r6 = r6 - r5
            r0 = 0
            r3.A00 = r0
            r0 = 0
            r3.A03 = r0
            r2 = 0
            r13 = r6
            goto L_0x0025
        L_0x0059:
            r7 = r13
            float r6 = java.lang.Math.abs(r13)
            r0 = 1127481344(0x43340000, float:180.0)
            r9 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            r7 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c7
            float r7 = r7 + r13
        L_0x006c:
            r8 = 1110704128(0x42340000, float:45.0)
            float r6 = r5 % r8
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            float r6 = r6 + r7
            if (r0 <= 0) goto L_0x00bc
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0081
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0025
        L_0x0081:
            float r7 = r5 + r13
            int r0 = X.AnonymousClass69I.A00(r7)
            if (r0 == r1) goto L_0x0025
            r0 = 1
            r3.A03 = r0
            r2 = 1
            r3.A00 = r7
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            boolean r6 = X.C108975cc.A19(r0)
            float r0 = r7 % r8
            float r1 = java.lang.Math.abs(r0)
            r0 = 1108869120(0x42180000, float:38.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00ad
            float r1 = r8 - r1
            r6 = r6 ^ 1
        L_0x00a5:
            if (r6 != 0) goto L_0x00a8
            float r1 = -r1
        L_0x00a8:
            float r7 = r7 + r1
            float r13 = r7 - r5
            goto L_0x0025
        L_0x00ad:
            r0 = 1088421888(0x40e00000, float:7.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a5
            java.lang.String r0 = java.lang.Float.toString(r7)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00bc:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0081
            r0 = -1036779520(0xffffffffc2340000, float:-45.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            goto L_0x0081
        L_0x00c7:
            float r7 = r7 - r13
            goto L_0x006c
        L_0x00c9:
            r3.A01()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139356yh.A01(android.graphics.PointF, X.73u, float):float");
    }

    public C139356yh(Handler handler, ViewGroup viewGroup, AnonymousClass11C r5) {
        this.A0A = viewGroup;
        this.A09 = handler;
        this.A08 = AnonymousClass3MW.A00(viewGroup.getResources(), 2131167689);
        this.A03 = r5.A0H();
    }
}
