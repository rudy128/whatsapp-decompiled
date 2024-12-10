package X;

import android.view.Choreographer;

/* renamed from: X.2v7  reason: invalid class name and case insensitive filesystem */
public class C64652v7 implements Choreographer.FrameCallback {
    public final int A00;
    public final Object A01;

    public C64652v7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x015c, code lost:
        if (r6 > r2) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0164, code lost:
        if (r6 < r2) goto L_0x0166;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void doFrame(long r46) {
        /*
            r45 = this;
            r12 = r45
            int r0 = r12.A00
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r0 = r12.A01
            r40 = r0
            r0 = r40
            X.1zO r0 = (X.C43181zO) r0
            r40 = r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x01f1
            r0 = r40
            X.1zN r0 = r0.A01
            r39 = r0
            if (r0 == 0) goto L_0x01f1
            long r29 = android.os.SystemClock.uptimeMillis()
            r0 = r40
            long r0 = r0.A00
            long r2 = r29 - r0
            double r0 = (double) r2
            r35 = r0
            r0 = r39
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A04
            r44 = r0
            java.util.Iterator r1 = r44.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0043
            r1.next()
            java.lang.String r0 = "onBeforeIntegrate"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0043:
            r0 = r39
            java.util.Set r0 = r0.A03
            r43 = r0
            java.util.Iterator r38 = r43.iterator()
        L_0x004d:
            boolean r0 = r38.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r14 = r38.next()
            X.1zP r14 = (X.C43191zP) r14
            boolean r37 = r14.A02()
            if (r37 == 0) goto L_0x0069
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0069
            r0 = r43
            r0.remove(r14)
            goto L_0x004d
        L_0x0069:
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r3 = r35 / r0
            if (r37 == 0) goto L_0x0077
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x0077
            goto L_0x004d
        L_0x0077:
            r1 = 4589276106681592316(0x3fb0624dd2f1a9fc, double:0.064)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            r1 = r3
        L_0x0081:
            double r10 = r14.A02
            double r10 = r10 + r1
            r14.A02 = r10
            X.1zR r0 = r14.A03
            double r8 = r0.A01
            double r15 = r0.A00
            X.1zQ r0 = r14.A07
            r42 = r0
            double r6 = r0.A00
            double r4 = r0.A01
            X.1zQ r0 = r14.A09
            r41 = r0
            double r12 = r0.A00
            double r2 = r0.A01
        L_0x009c:
            r33 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r0 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r0 < 0) goto L_0x0118
            double r10 = r10 - r33
            r14.A02 = r10
            int r0 = (r10 > r33 ? 1 : (r10 == r33 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b3
            X.1zQ r0 = r14.A08
            r0.A00 = r6
            r0.A01 = r4
        L_0x00b3:
            double r0 = r14.A00
            double r31 = r0 - r12
            double r31 = r31 * r8
            double r2 = r15 * r4
            double r31 = r31 - r2
            double r12 = r4 * r33
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 * r17
            double r12 = r12 + r6
            double r2 = r31 * r33
            double r2 = r2 * r17
            double r27 = r4 + r2
            double r25 = r0 - r12
            double r25 = r25 * r8
            double r2 = r15 * r27
            double r25 = r25 - r2
            double r2 = r27 * r33
            double r2 = r2 * r17
            double r12 = r6 + r2
            double r2 = r25 * r33
            double r2 = r2 * r17
            double r19 = r4 + r2
            double r23 = r0 - r12
            double r23 = r23 * r8
            double r2 = r15 * r19
            double r23 = r23 - r2
            double r2 = r19 * r33
            double r12 = r6 + r2
            double r17 = r23 * r33
            double r2 = r4 + r17
            double r0 = r0 - r12
            double r0 = r0 * r8
            double r17 = r15 * r2
            double r0 = r0 - r17
            double r27 = r27 + r19
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r27 = r27 * r21
            double r19 = r4 + r27
            double r19 = r19 + r2
            r17 = 4595172819793696085(0x3fc5555555555555, double:0.16666666666666666)
            double r19 = r19 * r17
            double r25 = r25 + r23
            double r25 = r25 * r21
            double r31 = r31 + r25
            double r31 = r31 + r0
            double r31 = r31 * r17
            double r19 = r19 * r33
            double r6 = r6 + r19
            double r31 = r31 * r33
            double r4 = r4 + r31
            goto L_0x009c
        L_0x0118:
            r0 = r41
            r0.A00 = r12
            r0.A01 = r2
            r0 = r42
            r0.A00 = r6
            r0.A01 = r4
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0143
            double r10 = r10 / r33
            double r6 = r6 * r10
            X.1zQ r12 = r14.A08
            double r2 = r12.A00
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r10
            double r2 = r2 * r15
            double r6 = r6 + r2
            r2 = r42
            r2.A00 = r6
            double r4 = r4 * r10
            double r2 = r12.A01
            double r2 = r2 * r15
            double r4 = r4 + r2
            r2 = r42
            r2.A01 = r4
        L_0x0143:
            boolean r2 = r14.A02()
            r12 = 1
            if (r2 != 0) goto L_0x0166
            boolean r2 = r14.A05
            if (r2 == 0) goto L_0x0183
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0183
            double r10 = r14.A01
            double r2 = r14.A00
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 >= 0) goto L_0x015e
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x0166
        L_0x015e:
            int r13 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r13 <= 0) goto L_0x0183
            int r10 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r10 >= 0) goto L_0x0183
        L_0x0166:
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x01ab
            double r6 = r14.A00
            r14.A01 = r6
            r2 = r42
            r2.A00 = r6
        L_0x0172:
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0181
            r2 = r42
            r2.A01 = r0
            X.1zN r1 = r14.A0A
            java.lang.String r0 = r14.A0B
            r1.A02(r0)
        L_0x0181:
            r37 = 1
        L_0x0183:
            boolean r1 = r14.A06
            r0 = 0
            if (r1 == 0) goto L_0x018a
            r14.A06 = r0
        L_0x018a:
            if (r37 == 0) goto L_0x01a9
            r14.A06 = r12
        L_0x018e:
            java.util.concurrent.CopyOnWriteArraySet r0 = r14.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0194:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r0 = r1.next()
            X.1zF r0 = (X.C43091zF) r0
            r0.C65(r14)
            if (r12 == 0) goto L_0x0194
            r0.C64(r14)
            goto L_0x0194
        L_0x01a9:
            r12 = 0
            goto L_0x018e
        L_0x01ab:
            r14.A00 = r6
            r14.A01 = r6
            goto L_0x0172
        L_0x01b0:
            boolean r0 = r43.isEmpty()
            if (r0 == 0) goto L_0x01bb
            r1 = 1
            r0 = r39
            r0.A00 = r1
        L_0x01bb:
            java.util.Iterator r1 = r44.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01cf
            r1.next()
            java.lang.String r0 = "onAfterIntegrate"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01cf:
            r0 = r39
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x01e3
            r0 = r39
            X.1zO r2 = r0.A01
            r0 = 0
            r2.A02 = r0
            android.view.Choreographer r1 = r2.A04
            android.view.Choreographer$FrameCallback r0 = r2.A03
            r1.removeFrameCallback(r0)
        L_0x01e3:
            r1 = r29
            r0 = r40
            r0.A00 = r1
            android.view.Choreographer r1 = r0.A04
            android.view.Choreographer$FrameCallback r0 = r0.A03
            r1.postFrameCallback(r0)
            return
        L_0x01f1:
            return
        L_0x01f2:
            java.lang.Object r9 = r12.A01
            X.1tU r9 = (X.C39691tU) r9
            boolean r0 = r9.A03
            if (r0 != 0) goto L_0x0200
            android.view.Choreographer r0 = r9.A05
            r0.removeFrameCallback(r12)
            return
        L_0x0200:
            long r3 = r9.A00
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = r46
            if (r0 != 0) goto L_0x0214
            r9.A00 = r5
            r9.A01 = r5
        L_0x020e:
            android.view.Choreographer r0 = r9.A05
            r0.postFrameCallback(r12)
            return
        L_0x0214:
            long r0 = r9.A01
            long r3 = r46 - r0
            r9.A01 = r5
            X.1tT r2 = r9.A02
            double r0 = (double) r3
            X.1tS r8 = r2.A00
            double r6 = r8.A04
            double r0 = r0 / r6
            long r2 = java.lang.Math.round(r0)
            r0 = 1
            long r10 = java.lang.Math.max(r2, r0)
            long r2 = r10 - r0
            r0 = 100
            long r4 = java.lang.Math.min(r2, r0)
            double r2 = (double) r4
            double r0 = r8.A01
            double r0 = r0 + r2
            r8.A01 = r0
            r13 = 4
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0248
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r2 / r0
            double r0 = r8.A00
            double r0 = r0 + r2
            r8.A00 = r0
        L_0x0248:
            double r0 = (double) r10
            double r6 = r6 * r0
            long r0 = r8.A02
            double r2 = (double) r0
            double r2 = r2 + r6
            long r0 = (long) r2
            r8.A02 = r0
            goto L_0x020e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64652v7.doFrame(long):void");
    }
}
