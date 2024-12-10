package com.google.android.material.button;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.C108965cb;
import X.C17880vN;
import X.C17890vO;
import X.C22667BJi;
import X.C25475CgU;
import X.C26228CvK;
import X.C27771Xm;
import X.C27781Xn;
import X.C27791Xo;
import X.C28011Ym;
import X.C28021Yn;
import X.C28519E5j;
import X.C72453Mb;
import X.DL7;
import X.DUP;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {
    public boolean A00;
    public boolean A01;
    public Integer[] A02;
    public Set A03;
    public boolean A04;
    public final Comparator A05;
    public final LinkedHashSet A06;
    public final List A07;
    public final int A08;
    public final DL7 A09;

    public static void A01(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", AnonymousClass001.A1I("Button ID is not valid: ", AnonymousClass000.A10(), i));
            return;
        }
        HashSet A12 = AnonymousClass8BR.A12(materialButtonToggleGroup.A03);
        if (z) {
            Integer valueOf = Integer.valueOf(i);
            if (!A12.contains(valueOf)) {
                if (materialButtonToggleGroup.A00 && !A12.isEmpty()) {
                    A12.clear();
                }
                A12.add(valueOf);
            } else {
                return;
            }
        } else {
            Integer valueOf2 = Integer.valueOf(i);
            if (!A12.contains(valueOf2)) {
                return;
            }
            if (!materialButtonToggleGroup.A04 || A12.size() > 1) {
                A12.remove(valueOf2);
            }
        }
        materialButtonToggleGroup.A02(A12);
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && getChildAt(i2).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.A02 = this.A09;
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void A02(Set set) {
        Set set2 = this.A03;
        this.A03 = AnonymousClass8BR.A12(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildAt(i).getId();
            Integer valueOf = Integer.valueOf(id);
            boolean contains = set.contains(valueOf);
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.A01 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.A01 = false;
            }
            if (set2.contains(valueOf) != set.contains(valueOf)) {
                boolean A1b = C108965cb.A1b(set, id);
                Iterator it = this.A06.iterator();
                while (it.hasNext()) {
                    ((C28519E5j) it.next()).Bn1(id, A1b);
                }
            }
        }
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.CS3, java.lang.Object] */
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        A01(this, materialButton.getId(), materialButton.isChecked());
        C28011Ym shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        List list = this.A07;
        C28021Yn r4 = shapeAppearanceModel.A02;
        C28021Yn r3 = shapeAppearanceModel.A00;
        C28021Yn r2 = shapeAppearanceModel.A03;
        C28021Yn r1 = shapeAppearanceModel.A01;
        ? obj = new Object();
        obj.A02 = r4;
        obj.A03 = r2;
        obj.A01 = r1;
        obj.A00 = r3;
        list.add(obj);
        materialButton.setEnabled(isEnabled());
        AnonymousClass1HF.A0f(materialButton, new C22667BJi(this, 3));
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.A05);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C17890vO.A0z(getChildAt(i), treeMap, i);
        }
        this.A02 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public int getCheckedButtonId() {
        if (!this.A00 || this.A03.isEmpty()) {
            return -1;
        }
        return C72453Mb.A0H(this.A03.iterator());
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.A02;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public void setSingleSelection(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            A02(C17880vN.A12());
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet, int i) {
        super(C27771Xm.A00(context, attributeSet, i, 2132084764), attributeSet, i);
        this.A07 = AnonymousClass000.A13();
        this.A09 = new DL7(this);
        this.A06 = C17880vN.A14();
        this.A05 = new DUP(this, 12);
        this.A01 = false;
        this.A03 = C17880vN.A12();
        TypedArray A002 = C27791Xo.A00(getContext(), attributeSet, C27781Xn.A0M, new int[0], i, 2132084764);
        setSingleSelection(A002.getBoolean(3, false));
        this.A08 = A002.getResourceId(1, -1);
        this.A04 = A002.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(A002.getBoolean(0, true));
        A002.recycle();
        setImportantForAccessibility(1);
    }

    private void A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0) {
                ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(getChildAt(firstVisibleChildIndex));
                if (getOrientation() == 1) {
                    A0B.topMargin = 0;
                    A0B.bottomMargin = 0;
                    return;
                }
                A0B.setMarginEnd(0);
                A0B.setMarginStart(0);
                A0B.leftMargin = 0;
                A0B.rightMargin = 0;
            }
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != 8) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        int childCount = getChildCount();
        do {
            childCount--;
            if (childCount < 0) {
                return -1;
            }
        } while (getChildAt(childCount).getVisibility() == 8);
        return childCount;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [X.CS3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v4, types: [X.CS3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v7, types: [X.CS3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r9v8, types: [X.CS3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        r0 = X.AnonymousClass000.A1P(getOrientation());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r5 != r7) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        if (r0 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (getLayoutDirection() != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r2 = X.CS3.A04;
        r1 = r9.A03;
        r0 = r9.A01;
        r9 = new java.lang.Object();
        r9.A02 = r2;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r9.A03 = r1;
        r9.A01 = r0;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r9.A00 = r2;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        r3.A02 = r9.A02;
        r3.A00 = r9.A00;
        r3.A03 = r9.A03;
        r3.A01 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        r1 = r9.A02;
        r2 = X.CS3.A04;
        r0 = r9.A03;
        r9 = new java.lang.Object();
        r9.A02 = r1;
        r9.A03 = r0;
        r9.A01 = r2;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008a, code lost:
        if (r5 != r6) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        if (r0 == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0093, code lost:
        if (getLayoutDirection() != 1) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        r2 = r9.A02;
        r1 = r9.A00;
        r0 = X.CS3.A04;
        r9 = new java.lang.Object();
        r9.A02 = r2;
        r9.A03 = r0;
        r9.A01 = r0;
        r9.A00 = r1;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a9, code lost:
        r1 = X.CS3.A04;
        r2 = r9.A00;
        r0 = r9.A01;
        r9 = new java.lang.Object();
        r9.A02 = r1;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        if (r9 == null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r3.A00(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        r4.setShapeAppearanceModel(new X.C28011Ym(r3));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r10 = this;
            int r8 = r10.getChildCount()
            int r7 = r10.getFirstVisibleChildIndex()
            int r6 = r10.getLastVisibleChildIndex()
            r5 = 0
        L_0x000d:
            if (r5 >= r8) goto L_0x00b7
            android.view.View r4 = r10.getChildAt(r5)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            int r1 = r4.getVisibility()
            r0 = 8
            if (r1 == r0) goto L_0x003e
            X.1Ym r0 = r4.getShapeAppearanceModel()
            X.1Yp r3 = new X.1Yp
            r3.<init>(r0)
            java.util.List r0 = r10.A07
            java.lang.Object r9 = r0.get(r5)
            X.CS3 r9 = (X.CS3) r9
            if (r7 != r6) goto L_0x0041
            if (r9 != 0) goto L_0x0067
        L_0x0032:
            r0 = 0
            r3.A00(r0)
        L_0x0036:
            X.1Ym r0 = new X.1Ym
            r0.<init>(r3)
            r4.setShapeAppearanceModel(r0)
        L_0x003e:
            int r5 = r5 + 1
            goto L_0x000d
        L_0x0041:
            int r0 = r10.getOrientation()
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r5 != r7) goto L_0x008a
            if (r0 == 0) goto L_0x0078
            int r1 = r10.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0095
        L_0x0054:
            X.1Yn r2 = X.CS3.A04
            X.1Yn r1 = r9.A03
            X.1Yn r0 = r9.A01
            X.CS3 r9 = new X.CS3
            r9.<init>()
            r9.A02 = r2
        L_0x0061:
            r9.A03 = r1
            r9.A01 = r0
        L_0x0065:
            r9.A00 = r2
        L_0x0067:
            X.1Yn r0 = r9.A02
            r3.A02 = r0
            X.1Yn r0 = r9.A00
            r3.A00 = r0
            X.1Yn r0 = r9.A03
            r3.A03 = r0
            X.1Yn r0 = r9.A01
            r3.A01 = r0
            goto L_0x0036
        L_0x0078:
            X.1Yn r1 = r9.A02
            X.1Yn r2 = X.CS3.A04
            X.1Yn r0 = r9.A03
            X.CS3 r9 = new X.CS3
            r9.<init>()
            r9.A02 = r1
            r9.A03 = r0
            r9.A01 = r2
            goto L_0x0065
        L_0x008a:
            if (r5 != r6) goto L_0x0032
            if (r0 == 0) goto L_0x00a9
            int r1 = r10.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0054
        L_0x0095:
            X.1Yn r2 = r9.A02
            X.1Yn r1 = r9.A00
            X.1Yn r0 = X.CS3.A04
            X.CS3 r9 = new X.CS3
            r9.<init>()
            r9.A02 = r2
            r9.A03 = r0
            r9.A01 = r0
            r9.A00 = r1
            goto L_0x0067
        L_0x00a9:
            X.1Yn r1 = X.CS3.A04
            X.1Yn r2 = r9.A00
            X.1Yn r0 = r9.A01
            X.CS3 r9 = new X.CS3
            r9.<init>()
            r9.A02 = r1
            goto L_0x0061
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.A03():void");
    }

    public List getCheckedButtonIds() {
        ArrayList A13 = AnonymousClass000.A13();
        for (int i = 0; i < getChildCount(); i++) {
            int id = getChildAt(i).getId();
            if (C108965cb.A1b(this.A03, id)) {
                C17890vO.A1D(A13, id);
            }
        }
        return A13;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.A08;
        if (i != -1) {
            A02(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C26228CvK(accessibilityNodeInfo).A0Z(C25475CgU.A00(1, getVisibleButtonCount(), C72453Mb.A04(this.A00 ? 1 : 0), false));
    }

    public void onMeasure(int i, int i2) {
        A03();
        A00();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).A02 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A07.remove(indexOfChild);
        }
        A03();
        A00();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.A04 = z;
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970421);
    }
}
