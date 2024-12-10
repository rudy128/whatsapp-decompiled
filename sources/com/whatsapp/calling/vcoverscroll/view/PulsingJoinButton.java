package com.whatsapp.calling.vcoverscroll.view;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass00R;
import X.AnonymousClass031;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5EK;
import X.AnonymousClass5EL;
import X.C18070vi;
import X.C18100vl;
import X.C43531zx;
import X.C72453Mb;
import X.C90224dj;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

public final class PulsingJoinButton extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final C18100vl A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PulsingJoinButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    private final AnimationSet getJoinBtnPulseAnimatorSet() {
        return (AnimationSet) this.A04.getValue();
    }

    private final WaImageView getPulse() {
        return (WaImageView) this.A05.getValue();
    }

    private final float getScaleSize() {
        return C72453Mb.A00(this.A02);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final WDSButton getButton() {
        return (WDSButton) this.A03.getValue();
    }

    public final void A00() {
        if (getPulse().getAnimation() == null) {
            WaImageView pulse = getPulse();
            pulse.setImageDrawable(getButton().getBackground());
            ViewGroup.LayoutParams layoutParams = pulse.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = getButton().getWidth();
                layoutParams.height = getButton().getHeight();
                pulse.setLayoutParams(layoutParams);
                pulse.startAnimation(getJoinBtnPulseAnimatorSet());
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getPulse().clearAnimation();
        getPulse().setBackground((Drawable) null);
        getPulse().setScaleX(1.0f);
        getPulse().setScaleY(1.0f);
        getPulse().setAlpha(1.0f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PulsingJoinButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        Integer num = AnonymousClass00R.A0C;
        this.A03 = C43531zx.A02(this, num, 2131428578);
        this.A05 = C43531zx.A02(this, num, 2131434232);
        View.inflate(context, 2131626643, this);
        setClipChildren(false);
        setClipToOutline(false);
        setClipToPadding(false);
        WDSButton button = getButton();
        if (!button.isLaidOut() || button.isLayoutRequested()) {
            button.addOnLayoutChangeListener(new C90224dj((Object) this, 1));
        } else {
            A00();
        }
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5EK(this));
        this.A02 = AnonymousClass1DF.A01(new AnonymousClass5EL(this));
    }

    public /* synthetic */ PulsingJoinButton(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PulsingJoinButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
