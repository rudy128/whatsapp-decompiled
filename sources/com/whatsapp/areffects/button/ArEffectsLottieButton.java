package com.whatsapp.areffects.button;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.C108955ca;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C21453AkK;
import X.C43531zx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.wds.components.button.WDSButton;

public final class ArEffectsLottieButton extends FrameLayout {
    public WDSButton A00;
    public long A01;
    public boolean A02;
    public final C18100vl A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsLottieButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        this.A03 = C43531zx.A02(this, AnonymousClass00R.A0C, 2131427843);
        LayoutInflater.from(context).inflate(2131624208, this, true);
    }

    public static final void A00(ArEffectsLottieButton arEffectsLottieButton, C18090vk r2) {
        C18070vi.A0d(r2, 1);
        arEffectsLottieButton.getAnimationView().A04();
        r2.invoke();
    }

    public final void A02(WDSButton wDSButton, int i, long j) {
        C18070vi.A0d(wDSButton, 1);
        this.A01 = j;
        wDSButton.setIcon(17170445);
        this.A00 = wDSButton;
        addView(wDSButton, 0);
        AnonymousClass3MY.A0w(getContext(), wDSButton, 2131886696);
        LottieAnimationView animationView = getAnimationView();
        ViewGroup.LayoutParams layoutParams = animationView.getLayoutParams();
        if (layoutParams != null) {
            C108955ca.A1I(animationView, AnonymousClass3Ma.A02(this, i), layoutParams);
            requestLayout();
            this.A02 = true;
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    private final LottieAnimationView getAnimationView() {
        return (LottieAnimationView) this.A03.getValue();
    }

    public static /* synthetic */ void setup$default(ArEffectsLottieButton arEffectsLottieButton, long j, WDSButton wDSButton, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 2131165344;
        }
        arEffectsLottieButton.A02(wDSButton, i, j);
    }

    public final void A01() {
        if (this.A02 && getAnimationView().getVisibility() == 0) {
            getAnimationView().setVisibility(8);
            WDSButton wDSButton = this.A00;
            if (wDSButton != null) {
                wDSButton.setIcon(2131233494);
            }
            getAnimationView().A02();
        }
    }

    public final void A03(C18090vk r5) {
        if (this.A02 && getAnimationView().getVisibility() == 0) {
            getAnimationView().postDelayed(new C21453AkK(this, r5, 8), this.A01);
        }
    }

    public final WDSButton getButton() {
        return this.A00;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsLottieButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ ArEffectsLottieButton(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsLottieButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
