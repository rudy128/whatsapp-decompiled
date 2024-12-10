package com.google.android.material.tabs;

import X.AnonymousClass000;
import X.AnonymousClass03S;
import X.AnonymousClass1YU;
import X.AnonymousClass1b8;
import X.AnonymousClass6IX;
import X.AnonymousClass7BR;
import X.AnonymousClass8B5;
import X.C108945cZ;
import X.C108985cd;
import X.C109365dK;
import X.C110585gH;
import X.C110595gJ;
import X.C136836uU;
import X.C137076us;
import X.C1411074h;
import X.C142677Aj;
import X.C142747Aq;
import X.C1606189f;
import X.C19740yt;
import X.C25475CgU;
import X.C26228CvK;
import X.C26317Cxa;
import X.C27811Xs;
import X.C27831Xu;
import X.C29011bR;
import X.C29031bT;
import X.C72473Md;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.WaTabLayout;
import com.whatsapp.WaViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
public class TabLayout extends HorizontalScrollView {
    public static final C29011bR A0l = new C29031bT(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public ColorStateList A0G;
    public ColorStateList A0H;
    public ColorStateList A0I;
    public Drawable A0J;
    public ViewPager A0K;
    public C137076us A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public int A0P;
    public int A0Q;
    public ValueAnimator A0R;
    public DataSetObserver A0S;
    public AnonymousClass1b8 A0T;
    public C142677Aj A0U;
    public C1606189f A0V;
    public C1606189f A0W;
    public C136836uU A0X;
    public C142747Aq A0Y;
    public boolean A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final TimeInterpolator A0d;
    public final C29011bR A0e;
    public final C110585gH A0f;
    public final ArrayList A0g;
    public final ArrayList A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;

    public static ColorStateList A01(int i, int i2) {
        return new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void A04(int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                C110585gH r7 = this.A0f;
                int childCount = r7.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    if (r7.getChildAt(i2).getWidth() > 0) {
                        i2++;
                    }
                }
                int scrollX = getScrollX();
                int A002 = A00(i, 0.0f);
                if (scrollX != A002) {
                    A03();
                    ValueAnimator valueAnimator = this.A0R;
                    int[] A1W = C108945cZ.A1W();
                    A1W[0] = scrollX;
                    A1W[1] = A002;
                    valueAnimator.setIntValues(A1W);
                    this.A0R.start();
                }
                int i3 = this.A06;
                ValueAnimator valueAnimator2 = r7.A00;
                if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || r7.A02.A02 == i)) {
                    r7.A00.cancel();
                }
                TabLayout tabLayout = r7.A02;
                if (tabLayout.A02 != i) {
                    View childAt = r7.getChildAt(tabLayout.getSelectedTabPosition());
                    View childAt2 = r7.getChildAt(i);
                    if (childAt2 == null) {
                        C110585gH.A01(r7, tabLayout.getSelectedTabPosition());
                        return;
                    }
                    tabLayout.A02 = i;
                    C26317Cxa cxa = new C26317Cxa(childAt, childAt2, r7, 2);
                    ValueAnimator valueAnimator3 = new ValueAnimator();
                    r7.A00 = valueAnimator3;
                    valueAnimator3.setInterpolator(tabLayout.A0d);
                    valueAnimator3.setDuration((long) i3);
                    valueAnimator3.setFloatValues(new float[]{0.0f, 1.0f});
                    valueAnimator3.addUpdateListener(cxa);
                    valueAnimator3.start();
                    return;
                }
                return;
            }
            A0B(0.0f, i, true, true);
        }
    }

    public static void A06(ViewPager viewPager, TabLayout tabLayout, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = tabLayout.A0K;
        if (viewPager2 != null) {
            C142747Aq r1 = tabLayout.A0Y;
            if (!(r1 == null || (list2 = viewPager2.A0F) == null)) {
                list2.remove(r1);
            }
            C142677Aj r12 = tabLayout.A0U;
            if (!(r12 == null || (list = tabLayout.A0K.A0E) == null)) {
                list.remove(r12);
            }
        }
        C1606189f r2 = tabLayout.A0V;
        if (r2 != null) {
            tabLayout.A0g.remove(r2);
            tabLayout.A0V = null;
        }
        if (viewPager != null) {
            tabLayout.A0K = viewPager;
            C142747Aq r13 = tabLayout.A0Y;
            if (r13 == null) {
                r13 = new C142747Aq(tabLayout);
                tabLayout.A0Y = r13;
            }
            r13.A01 = 0;
            r13.A00 = 0;
            viewPager.A0K(r13);
            AnonymousClass7BR r14 = new AnonymousClass7BR(viewPager);
            tabLayout.A0V = r14;
            C108985cd.A1I(r14, tabLayout.A0g);
            AnonymousClass1b8 adapter = viewPager.getAdapter();
            if (adapter != null) {
                tabLayout.A0D(adapter, true);
            }
            C142677Aj r15 = tabLayout.A0U;
            if (r15 == null) {
                r15 = new C142677Aj(tabLayout);
                tabLayout.A0U = r15;
            }
            r15.A00 = true;
            List list3 = viewPager.A0E;
            if (list3 == null) {
                list3 = AnonymousClass000.A13();
                viewPager.A0E = list3;
            }
            list3.add(r15);
            tabLayout.A0B(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            tabLayout.A0K = null;
            tabLayout.A0D((AnonymousClass1b8) null, false);
        }
        tabLayout.A0Z = z;
    }

    public void A0B(float f, int i, boolean z, boolean z2) {
        int A002;
        int round = Math.round(((float) i) + f);
        if (round >= 0) {
            C110585gH r3 = this.A0f;
            if (round < r3.getChildCount()) {
                if (z2) {
                    r3.A02.A02 = round;
                    ValueAnimator valueAnimator = r3.A00;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        r3.A00.cancel();
                    }
                    C110585gH.A00(r3.getChildAt(i), r3.getChildAt(i + 1), r3, f);
                }
                ValueAnimator valueAnimator2 = this.A0R;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0R.cancel();
                }
                if (i < 0) {
                    A002 = 0;
                } else {
                    A002 = A00(i, f);
                }
                scrollTo(A002, 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public void A0J(boolean z) {
        float f;
        int i = 0;
        while (true) {
            C110585gH r1 = this.A0f;
            if (i < r1.getChildCount()) {
                View childAt = r1.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.A03 == 1 && this.A05 == 0) {
                    layoutParams.width = 0;
                    f = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f = 0.0f;
                }
                layoutParams.weight = f;
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r5 = (X.C110595gJ) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            r6 = 0
        L_0x0001:
            X.5gH r1 = r7.A0f
            int r0 = r1.getChildCount()
            if (r6 >= r0) goto L_0x0032
            android.view.View r5 = r1.getChildAt(r6)
            boolean r0 = r5 instanceof X.C110595gJ
            if (r0 == 0) goto L_0x002f
            X.5gJ r5 = (X.C110595gJ) r5
            android.graphics.drawable.Drawable r4 = r5.A00
            if (r4 == 0) goto L_0x002f
            int r3 = r5.getLeft()
            int r2 = r5.getTop()
            int r1 = r5.getRight()
            int r0 = r5.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            android.graphics.drawable.Drawable r0 = r5.A00
            r0.draw(r8)
        L_0x002f:
            int r6 = r6 + 1
            goto L_0x0001
        L_0x0032:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onDraw(android.graphics.Canvas):void");
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AnonymousClass1b8 r2) {
        A0D(r2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r6.A0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(int r7, float r8) {
        /*
            r6 = this;
            int r0 = r6.A03
            r5 = 0
            r4 = 2
            if (r0 == 0) goto L_0x0008
            if (r0 != r4) goto L_0x0046
        L_0x0008:
            X.5gH r3 = r6.A0f
            android.view.View r2 = r3.getChildAt(r7)
            if (r2 == 0) goto L_0x0046
            int r1 = r7 + 1
            int r0 = r3.getChildCount()
            if (r1 >= r0) goto L_0x0042
            android.view.View r0 = r3.getChildAt(r1)
        L_0x001c:
            int r1 = r2.getWidth()
            if (r0 == 0) goto L_0x0026
            int r5 = r0.getWidth()
        L_0x0026:
            int r2 = r2.getLeft()
            int r0 = r1 / 2
            int r2 = r2 + r0
            int r0 = r6.getWidth()
            int r0 = r0 / r4
            int r2 = r2 - r0
            int r1 = r1 + r5
            float r1 = (float) r1
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 * r8
            int r1 = (int) r1
            int r0 = r6.getLayoutDirection()
            if (r0 != 0) goto L_0x0044
            int r2 = r2 + r1
            return r2
        L_0x0042:
            r0 = 0
            goto L_0x001c
        L_0x0044:
            int r2 = r2 - r1
            return r2
        L_0x0046:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A00(int, float):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1 != 2) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r5 = this;
            int r0 = r5.A03
            r4 = 2
            r2 = 0
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            r0 = 0
        L_0x0009:
            X.5gH r3 = r5.A0f
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.A03
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x001b
            if (r0 == r4) goto L_0x001b
        L_0x0017:
            r5.A0J(r2)
            return
        L_0x001b:
            int r0 = r5.A05
            if (r0 != r4) goto L_0x0026
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r1, r0)
        L_0x0026:
            r3.setGravity(r2)
            goto L_0x0017
        L_0x002a:
            int r1 = r5.A05
            if (r1 == 0) goto L_0x0034
            r0 = 1
            if (r1 == r2) goto L_0x003e
            if (r1 == r4) goto L_0x003b
            goto L_0x0017
        L_0x0034:
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r1, r0)
        L_0x003b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L_0x003e:
            r3.setGravity(r0)
            goto L_0x0017
        L_0x0042:
            int r1 = r5.A0P
            int r0 = r5.A0D
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r2, r1)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A02():void");
    }

    private void A03() {
        if (this.A0R == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0R = valueAnimator;
            valueAnimator.setInterpolator(this.A0d);
            this.A0R.setDuration((long) this.A06);
            C1411074h.A00(this.A0R, this, 3);
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.A0h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i);
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.A0j;
        if (i != -1) {
            return i;
        }
        int i2 = this.A03;
        if (i2 == 0 || i2 == 2) {
            return this.A0k;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, C72473Md.A07(this, this.A0f.getWidth() - getWidth()));
    }

    private void setSelectedTabView(int i) {
        C110585gH r5 = this.A0f;
        int childCount = r5.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = r5.getChildAt(i2);
                boolean z = true;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(AnonymousClass000.A1T(i2, i));
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(AnonymousClass000.A1T(i2, i));
                    if (i2 != i) {
                        z = false;
                    }
                    childAt.setActivated(z);
                    if (childAt instanceof C110595gJ) {
                        ((C110595gJ) childAt).A05();
                    }
                }
            }
        }
    }

    public C136836uU A07() {
        C110595gJ r1;
        CharSequence charSequence;
        C136836uU r2 = (C136836uU) A0l.BAf();
        if (r2 == null) {
            r2 = new C136836uU();
        }
        r2.A03 = this;
        C29011bR r0 = this.A0e;
        if (r0 == null || (r1 = (C110595gJ) r0.BAf()) == null) {
            r1 = new C110595gJ(getContext(), this);
        }
        r1.setTab(r2);
        r1.setFocusable(true);
        r1.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(r2.A04)) {
            charSequence = r2.A05;
        } else {
            charSequence = r2.A04;
        }
        r1.setContentDescription(charSequence);
        r2.A02 = r1;
        return r2;
    }

    public C136836uU A08(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.A0h;
        if (i < arrayList.size()) {
            return (C136836uU) arrayList.get(i);
        }
        return null;
    }

    public void A0A() {
        C110585gH r3 = this.A0f;
        int childCount = r3.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C110595gJ r1 = (C110595gJ) r3.getChildAt(childCount);
            r3.removeViewAt(childCount);
            if (r1 != null) {
                r1.setTab((C136836uU) null);
                r1.setSelected(false);
                this.A0e.CEF(r1);
            }
            requestLayout();
        }
        Iterator it = this.A0h.iterator();
        while (it.hasNext()) {
            C136836uU r2 = (C136836uU) it.next();
            it.remove();
            r2.A03 = null;
            r2.A02 = null;
            r2.A06 = null;
            r2.A05 = null;
            r2.A04 = null;
            r2.A00 = -1;
            r2.A01 = null;
            A0l.CEF(r2);
        }
        this.A0X = null;
    }

    public void A0C(int i) {
        int i2;
        C136836uU r0 = this.A0X;
        if (r0 != null) {
            i2 = r0.A00;
        } else {
            i2 = 0;
        }
        C110585gH r02 = this.A0f;
        C110595gJ r1 = (C110595gJ) r02.getChildAt(i);
        r02.removeViewAt(i);
        if (r1 != null) {
            r1.setTab((C136836uU) null);
            r1.setSelected(false);
            this.A0e.CEF(r1);
        }
        requestLayout();
        ArrayList arrayList = this.A0h;
        C136836uU r2 = (C136836uU) arrayList.remove(i);
        if (r2 != null) {
            r2.A03 = null;
            r2.A02 = null;
            r2.A06 = null;
            r2.A05 = null;
            r2.A04 = null;
            r2.A00 = -1;
            r2.A01 = null;
            A0l.CEF(r2);
        }
        int size = arrayList.size();
        int i3 = -1;
        for (int i4 = i; i4 < size; i4++) {
            if (((C136836uU) arrayList.get(i4)).A00 == this.A02) {
                i3 = i4;
            }
            ((C136836uU) arrayList.get(i4)).A00 = i4;
        }
        this.A02 = i3;
        if (i2 == i) {
            C136836uU r03 = null;
            if (!arrayList.isEmpty()) {
                r03 = (C136836uU) arrayList.get(Math.max(0, i - 1));
            }
            A0G(r03);
        }
    }

    public void A0D(AnonymousClass1b8 r3, boolean z) {
        DataSetObserver dataSetObserver;
        AnonymousClass1b8 r1 = this.A0T;
        if (!(r1 == null || (dataSetObserver = this.A0S) == null)) {
            r1.A06(dataSetObserver);
        }
        this.A0T = r3;
        if (z && r3 != null) {
            DataSetObserver dataSetObserver2 = this.A0S;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new C109365dK(this);
                this.A0S = dataSetObserver2;
            }
            r3.A05(dataSetObserver2);
        }
        A09();
    }

    public void A0E(AnonymousClass8B5 r3) {
        ArrayList arrayList = this.A0g;
        if (!arrayList.contains(r3)) {
            arrayList.add(r3);
        }
    }

    public void A0F(C136836uU r3) {
        A0H(r3, C108945cZ.A07(this), this.A0h.isEmpty());
    }

    public void A0G(C136836uU r2) {
        if (!(this instanceof AnonymousClass6IX) || isEnabled()) {
            A0I(r2, true);
        }
    }

    public void A0H(C136836uU r8, int i, boolean z) {
        float f;
        if (r8.A03 == this) {
            r8.A00 = i;
            ArrayList arrayList = this.A0h;
            arrayList.add(i, r8);
            int size = arrayList.size();
            int i2 = -1;
            for (int i3 = i + 1; i3 < size; i3++) {
                if (((C136836uU) arrayList.get(i3)).A00 == this.A02) {
                    i2 = i3;
                }
                ((C136836uU) arrayList.get(i3)).A00 = i3;
            }
            this.A02 = i2;
            C110595gJ r6 = r8.A02;
            r6.setSelected(false);
            r6.setActivated(false);
            C110585gH r5 = this.A0f;
            int i4 = r8.A00;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.A03 == 1 && this.A05 == 0) {
                layoutParams.width = 0;
                f = 1.0f;
            } else {
                layoutParams.width = -2;
                f = 0.0f;
            }
            layoutParams.weight = f;
            r5.addView(r6, i4, layoutParams);
            if (z) {
                r8.A00();
                return;
            }
            return;
        }
        throw AnonymousClass000.A0k("Tab belongs to a different TabLayout.");
    }

    public void A0I(C136836uU r6, boolean z) {
        int i;
        C136836uU r4 = this.A0X;
        if (r4 != r6) {
            if (r6 != null) {
                i = r6.A00;
            } else {
                i = -1;
            }
            if (z) {
                if ((r4 == null || r4.A00 == -1) && i != -1) {
                    A0B(0.0f, i, true, true);
                } else {
                    A04(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0X = r6;
            if (r4 != null && r4.A03 != null) {
                ArrayList arrayList = this.A0g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C1606189f) arrayList.get(size)).C8N(r4);
                }
            }
            if (r6 != null) {
                ArrayList arrayList2 = this.A0g;
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        ((C1606189f) arrayList2.get(size2)).C8K(r6);
                    } else {
                        return;
                    }
                }
            }
        } else if (r4 != null) {
            ArrayList arrayList3 = this.A0g;
            int size3 = arrayList3.size();
            while (true) {
                size3--;
                if (size3 >= 0) {
                    ((C1606189f) arrayList3.get(size3)).C8J(r6);
                } else {
                    A04(r6.A00);
                    return;
                }
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass000.A0k("Only TabItem instances can be added to TabLayout");
    }

    public int getSelectedTabPosition() {
        C136836uU r0 = this.A0X;
        if (r0 != null) {
            return r0.A00;
        }
        return -1;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i = this.A03;
        if ((i == 0 || i == 2) && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public void setInlineLabel(boolean z) {
        if (this.A0M != z) {
            this.A0M = z;
            int i = 0;
            while (true) {
                C110585gH r1 = this.A0f;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C110595gJ) {
                        C110595gJ r4 = (C110595gJ) childAt;
                        r4.setOrientation(r4.A0A.A0M ^ true ? 1 : 0);
                        TextView textView = r4.A04;
                        if (textView == null && r4.A02 == null) {
                            C110595gJ.A03(r4.A03, r4.A05, r4, true);
                        } else {
                            C110595gJ.A03(r4.A02, textView, r4, false);
                        }
                    }
                    i++;
                } else {
                    A02();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(C1606189f r3) {
        C1606189f r1 = this.A0W;
        if (r1 != null) {
            this.A0g.remove(r1);
        }
        this.A0W = r3;
        if (r3 != null) {
            C108985cd.A1I(r3, this.A0g);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable mutate = C27831Xu.A02(drawable).mutate();
        this.A0J = mutate;
        A05(mutate, this.A0Q);
        int i = this.A09;
        if (i == -1) {
            i = this.A0J.getIntrinsicHeight();
        }
        this.A0f.A02(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.A0Q = i;
        A05(this.A0J, i);
        A0J(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A08 != i) {
            this.A08 = i;
            this.A0f.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.A09 = i;
        this.A0f.A02(i);
    }

    public void setTabGravity(int i) {
        if (this.A05 != i) {
            this.A05 = i;
            A02();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0G != colorStateList) {
            this.A0G = colorStateList;
            ArrayList arrayList = this.A0h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C110595gJ r0 = ((C136836uU) arrayList.get(i)).A02;
                if (r0 != null) {
                    r0.A04();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.6us] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTabIndicatorAnimationMode(int r3) {
        /*
            r2 = this;
            r2.A07 = r3
            if (r3 == 0) goto L_0x0018
            r0 = 1
            if (r3 == r0) goto L_0x0012
            r0 = 2
            if (r3 != r0) goto L_0x001e
            X.5qo r0 = new X.5qo
            r0.<init>()
        L_0x000f:
            r2.A0L = r0
            return
        L_0x0012:
            X.5qn r0 = new X.5qn
            r0.<init>()
            goto L_0x000f
        L_0x0018:
            X.6us r0 = new X.6us
            r0.<init>()
            goto L_0x000f
        L_0x001e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r1.append(r3)
            java.lang.String r0 = " is not a valid TabIndicatorAnimationMode"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.setTabIndicatorAnimationMode(int):void");
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0N = z;
        C110585gH r1 = this.A0f;
        C110585gH.A01(r1, r1.A02.getSelectedTabPosition());
        r1.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.A03) {
            this.A03 = i;
            A02();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0H != colorStateList) {
            this.A0H = colorStateList;
            int i = 0;
            while (true) {
                C110585gH r1 = this.A0f;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C110595gJ) {
                        C110595gJ.A02(getContext(), (C110595gJ) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0I != colorStateList) {
            this.A0I = colorStateList;
            ArrayList arrayList = this.A0h;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C110595gJ r0 = ((C136836uU) arrayList.get(i)).A02;
                if (r0 != null) {
                    r0.A04();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0O != z) {
            this.A0O = z;
            int i = 0;
            while (true) {
                C110585gH r1 = this.A0f;
                if (i < r1.getChildCount()) {
                    View childAt = r1.getChildAt(i);
                    if (childAt instanceof C110595gJ) {
                        C110595gJ.A02(getContext(), (C110595gJ) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (!(this instanceof WaTabLayout) || viewPager == null || (viewPager instanceof WaViewPager)) {
            A06(viewPager, this, false);
            return;
        }
        throw AnonymousClass000.A0k("WaTabLayout should only be setup with WaViewPager");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TabLayout(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r8 = 2132084548(0x7f150744, float:1.980927E38)
            r0 = r18
            r12 = r19
            r15 = r20
            android.content.Context r0 = X.C27771Xm.A00(r0, r12, r15, r8)
            r2 = r17
            r2.<init>(r0, r12, r15)
            r6 = -1
            r2.A02 = r6
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A0h = r0
            r2.A04 = r6
            r1 = 0
            r2.A0Q = r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.A0A = r0
            r2.A09 = r6
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r2.A0g = r0
            r3 = 12
            X.1bS r0 = new X.1bS
            r0.<init>(r3)
            r2.A0e = r0
            android.content.Context r11 = r2.getContext()
            r2.setHorizontalScrollBarEnabled(r1)
            X.5gH r5 = new X.5gH
            r5.<init>(r11, r2)
            r2.A0f = r5
            r3 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r3, r6)
            super.addView(r5, r1, r0)
            int[] r13 = X.C27781Xn.A0h
            r4 = 1
            int[] r14 = new int[r4]
            r0 = 24
            r7 = 24
            r14[r1] = r0
            r16 = r8
            android.content.res.TypedArray r3 = X.C27791Xo.A00(r11, r12, r13, r14, r15, r16)
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.ColorDrawable
            if (r0 == 0) goto L_0x0089
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            android.graphics.drawable.ColorDrawable r0 = (android.graphics.drawable.ColorDrawable) r0
            X.1Xq r8 = new X.1Xq
            r8.<init>()
            int r0 = r0.getColor()
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r8.A0F(r0)
            r8.A0E(r11)
            float r0 = X.AnonymousClass1Xr.A00(r2)
            r8.A0C(r0)
            r2.setBackground(r8)
        L_0x0089:
            r0 = 5
            android.graphics.drawable.Drawable r0 = X.AnonymousClass1YT.A03(r11, r3, r0)
            r2.setSelectedTabIndicator((android.graphics.drawable.Drawable) r0)
            r0 = 8
            int r0 = r3.getColor(r0, r1)
            r2.setSelectedTabIndicatorColor(r0)
            r0 = 11
            int r0 = r3.getDimensionPixelSize(r0, r6)
            r5.A02(r0)
            r0 = 10
            int r0 = r3.getInt(r0, r1)
            r2.setSelectedTabIndicatorGravity(r0)
            r0 = 7
            int r0 = r3.getInt(r0, r1)
            r2.setTabIndicatorAnimationMode(r0)
            r0 = 9
            boolean r0 = r3.getBoolean(r0, r4)
            r2.setTabIndicatorFullWidth(r0)
            r0 = 16
            int r5 = r3.getDimensionPixelSize(r0, r1)
            r2.A0B = r5
            r2.A0C = r5
            r2.A0E = r5
            r2.A0D = r5
            r0 = 19
            int r0 = r3.getDimensionPixelSize(r0, r5)
            r2.A0D = r0
            r5 = 20
            int r0 = r2.A0E
            int r0 = r3.getDimensionPixelSize(r5, r0)
            r2.A0E = r0
            r5 = 18
            int r0 = r2.A0C
            int r0 = r3.getDimensionPixelSize(r5, r0)
            r2.A0C = r0
            r5 = 17
            int r0 = r2.A0B
            int r0 = r3.getDimensionPixelSize(r5, r0)
            r2.A0B = r0
            r0 = 2130970145(0x7f040621, float:1.7548992E38)
            boolean r5 = X.AnonymousClass1Z9.A03(r11, r0, r1)
            r0 = 2130971505(0x7f040b71, float:1.755175E38)
            if (r5 == 0) goto L_0x0100
            r0 = 2130971538(0x7f040b92, float:1.7551817E38)
        L_0x0100:
            r2.A0a = r0
            r0 = 2132083856(0x7f150490, float:1.9807866E38)
            int r9 = r3.getResourceId(r7, r0)
            r2.A0c = r9
            int[] r8 = X.C002501d.A0N
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r9, r8)
            int r0 = r5.getDimensionPixelSize(r1, r1)     // Catch:{ all -> 0x0213 }
            float r0 = (float) r0     // Catch:{ all -> 0x0213 }
            r2.A01 = r0     // Catch:{ all -> 0x0213 }
            r0 = 3
            r7 = 3
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r11, r5, r0)     // Catch:{ all -> 0x0213 }
            r2.A0I = r0     // Catch:{ all -> 0x0213 }
            r5.recycle()
            r0 = 22
            r5 = 22
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0133
            int r0 = r3.getResourceId(r5, r9)
            r2.A04 = r0
        L_0x0133:
            int r0 = r2.A04
            if (r0 == r6) goto L_0x016b
            android.content.res.TypedArray r9 = r11.obtainStyledAttributes(r0, r8)
            float r0 = r2.A01     // Catch:{ all -> 0x0163 }
            int r0 = (int) r0     // Catch:{ all -> 0x0163 }
            r9.getDimensionPixelSize(r1, r0)     // Catch:{ all -> 0x0163 }
            android.content.res.ColorStateList r10 = X.AnonymousClass1YT.A01(r11, r9, r7)     // Catch:{ all -> 0x0163 }
            if (r10 == 0) goto L_0x0168
            android.content.res.ColorStateList r0 = r2.A0I     // Catch:{ all -> 0x0163 }
            int r8 = r0.getDefaultColor()     // Catch:{ all -> 0x0163 }
            int[] r5 = new int[r4]     // Catch:{ all -> 0x0163 }
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            r5[r1] = r0     // Catch:{ all -> 0x0163 }
            int r0 = r10.getDefaultColor()     // Catch:{ all -> 0x0163 }
            int r0 = r10.getColorForState(r5, r0)     // Catch:{ all -> 0x0163 }
            android.content.res.ColorStateList r0 = A01(r8, r0)     // Catch:{ all -> 0x0163 }
            r2.A0I = r0     // Catch:{ all -> 0x0163 }
            goto L_0x0168
        L_0x0163:
            r0 = move-exception
            r9.recycle()
            throw r0
        L_0x0168:
            r9.recycle()
        L_0x016b:
            r0 = 25
            r5 = 25
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x017b
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r11, r3, r5)
            r2.A0I = r0
        L_0x017b:
            r0 = 23
            r5 = 23
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0195
            int r5 = r3.getColor(r5, r1)
            android.content.res.ColorStateList r0 = r2.A0I
            int r0 = r0.getDefaultColor()
            android.content.res.ColorStateList r0 = A01(r0, r5)
            r2.A0I = r0
        L_0x0195:
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r11, r3, r7)
            r2.A0G = r0
            r0 = 4
            r3.getInt(r0, r6)
            r0 = 21
            android.content.res.ColorStateList r0 = X.AnonymousClass1YT.A01(r11, r3, r0)
            r2.A0H = r0
            r5 = 6
            r0 = 300(0x12c, float:4.2E-43)
            int r0 = r3.getInt(r5, r0)
            r2.A06 = r0
            r5 = 2130970548(0x7f0407b4, float:1.754981E38)
            android.animation.TimeInterpolator r0 = X.AnonymousClass1YW.A02
            android.animation.TimeInterpolator r0 = X.C29101bc.A01(r0, r11, r5)
            r2.A0d = r0
            r0 = 14
            int r0 = r3.getDimensionPixelSize(r0, r6)
            r2.A0j = r0
            r0 = 13
            int r0 = r3.getDimensionPixelSize(r0, r6)
            r2.A0i = r0
            int r0 = r3.getResourceId(r1, r1)
            r2.A0b = r0
            int r0 = r3.getDimensionPixelSize(r4, r1)
            r2.A0P = r0
            r0 = 15
            int r0 = r3.getInt(r0, r4)
            r2.A03 = r0
            r0 = 2
            int r0 = r3.getInt(r0, r1)
            r2.A05 = r0
            r0 = 12
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0M = r0
            r0 = 26
            boolean r0 = r3.getBoolean(r0, r1)
            r2.A0O = r0
            r3.recycle()
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131166445(0x7f0704ed, float:1.7947136E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            r2.A00 = r0
            r0 = 2131166443(0x7f0704eb, float:1.7947131E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.A0k = r0
            r2.A02()
            return
        L_0x0213:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void A05(Drawable drawable, int i) {
        boolean A1O = AnonymousClass000.A1O(i);
        if (Build.VERSION.SDK_INT == 21) {
            if (A1O) {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            } else {
                drawable.setColorFilter((ColorFilter) null);
            }
        } else if (A1O) {
            C27831Xu.A0C(drawable, i);
        } else {
            C27831Xu.A03((ColorStateList) null, drawable);
        }
    }

    public void A09() {
        int currentItem;
        A0A();
        AnonymousClass1b8 r0 = this.A0T;
        if (r0 != null) {
            int A0E2 = r0.A0E();
            for (int i = 0; i < A0E2; i++) {
                C136836uU A072 = A07();
                A072.A02(this.A0T.A0C(i));
                A0H(A072, C108945cZ.A07(this), false);
            }
            ViewPager viewPager = this.A0K;
            if (viewPager != null && A0E2 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < C108945cZ.A07(this)) {
                A0G(A08(currentItem));
            }
        }
    }

    public int getTabCount() {
        return C108945cZ.A07(this);
    }

    public int getTabGravity() {
        return this.A05;
    }

    public ColorStateList getTabIconTint() {
        return this.A0G;
    }

    public int getTabIndicatorAnimationMode() {
        return this.A07;
    }

    public int getTabIndicatorGravity() {
        return this.A08;
    }

    public int getTabMaxWidth() {
        return this.A0A;
    }

    public int getTabMode() {
        return this.A03;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0H;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0J;
    }

    public ColorStateList getTabTextColors() {
        return this.A0I;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C27811Xs.A01(this);
        if (this.A0K == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A06((ViewPager) parent, this, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A0Z) {
            setupWithViewPager((ViewPager) null);
            this.A0Z = false;
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C26228CvK(accessibilityNodeInfo).A0Z(C25475CgU.A00(1, C108945cZ.A07(this), 1, false));
    }

    public void onMeasure(int i, int i2) {
        int round = Math.round(AnonymousClass1YU.A00(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(C108985cd.A06(this, round), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0i;
            if (i3 <= 0) {
                i3 = (int) (((float) size) - AnonymousClass1YU.A00(getContext(), 56));
            }
            this.A0A = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A03;
            if (i4 != 0) {
                if (i4 == 1) {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                } else if (i4 != 2) {
                    return;
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        if (motionEvent.getActionMasked() != 8 || (i = this.A03) == 0 || i == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C27811Xs.A02(this, f);
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A03();
        this.A0R.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C19740yt.A03(getContext(), i));
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C19740yt.A03(getContext(), i));
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public boolean shouldDelayChildPressedState() {
        return AnonymousClass000.A1R(getTabScrollRange());
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971474);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw AnonymousClass000.A0k("Only TabItem instances can be added to TabLayout");
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(AnonymousClass8B5 r1) {
        setOnTabSelectedListener((C1606189f) r1);
    }

    public void setSelectedTabIndicator(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass03S.A01(getContext(), i);
        } else {
            drawable = null;
        }
        setSelectedTabIndicator(drawable);
    }

    public TabLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void addView(View view, int i) {
        throw AnonymousClass000.A0k("Only TabItem instances can be added to TabLayout");
    }

    public void addView(View view) {
        throw AnonymousClass000.A0k("Only TabItem instances can be added to TabLayout");
    }
}
