package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* renamed from: X.8jf  reason: invalid class name and case insensitive filesystem */
public final class C168778jf extends AnonymousClass8IO {
    public void A0C() {
        View view = this.A0H;
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), 2130772026);
        loadAnimation.setStartOffset((loadAnimation.getDuration() / 4) * ((long) (A05() % 4)));
        view.startAnimation(loadAnimation);
    }
}
