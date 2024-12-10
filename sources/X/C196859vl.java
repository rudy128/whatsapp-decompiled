package X;

/* renamed from: X.9vl  reason: invalid class name and case insensitive filesystem */
public abstract class C196859vl {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r4.equals("false") == false) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C59962nA A01(X.AnonymousClass190 r38, X.AnonymousClass126 r39, X.C63262sm r40, X.C29621ca r41) {
        /*
            r3 = r41
            X.1ca[] r0 = r3.A02
            r15 = 0
            if (r0 == 0) goto L_0x00ec
            int r0 = r0.length
            if (r0 == 0) goto L_0x00ec
            X.1ca r0 = r3.A0I()
            java.lang.Class<X.1EC> r2 = X.AnonymousClass1EC.class
            java.lang.String r1 = "from"
            com.whatsapp.jid.Jid r7 = r3.A0F(r2, r1)
            X.C17960vV.A07(r7)
            X.1EC r7 = (X.AnonymousClass1EC) r7
            r6 = r39
            boolean r1 = r6.A0m()
            if (r1 == 0) goto L_0x00ec
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            java.lang.String r1 = "creator"
            com.whatsapp.jid.Jid r9 = r0.A0F(r2, r1)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            java.lang.String r1 = "creation"
            java.lang.String r3 = r0.A0Q(r1, r15)
            r1 = 0
            long r22 = X.C20099A7c.A04(r3, r1)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r22 = r22 * r4
            r6.A0e(r9, r0)
            java.lang.String r3 = "subject"
            java.lang.String r12 = r0.A0Q(r3, r15)
            java.lang.String r3 = "s_t"
            java.lang.String r3 = r0.A0Q(r3, r15)
            long r24 = X.C20099A7c.A04(r3, r1)
            long r24 = r24 * r4
            java.lang.String r3 = "ack"
            java.lang.String r4 = r0.A0Q(r3, r15)
            if (r4 == 0) goto L_0x0064
            java.lang.String r3 = "false"
            boolean r3 = r4.equals(r3)
            r35 = 0
            if (r3 != 0) goto L_0x0066
        L_0x0064:
            r35 = 1
        L_0x0066:
            java.lang.String r3 = "a_v_id"
            long r26 = r0.A0D(r3, r1)
            java.lang.String r1 = "locked"
            boolean r29 = X.AnonymousClass8BX.A1S(r0, r1)
            java.lang.String r1 = "announcement"
            boolean r30 = X.AnonymousClass8BX.A1S(r0, r1)
            java.lang.String r1 = "incognito"
            boolean r33 = X.AnonymousClass8BX.A1S(r0, r1)
            java.lang.String r1 = "no_frequently_forwarded"
            boolean r31 = X.AnonymousClass8BX.A1S(r0, r1)
            java.lang.String r1 = "suspended"
            boolean r32 = X.AnonymousClass8BX.A1S(r0, r1)
            java.lang.String r1 = "support"
            boolean r28 = X.AnonymousClass8BX.A1S(r0, r1)
            r1 = r38
            java.util.LinkedHashMap r14 = X.C21535Ali.A01(r0, r1)
            X.A8d r1 = X.A8d.A00
            int r17 = X.A8d.A00(r0)
            X.1cn r11 = r1.A09(r0)
            java.lang.String r2 = "addressing_mode"
            java.lang.String r3 = r0.A0Q(r2, r15)
            java.lang.String r2 = "allow_admin_reports"
            boolean r36 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            boolean r37 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "group_history"
            boolean r38 = X.AnonymousClass8BX.A1S(r0, r2)
            java.lang.String r2 = "hidden_group"
            boolean r39 = X.AnonymousClass8BX.A1S(r0, r2)
            int r16 = X.C20099A7c.A00(r0, r14)
            X.1yX r10 = X.AnonymousClass8BW.A0P(r0)
            int r18 = X.A8d.A02(r0)
            X.1EC r8 = X.A8d.A03(r0)
            boolean r34 = X.A8d.A06(r0)
            int r19 = r1.A07(r0)
            java.lang.String r13 = X.C42671yY.A00(r3)
            int r20 = X.A8d.A01(r0)
            java.lang.String r1 = "capi"
            boolean r21 = X.AnonymousClass8BX.A1S(r0, r1)
            X.2nA r5 = new X.2nA
            r6 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return r5
        L_0x00ec:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196859vl.A01(X.190, X.126, X.2sm, X.1ca):X.2nA");
    }

    public static int A00(C29621ca r3) {
        if (!A8d.A06(r3)) {
            return 0;
        }
        C29621ca A0K = r3.A0K("membership_approval_request");
        if (A0K == null) {
            return 1;
        }
        if (A0K.A0Q("error", (String) null) == null || 304 != Integer.parseInt(AnonymousClass8BT.A0u(A0K, "error", (String) null))) {
            return 2;
        }
        return 3;
    }
}
