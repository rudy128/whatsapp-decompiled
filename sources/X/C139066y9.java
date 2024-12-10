package X;

import android.content.Context;

/* renamed from: X.6y9  reason: invalid class name and case insensitive filesystem */
public final class C139066y9 {
    public final C129446ho A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Removed duplicated region for block: B:41:0x009d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.C122646Re r6, java.util.Collection r7, int r8) {
        /*
            r5 = this;
            r1 = 0
            boolean r0 = r7.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x009e
            boolean r0 = X.C1402870s.A02(r7)
            if (r0 == 0) goto L_0x009e
            boolean r0 = X.C1402870s.A01(r7)
            if (r0 == 0) goto L_0x009e
            r0 = 5
            if (r8 == r0) goto L_0x006f
            r0 = 6
            if (r8 == r0) goto L_0x006f
            boolean r0 = X.AnonymousClass74A.A07(r7)
            if (r0 == 0) goto L_0x0021
            return r1
        L_0x0021:
            r0 = 16
            if (r8 == r0) goto L_0x0048
            switch(r8) {
                case 4: goto L_0x0029;
                case 5: goto L_0x0028;
                case 6: goto L_0x0028;
                case 7: goto L_0x0029;
                case 8: goto L_0x006f;
                default: goto L_0x0028;
            }
        L_0x0028:
            return r4
        L_0x0029:
            X.00H r0 = r5.A03
            java.lang.Object r3 = r0.get()
            X.2iO r3 = (X.C57012iO) r3
            java.util.ArrayList r2 = X.C29351c6.A0E(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x0039:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0043
            X.C108995ce.A1Q(r2, r1)
            goto L_0x0039
        L_0x0043:
            boolean r4 = r3.A00(r6, r2)
            return r4
        L_0x0048:
            X.00H r0 = r5.A03
            java.lang.Object r3 = r0.get()
            X.2iO r3 = (X.C57012iO) r3
            java.util.ArrayList r2 = X.C29351c6.A0E(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x0058:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0062
            X.C108995ce.A1Q(r2, r1)
            goto L_0x0058
        L_0x0062:
            boolean r0 = r3.A00(r6, r2)
            if (r0 == 0) goto L_0x009e
            boolean r0 = A00(r6, r5)
            if (r0 == 0) goto L_0x009e
            goto L_0x009d
        L_0x006f:
            X.00H r0 = r5.A03
            java.lang.Object r3 = r0.get()
            X.2iO r3 = (X.C57012iO) r3
            java.util.ArrayList r2 = X.C29351c6.A0E(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x007f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0089
            X.C108995ce.A1Q(r2, r1)
            goto L_0x007f
        L_0x0089:
            boolean r0 = r3.A00(r6, r2)
            if (r0 == 0) goto L_0x009e
            boolean r0 = A00(r6, r5)
            if (r0 != 0) goto L_0x009d
            X.00H r0 = r5.A01
            X.77e r0 = X.C108975cc.A0K(r6, r0)
            if (r0 == 0) goto L_0x009e
        L_0x009d:
            r4 = 1
        L_0x009e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139066y9.A01(X.6Re, java.util.Collection, int):boolean");
    }

    public C139066y9(AnonymousClass118 r1, C129446ho r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r4, r2);
        this.A02 = r1;
        this.A01 = r3;
        this.A03 = r4;
        this.A00 = r2;
    }

    public static final boolean A00(C122646Re r4, C139066y9 r5) {
        int ordinal = r4.ordinal();
        AnonymousClass118 r0 = r5.A02;
        if (ordinal == 0) {
            return AnonymousClass6YD.A00(C108945cZ.A0E(r0));
        }
        Context A0E = C108945cZ.A0E(r0);
        if (C24211Jh.A00(A0E, "com.instagram.android") == -1 && C24211Jh.A00(A0E, "com.instagram.lite") == -1) {
            return false;
        }
        return true;
    }
}
