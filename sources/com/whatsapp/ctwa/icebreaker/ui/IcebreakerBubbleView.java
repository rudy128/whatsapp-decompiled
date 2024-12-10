package com.whatsapp.ctwa.icebreaker.ui;

import X.AnonymousClass3MW;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.perf.MeasuringFrameLayout;

public class IcebreakerBubbleView extends MeasuringFrameLayout {
    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    private void A01() {
        setBackgroundResource(2131231505);
        int A01 = AnonymousClass3MW.A01(getResources(), 2131167011);
        setPadding(A01, A01, A01, 0);
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public IcebreakerBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public IcebreakerBubbleView(Context context) {
        super(context);
    }
}
