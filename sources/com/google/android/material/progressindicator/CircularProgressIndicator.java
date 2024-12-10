package com.google.android.material.progressindicator;

import X.AnonymousClass000;
import X.AnonymousClass1ZA;
import X.BE6;
import X.BE9;
import X.BEA;
import X.BFE;
import X.BiZ;
import X.Bia;
import X.C23512Bib;
import X.C24468C5i;
import X.C25692CkN;
import X.C6Y;
import X.C6Z;
import X.C72453Mb;
import X.CBO;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import java.util.Arrays;
import java.util.List;

public final class CircularProgressIndicator extends ProgressBar {
    public int A00;
    public int A01;
    public CBO A02;
    public C24468C5i A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final C6Y A08;
    public final C6Y A09;
    public final Runnable A0A;
    public final Runnable A0B;

    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - C72453Mb.A0C(this), getHeight() - BE9.A08(this));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        C6Z currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            C23512Bib bib = (C23512Bib) currentDrawingDelegate;
            C24468C5i c5i = bib.A00;
            int i3 = c5i.A07 + (c5i.A06 * 2);
            if (i3 < 0) {
                paddingLeft = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            } else {
                paddingLeft = i3 + getPaddingLeft() + getPaddingRight();
            }
            C24468C5i c5i2 = bib.A00;
            int i4 = c5i2.A07 + (c5i2.A06 * 2);
            if (i4 < 0) {
                paddingTop = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
            } else {
                paddingTop = i4 + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(paddingLeft, paddingTop);
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if (z != isIndeterminate()) {
            BFE bfe = (BFE) getCurrentDrawable();
            if (bfe != null) {
                bfe.A01(false, false, false);
            }
            super.setIndeterminate(z);
            BFE bfe2 = (BFE) getCurrentDrawable();
            if (bfe2 != null) {
                bfe2.A01(A02(), false, false);
            }
            if ((bfe2 instanceof BiZ) && A02()) {
                ((BiZ) bfe2).A00.A00();
            }
            this.A04 = false;
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = BE6.A1X();
            iArr[0] = AnonymousClass1ZA.A01(getContext(), 2130969136, -1);
        }
        C24468C5i c5i = this.A03;
        if (!Arrays.equals(c5i.A08, iArr)) {
            c5i.A08 = iArr;
            C25692CkN ckN = ((BiZ) super.getIndeterminateDrawable()).A00;
            ckN.A02 = 0;
            ckN.A0A[0] = BEA.A04(ckN.A08.A08[0], ckN.A06.A01);
            ckN.A01 = 0.0f;
            invalidate();
        }
    }

    public synchronized void setProgress(int i) {
        if (!isIndeterminate()) {
            A01(i, false);
        }
    }

    public int getHideAnimationBehavior() {
        return this.A03.A00;
    }

    public int[] getIndicatorColor() {
        return this.A03.A08;
    }

    public int getIndicatorDirection() {
        return this.A03.A05;
    }

    public int getIndicatorInset() {
        return this.A03.A06;
    }

    public int getIndicatorSize() {
        return this.A03.A07;
    }

    public int getShowAnimationBehavior() {
        return this.A03.A01;
    }

    public int getTrackColor() {
        return this.A03.A02;
    }

    public int getTrackCornerRadius() {
        return this.A03.A03;
    }

    public int getTrackThickness() {
        return this.A03.A04;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0A);
        removeCallbacks(this.A0B);
        ((BFE) getCurrentDrawable()).A01(false, false, false);
        if (super.getIndeterminateDrawable() != null) {
            BFE bfe = (BFE) super.getIndeterminateDrawable();
            C6Y c6y = this.A08;
            List list = bfe.A05;
            if (list != null && list.contains(c6y)) {
                bfe.A05.remove(c6y);
                if (bfe.A05.isEmpty()) {
                    bfe.A05 = null;
                }
            }
            ((BiZ) super.getIndeterminateDrawable()).A00.A05 = null;
        }
        if (super.getProgressDrawable() != null) {
            BFE bfe2 = (BFE) super.getProgressDrawable();
            C6Y c6y2 = this.A08;
            List list2 = bfe2.A05;
            if (list2 != null && list2.contains(c6y2)) {
                bfe2.A05.remove(c6y2);
                if (bfe2.A05.isEmpty()) {
                    bfe2.A05 = null;
                }
            }
        }
        super.onDetachedFromWindow();
    }

    public void setAnimatorDurationScaleProvider(CBO cbo) {
        this.A02 = cbo;
        if (super.getProgressDrawable() != null) {
            ((BFE) super.getProgressDrawable()).A04 = cbo;
        }
        if (super.getIndeterminateDrawable() != null) {
            ((BFE) super.getIndeterminateDrawable()).A04 = cbo;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.A03.A00 = i;
        invalidate();
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            drawable = null;
        } else if (drawable instanceof BiZ) {
            ((BFE) drawable).A01(false, false, false);
        } else {
            throw AnonymousClass000.A0k("Cannot set framework drawable as indeterminate drawable.");
        }
        super.setIndeterminateDrawable(drawable);
    }

    public void setIndicatorDirection(int i) {
        this.A03.A05 = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        C24468C5i c5i = this.A03;
        if (c5i.A06 != i) {
            c5i.A06 = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        C24468C5i c5i = this.A03;
        int max = Math.max(i, c5i.A04 * 2);
        if (c5i.A07 != max) {
            c5i.A07 = max;
            invalidate();
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof Bia) {
            BFE bfe = (BFE) drawable;
            bfe.A01(false, false, false);
            super.setProgressDrawable(bfe);
            bfe.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw AnonymousClass000.A0k("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.A03.A01 = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        C24468C5i c5i = this.A03;
        if (c5i.A02 != i) {
            c5i.A02 = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        C24468C5i c5i = this.A03;
        if (c5i.A03 != i) {
            c5i.A03 = Math.min(i, c5i.A04 / 2);
        }
    }

    public void setTrackThickness$BaseProgressIndicator(int i) {
        C24468C5i c5i = this.A03;
        if (c5i.A04 != i) {
            c5i.A04 = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.A01 = i;
            return;
        }
        throw AnonymousClass000.A0k("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.C5i] */
    /* JADX WARNING: type inference failed for: r0v50, types: [X.CBO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.Bib, X.C6Z] */
    /* JADX WARNING: type inference failed for: r0v52, types: [X.BiZ, X.BFE, android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.Bib, X.C6Z] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CircularProgressIndicator(android.content.Context r23, android.util.AttributeSet r24, int r25) {
        /*
            r22 = this;
            r15 = 2132084751(0x7f15080f, float:1.9809681E38)
            r0 = 2132084800(0x7f150840, float:1.980978E38)
            r1 = r23
            r11 = r24
            r6 = r25
            android.content.Context r0 = X.C27771Xm.A00(r1, r11, r6, r0)
            r5 = r22
            r5.<init>(r0, r11, r6)
            r4 = 0
            r5.A04 = r4
            r0 = 4
            r5.A01 = r0
            r1 = 18
            X.DTf r0 = new X.DTf
            r0.<init>((java.lang.Object) r5, (int) r1)
            r5.A0B = r0
            r1 = 19
            X.DTf r0 = new X.DTf
            r0.<init>((java.lang.Object) r5, (int) r1)
            r5.A0A = r0
            r3 = 1
            X.BMd r0 = new X.BMd
            r0.<init>(r5, r3)
            r5.A09 = r0
            r2 = 2
            X.BMd r0 = new X.BMd
            r0.<init>(r5, r2)
            r5.A08 = r0
            android.content.Context r10 = r5.getContext()
            r14 = 2130969065(0x7f0401e9, float:1.7546801E38)
            X.C5i r1 = new X.C5i
            r1.<init>()
            int[] r0 = new int[r4]
            r1.A08 = r0
            android.content.res.Resources r7 = r10.getResources()
            r0 = 2131167911(0x7f070aa7, float:1.7950109E38)
            int r7 = r7.getDimensionPixelSize(r0)
            int[] r12 = X.C27781Xn.A03
            int[] r13 = new int[r4]
            android.content.res.TypedArray r8 = X.C27791Xo.A00(r10, r11, r12, r13, r14, r15)
            r0 = 8
            int r0 = X.AnonymousClass1YT.A00(r10, r8, r0, r7)
            r1.A04 = r0
            r0 = 7
            int r7 = X.AnonymousClass1YT.A00(r10, r8, r0, r4)
            int r0 = r1.A04
            int r0 = r0 / 2
            int r0 = java.lang.Math.min(r7, r0)
            r1.A03 = r0
            r0 = 4
            int r0 = r8.getInt(r0, r4)
            r1.A01 = r0
            int r0 = r8.getInt(r3, r4)
            r1.A00 = r0
            boolean r0 = r8.hasValue(r2)
            r7 = -1
            if (r0 != 0) goto L_0x0183
            int[] r9 = new int[r3]
            r0 = 2130969136(0x7f040230, float:1.7546945E38)
            int r0 = X.AnonymousClass1ZA.A01(r10, r0, r7)
        L_0x0094:
            r9[r4] = r0
            r1.A08 = r9
        L_0x0098:
            r0 = 6
            r9 = 6
            boolean r0 = r8.hasValue(r0)
            if (r0 == 0) goto L_0x0158
            int r0 = r8.getColor(r9, r7)
        L_0x00a4:
            r1.A02 = r0
            r8.recycle()
            android.content.res.Resources r7 = r10.getResources()
            r0 = 2131167905(0x7f070aa1, float:1.7950097E38)
            int r9 = r7.getDimensionPixelSize(r0)
            android.content.res.Resources r7 = r10.getResources()
            r0 = 2131167900(0x7f070a9c, float:1.7950087E38)
            int r8 = r7.getDimensionPixelSize(r0)
            int[] r18 = X.C27781Xn.A09
            int[] r0 = new int[r4]
            r16 = r10
            r17 = r11
            r19 = r0
            r20 = r14
            r21 = r15
            android.content.res.TypedArray r7 = X.C27791Xo.A00(r16, r17, r18, r19, r20, r21)
            int r2 = X.AnonymousClass1YT.A00(r10, r7, r2, r9)
            int r0 = r1.A04
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r2, r0)
            r1.A07 = r0
            int r0 = X.AnonymousClass1YT.A00(r10, r7, r3, r8)
            r1.A06 = r0
            int r0 = r7.getInt(r4, r4)
            r1.A05 = r0
            r7.recycle()
            r5.A03 = r1
            int[] r0 = new int[r4]
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r0
            r11 = r6
            r12 = r15
            android.content.res.TypedArray r2 = X.C27791Xo.A00(r7, r8, r9, r10, r11, r12)
            r0 = 5
            r1 = -1
            r2.getInt(r0, r1)
            r0 = 3
            int r1 = r2.getInt(r0, r1)
            r0 = 1000(0x3e8, float:1.401E-42)
            int r0 = java.lang.Math.min(r1, r0)
            r5.A07 = r0
            r2.recycle()
            X.CBO r0 = new X.CBO
            r0.<init>()
            r5.A02 = r0
            r5.A05 = r3
            android.content.Context r6 = r5.getContext()
            X.C5i r4 = r5.A03
            android.util.Property r0 = X.BFE.A0A
            X.Bib r2 = new X.Bib
            r2.<init>()
            r2.A00 = r4
            r2.A03 = r3
            X.CkN r1 = new X.CkN
            r1.<init>(r4)
            X.BiZ r0 = new X.BiZ
            r0.<init>(r6, r4)
            r0.A01 = r2
            r2.A01 = r0
            r0.A00 = r1
            r1.A06 = r0
            r5.setIndeterminateDrawable(r0)
            android.content.Context r2 = r5.getContext()
            X.C2w r0 = X.Bia.A05
            X.Bib r1 = new X.Bib
            r1.<init>()
            r1.A00 = r4
            r1.A03 = r3
            X.Bia r0 = new X.Bia
            r0.<init>(r2, r4, r1)
            r5.setProgressDrawable(r0)
            return
        L_0x0158:
            int[] r0 = r1.A08
            r0 = r0[r4]
            r1.A02 = r0
            android.content.res.Resources$Theme r9 = r10.getTheme()
            int[] r7 = new int[r3]
            r0 = 16842803(0x1010033, float:2.36937E-38)
            r7[r4] = r0
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r7)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r7 = r9.getFloat(r4, r0)
            r9.recycle()
            r0 = 1132396544(0x437f0000, float:255.0)
            float r7 = r7 * r0
            int r7 = (int) r7
            int r0 = r1.A02
            int r0 = X.BEA.A04(r0, r7)
            goto L_0x00a4
        L_0x0183:
            android.util.TypedValue r0 = r8.peekValue(r2)
            int r0 = r0.type
            if (r0 == r3) goto L_0x0193
            int[] r9 = new int[r3]
            int r0 = r8.getColor(r2, r7)
            goto L_0x0094
        L_0x0193:
            android.content.res.Resources r9 = r10.getResources()
            int r0 = r8.getResourceId(r2, r7)
            int[] r0 = r9.getIntArray(r0)
            r1.A08 = r0
            int r0 = r0.length
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "indicatorColors cannot be empty when indicatorColor is not used."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.CircularProgressIndicator.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A00(CircularProgressIndicator circularProgressIndicator) {
        ((BFE) circularProgressIndicator.getCurrentDrawable()).A01(false, false, true);
        if (super.getProgressDrawable() != null && super.getProgressDrawable().isVisible()) {
            return;
        }
        if (super.getIndeterminateDrawable() == null || !super.getIndeterminateDrawable().isVisible()) {
            circularProgressIndicator.setVisibility(4);
        }
    }

    private C6Z getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (super.getIndeterminateDrawable() != null) {
                return ((BiZ) super.getIndeterminateDrawable()).A01;
            }
            return null;
        } else if (super.getProgressDrawable() != null) {
            return ((Bia) super.getProgressDrawable()).A01;
        } else {
            return null;
        }
    }

    public void A01(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (super.getProgressDrawable() != null && !z) {
                super.getProgressDrawable().jumpToCurrentState();
            }
        } else if (super.getProgressDrawable() != null) {
            this.A00 = i;
            this.A06 = z;
            this.A04 = true;
            if (!super.getIndeterminateDrawable().isVisible() || Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f) {
                this.A09.A01(super.getIndeterminateDrawable());
                return;
            }
            C25692CkN ckN = ((BiZ) super.getIndeterminateDrawable()).A00;
            ObjectAnimator objectAnimator = ckN.A04;
            if (objectAnimator != null && !objectAnimator.isRunning()) {
                if (ckN.A06.isVisible()) {
                    ckN.A04.start();
                    return;
                }
                ObjectAnimator objectAnimator2 = ckN.A03;
                if (objectAnimator2 != null) {
                    objectAnimator2.cancel();
                }
            }
        }
    }

    public boolean A02() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() == 0) {
                    return true;
                }
                return false;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return super.getIndeterminateDrawable();
        }
        return super.getProgressDrawable();
    }

    public BiZ getIndeterminateDrawable() {
        return (BiZ) super.getIndeterminateDrawable();
    }

    public Bia getProgressDrawable() {
        return (Bia) super.getProgressDrawable();
    }

    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(super.getProgressDrawable() == null || super.getIndeterminateDrawable() == null)) {
            ((BiZ) super.getIndeterminateDrawable()).A00.A05 = this.A09;
        }
        if (super.getProgressDrawable() != null) {
            BFE bfe = (BFE) super.getProgressDrawable();
            C6Y c6y = this.A08;
            List list = bfe.A05;
            if (list == null) {
                list = AnonymousClass000.A13();
                bfe.A05 = list;
            }
            if (!list.contains(c6y)) {
                bfe.A05.add(c6y);
            }
        }
        if (super.getIndeterminateDrawable() != null) {
            BFE bfe2 = (BFE) super.getIndeterminateDrawable();
            C6Y c6y2 = this.A08;
            List list2 = bfe2.A05;
            if (list2 == null) {
                list2 = AnonymousClass000.A13();
                bfe2.A05 = list2;
            }
            if (!list2.contains(c6y2)) {
                bfe2.A05.add(c6y2);
            }
        }
        if (A02()) {
            if (this.A07 > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean A1P = AnonymousClass000.A1P(i);
        if (this.A05) {
            ((BFE) getCurrentDrawable()).A01(A02(), false, A1P);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.A05) {
            ((BFE) getCurrentDrawable()).A01(A02(), false, false);
        }
    }

    public void setTrackThickness(int i) {
        setTrackThickness$BaseProgressIndicator(i);
    }

    public CircularProgressIndicator(Context context) {
        this(context, (AttributeSet) null);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969065);
    }
}
