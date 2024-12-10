package X;

/* renamed from: X.72Z  reason: invalid class name */
public abstract class AnonymousClass72Z {
    public static final boolean A00(int i) {
        return i == 3 || i == 28 || i == 62 || i == 43 || i == 81;
    }

    public static final boolean A03(AnonymousClass21W r4) {
        C18070vi.A0d(r4, 0);
        C62572rc r3 = r4.A02;
        if (r3 != null && A00(r4.A0u) && r4.A0v.A02 && r4.A11(1) && !r3.A0V && r4.A07 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r2 = (X.AnonymousClass21V) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C18030ve r1, X.AnonymousClass206 r2) {
        /*
            X.C18070vi.A0h(r2, r1)
            boolean r0 = r2 instanceof X.C440922c
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x0028
        L_0x000b:
            X.21V r2 = (X.AnonymousClass21V) r2
            X.36v r0 = r2.A17()
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x001f
        L_0x0019:
            boolean r0 = r2.A0w()
            if (r0 == 0) goto L_0x0028
        L_0x001f:
            boolean r0 = X.C108985cd.A1V(r1)
            r1 = r0 ^ 1
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72Z.A01(X.0ve, X.206):boolean");
    }

    public static final boolean A02(C18030ve r5, AnonymousClass21W r6) {
        boolean A15 = C18070vi.A15(r6, r5);
        C62572rc r3 = r6.A02;
        A01(r5, r6);
        boolean z = r6.A0v.A02;
        A03(r6);
        if (r3 == null || !A01(r5, r6)) {
            return false;
        }
        if ((!z || A03(r6)) && !r3.A0V && r3.A07 == A15) {
            return true;
        }
        return false;
    }
}
