package X;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.5Pk  reason: invalid class name and case insensitive filesystem */
public final class C104765Pk extends AnonymousClass11G implements C18090vk {
    public static final C104765Pk A00 = new C104765Pk();

    public C104765Pk() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        ofFloat.setDuration(1000);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        return ofFloat;
    }
}
