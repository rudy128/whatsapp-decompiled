package X;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

public class D6Y implements E3b {
    public final int A00;
    public final Object A01;

    public D6Y(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean CBT(View view) {
        boolean z;
        int i;
        switch (this.A00) {
            case 0:
                int i2 = ((ViewPager2) view).A00 + 1;
                ViewPager2 viewPager2 = ((C25076CWl) this.A01).A04;
                if (!viewPager2.A09) {
                    return true;
                }
                viewPager2.A03(i2, true);
                return true;
            case 1:
                int i3 = ((ViewPager2) view).A00 - 1;
                ViewPager2 viewPager22 = ((C25076CWl) this.A01).A04;
                if (!viewPager22.A09) {
                    return true;
                }
                viewPager22.A03(i3, true);
                return true;
            case 2:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.A01;
                if (swipeDismissBehavior instanceof BaseTransientBottomBar$Behavior) {
                    z = view instanceof BIE;
                } else {
                    z = true;
                }
                boolean z2 = false;
                if (!z) {
                    return false;
                }
                if (view.getLayoutDirection() == 1) {
                    z2 = true;
                }
                int i4 = swipeDismissBehavior.A02;
                if (i4 != 0 ? i4 != 1 || z2 : !z2) {
                    i = view.getWidth();
                } else {
                    i = -view.getWidth();
                }
                AnonymousClass1HF.A0Z(view, i);
                view.setAlpha(0.0f);
                C28518E5i e5i = swipeDismissBehavior.A04;
                if (e5i == null) {
                    return true;
                }
                e5i.Brq(view);
                return true;
            default:
                return BottomSheetDragHandleView.A02((BottomSheetDragHandleView) this.A01);
        }
    }
}
