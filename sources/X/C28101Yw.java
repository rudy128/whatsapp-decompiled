package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.1Yw  reason: invalid class name and case insensitive filesystem */
public final class C28101Yw {
    public int A00 = 0;
    public boolean A01 = false;
    public final View A02;

    public Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.A01);
        bundle.putInt("expandedComponentIdHint", this.A00);
        return bundle;
    }

    public void A01(Bundle bundle) {
        this.A01 = bundle.getBoolean("expanded", false);
        this.A00 = bundle.getInt("expandedComponentIdHint", 0);
        if (this.A01) {
            View view = this.A02;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).A0E(view);
            }
        }
    }

    public C28101Yw(AnonymousClass1YP r2) {
        this.A02 = (View) r2;
    }
}
