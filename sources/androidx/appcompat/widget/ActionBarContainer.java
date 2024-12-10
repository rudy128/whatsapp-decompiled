package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass05X;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
    public Drawable A00;
    public Drawable A01;
    public Drawable A02;
    public View A03;
    public boolean A04;
    public boolean A05;
    public int A06;
    public View A07;
    public View A08;
    public boolean A09;

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A09 || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.A07
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r3) goto L_0x001c
            int r1 = r6.A06
            if (r1 < 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            int r0 = java.lang.Math.min(r1, r0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L_0x001c:
            super.onMeasure(r7, r8)
            android.view.View r0 = r6.A07
            if (r0 == 0) goto L_0x007f
            int r4 = android.view.View.MeasureSpec.getMode(r8)
            android.view.View r0 = r6.A03
            if (r0 == 0) goto L_0x007f
            int r1 = r0.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x007f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x007f
            android.view.View r2 = r6.A07
            if (r2 == 0) goto L_0x0084
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0084
            int r0 = r2.getMeasuredHeight()
            if (r0 == 0) goto L_0x0084
            android.view.View r0 = r6.A07
        L_0x004b:
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r0.getMeasuredHeight()
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            int r1 = r1 + r0
        L_0x005b:
            if (r4 != r3) goto L_0x0080
            int r5 = android.view.View.MeasureSpec.getSize(r8)
        L_0x0061:
            int r4 = r6.getMeasuredWidth()
            android.view.View r0 = r6.A03
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r2 = r0.getMeasuredHeight()
            int r0 = r3.topMargin
            int r2 = r2 + r0
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r1 = r1 + r2
            int r0 = java.lang.Math.min(r1, r5)
            r6.setMeasuredDimension(r4, r0)
        L_0x007f:
            return
        L_0x0080:
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0061
        L_0x0084:
            android.view.View r2 = r6.A08
            if (r2 == 0) goto L_0x0099
            int r1 = r2.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0099
            int r0 = r2.getMeasuredHeight()
            if (r0 == 0) goto L_0x0099
            android.view.View r0 = r6.A08
            goto L_0x004b
        L_0x0099:
            r1 = 0
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0 == null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.A00
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r5.unscheduleDrawable(r0)
        L_0x000d:
            r5.A00 = r6
            if (r6 == 0) goto L_0x0033
            r6.setCallback(r5)
            android.view.View r0 = r5.A07
            if (r0 == 0) goto L_0x0033
            android.graphics.drawable.Drawable r4 = r5.A00
            int r3 = r0.getLeft()
            android.view.View r0 = r5.A07
            int r2 = r0.getTop()
            android.view.View r0 = r5.A07
            int r1 = r0.getRight()
            android.view.View r0 = r5.A07
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L_0x0033:
            boolean r0 = r5.A04
            r1 = 1
            if (r0 == 0) goto L_0x0046
            android.graphics.drawable.Drawable r0 = r5.A01
        L_0x003a:
            if (r0 != 0) goto L_0x004d
        L_0x003c:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            r5.invalidateOutline()
            return
        L_0x0046:
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 != 0) goto L_0x004d
            android.graphics.drawable.Drawable r0 = r5.A02
            goto L_0x003a
        L_0x004d:
            r1 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4 = this.A01;
        if (drawable4 != null) {
            drawable4.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.A01);
        }
        this.A01 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A04 && (drawable3 = this.A01) != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.A04) {
            drawable2 = this.A01;
        } else {
            if (this.A00 == null) {
                drawable2 = this.A02;
            }
            setWillNotDraw(z);
            invalidate();
            invalidateOutline();
        }
        if (drawable2 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r0 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setStackedBackground(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            android.graphics.drawable.Drawable r1 = r5.A02
            if (r1 == 0) goto L_0x000d
            r0 = 0
            r1.setCallback(r0)
            android.graphics.drawable.Drawable r0 = r5.A02
            r5.unscheduleDrawable(r0)
        L_0x000d:
            r5.A02 = r6
            if (r6 == 0) goto L_0x0037
            r6.setCallback(r5)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0037
            android.graphics.drawable.Drawable r4 = r5.A02
            if (r4 == 0) goto L_0x0037
            android.view.View r0 = r5.A03
            int r3 = r0.getLeft()
            android.view.View r0 = r5.A03
            int r2 = r0.getTop()
            android.view.View r0 = r5.A03
            int r1 = r0.getRight()
            android.view.View r0 = r5.A03
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L_0x0037:
            boolean r0 = r5.A04
            r1 = 1
            if (r0 == 0) goto L_0x004a
            android.graphics.drawable.Drawable r0 = r5.A01
        L_0x003e:
            if (r0 != 0) goto L_0x0051
        L_0x0040:
            r5.setWillNotDraw(r1)
            r5.invalidate()
            r5.invalidateOutline()
            return
        L_0x004a:
            android.graphics.drawable.Drawable r0 = r5.A00
            if (r0 != 0) goto L_0x0051
            android.graphics.drawable.Drawable r0 = r5.A02
            goto L_0x003e
        L_0x0051:
            r1 = 0
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setStackedBackground(android.graphics.drawable.Drawable):void");
    }

    public void setTabContainer(AnonymousClass05X r2) {
        View view = this.A03;
        if (view != null) {
            removeView(view);
        }
        this.A03 = r2;
        if (r2 != null) {
            addView(r2);
            throw AnonymousClass000.A0s("getLayoutParams");
        }
    }

    public void setTransitioning(boolean z) {
        this.A09 = z;
        int i = 262144;
        if (z) {
            i = 393216;
        }
        setDescendantFocusability(i);
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if ((drawable != this.A00 || this.A04) && ((drawable != this.A02 || !this.A05) && ((drawable != this.A01 || !this.A04) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0043, code lost:
        if (r0 == null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContainer(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r4.<init>(r5, r6)
            X.04S r0 = new X.04S
            r0.<init>(r4)
            r4.setBackground(r0)
            int[] r0 = X.C002501d.A00
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r6, r0)
            r0 = 0
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r4.A00 = r0
            r0 = 2
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r4.A02 = r0
            r1 = 13
            r0 = -1
            int r0 = r3.getDimensionPixelSize(r1, r0)
            r4.A06 = r0
            int r2 = r4.getId()
            r0 = 2131435552(0x7f0b2020, float:1.849295E38)
            r1 = 1
            if (r2 != r0) goto L_0x003a
            r4.A04 = r1
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r1)
            r4.A01 = r0
        L_0x003a:
            r3.recycle()
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r4.A01
        L_0x0043:
            if (r0 != 0) goto L_0x0050
        L_0x0045:
            r4.setWillNotDraw(r1)
            return
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r4.A00
            if (r0 != 0) goto L_0x0050
            android.graphics.drawable.Drawable r0 = r4.A02
            goto L_0x0043
        L_0x0050:
            r1 = 0
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A00;
        if (drawable != null && drawable.isStateful()) {
            AnonymousClass000.A17(this.A00, this);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null && drawable2.isStateful()) {
            AnonymousClass000.A17(this.A02, this);
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null && drawable3.isStateful()) {
            AnonymousClass000.A17(this.A01, this);
        }
    }

    public View getTabContainer() {
        return this.A03;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A07 = findViewById(2131427472);
        this.A08 = findViewById(2131427491);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r8.A04 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r2 = r8.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        if (r8.A00 == null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (r8.A07.getVisibility() != 0) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0055, code lost:
        r6 = r8.A00;
        r4 = r8.A07.getLeft();
        r2 = r8.A07.getTop();
        r1 = r8.A07.getRight();
        r0 = r8.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        r6.setBounds(r4, r2, r1, r0.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r8.A05 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0074, code lost:
        if (r3 == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r4 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
        if (r4 == null) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
        r4.setBounds(r5.getLeft(), r5.getTop(), r5.getRight(), r5.getBottom());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        r0 = r8.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r0 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0.getVisibility() != 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r6 = r8.A00;
        r4 = r8.A08.getLeft();
        r2 = r8.A08.getTop();
        r1 = r8.A08.getRight();
        r0 = r8.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        r8.A00.setBounds(0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r7 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5.getVisibility() == 8) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r5 != null) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r5.getVisibility() == 8) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r6 = getMeasuredHeight();
        r1 = r6 - r5.getMeasuredHeight();
        r0 = ((android.view.ViewGroup.MarginLayoutParams) r5.getLayoutParams()).bottomMargin;
        r5.layout(r10, r1 - r0, r12, r6 - r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            super.onLayout(r9, r10, r11, r12, r13)
            android.view.View r5 = r8.A03
            r7 = 1
            r1 = 8
            r4 = 0
            if (r5 == 0) goto L_0x0012
            int r0 = r5.getVisibility()
            r3 = 1
            if (r0 != r1) goto L_0x0015
        L_0x0012:
            r3 = 0
            if (r5 == 0) goto L_0x0032
        L_0x0015:
            int r0 = r5.getVisibility()
            if (r0 == r1) goto L_0x0032
            int r6 = r8.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r5.getMeasuredHeight()
            int r1 = r6 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r6 = r6 - r0
            r5.layout(r10, r1, r12, r6)
        L_0x0032:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r2 = r8.A01
            if (r2 == 0) goto L_0x0048
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            r2.setBounds(r4, r4, r1, r0)
        L_0x0045:
            r8.invalidate()
        L_0x0048:
            return
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r8.A00
            if (r0 == 0) goto L_0x00b5
            android.view.View r0 = r8.A07
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x008e
            android.graphics.drawable.Drawable r6 = r8.A00
            android.view.View r0 = r8.A07
            int r4 = r0.getLeft()
            android.view.View r0 = r8.A07
            int r2 = r0.getTop()
            android.view.View r0 = r8.A07
            int r1 = r0.getRight()
            android.view.View r0 = r8.A07
        L_0x006b:
            int r0 = r0.getBottom()
            r6.setBounds(r4, r2, r1, r0)
        L_0x0072:
            r8.A05 = r3
            if (r3 == 0) goto L_0x00b7
            android.graphics.drawable.Drawable r4 = r8.A02
            if (r4 == 0) goto L_0x00b7
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L_0x0045
        L_0x008e:
            android.view.View r0 = r8.A08
            if (r0 == 0) goto L_0x00af
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00af
            android.graphics.drawable.Drawable r6 = r8.A00
            android.view.View r0 = r8.A08
            int r4 = r0.getLeft()
            android.view.View r0 = r8.A08
            int r2 = r0.getTop()
            android.view.View r0 = r8.A08
            int r1 = r0.getRight()
            android.view.View r0 = r8.A08
            goto L_0x006b
        L_0x00af:
            android.graphics.drawable.Drawable r0 = r8.A00
            r0.setBounds(r4, r4, r4, r4)
            goto L_0x0072
        L_0x00b5:
            r7 = 0
            goto L_0x0072
        L_0x00b7:
            if (r7 == 0) goto L_0x0048
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean A1P = AnonymousClass000.A1P(i);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setVisible(A1P, false);
        }
        Drawable drawable2 = this.A02;
        if (drawable2 != null) {
            drawable2.setVisible(A1P, false);
        }
        Drawable drawable3 = this.A01;
        if (drawable3 != null) {
            drawable3.setVisible(A1P, false);
        }
    }

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
