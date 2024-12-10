package X;

import java.util.List;

/* renamed from: X.2tH  reason: invalid class name and case insensitive filesystem */
public final class C63542tH {
    public static final List A03;
    public static final List A04;
    public final C32661hY A00;
    public final C18030ve A01;
    public final C25125CYy A02;

    static {
        Integer[] numArr = new Integer[2];
        numArr[0] = 25;
        A03 = C18070vi.A0O(57, numArr, 1);
        Integer[] numArr2 = new Integer[2];
        C17880vN.A1T(numArr2, 28, 0);
        A04 = C18070vi.A0O(62, numArr2, 1);
    }

    public final boolean A02(AnonymousClass206 r3, boolean z) {
        C18070vi.A0d(r3, 0);
        if (!A01(this, r3, z)) {
            return false;
        }
        this.A00.A01(r3, 0);
        return true;
    }

    public static final boolean A00(C63542tH r2, AnonymousClass206 r3) {
        C20285AEt BPK;
        C20277AEk aEk;
        if (!C18020vd.A05(C18040vf.A02, r2.A01, 11576) || !(r3 instanceof AnonymousClass21K) || r3.A0u != 62 || (BPK = ((AnonymousClass21K) r3).BPK()) == null || (aEk = BPK.A06) == null || !aEk.A00()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C63542tH r8, X.AnonymousClass206 r9, boolean r10) {
        /*
            int r1 = r9.A0u
            r0 = 25
            r6 = 62
            r5 = 57
            r7 = 0
            if (r1 == r0) goto L_0x0014
            r0 = 28
            if (r1 == r0) goto L_0x0014
            if (r1 == r5) goto L_0x0019
            if (r1 == r6) goto L_0x0019
        L_0x0013:
            return r7
        L_0x0014:
            X.0ve r4 = r8.A01
            r0 = 8394(0x20ca, float:1.1762E-41)
            goto L_0x001d
        L_0x0019:
            X.0ve r4 = r8.A01
            r0 = 9970(0x26f2, float:1.3971E-41)
        L_0x001d:
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0013
            X.36w r0 = X.C60502o8.A00(r9)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.A02()
            r2 = 1
            if (r0 != r2) goto L_0x0013
            X.36w r0 = X.C60502o8.A00(r9)
            if (r0 == 0) goto L_0x003d
            boolean r0 = r0.A0A
            if (r0 != r2) goto L_0x003d
            return r7
        L_0x003d:
            if (r1 == r5) goto L_0x0041
            if (r1 != r6) goto L_0x004e
        L_0x0041:
            java.lang.String r0 = X.C20120A8f.A04(r9)
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x004e
            return r7
        L_0x004e:
            boolean r0 = r9 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0066
            r0 = r9
            X.21V r0 = (X.AnonymousClass21V) r0
            if (r0 == 0) goto L_0x0066
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0066
            boolean r0 = r0.A0V
            if (r0 != r2) goto L_0x0066
            boolean r0 = A00(r8, r9)
            if (r0 != 0) goto L_0x0066
            return r7
        L_0x0066:
            r0 = 9639(0x25a7, float:1.3507E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0098
            if (r10 != 0) goto L_0x0098
            java.util.List r0 = A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0086
            X.CYy r0 = r8.A02
            int r0 = r0.A00()
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0013
        L_0x0086:
            java.util.List r0 = A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0098
            X.CYy r0 = r8.A02
            int r0 = r0.A00()
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0013
        L_0x0098:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63542tH.A01(X.2tH, X.206, boolean):boolean");
    }

    public C63542tH(C18030ve r1, C25125CYy cYy, C32661hY r3) {
        C18070vi.A0o(r1, r3, cYy);
        this.A01 = r1;
        this.A00 = r3;
        this.A02 = cYy;
    }
}
