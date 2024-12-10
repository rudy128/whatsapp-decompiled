package X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

public final class BMS extends C38171qo {
    public boolean A00 = false;
    public final RecyclerView A01;
    public final BMF A02;
    public final C111725kK A03;

    public BMS(RecyclerView recyclerView, BMF bmf, C111725kK r4) {
        super(recyclerView);
        this.A01 = recyclerView;
        this.A03 = r4;
        this.A02 = bmf;
    }

    public boolean A1Y(View view, int i, Bundle bundle) {
        C18070vi.A0d(view, 0);
        if (this.A00 || (i != 4096 && i != 8192)) {
            return super.A1Y(view, i, bundle);
        }
        return false;
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        boolean A15 = C18070vi.A15(view, accessibilityEvent);
        super.A1T(view, accessibilityEvent);
        if (!this.A00) {
            accessibilityEvent.setScrollable(A15);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r1 = r4.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1X(android.view.ViewGroup r5, android.view.View r6, android.view.accessibility.AccessibilityEvent r7) {
        /*
            r4 = this;
            boolean r1 = X.AnonymousClass8BX.A1U(r5, r6, r7)
            int r0 = r7.getEventType()
            if (r0 != r1) goto L_0x0028
            androidx.recyclerview.widget.RecyclerView r1 = r4.A01
            X.1qy r3 = r1.getLayoutManager()
            if (r3 == 0) goto L_0x0028
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x0028
            int r0 = r1.getScrollState()
            if (r0 != 0) goto L_0x002d
            int r1 = X.C38251qy.A02(r6)
            X.BMF r0 = r4.A02
            int r0 = r0.A00
            if (r1 != r0) goto L_0x002d
        L_0x0028:
            boolean r0 = super.A1X(r5, r6, r7)
            return r0
        L_0x002d:
            X.5kK r2 = r4.A03
            int r1 = X.C38251qy.A02(r6)
            r0 = -1
            if (r1 == r0) goto L_0x0028
            X.BMI r0 = r2.A06(r3)
            if (r0 == 0) goto L_0x0028
            r0.A00 = r1
            r3.A0e(r0)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMS.A1X(android.view.ViewGroup, android.view.View, android.view.accessibility.AccessibilityEvent):boolean");
    }

    public void A1Z(View view, C26228CvK cvK) {
        boolean A15 = C18070vi.A15(view, cvK);
        super.A1Z(view, cvK);
        if (cvK.A02.isScrollable() && !this.A00) {
            cvK.A0M(C26137Ct0.A0X);
            cvK.A0M(C26137Ct0.A0Z);
            cvK.A0p(A15);
        }
    }
}
