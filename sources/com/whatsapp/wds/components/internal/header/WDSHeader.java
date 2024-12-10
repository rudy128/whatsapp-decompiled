package com.whatsapp.wds.components.internal.header;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4Z9;
import X.C18070vi;
import X.C29261bv;
import X.C39351sv;
import X.C43531zx;
import X.C82814Ce;
import X.C87134Uk;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSHeader extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;
    public final WaTextView A02;
    public final WaImageView A03;
    public final WaTextView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setOrientation(1);
        View.inflate(context, 2131627561, this);
        this.A03 = AnonymousClass3MW.A0R(this, 2131431496);
        this.A02 = AnonymousClass3MW.A0T(this, 2131431394);
        this.A04 = AnonymousClass3MW.A0T(this, 2131429927);
        AnonymousClass1Y5.A0A(this.A02, true);
    }

    public final void setViewState(C87134Uk r5) {
        C18070vi.A0d(r5, 0);
        setSize(r5.A01);
        Drawable drawable = r5.A00;
        WaImageView waImageView = this.A03;
        C43531zx.A04(waImageView, drawable);
        waImageView.setImageDrawable(drawable);
        this.A02.setText(r5.A03);
        CharSequence charSequence = r5.A02;
        WaTextView waTextView = this.A04;
        C43531zx.A04(waTextView, charSequence);
        waTextView.setText(charSequence);
        AnonymousClass3MX.A1C(getContext(), waTextView, AnonymousClass4Z9.A00(getContext(), 2130971950));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setHeaderImageMarginEnabled(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        WaImageView waImageView = this.A03;
        ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i4 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.leftMargin;
        } else {
            i = 0;
        }
        if (z) {
            i2 = AnonymousClass000.A0Y(this).getDimensionPixelOffset(2131169533);
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = waImageView.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            i3 = 0;
        } else {
            i3 = marginLayoutParams3.rightMargin;
        }
        ViewGroup.LayoutParams layoutParams3 = waImageView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i4 = marginLayoutParams2.bottomMargin;
        }
        C43531zx.A03(waImageView, new C39351sv(i, i2, i3, i4));
    }

    public final void setHeaderTextGravity(int i) {
        this.A02.setGravity(i);
        this.A04.setGravity(i);
    }

    private final void setSize(C82814Ce r3) {
        WaTextView waTextView;
        int i;
        int ordinal = r3.ordinal();
        if (ordinal == 0) {
            waTextView = this.A02;
            i = 2132084419;
        } else if (ordinal == 1) {
            waTextView = this.A02;
            i = 2132084418;
        } else {
            throw AnonymousClass3MW.A14();
        }
        C29261bv.A08(waTextView, i);
        C29261bv.A08(this.A04, 2132084414);
    }

    public WDSHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public /* synthetic */ WDSHeader(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
