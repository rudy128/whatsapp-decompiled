package X;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.BJh  reason: case insensitive filesystem */
public class C22666BJh extends AnonymousClass1XU {
    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        super.A1T(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(AnonymousClass000.A1R(nestedScrollView.getScrollRange()));
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r7 != 16908346) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1Y(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r0 = super.A1Y(r6, r7, r8)
            r3 = 1
            if (r0 != 0) goto L_0x007d
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            boolean r0 = r6.isEnabled()
            r2 = 0
            if (r0 == 0) goto L_0x003e
            int r4 = r6.getHeight()
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            android.graphics.Matrix r0 = r6.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r6.getGlobalVisibleRect(r1)
            if (r0 == 0) goto L_0x002c
            int r4 = r1.height()
        L_0x002c:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r7 == r0) goto L_0x003f
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r7 == r0) goto L_0x0057
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            if (r7 == r0) goto L_0x0057
            r0 = 16908346(0x102003a, float:2.3877392E-38)
            if (r7 == r0) goto L_0x003f
        L_0x003e:
            return r2
        L_0x003f:
            int r0 = r6.getPaddingBottom()
            int r4 = r4 - r0
            int r0 = r6.getPaddingTop()
            int r4 = r4 - r0
            int r1 = r6.getScrollY()
            int r1 = r1 + r4
            int r0 = r6.getScrollRange()
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x006a
        L_0x0057:
            int r0 = r6.getPaddingBottom()
            int r4 = r4 - r0
            int r0 = r6.getPaddingTop()
            int r4 = r4 - r0
            int r0 = r6.getScrollY()
            int r0 = r0 - r4
            int r1 = java.lang.Math.max(r0, r2)
        L_0x006a:
            int r0 = r6.getScrollY()
            if (r1 == r0) goto L_0x003e
            int r0 = r6.getScrollX()
            int r2 = r2 - r0
            int r0 = r6.getScrollY()
            int r1 = r1 - r0
            androidx.core.widget.NestedScrollView.A05(r6, r2, r1, r3)
        L_0x007d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22666BJh.A1Y(android.view.View, int, android.os.Bundle):boolean");
    }

    public void A1Z(View view, C26228CvK cvK) {
        int scrollRange;
        super.A1Z(view, cvK);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        cvK.A0O(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            cvK.A0p(true);
            if (nestedScrollView.getScrollY() > 0) {
                cvK.A0L(C26137Ct0.A0X);
                cvK.A0L(C26137Ct0.A0e);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                cvK.A0L(C26137Ct0.A0Z);
                cvK.A0L(C26137Ct0.A0Y);
            }
        }
    }
}
