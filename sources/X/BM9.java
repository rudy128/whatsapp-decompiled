package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BM9 extends AnonymousClass2S0 {
    public RecyclerView A00;
    public Scroller A01;
    public final C39711tW A02 = new BMC(this);

    public abstract int A04(C38251qy r1, int i, int i2);

    public abstract View A05(C38251qy r1);

    public abstract int[] A0A(View view, C38251qy r2);

    public boolean A03(int i, int i2) {
        BMI A06;
        int A04;
        RecyclerView recyclerView = this.A00;
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || recyclerView.A0B == null) {
            return false;
        }
        int i3 = recyclerView.A0q;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(layoutManager instanceof C38261qz) || (A06 = A06(layoutManager)) == null || (A04 = A04(layoutManager, i, i2)) == -1) {
            return false;
        }
        A06.A00 = A04;
        layoutManager.A0e(A06);
        return true;
    }

    @Deprecated
    public BMI A06(C38251qy r4) {
        if (!(r4 instanceof C38261qz)) {
            return null;
        }
        return new BLn(this.A00.getContext(), this, 1);
    }

    public void A07() {
        C38251qy layoutManager;
        View A05;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (A05 = A05(layoutManager)) != null) {
            int[] A0A = A0A(A05, layoutManager);
            int A0I = BE6.A0I(A0A);
            if (A0I != 0 || A0A[1] != 0) {
                this.A00.A0l(A0I, A0A[1]);
            }
        }
    }

    public void A08(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0u(this.A02);
                this.A00.A0E = null;
            }
            this.A00 = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.A0E == null) {
                recyclerView.A0t(this.A02);
                RecyclerView recyclerView3 = this.A00;
                recyclerView3.A0E = this;
                this.A01 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A07();
                return;
            }
            throw AnonymousClass000.A0n("An instance of OnFlingListener already set.");
        }
    }

    public int[] A09(int i, int i2) {
        int[] A1W = C108945cZ.A1W();
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A1W[0] = this.A01.getFinalX();
        A1W[1] = this.A01.getFinalY();
        return A1W;
    }
}
