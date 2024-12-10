package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* renamed from: X.5kI  reason: invalid class name and case insensitive filesystem */
public final class C111705kI extends C113695nZ {
    public final C18000vb A00;

    public int[] A0A(View view, C38251qy r8) {
        int right;
        int A02;
        char A17 = C18070vi.A17(r8, view);
        if (!r8.A1I()) {
            return super.A0A(view, r8);
        }
        int[] A1W = C108945cZ.A1W();
        AnonymousClass28F r2 = new AnonymousClass28F(r8, 0);
        if (AnonymousClass3MY.A1b(this.A00)) {
            right = view.getLeft();
            A02 = r2.A04();
        } else {
            right = view.getRight();
            A02 = r2.A02();
        }
        A1W[0] = right - A02;
        A1W[A17] = 0;
        return A1W;
    }

    public boolean A03(int i, int i2) {
        if (i < -3000) {
            i = -3000;
        } else if (i > 3000) {
            i = 3000;
        }
        return super.A03(i, i2);
    }

    public View A05(C38251qy r10) {
        if (!(r10 instanceof LinearLayoutManager) || !r10.A1I()) {
            return null;
        }
        AnonymousClass28F r8 = new AnonymousClass28F(r10, 0);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r10;
        int A1O = linearLayoutManager.A1O();
        boolean A1T = AnonymousClass000.A1T(linearLayoutManager.A1P(), linearLayoutManager.A0K() - 1);
        if (A1O != -1 && !A1T) {
            View A0j = r10.A0j(A1O);
            int A06 = r8.A06(A0j);
            int A07 = r8.A07(A0j) / 2;
            if (AnonymousClass3MW.A1Z(this.A00)) {
                A06 = r8.A02.A03 - r8.A09(A0j);
            }
            if (A06 >= A07) {
                return A0j;
            }
            if (linearLayoutManager.A1N() != linearLayoutManager.A0K() - 1) {
                return r10.A0j(A1O + 1);
            }
        }
        return null;
    }

    public C111705kI(C18000vb r1) {
        this.A00 = r1;
    }
}
