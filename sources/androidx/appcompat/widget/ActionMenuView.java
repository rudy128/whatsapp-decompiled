package androidx.appcompat.widget;

import X.AnonymousClass01U;
import X.AnonymousClass035;
import X.AnonymousClass03G;
import X.AnonymousClass03I;
import X.AnonymousClass04A;
import X.AnonymousClass06N;
import X.C002801g;
import X.C003301m;
import X.C004301w;
import X.C004501y;
import X.C004601z;
import X.C16540sb;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;

public class ActionMenuView extends LinearLayoutCompat implements C004501y, C004601z {
    public int A00;
    public int A01;
    public AnonymousClass01U A02;
    public AnonymousClass035 A03;
    public boolean A04;
    public int A05;
    public int A06;
    public Context A07;
    public C003301m A08;
    public C004301w A09;
    public AnonymousClass03I A0A;
    public boolean A0B;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.LinearLayout$LayoutParams, X.04A, X.06N] */
    public /* bridge */ /* synthetic */ AnonymousClass04A A08() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.A04 = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public boolean A0L(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof C16540sb)) {
            z = false | ((C16540sb) childAt).BkC();
        }
        if (i <= 0 || !(childAt2 instanceof C16540sb)) {
            return z;
        }
        return z | ((C16540sb) childAt2).BkD();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, X.06N] */
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.A04 = false;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.widget.LinearLayout$LayoutParams, X.06N] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.LinearLayout$LayoutParams] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.widget.LinearLayout$LayoutParams, X.06N] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 <= 0) goto L_0x0015;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A0F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass06N generateLayoutParams(android.view.ViewGroup.LayoutParams r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0020
            boolean r0 = r3 instanceof X.AnonymousClass06N
            if (r0 == 0) goto L_0x001a
            X.06N r3 = (X.AnonymousClass06N) r3
            X.06N r1 = new X.06N
            r1.<init>(r3)
            boolean r0 = r3.A04
            r1.A04 = r0
        L_0x0011:
            int r0 = r1.gravity
            if (r0 > 0) goto L_0x0019
        L_0x0015:
            r0 = 16
            r1.gravity = r0
        L_0x0019:
            return r1
        L_0x001a:
            X.06N r1 = new X.06N
            r1.<init>(r3)
            goto L_0x0011
        L_0x0020:
            r0 = -2
            X.06N r1 = new X.06N
            r1.<init>(r0, r0)
            r0 = 0
            r1.A04 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.generateLayoutParams(android.view.ViewGroup$LayoutParams):X.06N");
    }

    public void A0G() {
        AnonymousClass03I r0 = this.A0A;
        if (r0 != null) {
            r0.A0A();
        }
    }

    public boolean A0H() {
        AnonymousClass03I r0 = this.A0A;
        if (r0 == null || !r0.A0I()) {
            return false;
        }
        return true;
    }

    public boolean A0I() {
        AnonymousClass03I r0 = this.A0A;
        if (r0 == null || !r0.A0J()) {
            return false;
        }
        return true;
    }

    public boolean A0J() {
        AnonymousClass03I r0 = this.A0A;
        if (r0 == null || !r0.A0K()) {
            return false;
        }
        return true;
    }

    public boolean A0K() {
        AnonymousClass03I r0 = this.A0A;
        if (r0 == null || !r0.A0L()) {
            return false;
        }
        return true;
    }

    public boolean Bdt(AnonymousClass03G r3) {
        return this.A08.A0f(0, r3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: X.01w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.01w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.01w} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.Menu getMenu() {
        /*
            r4 = this;
            X.01m r0 = r4.A08
            if (r0 != 0) goto L_0x0039
            android.content.Context r3 = r4.getContext()
            X.01m r1 = new X.01m
            r1.<init>(r3)
            r4.A08 = r1
            X.0S8 r0 = new X.0S8
            r0.<init>(r4)
            r1.A0U(r0)
            X.03I r2 = new X.03I
            r2.<init>(r3)
            r4.A0A = r2
            r2.A0E()
            X.01w r0 = r4.A09
            if (r0 != 0) goto L_0x002a
            X.0SA r0 = new X.0SA
            r0.<init>()
        L_0x002a:
            r2.CIA(r0)
            X.01m r1 = r4.A08
            android.content.Context r0 = r4.A07
            r1.A0N(r0, r2)
            X.03I r0 = r4.A0A
            r0.A0G(r4)
        L_0x0039:
            X.01m r0 = r4.A08
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.getMenu():android.view.Menu");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.A0B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int i8 = this.A04;
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean z2 = C002801g.A01;
        boolean z3 = true;
        if (getLayoutDirection() != 1) {
            z3 = false;
        }
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                AnonymousClass06N r11 = (AnonymousClass06N) childAt.getLayoutParams();
                if (r11.A04) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (A0L(i13)) {
                        measuredWidth += i8;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i6 = getPaddingLeft() + r11.leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - r11.rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i14 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i14, width, measuredHeight + i14);
                    paddingRight -= measuredWidth;
                    i11 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + r11.leftMargin) + r11.rightMargin;
                    A0L(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i5 = paddingRight / i17;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            while (i10 < childCount) {
                View childAt3 = getChildAt(i10);
                AnonymousClass06N r4 = (AnonymousClass06N) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !r4.A04) {
                    int i18 = width2 - r4.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + r4.leftMargin) + max);
                }
                i10++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i10 < childCount) {
            View childAt4 = getChildAt(i10);
            AnonymousClass06N r42 = (AnonymousClass06N) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !r42.A04) {
                int i20 = paddingLeft + r42.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + r42.rightMargin + max;
            }
            i10++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01d5, code lost:
        if (r9 != 1) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ac, code lost:
        if (((androidx.appcompat.view.menu.ActionMenuItemView) r13).A0G() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00db, code lost:
        if (r0.A0G() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0150, code lost:
        if (r9 != 2) goto L_0x0152;
     */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x013e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0139  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r30, int r31) {
        /*
            r29 = this;
            r5 = r29
            boolean r3 = r5.A0B
            r4 = r30
            int r2 = android.view.View.MeasureSpec.getMode(r4)
            r7 = 1
            r8 = 0
            r1 = 0
            r0 = 1073741824(0x40000000, float:2.0)
            if (r2 != r0) goto L_0x0012
            r1 = 1
        L_0x0012:
            r5.A0B = r1
            if (r3 == r1) goto L_0x0018
            r5.A05 = r8
        L_0x0018:
            int r2 = android.view.View.MeasureSpec.getSize(r4)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x002d
            X.01m r1 = r5.A08
            if (r1 == 0) goto L_0x002d
            int r0 = r5.A05
            if (r2 == r0) goto L_0x002d
            r5.A05 = r2
            r1.A0Y(r7)
        L_0x002d:
            int r3 = r5.getChildCount()
            boolean r0 = r5.A0B
            r2 = r31
            if (r0 == 0) goto L_0x02b1
            if (r3 <= 0) goto L_0x02c5
            int r28 = android.view.View.MeasureSpec.getMode(r2)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r27 = android.view.View.MeasureSpec.getSize(r2)
            int r1 = r5.getPaddingLeft()
            int r0 = r5.getPaddingRight()
            int r1 = r1 + r0
            int r11 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r11 = r11 + r0
            r0 = -2
            int r26 = android.view.ViewGroup.getChildMeasureSpec(r2, r11, r0)
            int r4 = r4 - r1
            int r6 = r5.A01
            int r3 = r4 / r6
            int r0 = r4 % r6
            r25 = 0
            if (r3 == 0) goto L_0x02ab
            int r0 = r0 / r3
            int r6 = r6 + r0
            int r2 = r5.getChildCount()
            r10 = 0
            r24 = 0
            r9 = 0
            r23 = 0
            r21 = 0
            r18 = 0
        L_0x0077:
            if (r10 >= r2) goto L_0x014b
            android.view.View r13 = r5.getChildAt(r10)
            int r1 = r13.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x013e
            boolean r1 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            int r9 = r9 + 1
            if (r1 == 0) goto L_0x0090
            int r0 = r5.A00
            r13.setPadding(r0, r8, r0, r8)
        L_0x0090:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            X.06N r12 = (X.AnonymousClass06N) r12
            r12.A03 = r8
            r12.A01 = r8
            r12.A00 = r8
            r12.A02 = r8
            r12.leftMargin = r8
            r12.rightMargin = r8
            if (r1 == 0) goto L_0x00ae
            r0 = r13
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            boolean r1 = r0.A0G()
            r0 = 1
            if (r1 != 0) goto L_0x00af
        L_0x00ae:
            r0 = 0
        L_0x00af:
            r12.A05 = r0
            boolean r0 = r12.A04
            r15 = r3
            if (r0 == 0) goto L_0x00b7
            r15 = 1
        L_0x00b7:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            X.06N r14 = (X.AnonymousClass06N) r14
            int r1 = android.view.View.MeasureSpec.getSize(r26)
            int r1 = r1 - r11
            int r0 = android.view.View.MeasureSpec.getMode(r26)
            int r20 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            boolean r0 = r13 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x0149
            r0 = r13
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
        L_0x00d1:
            r17 = 1
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.A0G()
            r16 = 1
            if (r0 != 0) goto L_0x00df
        L_0x00dd:
            r16 = 0
        L_0x00df:
            if (r15 <= 0) goto L_0x0147
            r1 = 2
            if (r16 == 0) goto L_0x00e6
            if (r15 < r1) goto L_0x0147
        L_0x00e6:
            int r15 = r15 * r6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            r0 = r20
            r13.measure(r15, r0)
            int r15 = r13.getMeasuredWidth()
            int r0 = r15 / r6
            int r15 = r15 % r6
            if (r15 == 0) goto L_0x00fd
            int r0 = r0 + 1
        L_0x00fd:
            if (r16 == 0) goto L_0x0145
            if (r0 >= r1) goto L_0x0145
        L_0x0101:
            boolean r0 = r14.A04
            if (r0 != 0) goto L_0x0142
            if (r16 == 0) goto L_0x0142
        L_0x0107:
            r0 = r17
            r14.A02 = r0
            r14.A00 = r1
            int r14 = r6 * r1
            r0 = 1073741824(0x40000000, float:2.0)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
            r0 = r20
            r13.measure(r14, r0)
            r0 = r23
            int r23 = java.lang.Math.max(r0, r1)
            boolean r0 = r12.A02
            if (r0 == 0) goto L_0x0126
            int r21 = r21 + 1
        L_0x0126:
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x012c
            r24 = 1
        L_0x012c:
            int r3 = r3 - r1
            int r12 = r13.getMeasuredHeight()
            r0 = r25
            int r25 = java.lang.Math.max(r0, r12)
            if (r1 != r7) goto L_0x013e
            int r0 = r7 << r10
            long r0 = (long) r0
            long r18 = r18 | r0
        L_0x013e:
            int r10 = r10 + 1
            goto L_0x0077
        L_0x0142:
            r17 = 0
            goto L_0x0107
        L_0x0145:
            r1 = r0
            goto L_0x0101
        L_0x0147:
            r1 = 0
            goto L_0x0101
        L_0x0149:
            r0 = 0
            goto L_0x00d1
        L_0x014b:
            r0 = 2
            if (r24 == 0) goto L_0x0152
            r22 = 1
            if (r9 == r0) goto L_0x0154
        L_0x0152:
            r22 = 0
        L_0x0154:
            r15 = 0
            if (r21 <= 0) goto L_0x01d2
        L_0x0157:
            if (r3 <= 0) goto L_0x01d2
            r13 = 0
            r12 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r20 = 0
        L_0x0160:
            if (r12 >= r2) goto L_0x018a
            android.view.View r0 = r5.getChildAt(r12)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.06N r0 = (X.AnonymousClass06N) r0
            boolean r10 = r0.A02
            if (r10 == 0) goto L_0x017b
            int r10 = r0.A00
            if (r10 >= r1) goto L_0x017e
            int r1 = r0.A00
            r20 = 1
            long r20 = r20 << r12
            r13 = 1
        L_0x017b:
            int r12 = r12 + 1
            goto L_0x0160
        L_0x017e:
            r10 = 1
            int r0 = r0.A00
            if (r0 != r1) goto L_0x017b
            long r10 = r10 << r12
            long r20 = r20 | r10
            int r13 = r13 + 1
            goto L_0x017b
        L_0x018a:
            long r18 = r18 | r20
            if (r13 > r3) goto L_0x01d2
            int r11 = r1 + 1
            r10 = 0
        L_0x0191:
            if (r10 >= r2) goto L_0x01d0
            android.view.View r13 = r5.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            X.06N r12 = (X.AnonymousClass06N) r12
            int r0 = r7 << r10
            long r0 = (long) r0
            long r16 = r20 & r0
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x01b4
            int r0 = r12.A00
            if (r0 != r11) goto L_0x01b1
            int r0 = r7 << r10
            long r0 = (long) r0
            long r18 = r18 | r0
        L_0x01b1:
            int r10 = r10 + 1
            goto L_0x0191
        L_0x01b4:
            if (r22 == 0) goto L_0x01c5
            boolean r0 = r12.A05
            if (r0 == 0) goto L_0x01c5
            if (r3 != r7) goto L_0x01c5
            int r1 = r5.A00
            int r0 = r1 + r6
            r22 = 1
            r13.setPadding(r0, r8, r1, r8)
        L_0x01c5:
            int r0 = r12.A00
            int r0 = r0 + 1
            r12.A00 = r0
            r12.A03 = r7
            int r3 = r3 + -1
            goto L_0x01b1
        L_0x01d0:
            r15 = 1
            goto L_0x0157
        L_0x01d2:
            if (r24 != 0) goto L_0x01d7
            r1 = 1
            if (r9 == r7) goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            if (r3 <= 0) goto L_0x027c
            r10 = 0
            int r0 = (r18 > r10 ? 1 : (r18 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x027c
            int r9 = r9 - r7
            if (r3 < r9) goto L_0x01e9
            if (r1 != 0) goto L_0x01e9
            r0 = r23
            if (r0 <= r7) goto L_0x027c
        L_0x01e9:
            int r0 = java.lang.Long.bitCount(r18)
            float r9 = (float) r0
            if (r1 != 0) goto L_0x0225
            r0 = 1
            long r10 = r18 & r0
            r14 = 1056964608(0x3f000000, float:0.5)
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x020b
            android.view.View r0 = r5.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.06N r0 = (X.AnonymousClass06N) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x020b
            float r9 = r9 - r14
        L_0x020b:
            int r8 = r2 + -1
            int r0 = r7 << r8
            long r0 = (long) r0
            long r10 = r18 & r0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0225
            android.view.View r0 = r5.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.06N r0 = (X.AnonymousClass06N) r0
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x0225
            float r9 = r9 - r14
        L_0x0225:
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x027a
            int r3 = r3 * r6
            float r0 = (float) r3
            float r0 = r0 / r9
            int r8 = (int) r0
        L_0x022e:
            r3 = 0
        L_0x022f:
            if (r3 >= r2) goto L_0x027c
            int r0 = r7 << r3
            long r0 = (long) r0
            long r11 = r18 & r0
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x025a
            android.view.View r0 = r5.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r9 = r0.getLayoutParams()
            X.06N r9 = (X.AnonymousClass06N) r9
            boolean r0 = r0 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r0 == 0) goto L_0x025d
            r9.A01 = r8
            r9.A03 = r7
            if (r3 != 0) goto L_0x0259
            boolean r0 = r9.A05
            if (r0 != 0) goto L_0x0259
            int r1 = -r8
            r0 = 2
            int r1 = r1 / r0
            r9.leftMargin = r1
        L_0x0259:
            r15 = 1
        L_0x025a:
            int r3 = r3 + 1
            goto L_0x022f
        L_0x025d:
            r1 = 2
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x026b
            r9.A01 = r8
            r9.A03 = r7
            int r0 = -r8
            int r0 = r0 / r1
            r9.rightMargin = r0
            goto L_0x0259
        L_0x026b:
            if (r3 == 0) goto L_0x0271
            int r0 = r8 / 2
            r9.leftMargin = r0
        L_0x0271:
            int r0 = r2 + -1
            if (r3 == r0) goto L_0x025a
            int r0 = r8 / 2
            r9.rightMargin = r0
            goto L_0x025a
        L_0x027a:
            r8 = 0
            goto L_0x022e
        L_0x027c:
            if (r15 == 0) goto L_0x02a3
            r8 = 0
        L_0x027f:
            if (r8 >= r2) goto L_0x02a3
            android.view.View r7 = r5.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r3 = r7.getLayoutParams()
            X.06N r3 = (X.AnonymousClass06N) r3
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x02a0
            int r1 = r3.A00
            int r1 = r1 * r6
            int r0 = r3.A01
            int r1 = r1 + r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            r0 = r26
            r7.measure(r1, r0)
        L_0x02a0:
            int r8 = r8 + 1
            goto L_0x027f
        L_0x02a3:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r28
            if (r0 != r1) goto L_0x02ab
            r25 = r27
        L_0x02ab:
            r0 = r25
            r5.setMeasuredDimension(r4, r0)
            return
        L_0x02b1:
            r1 = 0
        L_0x02b2:
            if (r1 >= r3) goto L_0x02c5
            android.view.View r0 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r0.rightMargin = r8
            r0.leftMargin = r8
            int r1 = r1 + 1
            goto L_0x02b2
        L_0x02c5:
            super.onMeasure(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.A0A.A0H(z);
    }

    public void setMenuCallbacks(C004301w r1, AnonymousClass01U r2) {
        this.A09 = r1;
        this.A02 = r2;
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A06 != i) {
            this.A06 = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A07 = contextThemeWrapper;
        }
    }

    public void setPresenter(AnonymousClass03I r1) {
        this.A0A = r1;
        r1.A0G(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = false;
        float f = context.getResources().getDisplayMetrics().density;
        this.A01 = (int) (56.0f * f);
        this.A00 = (int) (f * 4.0f);
        this.A07 = context;
        this.A06 = 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, X.04A] */
    public /* bridge */ /* synthetic */ AnonymousClass04A A09(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public C003301m A0E() {
        return this.A08;
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.A0A.A06();
    }

    public int getPopupTheme() {
        return this.A06;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass03I r1 = this.A0A;
        if (r1 != null) {
            r1.CQu(false);
            if (this.A0A.A0K()) {
                this.A0A.A0I();
                this.A0A.A0L();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A0G();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.A0A.A0F(drawable);
    }

    public void BdU(C003301m r1) {
        this.A08 = r1;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass06N;
    }

    public void setOnMenuItemClickListener(AnonymousClass035 r1) {
        this.A03 = r1;
    }

    public void setOverflowReserved(boolean z) {
        this.A04 = z;
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }
}
