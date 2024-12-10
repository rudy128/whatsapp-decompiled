package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.1Yb  reason: invalid class name and case insensitive filesystem */
public class C27901Yb extends AnonymousClass1YV {
    public StateListAnimator A00;

    private AnimatorSet A02(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnonymousClass1YQ r7 = this.A0I;
        animatorSet.play(ObjectAnimator.ofFloat(r7, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(r7, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(AnonymousClass1YV.A0O);
        return animatorSet;
    }

    public void A05() {
        if (Build.VERSION.SDK_INT == 21) {
            AnonymousClass1YQ r2 = this.A0I;
            float f = 0.0f;
            if (r2.isEnabled()) {
                r2.setElevation(this.A00);
                if (r2.isPressed()) {
                    f = this.A03;
                } else if (r2.isFocused() || r2.isHovered()) {
                    f = this.A01;
                }
            } else {
                r2.setElevation(0.0f);
            }
            r2.setTranslationZ(f);
        }
    }

    public void A06(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        AnonymousClass1YQ r4 = this.A0I;
        if (i == 21) {
            r4.refreshDrawableState();
        } else if (r4.getStateListAnimator() == this.A00) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(AnonymousClass1YV.A0U, A02(f, f3));
            stateListAnimator.addState(AnonymousClass1YV.A0T, A02(f, f2));
            stateListAnimator.addState(AnonymousClass1YV.A0R, A02(f, f2));
            stateListAnimator.addState(AnonymousClass1YV.A0S, A02(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(r4, "elevation", new float[]{f}).setDuration(0));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(r4, View.TRANSLATION_Z, new float[]{r4.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(r4, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(AnonymousClass1YV.A0O);
            stateListAnimator.addState(AnonymousClass1YV.A0Q, animatorSet);
            stateListAnimator.addState(AnonymousClass1YV.A0P, A02(0.0f, 0.0f));
            this.A00 = stateListAnimator;
            r4.setStateListAnimator(stateListAnimator);
        }
        if (((C27891Ya) this.A0J).A00.A04 || (this.A0F && AnonymousClass1YQ.A00(r4, r4.A01) < this.A06)) {
            A04();
        }
    }

    public void A07(ColorStateList colorStateList) {
        Drawable drawable = this.A09;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(AnonymousClass1ZD.A02(colorStateList));
        } else {
            super.A07(colorStateList);
        }
    }

    public void A08(Rect rect) {
        int i;
        if (((C27891Ya) this.A0J).A00.A04) {
            super.A08(rect);
            return;
        }
        if (this.A0F) {
            AnonymousClass1YQ r2 = this.A0I;
            int A002 = AnonymousClass1YQ.A00(r2, r2.A01);
            int i2 = this.A06;
            if (A002 < i2) {
                i = (i2 - AnonymousClass1YQ.A00(r2, r2.A01)) / 2;
                rect.set(i, i, i, i);
            }
        }
        i = 0;
        rect.set(i, i, i, i);
    }
}
