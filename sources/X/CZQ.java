package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public class CZQ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Context A09;
    public GestureDetector A0A;
    public VelocityTracker A0B;
    public C28466E2h A0C;
    public E6W A0D;
    public E6X A0E;
    public Integer A0F;
    public Integer A0G;
    public boolean A0H;

    public static void A00(CZQ czq) {
        if (!czq.A0H) {
            Context context = czq.A09;
            if (context != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                Method method = C28971bN.A00;
                int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                int scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                czq.A04 = scaledPagingTouchSlop;
                czq.A08 = scaledTouchSlop;
                czq.A07 = scaledMinimumFlingVelocity;
                czq.A06 = scaledMaximumFlingVelocity;
                czq.A0H = true;
                czq.A0H = true;
                czq.A09 = null;
                return;
            }
            throw AnonymousClass000.A0n("Init Context must not be null");
        }
    }

    public void A01() {
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0G = AnonymousClass00R.A0N;
        VelocityTracker velocityTracker = this.A0B;
        this.A0B = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r1 != 3) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        if (r1 != r0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        if (r0 != r2) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0107, code lost:
        r13.A0D.BsK(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0135, code lost:
        if ((r13.A05 & 8) == 8) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(android.view.MotionEvent r14) {
        /*
            r13 = this;
            X.E6W r0 = r13.A0D
            r3 = 0
            if (r0 == 0) goto L_0x0083
            int r0 = r13.A05
            if (r0 <= 0) goto L_0x0083
            int r1 = r14.getAction()
            float r4 = r14.getX()
            float r5 = r14.getY()
            r0 = 1
            if (r1 == 0) goto L_0x005d
            if (r1 == r0) goto L_0x0029
            r10 = 2
            if (r1 == r10) goto L_0x00ba
            r0 = 3
            if (r1 == r0) goto L_0x0029
        L_0x0020:
            java.lang.Integer r1 = r13.A0G
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
        L_0x0028:
            return r0
        L_0x0029:
            X.E6X r0 = r13.A0E
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r1 = r13.A0G
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 == r0) goto L_0x0020
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r1 == r0) goto L_0x0020
            A00(r13)
            int r1 = r13.A08
            float r0 = r13.A02
            float r0 = java.lang.Math.abs(r0)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            float r0 = r13.A03
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            X.E6X r0 = r13.A0E
            boolean r0 = r0.C8P(r4, r5)
            if (r0 != 0) goto L_0x0028
            r13.A01()
            return r0
        L_0x005d:
            java.lang.Integer r6 = X.AnonymousClass00R.A01
            r13.A0G = r6
            r0 = 0
            r13.A02 = r0
            r13.A03 = r0
            X.E2h r2 = r13.A0C
            if (r2 == 0) goto L_0x0084
            com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar r2 = (com.whatsapp.bloks.ui.widgets.rangeslider.WaRangeSeekBar) r2
            int r0 = r2.getMeasuredHeight()
            int r0 = r0 / 2
            float r0 = (float) r0
            float r1 = X.C108945cZ.A00(r5, r0)
            int r0 = r2.A04
            int r0 = r0 * 2
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            r13.A01()
        L_0x0083:
            return r3
        L_0x0084:
            r13.A00 = r4
            r13.A01 = r5
            X.E2h r0 = r13.A0C
            if (r0 == 0) goto L_0x0020
            java.lang.Integer r3 = r13.A0F
            if (r3 != 0) goto L_0x009a
            int r2 = r13.A05
            r1 = 8
            r0 = r2 & 8
            if (r0 != r1) goto L_0x00a9
            java.lang.Integer r3 = X.AnonymousClass00R.A0N
        L_0x009a:
            r13.A00 = r4
            r13.A01 = r5
            r13.A0F = r3
            java.lang.Integer r1 = r13.A0G
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r13.A0G = r0
            if (r1 == r0) goto L_0x0020
            goto L_0x0107
        L_0x00a9:
            r1 = 2
            r0 = r2 & 2
            r3 = r6
            if (r0 == r1) goto L_0x009a
            r1 = 1
            r0 = r2 & 1
            if (r0 != r1) goto L_0x00b7
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            goto L_0x009a
        L_0x00b7:
            java.lang.Integer r3 = X.AnonymousClass00R.A0C
            goto L_0x009a
        L_0x00ba:
            java.lang.Integer r0 = r13.A0G
            java.lang.Integer r6 = X.AnonymousClass00R.A0N
            if (r0 == r6) goto L_0x0020
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            if (r0 == r2) goto L_0x0020
            A00(r13)
            int r12 = r13.A04
            A00(r13)
            int r11 = r13.A08
            float r0 = r13.A00
            float r0 = r4 - r0
            int r9 = (int) r0
            float r0 = r13.A01
            float r0 = r5 - r0
            int r8 = (int) r0
            int r7 = java.lang.Math.abs(r9)
            int r3 = java.lang.Math.abs(r8)
            float r1 = r13.A02
            float r0 = (float) r9
            float r1 = r1 + r0
            r13.A02 = r1
            float r1 = r13.A03
            float r0 = (float) r8
            float r1 = r1 + r0
            r13.A03 = r1
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r3 <= r11) goto L_0x0119
            if (r8 >= 0) goto L_0x010e
            int r0 = r13.A05
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0138
            java.lang.Integer r6 = X.AnonymousClass00R.A00
        L_0x00fb:
            r13.A00 = r4
            r13.A01 = r5
            r13.A0F = r6
            java.lang.Integer r0 = r13.A0G
            r13.A0G = r2
            if (r0 == r2) goto L_0x0020
        L_0x0107:
            X.E6W r0 = r13.A0D
            r0.BsK(r4)
            goto L_0x0020
        L_0x010e:
            if (r8 <= 0) goto L_0x0138
            int r0 = r13.A05
            r0 = r0 & 2
            if (r0 != r10) goto L_0x0138
            java.lang.Integer r6 = X.AnonymousClass00R.A01
            goto L_0x00fb
        L_0x0119:
            if (r7 <= r12) goto L_0x0020
            float r1 = (float) r7
            float r1 = r1 * r0
            float r0 = (float) r3
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            if (r9 >= 0) goto L_0x012d
            int r0 = r13.A05
            r1 = 4
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0138
            r6 = r2
            goto L_0x00fb
        L_0x012d:
            if (r9 <= 0) goto L_0x0138
            int r0 = r13.A05
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x0138
            goto L_0x00fb
        L_0x0138:
            r13.A01()
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZQ.A02(android.view.MotionEvent):boolean");
    }
}
