package com.google.android.material.navigationrail;

import X.AnonymousClass1YU;
import X.AnonymousClass2AC;
import X.C27781Xn;
import X.C27791Xo;
import X.C28941bJ;
import X.C65472wY;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class NavigationRailView extends C28941bJ {
    public View A00;
    public Boolean A01;
    public Boolean A02;
    public final int A03;

    public NavigationRailView(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getMaxItemCount() {
        return 7;
    }

    private AnonymousClass2AC getNavigationRailMenuView() {
        return (AnonymousClass2AC) this.A04;
    }

    public void A00(View view) {
        View view2 = this.A00;
        if (view2 != null) {
            removeView(view2);
            this.A00 = null;
        }
        this.A00 = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.A03;
        addView(view, 0, layoutParams);
    }

    public int getItemMinimumHeight() {
        return ((AnonymousClass2AC) this.A04).A00;
    }

    public int getMenuGravity() {
        return ((AnonymousClass2AC) this.A04).A01.gravity;
    }

    public void setItemMinimumHeight(int i) {
        ((AnonymousClass2AC) this.A04).setItemMinimumHeight(i);
    }

    public void setMenuGravity(int i) {
        ((AnonymousClass2AC) this.A04).setMenuGravity(i);
    }

    public View getHeaderView() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass2AC r5 = (AnonymousClass2AC) this.A04;
        View view = this.A00;
        if (view != null && view.getVisibility() != 8) {
            int bottom = this.A00.getBottom() + this.A03;
            int top = r5.getTop();
            if (top < bottom) {
                i5 = bottom - top;
            } else {
                return;
            }
        } else if ((r5.A01.gravity & 112) == 48) {
            i5 = this.A03;
        } else {
            return;
        }
        if (i5 > 0) {
            r5.layout(r5.getLeft(), r5.getTop() + i5, r5.getRight(), r5.getBottom() + i5);
        }
    }

    public void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i) != 1073741824 && suggestedMinimumWidth > 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        super.onMeasure(i, i2);
        View view = this.A00;
        if (view != null && view.getVisibility() != 8) {
            measureChild(this.A04, i, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.A00.getMeasuredHeight()) - this.A03, Integer.MIN_VALUE));
        }
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132084790);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970592);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A02 = null;
        this.A01 = null;
        this.A03 = getResources().getDimensionPixelSize(2131167895);
        TypedArray typedArray = C27791Xo.A01(getContext(), attributeSet, C27781Xn.A0Z, new int[0], i, i2).A02;
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            A00(LayoutInflater.from(getContext()).inflate(resourceId, this, false));
        }
        setMenuGravity(typedArray.getInt(2, 49));
        if (typedArray.hasValue(1)) {
            setItemMinimumHeight(typedArray.getDimensionPixelSize(1, -1));
        }
        if (typedArray.hasValue(4)) {
            this.A02 = Boolean.valueOf(typedArray.getBoolean(4, false));
        }
        if (typedArray.hasValue(3)) {
            this.A01 = Boolean.valueOf(typedArray.getBoolean(3, false));
        }
        typedArray.recycle();
        AnonymousClass1YU.A03(this, new C65472wY(this));
    }
}
