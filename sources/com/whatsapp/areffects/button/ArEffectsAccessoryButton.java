package com.whatsapp.areffects.button;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import X.C18100vl;
import X.C39351sv;
import X.C43531zx;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.wds.components.button.WDSButton;

public final class ArEffectsAccessoryButton extends FrameLayout {
    public final C18100vl A00;
    public final C18100vl A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsAccessoryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    private final View getGradientBackground() {
        return AnonymousClass3MW.A0A(this.A00);
    }

    public final WDSButton getButton() {
        return (WDSButton) this.A01.getValue();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getButton().setEnabled(z);
    }

    public final void setIcon(int i) {
        getButton().setIcon(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        getButton().setOnClickListener(onClickListener);
    }

    public final void setup(boolean z) {
        C39351sv r0;
        float f;
        int i;
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131169544);
        WDSButton button = getButton();
        if (z) {
            C43531zx.A03(button, r0);
            f = -1.0f;
            i = 8388611;
        } else {
            r0 = new C39351sv(0, 0, dimensionPixelSize, 0);
            C43531zx.A03(button, r0);
            f = 1.0f;
            i = 8388613;
        }
        C18100vl r1 = this.A00;
        AnonymousClass3MW.A0A(r1).setScaleX(f);
        View A0A = AnonymousClass3MW.A0A(r1);
        ViewGroup.LayoutParams layoutParams = A0A.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i;
            A0A.setLayoutParams(layoutParams2);
            WDSButton button2 = getButton();
            ViewGroup.LayoutParams layoutParams3 = button2.getLayoutParams();
            if (layoutParams3 != null) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = i;
                button2.setLayoutParams(layoutParams4);
                requestLayout();
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ArEffectsAccessoryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        Integer num = AnonymousClass00R.A0C;
        this.A01 = C43531zx.A02(this, num, 2131427410);
        this.A00 = C43531zx.A02(this, num, 2131427409);
        LayoutInflater.from(context).inflate(2131624199, this, true);
    }

    public /* synthetic */ ArEffectsAccessoryButton(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ArEffectsAccessoryButton(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
