package com.google.android.material.chip;

import X.AnonymousClass000;
import X.BE6;
import X.C22641BHc;
import X.C22642BHd;
import X.C25475CgU;
import X.C26121Csj;
import X.C26228CvK;
import X.C28520E5k;
import X.C72453Mb;
import X.D58;
import X.DL8;
import X.E2O;
import X.ECX;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import java.util.Set;

public class ChipGroup extends C22642BHd {
    public int A00;
    public C28520E5k A01;
    public int A02;
    public final C26121Csj A03;
    public final int A04;
    public final D58 A05;

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public void A00(int i) {
        C26121Csj csj = this.A03;
        ECX ecx = (ECX) AnonymousClass000.A0w(csj.A03, i);
        if (ecx != null && C26121Csj.A01(csj, ecx)) {
            C26121Csj.A00(csj);
        }
    }

    public int getCheckedChipId() {
        C26121Csj csj = this.A03;
        if (!csj.A02) {
            return -1;
        }
        Set set = csj.A04;
        if (!set.isEmpty()) {
            return C72453Mb.A0H(set.iterator());
        }
        return -1;
    }

    public List getCheckedChipIds() {
        return this.A03.A03(this);
    }

    public int getChipSpacingHorizontal() {
        return this.A00;
    }

    public int getChipSpacingVertical() {
        return this.A02;
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            this.A00 = i;
            requestLayout();
        }
    }

    public void setChipSpacingVertical(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            this.A01 = i;
            requestLayout();
        }
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw BE6.A0v("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw BE6.A0v("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw BE6.A0v("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(E2O e2o) {
        DL8 dl8;
        if (e2o == null) {
            dl8 = null;
        } else {
            dl8 = new DL8(e2o, this);
        }
        this.A01 = dl8;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A05.A00 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.A03.A01 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw BE6.A0v("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw BE6.A0v("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r9 = 2132084750(0x7f15080e, float:1.980968E38)
            r5 = r12
            r8 = r13
            android.content.Context r0 = X.C27771Xm.A00(r11, r12, r13, r9)
            r10.<init>(r0, r12, r13)
            r3 = 0
            r10.A03 = r3
            android.content.res.Resources$Theme r1 = r0.getTheme()
            int[] r0 = X.C27781Xn.A0H
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r12, r0, r3, r3)
            r0 = 1
            int r0 = r1.getDimensionPixelSize(r0, r3)
            r10.A01 = r0
            int r0 = r1.getDimensionPixelSize(r3, r3)
            r10.A00 = r0
            r1.recycle()
            X.Csj r2 = new X.Csj
            r2.<init>()
            r10.A03 = r2
            X.D58 r1 = new X.D58
            r1.<init>(r10)
            r10.A05 = r1
            android.content.Context r4 = r10.getContext()
            int[] r6 = X.C27781Xn.A08
            int[] r7 = new int[r3]
            android.content.res.TypedArray r4 = X.C27791Xo.A00(r4, r5, r6, r7, r8, r9)
            r0 = 1
            int r5 = r4.getDimensionPixelOffset(r0, r3)
            r0 = 2
            int r0 = r4.getDimensionPixelOffset(r0, r5)
            r10.setChipSpacingHorizontal(r0)
            r0 = 3
            int r0 = r4.getDimensionPixelOffset(r0, r5)
            r10.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r4.getBoolean(r0, r3)
            r10.A03 = r0
            r0 = 6
            boolean r0 = r4.getBoolean(r0, r3)
            r10.setSingleSelection((boolean) r0)
            r0 = 4
            boolean r0 = r4.getBoolean(r0, r3)
            r10.setSelectionRequired(r0)
            r0 = -1
            int r0 = r4.getResourceId(r3, r0)
            r10.A04 = r0
            r4.recycle()
            X.DL9 r0 = new X.DL9
            r0.<init>(r10)
            r2.A00 = r0
            super.setOnHierarchyChangeListener(r1)
            r0 = 1
            r10.setImportantForAccessibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof C22641BHc)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A04;
        if (i != -1) {
            C26121Csj csj = this.A03;
            ECX ecx = (ECX) AnonymousClass000.A0w(csj.A03, i);
            if (ecx != null && C26121Csj.A01(csj, ecx)) {
                C26121Csj.A00(csj);
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C26228CvK cvK = new C26228CvK(accessibilityNodeInfo);
        if (this.A03) {
            i = getVisibleChipCount();
        } else {
            i = -1;
        }
        cvK.A0Z(C25475CgU.A00(this.A02, i, C72453Mb.A04(this.A03.A02 ? 1 : 0), false));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    public void setSingleLine(int i) {
        this.A03 = getResources().getBoolean(i);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setOnCheckedStateChangeListener(C28520E5k e5k) {
        this.A01 = e5k;
    }

    public ChipGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleLine(boolean z) {
        this.A03 = z;
    }

    public void setSingleSelection(boolean z) {
        C26121Csj csj = this.A03;
        if (csj.A02 != z) {
            csj.A02 = z;
            csj.A04();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969043);
    }
}
