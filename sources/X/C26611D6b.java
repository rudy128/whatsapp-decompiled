package X;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.D6b  reason: case insensitive filesystem */
public class C26611D6b implements E3b {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ CoordinatorLayout A02;
    public final /* synthetic */ AppBarLayout.BaseBehavior A03;
    public final /* synthetic */ AppBarLayout A04;

    public C26611D6b(View view, CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, int i) {
        this.A03 = baseBehavior;
        this.A02 = coordinatorLayout;
        this.A04 = appBarLayout;
        this.A01 = view;
        this.A00 = i;
    }

    public boolean CBT(View view) {
        AppBarLayout.BaseBehavior baseBehavior = this.A03;
        CoordinatorLayout coordinatorLayout = this.A02;
        AppBarLayout appBarLayout = this.A04;
        View view2 = this.A01;
        int i = this.A00;
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 0;
        A1W[1] = 0;
        baseBehavior.A0U(view2, coordinatorLayout, appBarLayout, A1W, i);
        return true;
    }
}
