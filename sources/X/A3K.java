package X;

import java.util.ArrayList;

public abstract class A3K {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0048 A[SYNTHETIC, Splitter:B:18:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = 0
            X.C18070vi.A0d(r6, r5)
            r4 = 1
            boolean r0 = X.C18070vi.A18(r7, r6)
            if (r0 != 0) goto L_0x0057
            java.lang.String r1 = ".crypt"
            r3 = 2
            boolean r0 = r6.endsWith(r1)
            if (r0 == 0) goto L_0x0015
            return r4
        L_0x0015:
            java.util.List r2 = X.C108965cb.A0v(r6, r1, r5)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0045
            java.util.ListIterator r1 = X.C108955ca.A18(r2)
        L_0x0023:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0045
            int r0 = X.C108985cd.A08(r1)
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = X.C108985cd.A0t(r2, r1)
        L_0x0033:
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            int r0 = r1.length
            r5 = -1
            java.lang.String r2 = "msgstore/get-version/unexpected-filename "
            if (r0 == r3) goto L_0x0048
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0e(r2, r6, r0)
            return r5
        L_0x0045:
            X.0wS r0 = X.C18460wS.A00
            goto L_0x0033
        L_0x0048:
            r0 = r1[r4]     // Catch:{ NumberFormatException -> 0x004f }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x004f }
            return r5
        L_0x004f:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0h(r2, r6, r0, r1)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A3K.A00(java.lang.String, java.lang.String):int");
    }

    public static final String A01(AnonymousClass9JN r2) {
        StringBuilder A0K = C18070vi.A0K(r2);
        A0K.append(".crypt");
        return C17880vN.A0t(A0K, r2.version);
    }

    public static final ArrayList A02(AnonymousClass9JN r4) {
        AnonymousClass9JN A00 = AnonymousClass9JN.A00();
        if (r4.version <= A00.version) {
            AnonymousClass9JN[] A04 = AnonymousClass9JN.A04(r4, A00);
            C18070vi.A0X(A04);
            ArrayList A0z = C17880vN.A0z(r3);
            for (AnonymousClass9JN r0 : A04) {
                C18070vi.A0b(r0);
                A0z.add(A01(r0));
            }
            A0z.add(A01(AnonymousClass9JN.UNENCRYPTED));
            return A0z;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("msgstore/get-db-crypt-extension-range/illegal-range [");
        A10.append(r4);
        A10.append(", ");
        throw AnonymousClass000.A0k(AnonymousClass001.A1F(A00, A10));
    }
}
