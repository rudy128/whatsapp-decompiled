package com.whatsapp;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Z2;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C27831Xu;
import X.C90874em;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class TriStateCheckBox extends AppCompatCheckBox implements AnonymousClass009 {
    public int A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public Drawable A03;
    public Drawable A04;
    public Drawable A05;

    private void A00() {
        int[][] iArr = {new int[]{16842910}, new int[]{-16842910}};
        int A012 = AnonymousClass3Ma.A01(getContext(), getResources(), 2130969324, 2131100309);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{A012, AnonymousClass1Z2.A03(0.5f, A012, -1)});
        Drawable A022 = C27831Xu.A02(getResources().getDrawable(2131231796));
        this.A05 = A022;
        C27831Xu.A03(colorStateList, A022);
        int A013 = AnonymousClass3Ma.A01(getContext(), getResources(), 2130970828, 2131102239);
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{A013, AnonymousClass1Z2.A03(0.5f, A013, -1)});
        Drawable A023 = C27831Xu.A02(getResources().getDrawable(2131231795));
        this.A03 = A023;
        C27831Xu.A03(colorStateList2, A023);
        Drawable A024 = C27831Xu.A02(getResources().getDrawable(2131232007));
        this.A04 = A024;
        C27831Xu.A03(colorStateList2, A024);
        A01(this);
        setOnCheckedChangeListener(new C90874em(this, 0));
    }

    public static void A01(TriStateCheckBox triStateCheckBox) {
        Drawable drawable = triStateCheckBox.A05;
        int i = triStateCheckBox.A00;
        if (i != 0) {
            if (i == 1) {
                drawable = triStateCheckBox.A03;
            } else if (i == 2) {
                drawable = triStateCheckBox.A04;
            }
        }
        triStateCheckBox.setButtonDrawable(drawable);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public int getCheckedState() {
        return this.A00;
    }

    public void setCheckedState(int i) {
        this.A00 = i;
        A01(this);
    }

    public TriStateCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }

    public TriStateCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }

    public TriStateCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public TriStateCheckBox(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        A00();
    }
}
