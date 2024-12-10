package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.BiR  reason: case insensitive filesystem */
public abstract class C23511BiR extends BJV {
    public VelocityTracker A00;
    public OverScroller A01;
    public Runnable A02;
    public int A03 = -1;
    public int A04;
    public int A05 = -1;
    public boolean A06;

    public int A0Q() {
        int i;
        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
        C25070CWd cWd = baseBehavior.A01;
        if (cWd != null) {
            i = cWd.A02;
        } else {
            i = 0;
        }
        return i + baseBehavior.A01;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r10.A0H(r9, r4, r3) == false) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MotionEvent r8, android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10) {
        /*
            r7 = this;
            int r0 = r7.A05
            if (r0 >= 0) goto L_0x0012
            android.content.Context r0 = r10.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.A05 = r0
        L_0x0012:
            int r1 = r8.getActionMasked()
            r0 = 2
            r6 = 1
            r5 = -1
            r2 = 0
            if (r1 != r0) goto L_0x003c
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x003c
            int r0 = r7.A03
            if (r0 == r5) goto L_0x009c
            int r0 = r8.findPointerIndex(r0)
            if (r0 == r5) goto L_0x009c
            float r0 = r8.getY(r0)
            int r3 = (int) r0
            int r0 = r7.A04
            int r1 = X.C108945cZ.A05(r3, r0)
            int r0 = r7.A05
            if (r1 <= r0) goto L_0x003c
            r7.A04 = r3
            return r6
        L_0x003c:
            int r0 = r8.getActionMasked()
            if (r0 != 0) goto L_0x0095
            r7.A03 = r5
            float r0 = r8.getX()
            int r4 = (int) r0
            float r0 = r8.getY()
            int r3 = (int) r0
            r0 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            java.lang.ref.WeakReference r0 = r0.A04
            if (r0 == 0) goto L_0x0067
            android.view.View r1 = X.C108945cZ.A0O(r0)
            if (r1 == 0) goto L_0x006e
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.canScrollVertically(r5)
            if (r0 != 0) goto L_0x006e
        L_0x0067:
            boolean r1 = r10.A0H(r9, r4, r3)
            r0 = 1
            if (r1 != 0) goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            r7.A06 = r0
            if (r0 == 0) goto L_0x0095
            r7.A04 = r3
            int r0 = r8.getPointerId(r2)
            r7.A03 = r0
            android.view.VelocityTracker r0 = r7.A00
            if (r0 != 0) goto L_0x0085
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.A00 = r0
        L_0x0085:
            android.widget.OverScroller r0 = r7.A01
            if (r0 == 0) goto L_0x0095
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0095
            android.widget.OverScroller r0 = r7.A01
            r0.abortAnimation()
            return r6
        L_0x0095:
            android.view.VelocityTracker r0 = r7.A00
            if (r0 == 0) goto L_0x009c
            r0.addMovement(r8)
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23511BiR.A0K(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(android.view.MotionEvent r20, android.view.View r21, androidx.coordinatorlayout.widget.CoordinatorLayout r22) {
        /*
            r19 = this;
            r4 = r20
            int r1 = r4.getActionMasked()
            r5 = -1
            r3 = 1
            r11 = 0
            r2 = r19
            r7 = r21
            r6 = r22
            if (r1 == r3) goto L_0x0069
            r0 = 2
            if (r1 == r0) goto L_0x0042
            r0 = 3
            if (r1 == r0) goto L_0x00f2
            r0 = 6
            if (r1 != r0) goto L_0x0032
            int r0 = r4.getActionIndex()
            boolean r1 = X.AnonymousClass000.A1P(r0)
            int r0 = r4.getPointerId(r1)
            r2.A03 = r0
            float r1 = r4.getY(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A04 = r0
        L_0x0032:
            r1 = 0
        L_0x0033:
            android.view.VelocityTracker r0 = r2.A00
            if (r0 == 0) goto L_0x003a
            r0.addMovement(r4)
        L_0x003a:
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x0041
            if (r1 != 0) goto L_0x0041
            r3 = 0
        L_0x0041:
            return r3
        L_0x0042:
            int r0 = r2.A03
            int r0 = r4.findPointerIndex(r0)
            if (r0 != r5) goto L_0x004b
            return r11
        L_0x004b:
            float r0 = r4.getY(r0)
            int r0 = (int) r0
            int r1 = r2.A04
            int r1 = r1 - r0
            r2.A04 = r0
            r0 = r7
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            int r0 = r0.getDownNestedScrollRange()
            int r0 = -r0
            int r9 = r2.A0Q()
            int r9 = r9 - r1
            r8 = r6
            r10 = r0
            r6 = r2
            r6.A0R(r7, r8, r9, r10, r11)
            goto L_0x0032
        L_0x0069:
            android.view.VelocityTracker r0 = r2.A00
            if (r0 == 0) goto L_0x00f2
            r0.addMovement(r4)
            android.view.VelocityTracker r1 = r2.A00
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)
            android.view.VelocityTracker r1 = r2.A00
            int r0 = r2.A03
            float r9 = r1.getYVelocity(r0)
            r1 = r7
            com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
            int r0 = r1.getTotalScrollRange()
            int r8 = -r0
            java.lang.Runnable r0 = r2.A02
            if (r0 == 0) goto L_0x0091
            r7.removeCallbacks(r0)
            r0 = 0
            r2.A02 = r0
        L_0x0091:
            android.widget.OverScroller r10 = r2.A01
            if (r10 != 0) goto L_0x00a0
            android.content.Context r0 = r7.getContext()
            android.widget.OverScroller r10 = new android.widget.OverScroller
            r10.<init>(r0)
            r2.A01 = r10
        L_0x00a0:
            X.CWd r0 = r2.A01
            if (r0 == 0) goto L_0x00f0
            int r12 = r0.A02
        L_0x00a6:
            int r14 = java.lang.Math.round(r9)
            r15 = r11
            r16 = r11
            r18 = r11
            r13 = r11
            r17 = r8
            r10.fling(r11, r12, r13, r14, r15, r16, r17, r18)
            android.widget.OverScroller r0 = r2.A01
            boolean r0 = r0.computeScrollOffset()
            if (r0 == 0) goto L_0x00da
            r1 = 33
            X.DTg r0 = new X.DTg
            r0.<init>(r2, r7, r6, r1)
            r2.A02 = r0
            r7.postOnAnimation(r0)
        L_0x00c9:
            r1 = 1
        L_0x00ca:
            r2.A06 = r11
            r2.A03 = r5
            android.view.VelocityTracker r0 = r2.A00
            if (r0 == 0) goto L_0x0033
            r0.recycle()
            r0 = 0
            r2.A00 = r0
            goto L_0x0033
        L_0x00da:
            r0 = r2
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A02(r6, r0, r1)
            boolean r0 = r1.A09
            if (r0 == 0) goto L_0x00c9
            android.view.View r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(r6)
            boolean r0 = r1.A04(r0)
            r1.A05(r0)
            goto L_0x00c9
        L_0x00f0:
            r12 = 0
            goto L_0x00a6
        L_0x00f2:
            r1 = 0
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23511BiR.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0010: MOVE  (r0v0 int) = (r18v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public int A0R(android.view.View r14, androidx.coordinatorlayout.widget.CoordinatorLayout r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            r4 = r17
            r3 = r13
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r3 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r3
            com.google.android.material.appbar.AppBarLayout r14 = (com.google.android.material.appbar.AppBarLayout) r14
            int r5 = r3.A0Q()
            r7 = 0
            if (r17 == 0) goto L_0x014b
            if (r5 < r4) goto L_0x014b
            r0 = r18
            if (r5 > r0) goto L_0x014b
            r1 = r16
            if (r1 < r4) goto L_0x001c
            r4 = r1
            if (r1 <= r0) goto L_0x001c
            r4 = r0
        L_0x001c:
            if (r5 == r4) goto L_0x00b2
            boolean r0 = r14.A08
            r2 = r4
            if (r0 == 0) goto L_0x0083
            int r9 = java.lang.Math.abs(r4)
            int r12 = r14.getChildCount()
            r1 = 0
            r10 = 0
        L_0x002d:
            if (r10 >= r12) goto L_0x0083
            android.view.View r6 = r14.getChildAt(r10)
            android.view.ViewGroup$LayoutParams r11 = r6.getLayoutParams()
            X.BIk r11 = (X.C22659BIk) r11
            android.view.animation.Interpolator r8 = r11.A01
            int r0 = r6.getTop()
            if (r9 < r0) goto L_0x0147
            int r0 = r6.getBottom()
            if (r9 > r0) goto L_0x0147
            if (r8 == 0) goto L_0x0083
            int r10 = r11.A00
            r0 = r10 & 1
            if (r0 == 0) goto L_0x005c
            int r1 = X.BE9.A09(r6, r11)
            r0 = r10 & 2
            if (r0 == 0) goto L_0x005c
            int r0 = r6.getMinimumHeight()
            int r1 = r1 - r0
        L_0x005c:
            boolean r0 = r6.getFitsSystemWindows()
            if (r0 == 0) goto L_0x0067
            int r0 = r14.getTopInset()
            int r1 = r1 - r0
        L_0x0067:
            if (r1 <= 0) goto L_0x0083
            int r0 = r6.getTop()
            int r9 = r9 - r0
            float r1 = (float) r1
            float r0 = (float) r9
            float r0 = r0 / r1
            float r0 = r8.getInterpolation(r0)
            int r1 = X.BE6.A04(r1, r0)
            int r2 = java.lang.Integer.signum(r4)
            int r0 = r6.getTop()
            int r0 = r0 + r1
            int r2 = r2 * r0
        L_0x0083:
            X.CWd r1 = r3.A01
            if (r1 == 0) goto L_0x0142
            int r0 = r1.A02
            if (r0 == r2) goto L_0x0144
            r1.A02 = r2
            r1.A00()
            r1 = 1
        L_0x0091:
            int r12 = r5 - r4
            int r0 = r4 - r2
            r3.A01 = r0
            if (r1 != 0) goto L_0x00b8
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x00a0
            r15.A0E(r14)
        L_0x00a0:
            X.CWd r0 = r3.A01
            if (r0 == 0) goto L_0x00b6
            int r0 = r0.A02
        L_0x00a6:
            r14.A02(r0)
            r1 = 1
            if (r4 >= r5) goto L_0x00ad
            r1 = -1
        L_0x00ad:
            r0 = 0
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A05(r15, r14, r4, r1, r0)
            r7 = r12
        L_0x00b2:
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A03(r15, r3, r14)
            return r7
        L_0x00b6:
            r0 = 0
            goto L_0x00a6
        L_0x00b8:
            int r0 = r14.getChildCount()
            if (r7 >= r0) goto L_0x00a0
            android.view.View r0 = r14.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            X.BIk r0 = (X.C22659BIk) r0
            X.CNx r2 = r0.A02
            if (r2 == 0) goto L_0x012e
            int r0 = r0.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x012e
            android.view.View r6 = r14.getChildAt(r7)
            X.CWd r0 = r3.A01
            if (r0 == 0) goto L_0x0140
            int r0 = r0.A02
        L_0x00dc:
            float r9 = (float) r0
            android.graphics.Rect r10 = r2.A01
            r6.getDrawingRect(r10)
            r14.offsetDescendantRectToMyCoords(r6, r10)
            int r0 = r14.getTopInset()
            int r1 = -r0
            r0 = 0
            r10.offset(r0, r1)
            int r0 = r10.top
            float r8 = (float) r0
            float r0 = java.lang.Math.abs(r9)
            float r8 = r8 - r0
            r11 = 0
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0138
            int r0 = r10.height()
            float r0 = (float) r0
            float r0 = r8 / r0
            float r1 = java.lang.Math.abs(r0)
            r9 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0131
            r1 = 0
        L_0x010d:
            float r8 = -r8
            float r0 = r9 - r1
            float r0 = r0 * r0
            float r9 = r9 - r0
            int r0 = r10.height()
            float r1 = (float) r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r1 = r1 * r0
            float r1 = r1 * r9
            float r8 = r8 - r1
            r6.setTranslationY(r8)
            android.graphics.Rect r2 = r2.A00
            r6.getDrawingRect(r2)
            float r0 = -r8
            int r1 = (int) r0
            r0 = 0
            r2.offset(r0, r1)
            r6.setClipBounds(r2)
        L_0x012e:
            int r7 = r7 + 1
            goto L_0x00b8
        L_0x0131:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x010d
        L_0x0138:
            r0 = 0
            r6.setClipBounds(r0)
            r6.setTranslationY(r11)
            goto L_0x012e
        L_0x0140:
            r0 = 0
            goto L_0x00dc
        L_0x0142:
            r3.A00 = r2
        L_0x0144:
            r1 = 0
            goto L_0x0091
        L_0x0147:
            int r10 = r10 + 1
            goto L_0x002d
        L_0x014b:
            r3.A01 = r7
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23511BiR.A0R(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int, int, int):int");
    }

    public void A0S(View view, CoordinatorLayout coordinatorLayout, int i) {
        A0R(view, coordinatorLayout, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public C23511BiR(Context context, AttributeSet attributeSet) {
        this.A00 = 0;
    }

    public C23511BiR() {
    }
}
