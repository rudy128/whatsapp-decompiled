package com.whatsapp.radio;

import X.AnonymousClass000;
import X.AnonymousClass112;
import X.AnonymousClass1Y1;
import X.AnonymousClass1YH;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4HX;
import X.C17890vO;
import X.C18070vi;
import X.C26173Ctq;
import X.C72463Mc;
import X.C72743Ni;
import X.C84144If;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatRadioButton;

public final class RadioButtonWithSubtitle extends AppCompatRadioButton {
    public CharSequence A00;
    public CharSequence A01;
    public Integer A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842878);
        C18070vi.A0d(context, 1);
    }

    private final void A00() {
        CharSequence charSequence = this.A01;
        CharSequence charSequence2 = this.A00;
        if (charSequence2 == null || charSequence2.length() == 0 || charSequence == null || charSequence.length() == 0) {
            setText(charSequence);
            return;
        }
        StringBuilder A0f = C17890vO.A0f(charSequence);
        A0f.append(10);
        String A0V = C17890vO.A0V(this.A00, A0f);
        C72743Ni r4 = new C72743Ni(this, AnonymousClass1YH.A00((Resources.Theme) null, getResources(), C72463Mc.A01(getContext())));
        SpannableString spannableString = new SpannableString(A0V);
        spannableString.setSpan(r4, charSequence.length() + 1, A0V.length(), 33);
        setText(spannableString);
    }

    private final void setParams(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = AnonymousClass3Ma.A06(this).obtainStyledAttributes(attributeSet, C84144If.A0J, 0, 0);
            C18070vi.A0X(obtainStyledAttributes);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(2, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                setRadioTextPadding(Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(0, -1)));
                if (resourceId != 0) {
                    setTitle(getResources().getString(resourceId));
                }
                if (resourceId2 != 0) {
                    setSubTitle(getResources().getString(resourceId2));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final Integer getRadioTextPadding() {
        return this.A02;
    }

    public final CharSequence getSubTitle() {
        return this.A00;
    }

    public final CharSequence getTitle() {
        return this.A01;
    }

    public final void setRadioTextPadding(Integer num) {
        this.A02 = num;
        A01();
    }

    public final void setSubTitle(CharSequence charSequence) {
        this.A00 = charSequence;
        A00();
    }

    public final void setTitle(CharSequence charSequence) {
        this.A01 = charSequence;
        A00();
    }

    private final void A01() {
        int i;
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168784);
        int dimensionPixelSize2 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168774);
        Integer num = this.A02;
        if (num == null || (i = num.intValue()) == -1) {
            i = dimensionPixelSize2;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, dimensionPixelSize);
        setLayoutParams(layoutParams);
        setPaddingRelative(i, getPaddingTop(), dimensionPixelSize2, getPaddingBottom());
        setTextSize(0, getResources().getDimension(2131169432));
        if (AnonymousClass112.A05()) {
            AnonymousClass4HX.A00(this, AnonymousClass3MW.A01(getResources(), 2131168671));
        }
        C26173Ctq.A01(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{16842912}}, new int[]{AnonymousClass3Ma.A00(AnonymousClass3MY.A04(this), 2130970900, 2131102334), AnonymousClass3Ma.A00(AnonymousClass3MY.A04(this), 2130970899, 2131102239)}), this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
        setParams(attributeSet);
        A01();
        A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RadioButtonWithSubtitle(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), (i2 & 4) != 0 ? 16842878 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RadioButtonWithSubtitle(Context context) {
        this(context, (AttributeSet) null, 16842878);
        C18070vi.A0d(context, 1);
    }
}
