package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6yz  reason: invalid class name and case insensitive filesystem */
public class C139526yz {
    public C126906dU A00;
    public C126906dU A01;
    public Float A02;
    public Integer A03;

    private int A00(View view, C38331r7 r6) {
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue == 0) {
            return r6.A09(view);
        }
        if (intValue == 1) {
            return r6.A09(view) + (r6.A07(view) / 2);
        }
        if (intValue == 2) {
            return r6.A06(view);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Invalid gravity :");
        throw AnonymousClass001.A12(CCH.A00(num), A10);
    }

    private int A01(C38331r7 r4, C38251qy r5) {
        int i;
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue == 0) {
            Float f = this.A02;
            RecyclerView recyclerView = r5.A07;
            if (recyclerView == null || !recyclerView.A0N) {
                return 0;
            }
            return r4.A04() + Math.round(f.floatValue());
        } else if (intValue == 1) {
            RecyclerView recyclerView2 = r5.A07;
            if (recyclerView2 == null || !recyclerView2.A0N) {
                i = 0;
            } else {
                i = r4.A04();
            }
            return i + (r4.A05() / 2);
        } else if (intValue == 2) {
            RecyclerView recyclerView3 = r5.A07;
            if (recyclerView3 == null || !recyclerView3.A0N) {
                return r4.A01();
            }
            return r4.A02();
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid gravity :");
            throw AnonymousClass001.A12(CCH.A00(num), A10);
        }
    }

    public View A02(C38251qy r9) {
        C126906dU r1;
        if (r9.A1I()) {
            r1 = this.A00;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C126906dU(new AnonymousClass28F(r9, 0), r9);
                this.A00 = r1;
            }
        } else {
            r1 = this.A01;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C126906dU(new AnonymousClass28F(r9, 1), r9);
                this.A01 = r1;
            }
        }
        C38331r7 r6 = r1.A00;
        int A0J = r9.A0J();
        View view = null;
        if (A0J == 0) {
            return null;
        }
        if (this.A03 == AnonymousClass00R.A01 && (r9 instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r9;
            if (linearLayoutManager.A1N() == 0) {
                return r9.A0P(0);
            }
            if (linearLayoutManager.A1P() == r9.A0K() - 1) {
                return r9.A0P(r9.A0J() - 1);
            }
        }
        int A012 = A01(r6, r9);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0J; i2++) {
            View A0P = r9.A0P(i2);
            int A05 = C108945cZ.A05(A00(A0P, r6), A012);
            if (A05 < i) {
                view = A0P;
                i = A05;
            }
        }
        return view;
    }

    public int[] A03(View view, C38251qy r7) {
        int[] A1W = C108945cZ.A1W();
        if (r7.A1I()) {
            C126906dU r1 = this.A00;
            if (r1 == null || r1.A01 != r7) {
                r1 = new C126906dU(new AnonymousClass28F(r7, 0), r7);
                this.A00 = r1;
            }
            C38331r7 r0 = r1.A00;
            A1W[0] = A00(view, r0) - A01(r0, r7);
        } else {
            A1W[0] = 0;
        }
        if (r7.A1J()) {
            C126906dU r12 = this.A01;
            if (r12 == null || r12.A01 != r7) {
                r12 = new C126906dU(new AnonymousClass28F(r7, 1), r7);
                this.A01 = r12;
            }
            C38331r7 r02 = r12.A00;
            A1W[1] = A00(view, r02) - A01(r02, r7);
            return A1W;
        }
        A1W[1] = 0;
        return A1W;
    }
}
