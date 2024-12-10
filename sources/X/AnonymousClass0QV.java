package X;

/* renamed from: X.0QV  reason: invalid class name */
public abstract class AnonymousClass0QV {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if ((r3 instanceof X.C014308l) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if ((2 & r3.A01) == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r3 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if ((r3 instanceof X.C014308l) != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r3 = ((X.C014308l) r3).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r3 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if ((r3 instanceof X.C17670v2) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C17670v2 A02(X.AnonymousClass0XW r3) {
        /*
            r1 = 2
            int r0 = r3.A01
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L_0x002a
            boolean r0 = r3 instanceof X.C17670v2
            if (r0 != 0) goto L_0x0027
            boolean r0 = r3 instanceof X.C014308l
            if (r0 == 0) goto L_0x002a
        L_0x000f:
            X.08l r3 = (X.C014308l) r3
            X.0XW r3 = r3.A00
        L_0x0013:
            if (r3 == 0) goto L_0x002a
            boolean r0 = r3 instanceof X.C17670v2
            if (r0 != 0) goto L_0x0027
            boolean r0 = r3 instanceof X.C014308l
            if (r0 == 0) goto L_0x0024
            r1 = 2
            int r0 = r3.A01
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0024
            goto L_0x000f
        L_0x0024:
            X.0XW r3 = r3.A02
            goto L_0x0013
        L_0x0027:
            X.0v2 r3 = (X.C17670v2) r3
            return r3
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QV.A02(X.0XW):X.0v2");
    }

    public static final C01850Ad A04(C15830rH r2, int i) {
        C01850Ad A0A = ((AnonymousClass0XW) r2).A03.A0A();
        C18070vi.A0b(A0A);
        if (A0A.A0r() != r2 || (i & 128) == 0) {
            return A0A;
        }
        C01850Ad A0w = A0A.A0w();
        C18070vi.A0b(A0w);
        return A0w;
    }

    public static final AnonymousClass0XW A00(C06970a9 r1) {
        int i;
        if (r1 == null || (i = r1.A00) == 0) {
            return null;
        }
        return (AnonymousClass0XW) r1.A06(i - 1);
    }

    public static final AnonymousClass0XV A03(C15830rH r0) {
        C01850Ad A0A = ((AnonymousClass0XW) r0).A03.A0A();
        if (A0A != null) {
            return A0A.A0t();
        }
        throw AnonymousClass000.A0n("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static AnonymousClass0WK A01(C15830rH r0) {
        return (AnonymousClass0WK) A05(r0).getFocusOwner();
    }

    public static final C17140to A05(C15830rH r0) {
        C17140to r02 = A03(r0).A08;
        if (r02 != null) {
            return r02;
        }
        throw AnonymousClass000.A0n("This node does not have an owner.");
    }

    public static final void A06(C06970a9 r3, AnonymousClass0XW r4) {
        C06970a9 A0F = A03(r4).A0F();
        int i = A0F.A00;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = A0F.A01;
            do {
                r3.A0F(((AnonymousClass0XV) objArr[i2]).A0S.A01);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static void A07(C15830rH r0) {
        A03(r0).A0W();
    }

    public static void A08(C15830rH r0) {
        A03(r0).A0V();
    }
}
