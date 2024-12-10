package com.google.android.material.card;

import X.AnonymousClass1Xp;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.BE7;
import X.C108945cZ;
import X.C19740yt;
import X.C26248Cvm;
import X.C26323Cxg;
import X.C27771Xm;
import X.C27781Xn;
import X.C27791Xo;
import X.C27801Xq;
import X.C27811Xs;
import X.C27831Xu;
import X.C28011Ym;
import X.E2M;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

public class MaterialCardView extends CardView implements Checkable, AnonymousClass1Xp {
    public static final int[] A05 = {16842911};
    public static final int[] A06 = {16842912};
    public static final int[] A07 = {2130971360};
    public boolean A00;
    public E2M A01;
    public boolean A02;
    public boolean A03;
    public final C26248Cvm A04;

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.A04.A02 = AnonymousClass3Ma.A02(this, i);
        }
    }

    public ColorStateList getCardBackgroundColor() {
        return this.A04.A0M.A01.A0B;
    }

    public ColorStateList getCardForegroundColor() {
        return this.A04.A0N.A01.A0B;
    }

    public Drawable getCheckedIcon() {
        return this.A04.A09;
    }

    public int getCheckedIconGravity() {
        return this.A04.A01;
    }

    public int getCheckedIconMargin() {
        return this.A04.A02;
    }

    public int getCheckedIconSize() {
        return this.A04.A03;
    }

    public ColorStateList getCheckedIconTint() {
        return this.A04.A06;
    }

    public int getContentPaddingBottom() {
        return this.A04.A0K.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.A0K.left;
    }

    public int getContentPaddingRight() {
        return this.A04.A0K.right;
    }

    public int getContentPaddingTop() {
        return this.A04.A0K.top;
    }

    public float getProgress() {
        return this.A04.A0M.A01.A01;
    }

    public float getRadius() {
        return this.A04.A0M.A08();
    }

    public ColorStateList getRippleColor() {
        return this.A04.A07;
    }

    public C28011Ym getShapeAppearanceModel() {
        return this.A04.A0D;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.A04.A08;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.A04.A08;
    }

    public int getStrokeWidth() {
        return this.A04.A04;
    }

    public boolean isChecked() {
        return this.A02;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        C26248Cvm cvm = this.A04;
        if (cvm != null && cvm.A0E) {
            View.mergeDrawableStates(onCreateDrawableState, A05);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A06);
        }
        if (this.A00) {
            View.mergeDrawableStates(onCreateDrawableState, A07);
        }
        return onCreateDrawableState;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.A03) {
            C26248Cvm cvm = this.A04;
            if (!cvm.A0F) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cvm.A0F = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCardBackgroundColor(int i) {
        C26248Cvm cvm = this.A04;
        cvm.A0M.A0F(ColorStateList.valueOf(i));
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        C27801Xq r1 = this.A04.A0N;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        r1.A0F(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.A04.A0E = z;
    }

    public void setChecked(boolean z) {
        if (this.A02 != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.A04.A0B(drawable);
    }

    public void setCheckedIconGravity(int i) {
        C26248Cvm cvm = this.A04;
        if (cvm.A01 != i) {
            cvm.A01 = i;
            MaterialCardView materialCardView = cvm.A0L;
            cvm.A09(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.A04.A02 = i;
    }

    public void setCheckedIconResource(int i) {
        this.A04.A0B(BE7.A0F(this, i));
    }

    public void setCheckedIconSize(int i) {
        this.A04.A03 = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.A04.A03 = AnonymousClass3Ma.A02(this, i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C26248Cvm cvm = this.A04;
        cvm.A06 = colorStateList;
        Drawable drawable = cvm.A09;
        if (drawable != null) {
            C27831Xu.A03(colorStateList, drawable);
        }
    }

    public void setDragged(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                this.A04.A05();
            }
            invalidate();
        }
    }

    public void setProgress(float f) {
        C26248Cvm cvm = this.A04;
        cvm.A0M.A0D(f);
        cvm.A0N.A0D(f);
        C27801Xq r0 = cvm.A0C;
        if (r0 != null) {
            r0.A0D(f);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C26248Cvm cvm = this.A04;
        cvm.A07 = colorStateList;
        Drawable drawable = cvm.A0B;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        C26248Cvm cvm = this.A04;
        ColorStateList A032 = C19740yt.A03(getContext(), i);
        cvm.A07 = A032;
        Drawable drawable = cvm.A0B;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(A032);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        C26248Cvm cvm = this.A04;
        if (cvm.A08 != colorStateList) {
            cvm.A08 = colorStateList;
            cvm.A0N.A0H(colorStateList, (float) cvm.A04);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        C26248Cvm cvm = this.A04;
        if (i != cvm.A04) {
            cvm.A04 = i;
            cvm.A0N.A0H(cvm.A08, (float) i);
        }
        invalidate();
    }

    public void toggle() {
        float f;
        float f2;
        int i;
        C26248Cvm cvm = this.A04;
        if (cvm != null && cvm.A0E && isEnabled()) {
            this.A02 = !this.A02;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                cvm.A05();
            }
            boolean z = this.A02;
            if (cvm.A09 != null) {
                if (z) {
                    f = 1.0f;
                    f2 = 1.0f - cvm.A00;
                } else {
                    f = 0.0f;
                    f2 = cvm.A00;
                }
                ValueAnimator valueAnimator = cvm.A05;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    cvm.A05 = null;
                }
                float[] A1V = C108945cZ.A1V();
                A1V[0] = cvm.A00;
                A1V[1] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1V);
                cvm.A05 = ofFloat;
                C26323Cxg.A00(ofFloat, cvm, 8);
                cvm.A05.setInterpolator(cvm.A0J);
                ValueAnimator valueAnimator2 = cvm.A05;
                if (z) {
                    i = cvm.A0H;
                } else {
                    i = cvm.A0I;
                }
                valueAnimator2.setDuration((long) (((float) i) * f2));
                cvm.A05.start();
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(C27771Xm.A00(context, attributeSet, i, 2132084744), attributeSet, i);
        this.A02 = false;
        this.A00 = false;
        this.A03 = true;
        TypedArray A002 = C27791Xo.A00(getContext(), attributeSet, C27781Xn.A0P, new int[0], i, 2132084744);
        C26248Cvm cvm = new C26248Cvm(attributeSet, this, i);
        this.A04 = cvm;
        cvm.A0M.A0F(super.getCardBackgroundColor());
        Rect rect = this.A02;
        cvm.A0K.set(rect.left, rect.top, rect.right, rect.bottom);
        cvm.A07();
        cvm.A0A(A002);
        A002.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF A08 = AnonymousClass3MW.A08();
        A08.set(this.A04.A0M.getBounds());
        return A08;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C27811Xs.A03(this, this.A04.A0M);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r3.setClassName(r0)
            X.Cvm r0 = r2.A04
            if (r0 == 0) goto L_0x0011
            boolean r1 = r0.A0E
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r3.setCheckable(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A04.A09(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setCardElevation(float f) {
        super.setCardElevation(f);
        C26248Cvm cvm = this.A04;
        cvm.A0M.A0C(cvm.A0L.getCardElevation());
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        C26248Cvm cvm = this.A04;
        if (cvm != null) {
            cvm.A06();
        }
    }

    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.A04.A08();
    }

    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        C26248Cvm cvm = this.A04;
        cvm.A08();
        cvm.A07();
    }

    public void setRadius(float f) {
        super.setRadius(f);
        C26248Cvm cvm = this.A04;
        cvm.A0C(cvm.A0D.A03(f));
        cvm.A0A.invalidateSelf();
        if (C26248Cvm.A04(cvm) || (cvm.A0L.A01 && !cvm.A0M.A0J())) {
            cvm.A07();
        }
        if (C26248Cvm.A04(cvm)) {
            cvm.A08();
        }
    }

    public void setShapeAppearanceModel(C28011Ym r2) {
        setClipToOutline(r2.A04(getBoundsAsRectF()));
        this.A04.A0C(r2);
    }

    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        C26248Cvm cvm = this.A04;
        cvm.A08();
        cvm.A07();
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnCheckedChangeListener(E2M e2m) {
        this.A01 = e2m;
    }

    public MaterialCardView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.A04.A0M.A0F(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970440);
    }
}
