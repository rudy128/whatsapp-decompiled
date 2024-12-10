package X;

import android.view.View;

/* renamed from: X.1r5  reason: invalid class name and case insensitive filesystem */
public class C38311r5 {
    public int A00;
    public int A01;
    public C38331r7 A02;
    public boolean A03;
    public boolean A04;

    public void A00() {
        this.A01 = -1;
        this.A00 = Integer.MIN_VALUE;
        this.A03 = false;
        this.A04 = false;
    }

    public void A01(View view, int i) {
        int A09;
        int A05;
        boolean z = this.A03;
        C38331r7 r0 = this.A02;
        if (z) {
            int A06 = r0.A06(view);
            C38331r7 r2 = this.A02;
            if (Integer.MIN_VALUE == r2.A00) {
                A05 = 0;
            } else {
                A05 = r2.A05() - r2.A00;
            }
            A09 = A06 + A05;
        } else {
            A09 = r0.A09(view);
        }
        this.A00 = A09;
        this.A01 = i;
    }

    public void A02(View view, int i) {
        int A05;
        int min;
        C38331r7 r2 = this.A02;
        if (Integer.MIN_VALUE == r2.A00 || (A05 = r2.A05() - r2.A00) >= 0) {
            A01(view, i);
            return;
        }
        this.A01 = i;
        boolean z = this.A03;
        C38331r7 r0 = this.A02;
        if (z) {
            int A022 = (r0.A02() - A05) - this.A02.A06(view);
            this.A00 = this.A02.A02() - A022;
            if (A022 > 0) {
                int A07 = this.A00 - this.A02.A07(view);
                int A042 = this.A02.A04();
                int min2 = A07 - (A042 + Math.min(this.A02.A09(view) - A042, 0));
                if (min2 < 0) {
                    min = this.A00 + Math.min(A022, -min2);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int A09 = r0.A09(view);
            int A043 = A09 - this.A02.A04();
            this.A00 = A09;
            if (A043 > 0) {
                int A023 = (this.A02.A02() - Math.min(0, (this.A02.A02() - A05) - this.A02.A06(view))) - (A09 + this.A02.A07(view));
                if (A023 < 0) {
                    min = this.A00 - Math.min(A043, -A023);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A00 = min;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AnchorInfo{mPosition=");
        sb.append(this.A01);
        sb.append(", mCoordinate=");
        sb.append(this.A00);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.A03);
        sb.append(", mValid=");
        sb.append(this.A04);
        sb.append('}');
        return sb.toString();
    }

    public C38311r5() {
        A00();
    }
}
