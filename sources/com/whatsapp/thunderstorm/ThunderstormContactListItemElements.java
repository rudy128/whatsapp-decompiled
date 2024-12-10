package com.whatsapp.thunderstorm;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import X.C18000vb;
import X.C18070vi;
import X.C40501uo;
import X.C72473Md;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class ThunderstormContactListItemElements extends LinearLayout implements AnonymousClass009 {
    public LottieAnimationView A00;
    public WaTextView A01;
    public WaTextView A02;
    public C18000vb A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public View A06;
    public LinearLayout A07;
    public WDSProfilePhoto A08;

    public final void setListener(View.OnClickListener onClickListener) {
        C18070vi.A0d(onClickListener, 0);
        this.A07.setOnClickListener(onClickListener);
    }

    public final void setSubtitle(String str) {
        C18070vi.A0d(str, 0);
        if (str.length() == 0) {
            this.A01.setVisibility(8);
            return;
        }
        this.A01.setVisibility(0);
        this.A01.setText(str);
    }

    public final void setSubtitleView(WaTextView waTextView) {
        C18070vi.A0d(waTextView, 0);
        this.A01 = waTextView;
    }

    public final void setText(String str) {
        C18070vi.A0d(str, 0);
        if (str.length() == 0) {
            this.A02.setVisibility(8);
            return;
        }
        this.A02.setVisibility(0);
        this.A02.setText(str);
    }

    public final void setTextView(WaTextView waTextView) {
        C18070vi.A0d(waTextView, 0);
        this.A02 = waTextView;
    }

    public final void setTransferStatusAnimation(LottieAnimationView lottieAnimationView) {
        C18070vi.A0d(lottieAnimationView, 0);
        this.A00 = lottieAnimationView;
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final LottieAnimationView getTransferStatusAnimation() {
        LottieAnimationView lottieAnimationView = this.A00;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        C18070vi.A11("transferStatusAnimation");
        throw null;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setIcon(Integer num) {
        if (num == null) {
            this.A08.setVisibility(8);
            return;
        }
        WDSProfilePhoto wDSProfilePhoto = this.A08;
        wDSProfilePhoto.setVisibility(0);
        wDSProfilePhoto.setImageDrawable(C40501uo.A00((Resources.Theme) null, getResources(), num.intValue()));
    }

    public ThunderstormContactListItemElements(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public final int getLayout() {
        return 2131627198;
    }

    public final WaTextView getSubtitleView() {
        return this.A01;
    }

    public final WaTextView getTextView() {
        return this.A02;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThunderstormContactListItemElements(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        View A0B = AnonymousClass3MX.A0B(LayoutInflater.from(context), this, 2131627198, false);
        this.A06 = A0B;
        this.A08 = (WDSProfilePhoto) C18070vi.A05(A0B, 2131436147);
        this.A02 = AnonymousClass3Ma.A0N(this.A06, 2131436149);
        this.A01 = AnonymousClass3Ma.A0N(this.A06, 2131436148);
        this.A07 = (LinearLayout) C18070vi.A05(this.A06, 2131436145);
        this.A06.setVisibility(0);
        addView(this.A06);
    }
}
