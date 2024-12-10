package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.5kJ  reason: invalid class name and case insensitive filesystem */
public class C111715kJ extends C113695nZ {
    public C38331r7 A00;
    public final double A01 = 0.8d;
    public final boolean A02 = true;

    public int A04(C38251qy r6, int i, int i2) {
        int A0K;
        View A05;
        int A022;
        if (!(r6 instanceof C38261qz) || (A0K = r6.A0K()) == 0 || (A05 = A05(r6)) == null || (A022 = C38251qy.A02(A05)) == -1 || ((C38261qz) r6).BFT(A0K - 1) == null) {
            return -1;
        }
        int A04 = super.A04(r6, i, i2);
        if (A04 != -1 || i == 0) {
            return A04;
        }
        return A022 + (Math.abs(i) / i);
    }

    public View A05(C38251qy r13) {
        if ((r13 instanceof LinearLayoutManager) && r13.A1I()) {
            C38331r7 r10 = this.A00;
            if (r10 == null) {
                r10 = new AnonymousClass28F(r13, 0);
                this.A00 = r10;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r13;
            int A1O = linearLayoutManager.A1O();
            boolean A1T = AnonymousClass000.A1T(linearLayoutManager.A1P(), r13.A0K() - 1);
            if (!this.A02 || linearLayoutManager.A1N() == 0 || A1T) {
                if (A1O == -1 || A1T) {
                    return null;
                }
                View A0j = r13.A0j(A1O);
                if (((double) r10.A06(A0j)) >= ((double) r10.A07(A0j)) * this.A01 && r10.A06(A0j) > 0) {
                    return A0j;
                }
                if (linearLayoutManager.A1P() != r13.A0K() - 1) {
                    return r13.A0j(A1O + 1);
                }
                return null;
            }
        }
        return super.A05(r13);
    }

    public int[] A0A(View view, C38251qy r7) {
        if (this.A02) {
            int A022 = C38251qy.A02(view);
            boolean A1P = AnonymousClass000.A1P(A022);
            boolean A1T = AnonymousClass000.A1T(A022, r7.A0K() - 1);
            if (!A1P && !A1T) {
                return super.A0A(view, r7);
            }
        }
        int[] A1W = C108945cZ.A1W();
        C38331r7 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass28F(r7, 0);
            this.A00 = r0;
        }
        A1W[0] = r0.A09(view) - r0.A04();
        A1W[1] = 0;
        return A1W;
    }
}
