package com.whatsapp.newsletter.insights.view;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4IC;
import X.C103025Is;
import X.C103035It;
import X.C103045Iu;
import X.C103055Iv;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C28931bI;
import X.C29261bv;
import X.C72453Mb;
import X.C72473Md;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.components.RoundCornerProgressBar;

public final class InsightsItemView extends LinearLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;
    public final C18100vl A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsightsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A03 = AnonymousClass1DF.A01(new C103025Is(this));
        this.A04 = AnonymousClass1DF.A01(new C103035It(this));
        this.A06 = AnonymousClass1DF.A01(new C103055Iv(this));
        this.A05 = AnonymousClass1DF.A01(new C103045Iu(this));
        View.inflate(context, 2131625707, this);
        setOrientation(1);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131169533);
        setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        Resources.Theme theme = context.getTheme();
        if (theme != null && (obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, AnonymousClass4IC.A00, 0, 0)) != null) {
            C72453Mb.A0X(this.A03).setText(getWhatsAppLocale().A0E(obtainStyledAttributes, 0));
            if (obtainStyledAttributes.hasValue(1)) {
                C72453Mb.A0X(this.A03).setCompoundDrawablesRelativeWithIntrinsicBounds(2131232020, 0, 0, 0);
                ColorStateList valueOf = ColorStateList.valueOf(obtainStyledAttributes.getColor(1, -16777216));
                C18070vi.A0X(valueOf);
                C29261bv.A02(valueOf, C72453Mb.A0X(this.A03));
            }
        }
    }

    public final void setLabel(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        C72453Mb.A0X(this.A03).setText(charSequence);
    }

    public final void setPrimaryValue(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        C72453Mb.A0X(this.A04).setText(charSequence);
    }

    public final void setSecondaryValue(CharSequence charSequence) {
        C18070vi.A0d(charSequence, 0);
        C72453Mb.A0X(this.A06).setText(charSequence);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final TextView getLabelView() {
        return C72453Mb.A0X(this.A03);
    }

    private final TextView getPrimaryValueView() {
        return C72453Mb.A0X(this.A04);
    }

    private final C28931bI getProgressBarView() {
        return AnonymousClass3MX.A0v(this.A05);
    }

    private final TextView getSecondaryValueView() {
        return C72453Mb.A0X(this.A06);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final CharSequence getLabel() {
        CharSequence text = C72453Mb.A0X(this.A03).getText();
        C18070vi.A0X(text);
        return text;
    }

    public final CharSequence getPrimaryValue() {
        CharSequence text = C72453Mb.A0X(this.A04).getText();
        C18070vi.A0X(text);
        return text;
    }

    public final int getProgress() {
        RoundCornerProgressBar roundCornerProgressBar;
        C28931bI A0v = AnonymousClass3MX.A0v(this.A05);
        if (A0v.A00 == null || (roundCornerProgressBar = (RoundCornerProgressBar) A0v.A02()) == null) {
            return 0;
        }
        return roundCornerProgressBar.A03;
    }

    public final int getProgressColor() {
        return ((RoundCornerProgressBar) AnonymousClass3MX.A0v(this.A05).A02()).A02;
    }

    public final CharSequence getSecondaryValue() {
        CharSequence text = C72453Mb.A0X(this.A06).getText();
        C18070vi.A0X(text);
        return text;
    }

    public final C18000vb getWhatsAppLocale() {
        C18000vb r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public final void setProgress(int i) {
        ((RoundCornerProgressBar) AnonymousClass3MX.A0v(this.A05).A02()).setProgress(i);
    }

    public final void setProgressColor(int i) {
        ((RoundCornerProgressBar) AnonymousClass3MX.A0v(this.A05).A02()).A02 = i;
    }

    public InsightsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
    }

    public /* synthetic */ InsightsItemView(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsightsItemView(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
