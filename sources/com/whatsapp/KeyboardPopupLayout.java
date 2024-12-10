package com.whatsapp;

import X.AnonymousClass11P;
import X.AnonymousClass1L4;
import X.AnonymousClass3MW;
import X.AnonymousClass3RR;
import X.AnonymousClass5YX;
import X.AnonymousClass96c;
import X.C18030ve;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

public class KeyboardPopupLayout extends AnonymousClass96c implements AnonymousClass5YX {
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public AnonymousClass3RR A03;
    public AnonymousClass11P A04;
    public C18030ve A05;
    public AnonymousClass1L4 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09 = false;
    public boolean A0A;
    public int A0B;
    public Paint A0C;
    public boolean A0D;
    public final Rect A0E = AnonymousClass3MW.A07();
    public final int[] A0F = new int[2];

    public void invalidate(Rect rect) {
        if (!this.A09) {
            super.invalidate(rect);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.A0C != null && this.A0B != getHeight()) {
            Rect rect = this.A0E;
            rect.set(0, this.A0B, getWidth(), getHeight());
            canvas.drawRect(rect, this.A0C);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int paddingRight;
        if (this.A0D) {
            this.A0D = false;
        } else if (this.A09) {
        } else {
            if (this.A03 != null) {
                super.onLayout(z, i, i2, i3, i2 + this.A0B);
                int[] iArr = this.A0F;
                getLocationInWindow(iArr);
                boolean z2 = this.A0A;
                AnonymousClass3RR r3 = this.A03;
                int paddingLeft = iArr[0] + getPaddingLeft();
                if (z2) {
                    paddingRight = (i3 - i) - getPaddingRight();
                    i5 = 1000000;
                } else {
                    i5 = iArr[1] + this.A0B;
                    paddingRight = (i3 - i) - getPaddingRight();
                }
                r3.update(paddingLeft, i5, paddingRight, r3.A01);
                return;
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public void requestLayout() {
        if (!this.A09) {
            super.requestLayout();
        }
    }

    public void setKeyboardPopup(AnonymousClass3RR r2) {
        if (this.A03 != r2) {
            this.A03 = r2;
            requestLayout();
        }
    }

    public void setKeyboardPopupBackgroundColor(int i) {
        if (this.A0C == null) {
            this.A0C = new Paint(1);
        }
        setWillNotDraw(false);
        this.A0C.setColor(i);
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0A();
        AnonymousClass96c.A08(this);
    }

    private int getSizeWithKeyboard() {
        int i = getResources().getConfiguration().orientation;
        if (i == 1) {
            return this.A01;
        }
        if (i != 2) {
            return -1;
        }
        return this.A00;
    }

    public AnonymousClass3RR getKeyboardPopup() {
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        if (X.AnonymousClass1L4.A00(r8) != false) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.isInEditMode()
            if (r0 != 0) goto L_0x0018
            boolean r4 = r8.A07
            if (r4 == 0) goto L_0x001c
            X.3RR r0 = r8.A03
            if (r0 != 0) goto L_0x001c
            int r0 = r8.getMeasuredHeight()
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r8.A0B = r0
        L_0x0018:
            super.onMeasure(r9, r10)
            return
        L_0x001c:
            boolean r0 = r8.A0A
            r2 = -1
            if (r0 != 0) goto L_0x00b9
            int r5 = android.view.View.MeasureSpec.getSize(r10)
            android.content.Context r0 = r8.getContext()
            android.app.Activity r3 = X.C18050vg.A00(r0)
            if (r3 == 0) goto L_0x0071
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0071
            boolean r0 = r3.isInMultiWindowMode()
            if (r0 == 0) goto L_0x0071
        L_0x003b:
            r8.A0B = r5
            X.3RR r1 = r8.A03
            if (r1 == 0) goto L_0x0018
            int r0 = r1.A0B(r2)
            r1.A01 = r0
            int r2 = android.view.View.MeasureSpec.getMode(r10)
            if (r2 == 0) goto L_0x0060
            X.1L4 r0 = r8.A06
            if (r0 == 0) goto L_0x0060
            boolean r0 = X.AnonymousClass1L4.A00(r8)
            if (r0 != 0) goto L_0x0060
            int r1 = r8.A0B
            X.3RR r0 = r8.A03
            int r0 = r0.A01
            int r1 = r1 - r0
            r8.A0B = r1
        L_0x0060:
            int r0 = r8.A0B
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            super.onMeasure(r9, r0)
            int r0 = r8.getMeasuredWidth()
            r8.setMeasuredDimension(r0, r5)
            return
        L_0x0071:
            X.1L4 r0 = r8.A06
            if (r0 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00b2
            long r3 = android.os.SystemClock.uptimeMillis()
            long r0 = r8.A02
            r8.A02 = r3
            long r3 = r3 - r0
            r6 = 500(0x1f4, double:2.47E-321)
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00b2
            boolean r0 = r8.A08
        L_0x0088:
            if (r0 == 0) goto L_0x00a6
            X.3RR r0 = r8.A03
            if (r0 == 0) goto L_0x0094
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x00a6
        L_0x0094:
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 1
            if (r1 == r0) goto L_0x00af
            r0 = 2
            if (r1 != r0) goto L_0x00a6
            r8.A00 = r5
        L_0x00a6:
            int r0 = r8.getSizeWithKeyboard()
            if (r0 == r2) goto L_0x003b
            int r2 = r5 - r0
            goto L_0x003b
        L_0x00af:
            r8.A01 = r5
            goto L_0x00a6
        L_0x00b2:
            boolean r0 = X.AnonymousClass1L4.A00(r8)
            r8.A08 = r0
            goto L_0x0088
        L_0x00b9:
            X.3RR r0 = r8.A03
            if (r0 == 0) goto L_0x0018
            X.1L4 r0 = r8.A06
            r6 = 0
            if (r0 == 0) goto L_0x00c9
            boolean r0 = X.AnonymousClass1L4.A00(r8)
            r5 = 1
            if (r0 == 0) goto L_0x00ca
        L_0x00c9:
            r5 = 0
        L_0x00ca:
            int r4 = android.view.View.MeasureSpec.getSize(r10)
            int r3 = android.view.View.MeasureSpec.getMode(r10)
            X.3RR r1 = r8.A03
            int r0 = r1.A0B(r2)
            r1.A01 = r0
            X.3RR r0 = r8.A03
            int r2 = r0.A01
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 != r0) goto L_0x00f8
            if (r5 == 0) goto L_0x00e5
            int r4 = r4 - r2
        L_0x00e5:
            r8.A0B = r4
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            super.onMeasure(r9, r0)
        L_0x00ee:
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.A0B
        L_0x00f4:
            r8.setMeasuredDimension(r1, r0)
            return
        L_0x00f8:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L_0x011e
            r0 = r4
            if (r5 == 0) goto L_0x0101
            int r0 = r4 - r2
        L_0x0101:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            super.onMeasure(r9, r0)
            int r0 = r8.getMeasuredHeight()
            r8.A0B = r0
            int r1 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            if (r5 == 0) goto L_0x0119
            int r0 = r0 + r2
        L_0x0119:
            int r0 = java.lang.Math.min(r0, r4)
            goto L_0x00f4
        L_0x011e:
            if (r5 == 0) goto L_0x0121
            int r4 = r4 - r2
        L_0x0121:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r3)
            super.onMeasure(r9, r0)
            int r0 = r8.getMeasuredHeight()
            if (r5 == 0) goto L_0x012f
            r6 = r2
        L_0x012f:
            int r0 = r0 + r6
            r8.A0B = r0
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.KeyboardPopupLayout.onMeasure(int, int):void");
    }

    public void setHeightShouldWrap(boolean z) {
        this.A0A = z;
    }

    public void setIgnoreNextKeyboardLayoutUpdate(boolean z) {
        this.A0D = z;
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A0A();
        AnonymousClass96c.A08(this);
    }

    public void invalidate(int i, int i2, int i3, int i4) {
        if (!this.A09) {
            super.invalidate(i, i2, i3, i4);
        }
    }

    public KeyboardPopupLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass96c.A08(this);
    }

    public void invalidate() {
        if (!this.A09) {
            super.invalidate();
        }
    }

    public KeyboardPopupLayout(Context context) {
        super(context);
        A0A();
        AnonymousClass96c.A08(this);
    }
}
