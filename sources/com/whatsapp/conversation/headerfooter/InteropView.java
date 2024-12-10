package com.whatsapp.conversation.headerfooter;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.C18070vi;
import X.C19740yt;
import X.C28081Yu;
import X.C43421zm;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class InteropView extends FrameLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final WaImageView A04;
    public final WaImageView A05;
    public final WaTextView A06;
    public final WaTextView A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InteropView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }

    private final void setInteropIcon(int i) {
        this.A04.setImageResource(i);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = new AnonymousClass031(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setContentIndicatorText(String str) {
        if (str == null || str.length() == 0) {
            this.A02.setVisibility(8);
            setInteropIcon(2131233623);
            return;
        }
        this.A02.setVisibility(0);
        setInteropIcon(2131233625);
        boolean equals = "@".equals(str);
        WaImageView waImageView = this.A05;
        if (equals) {
            waImageView.setVisibility(0);
            this.A06.setVisibility(8);
            return;
        }
        waImageView.setVisibility(8);
        WaTextView waTextView = this.A06;
        waTextView.setText(str);
        waTextView.setVisibility(0);
    }

    public final void setEnableState(boolean z) {
        this.A03.setClickable(z);
        this.A07.setEnabled(z);
        this.A04.setEnabled(z);
        this.A06.setEnabled(z);
        this.A05.setEnabled(z);
    }

    public final void setImportantMessageTag(int i) {
        this.A05.setTag(Integer.valueOf(i));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public final void setVisibility(boolean z) {
        View view = this.A03;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InteropView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r6) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InteropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        View inflate = LayoutInflater.from(context).inflate(2131624985, this, false);
        C18070vi.A0X(inflate);
        this.A03 = inflate;
        WaImageView waImageView = (WaImageView) C18070vi.A05(inflate, 2131431772);
        this.A04 = waImageView;
        WaTextView waTextView = (WaTextView) C18070vi.A05(inflate, 2131431770);
        this.A07 = waTextView;
        this.A06 = (WaTextView) C18070vi.A05(inflate, 2131431771);
        this.A02 = C18070vi.A05(inflate, 2131431761);
        WaImageView waImageView2 = (WaImageView) C18070vi.A05(inflate, 2131431773);
        this.A05 = waImageView2;
        C43421zm.A04(waTextView);
        AnonymousClass1Y5.A07(inflate, "Button");
        C28081Yu.A00(C19740yt.A03(context, 2131102457), waImageView);
        C28081Yu.A00(C19740yt.A03(context, 2131102501), waImageView2);
        waTextView.setTextColor(C19740yt.A03(context, 2131102479));
        addView(inflate);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InteropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }
}
