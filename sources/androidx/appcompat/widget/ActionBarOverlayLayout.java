package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass03J;
import X.AnonymousClass03K;
import X.AnonymousClass04H;
import X.AnonymousClass05B;
import X.AnonymousClass1HF;
import X.AnonymousClass1HO;
import X.C002701f;
import X.C003801r;
import X.C003901s;
import X.C004301w;
import X.C06450Yj;
import X.C06460Yk;
import X.C28171Zd;
import X.C33321id;
import X.C37821qB;
import X.C37831qC;
import X.C37861qG;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;

public class ActionBarOverlayLayout extends ViewGroup implements C002701f, C37821qB, C37831qC {
    public static final int[] A0V = {2130968592, 16842841};
    public ViewPropertyAnimator A00;
    public OverScroller A01;
    public ActionBarContainer A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public C003801r A09;
    public ContentFrameLayout A0A;
    public AnonymousClass03J A0B;
    public AnonymousClass1HO A0C;
    public AnonymousClass1HO A0D;
    public AnonymousClass1HO A0E;
    public AnonymousClass1HO A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnimatorListenerAdapter A0K;
    public final Runnable A0L;
    public final Runnable A0M;
    public final Rect A0N;
    public final Rect A0O;
    public final Rect A0P;
    public final Rect A0Q;
    public final Rect A0R;
    public final Rect A0S;
    public final Rect A0T;
    public final C37861qG A0U;

    public void Bz0(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        Byz(view, i, i2, i3, i4, i5);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        AnonymousClass1HO A002;
        A02();
        int i3 = i;
        int i4 = i2;
        measureChildWithMargins(this.A02, i3, 0, i4, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A02.getLayoutParams();
        int max = Math.max(0, this.A02.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        int max2 = Math.max(0, this.A02.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.A02.getMeasuredState());
        if ((getWindowSystemUiVisibility() & 256) != 0) {
            z = true;
            measuredHeight = this.A04;
            if (this.A0G && this.A02.A03 != null) {
                measuredHeight += measuredHeight;
            }
        } else {
            z = false;
            measuredHeight = this.A02.getVisibility() != 8 ? this.A02.getMeasuredHeight() : 0;
        }
        Rect rect = this.A0P;
        rect.set(this.A0N);
        AnonymousClass1HO r1 = this.A0C;
        this.A0D = r1;
        if (this.A0J || z) {
            C33321id A003 = C33321id.A00(r1.A03(), this.A0D.A05() + measuredHeight, this.A0D.A04(), this.A0D.A02());
            C28171Zd r0 = new C28171Zd(this.A0D);
            r0.A01(A003);
            A002 = r0.A00();
        } else {
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            A002 = r1.A0D(0, measuredHeight, 0, 0);
        }
        this.A0D = A002;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.A0A.getLayoutParams();
        int i5 = marginLayoutParams2.leftMargin;
        int i6 = rect.left;
        if (i5 != i6) {
            marginLayoutParams2.leftMargin = i6;
        }
        int i7 = marginLayoutParams2.topMargin;
        int i8 = rect.top;
        if (i7 != i8) {
            marginLayoutParams2.topMargin = i8;
        }
        int i9 = marginLayoutParams2.rightMargin;
        int i10 = rect.right;
        if (i9 != i10) {
            marginLayoutParams2.rightMargin = i10;
        }
        int i11 = marginLayoutParams2.bottomMargin;
        int i12 = rect.bottom;
        if (i11 != i12) {
            marginLayoutParams2.bottomMargin = i12;
        }
        if (!this.A0F.equals(this.A0D)) {
            AnonymousClass1HO r12 = this.A0D;
            this.A0F = r12;
            AnonymousClass1HF.A0E(this.A0A, r12);
        }
        measureChildWithMargins(this.A0A, i3, 0, i4, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.A0A.getLayoutParams();
        int max3 = Math.max(max, this.A0A.getMeasuredWidth() + marginLayoutParams3.leftMargin + marginLayoutParams3.rightMargin);
        int max4 = Math.max(max2, this.A0A.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.A0A.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void A01() {
        removeCallbacks(this.A0M);
        removeCallbacks(this.A0L);
        ViewPropertyAnimator viewPropertyAnimator = this.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public void A02() {
        AnonymousClass03J wrapper;
        if (this.A0A == null) {
            this.A0A = (ContentFrameLayout) findViewById(2131427473);
            this.A02 = (ActionBarContainer) findViewById(2131427474);
            View findViewById = findViewById(2131427472);
            if (findViewById instanceof AnonymousClass03J) {
                wrapper = (AnonymousClass03J) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Can't make a decor toolbar out of ");
                throw AnonymousClass000.A0o(findViewById.getClass().getSimpleName(), A10);
            }
            this.A0B = wrapper;
        }
    }

    public void Byz(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    public void Bz1(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public boolean C6L(View view, View view2, int i, int i2) {
        if (i2 != 0 || !onStartNestedScroll(view, view2, i)) {
            return false;
        }
        return true;
    }

    public void C73(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.A02;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.A0U.A00();
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        Runnable runnable;
        if (!this.A0H || !z) {
            return false;
        }
        this.A01.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.A01.getFinalY() > this.A02.getHeight()) {
            A01();
            runnable = this.A0L;
        } else {
            A01();
            runnable = this.A0M;
        }
        runnable.run();
        this.A03 = true;
        return true;
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.A05 + i2;
        this.A05 = i5;
        setActionBarHideOffset(i5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r1 = (X.C003901s) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r3, android.view.View r4, int r5) {
        /*
            r2 = this;
            X.1qG r0 = r2.A0U
            r0.A01(r5)
            int r0 = r2.getActionBarHideOffset()
            r2.A05 = r0
            r2.A01()
            X.01r r1 = r2.A09
            if (r1 == 0) goto L_0x001e
            X.01s r1 = (X.C003901s) r1
            X.0KW r0 = r1.A06
            if (r0 == 0) goto L_0x001e
            r0.A00()
            r0 = 0
            r1.A06 = r0
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.A02.getVisibility() != 0) {
            return false;
        }
        return this.A0H;
    }

    public void onStopNestedScroll(View view) {
        Runnable runnable;
        if (this.A0H && !this.A03) {
            if (this.A05 <= this.A02.getHeight()) {
                A01();
                runnable = this.A0M;
            } else {
                A01();
                runnable = this.A0L;
            }
            postDelayed(runnable, 600);
        }
    }

    public void setActionBarVisibilityCallback(C003801r r3) {
        this.A09 = r3;
        if (getWindowToken() != null) {
            ((C003901s) this.A09).A00 = this.A07;
            int i = this.A06;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                AnonymousClass1HF.A0T(this);
            }
        }
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.A0H) {
            this.A0H = z;
            if (!z) {
                A01();
                setActionBarHideOffset(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (getContext().getApplicationInfo().targetSdkVersion >= 19) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setOverlayMode(boolean r4) {
        /*
            r3 = this;
            r3.A0J = r4
            if (r4 == 0) goto L_0x0013
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r1 = 19
            r0 = 1
            if (r2 < r1) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.setOverlayMode(boolean):void");
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = 0;
        this.A0N = new Rect();
        this.A0R = new Rect();
        this.A0P = new Rect();
        this.A0O = new Rect();
        this.A0S = new Rect();
        this.A0Q = new Rect();
        this.A0T = new Rect();
        AnonymousClass1HO r0 = AnonymousClass1HO.A01;
        this.A0C = r0;
        this.A0E = r0;
        this.A0D = r0;
        this.A0F = r0;
        this.A0K = new AnonymousClass04H(this);
        this.A0M = new C06450Yj(this);
        this.A0L = new C06460Yk(this);
        A00(context);
        this.A0U = new C37861qG();
    }

    private void A00(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(A0V);
        boolean z = false;
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.A08 = drawable;
        setWillNotDraw(AnonymousClass000.A1X(drawable));
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z = true;
        }
        this.A0I = z;
        this.A01 = new OverScroller(context);
    }

    public boolean A03() {
        return this.A0J;
    }

    public boolean BEF() {
        A02();
        return this.A0B.BEF();
    }

    public void BIu() {
        A02();
        this.A0B.BIt();
    }

    public boolean Bcz() {
        A02();
        return this.A0B.Bcz();
    }

    public void BdN(int i) {
        A02();
        if (i == 2 || i == 5) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 109) {
            setOverlayMode(true);
        }
    }

    public boolean Bfi() {
        A02();
        return this.A0B.Bfi();
    }

    public boolean Bfj() {
        A02();
        return this.A0B.Bfj();
    }

    public void CJS() {
        A02();
        ((AnonymousClass03K) this.A0B).A0C = true;
    }

    public boolean CN0() {
        A02();
        return this.A0B.CN0();
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.A08 != null && !this.A0I) {
            if (this.A02.getVisibility() == 0) {
                i = (int) (((float) this.A02.getBottom()) + this.A02.getTranslationY() + 0.5f);
            } else {
                i = 0;
            }
            this.A08.setBounds(0, i, getWidth(), this.A08.getIntrinsicHeight() + i);
            this.A08.draw(canvas);
        }
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public CharSequence getTitle() {
        A02();
        return this.A0B.getTitle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (r6 != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r8) {
        /*
            r7 = this;
            r7.A02()
            X.1HO r5 = X.AnonymousClass1HO.A01(r7, r8)
            int r4 = r5.A03()
            int r2 = r5.A05()
            int r1 = r5.A04()
            int r0 = r5.A02()
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r4, r2, r1, r0)
            androidx.appcompat.widget.ActionBarContainer r0 = r7.A02
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r1 = r2.leftMargin
            int r0 = r3.left
            if (r1 == r0) goto L_0x0081
            r2.leftMargin = r0
            r6 = 1
        L_0x002d:
            int r1 = r2.topMargin
            int r0 = r3.top
            if (r1 == r0) goto L_0x0036
            r2.topMargin = r0
            r6 = 1
        L_0x0036:
            int r1 = r2.rightMargin
            int r0 = r3.right
            if (r1 == r0) goto L_0x003f
            r2.rightMargin = r0
            r6 = 1
        L_0x003f:
            android.graphics.Rect r4 = r7.A0N
            X.AnonymousClass1HF.A0P(r4, r7, r5)
            int r3 = r4.left
            int r2 = r4.top
            int r1 = r4.right
            int r0 = r4.bottom
            X.1HO r1 = r5.A0D(r3, r2, r1, r0)
            r7.A0C = r1
            X.1HO r0 = r7.A0E
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            X.1HO r0 = r7.A0C
            r7.A0E = r0
            r6 = 1
        L_0x005f:
            android.graphics.Rect r1 = r7.A0R
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x007e
            r1.set(r4)
        L_0x006a:
            r7.requestLayout()
        L_0x006d:
            X.1HO r0 = r5.A0A()
            X.1HO r0 = r0.A0C()
            X.1HO r0 = r0.A0B()
            android.view.WindowInsets r0 = r0.A06()
            return r0
        L_0x007e:
            if (r6 == 0) goto L_0x006d
            goto L_0x006a
        L_0x0081:
            r6 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A00(getContext());
        AnonymousClass1HF.A0T(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A01();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.leftMargin + paddingLeft;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        super.onWindowSystemUiVisibilityChanged(i);
        A02();
        int i2 = this.A06 ^ i;
        this.A06 = i;
        boolean z2 = false;
        boolean A1P = AnonymousClass000.A1P(i & 4);
        if ((i & 256) != 0) {
            z2 = true;
        }
        C003801r r1 = this.A09;
        if (r1 != null) {
            C003901s r12 = (C003901s) r1;
            r12.A0B = !z2;
            if (A1P || !z2) {
                if (r12.A0D) {
                    r12.A0D = false;
                    z = true;
                }
            } else if (!r12.A0D) {
                z = true;
                r12.A0D = true;
            }
            C003901s.A01(r12, z);
        }
        if ((i2 & 256) != 0 && this.A09 != null) {
            AnonymousClass1HF.A0T(this);
        }
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.A07 = i;
        C003801r r0 = this.A09;
        if (r0 != null) {
            ((C003901s) r0).A00 = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        A01();
        this.A02.setTranslationY((float) (-Math.max(0, Math.min(i, this.A02.getHeight()))));
    }

    public void setIcon(Drawable drawable) {
        A02();
        AnonymousClass03K r0 = (AnonymousClass03K) this.A0B;
        r0.A03 = drawable;
        AnonymousClass03K.A00(r0);
    }

    public void setLogo(int i) {
        A02();
        this.A0B.CJM(i);
    }

    public void setMenu(Menu menu, C004301w r3) {
        A02();
        this.A0B.setMenu(menu, r3);
    }

    public void setWindowCallback(Window.Callback callback) {
        A02();
        ((AnonymousClass03K) this.A0B).A07 = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        A02();
        AnonymousClass03K r1 = (AnonymousClass03K) this.A0B;
        if (!r1.A0D) {
            AnonymousClass03K.A01(r1, charSequence);
        }
    }

    public void Byy(View view, int[] iArr, int i, int i2, int i3) {
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof AnonymousClass05B;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.A0G = z;
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(int i) {
        A02();
        this.A0B.setIcon(i);
    }
}
