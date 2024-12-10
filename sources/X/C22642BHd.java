package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.BHd  reason: case insensitive filesystem */
public abstract class C22642BHd extends ViewGroup {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;

    public abstract void setSingleLine(boolean z);

    public int getItemSpacing() {
        return this.A00;
    }

    public int getLineSpacing() {
        return this.A01;
    }

    public int getRowCount() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r8 != 1073741824) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ab, code lost:
        if (r6 != 1073741824) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r8 == 1073741824) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r19, int r20) {
        /*
            r18 = this;
            r13 = r19
            int r9 = android.view.View.MeasureSpec.getSize(r13)
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            r12 = r20
            int r7 = android.view.View.MeasureSpec.getSize(r12)
            int r6 = android.view.View.MeasureSpec.getMode(r12)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x001f
            r0 = 1073741824(0x40000000, float:2.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            if (r8 != r0) goto L_0x0020
        L_0x001f:
            r11 = r9
        L_0x0020:
            r5 = r18
            int r17 = r5.getPaddingLeft()
            int r4 = r5.getPaddingTop()
            int r0 = r5.getPaddingRight()
            int r11 = r11 - r0
            r1 = r4
            r10 = 0
            r3 = 0
        L_0x0032:
            int r0 = r5.getChildCount()
            if (r10 >= r0) goto L_0x0093
            android.view.View r15 = r5.getChildAt(r10)
            int r2 = r15.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x008d
            r5.measureChild(r15, r13, r12)
            android.view.ViewGroup$LayoutParams r2 = r15.getLayoutParams()
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0090
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r14 = r2.leftMargin
            int r2 = r2.rightMargin
        L_0x0055:
            int r0 = r17 + r14
            int r16 = r15.getMeasuredWidth()
            int r0 = r0 + r16
            if (r0 <= r11) goto L_0x006a
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x006a
            int r17 = r5.getPaddingLeft()
            int r1 = r5.A01
            int r1 = r1 + r4
        L_0x006a:
            int r0 = r17 + r14
            int r4 = r15.getMeasuredWidth()
            int r0 = r0 + r4
            int r4 = r15.getMeasuredHeight()
            int r4 = r4 + r1
            if (r0 <= r3) goto L_0x0079
            r3 = r0
        L_0x0079:
            int r14 = r14 + r2
            int r0 = r15.getMeasuredWidth()
            int r14 = r14 + r0
            int r0 = r5.A00
            int r14 = r14 + r0
            int r17 = r17 + r14
            int r0 = r5.getChildCount()
            int r0 = r0 + -1
            if (r10 != r0) goto L_0x008d
            int r3 = r3 + r2
        L_0x008d:
            int r10 = r10 + 1
            goto L_0x0032
        L_0x0090:
            r14 = 0
            r2 = 0
            goto L_0x0055
        L_0x0093:
            int r0 = r5.getPaddingRight()
            int r3 = r3 + r0
            int r0 = r5.getPaddingBottom()
            int r4 = r4 + r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 == r0) goto L_0x00b7
            r0 = 1073741824(0x40000000, float:2.0)
            if (r8 == r0) goto L_0x00bb
        L_0x00a5:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == r0) goto L_0x00b1
            r0 = 1073741824(0x40000000, float:2.0)
            if (r6 == r0) goto L_0x00b5
        L_0x00ad:
            r5.setMeasuredDimension(r3, r4)
            return
        L_0x00b1:
            int r7 = java.lang.Math.min(r4, r7)
        L_0x00b5:
            r4 = r7
            goto L_0x00ad
        L_0x00b7:
            int r9 = java.lang.Math.min(r3, r9)
        L_0x00bb:
            r3 = r9
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22642BHd.onMeasure(int, int):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int paddingLeft;
        int paddingRight;
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.A02 = 0;
            return;
        }
        this.A02 = 1;
        if (getLayoutDirection() == 1) {
            z2 = true;
            paddingLeft = getPaddingRight();
            paddingRight = getPaddingLeft();
        } else {
            z2 = false;
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingRight;
        int i8 = paddingLeft;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(2131434758, BE7.A0Z());
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                if (!this.A03 && measuredWidth > i7) {
                    i9 = this.A01 + paddingTop;
                    this.A02++;
                    i8 = paddingLeft;
                }
                childAt.setTag(2131434758, Integer.valueOf(this.A02 - 1));
                int measuredWidth2 = i8 + i6 + childAt.getMeasuredWidth();
                paddingTop = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, paddingTop);
                } else {
                    childAt.layout(i8 + i6, i9, measuredWidth2, paddingTop);
                }
                i8 += i6 + i5 + childAt.getMeasuredWidth() + this.A00;
            }
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
    }

    public void setLineSpacing(int i) {
        this.A01 = i;
    }
}
