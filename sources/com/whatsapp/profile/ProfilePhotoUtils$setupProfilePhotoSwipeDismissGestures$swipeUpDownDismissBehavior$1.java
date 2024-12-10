package com.whatsapp.profile;

import X.AnonymousClass1FU;
import X.AnonymousClass8BX;
import X.C26281Cwc;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.gesture.VerticalSwipeDismissBehavior;
import com.whatsapp.mediaview.PhotoView;

public final class ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1 extends VerticalSwipeDismissBehavior {
    public final /* synthetic */ PhotoView A00;

    public boolean A0K(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (motionEvent.getPointerCount() <= AnonymousClass8BX.A1U(coordinatorLayout, view, motionEvent) && !this.A00.A0D()) {
            return super.A0K(motionEvent, view, coordinatorLayout);
        }
        C26281Cwc cwc = this.A03;
        if (cwc != null) {
            cwc.A0B();
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfilePhotoUtils$setupProfilePhotoSwipeDismissGestures$swipeUpDownDismissBehavior$1(AnonymousClass1FU r1, PhotoView photoView) {
        super(r1);
        this.A00 = photoView;
    }
}
