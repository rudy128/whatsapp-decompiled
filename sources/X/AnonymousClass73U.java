package X;

/* renamed from: X.73U  reason: invalid class name */
public final class AnonymousClass73U {
    public static final AnonymousClass73U A00 = new Object();

    public static final boolean A01(C123476Up r11, C123476Up r12) {
        Boolean bool;
        Boolean bool2;
        C122726Rr r7;
        C122726Rr r6;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        C122726Rr r2;
        C122726Rr r1;
        Boolean bool6 = null;
        if (r11 != null) {
            bool = Boolean.valueOf(r11.A04);
            bool2 = Boolean.valueOf(r11.A06);
            r7 = r11.A00;
            r6 = r11.A01;
            bool3 = Boolean.valueOf(r11.A02);
        } else {
            bool = null;
            bool2 = null;
            r7 = null;
            r6 = null;
            bool3 = null;
        }
        if (r12 != null) {
            bool4 = Boolean.valueOf(r12.A04);
            bool5 = Boolean.valueOf(r12.A06);
            r2 = r12.A00;
            r1 = r12.A01;
            bool6 = Boolean.valueOf(r12.A02);
        } else {
            bool4 = null;
            bool5 = null;
            r2 = null;
            r1 = null;
        }
        if (!C18070vi.A18(bool, bool4) || r7 != r2 || r6 != r1 || !C18070vi.A18(bool2, bool5) || !C18070vi.A18(bool3, bool6)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(AnonymousClass1E7 r3, String str, int i, long j) {
        if (i == r3.A07 && j == r3.A0E && C18070vi.A18(str, r3.A0K())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.AnonymousClass6J8 r19, X.AnonymousClass6J8 r20, boolean r21) {
        /*
            r18 = this;
            r5 = r20
            r6 = r19
            boolean r9 = X.C18070vi.A15(r6, r5)
            X.2sx r4 = r6.A00()
            X.2sx r3 = r5.A00()
            r2 = 0
            if (r4 == 0) goto L_0x0116
            com.whatsapp.jid.UserJid r1 = r4.A0A
        L_0x0015:
            if (r3 == 0) goto L_0x0113
            com.whatsapp.jid.UserJid r0 = r3.A0A
        L_0x0019:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x011e
            if (r4 == 0) goto L_0x0110
            int r0 = r4.A01()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0029:
            if (r3 == 0) goto L_0x010d
            int r0 = r3.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0033:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x011e
            if (r4 == 0) goto L_0x010a
            int r0 = r4.A00()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0043:
            if (r3 == 0) goto L_0x004d
            int r0 = r3.A00()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x004d:
            boolean r0 = X.C18070vi.A18(r1, r2)
            if (r0 == 0) goto L_0x011e
            boolean r7 = r6 instanceof X.AnonymousClass6JC
            if (r7 == 0) goto L_0x0103
            r0 = r6
            X.6JC r0 = (X.AnonymousClass6JC) r0
            java.lang.CharSequence r1 = r0.A06
        L_0x005c:
            boolean r8 = r5 instanceof X.AnonymousClass6JC
            if (r8 == 0) goto L_0x00fc
            r0 = r5
            X.6JC r0 = (X.AnonymousClass6JC) r0
            java.lang.CharSequence r0 = r0.A06
        L_0x0065:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x011e
            X.1E7 r0 = r6.A01()
            X.1E7 r4 = r5.A01()
            int r3 = r0.A07
            long r1 = r0.A0E
            java.lang.String r0 = r0.A0K()
            boolean r0 = A00(r4, r0, r3, r1)
            if (r0 == 0) goto L_0x011e
            r17 = 0
            if (r7 == 0) goto L_0x00a0
            if (r8 == 0) goto L_0x009f
            X.6JC r6 = (X.AnonymousClass6JC) r6
            X.6JC r5 = (X.AnonymousClass6JC) r5
            X.6nQ r3 = r6.A05
            X.6nP r1 = r3.A02
            X.6nQ r0 = r5.A05
            X.6nP r2 = r0.A02
            if (r21 != 0) goto L_0x00b3
            X.6Up r3 = r3.A01
            X.6Up r0 = r0.A01
            boolean r0 = A01(r3, r0)
            if (r0 != 0) goto L_0x00b3
        L_0x009f:
            return r17
        L_0x00a0:
            boolean r0 = r6 instanceof X.AnonymousClass6JB
            if (r0 == 0) goto L_0x0119
            boolean r0 = r5 instanceof X.AnonymousClass6JB
            if (r0 == 0) goto L_0x009f
            X.6JB r6 = (X.AnonymousClass6JB) r6
            boolean r1 = r6.A07
            X.6JB r5 = (X.AnonymousClass6JB) r5
            boolean r0 = r5.A07
            if (r1 != r0) goto L_0x009f
            goto L_0x00f9
        L_0x00b3:
            java.util.Set r0 = r1.A01
            int r0 = r0.size()
            long r14 = (long) r0
            java.util.Set r0 = r1.A02
            int r0 = r0.size()
            long r12 = (long) r0
            java.util.Set r0 = r1.A00
            int r0 = r0.size()
            long r10 = (long) r0
            java.util.Set r1 = r1.A03
            int r0 = r1.size()
            long r8 = (long) r0
            java.util.Set r0 = r2.A01
            int r0 = r0.size()
            long r6 = (long) r0
            java.util.Set r0 = r2.A02
            int r0 = r0.size()
            long r4 = (long) r0
            java.util.Set r0 = r2.A00
            int r0 = r0.size()
            long r2 = (long) r0
            int r0 = r1.size()
            long r0 = (long) r0
            int r16 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r16 != 0) goto L_0x009f
            int r6 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x009f
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x009f
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x009f
        L_0x00f9:
            r17 = 1
            return r17
        L_0x00fc:
            r0 = r5
            X.6JB r0 = (X.AnonymousClass6JB) r0
            java.lang.CharSequence r0 = r0.A05
            goto L_0x0065
        L_0x0103:
            r0 = r6
            X.6JB r0 = (X.AnonymousClass6JB) r0
            java.lang.CharSequence r1 = r0.A05
            goto L_0x005c
        L_0x010a:
            r1 = r2
            goto L_0x0043
        L_0x010d:
            r0 = r2
            goto L_0x0033
        L_0x0110:
            r1 = r2
            goto L_0x0029
        L_0x0113:
            r0 = r2
            goto L_0x0019
        L_0x0116:
            r1 = r2
            goto L_0x0015
        L_0x0119:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x011e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73U.A04(X.6J8, X.6J8, boolean):boolean");
    }

    public static final boolean A02(AnonymousClass6J8 r1, AnonymousClass6J8 r2) {
        C18070vi.A0h(r1, r2);
        return C18070vi.A18(r1.A01().A0J, r2.A01().A0J);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r0.A01() <= 0) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r0.A01() <= 0) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(X.AnonymousClass6J8 r9, X.AnonymousClass6J8 r10) {
        /*
            r8 = this;
            X.C18070vi.A0h(r9, r10)
            X.2sx r0 = r9.A00()
            r7 = 1
            if (r0 == 0) goto L_0x0011
            int r0 = r0.A01()
            r6 = 1
            if (r0 > 0) goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            X.2sx r0 = r10.A00()
            if (r0 == 0) goto L_0x001f
            int r0 = r0.A01()
            r5 = 1
            if (r0 > 0) goto L_0x0020
        L_0x001f:
            r5 = 0
        L_0x0020:
            X.1E7 r0 = r9.A01()
            X.1E7 r4 = r10.A01()
            int r3 = r0.A07
            long r1 = r0.A0E
            java.lang.String r0 = r0.A0K()
            boolean r0 = A00(r4, r0, r3, r1)
            if (r0 == 0) goto L_0x0052
            X.206 r0 = r9.A03()
            r2 = 0
            if (r0 == 0) goto L_0x0050
            X.205 r1 = r0.A0v
        L_0x003f:
            X.206 r0 = r10.A03()
            if (r0 == 0) goto L_0x0047
            X.205 r2 = r0.A0v
        L_0x0047:
            boolean r0 = X.C18070vi.A18(r1, r2)
            if (r0 == 0) goto L_0x0052
            if (r6 != r5) goto L_0x0052
            return r7
        L_0x0050:
            r1 = r2
            goto L_0x003f
        L_0x0052:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73U.A03(X.6J8, X.6J8):boolean");
    }
}
