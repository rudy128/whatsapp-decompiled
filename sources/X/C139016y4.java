package X;

import java.util.Iterator;

/* renamed from: X.6y4  reason: invalid class name and case insensitive filesystem */
public final class C139016y4 {
    public final C24661Le A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass18K A02;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C122646Re r4, X.AnonymousClass206 r5, X.C139016y4 r6, java.lang.String r7, java.lang.String r8, int r9, int r10) {
        /*
            X.646 r3 = new X.646
            r3.<init>()
            r1 = 1
            if (r9 == r1) goto L_0x000c
            r0 = 2
            if (r9 == r0) goto L_0x000c
            r1 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A01 = r0
            r3.A08 = r7
            switch(r9) {
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b6;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00ac;
                case 8: goto L_0x00a9;
                case 9: goto L_0x0017;
                case 10: goto L_0x00a6;
                default: goto L_0x0017;
            }
        L_0x0017:
            r0 = 0
        L_0x0018:
            r3.A03 = r0
            int r1 = r4.ordinal()
            r2 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0025
            if (r1 != r2) goto L_0x0025
            r2 = 2
        L_0x0025:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r3.A07 = r0
            X.205 r0 = r5.A0v
            java.lang.String r0 = r0.A01
            r3.A0A = r0
            r3.A09 = r8
            X.00H r0 = r6.A01
            X.6zR r1 = X.C108985cd.A0Q(r0)
            r0 = 1
            if (r2 == r0) goto L_0x00a3
            boolean r0 = r1.A01
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r0
            boolean r0 = r5 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0098
            r2 = 39
        L_0x0050:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L_0x0054:
            r3.A06 = r0
            X.1Le r0 = r6.A00
            int r4 = r0.A05()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0071
            r1 = 3
            if (r4 == 0) goto L_0x006d
            r0 = 1
            r1 = 2
            if (r4 == r0) goto L_0x006d
            if (r4 != r1) goto L_0x0071
            r1 = 4
        L_0x006d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0071:
            r3.A04 = r2
            X.77K r0 = X.C63672tV.A00(r5)
            if (r0 == 0) goto L_0x0092
            int r4 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0090
            r1 = 3
            if (r4 == 0) goto L_0x008c
            r0 = 1
            r1 = 2
            if (r4 == r0) goto L_0x008c
            if (r4 != r1) goto L_0x0090
            r1 = 4
        L_0x008c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0090:
            r3.A05 = r2
        L_0x0092:
            X.18K r0 = r6.A02
            r0.CC7(r3)
            return
        L_0x0098:
            int r1 = r5.A0u
            r0 = 1
            r2 = 2
            if (r1 == r0) goto L_0x0050
            r2 = 3
            if (r1 == r2) goto L_0x0050
            r0 = 0
            goto L_0x0054
        L_0x00a3:
            boolean r0 = r1.A00
            goto L_0x0044
        L_0x00a6:
            r0 = 9
            goto L_0x00b9
        L_0x00a9:
            r0 = 8
            goto L_0x00b9
        L_0x00ac:
            r0 = 7
            goto L_0x00b9
        L_0x00ae:
            r0 = 6
            goto L_0x00b9
        L_0x00b0:
            r0 = 5
            goto L_0x00b9
        L_0x00b2:
            r0 = 4
            goto L_0x00b9
        L_0x00b4:
            r0 = 3
            goto L_0x00b9
        L_0x00b6:
            r0 = 2
            goto L_0x00b9
        L_0x00b8:
            r0 = 1
        L_0x00b9:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139016y4.A00(X.6Re, X.206, X.6y4, java.lang.String, java.lang.String, int, int):void");
    }

    public final void A01(C136316tc r12) {
        Iterator it = r12.A01.iterator();
        while (it.hasNext()) {
            C139886zb r2 = (C139886zb) it.next();
            Iterator it2 = r12.A02.iterator();
            while (it2.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it2);
                C18070vi.A0b(A0Y);
                A00(r2.A00, A0Y, this, r12.A04, (String) null, r12.A00, 2);
            }
        }
    }

    public C139016y4(C24661Le r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
