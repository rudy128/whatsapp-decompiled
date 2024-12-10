package com.whatsapp.status.playback.page;

import X.AnonymousClass6Gp;
import X.C18070vi;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class StatusPlaybackPageItemBase$bottomSheetBehavior$1 extends BottomSheetBehavior {
    public float A00;
    public boolean A01;
    public final /* synthetic */ AnonymousClass6Gp A02;

    public StatusPlaybackPageItemBase$bottomSheetBehavior$1(AnonymousClass6Gp r1) {
        this.A02 = r1;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean A15 = C18070vi.A15(coordinatorLayout, view);
        C18070vi.A0d(motionEvent, 2);
        if ((!this.A01 && view.isShown()) || motionEvent.getPointerCount() >= 2) {
            return A15;
        }
        boolean A0K = super.A0K(motionEvent, view, coordinatorLayout);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A00 = motionEvent.getY();
        } else if (actionMasked == 2 && this.A00 < motionEvent.getY() && this.A0J == 4) {
            return false;
        } else {
            return A0K;
        }
        return A0K;
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A01 = C18070vi.A16(coordinatorLayout, view);
        return super.A0O(view, coordinatorLayout, i);
    }
}
