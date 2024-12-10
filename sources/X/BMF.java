package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class BMF extends C39711tW {
    public int A00 = -1;
    public int A01 = -1;
    public E8D A02;
    public boolean A03;
    public final BM9 A04;

    public void A03(RecyclerView recyclerView, int i) {
        Integer A05;
        int intValue;
        C18070vi.A0d(recyclerView, 0);
        if (i == 0 && (A05 = A05(recyclerView)) != null && (intValue = A05.intValue()) != this.A01) {
            E8D e8d = this.A02;
            if (e8d != null) {
                e8d.C4x(intValue);
            }
            this.A01 = intValue;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r3 != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r8 != 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(androidx.recyclerview.widget.RecyclerView r6, int r7, int r8) {
        /*
            r5 = this;
            r4 = 0
            X.C18070vi.A0d(r6, r4)
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x000e
            if (r7 != 0) goto L_0x000e
            r3 = 1
            if (r8 == 0) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            java.lang.Integer r0 = r5.A05(r6)
            if (r0 == 0) goto L_0x0038
            int r2 = r0.intValue()
            int r0 = r5.A00
            if (r2 == r0) goto L_0x0038
            X.E8D r1 = r5.A02
            if (r1 == 0) goto L_0x002c
            boolean r0 = r5.A03
            if (r0 != 0) goto L_0x0028
            r0 = 1
            if (r3 == 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r1.Bo5(r2, r3, r0)
        L_0x002c:
            r5.A00 = r2
            if (r3 != 0) goto L_0x0034
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0036
        L_0x0034:
            r5.A01 = r2
        L_0x0036:
            r5.A03 = r4
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMF.A04(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public BMF(BM9 bm9) {
        this.A04 = bm9;
    }

    public final Integer A05(RecyclerView recyclerView) {
        View A05;
        C38251qy layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || (A05 = this.A04.A05(layoutManager)) == null) {
            return null;
        }
        int A022 = C38251qy.A02(A05);
        Integer valueOf = Integer.valueOf(A022);
        if (valueOf == null || A022 != -1) {
            return valueOf;
        }
        return null;
    }
}
