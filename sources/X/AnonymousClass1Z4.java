package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.1Z4  reason: invalid class name */
public class AnonymousClass1Z4 {
    public final Path A00 = new Path();
    public final Path A01 = new Path();
    public final Path A02 = new Path();
    public final PointF A03 = new PointF();
    public final AnonymousClass1Z5 A04 = new AnonymousClass1Z5();
    public final float[] A05 = new float[2];
    public final float[] A06 = new float[2];
    public final Matrix[] A07 = new Matrix[4];
    public final Matrix[] A08 = new Matrix[4];
    public final AnonymousClass1Z5[] A09 = new AnonymousClass1Z5[4];
    public final Path A0A = new Path();

    private boolean A00(Path path, int i) {
        Path path2 = this.A0A;
        path2.reset();
        this.A09[i].A03(this.A07[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v39, types: [X.25V, X.25W, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0149 A[EDGE_INSN: B:76:0x0149->B:37:0x0149 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.Path r21, android.graphics.RectF r22, X.C28011Ym r23, X.AnonymousClass1Z6 r24, float r25) {
        /*
            r20 = this;
            r19 = r21
            r19.rewind()
            r6 = r20
            android.graphics.Path r0 = r6.A02
            r18 = r0
            r18.rewind()
            android.graphics.Path r0 = r6.A00
            r17 = r0
            r17.rewind()
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r8 = r22
            r0.addRect(r8, r1)
            r5 = 0
            r12 = 0
        L_0x001e:
            r7 = r23
            X.1Yn r1 = r7.A03
            r0 = 1
            if (r12 == r0) goto L_0x0145
            r0 = 2
            if (r12 == r0) goto L_0x013f
            r0 = 3
            if (r12 == r0) goto L_0x00fe
            X.1Yq r0 = r7.A07
        L_0x002d:
            X.1Z5[] r4 = r6.A09
            r11 = r4[r12]
            float r2 = r1.BPT(r8)
            boolean r0 = r0 instanceof X.C28061Yr
            r14 = 1119092736(0x42b40000, float:90.0)
            r16 = r25
            if (r0 == 0) goto L_0x010d
            float r3 = r2 * r25
            r1 = 1127481344(0x43340000, float:180.0)
            float r0 = r1 - r14
            r9 = 0
            r11.A02(r9, r3, r1, r0)
            r13 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r13
            float r2 = r2 * r25
            r10 = 1127481344(0x43340000, float:180.0)
            X.25W r1 = new X.25W
            r1.<init>()
            r1.A01 = r9
            r1.A05 = r9
            r1.A02 = r2
            r1.A00 = r2
            r1.A03 = r10
            r1.A04 = r14
            java.util.List r0 = r11.A06
            r0.add(r1)
            X.25X r3 = new X.25X
            r3.<init>(r1)
            float r1 = r10 + r14
            X.AnonymousClass1Z5.A00(r11, r10)
            java.util.List r0 = r11.A07
            r0.add(r3)
            r11.A00 = r1
            float r3 = r9 + r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r0
            float r2 = r2 - r9
            float r2 = r2 / r13
            double r0 = (double) r1
            double r13 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.cos(r13)
            float r9 = (float) r0
            float r0 = r2 * r9
            float r0 = r0 + r3
            r11.A02 = r0
            double r0 = java.lang.Math.sin(r13)
            float r9 = (float) r0
            float r2 = r2 * r9
            float r3 = r3 + r2
            r11.A03 = r3
        L_0x0094:
            int r1 = r12 + 1
            int r0 = r1 % 4
            int r0 = r0 * 90
            float r9 = (float) r0
            android.graphics.Matrix[] r11 = r6.A07
            r0 = r11[r12]
            r0.reset()
            android.graphics.PointF r10 = r6.A03
            r0 = 1
            if (r12 == r0) goto L_0x0108
            r0 = 2
            if (r12 == r0) goto L_0x0105
            r0 = 3
            if (r12 == r0) goto L_0x0102
            float r2 = r8.right
        L_0x00af:
            float r0 = r8.top
        L_0x00b1:
            r10.set(r2, r0)
            r3 = r11[r12]
            float r2 = r10.x
            float r0 = r10.y
            r3.setTranslate(r2, r0)
            r0 = r11[r12]
            r0.preRotate(r9)
            float[] r10 = r6.A05
            r2 = r4[r12]
            float r0 = r2.A02
            r10[r5] = r0
            float r0 = r2.A03
            r9 = 1
            r10[r9] = r0
            r0 = r11[r12]
            r0.mapPoints(r10)
            int r0 = r12 + 1
            int r0 = r0 % 4
            int r0 = r0 * 90
            float r13 = (float) r0
            android.graphics.Matrix[] r3 = r6.A08
            r0 = r3[r12]
            r0.reset()
            r14 = r3[r12]
            r2 = r10[r5]
            r0 = r10[r9]
            r14.setTranslate(r2, r0)
            r0 = r3[r12]
            r0.preRotate(r13)
            r12 = r1
            r0 = 4
            if (r1 >= r0) goto L_0x0149
            if (r1 == r9) goto L_0x0143
            r0 = 2
            if (r1 == r0) goto L_0x013d
            r0 = 3
            if (r1 != r0) goto L_0x001e
            X.1Yn r1 = r7.A02
        L_0x00fe:
            X.1Yq r0 = r7.A06
            goto L_0x002d
        L_0x0102:
            float r2 = r8.left
            goto L_0x00af
        L_0x0105:
            float r2 = r8.left
            goto L_0x010a
        L_0x0108:
            float r2 = r8.right
        L_0x010a:
            float r0 = r8.bottom
            goto L_0x00b1
        L_0x010d:
            float r9 = r2 * r25
            r3 = 1127481344(0x43340000, float:180.0)
            float r1 = r3 - r14
            r0 = 0
            r11.A02(r0, r9, r3, r1)
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r9 = (double) r2
            double r0 = r0 * r9
            r2 = r16
            double r2 = (double) r2
            double r0 = r0 * r2
            float r13 = (float) r0
            float r14 = r14 - r14
            double r0 = (double) r14
            double r0 = java.lang.Math.toRadians(r0)
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r9
            double r0 = r0 * r2
            float r2 = (float) r0
            r11.A01(r13, r2)
            goto L_0x0094
        L_0x013d:
            X.1Yn r1 = r7.A00
        L_0x013f:
            X.1Yq r0 = r7.A04
            goto L_0x002d
        L_0x0143:
            X.1Yn r1 = r7.A01
        L_0x0145:
            X.1Yq r0 = r7.A05
            goto L_0x002d
        L_0x0149:
            r2 = r4[r5]
            float r0 = r2.A04
            r1 = 0
            r10[r1] = r0
            float r0 = r2.A05
            r10[r9] = r0
            r0 = r11[r5]
            r0.mapPoints(r10)
            r2 = r10[r1]
            r1 = r10[r9]
            r0 = r19
            if (r5 != 0) goto L_0x02b1
            r0.moveTo(r2, r1)
        L_0x0164:
            r2 = r4[r5]
            r1 = r11[r5]
            r2.A03(r1, r0)
            if (r24 == 0) goto L_0x0199
            r13 = r4[r5]
            r1 = r11[r5]
            r0 = r24
            X.1Z7 r0 = (X.AnonymousClass1Z7) r0
            X.1Xq r12 = r0.A00
            android.graphics.Paint r0 = X.C27801Xq.A0N
            java.util.BitSet r2 = r12.A0G
            r0 = 0
            r2.set(r5, r0)
            X.1Z0[] r12 = r12.A0H
            float r0 = r13.A01
            X.AnonymousClass1Z5.A00(r13, r0)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            java.util.List r0 = r13.A07
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.25a r0 = new X.25a
            r0.<init>(r2, r13, r1)
            r12[r5] = r0
        L_0x0199:
            int r0 = r5 + 1
            int r12 = r0 % 4
            r1 = r4[r5]
            float r0 = r1.A02
            r2 = 0
            r10[r2] = r0
            float r0 = r1.A03
            r10[r9] = r0
            r0 = r11[r5]
            r0.mapPoints(r10)
            float[] r0 = r6.A06
            r13 = r4[r12]
            float r1 = r13.A04
            r0[r2] = r1
            float r1 = r13.A05
            r0[r9] = r1
            r1 = r11[r12]
            r1.mapPoints(r0)
            r13 = r10[r2]
            r1 = r0[r2]
            float r13 = r13 - r1
            double r13 = (double) r13
            r1 = r10[r9]
            r0 = r0[r9]
            float r1 = r1 - r0
            double r0 = (double) r1
            double r0 = java.lang.Math.hypot(r13, r0)
            float r14 = (float) r0
            r0 = 981668463(0x3a83126f, float:0.001)
            float r14 = r14 - r0
            r13 = 0
            float r15 = java.lang.Math.max(r14, r13)
            r1 = r4[r5]
            float r0 = r1.A02
            r10[r2] = r0
            float r0 = r1.A03
            r10[r9] = r0
            r0 = r11[r5]
            r0.mapPoints(r10)
            if (r5 == r9) goto L_0x02a4
            r0 = 3
            if (r5 == r0) goto L_0x02a4
            float r1 = r8.centerY()
            r0 = r10[r9]
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
        L_0x01f7:
            X.1Z5 r14 = r6.A04
            r0 = 1132920832(0x43870000, float:270.0)
            r14.A02(r13, r13, r0, r13)
            if (r5 == r9) goto L_0x02a0
            r0 = 2
            if (r5 == r0) goto L_0x029c
            r0 = 3
            if (r5 == r0) goto L_0x0298
            X.1Yt r13 = r7.A0A
        L_0x0208:
            r0 = r16
            r13.A00(r14, r15, r1, r0)
            android.graphics.Path r1 = r6.A01
            r1.reset()
            r0 = r3[r5]
            r14.A03(r0, r1)
            boolean r0 = r13.A01()
            if (r0 != 0) goto L_0x0278
            boolean r0 = r6.A00(r1, r5)
            if (r0 != 0) goto L_0x0278
            boolean r0 = r6.A00(r1, r12)
            if (r0 != 0) goto L_0x0278
            r0 = r3[r5]
            r1 = r19
        L_0x022d:
            r14.A03(r0, r1)
            if (r24 == 0) goto L_0x025d
            r1 = r3[r5]
            r0 = r24
            X.1Z7 r0 = (X.AnonymousClass1Z7) r0
            X.1Xq r13 = r0.A00
            android.graphics.Paint r0 = X.C27801Xq.A0N
            java.util.BitSet r12 = r13.A0G
            int r0 = r5 + 4
            r12.set(r0, r2)
            X.1Z0[] r12 = r13.A0I
            float r0 = r14.A01
            X.AnonymousClass1Z5.A00(r14, r0)
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r2.<init>(r1)
            java.util.List r0 = r14.A07
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            X.25a r0 = new X.25a
            r0.<init>(r2, r14, r1)
            r12[r5] = r0
        L_0x025d:
            int r5 = r5 + 1
            r0 = 4
            if (r5 < r0) goto L_0x0149
            r19.close()
            r18.close()
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x0277
            android.graphics.Path$Op r2 = android.graphics.Path.Op.UNION
            r1 = r19
            r0 = r18
            r1.op(r0, r2)
        L_0x0277:
            return
        L_0x0278:
            android.graphics.Path$Op r12 = android.graphics.Path.Op.DIFFERENCE
            r0 = r17
            r1.op(r1, r0, r12)
            float r0 = r14.A04
            r10[r2] = r0
            float r0 = r14.A05
            r10[r9] = r0
            r0 = r3[r5]
            r0.mapPoints(r10)
            r13 = r10[r2]
            r12 = r10[r9]
            r1 = r18
            r1.moveTo(r13, r12)
            r0 = r3[r5]
            goto L_0x022d
        L_0x0298:
            X.1Yt r13 = r7.A0B
            goto L_0x0208
        L_0x029c:
            X.1Yt r13 = r7.A09
            goto L_0x0208
        L_0x02a0:
            X.1Yt r13 = r7.A08
            goto L_0x0208
        L_0x02a4:
            float r1 = r8.centerX()
            r0 = r10[r2]
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            goto L_0x01f7
        L_0x02b1:
            r0.lineTo(r2, r1)
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Z4.A01(android.graphics.Path, android.graphics.RectF, X.1Ym, X.1Z6, float):void");
    }

    public AnonymousClass1Z4() {
        int i = 0;
        do {
            this.A09[i] = new AnonymousClass1Z5();
            this.A07[i] = new Matrix();
            this.A08[i] = new Matrix();
            i++;
        } while (i < 4);
    }
}
