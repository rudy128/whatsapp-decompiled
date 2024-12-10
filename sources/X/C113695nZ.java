package X;

import android.view.View;

/* renamed from: X.5nZ  reason: invalid class name and case insensitive filesystem */
public abstract class C113695nZ extends BM9 {
    public C38331r7 A00;
    public C38331r7 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r3 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(X.C38251qy r11, int r12, int r13) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C38261qz
            r6 = -1
            if (r0 == 0) goto L_0x007a
            int r5 = r11.A0K()
            if (r5 == 0) goto L_0x007a
            android.view.View r0 = r10.A05(r11)
            if (r0 == 0) goto L_0x007a
            int r4 = X.C38251qy.A02(r0)
            if (r4 == r6) goto L_0x007a
            r0 = r11
            X.1qz r0 = (X.C38261qz) r0
            int r3 = r5 + -1
            android.graphics.PointF r8 = r0.BFT(r3)
            if (r8 == 0) goto L_0x007a
            boolean r0 = r11.A1I()
            r9 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0077
            X.1r7 r1 = r10.A00
            if (r1 == 0) goto L_0x0032
            X.1qy r0 = r1.A02
            if (r0 == r11) goto L_0x0039
        L_0x0032:
            X.28F r1 = new X.28F
            r1.<init>(r11, r2)
            r10.A00 = r1
        L_0x0039:
            int r7 = r10.A02(r1, r11, r12, r2)
            float r0 = r8.x
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0044
            int r7 = -r7
        L_0x0044:
            boolean r0 = r11.A1J()
            if (r0 == 0) goto L_0x0075
            X.1r7 r1 = r10.A01
            if (r1 == 0) goto L_0x0052
            X.1qy r0 = r1.A02
            if (r0 == r11) goto L_0x005a
        L_0x0052:
            r0 = 1
            X.28F r1 = new X.28F
            r1.<init>(r11, r0)
            r10.A01 = r1
        L_0x005a:
            int r1 = r10.A02(r1, r11, r2, r13)
            float r0 = r8.y
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            int r1 = -r1
        L_0x0065:
            boolean r0 = r11.A1J()
            if (r0 == 0) goto L_0x006c
            r7 = r1
        L_0x006c:
            if (r7 == 0) goto L_0x007a
            int r4 = r4 + r7
            if (r4 < 0) goto L_0x0072
            r2 = r4
        L_0x0072:
            if (r2 < r5) goto L_0x0079
            return r3
        L_0x0075:
            r1 = 0
            goto L_0x0065
        L_0x0077:
            r7 = 0
            goto L_0x0044
        L_0x0079:
            return r2
        L_0x007a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113695nZ.A04(X.1qy, int, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A02(X.C38331r7 r12, X.C38251qy r13, int r14, int r15) {
        /*
            r11 = this;
            int[] r10 = r11.A09(r14, r15)
            int r9 = r13.A0J()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L_0x0053
            r7 = 0
            r4 = r7
            r6 = 2147483647(0x7fffffff, float:NaN)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
        L_0x0014:
            if (r3 >= r9) goto L_0x002c
            android.view.View r2 = r13.A0P(r3)
            int r1 = X.C38251qy.A02(r2)
            r0 = -1
            if (r1 == r0) goto L_0x0029
            if (r1 >= r6) goto L_0x0025
            r7 = r2
            r6 = r1
        L_0x0025:
            if (r1 <= r5) goto L_0x0029
            r4 = r2
            r5 = r1
        L_0x0029:
            int r3 = r3 + 1
            goto L_0x0014
        L_0x002c:
            if (r7 == 0) goto L_0x0053
            if (r4 == 0) goto L_0x0053
            int r1 = r12.A09(r7)
            int r0 = r12.A09(r4)
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = r12.A06(r7)
            int r0 = r12.A06(r4)
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 - r2
            if (r0 == 0) goto L_0x0053
            float r4 = (float) r0
            float r4 = r4 * r8
            int r5 = r5 - r6
            int r0 = r5 + 1
            float r0 = (float) r0
            float r4 = r4 / r0
            goto L_0x0055
        L_0x0053:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0055:
            r0 = 0
            r1 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            return r1
        L_0x005c:
            r3 = r10[r1]
            int r2 = java.lang.Math.abs(r3)
            r0 = 1
            r1 = r10[r0]
            int r0 = java.lang.Math.abs(r1)
            if (r2 > r0) goto L_0x006c
            r3 = r1
        L_0x006c:
            float r0 = (float) r3
            float r0 = r0 / r4
            int r0 = java.lang.Math.round(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113695nZ.A02(X.1r7, X.1qy, int, int):int");
    }

    public View A05(C38251qy r10) {
        C38331r7 r7;
        if (r10.A1J()) {
            r7 = this.A01;
            if (r7 == null || r7.A02 != r10) {
                r7 = new AnonymousClass28F(r10, 1);
                this.A01 = r7;
            }
        } else if (!r10.A1I()) {
            return null;
        } else {
            r7 = this.A00;
            if (r7 == null || r7.A02 != r10) {
                r7 = new AnonymousClass28F(r10, 0);
                this.A00 = r7;
            }
        }
        int A0J = r10.A0J();
        View view = null;
        if (A0J == 0) {
            return null;
        }
        int A04 = r7.A04() + (r7.A05() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0J; i2++) {
            View A0P = r10.A0P(i2);
            int A05 = C108945cZ.A05(r7.A09(A0P) + (r7.A07(A0P) / 2), A04);
            if (A05 < i) {
                view = A0P;
                i = A05;
            }
        }
        return view;
    }

    public int[] A0A(View view, C38251qy r7) {
        int[] A1W = C108945cZ.A1W();
        if (r7.A1I()) {
            C38331r7 r1 = this.A00;
            if (r1 == null || r1.A02 != r7) {
                r1 = new AnonymousClass28F(r7, 0);
                this.A00 = r1;
            }
            A1W[0] = C109005cf.A02(view, r1);
        } else {
            A1W[0] = 0;
        }
        if (r7.A1J()) {
            C38331r7 r12 = this.A01;
            if (r12 == null || r12.A02 != r7) {
                r12 = new AnonymousClass28F(r7, 1);
                this.A01 = r12;
            }
            A1W[1] = C109005cf.A02(view, r12);
            return A1W;
        }
        A1W[1] = 0;
        return A1W;
    }
}
