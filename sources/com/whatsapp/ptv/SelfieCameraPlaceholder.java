package com.whatsapp.ptv;

import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.BE7;
import X.C18070vi;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;

public final class SelfieCameraPlaceholder extends FrameLayout {
    public final AnimatorSet A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelfieCameraPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(2131232949);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView);
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131232949);
        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(imageView2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "scaleX", new float[]{1.0f, 1.5f});
        ofFloat.setDuration(1200);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, "rotation", new float[]{0.0f, 5.0f, 0.0f, -4.0f, 0.0f});
        ofFloat2.setDuration(1100);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "scaleY", new float[]{1.0f, 1.5f});
        ofFloat3.setDuration(1400);
        ofFloat3.setRepeatCount(-1);
        ofFloat3.setRepeatMode(2);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView2, "alpha", new float[]{0.0f, 0.5f});
        ofFloat4.setDuration(1700);
        ofFloat4.setRepeatCount(-1);
        ofFloat4.setRepeatMode(2);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[4];
        AnonymousClass3MY.A1V(ofFloat, ofFloat2, animatorArr);
        BE7.A1F(ofFloat3, ofFloat4, animatorArr);
        animatorSet.playTogether(animatorArr);
        this.A00 = animatorSet;
        A00();
    }

    private final void A00() {
        if (getVisibility() == 0) {
            AnimatorSet animatorSet = this.A00;
            if (!animatorSet.isStarted()) {
                animatorSet.start();
                return;
            }
        }
        if (getVisibility() != 0) {
            AnimatorSet animatorSet2 = this.A00;
            if (animatorSet2.isRunning()) {
                animatorSet2.pause();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.end();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SelfieCameraPlaceholder(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ SelfieCameraPlaceholder(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }
}
