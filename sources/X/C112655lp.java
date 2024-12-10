package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5lp  reason: invalid class name and case insensitive filesystem */
public class C112655lp extends C40611uz {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04;
    public final boolean A05;
    public final C143867Fc A06;
    public final boolean A07;

    public C112655lp(C143867Fc r2, int i, int i2, boolean z, boolean z2) {
        this.A01 = i;
        this.A05 = z;
        this.A07 = z2;
        this.A00 = i2;
        this.A06 = r2;
    }

    public int hashCode() {
        Object[] objArr = new Object[4];
        AnonymousClass000.A1L(objArr, this.A01);
        objArr[1] = Boolean.valueOf(this.A03);
        AnonymousClass3Ma.A1S(objArr, this.A00);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A07), objArr, 3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C112655lp)) {
            return false;
        }
        C112655lp r4 = (C112655lp) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00 && this.A03 == r4.A03 && this.A07 == r4.A07) {
            return true;
        }
        return false;
    }

    public void A05(Rect rect, View view, C38021qZ r17, RecyclerView recyclerView) {
        int A012;
        int i;
        int A022;
        int i2;
        int i3;
        int i4;
        int i5;
        int A002 = RecyclerView.A00(view);
        if (this.A04) {
            A012 = 3;
        } else if (this.A07) {
            A012 = r17.A00();
        } else {
            A012 = this.A06.A01(r17.A00(), this.A03);
        }
        int i6 = A002 % A012;
        boolean z = this.A07;
        int i7 = 0;
        if (!z || !this.A02 || A012 >= 3 || i6 != 0) {
            i = 0;
        } else {
            int width = recyclerView.getWidth();
            recyclerView.getContext();
            i = ((width - (((int) (((double) width) / (3.0d + 0.25d))) * A012)) - ((A012 - 1) * this.A01)) / 2;
        }
        if (z) {
            A022 = 1;
        } else if (this.A04) {
            A022 = ((r17.A00() - 1) / 3) + 1;
        } else {
            A022 = this.A06.A02(r17.A00(), this.A03);
        }
        if (this.A04) {
            if (A002 / A012 == A022 - 1) {
                i = ((recyclerView.getWidth() / A012) * ((A022 * A012) - r17.A00())) / 2;
            }
            i5 = this.A01 / 2;
            i3 = i5 + i;
            i4 = i5 - i;
            i7 = i5;
        } else {
            int A003 = (A002 * A022) / r17.A00();
            if (i6 != 0) {
                i2 = this.A01 / 2;
            } else if ((this.A00 & 4) == 4) {
                i2 = this.A01;
            } else {
                i2 = 0;
            }
            i3 = i2 + i;
            if (i6 != A012 - 1) {
                i4 = this.A01 / 2;
            } else if ((this.A00 & 8) == 8) {
                i4 = this.A01;
            } else {
                i4 = 0;
            }
            if (A003 != 0) {
                i5 = this.A01 / 2;
            } else if ((this.A00 & 1) == 1) {
                i5 = this.A01;
            } else {
                i5 = 0;
            }
            if (A003 != A022 - 1) {
                i7 = this.A01 / 2;
            } else if ((this.A00 & 2) == 2) {
                i7 = this.A01;
            }
        }
        int i8 = i4;
        if (this.A05) {
            i8 = i3;
            i3 = i4;
        }
        rect.set(i8, i5, i3, i7);
    }
}
