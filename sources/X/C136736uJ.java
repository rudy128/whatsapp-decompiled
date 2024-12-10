package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.6uJ  reason: invalid class name and case insensitive filesystem */
public final class C136736uJ {
    public final C18030ve A00;
    public final AnonymousClass1KB A01;

    public final void A00(Activity activity) {
        C18070vi.A0d(activity, 0);
        if (C87544Vz.A00(this.A00)) {
            activity.overridePendingTransition(0, 0);
        }
    }

    public final void A01(View view, BottomSheetBehavior bottomSheetBehavior, AnonymousClass1FU r11, AnonymousClass1L4 r12) {
        AnonymousClass3Ma.A1O(view, 1, r12);
        A02(view, bottomSheetBehavior, r11, r12, (Float) null, true, true);
    }

    public final void A02(View view, BottomSheetBehavior bottomSheetBehavior, AnonymousClass1FU r5, AnonymousClass1L4 r6, Float f, boolean z, boolean z2) {
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0d(true);
            bottomSheetBehavior.A0h = z;
            if (f != null) {
                bottomSheetBehavior.A0T(f.floatValue());
            }
            if (!z && f != null) {
                bottomSheetBehavior.A0Z(new C114255qP(f, bottomSheetBehavior, 3));
            }
            bottomSheetBehavior.A0Z(new C114285qS(view, r5, r6, z2));
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C18070vi.A0z(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((C37891qK) layoutParams).A00(bottomSheetBehavior);
        }
    }

    public final void A03(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        if (bottomSheetBehavior != null) {
            this.A01.A0J(new C70813Cp(44, (Object) bottomSheetBehavior, z));
        }
    }

    public C136736uJ(AnonymousClass1KB r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
