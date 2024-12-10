package androidx.appcompat.widget;

import X.AnonymousClass04A;
import X.AnonymousClass1HF;
import X.C002401c;
import X.C002501d;
import X.C002801g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class LinearLayoutCompat extends ViewGroup {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public Drawable A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public int[] A0B;
    public int A0C;
    public int A0D;
    public int A0E;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A08 = true;
        this.A01 = -1;
        this.A02 = 0;
        this.A05 = 8388659;
        int[] iArr = C002501d.A0D;
        C002401c A002 = C002401c.A00(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = A002.A02;
        AnonymousClass1HF.A0K(context, typedArray, attributeSet, this, iArr, i);
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        if (!typedArray.getBoolean(2, true)) {
            this.A08 = false;
        }
        this.A00 = typedArray.getFloat(4, -1.0f);
        this.A01 = typedArray.getInt(3, -1);
        this.A09 = typedArray.getBoolean(7, false);
        setDividerDrawable(A002.A03(5));
        this.A0E = typedArray.getInt(8, 0);
        this.A0C = typedArray.getDimensionPixelSize(6, 0);
        typedArray.recycle();
    }

    public boolean A0D(int i) {
        int i2;
        if (i == 0) {
            i2 = this.A0E & 1;
        } else {
            int childCount = getChildCount();
            int i3 = this.A0E;
            if (i == childCount) {
                i2 = i3 & 4;
            } else if ((i3 & 2) == 0) {
                return false;
            } else {
                int i4 = i - 1;
                while (i4 >= 0) {
                    if (getChildAt(i4).getVisibility() == 8) {
                        i4--;
                    }
                }
                return false;
            }
        }
        return i2 != 0;
    }

    public void setWeightSum(float f) {
        this.A00 = Math.max(0.0f, f);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.widget.LinearLayout$LayoutParams, X.04A] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.widget.LinearLayout$LayoutParams, X.04A] */
    /* renamed from: A08 */
    public AnonymousClass04A generateDefaultLayoutParams() {
        int i = this.A0D;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, X.04A] */
    /* renamed from: A0A */
    public AnonymousClass04A generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public void A0B(Canvas canvas, int i) {
        this.A07.setBounds(getPaddingLeft() + this.A0C, i, (getWidth() - getPaddingRight()) - this.A0C, this.A03 + i);
        this.A07.draw(canvas);
    }

    public void A0C(Canvas canvas, int i) {
        this.A07.setBounds(i, getPaddingTop() + this.A0C, this.A04 + i, (getHeight() - getPaddingBottom()) - this.A0C);
        this.A07.draw(canvas);
    }

    public int getBaseline() {
        int i;
        if (this.A01 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.A01;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.A02;
                if (this.A0D == 1 && (i = this.A05 & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.A06) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.A06;
                    }
                }
                return i3 + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.A01 == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int left;
        int bottom;
        if (this.A07 == null) {
            return;
        }
        if (this.A0D == 1) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (!(childAt == null || childAt.getVisibility() == 8 || !A0D(i4))) {
                    A0B(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin) - this.A03);
                }
            }
            if (A0D(childCount)) {
                View childAt2 = getChildAt(childCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.A03;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).bottomMargin;
                }
                A0B(canvas, bottom);
                return;
            }
            return;
        }
        int childCount2 = getChildCount();
        boolean z = C002801g.A01;
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt3 = getChildAt(i5);
            if (!(childAt3 == null || childAt3.getVisibility() == 8 || !A0D(i5))) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt3.getLayoutParams();
                if (z2) {
                    left = childAt3.getRight() + marginLayoutParams.rightMargin;
                } else {
                    left = (childAt3.getLeft() - marginLayoutParams.leftMargin) - this.A04;
                }
                A0C(canvas, left);
            }
        }
        if (A0D(childCount2)) {
            View childAt4 = getChildAt(childCount2 - 1);
            if (childAt4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt4.getLayoutParams();
                if (z2) {
                    i = childAt4.getLeft();
                    i2 = marginLayoutParams2.leftMargin;
                    i3 = (i - i2) - this.A04;
                } else {
                    i3 = childAt4.getRight() + marginLayoutParams2.rightMargin;
                }
            } else if (z2) {
                i3 = getPaddingLeft();
            } else {
                i = getWidth();
                i2 = getPaddingRight();
                i3 = (i - i2) - this.A04;
            }
            A0C(canvas, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r7 = r22
            int r0 = r7.A0D
            r6 = 1
            if (r0 != r6) goto L_0x00a6
            int r13 = r7.getPaddingLeft()
            int r26 = r26 - r24
            int r0 = r7.getPaddingRight()
            int r12 = r26 - r0
            int r26 = r26 - r13
            int r0 = r7.getPaddingRight()
            int r26 = r26 - r0
            int r4 = r7.getChildCount()
            int r3 = r7.A05
            r1 = r3 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r0
            r0 = 16
            if (r1 == r0) goto L_0x0098
            r0 = 80
            int r2 = r7.getPaddingTop()
            if (r1 != r0) goto L_0x003a
            int r2 = r2 + r27
            int r2 = r2 - r25
            int r0 = r7.A06
            int r2 = r2 - r0
        L_0x003a:
            r9 = 0
        L_0x003b:
            if (r9 >= r4) goto L_0x0197
            android.view.View r10 = r7.getChildAt(r9)
            if (r10 == 0) goto L_0x0086
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x0086
            int r8 = r10.getMeasuredWidth()
            int r11 = r10.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r5 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r5 = (android.widget.LinearLayout.LayoutParams) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L_0x005e
            r1 = r3
        L_0x005e:
            int r0 = r7.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = r0 & 7
            if (r1 == r6) goto L_0x0089
            r0 = 5
            if (r1 == r0) goto L_0x0092
            int r1 = r5.leftMargin
            int r1 = r1 + r13
        L_0x0070:
            boolean r0 = r7.A0D(r9)
            if (r0 == 0) goto L_0x0079
            int r0 = r7.A03
            int r2 = r2 + r0
        L_0x0079:
            int r0 = r5.topMargin
            int r2 = r2 + r0
            int r8 = r8 + r1
            int r0 = r11 + r2
            r10.layout(r1, r2, r8, r0)
            int r0 = r5.bottomMargin
            int r11 = r11 + r0
            int r2 = r2 + r11
        L_0x0086:
            int r9 = r9 + 1
            goto L_0x003b
        L_0x0089:
            int r0 = r26 - r8
            int r1 = r0 / 2
            int r1 = r1 + r13
            int r0 = r5.leftMargin
            int r1 = r1 + r0
            goto L_0x0094
        L_0x0092:
            int r1 = r12 - r8
        L_0x0094:
            int r0 = r5.rightMargin
            int r1 = r1 - r0
            goto L_0x0070
        L_0x0098:
            int r2 = r7.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r7.A06
            int r27 = r27 - r0
            int r0 = r27 / 2
            int r2 = r2 + r0
            goto L_0x003a
        L_0x00a6:
            boolean r0 = X.C002801g.A01
            int r0 = r7.getLayoutDirection()
            r9 = 1
            if (r0 == r6) goto L_0x00b0
            r9 = 0
        L_0x00b0:
            int r21 = r7.getPaddingTop()
            int r27 = r27 - r25
            int r0 = r7.getPaddingBottom()
            int r20 = r27 - r0
            int r27 = r27 - r21
            int r0 = r7.getPaddingBottom()
            int r27 = r27 - r0
            int r8 = r7.getChildCount()
            int r0 = r7.A05
            r1 = 8388615(0x800007, float:1.1754953E-38)
            r1 = r1 & r0
            r19 = r0 & 112(0x70, float:1.57E-43)
            boolean r5 = r7.A08
            int[] r4 = r7.A0A
            int[] r3 = r7.A0B
            int r0 = r7.getLayoutDirection()
            int r2 = android.view.Gravity.getAbsoluteGravity(r1, r0)
            r1 = 2
            if (r2 == r6) goto L_0x0187
            r0 = 5
            int r18 = r7.getPaddingLeft()
            if (r2 != r0) goto L_0x00f0
            int r18 = r18 + r26
            int r18 = r18 - r24
            int r0 = r7.A06
            int r18 = r18 - r0
        L_0x00f0:
            r17 = 0
            r16 = 1
            if (r9 == 0) goto L_0x00fa
            int r17 = r8 + -1
            r16 = -1
        L_0x00fa:
            r12 = 0
        L_0x00fb:
            if (r12 >= r8) goto L_0x0197
            int r0 = r16 * r12
            int r11 = r17 + r0
            android.view.View r10 = r7.getChildAt(r11)
            if (r10 == 0) goto L_0x016a
            int r1 = r10.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x016a
            int r15 = r10.getMeasuredWidth()
            int r9 = r10.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            if (r5 == 0) goto L_0x0185
            int r1 = r2.height
            r0 = -1
            if (r1 == r0) goto L_0x0185
            int r13 = r10.getBaseline()
        L_0x0128:
            int r0 = r2.gravity
            if (r0 >= 0) goto L_0x012e
            r0 = r19
        L_0x012e:
            r14 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r14 == r0) goto L_0x0179
            r0 = 48
            if (r14 == r0) goto L_0x016d
            r0 = 80
            r1 = r21
            if (r14 != r0) goto L_0x0150
            int r1 = r20 - r9
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            r0 = -1
            if (r13 == r0) goto L_0x0150
            int r14 = r10.getMeasuredHeight()
            int r14 = r14 - r13
            r0 = 2
            r0 = r3[r0]
            int r0 = r0 - r14
        L_0x014f:
            int r1 = r1 - r0
        L_0x0150:
            boolean r0 = r7.A0D(r11)
            if (r0 == 0) goto L_0x015a
            int r0 = r7.A04
            int r18 = r18 + r0
        L_0x015a:
            int r11 = r2.leftMargin
            int r11 = r11 + r18
            int r0 = r15 + r11
            int r9 = r9 + r1
            r10.layout(r11, r1, r0, r9)
            int r0 = r2.rightMargin
            int r15 = r15 + r0
            int r11 = r11 + r15
            r18 = r11
        L_0x016a:
            int r12 = r12 + 1
            goto L_0x00fb
        L_0x016d:
            r0 = -1
            int r1 = r2.topMargin
            int r1 = r1 + r21
            if (r13 == r0) goto L_0x0150
            r0 = r4[r6]
            int r0 = r0 - r13
            int r1 = r1 + r0
            goto L_0x0150
        L_0x0179:
            int r1 = r27 - r9
            r0 = 2
            int r1 = r1 / r0
            int r1 = r1 + r21
            int r0 = r2.topMargin
            int r1 = r1 + r0
            int r0 = r2.bottomMargin
            goto L_0x014f
        L_0x0185:
            r13 = -1
            goto L_0x0128
        L_0x0187:
            int r18 = r7.getPaddingLeft()
            int r26 = r26 - r24
            int r0 = r7.A06
            int r26 = r26 - r0
            int r26 = r26 / r1
            int r18 = r18 + r26
            goto L_0x00f0
        L_0x0197:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder sb = new StringBuilder();
            sb.append("base aligned child index out of range (0, ");
            sb.append(getChildCount());
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        this.A01 = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.A07) {
            this.A07 = drawable;
            boolean z = false;
            if (drawable != null) {
                this.A04 = drawable.getIntrinsicWidth();
                this.A03 = drawable.getIntrinsicHeight();
            } else {
                this.A04 = 0;
                this.A03 = 0;
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setGravity(int i) {
        if (this.A05 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.A05 = i;
            requestLayout();
        }
    }

    public void setOrientation(int i) {
        if (this.A0D != i) {
            this.A0D = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.A0E) {
            requestLayout();
        }
        this.A0E = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.A05;
        if ((i3 & 112) != i2) {
            this.A05 = i2 | (i3 & -113);
            requestLayout();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, X.04A] */
    /* renamed from: A09 */
    public AnonymousClass04A generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getBaselineAlignedChildIndex() {
        return this.A01;
    }

    public Drawable getDividerDrawable() {
        return this.A07;
    }

    public int getDividerPadding() {
        return this.A0C;
    }

    public int getDividerWidth() {
        return this.A04;
    }

    public int getGravity() {
        return this.A05;
    }

    public int getOrientation() {
        return this.A0D;
    }

    public int getShowDividers() {
        return this.A0E;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.A00;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.A05;
        if ((8388615 & i3) != i2) {
            this.A05 = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass04A;
    }

    public void setBaselineAligned(boolean z) {
        this.A08 = z;
    }

    public void setDividerPadding(int i) {
        this.A0C = i;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.A09 = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0212, code lost:
        if (r10.width == -1) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021e, code lost:
        if (r10.width != r2) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03e9, code lost:
        if (r12.height != -1) goto L_0x03eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x05c0, code lost:
        if (r3.height != -1) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x05df, code lost:
        if (r3.height != -1) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (r2.width != -1) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x040c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r37, int r38) {
        /*
            r36 = this;
            r1 = r36
            int r0 = r1.A0D
            r11 = 1
            r32 = r37
            r34 = r38
            if (r0 != r11) goto L_0x02ea
            r0 = 0
            r1.A06 = r0
            int r7 = r1.getChildCount()
            int r22 = android.view.View.MeasureSpec.getMode(r32)
            int r11 = android.view.View.MeasureSpec.getMode(r34)
            int r12 = r1.A01
            boolean r10 = r1.A09
            r21 = 0
            r20 = 0
            r9 = 0
            r8 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            r19 = 0
            r18 = 1
            r17 = 0
        L_0x002e:
            r2 = 8
            if (r3 >= r7) goto L_0x0129
            android.view.View r24 = r1.getChildAt(r3)
            if (r24 != 0) goto L_0x003f
            int r0 = r1.A06
            r1.A06 = r0
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x002e
        L_0x003f:
            int r0 = r24.getVisibility()
            if (r0 == r2) goto L_0x003c
            boolean r0 = r1.A0D(r3)
            if (r0 == 0) goto L_0x0052
            int r2 = r1.A06
            int r0 = r1.A03
            int r2 = r2 + r0
            r1.A06 = r2
        L_0x0052:
            android.view.ViewGroup$LayoutParams r2 = r24.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            float r0 = r2.weight
            float r20 = r20 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 != r0) goto L_0x0094
            int r0 = r2.height
            if (r0 != 0) goto L_0x0094
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0094
            int r13 = r1.A06
            int r11 = r2.topMargin
            int r11 = r11 + r13
            int r0 = r2.bottomMargin
            int r11 = r11 + r0
            int r13 = java.lang.Math.max(r13, r11)
            r1.A06 = r13
            r19 = 1
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x007c:
            if (r12 < 0) goto L_0x0084
            int r0 = r3 + 1
            if (r12 != r0) goto L_0x0084
            r1.A02 = r13
        L_0x0084:
            if (r3 >= r12) goto L_0x00db
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00db
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0094:
            int r0 = r2.height
            if (r0 != 0) goto L_0x00d8
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            r0 = -2
            r2.height = r0
            r13 = 0
        L_0x00a2:
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            int r0 = r1.A06
        L_0x00a8:
            r26 = 0
            r23 = r1
            r25 = r32
            r27 = r34
            r28 = r0
            r23.measureChildWithMargins(r24, r25, r26, r27, r28)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r13 == r0) goto L_0x00bb
            r2.height = r13
        L_0x00bb:
            int r15 = r24.getMeasuredHeight()
            int r14 = r1.A06
            int r13 = r14 + r15
            int r0 = r2.topMargin
            int r13 = r13 + r0
            int r0 = r2.bottomMargin
            int r13 = r13 + r0
            int r13 = java.lang.Math.max(r14, r13)
            r1.A06 = r13
            if (r10 == 0) goto L_0x007c
            int r6 = java.lang.Math.max(r15, r6)
            goto L_0x007c
        L_0x00d6:
            r0 = 0
            goto L_0x00a8
        L_0x00d8:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00a2
        L_0x00db:
            r13 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r13) goto L_0x0126
            int r13 = r2.width
            r0 = -1
            if (r13 != r0) goto L_0x0126
            r16 = 1
            r17 = 1
        L_0x00ea:
            int r14 = r2.leftMargin
            int r0 = r2.rightMargin
            int r14 = r14 + r0
            int r13 = r24.getMeasuredWidth()
            int r13 = r13 + r14
            int r8 = java.lang.Math.max(r8, r13)
            int r0 = r24.getMeasuredState()
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
            if (r18 == 0) goto L_0x010a
            int r0 = r2.width
            r15 = r0
            r18 = 1
            r0 = -1
            if (r15 == r0) goto L_0x010c
        L_0x010a:
            r18 = 0
        L_0x010c:
            float r0 = r2.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x011e
            if (r16 != 0) goto L_0x0115
            r14 = r13
        L_0x0115:
            int r5 = java.lang.Math.max(r5, r14)
        L_0x0119:
            r0 = 0
            int r0 = r0 + r3
            r3 = r0
            goto L_0x003c
        L_0x011e:
            if (r16 != 0) goto L_0x0121
            r14 = r13
        L_0x0121:
            int r4 = java.lang.Math.max(r4, r14)
            goto L_0x0119
        L_0x0126:
            r16 = 0
            goto L_0x00ea
        L_0x0129:
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x013a
            boolean r0 = r1.A0D(r7)
            if (r0 == 0) goto L_0x013a
            int r3 = r1.A06
            int r0 = r1.A03
            int r3 = r3 + r0
            r1.A06 = r3
        L_0x013a:
            if (r10 == 0) goto L_0x016f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r0) goto L_0x0142
            if (r11 != 0) goto L_0x016f
        L_0x0142:
            r14 = 0
            r1.A06 = r14
        L_0x0145:
            if (r14 >= r7) goto L_0x016f
            android.view.View r3 = r1.getChildAt(r14)
            if (r3 != 0) goto L_0x0154
            int r0 = r1.A06
        L_0x014f:
            r1.A06 = r0
        L_0x0151:
            int r14 = r14 + 1
            goto L_0x0145
        L_0x0154:
            int r0 = r3.getVisibility()
            if (r0 == r2) goto L_0x0151
            android.view.ViewGroup$LayoutParams r13 = r3.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            int r12 = r1.A06
            int r3 = r12 + r6
            int r0 = r13.topMargin
            int r3 = r3 + r0
            int r0 = r13.bottomMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r12, r3)
            goto L_0x014f
        L_0x016f:
            int r12 = r1.A06
            int r3 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r3 = r3 + r0
            int r12 = r12 + r3
            r1.A06 = r12
            int r0 = r1.getSuggestedMinimumHeight()
            int r12 = java.lang.Math.max(r12, r0)
            r3 = 0
            r0 = r34
            int r3 = android.view.View.resolveSizeAndState(r12, r0, r3)
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r3
            int r0 = r1.A06
            int r12 = r12 - r0
            if (r19 != 0) goto L_0x019b
            if (r12 == 0) goto L_0x0245
            int r0 = (r20 > r21 ? 1 : (r20 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x0245
        L_0x019b:
            float r2 = r1.A00
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a3
            r20 = r2
        L_0x01a3:
            r0 = 0
            r1.A06 = r0
            r6 = 0
        L_0x01a7:
            if (r6 >= r7) goto L_0x027e
            android.view.View r13 = r1.getChildAt(r6)
            int r2 = r13.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0235
            android.view.ViewGroup$LayoutParams r10 = r13.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            float r2 = r10.weight
            int r0 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x01fb
            float r0 = (float) r12
            float r0 = r0 * r2
            float r0 = r0 / r20
            int r14 = (int) r0
            float r20 = r20 - r2
            int r12 = r12 - r14
            int r5 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r5 = r5 + r0
            int r0 = r10.leftMargin
            int r5 = r5 + r0
            int r0 = r10.rightMargin
            int r5 = r5 + r0
            int r2 = r10.width
            r0 = r32
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r0, r5, r2)
            int r0 = r10.height
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x023c
            if (r11 != r2) goto L_0x023c
            if (r14 <= 0) goto L_0x0243
        L_0x01ea:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            r13.measure(r5, r0)
            int r0 = r13.getMeasuredState()
            r0 = r0 & -256(0xffffffffffffff00, float:NaN)
            int r9 = android.view.View.combineMeasuredStates(r9, r0)
        L_0x01fb:
            int r14 = r10.leftMargin
            int r0 = r10.rightMargin
            int r14 = r14 + r0
            int r5 = r13.getMeasuredWidth()
            int r5 = r5 + r14
            int r8 = java.lang.Math.max(r8, r5)
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r2) goto L_0x0239
            int r0 = r10.width
            r2 = -1
            if (r0 != r2) goto L_0x023a
        L_0x0214:
            int r4 = java.lang.Math.max(r4, r14)
            if (r18 == 0) goto L_0x0220
            int r0 = r10.width
            r18 = 1
            if (r0 == r2) goto L_0x0222
        L_0x0220:
            r18 = 0
        L_0x0222:
            int r5 = r1.A06
            int r2 = r13.getMeasuredHeight()
            int r2 = r2 + r5
            int r0 = r10.topMargin
            int r2 = r2 + r0
            int r0 = r10.bottomMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r5, r2)
            r1.A06 = r0
        L_0x0235:
            int r6 = r6 + 1
            goto L_0x01a7
        L_0x0239:
            r2 = -1
        L_0x023a:
            r14 = r5
            goto L_0x0214
        L_0x023c:
            int r0 = r13.getMeasuredHeight()
            int r14 = r14 + r0
            if (r14 >= 0) goto L_0x01ea
        L_0x0243:
            r14 = 0
            goto L_0x01ea
        L_0x0245:
            int r4 = java.lang.Math.max(r4, r5)
            if (r10 == 0) goto L_0x028c
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L_0x028c
            r11 = 0
        L_0x0250:
            if (r11 >= r7) goto L_0x028c
            android.view.View r10 = r1.getChildAt(r11)
            if (r10 == 0) goto L_0x027b
            int r0 = r10.getVisibility()
            if (r0 == r2) goto L_0x027b
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r0 <= 0) goto L_0x027b
            int r5 = r10.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r0)
            r10.measure(r5, r0)
        L_0x027b:
            int r11 = r11 + 1
            goto L_0x0250
        L_0x027e:
            int r5 = r1.A06
            int r2 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r2 = r2 + r0
            int r5 = r5 + r2
            r1.A06 = r5
        L_0x028c:
            if (r18 != 0) goto L_0x02e8
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r22
            if (r0 == r2) goto L_0x02e8
        L_0x0294:
            int r2 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r2 = r2 + r0
            int r4 = r4 + r2
            int r0 = r1.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r4, r0)
            r0 = r32
            int r0 = android.view.View.resolveSizeAndState(r2, r0, r9)
            r1.setMeasuredDimension(r0, r3)
            if (r17 == 0) goto L_0x071b
            int r2 = r1.getMeasuredWidth()
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r4 = 0
        L_0x02bc:
            if (r4 >= r7) goto L_0x071b
            android.view.View r9 = r1.getChildAt(r4)
            int r2 = r9.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x02e5
            android.view.ViewGroup$LayoutParams r3 = r9.getLayoutParams()
            int r2 = r3.width
            r0 = -1
            if (r2 != r0) goto L_0x02e5
            int r2 = r3.height
            int r0 = r9.getMeasuredHeight()
            r3.height = r0
            r11 = 0
            r8 = r1
            r12 = r34
            r13 = r11
            r8.measureChildWithMargins(r9, r10, r11, r12, r13)
            r3.height = r2
        L_0x02e5:
            int r4 = r4 + 1
            goto L_0x02bc
        L_0x02e8:
            r4 = r8
            goto L_0x0294
        L_0x02ea:
            r2 = 0
            r1.A06 = r2
            int r5 = r1.getChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r32)
            int r29 = android.view.View.MeasureSpec.getMode(r34)
            int[] r9 = r1.A0A
            r0 = 4
            if (r9 == 0) goto L_0x0302
            int[] r8 = r1.A0B
            if (r8 != 0) goto L_0x030a
        L_0x0302:
            int[] r9 = new int[r0]
            r1.A0A = r9
            int[] r8 = new int[r0]
            r1.A0B = r8
        L_0x030a:
            r28 = 3
            r0 = -1
            r9[r28] = r0
            r27 = 2
            r9[r27] = r0
            r9[r11] = r0
            r9[r2] = r0
            r8[r28] = r0
            r8[r27] = r0
            r8[r11] = r0
            r8[r2] = r0
            boolean r0 = r1.A08
            r26 = r0
            boolean r0 = r1.A09
            r25 = r0
            r14 = 1073741824(0x40000000, float:2.0)
            r24 = 0
            if (r10 != r14) goto L_0x032f
            r24 = 1
        L_0x032f:
            r23 = 0
            r22 = 0
            r13 = 0
            r7 = 0
            r6 = 0
            r21 = 0
            r20 = 0
            r4 = 0
            r19 = 1
            r18 = 0
        L_0x033f:
            r3 = 8
            if (r13 >= r5) goto L_0x0470
            android.view.View r16 = r1.getChildAt(r13)
            if (r16 != 0) goto L_0x0352
            int r0 = r1.A06
            r1.A06 = r0
        L_0x034d:
            int r13 = r13 + 1
            r14 = 1073741824(0x40000000, float:2.0)
            goto L_0x033f
        L_0x0352:
            int r0 = r16.getVisibility()
            if (r0 == r3) goto L_0x034d
            boolean r0 = r1.A0D(r13)
            if (r0 == 0) goto L_0x0365
            int r3 = r1.A06
            int r0 = r1.A04
            int r3 = r3 + r0
            r1.A06 = r3
        L_0x0365:
            android.view.ViewGroup$LayoutParams r12 = r16.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            float r0 = r12.weight
            float r22 = r22 + r0
            if (r10 != r14) goto L_0x0420
            int r0 = r12.width
            if (r0 != 0) goto L_0x0420
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0420
            int r14 = r1.A06
            int r3 = r12.leftMargin
            if (r24 == 0) goto L_0x0416
            int r0 = r12.rightMargin
            int r3 = r3 + r0
            int r14 = r14 + r3
        L_0x0385:
            r1.A06 = r14
            if (r26 == 0) goto L_0x040f
            r0 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r0 = r16
            r0.measure(r3, r3)
        L_0x0393:
            r3 = 1073741824(0x40000000, float:2.0)
        L_0x0395:
            r0 = r29
            if (r0 == r3) goto L_0x040c
            int r3 = r12.height
            r0 = -1
            if (r3 != r0) goto L_0x040c
            r17 = 1
            r18 = 1
        L_0x03a2:
            int r3 = r12.topMargin
            int r0 = r12.bottomMargin
            int r3 = r3 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r3
            int r0 = r16.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r4, r0)
            if (r26 == 0) goto L_0x03de
            int r0 = r16.getBaseline()
            r15 = -1
            if (r0 == r15) goto L_0x03de
            int r15 = r12.gravity
            if (r15 >= 0) goto L_0x0409
            int r15 = r1.A05
        L_0x03c3:
            r16 = r15 & 112(0x70, float:1.57E-43)
            r15 = 4
            int r16 = r16 >> r15
            r15 = r16 & -2
            int r16 = r15 >> 1
            r15 = r9[r16]
            int r15 = java.lang.Math.max(r15, r0)
            r9[r16] = r15
            r15 = r8[r16]
            int r0 = r14 - r0
            int r0 = java.lang.Math.max(r15, r0)
            r8[r16] = r0
        L_0x03de:
            int r7 = java.lang.Math.max(r7, r14)
            if (r19 == 0) goto L_0x03eb
            int r15 = r12.height
            r0 = -1
            r19 = 1
            if (r15 == r0) goto L_0x03ed
        L_0x03eb:
            r19 = 0
        L_0x03ed:
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0401
            if (r17 != 0) goto L_0x03f6
            r3 = r14
        L_0x03f6:
            r0 = r21
            int r21 = java.lang.Math.max(r0, r3)
        L_0x03fc:
            r0 = 0
            int r0 = r0 + r13
            r13 = r0
            goto L_0x034d
        L_0x0401:
            if (r17 != 0) goto L_0x0404
            r3 = r14
        L_0x0404:
            int r6 = java.lang.Math.max(r6, r3)
            goto L_0x03fc
        L_0x0409:
            int r15 = r12.gravity
            goto L_0x03c3
        L_0x040c:
            r17 = 0
            goto L_0x03a2
        L_0x040f:
            r26 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            r20 = 1
            goto L_0x0395
        L_0x0416:
            int r3 = r3 + r14
            int r0 = r12.rightMargin
            int r3 = r3 + r0
            int r14 = java.lang.Math.max(r14, r3)
            goto L_0x0385
        L_0x0420:
            int r0 = r12.width
            if (r0 != 0) goto L_0x046d
            float r0 = r12.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x046d
            r0 = -2
            r12.width = r0
            r14 = 0
        L_0x042e:
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 != 0) goto L_0x046b
            int r3 = r1.A06
        L_0x0434:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r35 = 0
            r30 = r1
            r31 = r16
            r33 = r3
            r30.measureChildWithMargins(r31, r32, r33, r34, r35)
            if (r14 == r0) goto L_0x0445
            r12.width = r14
        L_0x0445:
            int r15 = r16.getMeasuredWidth()
            int r14 = r1.A06
            if (r24 == 0) goto L_0x045e
            int r3 = r12.leftMargin
            int r3 = r3 + r15
            int r0 = r12.rightMargin
            int r3 = r3 + r0
            int r14 = r14 + r3
        L_0x0454:
            r1.A06 = r14
            if (r25 == 0) goto L_0x0393
            int r2 = java.lang.Math.max(r15, r2)
            goto L_0x0393
        L_0x045e:
            int r3 = r14 + r15
            int r0 = r12.leftMargin
            int r3 = r3 + r0
            int r0 = r12.rightMargin
            int r3 = r3 + r0
            int r14 = java.lang.Math.max(r14, r3)
            goto L_0x0454
        L_0x046b:
            r3 = 0
            goto L_0x0434
        L_0x046d:
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x042e
        L_0x0470:
            int r0 = r1.A06
            if (r0 <= 0) goto L_0x0481
            boolean r0 = r1.A0D(r5)
            if (r0 == 0) goto L_0x0481
            int r3 = r1.A06
            int r0 = r1.A04
            int r3 = r3 + r0
            r1.A06 = r3
        L_0x0481:
            r13 = r9[r11]
            r3 = -1
            if (r13 != r3) goto L_0x0493
            r0 = 0
            r0 = r9[r0]
            if (r0 != r3) goto L_0x0493
            r0 = r9[r27]
            if (r0 != r3) goto L_0x0493
            r0 = r9[r28]
            if (r0 == r3) goto L_0x04c0
        L_0x0493:
            r12 = r9[r28]
            r0 = 0
            r3 = r9[r0]
            r0 = r9[r27]
            int r0 = java.lang.Math.max(r13, r0)
            int r0 = java.lang.Math.max(r3, r0)
            int r12 = java.lang.Math.max(r12, r0)
            r13 = r8[r28]
            r0 = 0
            r14 = r8[r0]
            r3 = r8[r11]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Math.max(r14, r0)
            int r0 = java.lang.Math.max(r13, r0)
            int r12 = r12 + r0
            int r7 = java.lang.Math.max(r7, r12)
        L_0x04c0:
            if (r25 == 0) goto L_0x0503
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r0) goto L_0x04c8
            if (r10 != 0) goto L_0x0503
        L_0x04c8:
            r13 = 0
            r1.A06 = r13
        L_0x04cb:
            if (r13 >= r5) goto L_0x0503
            android.view.View r12 = r1.getChildAt(r13)
            if (r12 != 0) goto L_0x04da
            int r0 = r1.A06
        L_0x04d5:
            r1.A06 = r0
        L_0x04d7:
            int r13 = r13 + 1
            goto L_0x04cb
        L_0x04da:
            int r3 = r12.getVisibility()
            r0 = 8
            if (r3 == r0) goto L_0x04d7
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            int r12 = r1.A06
            if (r24 == 0) goto L_0x04f6
            int r3 = r14.leftMargin
            int r3 = r3 + r2
            int r0 = r14.rightMargin
            int r3 = r3 + r0
            int r12 = r12 + r3
            r1.A06 = r12
            goto L_0x04d7
        L_0x04f6:
            int r3 = r12 + r2
            int r0 = r14.leftMargin
            int r3 = r3 + r0
            int r0 = r14.rightMargin
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r12, r3)
            goto L_0x04d5
        L_0x0503:
            int r12 = r1.A06
            int r3 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r3 = r3 + r0
            int r12 = r12 + r3
            r1.A06 = r12
            int r0 = r1.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r12, r0)
            r13 = 0
            r0 = r32
            int r17 = android.view.View.resolveSizeAndState(r3, r0, r13)
            r12 = 16777215(0xffffff, float:2.3509886E-38)
            r12 = r12 & r17
            int r0 = r1.A06
            int r12 = r12 - r0
            if (r20 != 0) goto L_0x0530
            if (r12 == 0) goto L_0x062b
            int r0 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x062b
        L_0x0530:
            float r2 = r1.A00
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0538
            r22 = r2
        L_0x0538:
            r0 = -1
            r9[r28] = r0
            r9[r27] = r0
            r9[r11] = r0
            r9[r13] = r0
            r8[r28] = r0
            r8[r27] = r0
            r8[r11] = r0
            r8[r13] = r0
            r1.A06 = r13
            r7 = -1
        L_0x054c:
            if (r13 >= r5) goto L_0x0668
            android.view.View r16 = r1.getChildAt(r13)
            if (r16 == 0) goto L_0x060a
            int r2 = r16.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x060a
            android.view.ViewGroup$LayoutParams r3 = r16.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r3 = (android.widget.LinearLayout.LayoutParams) r3
            float r2 = r3.weight
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x05a5
            float r0 = (float) r12
            float r0 = r0 * r2
            float r0 = r0 / r22
            int r14 = (int) r0
            float r22 = r22 - r2
            int r12 = r12 - r14
            int r2 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r2 = r2 + r0
            int r0 = r3.topMargin
            int r2 = r2 + r0
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r0 = r3.height
            r15 = r34
            int r15 = android.view.ViewGroup.getChildMeasureSpec(r15, r2, r0)
            int r0 = r3.width
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != 0) goto L_0x0621
            if (r10 != r2) goto L_0x0621
            if (r14 <= 0) goto L_0x0628
        L_0x0591:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r2)
            r2 = r16
            r2.measure(r14, r15)
            int r2 = r16.getMeasuredState()
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r2 = r2 & r0
            int r4 = android.view.View.combineMeasuredStates(r4, r2)
        L_0x05a5:
            int r14 = r1.A06
            int r2 = r16.getMeasuredWidth()
            if (r24 == 0) goto L_0x0613
            int r0 = r3.leftMargin
            int r2 = r2 + r0
            int r0 = r3.rightMargin
            int r2 = r2 + r0
            int r14 = r14 + r2
            r1.A06 = r14
        L_0x05b6:
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r2) goto L_0x05c2
            int r2 = r3.height
            r0 = -1
            r15 = 1
            if (r2 == r0) goto L_0x05c3
        L_0x05c2:
            r15 = 0
        L_0x05c3:
            int r2 = r3.topMargin
            int r0 = r3.bottomMargin
            int r2 = r2 + r0
            int r14 = r16.getMeasuredHeight()
            int r14 = r14 + r2
            int r7 = java.lang.Math.max(r7, r14)
            if (r15 != 0) goto L_0x05d4
            r2 = r14
        L_0x05d4:
            int r6 = java.lang.Math.max(r6, r2)
            if (r19 == 0) goto L_0x0611
            int r2 = r3.height
            r0 = -1
            r19 = 1
            if (r2 == r0) goto L_0x05e3
        L_0x05e1:
            r19 = 0
        L_0x05e3:
            if (r26 == 0) goto L_0x060a
            int r2 = r16.getBaseline()
            if (r2 == r0) goto L_0x060a
            int r0 = r3.gravity
            if (r0 >= 0) goto L_0x060e
            int r0 = r1.A05
        L_0x05f1:
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = 4
            int r3 = r3 >> r0
            r0 = r3 & -2
            int r3 = r0 >> 1
            r0 = r9[r3]
            int r0 = java.lang.Math.max(r0, r2)
            r9[r3] = r0
            r0 = r8[r3]
            int r14 = r14 - r2
            int r0 = java.lang.Math.max(r0, r14)
            r8[r3] = r0
        L_0x060a:
            int r13 = r13 + 1
            goto L_0x054c
        L_0x060e:
            int r0 = r3.gravity
            goto L_0x05f1
        L_0x0611:
            r0 = -1
            goto L_0x05e1
        L_0x0613:
            int r2 = r2 + r14
            int r0 = r3.leftMargin
            int r2 = r2 + r0
            int r0 = r3.rightMargin
            int r2 = r2 + r0
            int r0 = java.lang.Math.max(r14, r2)
            r1.A06 = r0
            goto L_0x05b6
        L_0x0621:
            int r0 = r16.getMeasuredWidth()
            int r14 = r14 + r0
            if (r14 >= 0) goto L_0x0591
        L_0x0628:
            r14 = 0
            goto L_0x0591
        L_0x062b:
            r0 = r21
            int r6 = java.lang.Math.max(r6, r0)
            if (r25 == 0) goto L_0x06b4
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L_0x06b4
            r10 = 0
        L_0x0638:
            if (r10 >= r5) goto L_0x06b4
            android.view.View r9 = r1.getChildAt(r10)
            if (r9 == 0) goto L_0x0665
            int r3 = r9.getVisibility()
            r0 = 8
            if (r3 == r0) goto L_0x0665
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            float r0 = r0.weight
            int r0 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0665
            r8 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            int r0 = r9.getMeasuredHeight()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            r9.measure(r3, r0)
        L_0x0665:
            int r10 = r10 + 1
            goto L_0x0638
        L_0x0668:
            int r3 = r1.A06
            int r2 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r2 = r2 + r0
            int r3 = r3 + r2
            r1.A06 = r3
            r12 = r9[r11]
            r2 = -1
            if (r12 != r2) goto L_0x0688
            r0 = 0
            r0 = r9[r0]
            if (r0 != r2) goto L_0x0688
            r0 = r9[r27]
            if (r0 != r2) goto L_0x0688
            r0 = r9[r28]
            if (r0 == r2) goto L_0x06b4
        L_0x0688:
            r10 = r9[r28]
            r3 = 0
            r2 = r9[r3]
            r0 = r9[r27]
            int r0 = java.lang.Math.max(r12, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r10 = java.lang.Math.max(r10, r0)
            r9 = r8[r28]
            r3 = r8[r3]
            r2 = r8[r11]
            r0 = r8[r27]
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = java.lang.Math.max(r3, r0)
            int r0 = java.lang.Math.max(r9, r0)
            int r10 = r10 + r0
            int r7 = java.lang.Math.max(r7, r10)
        L_0x06b4:
            if (r19 != 0) goto L_0x0719
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r29
            if (r0 == r2) goto L_0x0719
        L_0x06bc:
            int r2 = r1.getPaddingTop()
            int r0 = r1.getPaddingBottom()
            int r2 = r2 + r0
            int r6 = r6 + r2
            int r0 = r1.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r6, r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            r17 = r17 | r0
            int r2 = r4 << 16
            r0 = r34
            int r2 = android.view.View.resolveSizeAndState(r3, r0, r2)
            r0 = r17
            r1.setMeasuredDimension(r0, r2)
            if (r18 == 0) goto L_0x071b
            int r2 = r1.getMeasuredHeight()
            r0 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r4 = 0
        L_0x06ed:
            if (r4 >= r5) goto L_0x071b
            android.view.View r7 = r1.getChildAt(r4)
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L_0x0716
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            int r2 = r3.height
            r0 = -1
            if (r2 != r0) goto L_0x0716
            int r2 = r3.width
            int r0 = r7.getMeasuredWidth()
            r3.width = r0
            r9 = 0
            r6 = r1
            r8 = r32
            r11 = r9
            r6.measureChildWithMargins(r7, r8, r9, r10, r11)
            r3.width = r2
        L_0x0716:
            int r4 = r4 + 1
            goto L_0x06ed
        L_0x0719:
            r6 = r7
            goto L_0x06bc
        L_0x071b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
