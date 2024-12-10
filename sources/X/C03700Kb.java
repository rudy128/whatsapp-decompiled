package X;

/* renamed from: X.0Kb  reason: invalid class name and case insensitive filesystem */
public class C03700Kb {
    public final C06970a9 A00 = C06970a9.A02(new AnonymousClass0AD[16]);

    public final void A01() {
        int i = 0;
        while (true) {
            C06970a9 r2 = this.A00;
            if (i < r2.A00) {
                AnonymousClass0AD r1 = (AnonymousClass0AD) r2.A01[i];
                if (!r1.A06.A07) {
                    r2.A06(i);
                    r1.A00();
                } else {
                    i++;
                    r1.A01();
                }
            } else {
                return;
            }
        }
    }

    public void A00() {
        C06970a9 r0 = this.A00;
        int i = r0.A00;
        if (i > 0) {
            Object[] objArr = r0.A01;
            int i2 = 0;
            do {
                ((C03700Kb) objArr[i2]).A00();
                i2++;
            } while (i2 < i);
        }
    }

    public void A02(AnonymousClass0IF r4) {
        C06970a9 r2 = this.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((AnonymousClass0AD) r2.A01[i]).A07.A00 == 0) {
                r2.A06(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C001100p r6, X.AnonymousClass0IF r7, X.C16910tQ r8, boolean r9) {
        /*
            r5 = this;
            X.0a9 r0 = r5.A00
            int r4 = r0.A00
            r3 = 0
            if (r4 <= 0) goto L_0x001d
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x000a:
            r0 = r2[r1]
            X.0Kb r0 = (X.C03700Kb) r0
            boolean r0 = r0.A03(r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0018
            r0 = r3
            r3 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x000a
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03700Kb.A03(X.00p, X.0IF, X.0tQ, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C001100p r6, X.AnonymousClass0IF r7, X.C16910tQ r8, boolean r9) {
        /*
            r5 = this;
            X.0a9 r0 = r5.A00
            int r4 = r0.A00
            r3 = 0
            if (r4 <= 0) goto L_0x001d
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x000a:
            r0 = r2[r1]
            X.0Kb r0 = (X.C03700Kb) r0
            boolean r0 = r0.A04(r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0018
            r0 = r3
            r3 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x000a
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03700Kb.A04(X.00p, X.0IF, X.0tQ, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r0 != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AnonymousClass0IF r6) {
        /*
            r5 = this;
            X.0a9 r0 = r5.A00
            int r4 = r0.A00
            r3 = 0
            if (r4 <= 0) goto L_0x001d
            java.lang.Object[] r2 = r0.A01
            r1 = 0
        L_0x000a:
            r0 = r2[r1]
            X.0Kb r0 = (X.C03700Kb) r0
            boolean r0 = r0.A05(r6)
            if (r0 != 0) goto L_0x0018
            r0 = r3
            r3 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            int r1 = r1 + 1
            if (r1 < r4) goto L_0x000a
        L_0x001d:
            r5.A02(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03700Kb.A05(X.0IF):boolean");
    }
}
