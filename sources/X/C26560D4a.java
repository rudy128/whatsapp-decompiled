package X;

import android.view.Choreographer;

/* renamed from: X.D4a  reason: case insensitive filesystem */
public class C26560D4a implements Choreographer.FrameCallback {
    public final int A00;
    public final Object A01;

    public C26560D4a(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0061 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void doFrame(long r27) {
        /*
            r26 = this;
            r1 = r26
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x019f;
                case 1: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A01
            X.CiZ r2 = (X.C25594CiZ) r2
            X.0vl r0 = r2.A05
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Runnable r0 = r2.A03
            r1.postAtFrontOfQueue(r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r0 = r1.A01
            X.COt r0 = (X.C24900COt) r0
            X.CIf r0 = r0.A02
            X.CiQ r8 = r0.A00
            long r4 = android.os.SystemClock.uptimeMillis()
            long r17 = android.os.SystemClock.uptimeMillis()
            r7 = 0
        L_0x002a:
            java.util.ArrayList r2 = r8.A04
            int r0 = r2.size()
            if (r7 >= r0) goto L_0x016b
            java.lang.Object r6 = r2.get(r7)
            X.E0H r6 = (X.E0H) r6
            if (r6 == 0) goto L_0x0061
            X.00O r3 = r8.A02
            java.lang.Object r0 = r3.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x004f
            long r1 = r0.longValue()
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
            r3.remove(r6)
        L_0x004f:
            X.D6h r6 = (X.C26613D6h) r6
            long r0 = r6.A04
            r11 = 0
            r10 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0064
            r6.A04 = r4
            float r0 = r6.A00
            r6.A01(r0)
        L_0x0061:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x0064:
            long r24 = r4 - r0
            r6.A04 = r4
            boolean r0 = r6.A07
            r14 = 0
            r9 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r13 = r6.A03
            int r1 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x00ee
            if (r1 == 0) goto L_0x007d
            X.Cq5 r2 = r6.A05
            double r0 = (double) r13
            r2.A02 = r0
            r6.A03 = r9
        L_0x007d:
            X.Cq5 r0 = r6.A05
            double r0 = r0.A02
            float r9 = (float) r0
            r6.A00 = r9
            r6.A01 = r14
            r6.A07 = r10
        L_0x0088:
            r2 = 1
        L_0x0089:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            float r1 = java.lang.Math.min(r9, r0)
            r6.A00 = r1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r0 = java.lang.Math.max(r1, r0)
            r6.A00 = r0
            r6.A01(r0)
            if (r2 == 0) goto L_0x0061
            r3 = 0
            r6.A06 = r10
            java.lang.ThreadLocal r1 = X.C25586CiQ.A05
            java.lang.Object r0 = r1.get()
            if (r0 != 0) goto L_0x00b3
            X.CiQ r0 = new X.CiQ
            r0.<init>()
            r1.set(r0)
        L_0x00b3:
            java.lang.Object r9 = r1.get()
            X.CiQ r9 = (X.C25586CiQ) r9
            X.00O r0 = r9.A02
            r0.remove(r6)
            java.util.ArrayList r2 = r9.A04
            int r1 = r2.indexOf(r6)
            if (r1 < 0) goto L_0x00cd
            r0 = 0
            r2.set(r1, r0)
            r0 = 1
            r9.A01 = r0
        L_0x00cd:
            r0 = 0
            r6.A04 = r0
            r6.A08 = r10
        L_0x00d3:
            java.util.ArrayList r2 = r6.A0B
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0159
            java.lang.Object r0 = r2.get(r3)
            if (r0 == 0) goto L_0x00eb
            r2.get(r3)
            java.lang.String r0 = "onAnimationEnd"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00eb:
            int r3 = r3 + 1
            goto L_0x00d3
        L_0x00ee:
            X.Cq5 r12 = r6.A05
            float r0 = r6.A00
            double r2 = (double) r0
            float r0 = r6.A01
            if (r1 == 0) goto L_0x0110
            double r0 = (double) r0
            r15 = 2
            long r24 = r24 / r15
            r19 = r12
            r20 = r2
            r22 = r0
            X.CMP r11 = r19.A01(r20, r22, r24)
            double r0 = (double) r13
            r12.A02 = r0
            r6.A03 = r9
            float r0 = r11.A00
            double r2 = (double) r0
            float r0 = r11.A01
        L_0x0110:
            double r0 = (double) r0
            r19 = r12
            r20 = r2
            r22 = r0
            X.CMP r0 = r19.A01(r20, r22, r24)
            float r2 = r0.A00
            r6.A00 = r2
            float r1 = r0.A01
            r6.A01 = r1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r0 = java.lang.Math.max(r2, r0)
            r6.A00 = r0
            float r9 = java.lang.Math.min(r0, r9)
            r6.A00 = r9
            X.Cq5 r11 = r6.A05
            float r0 = java.lang.Math.abs(r1)
            double r2 = (double) r0
            double r0 = r11.A07
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0156
            double r0 = r11.A02
            float r2 = (float) r0
            float r0 = X.C108945cZ.A00(r9, r2)
            double r2 = (double) r0
            double r0 = r11.A06
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x0156
            double r0 = r12.A02
            float r9 = (float) r0
            r6.A00 = r9
            r6.A01 = r14
            goto L_0x0088
        L_0x0156:
            r2 = 0
            goto L_0x0089
        L_0x0159:
            int r1 = r2.size()
        L_0x015d:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0061
            java.lang.Object r0 = r2.get(r1)
            if (r0 != 0) goto L_0x015d
            r2.remove(r1)
            goto L_0x015d
        L_0x016b:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0184
            int r1 = r2.size()
        L_0x0173:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0181
            java.lang.Object r0 = r2.get(r1)
            if (r0 != 0) goto L_0x0173
            r2.remove(r1)
            goto L_0x0173
        L_0x0181:
            r0 = 0
            r8.A01 = r0
        L_0x0184:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x0018
            X.COt r2 = r8.A00
            if (r2 != 0) goto L_0x0197
            X.CIf r0 = r8.A03
            X.COt r2 = new X.COt
            r2.<init>(r0)
            r8.A00 = r2
        L_0x0197:
            android.view.Choreographer r1 = r2.A01
            android.view.Choreographer$FrameCallback r0 = r2.A00
            r1.postFrameCallback(r0)
            return
        L_0x019f:
            java.lang.Object r0 = r1.A01
            X.C108945cZ.A1P(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26560D4a.doFrame(long):void");
    }
}
