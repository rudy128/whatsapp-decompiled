package com.whatsapp.components;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C109195cy;
import X.C17880vN;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimatingArrowsLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public List A01;
    public boolean A02;
    public final AnimatorSet A03;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A03.start();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.A03;
        animatorSet.removeAllListeners();
        animatorSet.end();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = 0;
        this.A01 = Arrays.asList(new View[]{getChildAt(3), getChildAt(2), getChildAt(1), getChildAt(0)});
        ArrayList A0z = C17880vN.A0z(4);
        do {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A01.get(i), "alpha", new float[]{0.0f, 0.6f, 0.0f});
            ofFloat.setDuration(750);
            ofFloat.setStartDelay((long) (i * 100));
            A0z.add(ofFloat);
            i++;
        } while (i < 4);
        AnimatorSet animatorSet = this.A03;
        animatorSet.playTogether(A0z);
        C109195cy.A02(animatorSet, this, 9);
        animatorSet.start();
    }

    public AnimatingArrowsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        this.A03 = C108945cZ.A0B();
    }

    public AnimatingArrowsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
