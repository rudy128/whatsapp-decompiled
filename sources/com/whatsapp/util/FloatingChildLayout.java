package com.whatsapp.util;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C109195cy;
import X.C1411074h;
import X.C17960vV;
import X.C72553Mn;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class FloatingChildLayout extends FrameLayout implements AnonymousClass009 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public View.OnTouchListener A06;
    public View A07;
    public AnonymousClass031 A08;
    public boolean A09;
    public Rect A0A;
    public final int A0B;

    public void setBackground(Drawable drawable) {
        C17960vV.A0F(false, "don't setBackground(), it is managed internally");
    }

    public static void A00(FloatingChildLayout floatingChildLayout, Runnable runnable, boolean z) {
        int i;
        int i2;
        int i3;
        if (floatingChildLayout.A07 != null) {
            float childRatio = floatingChildLayout.getChildRatio();
            float f = 1.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = childRatio;
                childRatio = 1.0f;
            }
            if (AnonymousClass000.A1O(floatingChildLayout.A03)) {
                float sqrt = ((float) (Math.sqrt(2.0d) * ((double) Math.max(floatingChildLayout.A07.getWidth(), floatingChildLayout.A07.getHeight())))) / 2.0f;
                float min = (float) Math.min(floatingChildLayout.A07.getWidth(), floatingChildLayout.A07.getHeight());
                if (floatingChildLayout.A03 == 1) {
                    min /= 2.0f;
                }
                if (!z) {
                    float f3 = min;
                    min = sqrt;
                    sqrt = f3;
                }
                View view = floatingChildLayout.A07;
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, floatingChildLayout.A07.getWidth() / 2, sqrt, min);
                createCircularReveal.setDuration((long) floatingChildLayout.A0B);
                if (z) {
                    C109195cy.A02(createCircularReveal, floatingChildLayout, 37);
                }
                createCircularReveal.start();
            }
            int[] iArr = new int[2];
            floatingChildLayout.A07.getLocationOnScreen(iArr);
            int i4 = 0;
            Rect rect = floatingChildLayout.A0A;
            if (!z) {
                int i5 = rect.left - iArr[0];
                i3 = rect.top - iArr[1];
                i4 = i5;
                i2 = 0;
                i = 0;
            } else {
                i = rect.left - iArr[0];
                i2 = rect.top - iArr[1];
                i3 = 0;
            }
            boolean A1O = true ^ AnonymousClass000.A1O(floatingChildLayout.A03);
            if (!A1O || z) {
                floatingChildLayout.A07.setAlpha(1.0f);
            } else {
                floatingChildLayout.A07.setAlpha(floatingChildLayout.A00);
            }
            floatingChildLayout.A07.setTranslationX((float) i4);
            floatingChildLayout.A07.setTranslationY((float) i3);
            floatingChildLayout.A07.setPivotX(0.0f);
            floatingChildLayout.A07.setPivotY(0.0f);
            floatingChildLayout.A07.setScaleX(childRatio);
            floatingChildLayout.A07.setScaleY(childRatio);
            ViewPropertyAnimator translationY = floatingChildLayout.A07.animate().setDuration((long) floatingChildLayout.A0B).setInterpolator(AnimationUtils.loadInterpolator(floatingChildLayout.getContext(), 17563654)).scaleX(f2).scaleY(f2).translationX((float) i).translationY((float) i2);
            if (A1O && z) {
                f = floatingChildLayout.A00;
            }
            translationY.alpha(f).setListener(new C72553Mn(runnable, floatingChildLayout, 3, z));
        }
    }

    private float getChildRatio() {
        if (this.A07 != null) {
            float min = Math.min(Math.max(((float) this.A0A.width()) / C108945cZ.A03(this.A07), 0.0f), 1.0f);
            if (!Float.isNaN(min)) {
                if (Float.isInfinite(min)) {
                    return 1.0f;
                }
                return min;
            }
        }
        return 0.0f;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A08;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int height;
        int centerX;
        int centerY;
        View view = this.A07;
        if (view != null) {
            Rect targetInWindow = getTargetInWindow();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i5 = this.A04;
            if (i5 >= 0) {
                centerX = (getWidth() - measuredWidth) / 2;
                centerY = this.A04;
            } else if (i5 == -1) {
                centerX = targetInWindow.centerX() - (measuredWidth / 2);
                centerY = targetInWindow.centerY() - Math.round(((float) measuredHeight) * 0.75f);
            } else if (i5 == -2) {
                width = (getWidth() - measuredWidth) / 2;
                height = (getHeight() - measuredHeight) / 2;
                view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
            } else {
                return;
            }
            int width2 = getWidth();
            if (measuredWidth > width2) {
                width = (width2 - measuredWidth) / 2;
            } else {
                width = Math.min(Math.max(centerX, 0), width2 - measuredWidth);
            }
            int height2 = getHeight();
            if (measuredHeight > height2) {
                height = (height2 - measuredHeight) / 2;
            } else {
                height = Math.min(Math.max(centerY, 0), height2 - measuredHeight);
            }
            view.layout(width, height, view.getMeasuredWidth() + width, view.getMeasuredHeight() + height);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.A06;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(this, motionEvent);
        }
        return false;
    }

    public void setBackgroundColorAlpha(int i) {
        setBackgroundColor(i << 24);
    }

    public void setChildTargetScreen(Rect rect) {
        this.A0A = rect;
        requestLayout();
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
    }

    private Rect getTargetInWindow() {
        Rect A072 = AnonymousClass3MW.A07();
        getWindowVisibleDisplayFrame(A072);
        Rect rect = new Rect(this.A0A);
        rect.offset(-A072.left, -A072.top);
        return rect;
    }

    public View getChild() {
        return this.A07;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(16908290);
        this.A07 = findViewById;
        findViewById.setDuplicateParentStateEnabled(true);
    }

    public void setOnOutsideTouchListener(View.OnTouchListener onTouchListener) {
        this.A06 = onTouchListener;
    }

    public void setRevealAnimation(int i) {
        this.A03 = i;
    }

    public void setStartingAlpha(float f) {
        this.A00 = f;
    }

    public void setTopPosition(int i) {
        this.A04 = i;
    }

    public FloatingChildLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A09) {
            this.A09 = true;
            generatedComponent();
        }
        this.A0A = AnonymousClass3MW.A07();
        this.A01 = 0;
        this.A02 = 0;
        Resources resources = getResources();
        this.A04 = -1;
        this.A0B = (resources.getInteger(17694720) * 11) / 10;
        int[] A1W = C108945cZ.A1W();
        // fill-array-data instruction
        A1W[0] = 0;
        A1W[1] = 127;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1W);
        this.A05 = ofInt;
        C1411074h.A00(ofInt, this, 35);
        super.setBackgroundDrawable(new ColorDrawable(0));
    }
}
