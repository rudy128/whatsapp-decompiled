package X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;

/* renamed from: X.5qx  reason: invalid class name and case insensitive filesystem */
public class C114515qx extends C90704eV {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ AnonymousClass74M A04;

    public C114515qx(View view, View view2, View view3, View view4, AnonymousClass74M r5) {
        this.A04 = r5;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = view3;
        this.A00 = view4;
    }

    public void onAnimationEnd(Animation animation) {
        this.A01.setVisibility(8);
        if (this.A04.A0J != null) {
            this.A02.setVisibility(8);
            return;
        }
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(160);
        RotateAnimation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(160);
        rotateAnimation.setFillAfter(true);
        animationSet.addAnimation(rotateAnimation);
        animationSet.addAnimation(translateAnimation);
        this.A03.startAnimation(animationSet);
        View view = this.A02;
        view.postDelayed(new AnonymousClass7RO(this, view, this.A00, 35), 500);
    }
}
