package X;

/* renamed from: X.0Mu  reason: invalid class name and case insensitive filesystem */
public final class C04340Mu {
    public AnonymousClass0XV[] A00;
    public final C06970a9 A01 = C06970a9.A02(new AnonymousClass0XV[16]);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r3) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r5 = this;
            X.0a9 r4 = r5.A01
            X.0Zj r0 = X.C06710Zj.A00
            r4.A0D(r0)
            int r3 = r4.A00
            X.0XV[] r2 = r5.A00
            if (r2 == 0) goto L_0x0010
            int r0 = r2.length
            if (r0 >= r3) goto L_0x0018
        L_0x0010:
            r0 = 16
            int r0 = java.lang.Math.max(r0, r3)
            X.0XV[] r2 = new X.AnonymousClass0XV[r0]
        L_0x0018:
            r0 = 0
            r5.A00 = r0
            r1 = 0
        L_0x001c:
            if (r1 >= r3) goto L_0x0027
            java.lang.Object[] r0 = r4.A01
            r0 = r0[r1]
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0027:
            r4.A08()
        L_0x002a:
            int r3 = r3 + -1
            r0 = -1
            if (r0 >= r3) goto L_0x003c
            r1 = r2[r3]
            X.C18070vi.A0b(r1)
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x002a
            r5.A00(r1)
            goto L_0x002a
        L_0x003c:
            r5.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04340Mu.A01():void");
    }

    private final void A00(AnonymousClass0XV r5) {
        r5.A0S();
        int i = 0;
        r5.A0F = false;
        C06970a9 A0F = r5.A0F();
        int i2 = A0F.A00;
        if (i2 > 0) {
            Object[] objArr = A0F.A01;
            do {
                A00((AnonymousClass0XV) objArr[i]);
                i++;
            } while (i < i2);
        }
    }
}
