package X;

import android.view.View;

public class D88 implements E7I {
    public int A00 = -1;
    public int A01 = 0;
    public boolean A02 = false;
    public final /* synthetic */ BEZ A03;

    public D88(BEZ bez) {
        this.A03 = bez;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r3 == r7.getHeight()) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0x(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewParent r1 = r7.getParent()
            boolean r0 = r1 instanceof android.view.View
            r5 = 0
            if (r0 == 0) goto L_0x004f
            android.view.View r1 = (android.view.View) r1
            int r4 = r1.getPaddingBottom()
        L_0x000f:
            int r3 = r6.A00
            r2 = 1
            if (r3 <= 0) goto L_0x001b
            int r0 = r7.getHeight()
            r1 = 1
            if (r3 != r0) goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            int r0 = r6.A01
            if (r0 == r4) goto L_0x0021
            r5 = 1
        L_0x0021:
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0051
            if (r1 != 0) goto L_0x0051
            if (r5 != 0) goto L_0x0051
            int r1 = r7.getTop()
            int r8 = r8 - r4
            X.BEZ r3 = r6.A03
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x004a
            r0 = r8
        L_0x0035:
            boolean r2 = r3.A0A
            if (r2 == 0) goto L_0x0047
            if (r0 == 0) goto L_0x0047
            int r8 = r8 - r1
            float r1 = (float) r8
            float r0 = (float) r0
            float r1 = r1 / r0
        L_0x003f:
            r3.A00 = r1
            if (r2 == 0) goto L_0x0046
            X.BEZ.A01(r3, r1)
        L_0x0046:
            return
        L_0x0047:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x004a:
            int r0 = r7.getHeight()
            goto L_0x0035
        L_0x004f:
            r4 = 0
            goto L_0x000f
        L_0x0051:
            r6.A01 = r4
            r6.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D88.C0x(android.view.View, int):void");
    }

    public void C10(View view, C28483E3n e3n) {
        this.A00 = view.getHeight();
        this.A02 = false;
        BEZ bez = this.A03;
        bez.A08.A05.A08();
        if (e3n == BEZ.A0K) {
            if (!bez.A0E) {
                bez.A04(AnonymousClass00R.A00);
            }
            bez.A03();
        }
    }
}
