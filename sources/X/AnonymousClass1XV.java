package X;

import android.os.Bundle;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.1XV  reason: invalid class name */
public class AnonymousClass1XV extends AnonymousClass1XU {
    public final /* synthetic */ ViewPager A00;

    public AnonymousClass1XV(ViewPager viewPager) {
        this.A00 = viewPager;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 > 1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1T(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
        /*
            r3 = this;
            super.A1T(r4, r5)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = r0.getName()
            r5.setClassName(r0)
            androidx.viewpager.widget.ViewPager r2 = r3.A00
            X.1b8 r0 = r2.A0B
            if (r0 == 0) goto L_0x003a
            int r1 = r0.A0E()
            r0 = 1
            if (r1 <= r0) goto L_0x003a
        L_0x0019:
            r5.setScrollable(r0)
            int r1 = r5.getEventType()
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L_0x0039
            X.1b8 r0 = r2.A0B
            if (r0 == 0) goto L_0x0039
            int r0 = r0.A0E()
            r5.setItemCount(r0)
            int r0 = r2.A02
            r5.setFromIndex(r0)
            int r0 = r2.A02
            r5.setToIndex(r0)
        L_0x0039:
            return
        L_0x003a:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XV.A1T(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        ViewPager viewPager;
        int i2;
        if (!super.A1Y(view, i, bundle)) {
            if (i != 4096) {
                if (i == 8192) {
                    viewPager = this.A00;
                    if (viewPager.canScrollHorizontally(-1)) {
                        i2 = viewPager.A02 - 1;
                    }
                }
                return false;
            }
            viewPager = this.A00;
            if (viewPager.canScrollHorizontally(1)) {
                i2 = viewPager.A02 + 1;
            }
            return false;
            viewPager.setCurrentItem(i2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 > 1) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Z(android.view.View r4, X.C26228CvK r5) {
        /*
            r3 = this;
            super.A1Z(r4, r5)
            java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = r0.getName()
            r5.A0O(r0)
            androidx.viewpager.widget.ViewPager r2 = r3.A00
            X.1b8 r0 = r2.A0B
            if (r0 == 0) goto L_0x0035
            int r1 = r0.A0E()
            r0 = 1
            if (r1 <= r0) goto L_0x0035
        L_0x0019:
            r5.A0p(r0)
            r0 = 1
            boolean r0 = r2.canScrollHorizontally(r0)
            if (r0 == 0) goto L_0x0028
            r0 = 4096(0x1000, float:5.74E-42)
            r5.A0A(r0)
        L_0x0028:
            r0 = -1
            boolean r0 = r2.canScrollHorizontally(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 8192(0x2000, float:1.14794E-41)
            r5.A0A(r0)
        L_0x0034:
            return
        L_0x0035:
            r0 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XV.A1Z(android.view.View, X.CvK):void");
    }
}
