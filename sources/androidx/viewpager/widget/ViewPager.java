package androidx.viewpager.widget;

import X.AnonymousClass1HF;
import X.AnonymousClass1XS;
import X.AnonymousClass1XT;
import X.AnonymousClass1XV;
import X.AnonymousClass1b8;
import X.AnonymousClass27g;
import X.AnonymousClass3D1;
import X.AnonymousClass3KE;
import X.C142677Aj;
import X.C23521Gp;
import X.C24261Jm;
import X.C27741Xj;
import X.C28881bD;
import X.C37811qA;
import X.C449025f;
import X.C64092uD;
import X.C64912vX;
import X.C71963Ka;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager extends ViewGroup {
    public static final int[] A0p = {16842931};
    public static final Interpolator A0q = new C64092uD(1);
    public static final AnonymousClass1XS A0r = new Object();
    public static final Comparator A0s = new AnonymousClass3D1(1);
    public float A00 = -3.4028235E38f;
    public float A01 = Float.MAX_VALUE;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07 = 1;
    public int A08;
    public int A09;
    public VelocityTracker A0A;
    public AnonymousClass1b8 A0B;
    public C23521Gp A0C;
    public C71963Ka A0D;
    public List A0E;
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public float A0J;
    public float A0K;
    public float A0L;
    public float A0M;
    public int A0N = -1;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V = -1;
    public int A0W = 0;
    public int A0X;
    public int A0Y;
    public Drawable A0Z;
    public Parcelable A0a = null;
    public EdgeEffect A0b;
    public EdgeEffect A0c;
    public C28881bD A0d;
    public ClassLoader A0e = null;
    public ArrayList A0f;
    public boolean A0g;
    public boolean A0h = true;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final ArrayList A0l = new ArrayList();
    public final Rect A0m = new Rect();
    public final AnonymousClass1XT A0n = new Object();
    public final Runnable A0o = new C449025f((Object) this, 7);
    public Scroller mScroller;

    public @interface DecorView {
    }

    private boolean A08() {
        this.A0N = -1;
        this.A0G = false;
        this.A0I = false;
        VelocityTracker velocityTracker = this.A0A;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A0A = null;
        }
        this.A0b.onRelease();
        this.A0c.onRelease();
        if (this.A0b.isFinished() || this.A0c.isFinished()) {
            return true;
        }
        return false;
    }

    public AnonymousClass1XT A0B(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0l;
            if (i2 >= arrayList.size()) {
                return null;
            }
            AnonymousClass1XT r1 = (AnonymousClass1XT) arrayList.get(i2);
            if (r1.A02 == i) {
                return r1;
            }
            i2++;
        }
    }

    public AnonymousClass1XT A0D(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0l;
            if (i >= arrayList.size()) {
                return null;
            }
            AnonymousClass1XT r2 = (AnonymousClass1XT) arrayList.get(i);
            if (this.A0B.A0H(view, r2.A03)) {
                return r2;
            }
            i++;
        }
    }

    public void A0F() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, A0q);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0Y = viewConfiguration.getScaledPagingTouchSlop();
        this.A06 = (int) (400.0f * f);
        this.A0U = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0b = new EdgeEffect(context);
        this.A0c = new EdgeEffect(context);
        this.A04 = (int) (25.0f * f);
        this.A0Q = (int) (2.0f * f);
        this.A0S = (int) (f * 16.0f);
        AnonymousClass1HF.A0f(this, new AnonymousClass1XV(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AnonymousClass1HF.A0h(this, new C64912vX(this));
    }

    public void A0J(int i, boolean z) {
        this.A0j = false;
        A0I(i, 0, z, false);
    }

    public void A0L(C71963Ka r7, boolean z) {
        int i = 1;
        boolean z2 = false;
        if (r7 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (this.A0D != null) {
            z3 = true;
        }
        boolean z4 = false;
        if (z2 != z3) {
            z4 = true;
        }
        this.A0D = r7;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i = 2;
            }
            this.A03 = i;
            this.A09 = 2;
        } else {
            this.A03 = 0;
        }
        if (z4) {
            A0G(this.A02);
        }
    }

    public void addTouchables(ArrayList arrayList) {
        AnonymousClass1XT A0D2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A0D2 = A0D(childAt)) != null && A0D2.A02 == this.A02) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void computeScroll() {
        this.A0H = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            A07(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!A0A(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r1 == 80) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b7, code lost:
        if (r5 == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r16, int r17) {
        /*
            r15 = this;
            r0 = 0
            r1 = r16
            int r1 = android.view.View.getDefaultSize(r0, r1)
            r2 = r17
            int r0 = android.view.View.getDefaultSize(r0, r2)
            r15.setMeasuredDimension(r1, r0)
            int r8 = r15.getMeasuredWidth()
            int r1 = r8 / 10
            int r0 = r15.A0S
            int r0 = java.lang.Math.min(r1, r0)
            r15.A05 = r0
            int r0 = r15.getPaddingLeft()
            int r8 = r8 - r0
            int r0 = r15.getPaddingRight()
            int r8 = r8 - r0
            int r4 = r15.getMeasuredHeight()
            int r0 = r15.getPaddingTop()
            int r4 = r4 - r0
            int r0 = r15.getPaddingBottom()
            int r4 = r4 - r0
            int r3 = r15.getChildCount()
            r2 = 0
        L_0x003b:
            r7 = 8
            r5 = 1
            r6 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r3) goto L_0x00ba
            android.view.View r9 = r15.getChildAt(r2)
            int r0 = r9.getVisibility()
            if (r0 == r7) goto L_0x00a1
            android.view.ViewGroup$LayoutParams r12 = r9.getLayoutParams()
            X.1qA r12 = (X.C37811qA) r12
            if (r12 == 0) goto L_0x00a1
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x00a1
            int r0 = r12.A02
            r7 = r0 & 7
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x0067
            r0 = 80
            r14 = 0
            if (r1 != r0) goto L_0x0068
        L_0x0067:
            r14 = 1
        L_0x0068:
            r0 = 3
            if (r7 == r0) goto L_0x006f
            r0 = 5
            if (r7 == r0) goto L_0x006f
            r5 = 0
        L_0x006f:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r14 == 0) goto L_0x00b5
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x0075:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0077:
            int r0 = r12.width
            r10 = -1
            r7 = -2
            if (r0 == r7) goto L_0x00b3
            int r0 = r12.width
            if (r0 == r10) goto L_0x00b1
            int r1 = r12.width
        L_0x0083:
            r11 = 1073741824(0x40000000, float:2.0)
        L_0x0085:
            int r0 = r12.height
            if (r0 == r7) goto L_0x00ae
            int r0 = r12.height
            if (r0 == r10) goto L_0x00ac
            int r0 = r12.height
        L_0x008f:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r11)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            r9.measure(r1, r0)
            if (r14 == 0) goto L_0x00a4
            int r0 = r9.getMeasuredHeight()
            int r4 = r4 - r0
        L_0x00a1:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x00a4:
            if (r5 == 0) goto L_0x00a1
            int r0 = r9.getMeasuredWidth()
            int r8 = r8 - r0
            goto L_0x00a1
        L_0x00ac:
            r0 = r4
            goto L_0x008f
        L_0x00ae:
            r0 = r4
            r6 = r13
            goto L_0x008f
        L_0x00b1:
            r1 = r8
            goto L_0x0083
        L_0x00b3:
            r1 = r8
            goto L_0x0085
        L_0x00b5:
            r13 = 1073741824(0x40000000, float:2.0)
            if (r5 != 0) goto L_0x0077
            goto L_0x0075
        L_0x00ba:
            android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r6)
            r15.A0P = r0
            r15.A0i = r5
            int r0 = r15.A02
            r15.A0G(r0)
            r5 = 0
            r15.A0i = r5
            int r4 = r15.getChildCount()
        L_0x00d1:
            if (r5 >= r4) goto L_0x00fa
            android.view.View r3 = r15.getChildAt(r5)
            int r0 = r3.getVisibility()
            if (r0 == r7) goto L_0x00f7
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.1qA r2 = (X.C37811qA) r2
            if (r2 == 0) goto L_0x00e9
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x00f7
        L_0x00e9:
            float r1 = (float) r8
            float r0 = r2.A00
            float r1 = r1 * r0
            int r0 = (int) r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r6)
            int r0 = r15.A0P
            r3.measure(r1, r0)
        L_0x00f7:
            int r5 = r5 + 1
            goto L_0x00d1
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r2 = 1
            int r0 = r8.getAction()
            r3 = 0
            if (r0 != 0) goto L_0x000f
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            X.1b8 r0 = r7.A0B
            if (r0 == 0) goto L_0x000e
            int r0 = r0.A0E()
            if (r0 == 0) goto L_0x000e
            android.view.VelocityTracker r0 = r7.A0A
            if (r0 != 0) goto L_0x0023
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A0A = r0
        L_0x0023:
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r1 = r0 & 255(0xff, float:3.57E-43)
            if (r1 == 0) goto L_0x015d
            if (r1 == r2) goto L_0x00bc
            r0 = 2
            if (r1 == r0) goto L_0x004c
            r0 = 3
            if (r1 == r0) goto L_0x014a
            r0 = 5
            if (r1 == r0) goto L_0x017e
            r0 = 6
            if (r1 != r0) goto L_0x004b
            r7.A06(r8)
            int r0 = r7.A0N
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getX(r0)
            r7.A0L = r0
        L_0x004b:
            return r2
        L_0x004c:
            boolean r0 = r7.A0G
            if (r0 != 0) goto L_0x00a6
            int r0 = r7.A0N
            int r1 = r8.findPointerIndex(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0153
            float r5 = r8.getX(r1)
            float r0 = r7.A0L
            float r0 = r5 - r0
            float r3 = java.lang.Math.abs(r0)
            float r4 = r8.getY(r1)
            float r0 = r7.A0M
            float r0 = r4 - r0
            float r1 = java.lang.Math.abs(r0)
            int r0 = r7.A0Y
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            r7.A0G = r2
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x0087
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x0087:
            float r3 = r7.A0J
            float r5 = r5 - r3
            r0 = 0
            int r1 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            int r0 = r7.A0Y
            float r0 = (float) r0
            if (r1 <= 0) goto L_0x00ba
            float r3 = r3 + r0
        L_0x0093:
            r7.A0L = r3
            r7.A0M = r4
            r7.setScrollState(r2)
            r7.setScrollingCacheEnabled(r2)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00a6
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00a6:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x004b
            int r0 = r7.A0N
            int r0 = r8.findPointerIndex(r0)
            float r0 = r8.getX(r0)
            boolean r0 = r7.A09(r0)
            goto L_0x0157
        L_0x00ba:
            float r3 = r3 - r0
            goto L_0x0093
        L_0x00bc:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x004b
            android.view.VelocityTracker r3 = r7.A0A
            int r0 = r7.A0U
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r3.computeCurrentVelocity(r0, r1)
            int r0 = r7.A0N
            float r0 = r3.getXVelocity(r0)
            int r3 = (int) r0
            r7.A0j = r2
            int r4 = r7.getClientWidth()
            int r5 = r7.getScrollX()
            X.1XT r6 = r7.A01()
            int r0 = r7.A08
            float r1 = (float) r0
            float r0 = (float) r4
            float r1 = r1 / r0
            int r4 = r6.A02
            float r5 = (float) r5
            float r5 = r5 / r0
            float r0 = r6.A00
            float r5 = r5 - r0
            float r0 = r6.A01
            float r0 = r0 + r1
            float r5 = r5 / r0
            int r0 = r7.A0N
            int r0 = r8.findPointerIndex(r0)
            float r1 = r8.getX(r0)
            float r0 = r7.A0J
            float r1 = r1 - r0
            int r0 = (int) r1
            int r1 = java.lang.Math.abs(r0)
            int r0 = r7.A04
            if (r1 <= r0) goto L_0x013c
            int r1 = java.lang.Math.abs(r3)
            int r0 = r7.A06
            if (r1 <= r0) goto L_0x013c
            if (r3 > 0) goto L_0x0111
            int r4 = r4 + 1
        L_0x0111:
            java.util.ArrayList r5 = r7.A0l
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0138
            r0 = 0
            java.lang.Object r1 = r5.get(r0)
            X.1XT r1 = (X.AnonymousClass1XT) r1
            int r0 = r5.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r5.get(r0)
            X.1XT r0 = (X.AnonymousClass1XT) r0
            int r1 = r1.A02
            int r0 = r0.A02
            int r0 = java.lang.Math.min(r4, r0)
            int r4 = java.lang.Math.max(r1, r0)
        L_0x0138:
            r7.A0I(r4, r3, r2, r2)
            goto L_0x0153
        L_0x013c:
            int r1 = r7.A02
            r0 = 1058642330(0x3f19999a, float:0.6)
            if (r4 < r1) goto L_0x0146
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0146:
            float r5 = r5 + r0
            int r0 = (int) r5
            int r4 = r4 + r0
            goto L_0x0111
        L_0x014a:
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x004b
            int r0 = r7.A02
            r7.A05(r0, r3, r2, r3)
        L_0x0153:
            boolean r0 = r7.A08()
        L_0x0157:
            if (r0 == 0) goto L_0x004b
            r7.postInvalidateOnAnimation()
            return r2
        L_0x015d:
            android.widget.Scroller r0 = r7.mScroller
            r0.abortAnimation()
            r7.A0j = r3
            int r0 = r7.A02
            r7.A0G(r0)
            float r0 = r8.getX()
            r7.A0J = r0
            r7.A0L = r0
            float r0 = r8.getY()
            r7.A0K = r0
            r7.A0M = r0
            int r0 = r8.getPointerId(r3)
            goto L_0x018c
        L_0x017e:
            int r1 = r8.getActionIndex()
            float r0 = r8.getX(r1)
            r7.A0L = r0
            int r0 = r8.getPointerId(r1)
        L_0x018c:
            r7.A0N = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentItem(int i) {
        this.A0j = false;
        A0I(i, 0, !this.A0h, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.A07) {
            this.A07 = i;
            A0G(this.A02);
        }
    }

    private Rect A00(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view != null) {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            int bottom = view.getBottom();
            while (true) {
                rect.bottom = bottom;
                ViewParent parent = view.getParent();
                if (!(parent instanceof ViewGroup) || parent == this) {
                    break;
                }
                view = (View) parent;
                rect.left += view.getLeft();
                rect.right += view.getRight();
                rect.top += view.getTop();
                bottom = rect.bottom + view.getBottom();
            }
        } else {
            rect.set(0, 0, 0, 0);
        }
        return rect;
    }

    private void A02() {
        if (this.A03 != 0) {
            ArrayList arrayList = this.A0f;
            if (arrayList == null) {
                this.A0f = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.A0f.add(getChildAt(i));
            }
            Collections.sort(this.A0f, A0r);
        }
    }

    private void A03(int i) {
        C23521Gp r0 = this.A0C;
        if (r0 != null) {
            r0.Bzy(i);
        }
        List list = this.A0F;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C23521Gp r02 = (C23521Gp) this.A0F.get(i2);
                if (r02 != null) {
                    r02.Bzy(i);
                }
            }
        }
    }

    private void A04(int i, int i2, int i3, int i4) {
        int i5;
        float f;
        if (i2 <= 0 || this.A0l.isEmpty()) {
            AnonymousClass1XT A0B2 = A0B(this.A02);
            if (A0B2 != null) {
                f = Math.min(A0B2.A00, this.A01);
            } else {
                f = 0.0f;
            }
            i5 = (int) (f * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (i5 != getScrollX()) {
                A07(false);
            } else {
                return;
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            i5 = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(i5, getScrollY());
    }

    private void A07(boolean z) {
        boolean z2 = false;
        if (this.A0W == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A0A(currX);
                    }
                }
            }
        }
        this.A0j = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0l;
            if (i >= arrayList.size()) {
                break;
            }
            AnonymousClass1XT r1 = (AnonymousClass1XT) arrayList.get(i);
            if (r1.A04) {
                r1.A04 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.A0o;
            if (z) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private boolean A09(float f) {
        boolean z;
        boolean z2;
        this.A0L = f;
        float scrollX = ((float) getScrollX()) + (this.A0L - f);
        float clientWidth = (float) getClientWidth();
        float f2 = clientWidth * this.A00;
        float f3 = clientWidth * this.A01;
        ArrayList arrayList = this.A0l;
        boolean z3 = false;
        AnonymousClass1XT r1 = (AnonymousClass1XT) arrayList.get(0);
        AnonymousClass1XT r8 = (AnonymousClass1XT) arrayList.get(arrayList.size() - 1);
        if (r1.A02 != 0) {
            f2 = r1.A00 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (r8.A02 != this.A0B.A0E() - 1) {
            f3 = r8.A00 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.A0b.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.A0c.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.A0L += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        A0A(i);
        return z3;
    }

    private boolean A0A(int i) {
        if (this.A0l.size() == 0) {
            if (!this.A0h) {
                this.A0g = false;
                A0H(0, 0.0f, 0);
                if (!this.A0g) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        AnonymousClass1XT A012 = A01();
        int clientWidth = getClientWidth();
        int i2 = this.A08;
        int i3 = clientWidth + i2;
        float f = (float) i2;
        float f2 = (float) clientWidth;
        int i4 = A012.A02;
        float f3 = ((((float) i) / f2) - A012.A00) / (A012.A01 + (f / f2));
        this.A0g = false;
        A0H(i4, f3, (int) (((float) i3) * f3));
        if (this.A0g) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0k != z) {
            this.A0k = z;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.1XT] */
    public AnonymousClass1XT A0C(int i, int i2) {
        ? obj = new Object();
        obj.A02 = i;
        obj.A03 = this.A0B.A0F(this, i);
        obj.A01 = this.A0B.A03(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0l;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, obj);
                return obj;
            }
        }
        this.A0l.add(obj);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (r3.size() >= r7) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r11 = this;
            X.1b8 r0 = r11.A0B
            int r7 = r0.A0E()
            r11.A0T = r7
            java.util.ArrayList r3 = r11.A0l
            int r1 = r3.size()
            int r0 = r11.A07
            int r0 = r0 * 2
            int r0 = r0 + 1
            r4 = 0
            if (r1 >= r0) goto L_0x001e
            int r0 = r3.size()
            r10 = 1
            if (r0 < r7) goto L_0x001f
        L_0x001e:
            r10 = 0
        L_0x001f:
            int r5 = r11.A02
            r6 = 0
            r9 = 0
        L_0x0023:
            int r0 = r3.size()
            if (r6 >= r0) goto L_0x0075
            java.lang.Object r8 = r3.get(r6)
            X.1XT r8 = (X.AnonymousClass1XT) r8
            X.1b8 r1 = r11.A0B
            java.lang.Object r0 = r8.A03
            int r2 = r1.A0A(r0)
            r0 = -1
            if (r2 == r0) goto L_0x0064
            r0 = -2
            if (r2 != r0) goto L_0x0067
            r3.remove(r6)
            int r6 = r6 + -1
            if (r9 != 0) goto L_0x004a
            X.1b8 r0 = r11.A0B
            r0.A08(r11)
            r9 = 1
        L_0x004a:
            X.1b8 r2 = r11.A0B
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r2.A0G(r11, r0, r1)
            int r1 = r11.A02
            int r0 = r8.A02
            if (r1 != r0) goto L_0x0063
            int r0 = r7 + -1
            int r0 = java.lang.Math.min(r1, r0)
            int r5 = java.lang.Math.max(r4, r0)
        L_0x0063:
            r10 = 1
        L_0x0064:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0067:
            int r0 = r8.A02
            if (r0 == r2) goto L_0x0064
            int r1 = r8.A02
            int r0 = r11.A02
            if (r1 != r0) goto L_0x0072
            r5 = r2
        L_0x0072:
            r8.A02 = r2
            goto L_0x0063
        L_0x0075:
            if (r9 == 0) goto L_0x007c
            X.1b8 r0 = r11.A0B
            r0.A0D(r11)
        L_0x007c:
            java.util.Comparator r0 = A0s
            java.util.Collections.sort(r3, r0)
            if (r10 == 0) goto L_0x00a5
            int r3 = r11.getChildCount()
            r2 = 0
        L_0x0088:
            if (r2 >= r3) goto L_0x009e
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.1qA r1 = (X.C37811qA) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x009b
            r0 = 0
            r1.A00 = r0
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x0088
        L_0x009e:
            r0 = 1
            r11.A0I(r5, r4, r4, r0)
            r11.requestLayout()
        L_0x00a5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0E():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r0 == r1) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(int r19) {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A02
            r1 = r19
            if (r0 == r1) goto L_0x00d0
            X.1XT r11 = r3.A0B(r0)
            r3.A02 = r1
        L_0x000e:
            X.1b8 r0 = r3.A0B
            if (r0 == 0) goto L_0x0333
            boolean r0 = r3.A0j
            if (r0 != 0) goto L_0x0333
            android.os.IBinder r0 = r3.getWindowToken()
            if (r0 == 0) goto L_0x0336
            X.1b8 r0 = r3.A0B
            r0.A08(r3)
            int r5 = r3.A07
            int r1 = r3.A02
            int r1 = r1 - r5
            r0 = 0
            int r9 = java.lang.Math.max(r0, r1)
            X.1b8 r0 = r3.A0B
            int r4 = r0.A0E()
            int r2 = r4 + -1
            int r1 = r3.A02
            int r0 = r1 + r5
            int r12 = java.lang.Math.min(r2, r0)
            int r0 = r3.A0T
            if (r4 != r0) goto L_0x02db
            r2 = 0
        L_0x0040:
            java.util.ArrayList r10 = r3.A0l
            int r0 = r10.size()
            if (r2 >= r0) goto L_0x00c8
            java.lang.Object r8 = r10.get(r2)
            X.1XT r8 = (X.AnonymousClass1XT) r8
            int r0 = r8.A02
            if (r0 < r1) goto L_0x00c4
            if (r0 != r1) goto L_0x00c8
        L_0x0054:
            r17 = 0
            if (r8 == 0) goto L_0x025b
            int r7 = r2 + -1
            if (r7 < 0) goto L_0x00c2
            java.lang.Object r13 = r10.get(r7)
            X.1XT r13 = (X.AnonymousClass1XT) r13
        L_0x0062:
            int r6 = r3.getClientWidth()
            r16 = 1073741824(0x40000000, float:2.0)
            if (r6 > 0) goto L_0x00b5
            r5 = 0
        L_0x006b:
            int r0 = r3.A02
            int r1 = r0 + -1
            r15 = 0
        L_0x0070:
            if (r1 < 0) goto L_0x00d3
            int r0 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x009d
            if (r1 >= r9) goto L_0x009d
            if (r13 == 0) goto L_0x00d3
            int r0 = r13.A02
            if (r1 != r0) goto L_0x0098
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x0098
            r10.remove(r7)
            X.1b8 r14 = r3.A0B
            java.lang.Object r0 = r13.A03
            r14.A0G(r3, r0, r1)
            int r7 = r7 + -1
            int r2 = r2 + -1
        L_0x0090:
            if (r7 < 0) goto L_0x009b
            java.lang.Object r13 = r10.get(r7)
            X.1XT r13 = (X.AnonymousClass1XT) r13
        L_0x0098:
            int r1 = r1 + -1
            goto L_0x0070
        L_0x009b:
            r13 = 0
            goto L_0x0098
        L_0x009d:
            if (r13 == 0) goto L_0x00a9
            int r0 = r13.A02
            if (r1 != r0) goto L_0x00a9
            float r0 = r13.A01
            float r15 = r15 + r0
            int r7 = r7 + -1
            goto L_0x0090
        L_0x00a9:
            int r0 = r7 + 1
            X.1XT r0 = r3.A0C(r1, r0)
            float r0 = r0.A01
            float r15 = r15 + r0
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00b5:
            float r0 = r8.A01
            float r5 = r16 - r0
            int r0 = r3.getPaddingLeft()
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            float r5 = r5 + r1
            goto L_0x006b
        L_0x00c2:
            r13 = 0
            goto L_0x0062
        L_0x00c4:
            int r2 = r2 + 1
            goto L_0x0040
        L_0x00c8:
            r8 = 0
            if (r4 <= 0) goto L_0x0054
            X.1XT r8 = r3.A0C(r1, r2)
            goto L_0x0054
        L_0x00d0:
            r11 = 0
            goto L_0x000e
        L_0x00d3:
            float r7 = r8.A01
            int r5 = r2 + 1
            r9 = r5
            int r0 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x013c
            int r0 = r10.size()
            if (r5 >= r0) goto L_0x013a
            java.lang.Object r13 = r10.get(r5)
            X.1XT r13 = (X.AnonymousClass1XT) r13
        L_0x00e8:
            if (r6 > 0) goto L_0x0130
            r1 = 0
        L_0x00eb:
            int r6 = r3.A02
        L_0x00ed:
            int r6 = r6 + 1
            if (r6 >= r4) goto L_0x013c
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x011a
            if (r6 <= r12) goto L_0x011a
            if (r13 == 0) goto L_0x013c
            int r0 = r13.A02
            if (r6 != r0) goto L_0x00ed
            boolean r0 = r13.A04
            if (r0 != 0) goto L_0x00ed
            r10.remove(r5)
            X.1b8 r14 = r3.A0B
            java.lang.Object r0 = r13.A03
            r14.A0G(r3, r0, r6)
        L_0x010b:
            int r0 = r10.size()
            if (r5 >= r0) goto L_0x0118
            java.lang.Object r13 = r10.get(r5)
            X.1XT r13 = (X.AnonymousClass1XT) r13
            goto L_0x00ed
        L_0x0118:
            r13 = 0
            goto L_0x00ed
        L_0x011a:
            if (r13 == 0) goto L_0x0126
            int r0 = r13.A02
            if (r6 != r0) goto L_0x0126
            float r0 = r13.A01
            float r7 = r7 + r0
            int r5 = r5 + 1
            goto L_0x010b
        L_0x0126:
            X.1XT r0 = r3.A0C(r6, r5)
            int r5 = r5 + 1
            float r0 = r0.A01
            float r7 = r7 + r0
            goto L_0x010b
        L_0x0130:
            int r0 = r3.getPaddingRight()
            float r1 = (float) r0
            float r0 = (float) r6
            float r1 = r1 / r0
            float r1 = r1 + r16
            goto L_0x00eb
        L_0x013a:
            r13 = 0
            goto L_0x00e8
        L_0x013c:
            X.1b8 r0 = r3.A0B
            int r13 = r0.A0E()
            int r1 = r3.getClientWidth()
            if (r1 <= 0) goto L_0x0195
            int r0 = r3.A08
            float r7 = (float) r0
            float r0 = (float) r1
            float r7 = r7 / r0
        L_0x014d:
            if (r11 == 0) goto L_0x01ce
            int r6 = r11.A02
            int r0 = r8.A02
            if (r6 >= r0) goto L_0x0197
            float r1 = r11.A00
            float r0 = r11.A01
            float r1 = r1 + r0
            float r1 = r1 + r7
            int r5 = r6 + 1
            r4 = 0
        L_0x015e:
            int r0 = r8.A02
            if (r5 > r0) goto L_0x01ce
            int r0 = r10.size()
            if (r4 >= r0) goto L_0x01ce
        L_0x0168:
            java.lang.Object r6 = r10.get(r4)
            X.1XT r6 = (X.AnonymousClass1XT) r6
            int r0 = r6.A02
            if (r5 <= r0) goto L_0x017d
            int r0 = r10.size()
            int r0 = r0 + -1
            if (r4 >= r0) goto L_0x017d
            int r4 = r4 + 1
            goto L_0x0168
        L_0x017d:
            int r0 = r6.A02
            if (r5 >= r0) goto L_0x018c
            X.1b8 r0 = r3.A0B
            float r0 = r0.A03(r5)
            float r0 = r0 + r7
            float r1 = r1 + r0
            int r5 = r5 + 1
            goto L_0x017d
        L_0x018c:
            r6.A00 = r1
            float r0 = r6.A01
            float r0 = r0 + r7
            float r1 = r1 + r0
            int r5 = r5 + 1
            goto L_0x015e
        L_0x0195:
            r7 = 0
            goto L_0x014d
        L_0x0197:
            if (r6 <= r0) goto L_0x01ce
            int r0 = r10.size()
            int r5 = r0 + -1
            float r4 = r11.A00
        L_0x01a1:
            int r6 = r6 + -1
            int r0 = r8.A02
            if (r6 < r0) goto L_0x01ce
            if (r5 < 0) goto L_0x01ce
        L_0x01a9:
            java.lang.Object r1 = r10.get(r5)
            X.1XT r1 = (X.AnonymousClass1XT) r1
            int r0 = r1.A02
            if (r6 >= r0) goto L_0x01b8
            if (r5 <= 0) goto L_0x01b8
            int r5 = r5 + -1
            goto L_0x01a9
        L_0x01b8:
            int r0 = r1.A02
            if (r6 <= r0) goto L_0x01c7
            X.1b8 r0 = r3.A0B
            float r0 = r0.A03(r6)
            float r0 = r0 + r7
            float r4 = r4 - r0
            int r6 = r6 + -1
            goto L_0x01b8
        L_0x01c7:
            float r0 = r1.A01
            float r0 = r0 + r7
            float r4 = r4 - r0
            r1.A00 = r4
            goto L_0x01a1
        L_0x01ce:
            int r6 = r10.size()
            float r11 = r8.A00
            int r1 = r8.A02
            int r12 = r1 + -1
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r1 != 0) goto L_0x01de
            r0 = r11
        L_0x01de:
            r3.A00 = r0
            int r5 = r13 + -1
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r1 != r5) goto L_0x0217
            float r0 = r8.A01
            float r0 = r0 + r11
            float r0 = r0 - r13
        L_0x01ea:
            r3.A01 = r0
            int r4 = r2 + -1
        L_0x01ee:
            if (r4 < 0) goto L_0x021b
            java.lang.Object r2 = r10.get(r4)
            X.1XT r2 = (X.AnonymousClass1XT) r2
        L_0x01f6:
            int r0 = r2.A02
            if (r12 <= r0) goto L_0x0206
            X.1b8 r0 = r3.A0B
            int r1 = r12 + -1
            float r0 = r0.A03(r12)
            float r0 = r0 + r7
            float r11 = r11 - r0
            r12 = r1
            goto L_0x01f6
        L_0x0206:
            float r0 = r2.A01
            float r0 = r0 + r7
            float r11 = r11 - r0
            r2.A00 = r11
            int r0 = r2.A02
            if (r0 != 0) goto L_0x0212
            r3.A00 = r11
        L_0x0212:
            int r4 = r4 + -1
            int r12 = r12 + -1
            goto L_0x01ee
        L_0x0217:
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x01ea
        L_0x021b:
            float r4 = r8.A00
            float r0 = r8.A01
            float r4 = r4 + r0
            float r4 = r4 + r7
            int r0 = r8.A02
            int r11 = r0 + 1
        L_0x0225:
            if (r9 >= r6) goto L_0x0252
            java.lang.Object r2 = r10.get(r9)
            X.1XT r2 = (X.AnonymousClass1XT) r2
        L_0x022d:
            int r0 = r2.A02
            if (r11 >= r0) goto L_0x023d
            X.1b8 r0 = r3.A0B
            int r1 = r11 + 1
            float r0 = r0.A03(r11)
            float r0 = r0 + r7
            float r4 = r4 + r0
            r11 = r1
            goto L_0x022d
        L_0x023d:
            int r0 = r2.A02
            if (r0 != r5) goto L_0x0247
            float r0 = r2.A01
            float r0 = r0 + r4
            float r0 = r0 - r13
            r3.A01 = r0
        L_0x0247:
            r2.A00 = r4
            float r0 = r2.A01
            float r0 = r0 + r7
            float r4 = r4 + r0
            int r9 = r9 + 1
            int r11 = r11 + 1
            goto L_0x0225
        L_0x0252:
            X.1b8 r2 = r3.A0B
            int r1 = r3.A02
            java.lang.Object r0 = r8.A03
            r2.A09(r3, r0, r1)
        L_0x025b:
            X.1b8 r0 = r3.A0B
            r0.A0D(r3)
            int r5 = r3.getChildCount()
            r4 = 0
        L_0x0265:
            if (r4 >= r5) goto L_0x028e
            android.view.View r1 = r3.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            X.1qA r2 = (X.C37811qA) r2
            r2.A01 = r4
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x028b
            float r0 = r2.A00
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x028b
            X.1XT r1 = r3.A0D(r1)
            if (r1 == 0) goto L_0x028b
            float r0 = r1.A01
            r2.A00 = r0
            int r0 = r1.A02
            r2.A03 = r0
        L_0x028b:
            int r4 = r4 + 1
            goto L_0x0265
        L_0x028e:
            r3.A02()
            boolean r0 = r3.hasFocus()
            if (r0 == 0) goto L_0x0336
            android.view.View r0 = r3.findFocus()
            if (r0 == 0) goto L_0x02b9
        L_0x029d:
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == r3) goto L_0x02ad
            if (r1 == 0) goto L_0x02b9
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x02b9
            r0 = r1
            android.view.View r0 = (android.view.View) r0
            goto L_0x029d
        L_0x02ad:
            X.1XT r0 = r3.A0D(r0)
            if (r0 == 0) goto L_0x02b9
            int r1 = r0.A02
            int r0 = r3.A02
            if (r1 == r0) goto L_0x0336
        L_0x02b9:
            r4 = 0
        L_0x02ba:
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto L_0x0336
            android.view.View r2 = r3.getChildAt(r4)
            X.1XT r0 = r3.A0D(r2)
            if (r0 == 0) goto L_0x02d8
            int r1 = r0.A02
            int r0 = r3.A02
            if (r1 != r0) goto L_0x02d8
            r0 = 2
            boolean r0 = r2.requestFocus(r0)
            if (r0 == 0) goto L_0x02d8
            return
        L_0x02d8:
            int r4 = r4 + 1
            goto L_0x02ba
        L_0x02db:
            android.content.res.Resources r1 = r3.getResources()     // Catch:{ NotFoundException -> 0x02e8 }
            int r0 = r3.getId()     // Catch:{ NotFoundException -> 0x02e8 }
            java.lang.String r2 = r1.getResourceName(r0)     // Catch:{ NotFoundException -> 0x02e8 }
            goto L_0x02f0
        L_0x02e8:
            int r0 = r3.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r0)
        L_0x02f0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r1.append(r0)
            int r0 = r3.A0T
            r1.append(r0)
            java.lang.String r0 = ", found: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " Pager id: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " Pager class: "
            r1.append(r0)
            java.lang.Class r0 = r3.getClass()
            r1.append(r0)
            java.lang.String r0 = " Problematic adapter: "
            r1.append(r0)
            X.1b8 r0 = r3.A0B
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0333:
            r3.A02()
        L_0x0336:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0G(int):void");
    }

    public void A0H(int i, float f, int i2) {
        int i3;
        int i4;
        if (this.A0R > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                C37811qA r7 = (C37811qA) childAt.getLayoutParams();
                if (r7.A04) {
                    int i6 = r7.A02 & 7;
                    if (i6 == 1) {
                        i3 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    } else if (i6 == 3) {
                        i4 = childAt.getWidth() + paddingLeft;
                    } else if (i6 != 5) {
                        i4 = paddingLeft;
                    } else {
                        i3 = (width - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i4 = paddingLeft;
                        paddingLeft = i3;
                    }
                    int left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = i4;
                }
            }
        }
        C23521Gp r0 = this.A0C;
        if (r0 != null) {
            r0.Bzx(i, f, i2);
        }
        List list = this.A0F;
        if (list != null) {
            int size = list.size();
            for (int i7 = 0; i7 < size; i7++) {
                C23521Gp r02 = (C23521Gp) this.A0F.get(i7);
                if (r02 != null) {
                    r02.Bzx(i, f, i2);
                }
            }
        }
        if (this.A0D != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((C37811qA) childAt2.getLayoutParams()).A04) {
                    this.A0D.CPn(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.A0g = true;
    }

    public void A0I(int i, int i2, boolean z, boolean z2) {
        AnonymousClass1b8 r0 = this.A0B;
        boolean z3 = false;
        if (r0 == null || r0.A0E() <= 0 || (!z2 && this.A02 == i && this.A0l.size() != 0)) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A0B.A0E()) {
            i = this.A0B.A0E() - 1;
        }
        int i3 = this.A07;
        int i4 = this.A02;
        if (i > i4 + i3 || i < i4 - i3) {
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.A0l;
                if (i5 >= arrayList.size()) {
                    break;
                }
                ((AnonymousClass1XT) arrayList.get(i5)).A04 = true;
                i5++;
            }
        }
        if (i4 != i) {
            z3 = true;
        }
        if (this.A0h) {
            this.A02 = i;
            if (z3) {
                A03(i);
            }
            requestLayout();
            return;
        }
        A0G(i);
        A05(i, i2, z, z3);
    }

    public void A0K(C23521Gp r2) {
        List list = this.A0F;
        if (list == null) {
            list = new ArrayList();
            this.A0F = list;
        }
        list.add(r2);
    }

    public boolean A0N(View view, int i, int i2, int i3, boolean z) {
        int i4;
        int i5 = i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i2 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (A0N(childAt, i5, i6 - childAt.getLeft(), i4 - childAt.getTop(), true)) {
                        return true;
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.A0B == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.A00))) {
                return true;
            }
            return false;
        } else if (i <= 0 || scrollX >= ((int) (((float) clientWidth) * this.A01))) {
            return false;
        }
        return true;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof C37811qA) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        return true;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C37811qA();
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.A03 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C37811qA) ((View) this.A0f.get(i2)).getLayoutParams()).A01;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.A0o);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        if (this.A08 > 0 && this.A0Z != null) {
            ArrayList arrayList = this.A0l;
            if (arrayList.size() > 0 && this.A0B != null) {
                int scrollX = getScrollX();
                int width = getWidth();
                float f2 = (float) width;
                float f3 = ((float) this.A08) / f2;
                int i = 0;
                AnonymousClass1XT r5 = (AnonymousClass1XT) arrayList.get(0);
                float f4 = r5.A00;
                int size = arrayList.size();
                int i2 = r5.A02;
                int i3 = ((AnonymousClass1XT) arrayList.get(size - 1)).A02;
                while (i2 < i3) {
                    while (i2 > r5.A02 && i < size) {
                        i++;
                        r5 = (AnonymousClass1XT) arrayList.get(i);
                    }
                    if (i2 == r5.A02) {
                        float f5 = r5.A00 + r5.A01;
                        f = f5 * f2;
                        f4 = f5 + f3;
                    } else {
                        float A032 = this.A0B.A03(i2);
                        f = (f4 + A032) * f2;
                        f4 += A032 + f3;
                    }
                    float f6 = ((float) this.A08) + f;
                    if (f6 > ((float) scrollX)) {
                        this.A0Z.setBounds(Math.round(f), this.A0X, Math.round(f6), this.A0O);
                        this.A0Z.draw(canvas2);
                    }
                    if (f <= ((float) (scrollX + width))) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent2.getAction() & 255;
        if (action == 3 || action == 1) {
            A08();
            return false;
        }
        if (action != 0) {
            if (this.A0G) {
                return true;
            }
            if (this.A0I) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent2.getX();
            this.A0J = x;
            this.A0L = x;
            float y = motionEvent2.getY();
            this.A0K = y;
            this.A0M = y;
            this.A0N = motionEvent2.getPointerId(0);
            this.A0I = false;
            this.A0H = true;
            this.mScroller.computeScrollOffset();
            if (this.A0W != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.A0Q) {
                A07(false);
                this.A0G = false;
            } else {
                this.mScroller.abortAnimation();
                this.A0j = false;
                A0G(this.A02);
                this.A0G = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.A0N;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f2 = x2 - this.A0L;
                float abs = Math.abs(f2);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.A0K);
                if (f2 != 0.0f) {
                    float f3 = this.A0L;
                    if ((f3 >= ((float) this.A05) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.A05)) || f2 >= 0.0f)) {
                        if (A0N(this, (int) f2, (int) x2, (int) y2, false)) {
                            this.A0L = x2;
                            this.A0M = y2;
                            this.A0I = true;
                            return false;
                        }
                    }
                }
                float f4 = (float) this.A0Y;
                if (abs > f4 && abs * 0.5f > abs2) {
                    this.A0G = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                    float f5 = this.A0J;
                    float f6 = (float) this.A0Y;
                    if (i2 > 0) {
                        f = f5 + f6;
                    } else {
                        f = f5 - f6;
                    }
                    this.A0L = f;
                    this.A0M = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f4) {
                    this.A0I = true;
                }
                if (this.A0G && A09(x2)) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            A06(motionEvent2);
        }
        VelocityTracker velocityTracker = this.A0A;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.A0A = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent2);
        return this.A0G;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass27g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass27g r4 = (AnonymousClass27g) parcelable;
        super.onRestoreInstanceState(r4.A00);
        AnonymousClass1b8 r2 = this.A0B;
        if (r2 != null) {
            r2.A07(r4.A01, r4.A02);
            A0I(r4.A00, 0, false, true);
            return;
        }
        this.A0V = r4.A00;
        this.A0a = r4.A01;
        this.A0e = r4.A02;
    }

    public void removeView(View view) {
        if (this.A0i) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(AnonymousClass1b8 r7) {
        ArrayList arrayList;
        AnonymousClass1b8 r0 = this.A0B;
        if (r0 != null) {
            synchronized (r0) {
                r0.A00 = null;
            }
            this.A0B.A08(this);
            int i = 0;
            while (true) {
                arrayList = this.A0l;
                if (i >= arrayList.size()) {
                    break;
                }
                AnonymousClass1XT r02 = (AnonymousClass1XT) arrayList.get(i);
                this.A0B.A0G(this, r02.A03, r02.A02);
                i++;
            }
            this.A0B.A0D(this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C37811qA) getChildAt(i2).getLayoutParams()).A04) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A02 = 0;
            scrollTo(0, 0);
        }
        this.A0B = r7;
        this.A0T = 0;
        if (r7 != null) {
            C28881bD r1 = this.A0d;
            if (r1 == null) {
                r1 = new C28881bD(this);
                this.A0d = r1;
            }
            AnonymousClass1b8 r03 = this.A0B;
            synchronized (r03) {
                r03.A00 = r1;
            }
            this.A0j = false;
            boolean z = this.A0h;
            this.A0h = true;
            this.A0T = this.A0B.A0E();
            if (this.A0V >= 0) {
                this.A0B.A07(this.A0a, this.A0e);
                A0I(this.A0V, 0, false, true);
                this.A0V = -1;
                this.A0a = null;
                this.A0e = null;
            } else if (!z) {
                A0G(this.A02);
            } else {
                requestLayout();
            }
        }
        List list = this.A0E;
        if (list != null && !list.isEmpty()) {
            int size = this.A0E.size();
            for (int i3 = 0; i3 < size; i3++) {
                C142677Aj r2 = (C142677Aj) ((AnonymousClass3KE) this.A0E.get(i3));
                TabLayout tabLayout = r2.A01;
                if (tabLayout.A0K == this) {
                    tabLayout.A0D(r7, r2.A00);
                }
            }
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.A08;
        this.A08 = i;
        int width = getWidth();
        A04(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.A0Z = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        int i2;
        if (this.A0W != i) {
            this.A0W = i;
            if (this.A0D != null) {
                boolean z = false;
                if (i != 0) {
                    z = true;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    if (z) {
                        i2 = this.A09;
                    } else {
                        i2 = 0;
                    }
                    getChildAt(i3).setLayerType(i2, (Paint) null);
                }
            }
            C23521Gp r0 = this.A0C;
            if (r0 != null) {
                r0.Bzw(i);
            }
            List list = this.A0F;
            if (list != null) {
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    C23521Gp r02 = (C23521Gp) this.A0F.get(i4);
                    if (r02 != null) {
                        r02.Bzw(i);
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1XT] */
    public ViewPager(Context context) {
        super(context);
        A0F();
    }

    private AnonymousClass1XT A01() {
        float f;
        float f2;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            float f4 = (float) clientWidth;
            f = ((float) getScrollX()) / f4;
            f2 = ((float) this.A08) / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        AnonymousClass1XT r11 = null;
        float f5 = 0.0f;
        int i = -1;
        int i2 = 0;
        boolean z = true;
        while (true) {
            ArrayList arrayList = this.A0l;
            if (i2 >= arrayList.size()) {
                break;
            }
            AnonymousClass1XT r2 = (AnonymousClass1XT) arrayList.get(i2);
            if (!z && r2.A02 != i + 1) {
                r2 = this.A0n;
                r2.A00 = f3 + f5 + f2;
                int i3 = i + 1;
                r2.A02 = i3;
                r2.A01 = this.A0B.A03(i3);
                i2--;
            }
            f3 = r2.A00;
            f5 = r2.A01;
            float f6 = f5 + f3 + f2;
            if (!z && f < f3) {
                break;
            } else if (f < f6 || i2 == arrayList.size() - 1) {
                return r2;
            } else {
                i = r2.A02;
                i2++;
                z = false;
                r11 = r2;
            }
        }
        return r11;
    }

    private void A05(int i, int i2, boolean z, boolean z2) {
        int i3;
        int scrollX;
        int A032;
        AnonymousClass1XT A0B2 = A0B(i);
        if (A0B2 != null) {
            i3 = (int) (((float) getClientWidth()) * Math.max(this.A00, Math.min(A0B2.A00, this.A01)));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.mScroller;
                if (scroller == null || scroller.isFinished()) {
                    scrollX = getScrollX();
                } else {
                    boolean z3 = this.A0H;
                    Scroller scroller2 = this.mScroller;
                    if (z3) {
                        scrollX = scroller2.getCurrX();
                    } else {
                        scrollX = scroller2.getStartX();
                    }
                    this.mScroller.abortAnimation();
                    setScrollingCacheEnabled(false);
                }
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = -scrollY;
                if (i4 == 0 && i5 == 0) {
                    A07(false);
                    A0G(this.A02);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float abs = (float) Math.abs(i4);
                    float f = (float) clientWidth;
                    float f2 = (float) (clientWidth / 2);
                    float sin = f2 + (f2 * ((float) Math.sin((double) ((Math.min(1.0f, (abs * 1.0f) / f) - 0.5f) * 0.47123894f))));
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        A032 = Math.round(Math.abs(sin / ((float) abs2)) * 1000.0f) * 4;
                    } else {
                        A032 = (int) (((abs / ((f * this.A0B.A03(this.A02)) + ((float) this.A08))) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(A032, 600);
                    this.A0H = false;
                    this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                A03(i);
                return;
            }
            return;
        }
        if (z2) {
            A03(i);
        }
        A07(false);
        scrollTo(i3, 0);
        A0A(i3);
    }

    private void A06(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0N) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0L = motionEvent.getX(i);
            this.A0N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A0A;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0082, code lost:
        if (r1 >= r0) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b3, code lost:
        if (r1 <= r0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
        if (r1 != false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0M(int r6) {
        /*
            r5 = this;
            android.view.View r3 = r5.findFocus()
            r4 = 0
            if (r3 == r5) goto L_0x005f
            if (r3 == 0) goto L_0x0060
            android.view.ViewParent r1 = r3.getParent()
        L_0x000d:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0018
            if (r1 == r5) goto L_0x0060
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x000d
        L_0x0018:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r3.getParent()
        L_0x002c:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = " => "
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L_0x002c
        L_0x0045:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            r1.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewPager"
            android.util.Log.e(r0, r1)
        L_0x005f:
            r3 = r4
        L_0x0060:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r0.findNextFocus(r5, r3, r6)
            r1 = 66
            r0 = 17
            if (r4 == 0) goto L_0x0096
            if (r4 == r3) goto L_0x0096
            if (r6 != r0) goto L_0x00a1
            android.graphics.Rect r2 = r5.A0m
            android.graphics.Rect r0 = r5.A00(r2, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r5.A00(r2, r3)
            int r0 = r0.left
            if (r3 == 0) goto L_0x00cb
            if (r1 < r0) goto L_0x00cb
        L_0x0084:
            int r1 = r5.A02
            if (r1 <= 0) goto L_0x00d2
            r0 = 1
            int r1 = r1 - r0
            r5.A0J(r1, r0)
        L_0x008d:
            r1 = 1
        L_0x008e:
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r0)
        L_0x0095:
            return r1
        L_0x0096:
            if (r6 == r0) goto L_0x0084
            r0 = 1
            if (r6 == r0) goto L_0x0084
            if (r6 == r1) goto L_0x00b5
            r0 = 2
            if (r6 != r0) goto L_0x00d2
            goto L_0x00b5
        L_0x00a1:
            if (r6 != r1) goto L_0x00d2
            android.graphics.Rect r2 = r5.A0m
            android.graphics.Rect r0 = r5.A00(r2, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r5.A00(r2, r3)
            int r0 = r0.left
            if (r3 == 0) goto L_0x00cb
            if (r1 > r0) goto L_0x00cb
        L_0x00b5:
            X.1b8 r0 = r5.A0B
            if (r0 == 0) goto L_0x00d2
            int r2 = r5.A02
            int r0 = r0.A0E()
            r1 = 1
            int r0 = r0 - r1
            if (r2 >= r0) goto L_0x00d2
            int r0 = r5.A02
            int r0 = r0 + 1
            r5.A0J(r0, r1)
            goto L_0x008d
        L_0x00cb:
            boolean r1 = r4.requestFocus()
            if (r1 == 0) goto L_0x0095
            goto L_0x008e
        L_0x00d2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0M(int):boolean");
    }

    public void addFocusables(ArrayList arrayList, int i, int i2) {
        AnonymousClass1XT A0D2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A0D2 = A0D(childAt)) != null && A0D2.A02 == this.A02) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C37811qA();
        }
        C37811qA r3 = (C37811qA) layoutParams;
        boolean z = r3.A04;
        boolean z2 = false;
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            z2 = true;
        }
        boolean z3 = z | z2;
        r3.A04 = z3;
        if (!this.A0i) {
            super.addView(view, i, layoutParams);
        } else if (!z3) {
            r3.A05 = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        boolean A0M2;
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        int i2 = 2;
        if (keyCode != 21) {
            if (keyCode != 22) {
                if (keyCode != 61) {
                    return false;
                }
                if (!keyEvent.hasNoModifiers()) {
                    i2 = 1;
                    if (!keyEvent.hasModifiers(1)) {
                        return false;
                    }
                }
                A0M2 = A0M(i2);
            } else if (keyEvent.hasModifiers(2)) {
                AnonymousClass1b8 r0 = this.A0B;
                if (r0 == null || this.A02 >= r0.A0E() - 1) {
                    return false;
                }
                A0J(this.A02 + 1, true);
                return true;
            } else {
                i = 66;
                A0M2 = A0M(i);
            }
        } else if (keyEvent.hasModifiers(2)) {
            int i3 = this.A02;
            if (i3 <= 0) {
                return false;
            }
            A0J(i3 - 1, true);
            return true;
        } else {
            i = 17;
            A0M2 = A0M(i);
        }
        if (A0M2) {
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        AnonymousClass1XT A0D2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A0D2 = A0D(childAt)) != null && A0D2.A02 == this.A02 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        AnonymousClass1b8 r0;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && (r0 = this.A0B) != null && r0.A0E() > 1)) {
            boolean z = false;
            if (!this.A0b.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.A00 * ((float) width));
                this.A0b.setSize(height, width);
                z = false | this.A0b.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A0c.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.A01 + 1.0f)) * ((float) width2));
                this.A0c.setSize(height2, width2);
                z |= this.A0c.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.A0b.finish();
        this.A0c.finish();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0Z;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.ViewGroup$LayoutParams, X.1qA] */
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0p);
        layoutParams.A02 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    public AnonymousClass1b8 getAdapter() {
        return this.A0B;
    }

    public int getCurrentItem() {
        return this.A02;
    }

    public int getOffscreenPageLimit() {
        return this.A07;
    }

    public int getPageMargin() {
        return this.A08;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0h = true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        AnonymousClass1XT A0D2;
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        int i9 = i3 - i;
        int i10 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                C37811qA r3 = (C37811qA) childAt.getLayoutParams();
                if (r3.A04) {
                    int i13 = r3.A02;
                    int i14 = i13 & 7;
                    int i15 = i13 & 112;
                    if (i14 == 1) {
                        i5 = Math.max((i9 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    } else if (i14 == 3) {
                        i6 = childAt.getMeasuredWidth() + paddingLeft;
                    } else if (i14 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i5 = (i9 - paddingRight) - childAt.getMeasuredWidth();
                        paddingRight += childAt.getMeasuredWidth();
                        i6 = paddingLeft;
                        paddingLeft = i5;
                    }
                    if (i15 == 16) {
                        i7 = Math.max((i10 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        i8 = paddingTop;
                        paddingTop = i7;
                    } else if (i15 == 48) {
                        i8 = childAt.getMeasuredHeight() + paddingTop;
                    } else if (i15 != 80) {
                        i8 = paddingTop;
                    } else {
                        i7 = (i10 - paddingBottom) - childAt.getMeasuredHeight();
                        paddingBottom += childAt.getMeasuredHeight();
                        i8 = paddingTop;
                        paddingTop = i7;
                    }
                    int i16 = paddingLeft + scrollX;
                    childAt.layout(i16, paddingTop, childAt.getMeasuredWidth() + i16, childAt.getMeasuredHeight() + paddingTop);
                    i11++;
                    paddingTop = i8;
                    paddingLeft = i6;
                }
            }
        }
        int i17 = (i9 - paddingLeft) - paddingRight;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = getChildAt(i18);
            if (childAt2.getVisibility() != 8) {
                C37811qA r12 = (C37811qA) childAt2.getLayoutParams();
                if (!r12.A04 && (A0D2 = A0D(childAt2)) != null) {
                    float f = (float) i17;
                    int i19 = ((int) (A0D2.A00 * f)) + paddingLeft;
                    if (r12.A05) {
                        r12.A05 = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f * r12.A00), 1073741824), View.MeasureSpec.makeMeasureSpec((i10 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i19, paddingTop, childAt2.getMeasuredWidth() + i19, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.A0X = paddingTop;
        this.A0O = i10 - paddingBottom;
        this.A0R = i11;
        if (this.A0h) {
            z2 = false;
            A05(this.A02, 0, false, false);
        } else {
            z2 = false;
        }
        this.A0h = z2;
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        AnonymousClass1XT A0D2;
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 1;
        if ((i & 2) == 0) {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (A0D2 = A0D(childAt)) != null && A0D2.A02 == this.A02 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xj, X.27g, android.os.Parcelable] */
    public Parcelable onSaveInstanceState() {
        ? r1 = new C27741Xj(super.onSaveInstanceState());
        r1.A00 = this.A02;
        AnonymousClass1b8 r0 = this.A0B;
        if (r0 != null) {
            r1.A01 = r0.A0B();
        }
        return r1;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A08;
            A04(i, i3, i5, i5);
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C23521Gp r1) {
        this.A0C = r1;
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0Z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1XT] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0F();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C37811qA();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C24261Jm.A00(getContext(), i));
    }
}
