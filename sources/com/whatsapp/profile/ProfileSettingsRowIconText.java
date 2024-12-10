package com.whatsapp.profile;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4IZ;
import X.AnonymousClass4aX;
import X.C18000vb;
import X.C18070vi;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class ProfileSettingsRowIconText extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final TextEmojiLabel A03;
    public final WaImageView A04;
    public final WaImageView A05;
    public final WaImageView A06;
    public final WaTextView A07;
    public final WaTextView A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        setOrientation(1);
        setGravity(8388627);
        LayoutInflater.from(context).inflate(2131626640, this, true);
        WaImageView waImageView = (WaImageView) AnonymousClass3MX.A0C(this, 2131434172);
        this.A04 = waImageView;
        this.A05 = (WaImageView) AnonymousClass3MX.A0C(this, 2131434173);
        WaImageView waImageView2 = (WaImageView) AnonymousClass3MX.A0C(this, 2131434175);
        this.A06 = waImageView2;
        AnonymousClass1Y5.A03(waImageView2, 2131898930);
        AnonymousClass3MW.A1Q(waImageView2);
        WaTextView A0g = C72453Mb.A0g(this, 2131434177);
        this.A08 = A0g;
        AnonymousClass1Y5.A0A(A0g, true);
        this.A03 = (TextEmojiLabel) AnonymousClass3MX.A0C(this, 2131434176);
        this.A07 = C72453Mb.A0g(this, 2131434171);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IZ.A03);
        C18070vi.A0X(obtainStyledAttributes);
        try {
            setPrimaryIcon(obtainStyledAttributes.getResourceId(1, 0));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                AnonymousClass4aX.A0D(waImageView, color);
            }
            setSecondaryIcon(obtainStyledAttributes.getResourceId(3, 0));
            int color2 = obtainStyledAttributes.getColor(4, -1);
            if (color2 != -1) {
                AnonymousClass4aX.A0D(waImageView2, color2);
            }
            setText(getWhatsAppLocale().A0E(obtainStyledAttributes, 6));
            setSubText(getWhatsAppLocale().A0E(obtainStyledAttributes, 5));
            setDescription(getWhatsAppLocale().A0E(obtainStyledAttributes, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final void A00() {
        WaImageView waImageView;
        int i;
        if (this.A04.getVisibility() == 0 && this.A07.getVisibility() == 0) {
            waImageView = this.A05;
            i = 4;
        } else {
            waImageView = this.A05;
            i = 8;
        }
        waImageView.setVisibility(i);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setDescription(CharSequence charSequence) {
        WaTextView waTextView = this.A07;
        waTextView.setVisibility(C72453Mb.A0F(charSequence));
        A00();
        waTextView.setText(charSequence);
    }

    public final void setPrimaryIcon(int i) {
        WaImageView waImageView = this.A04;
        waImageView.setVisibility(C72453Mb.A02(i));
        A00();
        waImageView.setImageResource(i);
        this.A05.setImageResource(i);
    }

    public final void setSecondaryIcon(int i) {
        WaImageView waImageView = this.A06;
        waImageView.setVisibility(C72453Mb.A02(i));
        waImageView.setImageResource(i);
    }

    public final void setSubText(CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel = this.A03;
        textEmojiLabel.setVisibility(C72453Mb.A0F(charSequence));
        C72453Mb.A1L(textEmojiLabel, charSequence);
    }

    public final void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A08;
        waTextView.setVisibility(C72453Mb.A0F(charSequence));
        waTextView.setText(charSequence);
    }

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public /* synthetic */ ProfileSettingsRowIconText(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProfileSettingsRowIconText(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
