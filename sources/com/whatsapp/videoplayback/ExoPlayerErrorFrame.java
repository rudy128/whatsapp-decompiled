package com.whatsapp.videoplayback;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;

public final class ExoPlayerErrorFrame extends FrameLayout implements AnonymousClass009 {
    public View.OnClickListener A00;
    public View A01;
    public FrameLayout A02;
    public TextView A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public final FrameLayout A06;
    public final CircularProgressBar A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        View inflate = LayoutInflater.from(context).inflate(2131627520, this);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A06 = (FrameLayout) inflate;
        this.A07 = (CircularProgressBar) AnonymousClass3MX.A0C(this, 2131432153);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getErrorScreenVisibility() {
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return 8;
    }

    public final void setLoadingViewVisibility(int i) {
        this.A07.setVisibility(i);
    }

    public final void setOnRetryListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
