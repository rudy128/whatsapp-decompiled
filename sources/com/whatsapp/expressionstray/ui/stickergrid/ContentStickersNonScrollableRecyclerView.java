package com.whatsapp.expressionstray.ui.stickergrid;

import X.AnonymousClass000;
import X.AnonymousClass1Y1;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C18070vi;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class ContentStickersNonScrollableRecyclerView extends RecyclerView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickersNonScrollableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18070vi.A0d(context, 1);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setNestedScrollingEnabled(false);
        Resources A0Y = AnonymousClass000.A0Y(this);
        int dimensionPixelSize = A0Y.getDimensionPixelSize(2131166120);
        int dimensionPixelSize2 = A0Y.getDimensionPixelSize(2131166119);
        int dimensionPixelSize3 = A0Y.getDimensionPixelSize(2131166121);
        if (configuration != null) {
            int i = configuration.orientation;
            if (i == 2) {
                setPadding(dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize, 0);
            } else if (i == 1) {
                setPadding(dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize2, 0);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentStickersNonScrollableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ ContentStickersNonScrollableRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContentStickersNonScrollableRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
