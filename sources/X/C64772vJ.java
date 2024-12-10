package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.2vJ  reason: invalid class name and case insensitive filesystem */
public class C64772vJ implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public C64772vJ(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    public boolean onPreDraw() {
        this.A00.A0D(0);
        return true;
    }
}
