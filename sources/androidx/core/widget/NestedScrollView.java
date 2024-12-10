package androidx.core.widget;

import X.A7Y;
import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1XU;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.BE6;
import X.BE8;
import X.BE9;
import X.BEA;
import X.BHL;
import X.C108945cZ;
import X.C108965cb;
import X.C108985cd;
import X.C22666BJh;
import X.C25863CnS;
import X.C37831qC;
import X.C37861qG;
import X.C37901qL;
import X.C38201qr;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C7Q;
import X.CTR;
import X.D6S;
import X.E3d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;

public class NestedScrollView extends FrameLayout implements C37831qC, C37901qL {
    public static final float A0T = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final C22666BJh A0U = new AnonymousClass1XU();
    public static final int[] A0V;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public EdgeEffect A07;
    public EdgeEffect A08;
    public OverScroller A09;
    public CTR A0A;
    public E3d A0B;
    public boolean A0C;
    public boolean A0D;
    public float A0E;
    public int A0F;
    public long A0G;
    public View A0H;
    public BHL A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final float A0M;
    public final Rect A0N;
    public final C38201qr A0O;
    public final D6S A0P;
    public final C37861qG A0Q;
    public final int[] A0R;
    public final int[] A0S;

    public static boolean A09(View view, View view2) {
        if (view != view2) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || !A09((View) parent, view2)) {
                return false;
            }
        }
        return true;
    }

    private boolean A0B(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float A002 = A00(edgeEffect) * C108945cZ.A04(this);
        float f = this.A0M * 0.015f;
        double log = Math.log((double) ((((float) Math.abs(-i)) * 0.35f) / f));
        double d = (double) A0T;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0 < 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(int r7) {
        /*
            r6 = this;
            r5 = 1
            r1 = 0
            r0 = 130(0x82, float:1.82E-43)
            boolean r4 = X.AnonymousClass000.A1T(r7, r0)
            int r3 = r6.getHeight()
            android.graphics.Rect r2 = r6.A0N
            int r0 = r6.getScrollY()
            if (r4 == 0) goto L_0x0039
            int r0 = r0 + r3
            r2.top = r0
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x002f
            int r0 = r0 - r5
            int r1 = X.BEA.A08(r6, r0)
            int r0 = r6.getPaddingBottom()
            int r1 = r1 + r0
            int r0 = r2.top
            int r0 = r0 + r3
            if (r0 <= r1) goto L_0x002f
            int r1 = r1 - r3
        L_0x002d:
            r2.top = r1
        L_0x002f:
            int r1 = r2.top
            int r0 = r1 + r3
            r2.bottom = r0
            r6.A06(r7, r1, r0)
            return
        L_0x0039:
            int r0 = r0 - r3
            r2.top = r0
            if (r0 >= 0) goto L_0x002f
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A0E(int):void");
    }

    public final void A0F(int i) {
        A05(this, -getScrollX(), i - getScrollY(), false);
    }

    public void Byy(View view, int[] iArr, int i, int i2, int i3) {
        this.A0O.A0E(iArr, (int[]) null, i, i2, i3);
    }

    public void Byz(View view, int i, int i2, int i3, int i4, int i5) {
        A03(i4, (int[]) null, i5);
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.A0O.A0E(iArr, iArr2, i, i2, 0);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        Byy(view, iArr, i, i2, 0);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        A03(i4, (int[]) null, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        Bz1(view, view2, i, 0);
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = instance.findNextFocus(this, (View) null, i);
        } else {
            findNextFocusFromRect = instance.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (!A08(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    public void onStopNestedScroll(View view) {
        C73(view, 0);
    }

    public void requestLayout() {
        this.A0L = true;
        super.requestLayout();
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i) {
        return this.A0O.A0D(i, 0);
    }

    public void stopNestedScroll() {
        this.A0O.A09(0);
    }

    public static float A00(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C25863CnS.A00(edgeEffect);
        }
        return 0.0f;
    }

    public static float A01(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C25863CnS.A01(edgeEffect, f, f2);
        }
        C7Q.A00(edgeEffect, f, f2);
        return f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r29 != false) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ea A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A02(int r26, int r27, int r28, boolean r29) {
        /*
            r25 = this;
            r1 = r26
            r3 = 1
            r2 = r25
            r4 = r28
            if (r4 != r3) goto L_0x000f
            r5 = 2
            X.1qr r0 = r2.A0O
            r0.A0D(r5, r3)
        L_0x000f:
            int[] r13 = r2.A0R
            int[] r12 = r2.A0S
            r22 = 0
            X.1qr r11 = r2.A0O
            r19 = r11
            r20 = r13
            r21 = r12
            r23 = r1
            r24 = r4
            boolean r0 = r19.A0E(r20, r21, r22, r23, r24)
            r14 = 0
            if (r0 == 0) goto L_0x002e
            r0 = r13[r3]
            int r1 = r26 - r0
            r22 = r12[r3]
        L_0x002e:
            int r6 = r2.getScrollY()
            int r5 = r2.getScrollRange()
            int r0 = r2.getOverScrollMode()
            if (r0 == 0) goto L_0x0044
            if (r0 != r3) goto L_0x0047
            int r0 = r2.getScrollRange()
            if (r0 <= 0) goto L_0x0047
        L_0x0044:
            r10 = 1
            if (r29 == 0) goto L_0x0048
        L_0x0047:
            r10 = 0
        L_0x0048:
            r9 = 0
            r2.getOverScrollMode()
            r2.computeHorizontalScrollRange()
            r2.computeHorizontalScrollExtent()
            r2.computeVerticalScrollRange()
            r2.computeVerticalScrollExtent()
            int r8 = r6 + r1
            if (r8 <= r5) goto L_0x0109
            r8 = r5
        L_0x005d:
            r7 = 1
            android.view.ViewParent r0 = r11.A00
            if (r0 != 0) goto L_0x0076
            android.widget.OverScroller r0 = r2.A09
            int r21 = r2.getScrollRange()
            r18 = r14
            r19 = r14
            r20 = r14
            r15 = r0
            r16 = r14
            r17 = r8
            r15.springBack(r16, r17, r18, r19, r20, r21)
        L_0x0076:
            r2.onOverScrolled(r14, r8, r14, r7)
            if (r7 == 0) goto L_0x0082
            if (r28 == 0) goto L_0x0105
            android.view.ViewParent r0 = r11.A00
        L_0x007f:
            if (r0 != 0) goto L_0x0082
            r9 = 1
        L_0x0082:
            int r15 = r2.getScrollY()
            int r15 = r15 - r6
            int r17 = r1 - r15
            r13[r3] = r14
            r16 = r14
            r18 = r4
            X.C38201qr.A08(r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r12[r3]
            int r22 = r22 + r0
            r0 = r13[r3]
            int r1 = r1 - r0
            int r6 = r6 + r1
            r7 = r27
            if (r6 >= 0) goto L_0x00ea
            if (r10 == 0) goto L_0x00bd
            android.widget.EdgeEffect r6 = r2.A08
            int r0 = -r1
            float r5 = (float) r0
            float r0 = X.C108945cZ.A04(r2)
            float r5 = r5 / r0
            float r1 = (float) r7
            float r0 = X.C108945cZ.A03(r2)
            float r1 = r1 / r0
            A01(r6, r5, r1)
            android.widget.EdgeEffect r1 = r2.A07
        L_0x00b4:
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x00bd
            r1.onRelease()
        L_0x00bd:
            android.widget.EdgeEffect r1 = r2.A08
            boolean r0 = r1.isFinished()
            if (r0 == 0) goto L_0x00d9
            android.widget.EdgeEffect r0 = r2.A07
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L_0x00d9
            if (r9 == 0) goto L_0x00dc
            if (r28 != 0) goto L_0x00dc
            android.view.VelocityTracker r0 = r2.A06
            if (r0 == 0) goto L_0x00d8
            r0.clear()
        L_0x00d8:
            return r22
        L_0x00d9:
            r2.postInvalidateOnAnimation()
        L_0x00dc:
            if (r4 != r3) goto L_0x00d8
            r11.A09(r3)
            r1.onRelease()
            android.widget.EdgeEffect r0 = r2.A07
            r0.onRelease()
            return r22
        L_0x00ea:
            if (r6 <= r5) goto L_0x00bd
            if (r10 == 0) goto L_0x00bd
            android.widget.EdgeEffect r6 = r2.A07
            float r5 = (float) r1
            float r0 = X.C108945cZ.A04(r2)
            float r5 = r5 / r0
            float r1 = (float) r7
            float r0 = X.C108945cZ.A03(r2)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            A01(r6, r5, r0)
            android.widget.EdgeEffect r1 = r2.A08
            goto L_0x00b4
        L_0x0105:
            android.view.ViewParent r0 = r11.A01
            goto L_0x007f
        L_0x0109:
            if (r8 >= r14) goto L_0x010e
            r8 = 0
            goto L_0x005d
        L_0x010e:
            r7 = 0
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A02(int, int, int, boolean):int");
    }

    public static void A05(NestedScrollView nestedScrollView, int i, int i2, boolean z) {
        if (nestedScrollView.getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - nestedScrollView.A0G > 250) {
                View childAt = nestedScrollView.getChildAt(0);
                int A092 = BE9.A09(childAt, AnonymousClass3MW.A0B(childAt));
                int A042 = C72473Md.A04(nestedScrollView);
                int scrollY = nestedScrollView.getScrollY();
                OverScroller overScroller = nestedScrollView.A09;
                int scrollX = nestedScrollView.getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, BE8.A07(i2 + scrollY, Math.max(0, A092 - A042), 0) - scrollY, 250);
                if (z) {
                    nestedScrollView.A0O.A0D(2, 1);
                } else {
                    nestedScrollView.A0O.A09(1);
                }
                nestedScrollView.A02 = nestedScrollView.getScrollY();
                nestedScrollView.postInvalidateOnAnimation();
            } else {
                OverScroller overScroller2 = nestedScrollView.A09;
                if (!overScroller2.isFinished()) {
                    overScroller2.abortAnimation();
                    nestedScrollView.A0O.A09(1);
                }
                nestedScrollView.scrollBy(i, i2);
            }
            nestedScrollView.A0G = AnimationUtils.currentAnimationTimeMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r2 >= r0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A06(int r19, int r20, int r21) {
        /*
            r18 = this;
            r13 = r20
            r11 = r18
            int r10 = r11.getHeight()
            int r9 = r11.getScrollY()
            int r10 = r10 + r9
            r0 = 33
            r8 = 0
            r7 = 1
            r12 = r19
            boolean r17 = X.AnonymousClass000.A1T(r12, r0)
            r0 = 2
            java.util.ArrayList r6 = r11.getFocusables(r0)
            int r5 = r6.size()
            r4 = 0
            r3 = 0
            r16 = 0
        L_0x0024:
            r0 = r21
            if (r3 >= r5) goto L_0x0065
            android.view.View r15 = X.BE6.A0R(r6, r3)
            int r14 = r15.getTop()
            int r2 = r15.getBottom()
            if (r13 >= r2) goto L_0x0043
            if (r14 >= r0) goto L_0x0043
            if (r13 >= r14) goto L_0x003d
            r1 = 1
            if (r2 < r0) goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r4 != 0) goto L_0x0046
            r4 = r15
            r16 = r1
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0046:
            if (r17 == 0) goto L_0x005d
            int r0 = r4.getTop()
            if (r14 < r0) goto L_0x0063
        L_0x004e:
            r0 = 0
        L_0x004f:
            if (r16 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x0043
        L_0x0053:
            if (r0 == 0) goto L_0x0043
            r4 = r15
            goto L_0x0043
        L_0x0057:
            if (r1 == 0) goto L_0x0053
            r4 = r15
            r16 = 1
            goto L_0x0043
        L_0x005d:
            int r0 = r4.getBottom()
            if (r2 <= r0) goto L_0x004e
        L_0x0063:
            r0 = 1
            goto L_0x004f
        L_0x0065:
            if (r4 != 0) goto L_0x0068
            r4 = r11
        L_0x0068:
            if (r13 < r9) goto L_0x0076
            if (r0 > r10) goto L_0x0076
        L_0x006c:
            android.view.View r0 = r11.findFocus()
            if (r4 == r0) goto L_0x0075
            r4.requestFocus(r12)
        L_0x0075:
            return r8
        L_0x0076:
            int r13 = r20 - r9
            if (r17 != 0) goto L_0x007c
            int r13 = r21 - r10
        L_0x007c:
            r11.A02(r13, r8, r7, r7)
            r8 = 1
            goto L_0x006c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.A06(int, int, int):boolean");
    }

    private boolean A07(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.A08;
        if (A00(edgeEffect) != 0.0f) {
            A01(edgeEffect, 0.0f, motionEvent.getX() / C108945cZ.A03(this));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (A00(edgeEffect2) == 0.0f) {
            return z;
        }
        A01(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / C108945cZ.A03(this)));
        return true;
    }

    private boolean A08(View view, int i, int i2) {
        Rect rect = this.A0N;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i < getScrollY() || rect.top - i > getScrollY() + i2) {
            return false;
        }
        return true;
    }

    public boolean A0H(KeyEvent keyEvent) {
        Rect rect = this.A0N;
        rect.setEmpty();
        boolean z = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (BE9.A09(childAt, AnonymousClass3MW.A0B(childAt)) > C72473Md.A04(this)) {
                z = true;
            }
        }
        int i = 130;
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        } else if (keyEvent.getAction() != 0) {
            return false;
        } else {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode == 122) {
                                    A0E(33);
                                    return false;
                                } else if (keyCode != 123) {
                                    return false;
                                }
                            }
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        i = 33;
                    }
                    A0E(i);
                    return false;
                } else if (!keyEvent.isAltPressed()) {
                    return A0G(130);
                }
                int height = getHeight();
                rect.top = 0;
                rect.bottom = height;
                int childCount = getChildCount();
                if (childCount > 0) {
                    int A082 = BEA.A08(this, childCount - 1) + getPaddingBottom();
                    rect.bottom = A082;
                    rect.top = A082 - height;
                }
                return A06(130, rect.top, rect.bottom);
            } else if (!keyEvent.isAltPressed()) {
                return A0G(33);
            }
            int height2 = getHeight();
            rect.top = 0;
            rect.bottom = height2;
            return A06(33, 0, height2);
        }
    }

    public void Bz1(View view, View view2, int i, int i2) {
        C37861qG r1 = this.A0Q;
        if (i2 == 1) {
            r1.A00 = i;
        } else {
            r1.A01 = i;
        }
        this.A0O.A0D(2, i2);
    }

    public boolean C6L(View view, View view2, int i, int i2) {
        return AnonymousClass000.A1O(i & 2);
    }

    public void C73(View view, int i) {
        C37861qG r2 = this.A0Q;
        if (i == 1) {
            r2.A00 = 0;
        } else {
            r2.A01 = 0;
        }
        this.A0O.A09(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void computeScroll() {
        /*
            r22 = this;
            r2 = r22
            android.widget.OverScroller r3 = r2.A09
            boolean r0 = r3.isFinished()
            if (r0 != 0) goto L_0x00df
            r3.computeScrollOffset()
            int r7 = r3.getCurrY()
            int r0 = r2.A02
            int r1 = r7 - r0
            int r4 = r2.getHeight()
            r8 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r9 = 1082130432(0x40800000, float:4.0)
            if (r1 <= 0) goto L_0x00e9
            android.widget.EdgeEffect r6 = r2.A08
            float r0 = A00(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            int r0 = -r1
            float r5 = (float) r0
            float r5 = r5 * r9
            float r0 = (float) r4
            float r5 = r5 / r0
            int r0 = -r4
            float r4 = (float) r0
            float r4 = r4 / r9
            float r0 = A01(r6, r5, r8)
        L_0x0036:
            int r0 = X.BE6.A04(r4, r0)
            if (r0 == r1) goto L_0x003f
            r6.finish()
        L_0x003f:
            int r1 = r1 - r0
        L_0x0040:
            r2.A02 = r7
            int[] r13 = r2.A0R
            r4 = 1
            r14 = 0
            r13[r4] = r14
            r17 = 0
            X.1qr r11 = r2.A0O
            r10 = 0
            r15 = r11
            r16 = r13
            r18 = r14
            r19 = r1
            r20 = r4
            r15.A0E(r16, r17, r18, r19, r20)
            r0 = r13[r4]
            int r1 = r1 - r0
            int r7 = r2.getScrollRange()
            if (r1 == 0) goto L_0x00d6
            int r9 = r2.getScrollY()
            int r8 = r2.getScrollX()
            r2.getOverScrollMode()
            r2.computeHorizontalScrollRange()
            r2.computeHorizontalScrollExtent()
            r2.computeVerticalScrollRange()
            r2.computeVerticalScrollExtent()
            int r6 = r9 + r1
            if (r8 > r14) goto L_0x007f
            if (r8 >= r14) goto L_0x0081
        L_0x007f:
            r8 = 0
            r10 = 1
        L_0x0081:
            if (r6 <= r7) goto L_0x00e3
            r6 = r7
        L_0x0084:
            r5 = 1
            android.view.ViewParent r0 = r11.A00
            if (r0 != 0) goto L_0x0099
            int r21 = r2.getScrollRange()
            r19 = r14
            r20 = r14
            r16 = r14
            r17 = r6
            r15 = r3
            r15.springBack(r16, r17, r18, r19, r20, r21)
        L_0x0099:
            r2.onOverScrolled(r8, r6, r10, r5)
            int r15 = r2.getScrollY()
            int r15 = r15 - r9
            int r1 = r1 - r15
            r13[r4] = r14
            int[] r12 = r2.A0S
            r16 = r14
            r18 = r4
            r17 = r1
            X.C38201qr.A08(r11, r12, r13, r14, r15, r16, r17, r18)
            r0 = r13[r4]
            int r1 = r1 - r0
            if (r1 == 0) goto L_0x00d6
            int r0 = r2.getOverScrollMode()
            if (r0 == 0) goto L_0x00be
            if (r0 != r4) goto L_0x00d0
            if (r7 <= 0) goto L_0x00d0
        L_0x00be:
            if (r1 >= 0) goto L_0x00e0
            android.widget.EdgeEffect r1 = r2.A08
        L_0x00c2:
            boolean r0 = r1.isFinished()
            if (r0 == 0) goto L_0x00d0
            float r0 = r3.getCurrVelocity()
            int r0 = (int) r0
            r1.onAbsorb(r0)
        L_0x00d0:
            r3.abortAnimation()
            r11.A09(r4)
        L_0x00d6:
            boolean r0 = r3.isFinished()
            if (r0 != 0) goto L_0x0100
            r2.postInvalidateOnAnimation()
        L_0x00df:
            return
        L_0x00e0:
            android.widget.EdgeEffect r1 = r2.A07
            goto L_0x00c2
        L_0x00e3:
            if (r6 >= r14) goto L_0x00e7
            r6 = 0
            goto L_0x0084
        L_0x00e7:
            r5 = 0
            goto L_0x0099
        L_0x00e9:
            if (r1 >= 0) goto L_0x0040
            android.widget.EdgeEffect r6 = r2.A07
            float r0 = A00(r6)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
            float r0 = (float) r1
            float r0 = r0 * r9
            float r4 = (float) r4
            float r0 = r0 / r4
            float r4 = r4 / r9
            float r0 = A01(r6, r0, r8)
            goto L_0x0036
        L_0x0100:
            r11.A09(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A0O.A0C(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.A0O.A0B(f, f2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return C38201qr.A08(this.A0O, iArr, (int[]) null, i, i2, i3, i4, 0);
    }

    public int getNestedScrollAxes() {
        C37861qG r0 = this.A0Q;
        return r0.A01 | r0.A00;
    }

    public float getVerticalScrollFactorCompat() {
        float f = this.A0E;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            float dimension = typedValue.getDimension(C108965cb.A08(context));
            this.A0E = dimension;
            return dimension;
        }
        throw AnonymousClass000.A0n("Expected theme to define listPreferredItemHeight.");
    }

    public boolean hasNestedScrollingParent() {
        return AnonymousClass000.A1W(this.A0O.A01);
    }

    public boolean isNestedScrollingEnabled() {
        return this.A0O.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onGenericMotionEvent(android.view.MotionEvent r24) {
        /*
            r23 = this;
            r2 = r24
            int r1 = r2.getAction()
            r0 = 8
            r7 = 0
            if (r1 != r0) goto L_0x0071
            r5 = r23
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x0071
            r1 = 2
            int r0 = r2.getSource()
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            r3 = 0
            if (r0 == 0) goto L_0x01ca
            r6 = 9
            float r1 = r2.getAxisValue(r6)
            float r0 = r2.getX()
            int r4 = (int) r0
        L_0x002a:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0071
            float r0 = r5.getVerticalScrollFactorCompat()
            float r1 = r1 * r0
            int r3 = (int) r1
            r1 = 8194(0x2002, float:1.1482E-41)
            int r0 = r2.getSource()
            r0 = r0 & r1
            boolean r1 = X.AnonymousClass000.A1T(r0, r1)
            int r0 = -r3
            r7 = 1
            r5.A02(r0, r4, r7, r1)
            X.CTR r5 = r5.A0A
            int r9 = r2.getSource()
            int r8 = r2.getDeviceId()
            int r0 = r5.A03
            if (r0 != r9) goto L_0x019b
            int r0 = r5.A02
            if (r0 != r8) goto L_0x019b
            int r0 = r5.A01
            if (r0 != r6) goto L_0x019b
            r22 = 0
        L_0x005c:
            int[] r4 = r5.A07
            r21 = 0
            r1 = r4[r21]
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0072
            android.view.VelocityTracker r0 = r5.A04
            if (r0 == 0) goto L_0x0071
            r0.recycle()
            r0 = 0
            r5.A04 = r0
        L_0x0071:
            return r7
        L_0x0072:
            android.view.VelocityTracker r3 = r5.A04
            if (r3 != 0) goto L_0x007c
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r5.A04 = r3
        L_0x007c:
            X.C25899CoA.A01(r2, r3)
            r0 = 1000(0x3e8, float:1.401E-42)
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.computeCurrentVelocity(r0, r8)
            java.util.Map r0 = X.C25899CoA.A00
            java.lang.Object r2 = r0.get(r3)
            X.CS5 r2 = (X.CS5) r2
            if (r2 == 0) goto L_0x00dd
            int r13 = r2.A02
            r20 = 0
            r1 = 2
            if (r13 < r1) goto L_0x0198
            int r10 = r2.A01
            int r9 = r10 + 20
            int r0 = r13 - r7
            int r9 = r9 - r0
            int r12 = r9 % 20
            long[] r11 = r2.A04
            r18 = r11[r10]
        L_0x00a5:
            r16 = r11[r12]
            long r14 = r18 - r16
            r9 = 100
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            int r13 = r13 - r7
            r2.A02 = r13
            int r0 = r12 + 1
            int r12 = r0 % 20
            goto L_0x00a5
        L_0x00b7:
            if (r13 < r1) goto L_0x0198
            if (r13 != r1) goto L_0x0133
            int r0 = r12 + 1
            int r10 = r0 % 20
            r0 = r11[r10]
            int r9 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x0198
            float[] r9 = r2.A03
            r10 = r9[r10]
            long r0 = r0 - r16
            float r9 = (float) r0
            float r10 = r10 / r9
        L_0x00cd:
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 * r0
            r2.A00 = r10
            float r8 = java.lang.Math.abs(r8)
            float r1 = -r8
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x012c
            r2.A00 = r1
        L_0x00dd:
            float r8 = X.C25899CoA.A00(r3, r6)
            X.E0E r0 = r5.A06
            X.D6S r0 = (X.D6S) r0
            androidx.core.widget.NestedScrollView r3 = r0.A00
            float r0 = r3.getVerticalScrollFactorCompat()
            float r0 = -r0
            float r8 = r8 * r0
            float r1 = java.lang.Math.signum(r8)
            r6 = 0
            if (r22 != 0) goto L_0x0102
            float r0 = r5.A00
            float r0 = java.lang.Math.signum(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0107
        L_0x0102:
            android.widget.OverScroller r0 = r3.A09
            r0.abortAnimation()
        L_0x0107:
            float r1 = java.lang.Math.abs(r8)
            r0 = r4[r21]
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            r2 = r4[r7]
            int r0 = -r2
            float r1 = (float) r0
            float r0 = (float) r2
            float r1 = X.BE8.A01(r8, r0, r1)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0129
            android.widget.OverScroller r0 = r3.A09
            r0.abortAnimation()
            int r0 = (int) r1
            r3.A0D(r0)
            r6 = r1
        L_0x0129:
            r5.A00 = r6
            return r7
        L_0x012c:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            r2.A00 = r8
            goto L_0x00dd
        L_0x0133:
            r10 = 0
            r9 = 0
        L_0x0135:
            int r0 = r13 - r7
            if (r10 >= r0) goto L_0x017f
            int r1 = r10 + r12
            int r0 = r1 % 20
            r17 = r11[r0]
            int r0 = r1 + 1
            int r14 = r0 % 20
            r15 = r11[r14]
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x017c
            int r9 = r9 + 1
            r0 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            r16 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x0154
            r16 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0154:
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = java.lang.Math.abs(r20)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r15 = (float) r0
            float r16 = r16 * r15
            float[] r0 = r2.A03
            r15 = r0[r14]
            r0 = r11[r14]
            long r0 = r0 - r17
            float r14 = (float) r0
            float r15 = r15 / r14
            float r1 = r15 - r16
            float r0 = java.lang.Math.abs(r15)
            float r1 = r1 * r0
            float r20 = r20 + r1
            if (r9 != r7) goto L_0x017c
            r0 = 1056964608(0x3f000000, float:0.5)
            float r20 = r20 * r0
        L_0x017c:
            int r10 = r10 + 1
            goto L_0x0135
        L_0x017f:
            r0 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L_0x0188
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0188:
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = java.lang.Math.abs(r20)
            float r0 = r0 * r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r9 = (float) r0
            float r10 = r10 * r9
            goto L_0x00cd
        L_0x0198:
            r10 = 0
            goto L_0x00cd
        L_0x019b:
            android.content.Context r10 = r5.A05
            int[] r4 = r5.A07
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r10)
            int r1 = r2.getDeviceId()
            int r0 = r2.getSource()
            int r1 = X.C28971bN.A04(r10, r3, r1, r6, r0)
            r0 = 0
            r4[r0] = r1
            int r1 = r2.getDeviceId()
            int r0 = r2.getSource()
            int r0 = X.C28971bN.A03(r10, r3, r1, r6, r0)
            r22 = 1
            r4[r7] = r0
            r5.A03 = r9
            r5.A02 = r8
            r5.A01 = r6
            goto L_0x005c
        L_0x01ca:
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r2.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L_0x0071
            r0 = 26
            float r1 = r2.getAxisValue(r0)
            int r0 = r5.getWidth()
            int r4 = r0 / 2
            r6 = 26
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        A0D((int) f2);
        return true;
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return this.A0O.A0B(f, f2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BHL)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BHL bhl = (BHL) parcelable;
        super.onRestoreInstanceState(bhl.getSuperState());
        this.A0I = bhl;
        requestLayout();
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return AnonymousClass000.A1O(i & 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0185, code lost:
        if (getChildCount() > 0) goto L_0x0187;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            android.view.VelocityTracker r0 = r12.A06
            if (r0 != 0) goto L_0x000a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r12.A06 = r0
        L_0x000a:
            int r1 = r13.getActionMasked()
            r4 = 0
            if (r1 != 0) goto L_0x0013
            r12.A0F = r4
        L_0x0013:
            android.view.MotionEvent r3 = android.view.MotionEvent.obtain(r13)
            int r0 = r12.A0F
            float r0 = (float) r0
            r5 = 0
            r3.offsetLocation(r5, r0)
            r2 = 1
            if (r1 == 0) goto L_0x01a2
            if (r1 == r2) goto L_0x0101
            r0 = 2
            if (r1 == r0) goto L_0x005c
            r0 = 3
            if (r1 == r0) goto L_0x017d
            r0 = 5
            if (r1 == r0) goto L_0x004a
            r0 = 6
            if (r1 != r0) goto L_0x003f
            r12.A04(r13)
            int r0 = r12.A00
            int r0 = r13.findPointerIndex(r0)
            float r0 = r13.getY(r0)
            int r0 = (int) r0
            r12.A01 = r0
        L_0x003f:
            android.view.VelocityTracker r0 = r12.A06
            if (r0 == 0) goto L_0x0046
            r0.addMovement(r3)
        L_0x0046:
            r3.recycle()
            return r2
        L_0x004a:
            int r1 = r13.getActionIndex()
            float r0 = r13.getY(r1)
            int r0 = (int) r0
            r12.A01 = r0
            int r0 = r13.getPointerId(r1)
            r12.A00 = r0
            goto L_0x003f
        L_0x005c:
            int r0 = r12.A00
            int r8 = r13.findPointerIndex(r0)
            r0 = -1
            if (r8 != r0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid pointerId="
            r1.append(r0)
            int r0 = r12.A00
            r1.append(r0)
            java.lang.String r0 = " in onTouchEvent"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r1)
            goto L_0x003f
        L_0x007f:
            float r0 = r13.getY(r8)
            int r6 = (int) r0
            int r7 = r12.A01
            int r7 = r7 - r6
            float r10 = r13.getX(r8)
            float r0 = X.C108945cZ.A03(r12)
            float r10 = r10 / r0
            float r11 = (float) r7
            float r0 = X.C108945cZ.A04(r12)
            float r11 = r11 / r0
            android.widget.EdgeEffect r1 = r12.A08
            float r0 = A00(r1)
            r9 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00ef
            float r0 = -r11
            float r0 = A01(r1, r0, r10)
            float r9 = -r0
        L_0x00a7:
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x00b2
            r1.onRelease()
        L_0x00b2:
            float r0 = X.C108945cZ.A04(r12)
            int r0 = X.BE6.A04(r9, r0)
            if (r0 == 0) goto L_0x00bf
            r12.invalidate()
        L_0x00bf:
            int r7 = r7 - r0
            boolean r0 = r12.A0C
            if (r0 != 0) goto L_0x00da
            int r0 = java.lang.Math.abs(r7)
            int r1 = r12.A05
            if (r0 <= r1) goto L_0x003f
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L_0x00d5
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x00d5:
            r12.A0C = r2
            if (r7 <= 0) goto L_0x00ed
            int r7 = r7 - r1
        L_0x00da:
            float r0 = r13.getX(r8)
            int r0 = (int) r0
            int r1 = r12.A02(r7, r0, r4, r4)
            int r6 = r6 - r1
            r12.A01 = r6
            int r0 = r12.A0F
            int r0 = r0 + r1
            r12.A0F = r0
            goto L_0x003f
        L_0x00ed:
            int r7 = r7 + r1
            goto L_0x00da
        L_0x00ef:
            android.widget.EdgeEffect r1 = r12.A07
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00b2
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r10
            float r9 = A01(r1, r11, r0)
            goto L_0x00a7
        L_0x0101:
            android.view.VelocityTracker r4 = r12.A06
            int r0 = r12.A03
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r0, r1)
            int r0 = r12.A00
            float r0 = r4.getYVelocity(r0)
            int r6 = (int) r0
            int r1 = java.lang.Math.abs(r6)
            int r0 = r12.A04
            if (r1 < r0) goto L_0x0187
            android.widget.EdgeEffect r1 = r12.A08
            float r0 = A00(r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            boolean r0 = r12.A0B(r1, r6)
            if (r0 == 0) goto L_0x014e
            r1.onAbsorb(r6)
        L_0x012d:
            r0 = -1
            r12.A00 = r0
            r1 = 0
            r12.A0C = r1
            android.view.VelocityTracker r0 = r12.A06
            if (r0 == 0) goto L_0x013d
            r0.recycle()
            r0 = 0
            r12.A06 = r0
        L_0x013d:
            X.1qr r0 = r12.A0O
            r0.A09(r1)
            android.widget.EdgeEffect r0 = r12.A08
            r0.onRelease()
            android.widget.EdgeEffect r0 = r12.A07
            r0.onRelease()
            goto L_0x003f
        L_0x014e:
            int r0 = -r6
            r12.A0D(r0)
            goto L_0x012d
        L_0x0153:
            android.widget.EdgeEffect r4 = r12.A07
            float r0 = A00(r4)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x016c
            int r1 = -r6
            boolean r0 = r12.A0B(r4, r1)
            if (r0 == 0) goto L_0x0168
            r4.onAbsorb(r1)
            goto L_0x012d
        L_0x0168:
            r12.A0D(r1)
            goto L_0x012d
        L_0x016c:
            int r4 = -r6
            float r1 = (float) r4
            X.1qr r0 = r12.A0O
            boolean r0 = r0.A0B(r5, r1)
            if (r0 != 0) goto L_0x012d
            r12.dispatchNestedFling(r5, r1, r2)
            r12.A0D(r4)
            goto L_0x012d
        L_0x017d:
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x012d
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L_0x012d
        L_0x0187:
            android.widget.OverScroller r4 = r12.A09
            int r5 = r12.getScrollX()
            int r6 = r12.getScrollY()
            r7 = 0
            int r10 = r12.getScrollRange()
            r9 = r7
            r8 = r7
            boolean r0 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r0 == 0) goto L_0x012d
            r12.postInvalidateOnAnimation()
            goto L_0x012d
        L_0x01a2:
            int r0 = r12.getChildCount()
            if (r0 != 0) goto L_0x01a9
            return r4
        L_0x01a9:
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x01b6
            android.view.ViewParent r0 = r12.getParent()
            if (r0 == 0) goto L_0x01b6
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x01b6:
            android.widget.OverScroller r1 = r12.A09
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L_0x01c6
            r1.abortAnimation()
            X.1qr r0 = r12.A0O
            r0.A09(r2)
        L_0x01c6:
            float r0 = r13.getY()
            int r1 = (int) r0
            int r0 = r13.getPointerId(r4)
            r12.A01 = r1
            r12.A00 = r0
            r1 = 2
            X.1qr r0 = r12.A0O
            r0.A0D(r1, r4)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.A0L) {
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0C2 = A0C(rect);
            if (A0C2 != 0) {
                scrollBy(0, A0C2);
            }
        } else {
            this.A0H = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.A06) != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.A0J) {
            this.A0J = z;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.A0O.A0A(z);
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.1qG] */
    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.A0N = AnonymousClass3MW.A07();
        this.A0L = true;
        this.A0K = false;
        this.A0H = null;
        this.A0C = false;
        this.A0D = true;
        this.A00 = -1;
        this.A0S = new int[2];
        this.A0R = new int[2];
        D6S d6s = new D6S(this);
        this.A0P = d6s;
        this.A0A = new CTR(getContext(), d6s);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C25863CnS.A02(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.A08 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C25863CnS.A02(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.A07 = edgeEffect2;
        this.A0M = C72463Mc.A00(context) * 160.0f * 386.0878f * 0.84f;
        this.A09 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.A05 = viewConfiguration.getScaledTouchSlop();
        this.A04 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A03 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0V, i, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.A0Q = new Object();
        this.A0O = new C38201qr(this);
        setNestedScrollingEnabled(true);
        AnonymousClass1HF.A0f(this, A0U);
    }

    private void A03(int i, int[] iArr, int i2) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr2 = iArr;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        C38201qr.A08(this.A0O, (int[]) null, iArr2, 0, scrollY2, 0, i - scrollY2, i2);
    }

    private void A04(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A00) {
            boolean A1P = AnonymousClass000.A1P(actionIndex);
            this.A01 = (int) motionEvent.getY(A1P ? 1 : 0);
            this.A00 = motionEvent.getPointerId(A1P);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public static boolean A0A(ViewGroup viewGroup) {
        return viewGroup.getClipToPadding();
    }

    public int A0C(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(childAt);
        int i4 = i3 - verticalFadingEdgeLength;
        if (rect.bottom >= BE9.A09(childAt, A0B2)) {
            i4 = i3;
        }
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return BE6.A09(childAt.getBottom() + A0B2.bottomMargin, i3, i2);
        } else if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        } else {
            if (rect.height() > height) {
                i = 0 - (i4 - rect.bottom);
            } else {
                i = 0 - (scrollY - rect.top);
            }
            return Math.max(i, -getScrollY());
        }
    }

    public void A0D(int i) {
        if (getChildCount() > 0) {
            this.A09.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.A0O.A0D(2, 1);
            this.A02 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    public boolean A0G(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !A08(findNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                maxScrollAmount = Math.min(BEA.A08(this, 0) - (AnonymousClass3MW.A02(this, getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            A02(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.A0N;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            A02(A0C(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        }
        if (findFocus != null && findFocus.isFocused() && (!A08(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(A7Y.A0F);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw AnonymousClass000.A0n("ScrollView can host only one direct child");
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int A052 = C108985cd.A05(this) - getPaddingTop();
        if (childCount == 0) {
            return A052;
        }
        int A082 = BEA.A08(this, 0);
        int scrollY = getScrollY();
        int max = Math.max(0, A082 - A052);
        if (scrollY < 0) {
            return A082 - scrollY;
        }
        if (scrollY > max) {
            return A082 + (scrollY - max);
        }
        return A082;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || A0H(keyEvent)) {
            return true;
        }
        return false;
    }

    public void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.A08;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (A0A(this)) {
                width -= C72453Mb.A0C(this);
                i = getPaddingLeft();
            } else {
                i = 0;
            }
            if (A0A(this)) {
                height -= BE9.A08(this);
                min += getPaddingTop();
            }
            canvas.translate((float) i, (float) min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.A07;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (A0A(this)) {
                width2 -= C72453Mb.A0C(this);
                i2 = 0 + getPaddingLeft();
            }
            if (A0A(this)) {
                height2 -= BE9.A08(this);
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i2 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View A0F2 = AnonymousClass3MY.A0F(this);
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A0F2);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((A0F2.getBottom() + A0B2.bottomMargin) - getScrollY()) - C108985cd.A05(this);
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (C108945cZ.A04(this) * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        return Math.max(0, BE9.A09(childAt, AnonymousClass3MW.A0B(childAt)) - C72473Md.A04(this));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void measureChild(View view, int i, int i2) {
        view.measure(ViewGroup.getChildMeasureSpec(i, C72453Mb.A0C(this), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view);
        AnonymousClass3MY.A1C(view, A0B2.topMargin + A0B2.bottomMargin, 0, ViewGroup.getChildMeasureSpec(i, C72453Mb.A0C(this) + A0B2.leftMargin + A0B2.rightMargin + i2, A0B2.width));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0K = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z = true;
        if (action == 2 && this.A0C) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    int i2 = this.A00;
                    if (i2 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i2);
                        if (findPointerIndex == -1) {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("Invalid pointerId=");
                            A10.append(i2);
                            Log.e("NestedScrollView", AnonymousClass000.A0y(" in onInterceptTouchEvent", A10));
                        } else {
                            int y = (int) motionEvent.getY(findPointerIndex);
                            if (C108945cZ.A05(y, this.A01) > this.A05 && (2 & getNestedScrollAxes()) == 0) {
                                this.A0C = true;
                                this.A01 = y;
                                VelocityTracker velocityTracker = this.A06;
                                if (velocityTracker == null) {
                                    velocityTracker = VelocityTracker.obtain();
                                    this.A06 = velocityTracker;
                                }
                                velocityTracker.addMovement(motionEvent);
                                this.A0F = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i != 3) {
                    if (i == 6) {
                        A04(motionEvent);
                    }
                }
            }
            this.A0C = false;
            this.A00 = -1;
            VelocityTracker velocityTracker2 = this.A06;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.A06 = null;
            }
            if (this.A09.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            this.A0O.A09(0);
        } else {
            int y2 = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y2 >= childAt.getTop() - scrollY && y2 < childAt.getBottom() - scrollY && x >= childAt.getLeft() && x < childAt.getRight()) {
                    this.A01 = y2;
                    this.A00 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.A06;
                    if (velocityTracker3 == null) {
                        this.A06 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.A06.addMovement(motionEvent);
                    OverScroller overScroller = this.A09;
                    overScroller.computeScrollOffset();
                    if (!A07(motionEvent) && overScroller.isFinished()) {
                        z = false;
                    }
                    this.A0C = z;
                    this.A0O.A0D(2, 0);
                }
            }
            if (!A07(motionEvent) && this.A09.isFinished()) {
                z = false;
            }
            this.A0C = z;
            VelocityTracker velocityTracker4 = this.A06;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.A06 = null;
            }
        }
        return this.A0C;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        this.A0L = false;
        View view = this.A0H;
        if (view != null && A09(view, this)) {
            View view2 = this.A0H;
            Rect rect = this.A0N;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int A0C2 = A0C(rect);
            if (A0C2 != 0) {
                scrollBy(0, A0C2);
            }
        }
        this.A0H = null;
        if (!this.A0K) {
            if (this.A0I != null) {
                scrollTo(getScrollX(), this.A0I.A00);
                this.A0I = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(childAt);
                i5 = childAt.getMeasuredHeight() + A0B2.topMargin + A0B2.bottomMargin;
            }
            int A072 = C108985cd.A07(this, i4 - i2);
            int scrollY = getScrollY();
            int i6 = scrollY;
            if (A072 >= i5 || scrollY < 0) {
                i6 = 0;
            } else if (A072 + scrollY > i5) {
                i6 = i5 - A072;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.A0K = true;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A0J && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View A0F2 = AnonymousClass3MY.A0F(this);
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A0F2);
            int measuredHeight = A0F2.getMeasuredHeight();
            int A072 = (C108985cd.A07(this, getMeasuredHeight()) - A0B2.topMargin) - A0B2.bottomMargin;
            if (measuredHeight < A072) {
                AnonymousClass3MY.A1C(A0F2, A072, 1073741824, ViewGroup.getChildMeasureSpec(i, C72453Mb.A0C(this) + A0B2.leftMargin + A0B2.rightMargin, A0B2.width));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, X.BHL] */
    public Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A00 = getScrollY();
        return baseSavedState;
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        E3d e3d = this.A0B;
        if (e3d != null) {
            e3d.C4a(this, i2);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && A08(findFocus, 0, i4)) {
            Rect rect = this.A0N;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int A0C2 = A0C(rect);
            if (A0C2 == 0) {
                return;
            }
            if (this.A0D) {
                A05(this, 0, A0C2, false);
            } else {
                scrollBy(0, A0C2);
            }
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int A0C2 = A0C(rect);
        boolean z2 = false;
        if (A0C2 != 0) {
            z2 = true;
            if (z) {
                scrollBy(0, A0C2);
            } else {
                A05(this, 0, A0C2, false);
                return true;
            }
        }
        return z2;
    }

    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View A0F2 = AnonymousClass3MY.A0F(this);
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A0F2);
            int A072 = C72473Md.A07(this, getWidth());
            int width = A0F2.getWidth() + A0B2.leftMargin + A0B2.rightMargin;
            int A042 = C72473Md.A04(this);
            int A092 = BE9.A09(A0F2, A0B2);
            if (A072 >= width || i < 0) {
                i = 0;
            } else if (A072 + i > width) {
                i = width - A072;
            }
            if (A042 >= A092 || i2 < 0) {
                i2 = 0;
            } else if (A042 + i2 > A092) {
                i2 = A092 - A042;
            }
            if (i != getScrollX() || i2 != getScrollY()) {
                super.scrollTo(i, i2);
            }
        }
    }

    public void setOnScrollChangeListener(E3d e3d) {
        this.A0B = e3d;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.A0D = z;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.1XU, X.BJh] */
    static {
        int[] A1X = BE6.A1X();
        A1X[0] = 16843130;
        A0V = A1X;
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    public void Bz0(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        A03(i4, iArr, i5);
    }

    public NestedScrollView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw AnonymousClass000.A0n("ScrollView can host only one direct child");
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130970596);
    }

    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw AnonymousClass000.A0n("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw AnonymousClass000.A0n("ScrollView can host only one direct child");
    }
}
