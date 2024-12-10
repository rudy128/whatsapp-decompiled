package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4D1;
import X.AnonymousClass4DG;
import X.C27881Xz;
import X.C72453Mb;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.whatsapp.wds.components.button.WDSButton;

public class WaButtonWithLoader extends RelativeLayout implements AnonymousClass009 {
    public View.OnClickListener A00;
    public ProgressBar A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public boolean A04;
    public Drawable A05;
    public WDSButton A06;
    public String A07;

    public void A01() {
        this.A04 = false;
        A00();
    }

    public void A02() {
        this.A04 = true;
        A00();
    }

    private void A00() {
        String str;
        WDSButton wDSButton = this.A06;
        Drawable drawable = null;
        if (this.A04) {
            str = null;
        } else {
            str = this.A07;
        }
        wDSButton.setText(str);
        if (this.A04 || (drawable = this.A05) != null) {
            this.A06.setIcon(drawable);
        }
        this.A01.setVisibility(C72453Mb.A07(this.A04 ? 1 : 0));
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAction(AnonymousClass4DG r2) {
        this.A06.setAction(r2);
    }

    public void setEnabled(boolean z) {
        this.A06.setEnabled(z);
        super.setEnabled(z);
    }

    public void setIcon(Drawable drawable) {
        this.A05 = drawable;
        this.A06.setIcon(drawable);
    }

    public void setSize(AnonymousClass4D1 r2) {
        this.A06.setSize(r2);
    }

    public void setVariant(C27881Xz r6) {
        Drawable indeterminateDrawable;
        this.A06.setVariant(r6);
        if (r6 == C27881Xz.TONAL && (indeterminateDrawable = this.A01.getIndeterminateDrawable()) != null) {
            indeterminateDrawable.setColorFilter(AnonymousClass3MZ.A02(getContext(), getContext(), 2130969124, 2131100143), PorterDuff.Mode.SRC_IN);
        }
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A07 = null;
        this.A05 = null;
        A03(context);
    }

    public void A03(Context context) {
        View A0A = AnonymousClass3MX.A0A(LayoutInflater.from(context), this, 2131627356);
        this.A06 = AnonymousClass3MW.A0q(A0A, 2131428624);
        ProgressBar progressBar = (ProgressBar) AnonymousClass1HF.A06(A0A, 2131432152);
        this.A01 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        AnonymousClass3MZ.A1N(this.A06, this, 34);
        A00();
    }

    public void setButtonText(int i) {
        setButtonText(AnonymousClass3Ma.A11(this, i));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public void setButtonText(String str) {
        this.A07 = str;
        A00();
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A07 = null;
        this.A05 = null;
        A03(context);
    }

    public WaButtonWithLoader(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A07 = null;
        this.A05 = null;
        A03(context);
    }
}
