package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass1DC;
import X.AnonymousClass3MY;
import X.C18000vb;
import X.C77643r4;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.WaImageButton;

public class GroupCallSelectedContactsList extends C77643r4 {
    public int A00;
    public int A01;
    public WaImageButton A02;
    public WaImageButton A03;
    public C18000vb A04;
    public AnonymousClass1DC A05;

    private void setUpSelectedButtonAnimatorSet(Animator animator, AnimatorSet animatorSet) {
        int i = this.A00;
        int i2 = this.A00;
        int i3 = i + i2;
        int i4 = -1;
        int i5 = 1;
        if (AnonymousClass3MY.A1b(this.A04)) {
            i5 = -1;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A02, "translationX", new float[]{(float) (i3 * i5)});
        ofFloat.setDuration(240).setInterpolator(new DecelerateInterpolator());
        ofFloat.setStartDelay(50);
        int i6 = this.A01 + i2;
        if (!AnonymousClass3MY.A1b(this.A04)) {
            i4 = 1;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A03, "translationX", new float[]{(float) (i6 * i4)});
        ofFloat2.setDuration(240).setInterpolator(new DecelerateInterpolator());
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        if (animator == null) {
            play.with(ofFloat2);
        } else {
            play.with(ofFloat2).after(animator);
        }
    }

    public void A03(Animator animator) {
        setUpSelectedButtonAnimatorSet(animator, this.A02);
        this.A02.start();
    }

    public int getSelectedContactsListLeftPadding() {
        return getResources().getDimensionPixelSize(2131168604);
    }

    public int getSelectedContactsLayout() {
        return 2131626869;
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupCallSelectedContactsList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public GroupCallSelectedContactsList(Context context) {
        super(context, (AttributeSet) null);
        A01();
    }
}
