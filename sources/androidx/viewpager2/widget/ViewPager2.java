package androidx.viewpager2.widget;

import X.A7Y;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass3MW;
import X.AnonymousClass7RP;
import X.BE6;
import X.BE9;
import X.BHN;
import X.BLl;
import X.BLs;
import X.BMH;
import X.BMO;
import X.C001100p;
import X.C113705na;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C21466AkX;
import X.C22704BLo;
import X.C22718BMf;
import X.C22719BMg;
import X.C22720BMh;
import X.C22721BMi;
import X.C24902COv;
import X.C24903COw;
import X.C25076CWl;
import X.C25475CgU;
import X.C26228CvK;
import X.C26629D6z;
import X.C37911qO;
import X.C37961qT;
import X.C38251qy;
import X.C38391rD;
import X.C65012vh;
import X.C6T;
import X.C72453Mb;
import X.CEE;
import X.E0N;
import X.E0O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Iterator;
import java.util.List;

public final class ViewPager2 extends ViewGroup {
    public int A00;
    public int A01 = -1;
    public LinearLayoutManager A02;
    public C37911qO A03 = new C22718BMf(this, 0);
    public RecyclerView A04;
    public C22721BMi A05 = new C22721BMi();
    public BMH A06;
    public C25076CWl A07;
    public boolean A08 = false;
    public boolean A09 = true;
    public int A0A = -1;
    public Parcelable A0B;
    public C113705na A0C;
    public C37961qT A0D = null;
    public C22721BMi A0E;
    public C24902COv A0F;
    public C22720BMh A0G;
    public boolean A0H = false;
    public final Rect A0I = AnonymousClass3MW.A07();
    public final Rect A0J = AnonymousClass3MW.A07();

    public void setCurrentItem(int i) {
        A03(i, true);
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.A01 = i;
            this.A04.requestLayout();
            return;
        }
        throw AnonymousClass000.A0k("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setPageTransformer(E0O e0o) {
        boolean z = this.A0H;
        if (e0o != null) {
            if (!z) {
                this.A0D = this.A04.A0C;
                this.A0H = true;
            }
            this.A04.setItemAnimator((C37961qT) null);
            this.A0G.A00 = e0o;
        } else if (z) {
            this.A04.setItemAnimator(this.A0D);
            this.A0D = null;
            this.A0H = false;
        }
    }

    private void A00() {
        C38391rD r6;
        int length;
        int length2;
        if (this.A0A != -1 && (r6 = this.A04.A0B) != null) {
            Parcelable parcelable = this.A0B;
            if (parcelable != null) {
                if (r6 instanceof E0N) {
                    BLs bLs = (BLs) ((E0N) r6);
                    C001100p r8 = bLs.A05;
                    if (r8.A00() == 0) {
                        C001100p r4 = bLs.A03;
                        if (r4.A00() == 0) {
                            Bundle bundle = (Bundle) parcelable;
                            if (bundle.getClassLoader() == null) {
                                bundle.setClassLoader(bLs.getClass().getClassLoader());
                            }
                            Iterator<String> it = bundle.keySet().iterator();
                            while (it.hasNext()) {
                                String A0v = C17880vN.A0v(it);
                                if (A0v.startsWith("f#") && A0v.length() > (length2 = "f#".length())) {
                                    r4.A0A(Long.parseLong(A0v.substring(length2)), bLs.A06.A0P(bundle, A0v));
                                } else if (!A0v.startsWith("s#") || A0v.length() <= (length = "s#".length())) {
                                    StringBuilder A10 = AnonymousClass000.A10();
                                    A10.append("Unexpected key in savedState: ");
                                    throw AnonymousClass001.A12(A0v, A10);
                                } else {
                                    long parseLong = Long.parseLong(A0v.substring(length));
                                    Parcelable parcelable2 = bundle.getParcelable(A0v);
                                    if (bLs.A0X(parseLong)) {
                                        r8.A0A(parseLong, parcelable2);
                                    }
                                }
                            }
                            if (r4.A00() != 0) {
                                bLs.A00 = true;
                                bLs.A01 = true;
                                bLs.A0V();
                                Handler A0D2 = C17890vO.A0D();
                                C21466AkX akX = new C21466AkX((Object) bLs, 17);
                                bLs.A07.A05(new C65012vh(A0D2, bLs, akX, 1));
                                A0D2.postDelayed(akX, 10000);
                            }
                        }
                    }
                    throw AnonymousClass000.A0n("Expected the adapter to be 'fresh' while restoring state.");
                }
                this.A0B = null;
            }
            int max = Math.max(0, Math.min(this.A0A, r6.A0Q() - 1));
            this.A00 = max;
            this.A0A = -1;
            this.A04.A0f(max);
            this.A07.A00();
        }
    }

    private void A01(Context context, AttributeSet attributeSet) {
        this.A07 = new C25076CWl(this);
        BMO bmo = new BMO(context, this);
        this.A04 = bmo;
        bmo.setId(View.generateViewId());
        this.A04.setDescendantFocusability(A7Y.A0F);
        BLl bLl = new BLl(context, this);
        this.A02 = bLl;
        this.A04.setLayoutManager(bLl);
        this.A04.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.A04.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        RecyclerView recyclerView = this.A04;
        C26629D6z d6z = new C26629D6z(this);
        List list = recyclerView.A0K;
        if (list == null) {
            list = AnonymousClass000.A13();
            recyclerView.A0K = list;
        }
        list.add(d6z);
        BMH bmh = new BMH(this);
        this.A06 = bmh;
        RecyclerView recyclerView2 = this.A04;
        this.A0F = new C24902COv(recyclerView2, bmh, this);
        C22704BLo bLo = new C22704BLo(this);
        this.A0C = bLo;
        bLo.A08(recyclerView2);
        this.A04.A0t(this.A06);
        C22721BMi bMi = new C22721BMi();
        this.A0E = bMi;
        this.A06.A05 = bMi;
        C22719BMg bMg = new C22719BMg(this, 1);
        C22719BMg bMg2 = new C22719BMg(this, 2);
        bMi.A00.add(bMg);
        this.A0E.A00.add(bMg2);
        C25076CWl cWl = this.A07;
        this.A04.setImportantForAccessibility(2);
        cWl.A00 = new C22718BMf(cWl, 1);
        ViewPager2 viewPager2 = cWl.A04;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
        C22721BMi bMi2 = this.A0E;
        bMi2.A00.add(this.A05);
        C22720BMh bMh = new C22720BMh(this.A02);
        this.A0G = bMh;
        this.A0E.A00.add(bMh);
        RecyclerView recyclerView3 = this.A04;
        attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = CEE.A00;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context2, iArr, attributeSet2, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void A02() {
        C113705na r1 = this.A0C;
        if (r1 != null) {
            View A052 = r1.A05(this.A02);
            if (A052 != null) {
                int A022 = C38251qy.A02(A052);
                if (A022 != this.A00 && this.A06.A02 == 0) {
                    this.A0E.A01(A022);
                }
                this.A08 = false;
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Design assumption violated.");
    }

    public void A03(int i, boolean z) {
        C6T c6t;
        C38391rD r3 = this.A04.A0B;
        if (r3 == null) {
            if (this.A0A != -1) {
                this.A0A = Math.max(i, 0);
            }
        } else if (r3.A0Q() > 0) {
            int min = Math.min(Math.max(i, 0), r3.A0Q() - 1);
            int i2 = this.A00;
            if (min != i2 || this.A06.A02 != 0) {
                if (min != i2 || !z) {
                    double d = (double) i2;
                    this.A00 = min;
                    this.A07.A00();
                    BMH bmh = this.A06;
                    if (bmh.A02 != 0) {
                        BMH.A01(bmh);
                        C24903COw cOw = bmh.A04;
                        d = ((double) cOw.A02) + ((double) cOw.A00);
                    }
                    BMH bmh2 = this.A06;
                    int i3 = 3;
                    if (z) {
                        i3 = 2;
                    }
                    bmh2.A00 = i3;
                    boolean z2 = false;
                    if (bmh2.A03 != min) {
                        z2 = true;
                    }
                    bmh2.A03 = min;
                    BMH.A02(bmh2, 2);
                    if (z2 && (c6t = bmh2.A05) != null) {
                        c6t.A01(min);
                    }
                    if (!z) {
                        this.A04.A0f(min);
                        return;
                    }
                    double d2 = (double) min;
                    int i4 = (BE6.A01(d2, d) > 3.0d ? 1 : (BE6.A01(d2, d) == 3.0d ? 0 : -1));
                    RecyclerView recyclerView = this.A04;
                    if (i4 > 0) {
                        int i5 = min + 3;
                        if (d2 > d) {
                            i5 = min - 3;
                        }
                        recyclerView.A0f(i5);
                        RecyclerView recyclerView2 = this.A04;
                        recyclerView2.post(new AnonymousClass7RP(recyclerView2, min, 0));
                        return;
                    }
                    recyclerView.A0g(min);
                }
            }
        }
    }

    public void A04(C6T c6t) {
        this.A05.A00.add(c6t);
    }

    public boolean canScrollHorizontally(int i) {
        return this.A04.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.A04.canScrollVertically(i);
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public C38391rD getAdapter() {
        return this.A04.A0B;
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getItemDecorationCount() {
        return this.A04.A11.size();
    }

    public int getOffscreenPageLimit() {
        return this.A01;
    }

    public int getOrientation() {
        return this.A02.A01;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.A04;
        if (this.A02.A01 == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.A06.A02;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        Rect rect = this.A0J;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.A0I;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.A04.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.A08) {
            A02();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.A04, i, i2);
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        int measuredState = this.A04.getMeasuredState();
        int A0C2 = measuredWidth + C72453Mb.A0C(this);
        int A082 = measuredHeight + BE9.A08(this);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(A0C2, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(A082, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BHN)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BHN bhn = (BHN) parcelable;
        super.onRestoreInstanceState(bhn.getSuperState());
        this.A0A = bhn.A00;
        this.A0B = bhn.A02;
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2;
        C25076CWl cWl = this.A07;
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ViewPager2 viewPager2 = cWl.A04;
        int i3 = viewPager2.A00;
        if (i == 8192) {
            i2 = i3 - 1;
        } else {
            i2 = i3 + 1;
        }
        if (!viewPager2.A09) {
            return true;
        }
        viewPager2.A03(i2, true);
        return true;
    }

    public void setAdapter(C38391rD r4) {
        C38391rD r2 = this.A04.A0B;
        C25076CWl cWl = this.A07;
        if (r2 != null) {
            r2.A01.unregisterObserver(cWl.A00);
            r2.A01.unregisterObserver(this.A03);
        }
        this.A04.setAdapter(r4);
        this.A00 = 0;
        A00();
        C25076CWl cWl2 = this.A07;
        cWl2.A00();
        if (r4 != null) {
            r4.CDq(cWl2.A00);
            r4.CDq(this.A03);
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.A09 = z;
        this.A07.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01(context, attributeSet);
    }

    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof BHN) {
            int i = ((BHN) parcelable).A01;
            sparseArray.put(this.A04.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        A00();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int A0Q;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.A07.A04;
        C38391rD r2 = viewPager2.A04.A0B;
        if (r2 != null) {
            int i3 = viewPager2.A02.A01;
            i = r2.A0Q();
            if (i3 != 1) {
                i2 = i;
                i = 0;
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        new C26228CvK(accessibilityNodeInfo).A0Z(C25475CgU.A00(i, i2, 0, false));
        C38391rD r0 = viewPager2.A04.A0B;
        if (r0 != null && (A0Q = r0.A0Q()) != 0 && viewPager2.A09) {
            if (viewPager2.A00 > 0) {
                accessibilityNodeInfo.addAction(DefaultCrypto.BUFFER_SIZE);
            }
            if (viewPager2.A00 < A0Q - 1) {
                accessibilityNodeInfo.addAction(ZipDecompressor.UNZIP_BUFFER_SIZE);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.os.Bundle} */
    /* JADX WARNING: type inference failed for: r8v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, X.BHN] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r12 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            X.BHN r8 = new X.BHN
            r8.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r12.A04
            int r0 = r0.getId()
            r8.A01 = r0
            int r1 = r12.A0A
            r0 = -1
            if (r1 != r0) goto L_0x0018
            int r1 = r12.A00
        L_0x0018:
            r8.A00 = r1
            android.os.Parcelable r7 = r12.A0B
            if (r7 != 0) goto L_0x008e
            androidx.recyclerview.widget.RecyclerView r0 = r12.A04
            X.1rD r6 = r0.A0B
            boolean r0 = r6 instanceof X.E0N
            if (r0 == 0) goto L_0x0090
            X.E0N r6 = (X.E0N) r6
            X.BLs r6 = (X.BLs) r6
            X.00p r11 = r6.A03
            int r1 = r11.A00()
            X.00p r5 = r6.A05
            int r0 = r5.A00()
            int r1 = r1 + r0
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>(r1)
            r4 = 0
            r10 = 0
        L_0x003e:
            int r0 = r11.A00()
            if (r10 >= r0) goto L_0x0068
            long r0 = r11.A02(r10)
            java.lang.Object r9 = r11.A05(r0)
            androidx.fragment.app.Fragment r9 = (androidx.fragment.app.Fragment) r9
            if (r9 == 0) goto L_0x0065
            boolean r2 = r9.A1b()
            if (r2 == 0) goto L_0x0065
            java.lang.String r3 = "f#"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C17890vO.A0a(r3, r2, r0)
            X.1GP r0 = r6.A06
            r0.A0e(r7, r9, r1)
        L_0x0065:
            int r10 = r10 + 1
            goto L_0x003e
        L_0x0068:
            int r0 = r5.A00()
            if (r4 >= r0) goto L_0x008e
            long r2 = r5.A02(r4)
            boolean r0 = r6.A0X(r2)
            if (r0 == 0) goto L_0x008b
            java.lang.String r1 = "s#"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C17890vO.A0a(r1, r0, r2)
            java.lang.Object r0 = r5.A05(r2)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r7.putParcelable(r1, r0)
        L_0x008b:
            int r4 = r4 + 1
            goto L_0x0068
        L_0x008e:
            r8.A02 = r7
        L_0x0090:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onSaveInstanceState():android.os.Parcelable");
    }

    public void onViewAdded(View view) {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0a(this, A10);
        throw AnonymousClass000.A0o(" does not support direct child views", A10);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.A07.A00();
    }

    public ViewPager2(Context context) {
        super(context);
        A01(context, (AttributeSet) null);
    }

    public void setOrientation(int i) {
        this.A02.A1Z(i);
        this.A07.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01(context, attributeSet);
    }
}
