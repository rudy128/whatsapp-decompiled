package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.5kK  reason: invalid class name and case insensitive filesystem */
public final class C111725kK extends C113695nZ {
    public View A05(C38251qy r9) {
        int A05;
        C18070vi.A0d(r9, 0);
        int i = 1;
        if (r9.A1I()) {
            i = 0;
        }
        AnonymousClass28F r0 = new AnonymousClass28F(r9, i);
        int A04 = r0.A04() + (r0.A05() / 2);
        int A0J = r9.A0J();
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < A0J; i3++) {
            View A0P = r9.A0P(i3);
            if (A0P != null && (A05 = C108945cZ.A05(A01(A0P, r9) + (AnonymousClass6W2.A00(A0P, r9) / 2), A04)) < i2) {
                view = A0P;
                i2 = A05;
            }
        }
        return view;
    }

    public int[] A0A(View view, C38251qy r8) {
        AnonymousClass28F r0;
        int A17 = C18070vi.A17(r8, view);
        int A01 = A01(view, r8) + (AnonymousClass6W2.A00(view, r8) / 2);
        if (!r8.A1I()) {
            r0 = new AnonymousClass28F(r8, A17);
        }
        int A04 = r0.A04() + (r0.A05() / 2);
        boolean A1I = r8.A1I();
        int[] A1W = C108945cZ.A1W();
        if (A1I) {
            A1W[0] = A01 - A04;
            A1W[A17] = 0;
            return A1W;
        }
        A1W[0] = 0;
        A1W[A17] = A01 - A04;
        return A1W;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(X.C38251qy r17, int r18, int r19) {
        /*
            r16 = this;
            r8 = r18
            r7 = r19
            r4 = 0
            r5 = r17
            int r15 = r5.A0K()
            r14 = 0
            if (r15 <= 0) goto L_0x0030
            boolean r0 = r5 instanceof X.C38261qz
            if (r0 == 0) goto L_0x0030
            r1 = r5
            X.1qz r1 = (X.C38261qz) r1
            r3 = 1
            int r0 = r15 - r3
            android.graphics.PointF r2 = r1.BFT(r0)
            boolean r0 = r5.A1I()
            r1 = 0
            if (r0 == 0) goto L_0x0093
            if (r2 == 0) goto L_0x0030
            float r0 = r2.x
        L_0x0027:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x002c
            r3 = 0
        L_0x002c:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
        L_0x0030:
            r2 = r16
            android.view.View r0 = r2.A05(r5)
            r13 = 0
            if (r0 == 0) goto L_0x0044
            int r1 = X.C38251qy.A02(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0044
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
        L_0x0044:
            r6 = -1
            if (r14 == 0) goto L_0x00ef
            if (r13 == 0) goto L_0x00ef
            boolean r0 = r5.A1I()
            if (r0 == 0) goto L_0x0091
            r7 = 0
        L_0x0050:
            int[] r12 = r2.A09(r8, r7)
            int r11 = r5.A0J()
            r9 = 0
            r7 = 2147483647(0x7fffffff, float:NaN)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 0
            r8 = r9
        L_0x0060:
            if (r10 >= r11) goto L_0x0098
            android.view.View r2 = r5.A0P(r10)
            if (r2 == 0) goto L_0x008e
            int r0 = X.C38251qy.A02(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L_0x008e
            int r0 = r1.intValue()
            if (r0 == r6) goto L_0x008e
            int r0 = r1.intValue()
            if (r0 >= r7) goto L_0x0083
            int r7 = r1.intValue()
            r9 = r2
        L_0x0083:
            int r0 = r1.intValue()
            if (r0 <= r3) goto L_0x008e
            int r3 = r1.intValue()
            r8 = r2
        L_0x008e:
            int r10 = r10 + 1
            goto L_0x0060
        L_0x0091:
            r8 = 0
            goto L_0x0050
        L_0x0093:
            if (r2 == 0) goto L_0x0030
            float r0 = r2.y
            goto L_0x0027
        L_0x0098:
            if (r9 == 0) goto L_0x00ed
            if (r8 == 0) goto L_0x00ed
            int r1 = A01(r9, r5)
            int r0 = A01(r8, r5)
            int r2 = java.lang.Math.min(r1, r0)
            int r1 = A00(r9, r5)
            int r0 = A00(r8, r5)
            int r0 = java.lang.Math.max(r1, r0)
            int r0 = r0 - r2
            if (r0 <= 0) goto L_0x00ed
            float r5 = (float) r0
            int r3 = r3 - r7
            int r0 = r3 + 1
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            r3 = r12[r4]
            int r2 = java.lang.Math.abs(r3)
            r0 = 1
            r1 = r12[r0]
            int r0 = java.lang.Math.abs(r1)
            if (r2 > r0) goto L_0x00d2
            r3 = r1
        L_0x00d2:
            float r0 = (float) r3
            float r0 = r0 / r5
            int r2 = X.C22339B3q.A01(r0)
        L_0x00d8:
            boolean r0 = r14.booleanValue()
            if (r0 != 0) goto L_0x00df
            int r2 = -r2
        L_0x00df:
            if (r2 == 0) goto L_0x00ef
            int r1 = r13.intValue()
            int r1 = r1 + r2
            int r0 = r15 + -1
            int r6 = X.C28851b7.A03(r1, r4, r0)
            return r6
        L_0x00ed:
            r2 = 0
            goto L_0x00d8
        L_0x00ef:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111725kK.A04(X.1qy, int, int):int");
    }

    public static final int A00(View view, C38251qy r4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int bottom;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C38491rN) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i = 0;
        if (r4.A1I()) {
            bottom = view.getRight();
            if (marginLayoutParams != null) {
                i = marginLayoutParams.rightMargin;
            }
        } else {
            bottom = view.getBottom();
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
        }
        return bottom + i;
    }

    public static final int A01(View view, C38251qy r4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C38491rN) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i = 0;
        if (r4.A1I()) {
            top = view.getLeft();
            if (marginLayoutParams != null) {
                i = marginLayoutParams.leftMargin;
            }
        } else {
            top = view.getTop();
            if (marginLayoutParams != null) {
                i = marginLayoutParams.topMargin;
            }
        }
        return top - i;
    }
}
