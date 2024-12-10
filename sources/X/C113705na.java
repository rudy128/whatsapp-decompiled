package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.5na  reason: invalid class name and case insensitive filesystem */
public class C113705na extends BM9 {
    public C38331r7 A00;
    public C38331r7 A01;

    public BMI A06(C38251qy r4) {
        if (!(r4 instanceof C38261qz)) {
            return null;
        }
        return new BLn(this.A00.getContext(), this, 0);
    }

    public int A04(C38251qy r12, int i, int i2) {
        C38331r7 r9;
        PointF BFT;
        int A0K = r12.A0K();
        if (A0K != 0) {
            if (r12.A1J()) {
                r9 = this.A01;
                if (r9 == null || r9.A02 != r12) {
                    r9 = new AnonymousClass28F(r12, 1);
                    this.A01 = r9;
                }
            } else if (r12.A1I()) {
                r9 = this.A00;
                if (r9 == null || r9.A02 != r12) {
                    r9 = new AnonymousClass28F(r12, 0);
                    this.A00 = r9;
                }
            }
            int A0J = r12.A0J();
            View view = null;
            View view2 = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < A0J; i5++) {
                View A0P = r12.A0P(i5);
                if (A0P != null) {
                    int A02 = C109005cf.A02(A0P, r9);
                    if (A02 <= 0) {
                        if (A02 > i3) {
                            view2 = A0P;
                            i3 = A02;
                        }
                        if (A02 < 0) {
                        }
                    }
                    if (A02 < i4) {
                        view = A0P;
                        i4 = A02;
                    }
                }
            }
            boolean z = true;
            if (!r12.A1I() ? i2 <= 0 : i <= 0) {
                z = false;
                if (view2 != null) {
                    return C38251qy.A02(view2);
                }
            } else if (view != null) {
                return C38251qy.A02(view);
            } else {
                view = view2;
            }
            if (view != null) {
                int A022 = C38251qy.A02(view);
                int A0K2 = r12.A0K();
                boolean z2 = false;
                if ((r12 instanceof C38261qz) && (BFT = ((C38261qz) r12).BFT(A0K2 - 1)) != null && (BFT.x < 0.0f || BFT.y < 0.0f)) {
                    z2 = true;
                }
                int i6 = 1;
                if (z2 == z) {
                    i6 = -1;
                }
                int i7 = A022 + i6;
                if (i7 < 0 || i7 >= A0K) {
                    return -1;
                }
                return i7;
            }
        }
        return -1;
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
