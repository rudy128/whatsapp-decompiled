package com.whatsapp.payments.ui.widget;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C42491yG;
import X.C72453Mb;
import X.C72463Mc;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.CopyableTextView;
import com.whatsapp.WaImageView;

public class PaymentMethodRow extends LinearLayout implements AnonymousClass009 {
    public ImageView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public ShimmerFrameLayout A04;
    public WaImageView A05;
    public AnonymousClass031 A06;
    public boolean A07;
    public View A08;
    public RadioButton A09;
    public TextView A0A;
    public CopyableTextView A0B;

    public void A00() {
        this.A09.setVisibility(0);
        this.A05.setVisibility(8);
        C42491yG.A02(this.A08);
    }

    public void A02() {
        if (!this.A07) {
            this.A07 = true;
            generatedComponent();
        }
    }

    public void A04(boolean z) {
        TextView textView = this.A03;
        Context context = getContext();
        if (!z) {
            AnonymousClass3MX.A1C(context, textView, 2131102145);
            this.A08.setBackground((Drawable) null);
            return;
        }
        C72463Mc.A0w(getContext(), context, textView, 2130970343, 2131101314);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A06;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A06 = r0;
        }
        return r0.generatedComponent();
    }

    public void setAccountId(String str) {
        this.A0B.setText(str);
        this.A0B.setVisibility(C72453Mb.A01(TextUtils.isEmpty(str) ? 1 : 0));
    }

    public void setIconBackground(Drawable drawable) {
        this.A00.setBackground(drawable);
    }

    public void setIconScaleType(ImageView.ScaleType scaleType) {
        this.A00.setScaleType(scaleType);
    }

    public void setRadioButtonChecked(boolean z) {
        this.A09.setChecked(z);
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        A01();
    }

    public void A01() {
        AnonymousClass3MZ.A0D(this).inflate(2131626384, this, true);
        setOrientation(1);
        this.A08 = AnonymousClass1HF.A06(this, 2131433595);
        this.A00 = AnonymousClass3MW.A0G(this, 2131433590);
        this.A03 = AnonymousClass3MW.A0J(this, 2131433577);
        this.A02 = AnonymousClass3MW.A0J(this, 2131433589);
        this.A0B = (CopyableTextView) AnonymousClass1HF.A06(this, 2131433574);
        this.A0A = AnonymousClass3MW.A0J(this, 2131433591);
        this.A05 = AnonymousClass3MW.A0R(this, 2131433580);
        this.A09 = (RadioButton) AnonymousClass1HF.A06(this, 2131433592);
        this.A01 = AnonymousClass3MW.A0J(this, 2131433500);
        this.A04 = (ShimmerFrameLayout) AnonymousClass1HF.A06(this, 2131433585);
        this.A0B.setVisibility(8);
        this.A0A.setVisibility(8);
        this.A05.setVisibility(8);
        this.A01.setVisibility(8);
        this.A04.A01();
    }

    public void A03(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            this.A0A.setVisibility(8);
            AnonymousClass3MW.A1S(this.A0A);
            return;
        }
        if (str.contains("\n") || z) {
            this.A0A.setSingleLine(false);
        } else {
            this.A0A.setSingleLine(true);
            this.A0A.setEllipsize(TextUtils.TruncateAt.END);
        }
        this.A0A.setText(str);
        this.A0A.setVisibility(0);
    }

    public void A05(boolean z) {
        AnonymousClass1HF.A06(this, 2131427433).setVisibility(C72453Mb.A07(z ? 1 : 0));
    }

    public int getLayoutRes() {
        return 2131626384;
    }

    public ImageView getMethodIconView() {
        return this.A00;
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }

    public PaymentMethodRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        A01();
    }

    public PaymentMethodRow(Context context) {
        super(context);
        A02();
        A01();
    }
}
