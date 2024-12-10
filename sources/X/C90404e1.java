package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/* renamed from: X.4e1  reason: invalid class name and case insensitive filesystem */
public class C90404e1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass4SZ A01;

    public C90404e1(AnonymousClass4SZ r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onGlobalLayout() {
        AnonymousClass4SZ r5 = this.A01;
        View view = r5.A03;
        AnonymousClass3MY.A1D(view, this);
        float height = (float) view.getHeight();
        float f = this.A00;
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f - (f / height), 1, 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(translateAnimation);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 0, (height - f) * 1.4f, 0, 0.0f));
        animationSet.setDuration(300);
        r5.A05.startAnimation(animationSet);
        r5.A04.startAnimation(animationSet);
    }
}
