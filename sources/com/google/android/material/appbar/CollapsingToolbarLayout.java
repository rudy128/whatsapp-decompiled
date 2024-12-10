package com.google.android.material.appbar;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.AnonymousClass1Z8;
import X.AnonymousClass3MZ;
import X.BI7;
import X.C17890vO;
import X.C25070CWd;
import X.C26249Cvn;
import X.C27781Xn;
import X.C27831Xu;
import X.C28664EDb;
import X.C28665EDc;
import X.DL3;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.List;

public class CollapsingToolbarLayout extends FrameLayout {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public ValueAnimator A04;
    public Drawable A05;
    public View A06;
    public View A07;
    public ViewGroup A08;
    public AnonymousClass1HO A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public Drawable A0K;
    public C28664EDb A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final TimeInterpolator A0Q;
    public final TimeInterpolator A0R;
    public final Rect A0S;
    public final AnonymousClass1Z8 A0T;
    public final C26249Cvn A0U;

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4;
        super.onLayout(z, i, i2, i3, i5);
        AnonymousClass1HO r0 = this.A09;
        if (r0 != null) {
            int A052 = r0.A05();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < A052) {
                    AnonymousClass1HF.A0a(childAt, A052);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            C25070CWd A002 = A00(getChildAt(i7));
            View view = A002.A03;
            A002.A01 = view.getTop();
            A002.A00 = view.getLeft();
        }
        A04(i, i2, i3, i5, false);
        A03();
        A05();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            A00(getChildAt(i8)).A00();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int measuredHeight;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int measuredHeight2;
        A01();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        AnonymousClass1HO r0 = this.A09;
        if (r0 != null) {
            i3 = r0.A05();
        } else {
            i3 = 0;
        }
        if ((mode == 0 || this.A0O) && i3 > 0) {
            this.A0J = i3;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i3, 1073741824));
        }
        if (this.A0N) {
            C26249Cvn cvn = this.A0U;
            if (cvn.A0X > 1) {
                A03();
                A04(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i4 = cvn.A0U;
                if (i4 > 1) {
                    TextPaint textPaint = cvn.A15;
                    textPaint.setTextSize(cvn.A0M);
                    textPaint.setTypeface(cvn.A0f);
                    textPaint.setLetterSpacing(cvn.A0H);
                    this.A0G = Math.round((-textPaint.ascent()) + textPaint.descent()) * (i4 - 1);
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.A0G, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.A08;
        if (viewGroup != null) {
            View view = this.A07;
            if (view == null || view == this) {
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = viewGroup.getMeasuredHeight();
                } else {
                    measuredHeight = viewGroup.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            } else {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    measuredHeight2 = view.getMeasuredHeight();
                } else {
                    measuredHeight = view.getMeasuredHeight();
                    setMinimumHeight(measuredHeight);
                }
            }
            measuredHeight = measuredHeight2 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            setMinimumHeight(measuredHeight);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r6 = this;
            boolean r0 = r6.A0P
            if (r0 == 0) goto L_0x0053
            r5 = 0
            r6.A08 = r5
            r6.A07 = r5
            int r1 = r6.A0I
            r0 = -1
            if (r1 == r0) goto L_0x002e
            android.view.View r2 = r6.findViewById(r1)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r6.A08 = r2
            if (r2 == 0) goto L_0x002e
            android.view.ViewParent r1 = r2.getParent()
        L_0x001c:
            if (r1 == r6) goto L_0x002c
            if (r1 == 0) goto L_0x002c
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x0027
            r2 = r1
            android.view.View r2 = (android.view.View) r2
        L_0x0027:
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x001c
        L_0x002c:
            r6.A07 = r2
        L_0x002e:
            android.view.ViewGroup r0 = r6.A08
            r4 = 0
            if (r0 != 0) goto L_0x004e
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0038:
            if (r2 >= r3) goto L_0x004c
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof androidx.appcompat.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            boolean r0 = r1 instanceof android.widget.Toolbar
            if (r0 != 0) goto L_0x0049
            int r2 = r2 + 1
            goto L_0x0038
        L_0x0049:
            r5 = r1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x004c:
            r6.A08 = r5
        L_0x004e:
            r6.A02()
            r6.A0P = r4
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A01():void");
    }

    private void A02() {
        View view;
        if (!this.A0A && (view = this.A06) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A06);
            }
        }
        if (this.A0A && this.A08 != null) {
            View view2 = this.A06;
            if (view2 == null) {
                view2 = new View(getContext());
                this.A06 = view2;
            }
            if (view2.getParent() == null) {
                this.A08.addView(this.A06, -1, -1);
            }
        }
    }

    private void A03() {
        CharSequence charSequence;
        if (this.A08 != null && this.A0A && TextUtils.isEmpty(this.A0U.A0j)) {
            ViewGroup viewGroup = this.A08;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).A0E;
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r15.A06.getVisibility() != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A04(int r16, int r17, int r18, int r19, boolean r20) {
        /*
            r15 = this;
            boolean r0 = r15.A0A
            if (r0 == 0) goto L_0x00bc
            android.view.View r0 = r15.A06
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r0.isAttachedToWindow()
            r14 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0019
            android.view.View r0 = r15.A06
            int r1 = r0.getVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r15.A0M = r0
            r2 = r20
            if (r0 != 0) goto L_0x0022
            if (r20 == 0) goto L_0x00bc
        L_0x0022:
            int r0 = r15.getLayoutDirection()
            if (r0 != r7) goto L_0x0029
            r14 = 1
        L_0x0029:
            android.view.View r5 = r15.A07
            if (r5 != 0) goto L_0x002f
            android.view.ViewGroup r5 = r15.A08
        L_0x002f:
            X.CWd r0 = A00(r5)
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass3MW.A0B(r5)
            int r13 = r15.getHeight()
            int r0 = r0.A01
            int r13 = r13 - r0
            int r0 = r5.getHeight()
            int r13 = r13 - r0
            int r0 = r1.bottomMargin
            int r13 = r13 - r0
            android.view.View r6 = r15.A06
            android.graphics.Rect r8 = r15.A0S
            int r5 = r6.getWidth()
            int r1 = r6.getHeight()
            r0 = 0
            r8.set(r0, r0, r5, r1)
            X.C25923Coh.A01(r8, r6, r15)
            android.view.ViewGroup r6 = r15.A08
            boolean r0 = r6 instanceof androidx.appcompat.widget.Toolbar
            if (r0 == 0) goto L_0x00d0
            androidx.appcompat.widget.Toolbar r6 = (androidx.appcompat.widget.Toolbar) r6
            int r12 = r6.A04
            int r5 = r6.A03
            int r9 = r6.A05
            int r1 = r6.A02
        L_0x0069:
            X.Cvn r6 = r15.A0U
            int r11 = r8.left
            r0 = r12
            if (r14 == 0) goto L_0x0071
            r0 = r5
        L_0x0071:
            int r11 = r11 + r0
            int r10 = r8.top
            int r10 = r10 + r13
            int r10 = r10 + r9
            int r9 = r8.right
            if (r14 != 0) goto L_0x007b
            r12 = r5
        L_0x007b:
            int r9 = r9 - r12
            int r5 = r8.bottom
            int r5 = r5 + r13
            int r5 = r5 - r1
            android.graphics.Rect r1 = r6.A11
            int r0 = r1.left
            if (r0 != r11) goto L_0x00ca
            int r0 = r1.top
            if (r0 != r10) goto L_0x00ca
            int r0 = r1.right
            if (r0 != r9) goto L_0x00ca
            int r0 = r1.bottom
            if (r0 != r5) goto L_0x00ca
        L_0x0092:
            if (r14 == 0) goto L_0x00c7
            int r7 = r15.A0D
        L_0x0096:
            int r5 = r8.top
            int r0 = r15.A0F
            int r5 = r5 + r0
            int r4 = r18 - r16
            if (r14 == 0) goto L_0x00c4
            int r0 = r15.A0E
        L_0x00a1:
            int r4 = r4 - r0
            int r3 = r19 - r17
            int r0 = r15.A0C
            int r3 = r3 - r0
            android.graphics.Rect r1 = r6.A12
            int r0 = r1.left
            if (r0 != r7) goto L_0x00bd
            int r0 = r1.top
            if (r0 != r5) goto L_0x00bd
            int r0 = r1.right
            if (r0 != r4) goto L_0x00bd
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x00bd
        L_0x00b9:
            r6.A0D(r2)
        L_0x00bc:
            return
        L_0x00bd:
            r1.set(r7, r5, r4, r3)
            r0 = 1
            r6.A0m = r0
            goto L_0x00b9
        L_0x00c4:
            int r0 = r15.A0D
            goto L_0x00a1
        L_0x00c7:
            int r7 = r15.A0E
            goto L_0x0096
        L_0x00ca:
            r1.set(r11, r10, r9, r5)
            r6.A0m = r7
            goto L_0x0092
        L_0x00d0:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x00ee
            boolean r0 = r6 instanceof android.widget.Toolbar
            if (r0 == 0) goto L_0x00ee
            android.widget.Toolbar r6 = (android.widget.Toolbar) r6
            int r12 = r6.getTitleMarginStart()
            int r5 = r6.getTitleMarginEnd()
            int r9 = r6.getTitleMarginTop()
            int r1 = r6.getTitleMarginBottom()
            goto L_0x0069
        L_0x00ee:
            r12 = 0
            r1 = 0
            r5 = 0
            r9 = 0
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.A04(int, int, int, int, boolean):void");
    }

    public final void A05() {
        if (this.A0K != null || this.A05 != null) {
            setScrimsShown(AnonymousClass000.A1U(getHeight() + this.A00, getScrimVisibleHeightTrigger()));
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        Drawable drawable = this.A0K;
        if (drawable != null && this.A01 > 0) {
            View view2 = this.A07;
            if (view2 == null || view2 == this) {
                view2 = this.A08;
            }
            if (view == view2) {
                int width = getWidth();
                int height = getHeight();
                if (this.A02 == 1 && view != null && this.A0A) {
                    height = view.getBottom();
                }
                drawable.setBounds(0, 0, width, height);
                this.A0K.mutate().setAlpha(this.A01);
                this.A0K.draw(canvas);
                z = true;
                if (super.drawChild(canvas, view, j) && !z) {
                    return false;
                }
            }
        }
        z = false;
        return super.drawChild(canvas, view, j) ? true : true;
    }

    public int getCollapsedTitleGravity() {
        return this.A0U.A0R;
    }

    public float getCollapsedTitleTextSize() {
        return this.A0U.A07;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.A0U.A0e;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.A0K;
    }

    public int getExpandedTitleGravity() {
        return this.A0U.A0V;
    }

    public int getExpandedTitleMarginBottom() {
        return this.A0C;
    }

    public int getExpandedTitleMarginEnd() {
        return this.A0D;
    }

    public int getExpandedTitleMarginStart() {
        return this.A0E;
    }

    public int getExpandedTitleMarginTop() {
        return this.A0F;
    }

    public float getExpandedTitleTextSize() {
        return this.A0U.A0M;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.A0U.A0f;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.A0U.A0W;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.A0U.A0g;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.A0U.A0g.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.A0U.A0g.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.A0U.A0X;
    }

    public int getScrimAlpha() {
        return this.A01;
    }

    public long getScrimAnimationDuration() {
        return this.A03;
    }

    public int getScrimVisibleHeightTrigger() {
        int i;
        int i2 = this.A0H;
        if (i2 >= 0) {
            return i2 + this.A0J + this.A0G;
        }
        AnonymousClass1HO r0 = this.A09;
        if (r0 != null) {
            i = r0.A05();
        } else {
            i = 0;
        }
        int minimumHeight = getMinimumHeight();
        if (minimumHeight > 0) {
            return Math.min((minimumHeight * 2) + i, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.A05;
    }

    public CharSequence getTitle() {
        if (this.A0A) {
            return this.A0U.A0j;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.A02;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.A0U.A0Y;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.A0U.A0h;
    }

    public void setCollapsedTitleGravity(int i) {
        this.A0U.A09(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.A0U.A08(i);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        C26249Cvn cvn = this.A0U;
        if (cvn.A0b != colorStateList) {
            cvn.A0b = colorStateList;
            cvn.A0D(false);
        }
    }

    public void setCollapsedTitleTextSize(float f) {
        C26249Cvn cvn = this.A0U;
        if (cvn.A07 != f) {
            cvn.A07 = f;
            cvn.A0D(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C26249Cvn cvn = this.A0U;
        if (C26249Cvn.A04(typeface, cvn)) {
            cvn.A0D(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.A0K;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A0K = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.A08;
                if (this.A02 == 1 && viewGroup != null && this.A0A) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.A0K.setCallback(this);
                this.A0K.setAlpha(this.A01);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setExpandedTitleGravity(int i) {
        C26249Cvn cvn = this.A0U;
        if (cvn.A0V != i) {
            cvn.A0V = i;
            cvn.A0D(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.A0C = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.A0D = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.A0E = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.A0F = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.A0U.A0A(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C26249Cvn cvn = this.A0U;
        if (cvn.A0d != colorStateList) {
            cvn.A0d = colorStateList;
            cvn.A0D(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        C26249Cvn cvn = this.A0U;
        if (cvn.A0M != f) {
            cvn.A0M = f;
            cvn.A0D(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C26249Cvn cvn = this.A0U;
        if (C26249Cvn.A05(typeface, cvn)) {
            cvn.A0D(false);
        }
    }

    public void setHyphenationFrequency(int i) {
        this.A0U.A0W = i;
    }

    public void setLineSpacingAdd(float f) {
        this.A0U.A0P = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.A0U.A0Q = f;
    }

    public void setMaxLines(int i) {
        C26249Cvn cvn = this.A0U;
        if (i != cvn.A0X) {
            cvn.A0X = i;
            cvn.A0D(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.A0U.A0p = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.A01) {
            if (!(this.A0K == null || (viewGroup = this.A08) == null)) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.A01 = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.A0H != i) {
            this.A0H = i;
            A05();
        }
    }

    public void setStaticLayoutBuilderConfigurer(C28665EDc eDc) {
        C26249Cvn cvn = this.A0U;
        if (null != eDc) {
            cvn.A0i = eDc;
            cvn.A0D(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A05 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    AnonymousClass000.A17(this.A05, this);
                }
                C27831Xu.A0G(getLayoutDirection(), this.A05);
                this.A05.setVisible(AnonymousClass000.A1P(getVisibility()), false);
                this.A05.setCallback(this);
                this.A05.setAlpha(this.A01);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setTitle(CharSequence charSequence) {
        C26249Cvn cvn = this.A0U;
        if (charSequence == null || !TextUtils.equals(cvn.A0j, charSequence)) {
            cvn.A0j = charSequence;
            cvn.A0k = null;
            cvn.A0D(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.A02 = i;
        boolean A1R = C17890vO.A1R(i);
        this.A0U.A0n = A1R;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A02 == 1) {
                appBarLayout.A09 = false;
            }
        }
        if (A1R && this.A0K == null) {
            float dimension = getResources().getDimension(2131166399);
            AnonymousClass1Z8 r1 = this.A0T;
            setContentScrimColor(r1.A00(r1.A01, dimension));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        C26249Cvn cvn = this.A0U;
        cvn.A0h = truncateAt;
        cvn.A0D(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.A0A) {
            this.A0A = z;
            setContentDescription(getTitle());
            A02();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        C26249Cvn cvn = this.A0U;
        cvn.A0Y = timeInterpolator;
        cvn.A0D(false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CollapsingToolbarLayout(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r12 = 2132084543(0x7f15073f, float:1.980926E38)
            r8 = r15
            r11 = r16
            android.content.Context r0 = X.C27771Xm.A00(r14, r15, r11, r12)
            r13.<init>(r0, r15, r11)
            r6 = 1
            r13.A0P = r6
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r13.A0S = r0
            r3 = -1
            r13.A0H = r3
            r1 = 0
            r13.A0J = r1
            r13.A0G = r1
            android.content.Context r7 = r13.getContext()
            X.Cvn r5 = new X.Cvn
            r5.<init>(r13)
            r13.A0U = r5
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A00
            r5.A0Z = r0
            r5.A0D(r1)
            r5.A0p = r1
            X.1Z8 r0 = new X.1Z8
            r0.<init>(r7)
            r13.A0T = r0
            int[] r9 = X.C27781Xn.A0C
            int[] r10 = new int[r1]
            android.content.res.TypedArray r2 = X.C27791Xo.A00(r7, r8, r9, r10, r11, r12)
            r4 = 4
            r0 = 8388691(0x800053, float:1.175506E-38)
            int r4 = r2.getInt(r4, r0)
            int r0 = r5.A0V
            if (r0 == r4) goto L_0x0052
            r5.A0V = r4
            r5.A0D(r1)
        L_0x0052:
            r0 = 8388627(0x800013, float:1.175497E-38)
            int r0 = r2.getInt(r1, r0)
            r5.A09(r0)
            r0 = 5
            int r0 = r2.getDimensionPixelSize(r0, r1)
            r13.A0C = r0
            r13.A0D = r0
            r13.A0F = r0
            r13.A0E = r0
            r0 = 8
            r4 = 8
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0079
            int r0 = r2.getDimensionPixelSize(r4, r1)
            r13.A0E = r0
        L_0x0079:
            r0 = 7
            r4 = 7
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0087
            int r0 = r2.getDimensionPixelSize(r4, r1)
            r13.A0D = r0
        L_0x0087:
            r0 = 9
            r4 = 9
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0097
            int r0 = r2.getDimensionPixelSize(r4, r1)
            r13.A0F = r0
        L_0x0097:
            r0 = 6
            r4 = 6
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x00a5
            int r0 = r2.getDimensionPixelSize(r4, r1)
            r13.A0C = r0
        L_0x00a5:
            r0 = 20
            boolean r0 = r2.getBoolean(r0, r6)
            r13.A0A = r0
            r0 = 18
            java.lang.CharSequence r0 = r2.getText(r0)
            r13.setTitle(r0)
            r0 = 2132083846(0x7f150486, float:1.9807846E38)
            r5.A0A(r0)
            r0 = 2132083817(0x7f150469, float:1.9807787E38)
            r5.A08(r0)
            r0 = 10
            r4 = 10
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x00d3
            int r0 = r2.getResourceId(r4, r1)
            r5.A0A(r0)
        L_0x00d3:
            boolean r0 = r2.hasValue(r6)
            if (r0 == 0) goto L_0x00e0
            int r0 = r2.getResourceId(r6, r1)
            r5.A08(r0)
        L_0x00e0:
            r0 = 22
            r4 = 22
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x00fa
            int r4 = r2.getInt(r4, r3)
            if (r4 == 0) goto L_0x01c4
            if (r4 == r6) goto L_0x01c0
            r0 = 3
            if (r4 == r0) goto L_0x01bc
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
        L_0x00f7:
            r13.setTitleEllipsize(r0)
        L_0x00fa:
            r0 = 11
            r4 = 11
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0111
            android.content.res.ColorStateList r4 = X.AnonymousClass1YT.A01(r7, r2, r4)
            android.content.res.ColorStateList r0 = r5.A0d
            if (r0 == r4) goto L_0x0111
            r5.A0d = r4
            r5.A0D(r1)
        L_0x0111:
            r0 = 2
            r4 = 2
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0126
            android.content.res.ColorStateList r4 = X.AnonymousClass1YT.A01(r7, r2, r4)
            android.content.res.ColorStateList r0 = r5.A0b
            if (r0 == r4) goto L_0x0126
            r5.A0b = r4
            r5.A0D(r1)
        L_0x0126:
            r0 = 16
            int r0 = r2.getDimensionPixelSize(r0, r3)
            r13.A0H = r0
            r0 = 14
            r4 = 14
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0145
            int r4 = r2.getInt(r4, r6)
            int r0 = r5.A0X
            if (r4 == r0) goto L_0x0145
            r5.A0X = r4
            r5.A0D(r1)
        L_0x0145:
            r0 = 21
            r4 = 21
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x015c
            int r0 = r2.getResourceId(r4, r1)
            android.view.animation.Interpolator r0 = android.view.animation.AnimationUtils.loadInterpolator(r7, r0)
            r5.A0Y = r0
            r5.A0D(r1)
        L_0x015c:
            r4 = 15
            r0 = 600(0x258, float:8.41E-43)
            int r0 = r2.getInt(r4, r0)
            long r4 = (long) r0
            r13.A03 = r4
            r4 = 2130970554(0x7f0407ba, float:1.7549821E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A01
            android.animation.TimeInterpolator r0 = X.C29101bc.A01(r0, r7, r4)
            r13.A0Q = r0
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A04
            android.animation.TimeInterpolator r0 = X.C29101bc.A01(r0, r7, r4)
            r13.A0R = r0
            r0 = 3
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r13.setContentScrim(r0)
            r0 = 17
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0)
            r13.setStatusBarScrim(r0)
            r0 = 19
            int r0 = r2.getInt(r0, r1)
            r13.setTitleCollapseMode(r0)
            r0 = 23
            int r0 = r2.getResourceId(r0, r3)
            r13.A0I = r0
            r0 = 13
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0O = r0
            r0 = 12
            boolean r0 = r2.getBoolean(r0, r1)
            r13.A0N = r0
            r2.recycle()
            r13.setWillNotDraw(r1)
            r1 = 2
            X.D6T r0 = new X.D6T
            r0.<init>(r13, r1)
            X.AnonymousClass1HF.A0g(r13, r0)
            return
        L_0x01bc:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MARQUEE
            goto L_0x00f7
        L_0x01c0:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x00f7
        L_0x01c4:
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.START
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static C25070CWd A00(View view) {
        C25070CWd cWd = (C25070CWd) view.getTag(2131436793);
        if (cWd != null) {
            return cWd;
        }
        C25070CWd cWd2 = new C25070CWd(view);
        view.setTag(2131436793, cWd2);
        return cWd2;
    }

    public void draw(Canvas canvas) {
        AnonymousClass1HO r0;
        int A052;
        Drawable drawable;
        super.draw(canvas);
        A01();
        if (this.A08 == null && (drawable = this.A0K) != null && this.A01 > 0) {
            drawable.mutate().setAlpha(this.A01);
            this.A0K.draw(canvas);
        }
        if (this.A0A && this.A0M) {
            if (this.A08 != null && this.A0K != null && this.A01 > 0 && this.A02 == 1) {
                C26249Cvn cvn = this.A0U;
                if (cvn.A0G < cvn.A0O) {
                    int save = canvas.save();
                    canvas.clipRect(this.A0K.getBounds(), Region.Op.DIFFERENCE);
                    cvn.A0C(canvas);
                    canvas.restoreToCount(save);
                }
            }
            this.A0U.A0C(canvas);
        }
        if (this.A05 != null && this.A01 > 0 && (r0 = this.A09) != null && (A052 = r0.A05()) > 0) {
            this.A05.setBounds(0, -this.A00, getWidth(), A052 - this.A00);
            this.A05.mutate().setAlpha(this.A01);
            this.A05.draw(canvas);
        }
    }

    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A05;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        C26249Cvn cvn = this.A0U;
        if (cvn != null) {
            cvn.A0q = drawableState;
            ColorStateList colorStateList2 = cvn.A0b;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cvn.A0d) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                cvn.A0D(false);
                z = true;
            }
            z2 |= z;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.BI7, android.widget.FrameLayout$LayoutParams] */
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new FrameLayout.LayoutParams(context, attributeSet);
        layoutParams.A01 = 0;
        layoutParams.A00 = 0.5f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27781Xn.A0D);
        layoutParams.A01 = obtainStyledAttributes.getInt(0, 0);
        layoutParams.A00 = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.A02 == 1) {
                appBarLayout.A09 = false;
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            C28664EDb eDb = this.A0L;
            if (eDb == null) {
                eDb = new DL3(this);
                this.A0L = eDb;
            }
            appBarLayout.A03(eDb);
            AnonymousClass1HF.A0T(this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0U.A0B(configuration);
    }

    public void onDetachedFromWindow() {
        List list;
        ViewParent parent = getParent();
        C28664EDb eDb = this.A0L;
        if (!(eDb == null || !(parent instanceof AppBarLayout) || (list = ((AppBarLayout) parent).A07) == null)) {
            list.remove(eDb);
        }
        super.onDetachedFromWindow();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.A0K;
        if (drawable != null) {
            ViewGroup viewGroup = this.A08;
            if (this.A02 == 1 && viewGroup != null && this.A0A) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setContentScrimResource(int i) {
        setContentScrim(AnonymousClass3MZ.A0B(this, i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (isInEditMode() != false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScrimsShown(boolean r6) {
        /*
            r5 = this;
            boolean r0 = r5.isLaidOut()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r5.isInEditMode()
            r1 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            boolean r0 = r5.A0B
            if (r0 == r6) goto L_0x0055
            r4 = 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x0065
            if (r6 != 0) goto L_0x0019
            r4 = 0
        L_0x0019:
            r5.A01()
            android.animation.ValueAnimator r0 = r5.A04
            if (r0 != 0) goto L_0x0059
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r5.A04 = r1
            int r0 = r5.A01
            if (r4 <= r0) goto L_0x0056
            android.animation.TimeInterpolator r0 = r5.A0Q
        L_0x002d:
            r1.setInterpolator(r0)
            android.animation.ValueAnimator r1 = r5.A04
            r0 = 6
            X.C26323Cxg.A00(r1, r5, r0)
        L_0x0036:
            android.animation.ValueAnimator r2 = r5.A04
            long r0 = r5.A03
            r2.setDuration(r0)
            android.animation.ValueAnimator r3 = r5.A04
            int[] r2 = X.C108945cZ.A1W()
            r1 = 0
            int r0 = r5.A01
            r2[r1] = r0
            r0 = 1
            r2[r0] = r4
            r3.setIntValues(r2)
            android.animation.ValueAnimator r0 = r5.A04
            r0.start()
        L_0x0053:
            r5.A0B = r6
        L_0x0055:
            return
        L_0x0056:
            android.animation.TimeInterpolator r0 = r5.A0R
            goto L_0x002d
        L_0x0059:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0036
            android.animation.ValueAnimator r0 = r5.A04
            r0.cancel()
            goto L_0x0036
        L_0x0065:
            if (r6 != 0) goto L_0x0068
            r4 = 0
        L_0x0068:
            r5.setScrimAlpha(r4)
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.setScrimsShown(boolean):void");
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(AnonymousClass3MZ.A0B(this, i));
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1P = AnonymousClass000.A1P(i);
        Drawable drawable = this.A05;
        if (!(drawable == null || drawable.isVisible() == A1P)) {
            this.A05.setVisible(A1P, false);
        }
        Drawable drawable2 = this.A0K;
        if (drawable2 != null && drawable2.isVisible() != A1P) {
            this.A0K.setVisible(A1P, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0K || drawable == this.A05) {
            return true;
        }
        return false;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof BI7;
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.A0N = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.A0O = z;
    }

    public void setScrimAnimationDuration(long j) {
        this.A03 = j;
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ViewGroup$LayoutParams, X.BI7, android.widget.FrameLayout$LayoutParams] */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.A01 = 0;
        layoutParams2.A00 = 0.5f;
        return layoutParams2;
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969104);
    }
}
