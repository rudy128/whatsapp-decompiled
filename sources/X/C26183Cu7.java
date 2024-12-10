package X;

import android.graphics.Color;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.Cu7  reason: case insensitive filesystem */
public final class C26183Cu7 {
    public static final Comparator A05 = new DUR(2);
    public final List A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final E0K[] A04;

    public static void A01(int[] iArr, int i, int i2, int i3) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
        } else if (i == -1) {
            while (i2 <= i3) {
                int i5 = iArr[i2];
                iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
                i2++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x013a, code lost:
        if (r2 < r1) goto L_0x013c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26183Cu7(int[] r14, X.E0K[] r15) {
        /*
            r13 = this;
            r7 = 16
            r13.<init>()
            r0 = 3
            float[] r0 = new float[r0]
            r13.A01 = r0
            r13.A04 = r15
            r0 = 32768(0x8000, float:4.5918E-41)
            int[] r8 = new int[r0]
            r13.A03 = r8
            r3 = 0
            r6 = 0
        L_0x0015:
            int r0 = r14.length
            if (r6 >= r0) goto L_0x0041
            r2 = r14[r6]
            int r5 = android.graphics.Color.red(r2)
            r1 = 5
            r0 = 3
            int r5 = r5 >> r0
            r0 = 1
            int r1 = r0 << r1
            int r1 = r1 - r0
            r5 = r5 & r1
            int r4 = android.graphics.Color.green(r2)
            r0 = 3
            int r4 = r4 >> r0
            r4 = r4 & r1
            int r2 = android.graphics.Color.blue(r2)
            int r2 = r2 >> r0
            r2 = r2 & r1
            int r1 = r5 << 10
            int r0 = r4 << 5
            r1 = r1 | r0
            r2 = r2 | r1
            r14[r6] = r2
            X.BE6.A1R(r8, r2)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0041:
            r5 = 0
            r9 = 0
        L_0x0043:
            r0 = r8[r5]
            if (r0 <= 0) goto L_0x006e
            int r0 = r5 >> 10
            r2 = r0 & 31
            int r0 = r5 >> 5
            r1 = r0 & 31
            r0 = r5 & 31
            int r0 = A00(r2, r1, r0)
            float[] r4 = r13.A01
            int r2 = android.graphics.Color.red(r0)
            int r1 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            X.AnonymousClass1Z2.A07(r2, r1, r4, r0)
            boolean r0 = r13.A02(r4)
            if (r0 == 0) goto L_0x006e
            r8[r5] = r3
        L_0x006e:
            r0 = r8[r5]
            if (r0 <= 0) goto L_0x0074
            int r9 = r9 + 1
        L_0x0074:
            int r5 = r5 + 1
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r5 < r0) goto L_0x0043
            int[] r6 = new int[r9]
            r13.A02 = r6
            r2 = 0
            r1 = 0
        L_0x0081:
            r0 = r8[r2]
            if (r0 <= 0) goto L_0x008a
            int r0 = r1 + 1
            r6[r1] = r2
            r1 = r0
        L_0x008a:
            int r2 = r2 + 1
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r2 < r0) goto L_0x0081
            if (r9 > r7) goto L_0x00ba
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r13.A00 = r0
        L_0x0099:
            if (r3 >= r9) goto L_0x01a6
            r5 = r6[r3]
            java.util.List r4 = r13.A00
            int r0 = r5 >> 10
            r2 = r0 & 31
            int r0 = r5 >> 5
            r1 = r0 & 31
            r0 = r5 & 31
            int r2 = A00(r2, r1, r0)
            r1 = r8[r5]
            X.Cmn r0 = new X.Cmn
            r0.<init>(r2, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0099
        L_0x00ba:
            java.util.Comparator r0 = A05
            java.util.PriorityQueue r8 = new java.util.PriorityQueue
            r8.<init>(r7, r0)
            int[] r0 = r13.A02
            int r0 = r0.length
            int r1 = r0 + -1
            X.CXU r0 = new X.CXU
            r0.<init>(r13, r3, r1)
            r8.offer(r0)
        L_0x00ce:
            int r0 = r8.size()
            if (r0 >= r7) goto L_0x013e
            java.lang.Object r9 = r8.poll()
            X.CXU r9 = (X.CXU) r9
            if (r9 == 0) goto L_0x013e
            int r12 = r9.A08
            int r3 = r12 + 1
            int r11 = r9.A00
            int r1 = r3 - r11
            r0 = 1
            if (r1 <= r0) goto L_0x013e
            r10 = r11
            int r4 = r9.A03
            int r0 = r9.A06
            int r4 = r4 - r0
            int r2 = r9.A02
            int r0 = r9.A05
            int r2 = r2 - r0
            int r1 = r9.A01
            int r0 = r9.A04
            int r1 = r1 - r0
            if (r4 < r2) goto L_0x0137
            if (r4 < r1) goto L_0x0137
            r0 = -3
        L_0x00fc:
            X.Cu7 r6 = r9.A09
            int[] r5 = r6.A02
            int[] r4 = r6.A03
            A01(r5, r0, r11, r12)
            java.util.Arrays.sort(r5, r11, r3)
            int r3 = r9.A08
            A01(r5, r0, r11, r3)
            int r0 = r9.A07
            int r2 = r0 / 2
            r1 = 0
        L_0x0112:
            if (r11 > r3) goto L_0x0121
            r0 = r5[r11]
            r0 = r4[r0]
            int r1 = r1 + r0
            if (r1 < r2) goto L_0x0134
            int r0 = r3 + -1
            int r10 = java.lang.Math.min(r0, r11)
        L_0x0121:
            int r1 = r10 + 1
            X.CXU r0 = new X.CXU
            r0.<init>(r6, r1, r3)
            r9.A08 = r10
            r9.A00()
            r8.offer(r0)
            r8.offer(r9)
            goto L_0x00ce
        L_0x0134:
            int r11 = r11 + 1
            goto L_0x0112
        L_0x0137:
            if (r2 < r4) goto L_0x013c
            r0 = -2
            if (r2 >= r1) goto L_0x00fc
        L_0x013c:
            r0 = -1
            goto L_0x00fc
        L_0x013e:
            java.util.ArrayList r4 = X.C108975cc.A0g(r8)
            java.util.Iterator r12 = r8.iterator()
        L_0x0146:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r10 = r12.next()
            X.CXU r10 = (X.CXU) r10
            X.Cu7 r0 = r10.A09
            int[] r9 = r0.A02
            int[] r8 = r0.A03
            int r3 = r10.A00
            r2 = 0
            r5 = 0
            r7 = 0
            r6 = 0
        L_0x015e:
            int r0 = r10.A08
            if (r3 > r0) goto L_0x017a
            r11 = r9[r3]
            r1 = r8[r11]
            int r5 = r5 + r1
            int r0 = r11 >> 10
            r0 = r0 & 31
            int r0 = r0 * r1
            int r2 = r2 + r0
            int r0 = r11 >> 5
            r0 = r0 & 31
            int r0 = r0 * r1
            int r7 = r7 + r0
            r0 = r11 & 31
            int r1 = r1 * r0
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L_0x015e
        L_0x017a:
            float r0 = (float) r2
            float r3 = (float) r5
            float r0 = r0 / r3
            int r2 = java.lang.Math.round(r0)
            float r0 = (float) r7
            float r0 = r0 / r3
            int r1 = java.lang.Math.round(r0)
            float r0 = (float) r6
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            int r0 = A00(r2, r1, r0)
            X.Cmn r1 = new X.Cmn
            r1.<init>(r0, r5)
            float[] r0 = r1.A01()
            boolean r0 = r13.A02(r0)
            if (r0 != 0) goto L_0x0146
            r4.add(r1)
            goto L_0x0146
        L_0x01a4:
            r13.A00 = r4
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26183Cu7.<init>(int[], X.E0K[]):void");
    }

    public static int A00(int i, int i2, int i3) {
        int i4 = (1 << 8) - 1;
        return Color.rgb((i << 3) & i4, (i2 << 3) & i4, (i3 << 3) & i4);
    }

    private boolean A02(float[] fArr) {
        int length;
        E0K[] e0kArr = this.A04;
        if (e0kArr == null || (length = e0kArr.length) <= 0) {
            return false;
        }
        int i = 0;
        do {
            float f = fArr[2];
            if (f >= 0.95f || f <= 0.05f) {
                return true;
            }
            float f2 = fArr[0];
            if (f2 >= 10.0f && f2 <= 37.0f && fArr[1] <= 0.82f) {
                return true;
            }
            i++;
        } while (i < length);
        return false;
    }
}
