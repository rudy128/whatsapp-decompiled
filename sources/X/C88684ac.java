package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.4ac  reason: invalid class name and case insensitive filesystem */
public class C88684ac implements ValueAnimator.AnimatorUpdateListener {
    public final View A00;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.A00;
        ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(view);
        A0B.setMargins(A0B.leftMargin, AnonymousClass000.A0M(valueAnimator.getAnimatedValue()), A0B.rightMargin, A0B.bottomMargin);
        view.setLayoutParams(A0B);
    }

    public C88684ac(View view) {
        this.A00 = view;
    }
}
