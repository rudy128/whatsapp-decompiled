package com.google.android.material.bottomnavigation;

import X.AnonymousClass1YU;
import X.AnonymousClass3MG;
import X.AnonymousClass3MH;
import X.C27781Xn;
import X.C27791Xo;
import X.C28941bJ;
import X.C29001bQ;
import X.C29161bi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class BottomNavigationView extends C28941bJ {
    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getMaxItemCount() {
        return 5;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C29001bQ r1 = (C29001bQ) this.A04;
        if (r1.A00 != z) {
            r1.A00 = z;
            this.A05.CQu(false);
        }
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(AnonymousClass3MG r1) {
        this.A00 = r1;
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(AnonymousClass3MH r1) {
        this.A01 = r1;
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132084541);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130968833);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArray = C27791Xo.A01(getContext(), attributeSet, C27781Xn.A04, new int[0], i, i2).A02;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        typedArray.recycle();
        AnonymousClass1YU.A03(this, new C29161bi(this));
    }
}
