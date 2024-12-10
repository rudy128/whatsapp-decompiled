package com.whatsapp.stickers.store;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C17960vV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public final class StickerStoreRowHeaderLayout extends LinearLayout implements AnonymousClass009 {
    public AnonymousClass031 A00;
    public boolean A01;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public void onMeasure(int i, int i2) {
        String str;
        super.onMeasure(i, i2);
        if (getChildCount() != 4) {
            str = "StickerStoreRowHeaderLayout should have 4 children!";
        } else {
            int measuredWidth = getMeasuredWidth();
            View childAt = getChildAt(0);
            View childAt2 = getChildAt(1);
            View childAt3 = getChildAt(2);
            View childAt4 = getChildAt(3);
            if (childAt == null || childAt3 == null || childAt4 == null || childAt2 == null) {
                str = "StickerStoreRowHeaderLayout should have 4 children! Title View, Animated View, Author View and a Remaining View";
            } else {
                childAt4.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), i2);
                int measuredWidth2 = measuredWidth - childAt4.getMeasuredWidth();
                if (measuredWidth2 < 0) {
                    measuredWidth2 = 0;
                }
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, Integer.MIN_VALUE), i2);
                int measuredWidth3 = measuredWidth2 - childAt2.getMeasuredWidth();
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, Integer.MIN_VALUE), i2);
                childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth3, Integer.MIN_VALUE), i2);
                int measuredWidth4 = childAt3.getMeasuredWidth();
                int measuredWidth5 = childAt.getMeasuredWidth();
                if (measuredWidth4 + measuredWidth5 > measuredWidth3) {
                    int i3 = measuredWidth3 / 3;
                    if (i3 > measuredWidth4) {
                        i3 = measuredWidth4;
                    }
                    int i4 = (measuredWidth3 * 2) / 3;
                    if (i4 > measuredWidth5) {
                        i4 = measuredWidth5;
                    }
                    measuredWidth5 = i4;
                    int i5 = measuredWidth3 - (i3 + i4);
                    if (i3 == measuredWidth4) {
                        measuredWidth5 = i4 + i5;
                    } else {
                        i3 += i5;
                    }
                    measuredWidth4 = i3;
                }
                childAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, Integer.MIN_VALUE), i2);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth5, Integer.MIN_VALUE), i2);
                return;
            }
        }
        C17960vV.A0F(false, str);
    }

    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public StickerStoreRowHeaderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public StickerStoreRowHeaderLayout(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
