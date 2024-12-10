package androidx.appcompat.widget;

import X.AnonymousClass1HF;
import X.C002501d;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ButtonBarLayout extends LinearLayout {
    public boolean A00;
    public int A01 = -1;
    public boolean A02;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C002501d.A0A;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AnonymousClass1HF.A0K(context, obtainStyledAttributes, attributeSet, this, iArr, 0);
        this.A02 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.A02);
        }
    }

    private void setStacked(boolean z) {
        if (this.A00 == z) {
            return;
        }
        if (!z || this.A02) {
            this.A00 = z;
            setOrientation(z ? 1 : 0);
            int i = 80;
            if (z) {
                i = 8388613;
            }
            setGravity(i);
            View findViewById = findViewById(2131435525);
            if (findViewById != null) {
                int i2 = 4;
                if (z) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public void setAllowStacking(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            if (!z && this.A00) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        if (r2 != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r2 = android.view.View.MeasureSpec.getSize(r6)
            boolean r0 = r5.A02
            r3 = 0
            if (r0 == 0) goto L_0x0016
            int r0 = r5.A01
            if (r2 <= r0) goto L_0x0014
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x0014
            r5.setStacked(r3)
        L_0x0014:
            r5.A01 = r2
        L_0x0016:
            boolean r0 = r5.A00
            r4 = 1
            if (r0 != 0) goto L_0x00c0
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x00c0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r2 = 1
        L_0x002a:
            super.onMeasure(r0, r7)
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00bd
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x00bd
            int r1 = r5.getMeasuredWidthAndState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r0
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r0) goto L_0x00bd
            r5.setStacked(r4)
        L_0x0043:
            super.onMeasure(r6, r7)
        L_0x0046:
            r2 = 0
            int r1 = r5.getChildCount()
        L_0x004b:
            if (r2 >= r1) goto L_0x00a2
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00ba
            if (r2 < 0) goto L_0x00a2
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r3 = r5.getPaddingTop()
            int r0 = r0.getMeasuredHeight()
            int r3 = r3 + r0
            int r0 = r1.topMargin
            int r3 = r3 + r0
            int r0 = r1.bottomMargin
            int r3 = r3 + r0
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x00b4
            int r2 = r2 + 1
            int r1 = r5.getChildCount()
        L_0x007c:
            if (r2 >= r1) goto L_0x00a2
            android.view.View r0 = r5.getChildAt(r2)
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00b1
            if (r2 < 0) goto L_0x00a2
            android.view.View r0 = r5.getChildAt(r2)
            int r2 = r0.getPaddingTop()
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 * r0
            int r0 = (int) r1
            int r2 = r2 + r0
            int r3 = r3 + r2
        L_0x00a2:
            int r0 = r5.getMinimumHeight()
            if (r0 == r3) goto L_0x00b0
            r5.setMinimumHeight(r3)
            if (r7 != 0) goto L_0x00b0
            super.onMeasure(r6, r7)
        L_0x00b0:
            return
        L_0x00b1:
            int r2 = r2 + 1
            goto L_0x007c
        L_0x00b4:
            int r0 = r5.getPaddingBottom()
            int r3 = r3 + r0
            goto L_0x00a2
        L_0x00ba:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x00bd:
            if (r2 == 0) goto L_0x0046
            goto L_0x0043
        L_0x00c0:
            r0 = r6
            r2 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ButtonBarLayout.onMeasure(int, int):void");
    }
}
