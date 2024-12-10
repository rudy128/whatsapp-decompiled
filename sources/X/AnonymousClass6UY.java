package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.6UY  reason: invalid class name */
public abstract class AnonymousClass6UY {
    public void A00(View view) {
        if (this instanceof AnonymousClass6P4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -1;
                view.setLayoutParams(layoutParams);
                if (!view.isLaidOut() || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new AnonymousClass78Z(view, this, 6));
                    return;
                }
                BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
                C108995ce.A15(A02, view.getHeight());
                A02.A0Z(new C114255qP(A02, this, 4));
                return;
            }
            throw AnonymousClass3MY.A0k();
        }
        ((AnonymousClass6P3) this).A00.A2K(view);
    }
}
