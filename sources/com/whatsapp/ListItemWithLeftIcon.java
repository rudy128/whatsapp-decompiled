package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C72463Mc;
import X.C74793cj;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class ListItemWithLeftIcon extends C74793cj {
    public View A00;
    public View A01;

    public void setDescriptionVisibility(int i) {
        int i2;
        if (this.A00.getVisibility() != i) {
            this.A00.setVisibility(i);
            boolean A1P = AnonymousClass000.A1P(i);
            int i3 = 2131167078;
            int dimensionPixelSize = getResources().getDimensionPixelSize(2131167078);
            Resources resources = getResources();
            if (A1P) {
                i3 = 2131168775;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i3);
            this.A00.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A01.getLayoutParams();
            int i4 = 3;
            if (A1P) {
                i4 = 51;
            }
            layoutParams.gravity = i4;
            this.A01.setLayoutParams(layoutParams);
            WaImageView waImageView = this.A01;
            if (A1P) {
                i2 = C72463Mc.A06(this);
            } else {
                i2 = 0;
            }
            waImageView.setPadding(0, i2, 0, 0);
        }
    }

    public void setTitleTextColor(int i) {
        this.A02.setTextColor(i);
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        this.A00 = AnonymousClass1HF.A06(this, 2131432099);
        this.A01 = AnonymousClass1HF.A06(this, 2131432095);
        if (TextUtils.isEmpty(this.A00.getText())) {
            this.A00.setVisibility(8);
        }
    }

    public void A07(Spanned spanned, boolean z) {
        if (TextUtils.isEmpty(spanned)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        this.A00.setText(spanned);
        if (z) {
            AnonymousClass3Ma.A1I(this.A00, this.A05);
            AnonymousClass3Ma.A1K(this.A00, this.A03);
        }
    }

    public void A08(View view) {
        AnonymousClass3MW.A0C(this, 2131434723).addView(view);
    }

    public void A09(View view, int i) {
        ViewGroup A0C = AnonymousClass3MW.A0C(this, 2131434723);
        View findViewById = A0C.findViewById(i);
        if (findViewById != null) {
            A0C.removeView(findViewById);
        }
        A0C.addView(view);
    }

    public void setDescription(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        super.setDescription(charSequence);
    }

    public int getRootLayoutID() {
        return 2131625854;
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A04();
        this.A06 = true;
        A06(attributeSet);
    }

    public ListItemWithLeftIcon(Context context) {
        super(context, (AttributeSet) null);
    }
}
