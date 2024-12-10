package androidx.swiperefreshlayout.widget;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1Xr;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.BE6;
import X.BEB;
import X.BFC;
import X.BHw;
import X.C108985cd;
import X.C19740yt;
import X.C22653BHv;
import X.C22657BIh;
import X.C37861qG;
import X.C37901qL;
import X.C38201qr;
import X.C72473Md;
import X.CUQ;
import X.D5M;
import X.E0L;
import X.E3e;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;

public class SwipeRefreshLayout extends ViewGroup implements C37901qL {
    public static final int[] A0Z;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public View A07;
    public Animation A08;
    public Animation A09;
    public Animation A0A;
    public Animation A0B;
    public C22657BIh A0C;
    public BFC A0D;
    public E3e A0E;
    public boolean A0F;
    public boolean A0G;
    public float A0H;
    public float A0I;
    public float A0J;
    public float A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public Animation.AnimationListener A0O;
    public E0L A0P;
    public boolean A0Q;
    public boolean A0R;
    public final Animation A0S;
    public final Animation A0T;
    public final DecelerateInterpolator A0U;
    public final C38201qr A0V;
    public final C37861qG A0W;
    public final int[] A0X;
    public final int[] A0Y;

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        float f;
        if (i2 > 0) {
            float f2 = this.A0K;
            if (f2 > 0.0f) {
                float f3 = (float) i2;
                if (f3 > f2) {
                    iArr[1] = i2 - ((int) f2);
                    this.A0K = 0.0f;
                    f = 0.0f;
                } else {
                    f = f2 - f3;
                    this.A0K = f;
                    iArr[1] = i2;
                }
                A02(f);
            }
        }
        int[] iArr2 = this.A0Y;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            BE6.A1A(0, iArr[0], iArr2, iArr);
            BE6.A1A(1, iArr[1], iArr2, iArr);
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        boolean canScrollVertically;
        int[] iArr = this.A0X;
        dispatchNestedScroll(i, i2, i3, i4, iArr);
        int i5 = i4 + iArr[1];
        if (i5 < 0) {
            View view2 = this.A07;
            if (view2 instanceof ListView) {
                canScrollVertically = ((AbsListView) view2).canScrollList(-1);
            } else {
                canScrollVertically = view2.canScrollVertically(-1);
            }
            if (!canScrollVertically) {
                float abs = this.A0K + ((float) Math.abs(i5));
                this.A0K = abs;
                A02(abs);
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.A0J = (float) i;
    }

    public void setRefreshing(boolean z) {
        if (!z || this.A0G == z) {
            A04(this, z, false);
            return;
        }
        this.A0G = z;
        setTargetOffsetTopAndBottom((this.A06 + this.A05) - this.A01);
        this.A0F = false;
        Animation.AnimationListener animationListener = this.A0O;
        C22657BIh bIh = this.A0C;
        bIh.setVisibility(0);
        this.A0D.setAlpha(255);
        C22653BHv bHv = new C22653BHv(this, 0);
        this.A0A = bHv;
        bHv.setDuration((long) this.A04);
        if (animationListener != null) {
            bIh.A00 = animationListener;
        }
        bIh.clearAnimation();
        bIh.startAnimation(this.A0A);
    }

    private void A00() {
        if (this.A07 == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.A0C)) {
                    this.A07 = childAt;
                    return;
                }
            }
        }
    }

    private void A01(float f) {
        if (f > this.A0J) {
            A04(this, true, true);
            return;
        }
        this.A0G = false;
        BFC bfc = this.A0D;
        CUQ cuq = bfc.A05;
        cuq.A04 = 0.0f;
        cuq.A01 = 0.0f;
        bfc.invalidateSelf();
        D5M d5m = new D5M(this, 1);
        this.A03 = this.A01;
        Animation animation = this.A0T;
        animation.reset();
        animation.setDuration(200);
        animation.setInterpolator(this.A0U);
        C22657BIh bIh = this.A0C;
        bIh.A00 = d5m;
        bIh.clearAnimation();
        bIh.startAnimation(animation);
        if (cuq.A0F) {
            cuq.A0F = false;
        }
        bfc.invalidateSelf();
    }

    private void A02(float f) {
        Animation animation;
        Animation animation2;
        BFC bfc = this.A0D;
        CUQ cuq = bfc.A05;
        if (!cuq.A0F) {
            cuq.A0F = true;
        }
        bfc.invalidateSelf();
        float f2 = this.A0J;
        float min = Math.min(1.0f, Math.abs(f / f2));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - f2;
        int i = this.A02;
        if (i <= 0) {
            i = this.A06;
        }
        float f3 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f3 * 2.0f) / f3) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.A05 + ((int) ((f3 * min) + (f3 * pow * 2.0f)));
        C22657BIh bIh = this.A0C;
        if (bIh.getVisibility() != 0) {
            bIh.setVisibility(0);
        }
        bIh.setScaleX(1.0f);
        bIh.setScaleY(1.0f);
        int i3 = (f > this.A0J ? 1 : (f == this.A0J ? 0 : -1));
        int i4 = cuq.A09;
        if (i3 < 0) {
            if (i4 > 76 && ((animation2 = this.A09) == null || !animation2.hasStarted() || animation2.hasEnded())) {
                BHw bHw = new BHw(this, cuq.A09, 76);
                bHw.setDuration(300);
                bIh.A00 = null;
                bIh.clearAnimation();
                bIh.startAnimation(bHw);
                this.A09 = bHw;
            }
        } else if (i4 < 255 && ((animation = this.A08) == null || !animation.hasStarted() || animation.hasEnded())) {
            BHw bHw2 = new BHw(this, cuq.A09, 255);
            bHw2.setDuration(300);
            bIh.A00 = null;
            bIh.clearAnimation();
            bIh.startAnimation(bHw2);
            this.A08 = bHw2;
        }
        float min2 = Math.min(0.8f, max * 0.8f);
        cuq.A04 = 0.0f;
        cuq.A01 = min2;
        bfc.invalidateSelf();
        float min3 = Math.min(1.0f, max);
        if (min3 != cuq.A00) {
            cuq.A00 = min3;
        }
        bfc.invalidateSelf();
        cuq.A03 = (((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f;
        bfc.invalidateSelf();
        setTargetOffsetTopAndBottom(i2 - this.A01);
    }

    private void A03(float f) {
        float f2 = this.A0H;
        float f3 = (float) this.A0N;
        if (f - f2 > f3 && !this.A0Q) {
            this.A0I = f2 + f3;
            this.A0Q = true;
            this.A0D.setAlpha(76);
        }
    }

    public static void A04(SwipeRefreshLayout swipeRefreshLayout, boolean z, boolean z2) {
        if (swipeRefreshLayout.A0G != z) {
            swipeRefreshLayout.A0F = z2;
            swipeRefreshLayout.A00();
            swipeRefreshLayout.A0G = z;
            if (z) {
                int i = swipeRefreshLayout.A01;
                Animation.AnimationListener animationListener = swipeRefreshLayout.A0O;
                swipeRefreshLayout.A03 = i;
                Animation animation = swipeRefreshLayout.A0S;
                animation.reset();
                animation.setDuration(200);
                animation.setInterpolator(swipeRefreshLayout.A0U);
                if (animationListener != null) {
                    swipeRefreshLayout.A0C.A00 = animationListener;
                }
                C22657BIh bIh = swipeRefreshLayout.A0C;
                bIh.clearAnimation();
                bIh.startAnimation(animation);
                return;
            }
            Animation.AnimationListener animationListener2 = swipeRefreshLayout.A0O;
            C22653BHv bHv = new C22653BHv(swipeRefreshLayout, 1);
            swipeRefreshLayout.A0B = bHv;
            bHv.setDuration(150);
            C22657BIh bIh2 = swipeRefreshLayout.A0C;
            bIh2.A00 = animationListener2;
            bIh2.clearAnimation();
            bIh2.startAnimation(swipeRefreshLayout.A0B);
        }
    }

    private void setColorViewAlpha(int i) {
        this.A0C.getBackground().setAlpha(i);
        this.A0D.setAlpha(i);
    }

    public void A05() {
        C22657BIh bIh = this.A0C;
        bIh.clearAnimation();
        this.A0D.stop();
        bIh.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.A05 - this.A01);
        this.A01 = bIh.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0V.A0C(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0V.A0B(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0V.A0E(iArr, iArr2, i, i2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return C38201qr.A08(this.A0V, iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.A0M;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            return i2 + 1;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        C37861qG r0 = this.A0W;
        return r0.A01 | r0.A00;
    }

    public int getProgressCircleDiameter() {
        return this.A0L;
    }

    public int getProgressViewEndOffset() {
        return this.A06;
    }

    public int getProgressViewStartOffset() {
        return this.A05;
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1W(this.A0V.A01);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A0V.A02;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0V.A0B(f, f2);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.A0W.A01 = i;
        startNestedScroll(i & 2);
        this.A0K = 0.0f;
        this.A0R = true;
    }

    public void onStopNestedScroll(View view) {
        this.A0W.A01 = 0;
        this.A0R = false;
        float f = this.A0K;
        if (f > 0.0f) {
            A01(f);
            this.A0K = 0.0f;
        }
        stopNestedScroll();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.A07;
        if (view == null || AnonymousClass1Xr.A06(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setAnimationProgress(float f) {
        C22657BIh bIh = this.A0C;
        bIh.setScaleX(f);
        bIh.setScaleY(f);
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A0V.A0A(z);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.A0C.setBackgroundColor(i);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics A092 = AnonymousClass3Ma.A09(this);
            float f = 40.0f;
            if (i == 0) {
                f = 56.0f;
            }
            this.A0L = (int) (A092.density * f);
            C22657BIh bIh = this.A0C;
            bIh.setImageDrawable((Drawable) null);
            BFC bfc = this.A0D;
            bfc.A00(i);
            bIh.setImageDrawable(bfc);
        }
    }

    public void setTargetOffsetTopAndBottom(int i) {
        C22657BIh bIh = this.A0C;
        bIh.bringToFront();
        AnonymousClass1HF.A0a(bIh, i);
        this.A01 = bIh.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.A0V.A0D(i, 0);
    }

    public void stopNestedScroll() {
        this.A0V.A09(0);
    }

    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 16842766;
        A0Z = A1X;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.BIh, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Object, X.1qG] */
    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0G = false;
        this.A0J = -1.0f;
        this.A0Y = new int[2];
        this.A0X = new int[2];
        this.A00 = -1;
        this.A0M = -1;
        this.A0O = new D5M(this, 0);
        this.A0S = new C22653BHv(this, 2);
        this.A0T = new C22653BHv(this, 3);
        this.A0N = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A04 = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.A0U = new DecelerateInterpolator(2.0f);
        DisplayMetrics A092 = AnonymousClass3Ma.A09(this);
        this.A0L = (int) (A092.density * 40.0f);
        ? imageView = new ImageView(getContext());
        float A002 = C72473Md.A00(imageView);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        AnonymousClass1HF.A0W(imageView, A002 * 4.0f);
        shapeDrawable.getPaint().setColor(-328966);
        imageView.setBackground(shapeDrawable);
        this.A0C = imageView;
        Interpolator interpolator = BFC.A07;
        BFC bfc = new BFC(getContext());
        this.A0D = bfc;
        bfc.A00(1);
        this.A0C.setImageDrawable(this.A0D);
        this.A0C.setVisibility(8);
        addView(this.A0C);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (A092.density * 64.0f);
        this.A06 = i;
        this.A0J = (float) i;
        this.A0W = new Object();
        this.A0V = new C38201qr(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.A0L;
        this.A01 = i2;
        this.A05 = i2;
        BEB.A0s(this, 1.0f, i2, this.A03);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0Z);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A05();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean canScrollVertically;
        A00();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            View view = this.A07;
            if (view instanceof ListView) {
                canScrollVertically = ((AbsListView) view).canScrollList(-1);
            } else {
                canScrollVertically = view.canScrollVertically(-1);
            }
            if (!canScrollVertically && !this.A0G && !this.A0R) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i = this.A00;
                            if (i == -1) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                                return false;
                            }
                            int findPointerIndex = motionEvent.findPointerIndex(i);
                            if (findPointerIndex >= 0) {
                                A03(motionEvent.getY(findPointerIndex));
                            }
                        } else if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == this.A00) {
                                    this.A00 = motionEvent.getPointerId(AnonymousClass000.A1P(actionIndex) ? 1 : 0);
                                }
                            }
                        }
                    }
                    this.A0Q = false;
                    this.A00 = -1;
                } else {
                    setTargetOffsetTopAndBottom(this.A05 - this.A0C.getTop());
                    int pointerId = motionEvent.getPointerId(0);
                    this.A00 = pointerId;
                    this.A0Q = false;
                    int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                    if (findPointerIndex2 >= 0) {
                        this.A0H = motionEvent.getY(findPointerIndex2);
                    }
                }
                return this.A0Q;
            }
        }
        return false;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.A07 == null) {
                A00();
            }
            View view = this.A07;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, C72473Md.A07(this, measuredWidth) + paddingLeft, C108985cd.A07(this, measuredHeight) + paddingTop);
                C22657BIh bIh = this.A0C;
                int measuredWidth2 = bIh.getMeasuredWidth();
                int measuredHeight2 = bIh.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.A01;
                bIh.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A07 == null) {
            A00();
        }
        View view = this.A07;
        if (view != null) {
            AnonymousClass3MY.A1C(view, C108985cd.A07(this, getMeasuredHeight()), 1073741824, View.MeasureSpec.makeMeasureSpec(C72473Md.A07(this, getMeasuredWidth()), 1073741824));
            C22657BIh bIh = this.A0C;
            AnonymousClass3MY.A1C(bIh, this.A0L, 1073741824, View.MeasureSpec.makeMeasureSpec(this.A0L, 1073741824));
            this.A0M = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == bIh) {
                    this.A0M = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!isEnabled() || this.A0G || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean canScrollVertically;
        String str;
        String str2;
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled()) {
            View view = this.A07;
            if (view instanceof ListView) {
                canScrollVertically = ((AbsListView) view).canScrollList(-1);
            } else {
                canScrollVertically = view.canScrollVertically(-1);
            }
            if (!canScrollVertically && !this.A0G && !this.A0R) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.A00);
                            if (findPointerIndex < 0) {
                                str = "SwipeRefreshLayout";
                                str2 = "Got ACTION_MOVE event but have an invalid active pointer id.";
                            } else {
                                float y = motionEvent.getY(findPointerIndex);
                                A03(y);
                                if (this.A0Q) {
                                    float f = (y - this.A0I) * 0.5f;
                                    if (f > 0.0f) {
                                        A02(f);
                                        return true;
                                    }
                                }
                            }
                        } else if (actionMasked != 3) {
                            if (actionMasked == 5) {
                                actionIndex = motionEvent.getActionIndex();
                                if (actionIndex < 0) {
                                    str = "SwipeRefreshLayout";
                                    str2 = "Got ACTION_POINTER_DOWN event but have an invalid action index.";
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex2 = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex2) == this.A00) {
                                    actionIndex = AnonymousClass000.A1P(actionIndex2);
                                }
                            }
                            this.A00 = motionEvent.getPointerId(actionIndex);
                        }
                        return true;
                    }
                    int findPointerIndex2 = motionEvent.findPointerIndex(this.A00);
                    if (findPointerIndex2 < 0) {
                        str = "SwipeRefreshLayout";
                        str2 = "Got ACTION_UP event but don't have an active pointer id.";
                    } else {
                        if (this.A0Q) {
                            this.A0Q = false;
                            A01((motionEvent.getY(findPointerIndex2) - this.A0I) * 0.5f);
                        }
                        this.A00 = -1;
                    }
                    Log.e(str, str2);
                    return false;
                }
                this.A00 = motionEvent.getPointerId(0);
                this.A0Q = false;
                return true;
            }
        }
        return false;
    }

    public void setColorSchemeColors(int... iArr) {
        A00();
        BFC bfc = this.A0D;
        CUQ cuq = bfc.A05;
        cuq.A0G = iArr;
        cuq.A0C = 0;
        int i = iArr[0];
        cuq.A0D = i;
        cuq.A0C = 0;
        cuq.A0D = i;
        bfc.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            iArr2[i] = C19740yt.A00(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            A05();
        }
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C19740yt.A00(getContext(), i));
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setOnChildScrollUpCallback(E0L e0l) {
        this.A0P = e0l;
    }

    public void setOnRefreshListener(E3e e3e) {
        this.A0E = e3e;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setSlingshotDistance(int i) {
        this.A02 = i;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
