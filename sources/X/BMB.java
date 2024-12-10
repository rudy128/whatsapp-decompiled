package X;

import android.view.inputmethod.InputMethodManager;
import androidx.recyclerview.widget.RecyclerView;

public class BMB extends C39711tW {
    public final int A00;
    public final Object A01;

    public BMB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A03(RecyclerView recyclerView, int i) {
        switch (this.A00) {
            case 1:
                if (i == 1) {
                    ((InputMethodManager) ((DOZ) this.A01).A00.getSystemService("input_method")).hideSoftInputFromWindow(recyclerView.getWindowToken(), 0);
                    return;
                }
                return;
            case 3:
                if (i == 2 || i == 1) {
                    CP3 cp3 = (CP3) this.A01;
                    RecyclerView recyclerView2 = cp3.A00;
                    recyclerView2.A0u(this);
                    recyclerView2.A0E = null;
                    cp3.A01.A08(recyclerView2);
                    return;
                }
                return;
            default:
                super.A03(recyclerView, i);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r10 < r3.A0H) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r5 < r3.A0H) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0005;
                case 2: goto L_0x0024;
                case 3: goto L_0x0005;
                case 4: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A04(r13, r14, r15)
        L_0x0008:
            return
        L_0x0009:
            if (r15 == 0) goto L_0x0008
            java.lang.Object r1 = r12.A01
            com.whatsapp.scroller.RecyclerFastScroller r1 = (com.whatsapp.scroller.RecyclerFastScroller) r1
            com.whatsapp.scroller.RecyclerFastScroller.A01(r1)
            X.E6m r0 = r1.A06
            if (r0 == 0) goto L_0x0008
            android.view.View r0 = r1.A01
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0008
            X.E6m r0 = r1.A06
            r0.CQX()
            return
        L_0x0024:
            if (r14 == 0) goto L_0x002f
            java.lang.Object r1 = r12.A01
            X.CU5 r1 = (X.CU5) r1
            int r0 = r1.A04
            int r0 = r0 + r14
            r1.A04 = r0
        L_0x002f:
            if (r15 == 0) goto L_0x0008
            java.lang.Object r1 = r12.A01
            X.CU5 r1 = (X.CU5) r1
            int r0 = r1.A05
            int r0 = r0 + r15
            r1.A05 = r0
            return
        L_0x003b:
            java.lang.Object r3 = r12.A01
            X.BM6 r3 = (X.BM6) r3
            int r9 = r13.computeHorizontalScrollOffset()
            int r2 = r13.computeVerticalScrollOffset()
            androidx.recyclerview.widget.RecyclerView r6 = r3.A0A
            int r11 = r6.computeVerticalScrollRange()
            int r10 = r3.A05
            int r0 = r11 - r10
            r1 = 0
            r4 = 1
            if (r0 <= 0) goto L_0x005a
            int r5 = r3.A0H
            r0 = 1
            if (r10 >= r5) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r3.A0C = r0
            int r6 = r6.computeHorizontalScrollRange()
            int r5 = r3.A06
            int r0 = r6 - r5
            if (r0 <= 0) goto L_0x006c
            int r0 = r3.A0H
            r8 = 1
            if (r5 >= r0) goto L_0x006d
        L_0x006c:
            r8 = 0
        L_0x006d:
            r3.A0B = r8
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x007d
            if (r8 != 0) goto L_0x007d
            int r0 = r3.A07
            if (r0 == 0) goto L_0x0008
            r3.A07(r1)
            return
        L_0x007d:
            r7 = 1073741824(0x40000000, float:2.0)
            if (r0 == 0) goto L_0x0095
            float r2 = (float) r2
            float r1 = (float) r10
            float r0 = r1 / r7
            float r2 = r2 + r0
            float r1 = r1 * r2
            float r0 = (float) r11
            float r1 = r1 / r0
            int r0 = (int) r1
            r3.A08 = r0
            int r0 = r10 * r10
            int r0 = r0 / r11
            int r0 = java.lang.Math.min(r10, r0)
            r3.A09 = r0
        L_0x0095:
            if (r8 == 0) goto L_0x00ab
            float r2 = (float) r9
            float r1 = (float) r5
            float r0 = r1 / r7
            float r2 = r2 + r0
            float r1 = r1 * r2
            float r0 = (float) r6
            float r1 = r1 / r0
            int r0 = (int) r1
            r3.A03 = r0
            int r0 = r5 * r5
            int r0 = r0 / r6
            int r0 = java.lang.Math.min(r5, r0)
            r3.A04 = r0
        L_0x00ab:
            int r0 = r3.A07
            if (r0 == 0) goto L_0x00b1
            if (r0 != r4) goto L_0x0008
        L_0x00b1:
            r3.A07(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMB.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
