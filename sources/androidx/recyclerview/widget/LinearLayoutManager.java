package androidx.recyclerview.widget;

import X.C37931qQ;
import X.C38021qZ;
import X.C38191qq;
import X.C38251qy;
import X.C38261qz;
import X.C38271r0;
import X.C38291r3;
import X.C38311r5;
import X.C38321r6;
import X.C38331r7;
import X.C38491rN;
import X.C41991xR;
import X.C62712rq;
import X.C64522uu;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends C38251qy implements C38261qz, C38271r0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C41991xR A04;
    public C64522uu A05;
    public C38331r7 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int[] A0D;
    public final C38311r5 A0E;
    public final C38321r6 A0F;

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public static int A06(LinearLayoutManager linearLayoutManager, C38021qZ r7) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0J() == 0) {
            return 0;
        }
        linearLayoutManager.A1Y();
        C38331r7 r3 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0C;
        boolean z2 = !z;
        return C62712rq.A00(linearLayoutManager2.A1X(z2), linearLayoutManager2.A1W(z2), r3, linearLayoutManager2, r7, z);
    }

    public static int A07(LinearLayoutManager linearLayoutManager, C38021qZ r8) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0J() == 0) {
            return 0;
        }
        linearLayoutManager.A1Y();
        C38331r7 r3 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0C;
        boolean z2 = !z;
        return C62712rq.A02(linearLayoutManager.A1X(z2), linearLayoutManager.A1W(z2), r3, linearLayoutManager2, r8, z, linearLayoutManager.A0A);
    }

    public static int A08(LinearLayoutManager linearLayoutManager, C38021qZ r7) {
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager.A0J() == 0) {
            return 0;
        }
        linearLayoutManager.A1Y();
        C38331r7 r3 = linearLayoutManager.A06;
        boolean z = linearLayoutManager.A0C;
        boolean z2 = !z;
        return C62712rq.A01(linearLayoutManager2.A1X(z2), linearLayoutManager2.A1W(z2), r3, linearLayoutManager2, r7, z);
    }

    public void A1F(C38021qZ r2) {
        this.A05 = null;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A0E.A00();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0033 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0046 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A1R(int r5) {
        /*
            r4 = this;
            r3 = -1
            r2 = 1
            if (r5 == r2) goto L_0x0037
            r0 = 2
            if (r5 == r0) goto L_0x0024
            r0 = 17
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r0) goto L_0x001f
            r0 = 33
            if (r5 == r0) goto L_0x0042
            r0 = 66
            if (r5 == r0) goto L_0x001a
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x002f
            return r1
        L_0x001a:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0034
            return r2
        L_0x001f:
            int r0 = r4.A01
            if (r0 != 0) goto L_0x0047
            return r3
        L_0x0024:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0033
            boolean r0 = r4.A1f()
            if (r0 == 0) goto L_0x0033
            return r3
        L_0x002f:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0034
        L_0x0033:
            return r2
        L_0x0034:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            return r2
        L_0x0037:
            int r0 = r4.A01
            if (r0 == r2) goto L_0x0046
            boolean r0 = r4.A1f()
            if (r0 == 0) goto L_0x0046
            return r2
        L_0x0042:
            int r0 = r4.A01
            if (r0 != r2) goto L_0x0047
        L_0x0046:
            return r3
        L_0x0047:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1R(int):int");
    }

    public View A1W(boolean z) {
        int A0J;
        int i;
        if (this.A0A) {
            A0J = 0;
            i = A0J();
        } else {
            A0J = A0J() - 1;
            i = -1;
        }
        return A1V(A0J, i, z, true);
    }

    public View A1X(boolean z) {
        int i;
        int A0J;
        if (this.A0A) {
            i = A0J() - 1;
            A0J = -1;
        } else {
            i = 0;
            A0J = A0J();
        }
        return A1V(i, A0J, z, true);
    }

    public void A1d(boolean z) {
        A1H((String) null);
        if (z != this.A09) {
            this.A09 = z;
            A0Q();
        }
    }

    public void A1e(boolean z) {
        A1H((String) null);
        if (this.A0B != z) {
            this.A0B = z;
            A0Q();
        }
    }

    private void A09(int i, int i2) {
        this.A04.A00 = this.A06.A02() - i2;
        C41991xR r3 = this.A04;
        int i3 = 1;
        if (this.A0A) {
            i3 = -1;
        }
        r3.A03 = i3;
        r3.A01 = i;
        r3.A05 = 1;
        r3.A07 = i2;
        r3.A08 = Integer.MIN_VALUE;
    }

    private void A0A(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A04();
        C41991xR r3 = this.A04;
        r3.A01 = i;
        int i3 = -1;
        if (this.A0A) {
            i3 = 1;
        }
        r3.A03 = i3;
        r3.A05 = -1;
        r3.A07 = i2;
        r3.A08 = Integer.MIN_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0B(X.C41991xR r7, X.C37931qQ r8) {
        /*
            r6 = this;
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x00c3
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x00c3
            int r4 = r7.A08
            int r3 = r7.A06
            int r1 = r7.A05
            r0 = -1
            if (r1 != r0) goto L_0x0059
            int r5 = r6.A0J()
            if (r4 < 0) goto L_0x00c3
            X.1r7 r0 = r6.A06
            int r2 = r0.A01()
            int r2 = r2 - r4
            int r2 = r2 + r3
            boolean r0 = r6.A0A
            r3 = 0
            if (r0 != 0) goto L_0x0040
            int r5 = r5 + -1
            r3 = r5
        L_0x0027:
            if (r5 < 0) goto L_0x00c3
            android.view.View r1 = r6.A0P(r5)
            X.1r7 r0 = r6.A06
            int r0 = r0.A09(r1)
            if (r0 < r2) goto L_0x0081
            X.1r7 r0 = r6.A06
            int r0 = r0.A0B(r1)
            if (r0 < r2) goto L_0x0081
            int r5 = r5 + -1
            goto L_0x0027
        L_0x0040:
            if (r3 >= r5) goto L_0x00c3
            android.view.View r1 = r6.A0P(r3)
            X.1r7 r0 = r6.A06
            int r0 = r0.A09(r1)
            if (r0 < r2) goto L_0x00ae
            X.1r7 r0 = r6.A06
            int r0 = r0.A0B(r1)
            if (r0 < r2) goto L_0x00ae
            int r3 = r3 + 1
            goto L_0x0040
        L_0x0059:
            if (r4 < 0) goto L_0x00c3
            int r4 = r4 - r3
            int r2 = r6.A0J()
            boolean r0 = r6.A0A
            r3 = 0
            if (r0 == 0) goto L_0x0095
            int r5 = r2 + -1
            r3 = r5
        L_0x0068:
            if (r5 < 0) goto L_0x00c3
            android.view.View r1 = r6.A0P(r5)
            X.1r7 r0 = r6.A06
            int r0 = r0.A06(r1)
            if (r0 > r4) goto L_0x0081
            X.1r7 r0 = r6.A06
            int r0 = r0.A0A(r1)
            if (r0 > r4) goto L_0x0081
            int r5 = r5 + -1
            goto L_0x0068
        L_0x0081:
            if (r3 == r5) goto L_0x00c3
            if (r5 <= r3) goto L_0x008d
        L_0x0085:
            int r5 = r5 + -1
            if (r5 < r3) goto L_0x00c3
            r6.A0d(r8, r5)
            goto L_0x0085
        L_0x008d:
            if (r3 <= r5) goto L_0x00c3
            r6.A0d(r8, r3)
            int r3 = r3 + -1
            goto L_0x008d
        L_0x0095:
            if (r3 >= r2) goto L_0x00c3
            android.view.View r1 = r6.A0P(r3)
            X.1r7 r0 = r6.A06
            int r0 = r0.A06(r1)
            if (r0 > r4) goto L_0x00ae
            X.1r7 r0 = r6.A06
            int r0 = r0.A0A(r1)
            if (r0 > r4) goto L_0x00ae
            int r3 = r3 + 1
            goto L_0x0095
        L_0x00ae:
            r0 = 0
            if (r0 == r3) goto L_0x00c3
            if (r3 <= r0) goto L_0x00bd
        L_0x00b3:
            int r3 = r3 + -1
            if (r3 < r0) goto L_0x00c3
            r6.A0d(r8, r3)
            goto L_0x00b3
        L_0x00bb:
            if (r0 <= r3) goto L_0x00c3
        L_0x00bd:
            r6.A0d(r8, r0)
            int r0 = r0 + -1
            goto L_0x00bb
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0B(X.1xR, X.1qQ):void");
    }

    public static void A0C(LinearLayoutManager linearLayoutManager) {
        boolean z;
        if (linearLayoutManager.A01 == 1 || !linearLayoutManager.A1f()) {
            z = linearLayoutManager.A09;
        } else {
            z = !linearLayoutManager.A09;
        }
        linearLayoutManager.A0A = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A01() != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(androidx.recyclerview.widget.LinearLayoutManager r6, X.C38021qZ r7, int r8, int r9, boolean r10) {
        /*
            X.1xR r2 = r6.A04
            X.1r7 r1 = r6.A06
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x0011
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r2.A0A = r0
            r2.A05 = r8
            int[] r2 = r6.A0D
            r4 = 0
            r2[r4] = r4
            r5 = 1
            r2[r5] = r4
            r6.A1c(r7, r2)
            r0 = r2[r4]
            int r1 = java.lang.Math.max(r4, r0)
            r0 = r2[r5]
            int r0 = java.lang.Math.max(r4, r0)
            if (r8 != r5) goto L_0x0030
            r4 = 1
        L_0x0030:
            X.1xR r3 = r6.A04
            r2 = r1
            if (r4 == 0) goto L_0x0036
            r2 = r0
        L_0x0036:
            r3.A02 = r2
            if (r4 != 0) goto L_0x003b
            r1 = r0
        L_0x003b:
            r3.A06 = r1
            if (r4 == 0) goto L_0x009f
            X.1r7 r1 = r6.A06
            X.28F r1 = (X.AnonymousClass28F) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                default: goto L_0x0048;
            }
        L_0x0048:
            r0 = 0
        L_0x0049:
            int r2 = r2 + r0
            r3.A02 = r2
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x008a
            r0 = 0
        L_0x0051:
            android.view.View r4 = r6.A0P(r0)
            X.1xR r3 = r6.A04
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x005c
            r5 = -1
        L_0x005c:
            r3.A03 = r5
            int r2 = X.C38251qy.A02(r4)
            X.1xR r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.1r7 r0 = r6.A06
            int r0 = r0.A06(r4)
            r1.A07 = r0
            X.1r7 r0 = r6.A06
            int r1 = r0.A06(r4)
            X.1r7 r0 = r6.A06
            int r0 = r0.A02()
            int r1 = r1 - r0
        L_0x007e:
            X.1xR r0 = r6.A04
            r0.A00 = r9
            if (r10 == 0) goto L_0x0087
            int r9 = r9 - r1
            r0.A00 = r9
        L_0x0087:
            r0.A08 = r1
            return
        L_0x008a:
            int r0 = r6.A0J()
            int r0 = r0 + -1
            goto L_0x0051
        L_0x0091:
            X.1qy r0 = r1.A02
            int r0 = r0.A0L()
            goto L_0x0049
        L_0x0098:
            X.1qy r0 = r1.A02
            int r0 = r0.A0N()
            goto L_0x0049
        L_0x009f:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x00e5
            int r0 = r6.A0J()
            int r0 = r0 + -1
        L_0x00a9:
            android.view.View r4 = r6.A0P(r0)
            X.1xR r2 = r6.A04
            int r1 = r2.A02
            X.1r7 r0 = r6.A06
            int r0 = r0.A04()
            int r1 = r1 + r0
            r2.A02 = r1
            X.1xR r3 = r6.A04
            boolean r0 = r6.A0A
            if (r0 != 0) goto L_0x00c1
            r5 = -1
        L_0x00c1:
            r3.A03 = r5
            int r2 = X.C38251qy.A02(r4)
            X.1xR r1 = r6.A04
            int r0 = r1.A03
            int r2 = r2 + r0
            r3.A01 = r2
            X.1r7 r0 = r6.A06
            int r0 = r0.A09(r4)
            r1.A07 = r0
            X.1r7 r0 = r6.A06
            int r0 = r0.A09(r4)
            int r1 = -r0
            X.1r7 r0 = r6.A06
            int r0 = r0.A04()
            int r1 = r1 + r0
            goto L_0x007e
        L_0x00e5:
            r0 = 0
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0D(androidx.recyclerview.widget.LinearLayoutManager, X.1qZ, int, int, boolean):void");
    }

    public int A0m(C37931qQ r3, C38021qZ r4, int i) {
        if (this.A01 == 1) {
            return 0;
        }
        return A1T(r3, r4, i);
    }

    public int A0n(C37931qQ r2, C38021qZ r3, int i) {
        if (this.A01 == 0) {
            return 0;
        }
        return A1T(r2, r3, i);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2uu, android.os.Parcelable, java.lang.Object] */
    public Parcelable A0u() {
        ? obj;
        int i;
        int i2;
        int A0J;
        C64522uu r1 = this.A05;
        if (r1 != null) {
            obj.A01 = r1.A01;
            obj.A00 = r1.A00;
            obj.A02 = r1.A02;
            return obj;
        }
        obj = new Object();
        if (A0J() > 0) {
            A1Y();
            boolean z = this.A07;
            boolean z2 = this.A0A;
            boolean z3 = z ^ z2;
            obj.A02 = z3;
            if (z3) {
                if (z2) {
                    A0J = 0;
                } else {
                    A0J = A0J() - 1;
                }
                View A0P = A0P(A0J);
                obj.A00 = this.A06.A02() - this.A06.A06(A0P);
                i = C38251qy.A02(A0P);
            } else {
                if (z2) {
                    i2 = A0J() - 1;
                } else {
                    i2 = 0;
                }
                View A0P2 = A0P(i2);
                obj.A01 = C38251qy.A02(A0P2);
                obj.A00 = this.A06.A09(A0P2) - this.A06.A04();
                return obj;
            }
        } else {
            i = -1;
        }
        obj.A01 = i;
        return obj;
    }

    public void A19(Parcelable parcelable) {
        if (parcelable instanceof C64522uu) {
            this.A05 = (C64522uu) parcelable;
            A0Q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:201:0x033b, code lost:
        if (r8 != null) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03c3, code lost:
        if (r1.A01() != 0) goto L_0x03c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0449, code lost:
        if (r1 > 0) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x04d1, code lost:
        if (r0 <= 0) goto L_0x04d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x04d3, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0378  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1D(X.C37931qQ r19, X.C38021qZ r20) {
        /*
            r18 = this;
            r5 = r18
            X.2uu r1 = r5.A05
            r2 = -1
            r7 = r19
            r6 = r20
            if (r1 != 0) goto L_0x000f
            int r0 = r5.A02
            if (r0 == r2) goto L_0x0021
        L_0x000f:
            int r0 = r6.A00()
            if (r0 != 0) goto L_0x0019
            r5.A0b(r7)
            return
        L_0x0019:
            if (r1 == 0) goto L_0x0021
            int r0 = r1.A01
            if (r0 < 0) goto L_0x0021
            r5.A02 = r0
        L_0x0021:
            r5.A1Y()
            X.1xR r0 = r5.A04
            r4 = 0
            r0.A0B = r4
            A0C(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07
            r8 = 0
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r0.getFocusedChild()
            if (r1 == 0) goto L_0x0042
            X.1qm r0 = r5.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0042
            r8 = r1
        L_0x0042:
            X.1r5 r3 = r5.A0E
            boolean r0 = r3.A04
            r9 = 1
            if (r0 == 0) goto L_0x0134
            int r0 = r5.A02
            if (r0 != r2) goto L_0x0134
            X.2uu r0 = r5.A05
            if (r0 != 0) goto L_0x0134
            if (r8 == 0) goto L_0x0076
            X.1r7 r0 = r5.A06
            int r1 = r0.A09(r8)
            X.1r7 r0 = r5.A06
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x006f
            X.1r7 r0 = r5.A06
            int r1 = r0.A06(r8)
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            if (r1 > r0) goto L_0x0076
        L_0x006f:
            int r0 = X.C38251qy.A02(r8)
            r3.A02(r8, r0)
        L_0x0076:
            X.1xR r8 = r5.A04
            int r1 = r8.A04
            r0 = -1
            if (r1 < 0) goto L_0x007e
            r0 = 1
        L_0x007e:
            r8.A05 = r0
            int[] r1 = r5.A0D
            r1[r4] = r4
            r1[r9] = r4
            r5.A1c(r6, r1)
            r0 = r1[r4]
            int r10 = java.lang.Math.max(r4, r0)
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            int r10 = r10 + r0
            r0 = r1[r9]
            int r9 = java.lang.Math.max(r4, r0)
            X.1r7 r1 = r5.A06
            X.28F r1 = (X.AnonymousClass28F) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x012c;
                case 1: goto L_0x0124;
                default: goto L_0x00a5;
            }
        L_0x00a5:
            r0 = 0
        L_0x00a6:
            int r9 = r9 + r0
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x00d2
            int r8 = r5.A02
            if (r8 == r2) goto L_0x00d2
            int r1 = r5.A03
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x00d2
            android.view.View r11 = r5.A0j(r8)
            if (r11 == 0) goto L_0x00d2
            boolean r1 = r5.A0A
            X.1r7 r0 = r5.A06
            if (r1 == 0) goto L_0x0116
            int r8 = r0.A02()
            X.1r7 r0 = r5.A06
            int r0 = r0.A06(r11)
            int r8 = r8 - r0
            int r1 = r5.A03
        L_0x00ce:
            int r8 = r8 - r1
            if (r8 <= 0) goto L_0x0114
            int r10 = r10 + r8
        L_0x00d2:
            boolean r1 = r3.A03
            boolean r0 = r5.A0A
            if (r1 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x00db
        L_0x00da:
            r2 = 1
        L_0x00db:
            boolean r0 = r5 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x03b1
            r11 = r5
            androidx.recyclerview.widget.GridLayoutManager r11 = (androidx.recyclerview.widget.GridLayoutManager) r11
            androidx.recyclerview.widget.GridLayoutManager.A0H(r11)
            int r0 = r6.A00()
            if (r0 <= 0) goto L_0x03ae
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x03ae
            r12 = 1
            r1 = 0
            if (r2 != r12) goto L_0x00f4
            r1 = 1
        L_0x00f4:
            int r0 = r3.A01
            int r8 = androidx.recyclerview.widget.GridLayoutManager.A09(r11, r7, r6, r0)
            if (r1 != 0) goto L_0x039e
            int r2 = r6.A00()
            int r2 = r2 - r12
            int r1 = r3.A01
        L_0x0103:
            if (r1 >= r2) goto L_0x03ac
            int r0 = r1 + 1
            int r0 = androidx.recyclerview.widget.GridLayoutManager.A09(r11, r7, r6, r0)
            if (r0 <= r8) goto L_0x03ac
            int r1 = r1 + 1
            r8 = r0
            goto L_0x0103
        L_0x0111:
            if (r0 == 0) goto L_0x00da
            goto L_0x00db
        L_0x0114:
            int r9 = r9 - r8
            goto L_0x00d2
        L_0x0116:
            int r1 = r0.A09(r11)
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            int r1 = r1 - r0
            int r8 = r5.A03
            goto L_0x00ce
        L_0x0124:
            X.1qy r0 = r1.A02
            int r0 = r0.A0L()
            goto L_0x00a6
        L_0x012c:
            X.1qy r0 = r1.A02
            int r0 = r0.A0N()
            goto L_0x00a6
        L_0x0134:
            r3.A00()
            boolean r12 = r5.A0A
            boolean r0 = r5.A0B
            r0 = r0 ^ r12
            r3.A03 = r0
            boolean r0 = r6.A08
            r10 = 0
            if (r0 != 0) goto L_0x0224
            int r11 = r5.A02
            if (r11 == r2) goto L_0x0224
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 < 0) goto L_0x0220
            int r0 = r6.A00()
            if (r11 >= r0) goto L_0x0220
            r3.A01 = r11
            X.2uu r1 = r5.A05
            if (r1 == 0) goto L_0x017c
            int r0 = r1.A01
            if (r0 < 0) goto L_0x017c
            boolean r1 = r1.A02
            r3.A03 = r1
            X.1r7 r0 = r5.A06
            if (r1 == 0) goto L_0x0172
            int r10 = r0.A02()
            X.2uu r0 = r5.A05
            int r0 = r0.A00
        L_0x016b:
            int r10 = r10 - r0
        L_0x016c:
            r3.A00 = r10
        L_0x016e:
            r3.A04 = r9
            goto L_0x0076
        L_0x0172:
            int r10 = r0.A04()
            X.2uu r0 = r5.A05
            int r1 = r0.A00
            goto L_0x020f
        L_0x017c:
            int r0 = r5.A03
            if (r0 != r8) goto L_0x01e7
            android.view.View r8 = r5.A0j(r11)
            if (r8 == 0) goto L_0x01c6
            X.1r7 r0 = r5.A06
            int r1 = r0.A07(r8)
            X.1r7 r0 = r5.A06
            int r0 = r0.A05()
            if (r1 > r0) goto L_0x01e1
            X.1r7 r0 = r5.A06
            int r1 = r0.A09(r8)
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            int r1 = r1 - r0
            X.1r7 r0 = r5.A06
            if (r1 >= 0) goto L_0x01ae
            int r0 = r0.A04()
            r3.A00 = r0
            r3.A03 = r4
            goto L_0x016e
        L_0x01ae:
            int r1 = r0.A02()
            X.1r7 r0 = r5.A06
            int r0 = r0.A06(r8)
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x01fc
            X.1r7 r0 = r5.A06
            int r0 = r0.A02()
            r3.A00 = r0
            r3.A03 = r9
            goto L_0x016e
        L_0x01c6:
            int r0 = r5.A0J()
            if (r0 <= 0) goto L_0x01e1
            android.view.View r0 = r5.A0P(r4)
            int r8 = X.C38251qy.A02(r0)
            int r0 = r5.A02
            r1 = 0
            if (r0 >= r8) goto L_0x01da
            r1 = 1
        L_0x01da:
            boolean r0 = r5.A0A
            if (r1 != r0) goto L_0x01df
            r10 = 1
        L_0x01df:
            r3.A03 = r10
        L_0x01e1:
            boolean r1 = r3.A03
            X.1r7 r0 = r3.A02
            goto L_0x036e
        L_0x01e7:
            r3.A03 = r12
            X.1r7 r0 = r5.A06
            if (r12 == 0) goto L_0x01f5
            int r10 = r0.A02()
            int r0 = r5.A03
            goto L_0x016b
        L_0x01f5:
            int r10 = r0.A04()
            int r1 = r5.A03
            goto L_0x020f
        L_0x01fc:
            boolean r1 = r3.A03
            X.1r7 r0 = r5.A06
            if (r1 == 0) goto L_0x021a
            int r10 = r0.A06(r8)
            X.1r7 r8 = r5.A06
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = r8.A00
            if (r1 != r0) goto L_0x0212
            r1 = 0
        L_0x020f:
            int r10 = r10 + r1
            goto L_0x016c
        L_0x0212:
            int r1 = r8.A05()
            int r0 = r8.A00
            int r1 = r1 - r0
            goto L_0x020f
        L_0x021a:
            int r10 = r0.A09(r8)
            goto L_0x016c
        L_0x0220:
            r5.A02 = r2
            r5.A03 = r8
        L_0x0224:
            int r0 = r5.A0J()
            if (r0 == 0) goto L_0x037d
            androidx.recyclerview.widget.RecyclerView r0 = r5.A07
            if (r0 == 0) goto L_0x0261
            android.view.View r8 = r0.getFocusedChild()
            if (r8 == 0) goto L_0x0261
            X.1qm r0 = r5.A05
            java.util.List r0 = r0.A02
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0261
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            X.1rN r1 = (X.C38491rN) r1
            X.1xT r0 = r1.A00
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 != 0) goto L_0x0261
            int r1 = r1.A00()
            if (r1 < 0) goto L_0x0261
            int r0 = r6.A00()
            if (r1 >= r0) goto L_0x0261
            int r0 = X.C38251qy.A02(r8)
            r3.A02(r8, r0)
            goto L_0x016e
        L_0x0261:
            boolean r1 = r5.A07
            boolean r0 = r5.A0B
            if (r1 != r0) goto L_0x037d
            boolean r1 = r3.A03
            boolean r0 = r5.A0A
            if (r1 == 0) goto L_0x02d5
            if (r0 == 0) goto L_0x02d7
        L_0x026f:
            int r13 = r5.A0J()
            int r12 = r6.A00()
            r11 = 0
        L_0x0278:
            boolean r0 = r5 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r0 == 0) goto L_0x02ea
            r14 = r5
            androidx.recyclerview.widget.GridLayoutManager r14 = (androidx.recyclerview.widget.GridLayoutManager) r14
            r14.A1Y()
            X.1r7 r0 = r14.A06
            int r10 = r0.A04()
            X.1r7 r0 = r14.A06
            int r1 = r0.A02()
            r17 = -1
            if (r13 <= r11) goto L_0x0294
            r17 = 1
        L_0x0294:
            r16 = 0
            r15 = r16
        L_0x0298:
            if (r11 == r13) goto L_0x02e3
            android.view.View r8 = r14.A0P(r11)
            int r0 = X.C38251qy.A02(r8)
            if (r0 < 0) goto L_0x02bd
            if (r0 >= r12) goto L_0x02bd
            int r0 = androidx.recyclerview.widget.GridLayoutManager.A09(r14, r7, r6, r0)
            if (r0 != 0) goto L_0x02bd
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            X.1rN r0 = (X.C38491rN) r0
            X.1xT r0 = r0.A00
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x02c0
            if (r15 != 0) goto L_0x02bd
            r15 = r8
        L_0x02bd:
            int r11 = r11 + r17
            goto L_0x0298
        L_0x02c0:
            X.1r7 r0 = r14.A06
            int r0 = r0.A09(r8)
            if (r0 >= r1) goto L_0x02d0
            X.1r7 r0 = r14.A06
            int r0 = r0.A06(r8)
            if (r0 >= r10) goto L_0x033d
        L_0x02d0:
            if (r16 != 0) goto L_0x02bd
            r16 = r8
            goto L_0x02bd
        L_0x02d5:
            if (r0 == 0) goto L_0x026f
        L_0x02d7:
            int r0 = r5.A0J()
            int r11 = r0 + -1
            r13 = -1
            int r12 = r6.A00()
            goto L_0x0278
        L_0x02e3:
            if (r16 != 0) goto L_0x02e7
            r16 = r15
        L_0x02e7:
            r8 = r16
            goto L_0x033b
        L_0x02ea:
            r5.A1Y()
            X.1r7 r0 = r5.A06
            int r10 = r0.A04()
            X.1r7 r0 = r5.A06
            int r1 = r0.A02()
            r16 = -1
            if (r13 <= r11) goto L_0x02ff
            r16 = 1
        L_0x02ff:
            r15 = 0
            r14 = r15
        L_0x0301:
            if (r11 == r13) goto L_0x0337
            android.view.View r8 = r5.A0P(r11)
            int r0 = X.C38251qy.A02(r8)
            if (r0 < 0) goto L_0x0320
            if (r0 >= r12) goto L_0x0320
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            X.1rN r0 = (X.C38491rN) r0
            X.1xT r0 = r0.A00
            int r0 = r0.A00
            r0 = r0 & 8
            if (r0 == 0) goto L_0x0323
            if (r14 != 0) goto L_0x0320
            r14 = r8
        L_0x0320:
            int r11 = r11 + r16
            goto L_0x0301
        L_0x0323:
            X.1r7 r0 = r5.A06
            int r0 = r0.A09(r8)
            if (r0 >= r1) goto L_0x0333
            X.1r7 r0 = r5.A06
            int r0 = r0.A06(r8)
            if (r0 >= r10) goto L_0x033d
        L_0x0333:
            if (r15 != 0) goto L_0x0320
            r15 = r8
            goto L_0x0320
        L_0x0337:
            if (r15 != 0) goto L_0x033a
            r15 = r14
        L_0x033a:
            r8 = r15
        L_0x033b:
            if (r8 == 0) goto L_0x037d
        L_0x033d:
            int r0 = X.C38251qy.A02(r8)
            r3.A01(r8, r0)
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x016e
            boolean r0 = r5.A1L()
            if (r0 == 0) goto L_0x016e
            X.1r7 r0 = r5.A06
            int r1 = r0.A09(r8)
            X.1r7 r0 = r5.A06
            int r0 = r0.A02()
            if (r1 >= r0) goto L_0x036a
            X.1r7 r0 = r5.A06
            int r1 = r0.A06(r8)
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            if (r1 >= r0) goto L_0x016e
        L_0x036a:
            boolean r1 = r3.A03
            X.1r7 r0 = r5.A06
        L_0x036e:
            if (r1 == 0) goto L_0x0378
            int r0 = r0.A02()
        L_0x0374:
            r3.A00 = r0
            goto L_0x016e
        L_0x0378:
            int r0 = r0.A04()
            goto L_0x0374
        L_0x037d:
            boolean r1 = r3.A03
            X.1r7 r0 = r3.A02
            if (r1 == 0) goto L_0x0399
            int r0 = r0.A02()
        L_0x0387:
            r3.A00 = r0
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0397
            int r0 = r6.A00()
            int r0 = r0 + -1
        L_0x0393:
            r3.A01 = r0
            goto L_0x016e
        L_0x0397:
            r0 = 0
            goto L_0x0393
        L_0x0399:
            int r0 = r0.A04()
            goto L_0x0387
        L_0x039e:
            if (r8 <= 0) goto L_0x03ae
            int r0 = r3.A01
            if (r0 <= 0) goto L_0x03ae
            int r0 = r0 - r12
            r3.A01 = r0
            int r8 = androidx.recyclerview.widget.GridLayoutManager.A09(r11, r7, r6, r0)
            goto L_0x039e
        L_0x03ac:
            r3.A01 = r1
        L_0x03ae:
            androidx.recyclerview.widget.GridLayoutManager.A0G(r11)
        L_0x03b1:
            r5.A0a(r7)
            X.1xR r2 = r5.A04
            X.1r7 r1 = r5.A06
            int r0 = r1.A03()
            if (r0 != 0) goto L_0x03c5
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x03c6
        L_0x03c5:
            r0 = 0
        L_0x03c6:
            r2.A0A = r0
            r2.A06 = r4
            boolean r2 = r3.A03
            int r1 = r3.A01
            int r0 = r3.A00
            if (r2 == 0) goto L_0x04d8
            r5.A0A(r1, r0)
            X.1xR r0 = r5.A04
            r0.A02 = r10
            r5.A1S(r0, r7, r6, r4)
            X.1xR r0 = r5.A04
            int r2 = r0.A07
            int r10 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x03e7
            int r9 = r9 + r0
        L_0x03e7:
            int r1 = r3.A01
            int r0 = r3.A00
            r5.A09(r1, r0)
            X.1xR r8 = r5.A04
            r8.A02 = r9
            int r1 = r8.A01
            int r0 = r8.A03
            int r1 = r1 + r0
            r8.A01 = r1
            r5.A1S(r8, r7, r6, r4)
            X.1xR r0 = r5.A04
            int r9 = r0.A07
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0412
            r5.A0A(r10, r2)
            X.1xR r0 = r5.A04
            r0.A02 = r1
            r5.A1S(r0, r7, r6, r4)
            X.1xR r0 = r5.A04
            int r2 = r0.A07
        L_0x0412:
            int r0 = r5.A0J()
            if (r0 <= 0) goto L_0x0452
            boolean r1 = r5.A0A
            boolean r0 = r5.A0B
            r1 = r1 ^ r0
            X.1r7 r0 = r5.A06
            if (r1 == 0) goto L_0x04a8
            int r0 = r0.A02()
            int r0 = r0 - r9
            if (r0 <= 0) goto L_0x04a6
            int r0 = -r0
            int r0 = r5.A1T(r7, r6, r0)
            int r10 = -r0
            int r8 = r9 + r10
            X.1r7 r0 = r5.A06
            int r1 = r0.A02()
            int r1 = r1 - r8
            if (r1 <= 0) goto L_0x04a4
            X.1r7 r0 = r5.A06
            r0.A0C(r1)
            int r1 = r1 + r10
        L_0x043f:
            int r2 = r2 + r1
            int r9 = r9 + r1
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            int r1 = r2 - r0
            if (r1 <= 0) goto L_0x04d3
        L_0x044b:
            int r0 = r5.A1T(r7, r6, r1)
            int r0 = -r0
        L_0x0450:
            int r2 = r2 + r0
            int r9 = r9 + r0
        L_0x0452:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x056a
            int r0 = r5.A0J()
            if (r0 == 0) goto L_0x056a
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x056a
            boolean r0 = r5.A1L()
            if (r0 == 0) goto L_0x056a
            java.util.List r12 = r7.A07
            int r16 = r12.size()
            android.view.View r0 = r5.A0P(r4)
            int r13 = X.C38251qy.A02(r0)
            r11 = 0
            r10 = 0
            r8 = 0
        L_0x0477:
            r0 = r16
            if (r11 >= r0) goto L_0x051a
            java.lang.Object r0 = r12.get(r11)
            X.1xT r0 = (X.C42011xT) r0
            int r1 = r0.A00
            r1 = r1 & 8
            if (r1 != 0) goto L_0x049f
            int r15 = r0.A05
            r1 = -1
            if (r15 != r1) goto L_0x048e
            int r15 = r0.A04
        L_0x048e:
            r14 = 0
            if (r15 >= r13) goto L_0x0492
            r14 = 1
        L_0x0492:
            boolean r1 = r5.A0A
            X.1r7 r15 = r5.A06
            android.view.View r0 = r0.A0H
            int r0 = r15.A07(r0)
            if (r14 == r1) goto L_0x04a2
            int r10 = r10 + r0
        L_0x049f:
            int r11 = r11 + 1
            goto L_0x0477
        L_0x04a2:
            int r8 = r8 + r0
            goto L_0x049f
        L_0x04a4:
            r1 = r10
            goto L_0x043f
        L_0x04a6:
            r1 = 0
            goto L_0x043f
        L_0x04a8:
            int r0 = r0.A04()
            int r0 = r2 - r0
            if (r0 <= 0) goto L_0x04d6
            int r0 = r5.A1T(r7, r6, r0)
            int r10 = -r0
            int r8 = r2 + r10
            X.1r7 r0 = r5.A06
            int r0 = r0.A04()
            int r8 = r8 - r0
            if (r8 <= 0) goto L_0x04c7
            X.1r7 r1 = r5.A06
            int r0 = -r8
            r1.A0C(r0)
            int r10 = r10 - r8
        L_0x04c7:
            int r2 = r2 + r10
            int r9 = r9 + r10
            X.1r7 r0 = r5.A06
            int r0 = r0.A02()
            int r0 = r0 - r9
            int r1 = -r0
            if (r0 > 0) goto L_0x044b
        L_0x04d3:
            r0 = 0
            goto L_0x0450
        L_0x04d6:
            r10 = 0
            goto L_0x04c7
        L_0x04d8:
            r5.A09(r1, r0)
            X.1xR r0 = r5.A04
            r0.A02 = r9
            r5.A1S(r0, r7, r6, r4)
            X.1xR r0 = r5.A04
            int r9 = r0.A07
            int r8 = r0.A01
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x04ed
            int r10 = r10 + r0
        L_0x04ed:
            int r1 = r3.A01
            int r0 = r3.A00
            r5.A0A(r1, r0)
            X.1xR r2 = r5.A04
            r2.A02 = r10
            int r1 = r2.A01
            int r0 = r2.A03
            int r1 = r1 + r0
            r2.A01 = r1
            r5.A1S(r2, r7, r6, r4)
            X.1xR r0 = r5.A04
            int r2 = r0.A07
            int r1 = r0.A00
            if (r1 <= 0) goto L_0x0412
            r5.A09(r8, r9)
            X.1xR r0 = r5.A04
            r0.A02 = r1
            r5.A1S(r0, r7, r6, r4)
            X.1xR r0 = r5.A04
            int r9 = r0.A07
            goto L_0x0412
        L_0x051a:
            X.1xR r0 = r5.A04
            r0.A09 = r12
            if (r10 <= 0) goto L_0x0544
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0586
            int r0 = r5.A0J()
            int r0 = r0 + -1
        L_0x052a:
            android.view.View r0 = r5.A0P(r0)
            int r0 = X.C38251qy.A02(r0)
            r5.A0A(r0, r2)
            X.1xR r1 = r5.A04
            r1.A02 = r10
            r1.A00 = r4
            r0 = 0
            r1.A01(r0)
            X.1xR r0 = r5.A04
            r5.A1S(r0, r7, r6, r4)
        L_0x0544:
            if (r8 <= 0) goto L_0x0565
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x057f
            r0 = 0
        L_0x054b:
            android.view.View r0 = r5.A0P(r0)
            int r0 = X.C38251qy.A02(r0)
            r5.A09(r0, r9)
            X.1xR r1 = r5.A04
            r1.A02 = r8
            r1.A00 = r4
            r0 = 0
            r1.A01(r0)
            X.1xR r0 = r5.A04
            r5.A1S(r0, r7, r6, r4)
        L_0x0565:
            X.1xR r1 = r5.A04
            r0 = 0
            r1.A09 = r0
        L_0x056a:
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x057b
            X.1r7 r1 = r5.A06
            int r0 = r1.A05()
            r1.A00 = r0
        L_0x0576:
            boolean r0 = r5.A0B
            r5.A07 = r0
            return
        L_0x057b:
            r3.A00()
            goto L_0x0576
        L_0x057f:
            int r0 = r5.A0J()
            int r0 = r0 + -1
            goto L_0x054b
        L_0x0586:
            r0 = 0
            goto L_0x052a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1D(X.1qQ, X.1qZ):void");
    }

    public void A1H(String str) {
        if (this.A05 == null) {
            super.A1H(str);
        }
    }

    public int A1S(C41991xR r8, C37931qQ r9, C38021qZ r10, boolean z) {
        int i;
        int i2 = r8.A00;
        int i3 = r8.A08;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                r8.A08 = i3 + i2;
            }
            A0B(r8, r9);
        }
        int i4 = r8.A00 + r8.A02;
        C38321r6 r2 = this.A0F;
        while (true) {
            if ((!r8.A0A && i4 <= 0) || (i = r8.A01) < 0 || i >= r10.A00()) {
                break;
            }
            r2.A00 = 0;
            r2.A01 = false;
            r2.A03 = false;
            r2.A02 = false;
            A1b(r2, r8, r9, r10);
            if (r2.A01) {
                break;
            }
            int i5 = r8.A07;
            int i6 = r2.A00;
            r8.A07 = i5 + (r8.A05 * i6);
            if (!r2.A03 || r8.A09 != null || !r10.A08) {
                r8.A00 -= i6;
                i4 -= i6;
            }
            int i7 = r8.A08;
            if (i7 != Integer.MIN_VALUE) {
                int i8 = i7 + i6;
                r8.A08 = i8;
                int i9 = r8.A00;
                if (i9 < 0) {
                    r8.A08 = i8 + i9;
                }
                A0B(r8, r9);
            }
            if (z && r2.A02) {
                break;
            }
        }
        return i2 - r8.A00;
    }

    public void A1Y() {
        if (this.A04 == null) {
            this.A04 = new C41991xR();
        }
    }

    public void A1Z(int i) {
        if (i == 0 || i == 1) {
            A1H((String) null);
            if (i != this.A01 || this.A06 == null) {
                C38331r7 A002 = C38331r7.A00(this, i);
                this.A06 = A002;
                this.A0E.A02 = A002;
                this.A01 = i;
                A0Q();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void A1a(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        C64522uu r1 = this.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0Q();
    }

    public void A1c(C38021qZ r6, int[] iArr) {
        int i;
        if (r6.A06 != -1) {
            i = this.A06.A05();
        } else {
            i = 0;
        }
        int i2 = 0;
        if (this.A04.A05 != -1) {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public boolean A1f() {
        if (this.A07.getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public View A0j(int i) {
        int A0J = A0J();
        if (A0J == 0) {
            return null;
        }
        int A022 = i - C38251qy.A02(A0P(0));
        if (A022 >= 0 && A022 < A0J) {
            View A0P = A0P(A022);
            if (C38251qy.A02(A0P) == i) {
                return A0P;
            }
        }
        return super.A0j(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r5.A0A != false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r5.A0A != false) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0v(android.view.View r6, X.C37931qQ r7, X.C38021qZ r8, int r9) {
        /*
            r5 = this;
            A0C(r5)
            int r0 = r5.A0J()
            r4 = 0
            if (r0 == 0) goto L_0x0078
            int r3 = r5.A1R(r9)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r2) goto L_0x0078
            r5.A1Y()
            X.1r7 r0 = r5.A06
            int r0 = r0.A05()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 0
            A0D(r5, r8, r3, r1, r0)
            X.1xR r1 = r5.A04
            r1.A08 = r2
            r1.A0B = r0
            r0 = 1
            r5.A1S(r1, r7, r8, r0)
            r1 = -1
            boolean r0 = r5.A0A
            if (r3 != r1) goto L_0x005e
            if (r0 == 0) goto L_0x0058
            int r0 = r5.A0J()
            int r1 = r0 + -1
            r0 = -1
        L_0x003d:
            android.view.View r2 = r5.A1U(r1, r0)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x006d
        L_0x0045:
            int r0 = r5.A0J()
            int r0 = r0 + -1
        L_0x004b:
            android.view.View r1 = r5.A0P(r0)
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L_0x0077
            if (r2 == 0) goto L_0x0078
            return r1
        L_0x0058:
            r1 = 0
            int r0 = r5.A0J()
            goto L_0x003d
        L_0x005e:
            if (r0 == 0) goto L_0x006f
            r1 = 0
            int r0 = r5.A0J()
        L_0x0065:
            android.view.View r2 = r5.A1U(r1, r0)
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0045
        L_0x006d:
            r0 = 0
            goto L_0x004b
        L_0x006f:
            int r0 = r5.A0J()
            int r1 = r0 + -1
            r0 = -1
            goto L_0x0065
        L_0x0077:
            return r2
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0v(android.view.View, X.1qQ, X.1qZ, int):android.view.View");
    }

    public void A1B(AccessibilityEvent accessibilityEvent) {
        super.A1B(accessibilityEvent);
        if (A0J() > 0) {
            accessibilityEvent.setFromIndex(A1O());
            accessibilityEvent.setToIndex(A1Q());
        }
    }

    public int A1N() {
        View A1V = A1V(0, A0J(), true, false);
        if (A1V == null) {
            return -1;
        }
        return C38251qy.A02(A1V);
    }

    public int A1O() {
        View A1V = A1V(0, A0J(), false, true);
        if (A1V == null) {
            return -1;
        }
        return C38251qy.A02(A1V);
    }

    public int A1P() {
        View A1V = A1V(A0J() - 1, -1, true, false);
        if (A1V != null) {
            return C38251qy.A02(A1V);
        }
        return -1;
    }

    public int A1Q() {
        View A1V = A1V(A0J() - 1, -1, false, true);
        if (A1V != null) {
            return C38251qy.A02(A1V);
        }
        return -1;
    }

    public int A1T(C37931qQ r6, C38021qZ r7, int i) {
        if (!(A0J() == 0 || i == 0)) {
            A1Y();
            this.A04.A0B = true;
            int i2 = -1;
            if (i > 0) {
                i2 = 1;
            }
            int abs = Math.abs(i);
            A0D(this, r7, i2, abs, true);
            C41991xR r0 = this.A04;
            int A1S = r0.A08 + A1S(r0, r6, r7, false);
            if (A1S >= 0) {
                if (abs > A1S) {
                    i = i2 * A1S;
                }
                this.A06.A0C(-i);
                this.A04.A04 = i;
                return i;
            }
        }
        return 0;
    }

    public View A1U(int i, int i2) {
        C38291r3 r0;
        A1Y();
        if (i2 <= i && i2 >= i) {
            return A0P(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A09(A0P(i)) < this.A06.A04()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A01 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i3, i4);
    }

    public View A1V(int i, int i2, boolean z, boolean z2) {
        C38291r3 r0;
        A1Y();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        if (this.A01 == 0) {
            r0 = this.A08;
        } else {
            r0 = this.A09;
        }
        return r0.A00(i, i2, i4, i3);
    }

    public void A1b(C38321r6 r12, C41991xR r13, C37931qQ r14, C38021qZ r15) {
        int A0O;
        int A082;
        int i;
        int i2;
        View A002 = r13.A00(r14);
        if (A002 == null) {
            r12.A01 = true;
            return;
        }
        C38491rN r8 = (C38491rN) A002.getLayoutParams();
        List list = r13.A09;
        boolean z = this.A0A;
        int i3 = r13.A05;
        boolean z2 = false;
        if (list == null) {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                C38251qy.A04(A002, this, -1, false);
            } else {
                C38251qy.A04(A002, this, 0, false);
            }
        } else {
            if (i3 == -1) {
                z2 = true;
            }
            if (z == z2) {
                C38251qy.A04(A002, this, -1, true);
            } else {
                C38251qy.A04(A002, this, 0, true);
            }
        }
        A0U(A002);
        r12.A00 = this.A06.A07(A002);
        if (this.A01 == 1) {
            if (A1f()) {
                i = this.A03 - A0N();
                i2 = i - this.A06.A08(A002);
            } else {
                i2 = A0M();
                i = this.A06.A08(A002) + i2;
            }
            int i4 = r13.A05;
            int i5 = r13.A07;
            int i6 = r12.A00;
            A082 = i5 + i6;
            A0O = i5;
            if (i4 == -1) {
                A0O = i5 - i6;
                A082 = i5;
            }
        } else {
            A0O = A0O();
            A082 = this.A06.A08(A002) + A0O;
            int i7 = r13.A05;
            int i8 = r13.A07;
            int i9 = r12.A00;
            i = i8 + i9;
            i2 = i8;
            if (i7 == -1) {
                i2 = i8 - i9;
                i = i8;
            }
        }
        C38251qy.A03(A002, i2, A0O, i, A082);
        int i10 = r8.A00.A00;
        if (!((i10 & 8) == 0 && (i10 & 2) == 0)) {
            r12.A03 = true;
        }
        r12.A02 = A002.hasFocusable();
    }

    public PointF BFT(int i) {
        PointF pointF;
        if (A0J() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < C38251qy.A02(A0P(0))) {
            z = true;
        }
        if (z != this.A0A) {
            i2 = -1;
        }
        float f = (float) i2;
        if (this.A01 == 0) {
            return pointF;
        }
        pointF = new PointF(0.0f, f);
        return pointF;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1r6, java.lang.Object] */
    public LinearLayoutManager(Context context, int i, boolean z) {
        this.A01 = 1;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A0C = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0E = new C38311r5();
        this.A0F = new Object();
        this.A00 = 2;
        this.A0D = new int[2];
        A1Z(i);
        A1d(z);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.1r6, java.lang.Object] */
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A01 = 1;
        this.A09 = false;
        this.A0A = false;
        this.A0B = false;
        this.A0C = true;
        this.A02 = -1;
        this.A03 = Integer.MIN_VALUE;
        this.A05 = null;
        this.A0E = new C38311r5();
        this.A0F = new Object();
        this.A00 = 2;
        this.A0D = new int[2];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C38191qq.A00, i, i2);
        int i3 = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.getInt(10, 1);
        boolean z = obtainStyledAttributes.getBoolean(9, false);
        boolean z2 = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        A1Z(i3);
        A1d(z);
        A1e(z2);
    }
}
