package com.whatsapp.collections;

import X.C113815nn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.util.Log;

public class MarginCorrectedViewPager extends C113815nn {
    public boolean A00;

    public MarginCorrectedViewPager(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00 || (getCurrentItem() == 0 && getChildCount() == 0)) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e("Exception while intercepting touch event", e);
            return false;
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = this.A08;
        super.onSizeChanged(i - i5, i2, i3 - i5, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.A00) {
                return false;
            }
            if (getCurrentItem() == 0 && getChildCount() == 0) {
                return false;
            }
            return super.onTouchEvent(motionEvent);
        } catch (IndexOutOfBoundsException unused) {
            return true;
        }
    }

    public void setScrollEnabled(boolean z) {
        this.A00 = z;
    }

    public MarginCorrectedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = true;
    }
}
