package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.5qY  reason: invalid class name and case insensitive filesystem */
public class C114345qY extends BottomSheetBehavior {
    public final /* synthetic */ C143087By A00;

    public C114345qY(C143087By r1) {
        this.A00 = r1;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A0G.A0J != 5 || !super.A0K(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }
}
