package X;

import java.util.Arrays;

/* renamed from: X.1qY  reason: invalid class name and case insensitive filesystem */
public class C38011qY implements C38001qX {
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (r0 != false) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(androidx.recyclerview.widget.RecyclerView r9, boolean r10) {
        /*
            r8 = this;
            r0 = 0
            r8.A00 = r0
            int[] r1 = r8.A03
            if (r1 == 0) goto L_0x000b
            r0 = -1
            java.util.Arrays.fill(r1, r0)
        L_0x000b:
            X.1qy r6 = r9.A0D
            X.1rD r1 = r9.A0B
            if (r1 == 0) goto L_0x0077
            if (r6 == 0) goto L_0x0077
            if (r10 == 0) goto L_0x0059
            X.1qi r0 = r9.A07
            java.util.ArrayList r0 = r0.A04
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0068
            int r7 = r1.A0Q()
            boolean r0 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x0068
            r5 = r6
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            X.2uu r0 = r5.A05
            r4 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0048
            int r2 = r0.A01
            if (r2 < 0) goto L_0x0048
            boolean r0 = r0.A02
        L_0x0036:
            if (r0 == 0) goto L_0x0057
        L_0x0038:
            r1 = 0
        L_0x0039:
            int r0 = r5.A00
            if (r1 >= r0) goto L_0x0068
            if (r2 < 0) goto L_0x0068
            if (r2 >= r7) goto L_0x0068
            r8.BBe(r2, r3)
            int r2 = r2 + r4
            int r1 = r1 + 1
            goto L_0x0039
        L_0x0048:
            androidx.recyclerview.widget.LinearLayoutManager.A0C(r5)
            boolean r0 = r5.A0A
            int r2 = r5.A02
            if (r2 != r4) goto L_0x0036
            r2 = 0
            if (r0 == 0) goto L_0x0057
            int r2 = r7 + -1
            goto L_0x0038
        L_0x0057:
            r4 = 1
            goto L_0x0038
        L_0x0059:
            boolean r0 = r9.A10()
            if (r0 != 0) goto L_0x0068
            int r2 = r8.A01
            int r1 = r8.A02
            X.1qZ r0 = r9.A0w
            r6.A1C(r8, r0, r2, r1)
        L_0x0068:
            int r1 = r8.A00
            int r0 = r6.A02
            if (r1 <= r0) goto L_0x0077
            r6.A02 = r1
            r6.A0B = r10
            X.1qQ r0 = r9.A0v
            r0.A05()
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38011qY.A00(androidx.recyclerview.widget.RecyclerView, boolean):void");
    }

    public void BBe(int i, int i2) {
        if (i2 >= 0) {
            int i3 = this.A00 * 2;
            int[] iArr = this.A03;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.A03 = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 2)];
                this.A03 = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.A03;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.A00++;
            return;
        }
        throw new IllegalArgumentException("Pixel distance must be non-negative");
    }
}
