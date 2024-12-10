package com.facebook.shimmer;

import X.AnonymousClass3MW;
import X.BF7;
import X.BVM;
import X.BVN;
import X.C24677CEr;
import X.C25276CcS;
import X.CUR;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ShimmerFrameLayout extends FrameLayout {
    public boolean A00 = true;
    public final Paint A01 = AnonymousClass3MW.A06();
    public final BF7 A02 = new BF7();

    private void A00(Context context, AttributeSet attributeSet) {
        C25276CcS bvm;
        setWillNotDraw(false);
        this.A02.setCallback(this);
        if (attributeSet == null) {
            A05(new BVM().A00());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C24677CEr.A00, 0, 0);
        try {
            if (!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) {
                bvm = new BVM();
            } else {
                bvm = new BVN();
            }
            bvm.A07(obtainStyledAttributes);
            A05(bvm.A00());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A01() {
        if (this.A00) {
            A04();
            this.A00 = false;
            invalidate();
        }
    }

    public void A02() {
        if (!this.A00) {
            this.A00 = true;
            A03();
        }
    }

    public void A03() {
        BF7 bf7 = this.A02;
        ValueAnimator valueAnimator = bf7.A00;
        if (valueAnimator != null && !valueAnimator.isStarted() && bf7.getCallback() != null) {
            bf7.A00.start();
        }
    }

    public void A04() {
        BF7 bf7 = this.A02;
        ValueAnimator valueAnimator = bf7.A00;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            bf7.A00.cancel();
        }
    }

    public void A05(CUR cur) {
        int i;
        Paint paint;
        this.A02.A02(cur);
        if (cur == null || !cur.A0H) {
            i = 0;
            paint = null;
        } else {
            i = 2;
            paint = this.A01;
        }
        setLayerType(i, paint);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.A00) {
            this.A02.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A02.A01();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02.setBounds(0, 0, getWidth(), getHeight());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A02) {
            return true;
        }
        return false;
    }

    public ShimmerFrameLayout(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }
}
