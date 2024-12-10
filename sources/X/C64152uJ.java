package X;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.whatsapp.HomeActivity;

/* renamed from: X.2uJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64152uJ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ FrameLayout.LayoutParams A00;
    public final /* synthetic */ LinearLayout.LayoutParams A01;
    public final /* synthetic */ HomeActivity A02;
    public final /* synthetic */ boolean A03;

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        HomeActivity homeActivity = this.A02;
        boolean z = this.A03;
        FrameLayout.LayoutParams layoutParams = this.A00;
        LinearLayout.LayoutParams layoutParams2 = this.A01;
        int A0M = AnonymousClass000.A0M(valueAnimator.getAnimatedValue());
        if (z) {
            layoutParams.height = A0M;
        } else {
            layoutParams2.height = A0M;
        }
        homeActivity.A0B.setLayoutParams(layoutParams2);
        homeActivity.A07.setLayoutParams(layoutParams);
    }

    public /* synthetic */ C64152uJ(FrameLayout.LayoutParams layoutParams, LinearLayout.LayoutParams layoutParams2, HomeActivity homeActivity, boolean z) {
        this.A02 = homeActivity;
        this.A03 = z;
        this.A00 = layoutParams;
        this.A01 = layoutParams2;
    }
}
