package com.whatsapp.mediacomposer.filter;

import X.AnonymousClass740;
import X.C18070vi;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public final class FilterSelectorController$initFilterSheet$1 extends BottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass740 A01;

    public FilterSelectorController$initFilterSheet$1(AnonymousClass740 r1) {
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if (r1.A03.A01(r5) != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r0 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0K(android.view.MotionEvent r5, android.view.View r6, androidx.coordinatorlayout.widget.CoordinatorLayout r7) {
        /*
            r4 = this;
            boolean r2 = X.C18070vi.A15(r7, r6)
            r1 = 2
            X.C18070vi.A0d(r5, r1)
            boolean r0 = r4.A00
            r3 = 0
            if (r0 != 0) goto L_0x0014
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            int r0 = r5.getPointerCount()
            if (r0 >= r1) goto L_0x0050
            X.740 r0 = r4.A01
            X.77n r0 = r0.A0W
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = r0.A01
            X.7JF r1 = r0.A0J
            if (r1 == 0) goto L_0x0051
            X.6yX r0 = r1.A0R
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0050
            X.77q r1 = r1.A0U
            X.6xJ r0 = r1.A04
            X.73u r0 = r0.A00
            if (r0 != 0) goto L_0x003b
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.73u r0 = r0.A01(r5)
            r2 = 0
            if (r0 == 0) goto L_0x003c
        L_0x003b:
            r2 = 1
        L_0x003c:
            X.6eO r0 = r1.A08
            X.73u r0 = r0.A00
            if (r0 != 0) goto L_0x004b
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r1.A03
            X.73u r0 = r0.A02(r5)
            r1 = 0
            if (r0 == 0) goto L_0x004c
        L_0x004b:
            r1 = 1
        L_0x004c:
            if (r2 != 0) goto L_0x0050
            if (r1 == 0) goto L_0x0051
        L_0x0050:
            return r3
        L_0x0051:
            boolean r3 = super.A0K(r5, r6, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.filter.FilterSelectorController$initFilterSheet$1.A0K(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        C18070vi.A0n(coordinatorLayout, view, motionEvent);
        if (this.A01.A0Q.A00.onTouchEvent(motionEvent)) {
            return true;
        }
        try {
            if (!this.A00 || !super.A0L(motionEvent, view, coordinatorLayout)) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException unused) {
        }
    }

    public boolean A0O(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = C18070vi.A16(coordinatorLayout, view);
        return super.A0O(view, coordinatorLayout, i);
    }
}
