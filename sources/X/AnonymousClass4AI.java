package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4AI  reason: invalid class name */
public final class AnonymousClass4AI extends AnonymousClass6UY {
    public static final AnonymousClass4AI A00 = new Object();

    public void A00(View view) {
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new C90224dj((Object) view, 10));
            return;
        }
        BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
        A02.A0Y(C72463Mc.A0L(view).getHeight() / 2, false);
        A02.A0W(4);
        A02.A0h = true;
    }
}
