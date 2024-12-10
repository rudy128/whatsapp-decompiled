package androidx.recyclerview.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass28N;
import X.C25476CgV;
import X.C26228CvK;
import X.C37931qQ;
import X.C38021qZ;
import X.C38191qq;
import X.C38251qy;
import X.C38491rN;
import X.C58342kX;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

public class GridLayoutManager extends LinearLayoutManager {
    public int A00 = -1;
    public C58342kX A01 = new C58342kX();
    public boolean A02 = false;
    public int[] A03;
    public View[] A04;
    public final Rect A05 = new Rect();
    public final SparseIntArray A06 = new SparseIntArray();
    public final SparseIntArray A07 = new SparseIntArray();

    public static int A09(GridLayoutManager gridLayoutManager, C37931qQ r4, C38021qZ r5, int i) {
        if (!r5.A08) {
            return gridLayoutManager.A01.A01(i, gridLayoutManager.A00);
        }
        int i2 = gridLayoutManager.A06.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A012 = r4.A01(i);
        if (A012 != -1) {
            return gridLayoutManager.A01.A01(A012, gridLayoutManager.A00);
        }
        Log.w("GridLayoutManager", AnonymousClass001.A1I("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", AnonymousClass000.A10(), i));
        return 0;
    }

    private int A0A(C37931qQ r9, C38021qZ r10, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!r10.A08) {
            C58342kX r2 = this.A01;
            i2 = this.A00;
            i3 = 0;
            i4 = 0;
            i5 = r2.A00(i);
            for (int i6 = 0; i6 < i; i6++) {
                int A002 = r2.A00(i6);
                i4 += A002;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = A002;
                }
            }
        } else {
            int A012 = r9.A01(i);
            if (A012 == -1) {
                Log.w("GridLayoutManager", AnonymousClass001.A1I("Cannot find span size for pre layout position. ", AnonymousClass000.A10(), i));
                return 0;
            }
            C58342kX r22 = this.A01;
            i2 = this.A00;
            i3 = 0;
            int i7 = 0;
            i5 = r22.A00(A012);
            for (int i8 = 0; i8 < A012; i8++) {
                int A003 = r22.A00(i8);
                i7 = i4 + A003;
                if (i7 == i2) {
                    i3++;
                    i7 = 0;
                } else if (i7 > i2) {
                    i3++;
                    i7 = A003;
                }
            }
        }
        if (i4 + i5 > i2) {
            return i3 + 1;
        }
        return i3;
    }

    private int A0B(C37931qQ r3, C38021qZ r4, int i) {
        if (!r4.A08) {
            return this.A01.A00(i);
        }
        int i2 = this.A07.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A012 = r3.A01(i);
        if (A012 != -1) {
            return this.A01.A00(A012);
        }
        Log.w("GridLayoutManager", AnonymousClass001.A1I("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", AnonymousClass000.A10(), i));
        return 1;
    }

    private void A0E(int i) {
        int i2;
        int length;
        int[] iArr = this.A03;
        int i3 = this.A00;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A03 = iArr;
    }

    public static void A0G(GridLayoutManager gridLayoutManager) {
        View[] viewArr = gridLayoutManager.A04;
        if (viewArr == null || viewArr.length != gridLayoutManager.A00) {
            gridLayoutManager.A04 = new View[gridLayoutManager.A00];
        }
    }

    public static void A0H(GridLayoutManager gridLayoutManager) {
        int A0L;
        int A0O;
        if (gridLayoutManager.A01 == 1) {
            A0L = gridLayoutManager.A03 - gridLayoutManager.A0N();
            A0O = gridLayoutManager.A0M();
        } else {
            A0L = gridLayoutManager.A00 - gridLayoutManager.A0L();
            A0O = gridLayoutManager.A0O();
        }
        gridLayoutManager.A0E(A0L - A0O);
    }

    public int A0k(C37931qQ r3, C38021qZ r4) {
        if (this.A01 == 1) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A0A(r3, r4, A002 - 1) + 1;
    }

    public int A0l(C37931qQ r3, C38021qZ r4) {
        if (this.A01 == 0) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A0A(r3, r4, A002 - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (A1f() == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0v(android.view.View r25, X.C37931qQ r26, X.C38021qZ r27, int r28) {
        /*
            r24 = this;
            r8 = r24
            androidx.recyclerview.widget.RecyclerView r0 = r8.A07
            r21 = 0
            r3 = r25
            if (r0 == 0) goto L_0x001a
            android.view.View r7 = r0.A0N(r3)
            if (r7 == 0) goto L_0x001a
            X.1qm r0 = r8.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r7 = r21
        L_0x001c:
            r20 = 0
            if (r7 == 0) goto L_0x008a
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            X.28N r0 = (X.AnonymousClass28N) r0
            int r6 = r0.A00
            int r0 = r0.A01
            int r5 = r6 + r0
            r23 = r26
            r22 = r27
            r2 = r28
            r1 = r23
            r0 = r22
            android.view.View r0 = super.A0v(r3, r1, r0, r2)
            if (r0 == 0) goto L_0x008a
            int r0 = r8.A1R(r2)
            r2 = 1
            boolean r1 = X.AnonymousClass000.A1T(r0, r2)
            boolean r0 = r8.A0A
            int r10 = r8.A0J()
            if (r1 == r0) goto L_0x0111
            int r10 = r10 - r2
            r19 = -1
            r18 = -1
        L_0x0052:
            int r0 = r8.A01
            if (r0 != r2) goto L_0x005e
            boolean r0 = r8.A1f()
            r17 = 1
            if (r0 != 0) goto L_0x0060
        L_0x005e:
            r17 = 0
        L_0x0060:
            r1 = r23
            r0 = r22
            int r16 = r8.A0A(r1, r0, r10)
            r3 = 0
            r4 = -1
            r12 = -1
            r2 = 0
        L_0x006c:
            r0 = r19
            if (r10 == r0) goto L_0x010e
            r1 = r23
            r0 = r22
            int r1 = r8.A0A(r1, r0, r10)
            android.view.View r14 = r8.A0P(r10)
            if (r14 == r7) goto L_0x010e
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x008b
            r0 = r16
            if (r1 == r0) goto L_0x008b
            if (r20 == 0) goto L_0x00c5
        L_0x008a:
            return r20
        L_0x008b:
            android.view.ViewGroup$LayoutParams r13 = r14.getLayoutParams()
            X.28N r13 = (X.AnonymousClass28N) r13
            int r11 = r13.A00
            int r0 = r13.A01
            int r9 = r11 + r0
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00a2
            if (r11 != r6) goto L_0x00a2
            if (r9 != r5) goto L_0x00a2
            return r14
        L_0x00a2:
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00aa
            if (r20 == 0) goto L_0x00b2
        L_0x00aa:
            boolean r0 = r14.hasFocusable()
            if (r0 != 0) goto L_0x00d6
            if (r21 != 0) goto L_0x00d6
        L_0x00b2:
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00c8
            int r4 = r13.A00
            int r3 = java.lang.Math.min(r9, r5)
            int r0 = java.lang.Math.max(r11, r6)
            int r3 = r3 - r0
            r20 = r14
        L_0x00c5:
            int r10 = r10 + r18
            goto L_0x006c
        L_0x00c8:
            int r12 = r13.A00
            int r2 = java.lang.Math.min(r9, r5)
            int r0 = java.lang.Math.max(r11, r6)
            int r2 = r2 - r0
            r21 = r14
            goto L_0x00c5
        L_0x00d6:
            int r0 = java.lang.Math.max(r11, r6)
            int r15 = java.lang.Math.min(r9, r5)
            int r15 = r15 - r0
            boolean r0 = r14.hasFocusable()
            if (r0 == 0) goto L_0x00f2
            if (r15 > r3) goto L_0x00b2
            if (r15 != r3) goto L_0x00c5
            r1 = 0
            if (r11 <= r4) goto L_0x00ed
            r1 = 1
        L_0x00ed:
            r0 = r17
            if (r0 != r1) goto L_0x00c5
            goto L_0x00b2
        L_0x00f2:
            if (r20 != 0) goto L_0x00c5
            r1 = 1
            X.1r3 r0 = r8.A08
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0106
            X.1r3 r0 = r8.A09
            boolean r0 = r0.A01(r14)
            if (r0 == 0) goto L_0x0106
            goto L_0x00c5
        L_0x0106:
            if (r15 > r2) goto L_0x00b2
            if (r15 != r2) goto L_0x00c5
            if (r11 > r12) goto L_0x00ed
            r1 = 0
            goto L_0x00ed
        L_0x010e:
            if (r20 != 0) goto L_0x008a
            return r21
        L_0x0111:
            r19 = r10
            r10 = 0
            r18 = 1
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0v(android.view.View, X.1qQ, X.1qZ, int):android.view.View");
    }

    public void A18(Rect rect, int i, int i2) {
        int A002;
        int A003;
        if (this.A03 == null) {
            super.A18(rect, i, i2);
        }
        int A0M = A0M() + A0N();
        int A0O = A0O() + A0L();
        if (this.A01 == 1) {
            A003 = C38251qy.A00(i2, rect.height() + A0O, this.A07.getMinimumHeight());
            int[] iArr = this.A03;
            A002 = C38251qy.A00(i, iArr[iArr.length - 1] + A0M, this.A07.getMinimumWidth());
        } else {
            A002 = C38251qy.A00(i, rect.width() + A0M, this.A07.getMinimumWidth());
            int[] iArr2 = this.A03;
            A003 = C38251qy.A00(i2, iArr2[iArr2.length - 1] + A0O, this.A07.getMinimumHeight());
        }
        this.A07.setMeasuredDimension(A002, A003);
    }

    public void A1D(C37931qQ r7, C38021qZ r8) {
        if (r8.A08) {
            int A0J = A0J();
            for (int i = 0; i < A0J; i++) {
                AnonymousClass28N r3 = (AnonymousClass28N) A0P(i).getLayoutParams();
                int A002 = r3.A00();
                this.A07.put(A002, r3.A01);
                this.A06.put(A002, r3.A00);
            }
        }
        super.A1D(r7, r8);
        this.A07.clear();
        this.A06.clear();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ad  */
    public void A1b(X.C38321r6 r19, X.C41991xR r20, X.C37931qQ r21, X.C38021qZ r22) {
        /*
            r18 = this;
            r4 = r18
            X.1r7 r1 = r4.A06
            X.28F r1 = (X.AnonymousClass28F) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0072;
                case 1: goto L_0x006d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r10 = 0
        L_0x000c:
            r6 = 1
            r2 = 0
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r17 = X.AnonymousClass000.A1S(r10, r0)
            int r0 = r4.A0J()
            if (r0 <= 0) goto L_0x006b
            int[] r1 = r4.A03
            int r0 = r4.A00
            r9 = r1[r0]
        L_0x0020:
            if (r17 == 0) goto L_0x0025
            A0H(r4)
        L_0x0025:
            r3 = r20
            int r0 = r3.A03
            boolean r16 = X.AnonymousClass000.A1T(r0, r6)
            int r14 = r4.A00
            r12 = r21
            r11 = r22
            if (r16 != 0) goto L_0x0042
            int r0 = r3.A01
            int r14 = A09(r4, r12, r11, r0)
            int r0 = r3.A01
            int r0 = r4.A0B(r12, r11, r0)
            int r14 = r14 + r0
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r0 = r4.A00
            if (r5 >= r0) goto L_0x009a
            int r13 = r3.A01
            if (r13 < 0) goto L_0x009a
            int r0 = r11.A00()
            if (r13 >= r0) goto L_0x009a
            if (r14 <= 0) goto L_0x009a
            int r8 = r4.A0B(r12, r11, r13)
            int r7 = r4.A00
            if (r8 > r7) goto L_0x0077
            int r14 = r14 - r8
            if (r14 < 0) goto L_0x009a
            android.view.View r1 = r3.A00(r12)
            if (r1 == 0) goto L_0x009a
            android.view.View[] r0 = r4.A04
            r0[r5] = r1
            int r5 = r5 + 1
            goto L_0x0043
        L_0x006b:
            r9 = 0
            goto L_0x0020
        L_0x006d:
            X.1qy r0 = r1.A02
            int r10 = r0.A04
            goto L_0x000c
        L_0x0072:
            X.1qy r0 = r1.A02
            int r10 = r0.A01
            goto L_0x000c
        L_0x0077:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Item at position "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " requires "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " spans but GridLayoutManager has only "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " spans."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        L_0x009a:
            r8 = r19
            if (r5 != 0) goto L_0x00a1
            r8.A01 = r6
            return
        L_0x00a1:
            r14 = r5
            r13 = 0
            r7 = 0
            r15 = 1
            if (r16 != 0) goto L_0x00fc
            int r7 = r5 + -1
            r14 = -1
            r15 = -1
        L_0x00ab:
            if (r7 != r14) goto L_0x00fc
            r13 = 0
            r11 = 0
            r7 = 0
        L_0x00b0:
            if (r11 >= r5) goto L_0x0115
            android.view.View[] r0 = r4.A04
            r1 = r0[r11]
            java.util.List r0 = r3.A09
            if (r0 != 0) goto L_0x00f1
            if (r16 == 0) goto L_0x00ed
            r0 = -1
            X.C38251qy.A04(r1, r4, r0, r2)
        L_0x00c0:
            android.graphics.Rect r0 = r4.A05
            r4.A0X(r1, r0)
            r4.A0F(r1, r10, r2)
            X.1r7 r0 = r4.A06
            int r0 = r0.A07(r1)
            if (r0 <= r7) goto L_0x00d1
            r7 = r0
        L_0x00d1:
            android.view.ViewGroup$LayoutParams r12 = r1.getLayoutParams()
            X.28N r12 = (X.AnonymousClass28N) r12
            X.1r7 r0 = r4.A06
            int r0 = r0.A08(r1)
            float r1 = (float) r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r0
            int r0 = r12.A01
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ea
            r13 = r1
        L_0x00ea:
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x00ed:
            X.C38251qy.A04(r1, r4, r2, r2)
            goto L_0x00c0
        L_0x00f1:
            if (r16 == 0) goto L_0x00f8
            r0 = -1
            X.C38251qy.A04(r1, r4, r0, r6)
            goto L_0x00c0
        L_0x00f8:
            X.C38251qy.A04(r1, r4, r2, r6)
            goto L_0x00c0
        L_0x00fc:
            android.view.View[] r0 = r4.A04
            r0 = r0[r7]
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.28N r1 = (X.AnonymousClass28N) r1
            int r0 = X.C38251qy.A02(r0)
            int r0 = r4.A0B(r12, r11, r0)
            r1.A01 = r0
            r1.A00 = r13
            int r13 = r13 + r0
            int r7 = r7 + r15
            goto L_0x00ab
        L_0x0115:
            if (r17 == 0) goto L_0x013f
            int r0 = r4.A00
            float r0 = (float) r0
            float r13 = r13 * r0
            int r0 = java.lang.Math.round(r13)
            int r0 = java.lang.Math.max(r0, r9)
            r4.A0E(r0)
            r9 = 0
            r7 = 0
        L_0x0128:
            if (r9 >= r5) goto L_0x013f
            android.view.View[] r0 = r4.A04
            r1 = r0[r9]
            r0 = 1073741824(0x40000000, float:2.0)
            r4.A0F(r1, r0, r6)
            X.1r7 r0 = r4.A06
            int r0 = r0.A07(r1)
            if (r0 <= r7) goto L_0x013c
            r7 = r0
        L_0x013c:
            int r9 = r9 + 1
            goto L_0x0128
        L_0x013f:
            r9 = 0
        L_0x0140:
            if (r9 >= r5) goto L_0x01d5
            android.view.View[] r0 = r4.A04
            r16 = r0[r9]
            X.1r7 r1 = r4.A06
            r0 = r16
            int r0 = r1.A07(r0)
            if (r0 == r7) goto L_0x01ba
            android.view.ViewGroup$LayoutParams r13 = r16.getLayoutParams()
            X.28N r13 = (X.AnonymousClass28N) r13
            android.graphics.Rect r1 = r13.A03
            int r12 = r1.top
            int r0 = r1.bottom
            int r12 = r12 + r0
            int r0 = r13.topMargin
            int r12 = r12 + r0
            int r0 = r13.bottomMargin
            int r12 = r12 + r0
            int r10 = r1.left
            int r0 = r1.right
            int r10 = r10 + r0
            int r0 = r13.leftMargin
            int r10 = r10 + r0
            int r0 = r13.rightMargin
            int r10 = r10 + r0
            int r14 = r13.A00
            int r1 = r13.A01
            int r0 = r4.A01
            if (r0 != r6) goto L_0x01cc
            boolean r0 = r4.A1f()
            if (r0 == 0) goto L_0x01cc
            int[] r15 = r4.A03
            int r0 = r4.A00
            int r0 = r0 - r14
            r11 = r15[r0]
            int r0 = r0 - r1
            r0 = r15[r0]
            int r11 = r11 - r0
        L_0x0187:
            int r0 = r4.A01
            if (r0 != r6) goto L_0x01bd
            int r0 = r13.width
            r1 = 1073741824(0x40000000, float:2.0)
            int r10 = X.C38251qy.A01(r11, r1, r10, r0, r2)
            int r0 = r7 - r12
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
        L_0x0199:
            android.view.ViewGroup$LayoutParams r12 = r16.getLayoutParams()
            int r1 = r16.getMeasuredWidth()
            int r0 = r12.width
            boolean r0 = X.C38251qy.A05(r1, r10, r0)
            if (r0 == 0) goto L_0x01b5
            int r1 = r16.getMeasuredHeight()
            int r0 = r12.height
            boolean r0 = X.C38251qy.A05(r1, r11, r0)
            if (r0 != 0) goto L_0x01ba
        L_0x01b5:
            r0 = r16
            r0.measure(r10, r11)
        L_0x01ba:
            int r9 = r9 + 1
            goto L_0x0140
        L_0x01bd:
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = r7 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            int r0 = r13.height
            int r11 = X.C38251qy.A01(r11, r1, r12, r0, r2)
            goto L_0x0199
        L_0x01cc:
            int[] r0 = r4.A03
            int r1 = r1 + r14
            r11 = r0[r1]
            r0 = r0[r14]
            int r11 = r11 - r0
            goto L_0x0187
        L_0x01d5:
            r8.A00 = r7
            int r2 = r4.A01
            r1 = -1
            int r0 = r3.A05
            if (r2 != r6) goto L_0x0257
            if (r0 != r1) goto L_0x0252
            int r0 = r3.A07
            int r2 = r0 - r7
        L_0x01e4:
            r3 = 0
            r11 = 0
        L_0x01e6:
            r10 = 0
        L_0x01e7:
            android.view.View[] r1 = r4.A04
            if (r10 >= r5) goto L_0x0265
            r9 = r1[r10]
            android.view.ViewGroup$LayoutParams r7 = r9.getLayoutParams()
            X.28N r7 = (X.AnonymousClass28N) r7
            int r1 = r4.A01
            if (r1 != r6) goto L_0x023f
            boolean r1 = r4.A1f()
            int r3 = r4.A0M()
            int[] r12 = r4.A03
            if (r1 == 0) goto L_0x0230
            int r11 = r4.A00
            int r1 = r7.A00
            int r11 = r11 - r1
            r1 = r12[r11]
            int r3 = r3 + r1
            X.1r7 r1 = r4.A06
            int r1 = r1.A08(r9)
            int r11 = r3 - r1
        L_0x0213:
            X.C38251qy.A03(r9, r11, r2, r3, r0)
            X.1xT r1 = r7.A00
            int r7 = r1.A00
            r1 = r7 & 8
            if (r1 != 0) goto L_0x0222
            r1 = r7 & 2
            if (r1 == 0) goto L_0x0224
        L_0x0222:
            r8.A03 = r6
        L_0x0224:
            boolean r7 = r8.A02
            boolean r1 = r9.hasFocusable()
            r7 = r7 | r1
            r8.A02 = r7
            int r10 = r10 + 1
            goto L_0x01e7
        L_0x0230:
            int r1 = r7.A00
            r1 = r12[r1]
            int r3 = r3 + r1
            X.1r7 r1 = r4.A06
            int r1 = r1.A08(r9)
            int r1 = r1 + r3
            r11 = r3
            r3 = r1
            goto L_0x0213
        L_0x023f:
            int r2 = r4.A0O()
            int[] r1 = r4.A03
            int r0 = r7.A00
            r0 = r1[r0]
            int r2 = r2 + r0
            X.1r7 r0 = r4.A06
            int r0 = r0.A08(r9)
            int r0 = r0 + r2
            goto L_0x0213
        L_0x0252:
            int r2 = r3.A07
            int r0 = r2 + r7
            goto L_0x01e4
        L_0x0257:
            if (r0 != r1) goto L_0x0260
            int r3 = r3.A07
            int r11 = r3 - r7
        L_0x025d:
            r2 = 0
            r0 = 0
            goto L_0x01e6
        L_0x0260:
            int r11 = r3.A07
            int r3 = r11 + r7
            goto L_0x025d
        L_0x0265:
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A1b(X.1r6, X.1xR, X.1qQ, X.1qZ):void");
    }

    public void A1e(boolean z) {
        if (!z) {
            super.A1e(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void A1g(int i) {
        if (i != this.A00) {
            this.A02 = true;
            if (i >= 1) {
                this.A00 = i;
                this.A01.A01.clear();
                A0Q();
                return;
            }
            throw AnonymousClass001.A13("Span count should be at least 1. Provided ", AnonymousClass000.A10(), i);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C38191qq.A00, i, i2);
        obtainStyledAttributes.getInt(0, 1);
        int i3 = obtainStyledAttributes.getInt(10, 1);
        obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1g(i3);
    }

    private void A0F(View view, int i, boolean z) {
        int i2;
        int A012;
        int A013;
        AnonymousClass28N r6 = (AnonymousClass28N) view.getLayoutParams();
        Rect rect = r6.A03;
        int i3 = rect.top + rect.bottom + r6.topMargin + r6.bottomMargin;
        int i4 = rect.left + rect.right + r6.leftMargin + r6.rightMargin;
        int i5 = r6.A00;
        int i6 = r6.A01;
        if (this.A01 != 1 || !A1f()) {
            int[] iArr = this.A03;
            i2 = iArr[i6 + i5] - iArr[i5];
        } else {
            int[] iArr2 = this.A03;
            int i7 = this.A00 - i5;
            i2 = iArr2[i7] - iArr2[i7 - i6];
        }
        if (this.A01 == 1) {
            A013 = C38251qy.A01(i2, i, i4, r6.width, false);
            A012 = C38251qy.A01(this.A06.A05(), this.A01, i3, r6.height, true);
        } else {
            A012 = C38251qy.A01(i2, i, i3, r6.height, false);
            A013 = C38251qy.A01(this.A06.A05(), this.A04, i4, r6.width, true);
        }
        C38491rN r2 = (C38491rN) view.getLayoutParams();
        if (z) {
            if (C38251qy.A05(view.getMeasuredWidth(), A013, r2.width) && C38251qy.A05(view.getMeasuredHeight(), A012, r2.height)) {
                return;
            }
        } else if (!A0h(view, r2, A013, A012)) {
            return;
        }
        view.measure(A013, A012);
    }

    public int A0m(C37931qQ r2, C38021qZ r3, int i) {
        A0H(this);
        A0G(this);
        return super.A0m(r2, r3, i);
    }

    public int A0n(C37931qQ r2, C38021qZ r3, int i) {
        A0H(this);
        A0G(this);
        return super.A0n(r2, r3, i);
    }

    public void A1A(View view, C26228CvK cvK, C37931qQ r11, C38021qZ r12) {
        C25476CgV A002;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof AnonymousClass28N)) {
            super.A0Y(view, cvK);
            return;
        }
        AnonymousClass28N r1 = (AnonymousClass28N) layoutParams;
        int A0A = A0A(r11, r12, r1.A00());
        if (this.A01 == 0) {
            A002 = C25476CgV.A00(r1.A00, r1.A01, A0A, 1, false, false);
        } else {
            A002 = C25476CgV.A00(A0A, 1, r1.A00, r1.A01, false, false);
        }
        cvK.A0a(A002);
    }

    public void A1F(C38021qZ r2) {
        super.A1F(r2);
        this.A02 = false;
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        A1g(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        A1g(i);
    }
}
