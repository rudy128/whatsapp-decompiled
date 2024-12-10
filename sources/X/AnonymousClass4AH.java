package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4AH  reason: invalid class name */
public final class AnonymousClass4AH extends AnonymousClass6UY {
    public static final AnonymousClass4AH A00 = new Object();

    public void A00(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            AnonymousClass3MZ.A1F(view, layoutParams);
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new C90224dj((Object) view, 9));
                return;
            }
            BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
            A02.A0Y(view.getHeight(), false);
            A02.A0W(3);
            A02.A0h = true;
            return;
        }
        throw AnonymousClass3MY.A0k();
    }
}
