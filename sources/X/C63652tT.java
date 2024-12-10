package X;

/* renamed from: X.2tT  reason: invalid class name and case insensitive filesystem */
public abstract class C63652tT {
    public static boolean A00(C18030ve r3, C139506yx r4, AnonymousClass206 r5) {
        C62572rc r0;
        if (((r5 instanceof AnonymousClass21Y) || (r5 instanceof C440021t)) && (r0 = ((AnonymousClass21V) r5).A02) != null && r4.A02(r0) && C18020vd.A05(C18040vf.A02, r3, 3934)) {
            return true;
        }
        return false;
    }

    public static boolean A01(C18030ve r3, AnonymousClass206 r4) {
        if (!(r4 instanceof C438421d)) {
            return false;
        }
        AnonymousClass21V r1 = (AnonymousClass21V) r4;
        if (!C22971Dz.A0g(r4)) {
            return false;
        }
        C693436v A17 = r1.A17();
        C17960vV.A07(A17);
        if (!A17.A05() || !C18020vd.A05(C18040vf.A02, r3, 252)) {
            return false;
        }
        return true;
    }

    public static boolean A02(C18030ve r2, AnonymousClass206 r3) {
        int i;
        if (r3 instanceof C438921i) {
            i = 253;
        } else if ((!(r3 instanceof C438421d) && !(r3 instanceof AnonymousClass21X)) || !C22971Dz.A0g(r3)) {
            return true;
        } else {
            i = 252;
        }
        return !C18020vd.A05(C18040vf.A02, r2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r0.length >= 2) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C18030ve r5, X.AnonymousClass206 r6, boolean r7) {
        /*
            boolean r0 = r6 instanceof X.AnonymousClass21V
            r4 = 0
            if (r0 == 0) goto L_0x0050
            boolean r0 = r6 instanceof X.C438921i
            r3 = 1
            if (r0 == 0) goto L_0x0015
            r1 = 247(0xf7, float:3.46E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x0015
            return r3
        L_0x0015:
            boolean r2 = r6 instanceof X.C438421d
            if (r2 == 0) goto L_0x004e
            r1 = r6
            X.21V r1 = (X.AnonymousClass21V) r1
            X.36v r0 = r1.A17()
            if (r0 == 0) goto L_0x004e
            X.36v r0 = r1.A17()
            int[] r0 = r0.A07()
            if (r0 == 0) goto L_0x004e
            int r1 = r0.length
            r0 = 2
            if (r1 < r0) goto L_0x004e
        L_0x0030:
            if (r7 == 0) goto L_0x0050
            boolean r0 = r6 instanceof X.AnonymousClass21W
            if (r0 != 0) goto L_0x0038
            if (r2 == 0) goto L_0x0050
        L_0x0038:
            r0 = 246(0xf6, float:3.45E-43)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            if (r0 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x004c
            r0 = 7835(0x1e9b, float:1.0979E-41)
            boolean r0 = X.C18020vd.A05(r1, r5, r0)
            if (r0 == 0) goto L_0x0050
        L_0x004c:
            r4 = 1
            return r4
        L_0x004e:
            r3 = 0
            goto L_0x0030
        L_0x0050:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63652tT.A03(X.0ve, X.206, boolean):boolean");
    }

    public static boolean A04(AnonymousClass206 r2) {
        C693436v A17;
        if (!(r2 instanceof C438421d) || (A17 = ((AnonymousClass21V) r2).A17()) == null || !A17.A05()) {
            return false;
        }
        return true;
    }
}
