package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass1DF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass5At;
import X.AnonymousClass5Au;
import X.AnonymousClass5Av;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C72473Md;
import X.C84144If;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public final class SectionHeaderView extends RelativeLayout implements AnonymousClass009 {
    public C18000vb A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final C18100vl A03;
    public final C18100vl A04;
    public final C18100vl A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SectionHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public final void setWhatsAppLocale(C18000vb r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    private final WaTextView getHeaderView() {
        return (WaTextView) AnonymousClass3MX.A14(this.A03);
    }

    private final WaImageButton getInfoIconView() {
        return (WaImageButton) AnonymousClass3MX.A14(this.A04);
    }

    private final WaTextView getSubHeaderOnRightView() {
        return (WaTextView) AnonymousClass3MX.A14(this.A05);
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

    public final void setHeaderText(int i) {
        getHeaderView().setText(i);
    }

    public final void setInfoIconClickListener(View.OnClickListener onClickListener) {
        getInfoIconView().setOnClickListener(onClickListener);
    }

    public final void setInfoIconVisibility(int i) {
        getInfoIconView().setVisibility(i);
    }

    public final void setSubHeaderText(int i) {
        getSubHeaderOnRightView().setText(i);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SectionHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C72473Md.A0S((AnonymousClass033) generatedComponent());
        }
        this.A03 = AnonymousClass1DF.A01(new AnonymousClass5At(this));
        this.A05 = AnonymousClass1DF.A01(new AnonymousClass5Av(this));
        this.A04 = AnonymousClass1DF.A01(new AnonymousClass5Au(this));
        View.inflate(context, 2131626843, this);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C84144If.A0L, 0, 0);
        try {
            getHeaderView().setText(getWhatsAppLocale().A0E(obtainStyledAttributes, 2));
            getSubHeaderOnRightView().setText(getWhatsAppLocale().A0E(obtainStyledAttributes, 0));
            if (obtainStyledAttributes.hasValue(3)) {
                int color = obtainStyledAttributes.getColor(3, -16777216);
                getHeaderView().setTextColor(color);
                getInfoIconView().setImageTintList(ColorStateList.valueOf(color));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                getSubHeaderOnRightView().setTextColor(obtainStyledAttributes.getColor(3, -16777216));
            }
            obtainStyledAttributes.recycle();
            getInfoIconView().setVisibility(8);
            getInfoIconView().setOnClickListener((View.OnClickListener) null);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setHeaderText(String str) {
        getHeaderView().setText(str);
    }

    public final void setSubHeaderText(String str) {
        getSubHeaderOnRightView().setText(str);
    }

    public /* synthetic */ SectionHeaderView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SectionHeaderView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
