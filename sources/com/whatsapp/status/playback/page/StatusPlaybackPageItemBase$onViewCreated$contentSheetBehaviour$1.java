package com.whatsapp.status.playback.page;

import X.AnonymousClass1HF;
import X.AnonymousClass6Gp;
import X.C18070vi;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.util.Log;

public final class StatusPlaybackPageItemBase$onViewCreated$contentSheetBehaviour$1 extends BottomSheetBehavior {
    public final /* synthetic */ AnonymousClass6Gp A00;

    public StatusPlaybackPageItemBase$onViewCreated$contentSheetBehaviour$1(AnonymousClass6Gp r1) {
        this.A00 = r1;
    }

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18070vi.A0h(coordinatorLayout, view);
        C18070vi.A0d(motionEvent, 2);
        if (this.A00.A01.A0J == 3 || motionEvent.getPointerCount() >= 2 || !super.A0K(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18070vi.A0n(coordinatorLayout, view, motionEvent);
        if (this.A00.A01.A0J != 3) {
            try {
                return super.A0L(motionEvent, view, coordinatorLayout);
            } catch (IllegalArgumentException e) {
                Log.e("StatusPlaybackPageItem/onTouchEvent/IllegalArgumentException", e);
            }
        }
        return false;
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        boolean A16 = C18070vi.A16(coordinatorLayout, view);
        super.A0O(view, coordinatorLayout, i);
        AnonymousClass1HF.A0a(view, -view.getTop());
        return A16;
    }
}
