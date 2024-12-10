package X;

import android.graphics.Matrix;
import android.view.View;
import android.widget.OverScroller;

public class DTP implements Runnable {
    public float A00;
    public float A01;
    public long A02;
    public long A03;
    public Matrix A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float[] A0C = C108945cZ.A1V();
    public final View A0D;
    public final OverScroller A0E;
    public final C28413E0e A0F;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            boolean r0 = r13.A06
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r13.A09
            r8 = 1
            r7 = 0
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0016
            android.widget.OverScroller r0 = r13.A0E
            r0.forceFinished(r8)
            r0 = 0
            r13.A00 = r0
        L_0x0016:
            r13.A07 = r7
            r13.A09 = r8
        L_0x001a:
            android.widget.OverScroller r2 = r13.A0E
            boolean r0 = r2.computeScrollOffset()
            if (r0 == 0) goto L_0x00eb
            float[] r1 = r13.A0C
            int r0 = r2.getCurrX()
            float r0 = (float) r0
            r1[r7] = r0
            int r0 = r2.getCurrY()
            float r0 = (float) r0
            r1[r8] = r0
            android.graphics.Matrix r0 = r13.A04
            if (r0 == 0) goto L_0x0039
            r0.mapPoints(r1)
        L_0x0039:
            r11 = r1[r7]
            r9 = r1[r8]
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x0047
            r13.A08 = r7
            r13.A0A = r11
            r13.A0B = r9
        L_0x0047:
            X.E0e r6 = r13.A0F
            float r0 = r13.A0A
            float r1 = r11 - r0
            float r0 = r13.A0B
            float r10 = r9 - r0
            X.BIS r6 = (X.BIS) r6
            double r2 = r6.A02
            long r4 = r6.A0J
            float r12 = (float) r4
            float r1 = r1 / r12
            double r0 = (double) r1
            double r2 = r2 - r0
            double r0 = X.BIS.A00(r2)
            r6.A02 = r0
            double r2 = r6.A03
            float r10 = r10 / r12
            double r0 = (double) r10
            double r2 = r2 - r0
            double r0 = r6.A0B(r2, r4)
            r6.A03 = r0
            r13.A0A = r11
            r13.A0B = r9
            r9 = 1
        L_0x0071:
            float r0 = r13.A01
            double r4 = (double) r0
            r1 = -4646453807550688133(0xbf847ae147ae147b, double:-0.01)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0086
            r1 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
        L_0x0086:
            long r2 = r13.A03
            r0 = 0
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            long r0 = android.os.SystemClock.uptimeMillis()
            if (r6 != 0) goto L_0x00e0
            r13.A03 = r0
            r6 = 1
        L_0x0095:
            r2 = 4606416807056637952(0x3fed47ae20000000, double:0.9150000214576721)
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 * r0
            float r3 = (float) r4
            r13.A01 = r3
            X.E0e r2 = r13.A0F
            r0 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r0
            X.BIS r2 = (X.BIS) r2
            float r1 = r2.A08
            float r0 = r2.A09
            boolean r0 = X.BIS.A0A(r2, r3, r1, r0)
            if (r0 != 0) goto L_0x00b8
            r0 = 0
            r13.A01 = r0
        L_0x00b7:
            r8 = r9
        L_0x00b8:
            float r0 = r13.A00
            double r2 = (double) r0
            r4 = -4646453807550688133(0xbf847ae147ae147b, double:-0.01)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x00ed
            r4 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00ed
            if (r8 != 0) goto L_0x0118
            r13.A09 = r7
            r13.A05 = r7
        L_0x00d3:
            X.E0e r1 = r13.A0F
            X.BIS r1 = (X.BIS) r1
            X.DAE r0 = r1.A0M
            r0.A04()
            X.BIS.A07(r1)
            return
        L_0x00e0:
            long r0 = r0 - r2
            int r6 = (int) r0
            int r6 = r6 / 10
            int r0 = r6 * 10
            long r0 = (long) r0
            long r2 = r2 + r0
            r13.A03 = r2
            goto L_0x0095
        L_0x00eb:
            r9 = 0
            goto L_0x0071
        L_0x00ed:
            long r4 = r13.A02
            r6 = 0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            long r6 = android.os.SystemClock.uptimeMillis()
            if (r0 != 0) goto L_0x0121
            r13.A02 = r6
            r6 = 1
        L_0x00fc:
            r4 = 4605831339126554624(0x3feb333340000000, double:0.8500000238418579)
            double r0 = (double) r6
            double r0 = java.lang.Math.pow(r4, r0)
            double r2 = r2 * r0
            float r0 = (float) r2
            r13.A00 = r0
            X.E0e r3 = r13.A0F
            X.BIS r3 = (X.BIS) r3
            float r2 = r3.A0A
            float r2 = r2 + r0
            float r1 = r3.A08
            float r0 = r3.A09
            r3.A0E(r2, r1, r0)
        L_0x0118:
            android.view.View r0 = r13.A0D
            r0.invalidate()
            r0.postOnAnimation(r13)
            return
        L_0x0121:
            long r6 = r6 - r4
            int r0 = (int) r6
            int r6 = r0 / 10
            int r0 = r6 * 10
            long r0 = (long) r0
            long r4 = r4 + r0
            r13.A02 = r4
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DTP.run():void");
    }

    public DTP(View view, C28413E0e e0e) {
        this.A0D = view;
        this.A0F = e0e;
        OverScroller overScroller = new OverScroller(view.getContext());
        this.A0E = overScroller;
        overScroller.setFriction(0.035f);
    }
}
