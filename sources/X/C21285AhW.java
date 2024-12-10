package X;

/* renamed from: X.AhW  reason: case insensitive filesystem */
public class C21285AhW implements C22470B9c {
    public final int A00;
    public final Object A01;

    public static void A00(C29621ca r2, C62672rm r3, Object obj, int i) {
        r3.A03(r2, new C21285AhW(obj, i), new String[0]);
    }

    public C21285AhW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0096, code lost:
        if (r6.A09(r7, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0098, code lost:
        r3 = new java.lang.String[r1];
        r3[r13] = "value";
        r8 = java.lang.Long.TYPE;
        r9 = X.C17890vO.A0L();
        r0 = 128;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00fa, code lost:
        r0 = (java.lang.Number) r6.A05(r7, r8, r9, java.lang.Long.valueOf(r0), r14, r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0106, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0111, code lost:
        return new X.AnonymousClass9CX(r7, r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0232, code lost:
        return new X.AnonymousClass9DM(r7, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x030c, code lost:
        if (r6.A05(r7, r8, r9, r10, java.lang.Long.valueOf(r0), r12, r13) == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0313, code lost:
        return new X.AnonymousClass9CT(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        return null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r21, X.C62672rm r22) {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A00
            r7 = r21
            r6 = r22
            switch(r0) {
                case 0: goto L_0x02d8;
                case 1: goto L_0x02ab;
                case 2: goto L_0x027e;
                case 3: goto L_0x0233;
                case 4: goto L_0x01fe;
                case 5: goto L_0x0314;
                case 6: goto L_0x01bc;
                case 7: goto L_0x0176;
                case 8: goto L_0x0112;
                case 9: goto L_0x00d5;
                case 10: goto L_0x00a7;
                case 11: goto L_0x0088;
                case 12: goto L_0x0068;
                case 13: goto L_0x005e;
                case 14: goto L_0x00a7;
                case 15: goto L_0x00a7;
                case 16: goto L_0x0034;
                case 17: goto L_0x0088;
                case 18: goto L_0x00a7;
                case 19: goto L_0x00d5;
                case 20: goto L_0x000d;
                case 21: goto L_0x00a7;
                case 22: goto L_0x0068;
                case 23: goto L_0x000d;
                case 24: goto L_0x00a7;
                default: goto L_0x000b;
            }
        L_0x000b:
            r14 = 0
        L_0x000c:
            return r14
        L_0x000d:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r2 = X.C18070vi.A17(r0, r7)
            r1 = 2
            X.C18070vi.A0d(r6, r1)
            boolean r0 = X.AnonymousClass8BR.A1Q(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "next_step_delay_ms"
            r3[r13] = r0
            java.lang.String r0 = "value"
            r3[r2] = r0
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Long r9 = X.C17890vO.A0L()
            r0 = 600000(0x927c0, double:2.964394E-318)
            goto L_0x00fa
        L_0x0034:
            java.lang.Object r0 = r1.A01
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            java.lang.String r0 = "success"
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1V(r1)
            java.lang.Long r9 = X.C108975cc.A0X()
            java.lang.Long r10 = X.AnonymousClass8BV.A0k()
            java.lang.Class<byte[]> r8 = byte[].class
            r11 = r14
            java.lang.Object r1 = r6.A04(r7, r8, r9, r10, r11, r12)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x000c
            r0 = 28
            goto L_0x022d
        L_0x005e:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            java.lang.String r0 = "max_attempts"
            goto L_0x0091
        L_0x0068:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            java.lang.String r0 = "backoff"
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "value"
            r3[r13] = r0
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Long r9 = X.C17890vO.A0L()
            r0 = 43200(0xa8c0, double:2.13436E-319)
            goto L_0x00fa
        L_0x0088:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            java.lang.String r0 = "count"
        L_0x0091:
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "value"
            r3[r13] = r0
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Long r9 = X.C17890vO.A0L()
            r0 = 128(0x80, double:6.32E-322)
            goto L_0x00fa
        L_0x00a7:
            java.lang.Object r0 = r1.A01
            r3 = 0
            boolean r2 = X.C18070vi.A17(r0, r7)
            r1 = 2
            X.C18070vi.A0d(r6, r1)
            boolean r0 = X.AnonymousClass8BR.A1Q(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "key_id"
            X.AnonymousClass8BR.A1K(r1, r3, r2, r0)
            java.lang.Long r9 = X.AnonymousClass8BV.A0d()
            java.lang.Class<byte[]> r8 = byte[].class
            r10 = r9
            r11 = r14
            r12 = r1
            java.lang.Object r1 = r6.A04(r7, r8, r9, r10, r11, r12)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x000c
            r0 = 29
            goto L_0x022d
        L_0x00d5:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r2 = X.C18070vi.A17(r0, r7)
            r1 = 2
            X.C18070vi.A0d(r6, r1)
            boolean r0 = X.AnonymousClass8BR.A1Q(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r3 = new java.lang.String[r1]
            java.lang.String r0 = "timeout"
            r3[r13] = r0
            java.lang.String r0 = "value"
            r3[r2] = r0
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Long r9 = X.C17890vO.A0L()
            r0 = 43200(0xa8c0, double:2.13436E-319)
        L_0x00fa:
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
            r11 = r14
            r12 = r3
            java.lang.Object r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x000c
            long r0 = r0.longValue()
            X.9CX r14 = new X.9CX
            r14.<init>(r7, r0)
            return r14
        L_0x0112:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r5 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            java.lang.String r0 = "fx-detail"
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r0 = "base-amount"
            r1[r13] = r0
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Long r9 = X.C108975cc.A0X()
            java.lang.Long r10 = X.AnonymousClass8BV.A0c()
            r11 = r14
            r12 = r1
            java.lang.Object r4 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r0 = "currency-fx"
            r1[r13] = r0
            r12 = r1
            java.lang.Object r3 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r0 = "currency-markup"
            r1[r13] = r0
            r12 = r1
            java.lang.Object r2 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r0 = "base-currency"
            r1[r13] = r0
            r12 = r1
            java.lang.Object r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x000c
            r11 = 4
            X.9Cv r14 = new X.9Cv
            r5 = r14
            r6 = r7
            r7 = r4
            r8 = r3
            r9 = r2
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r14
        L_0x0176:
            java.lang.Object r0 = r1.A01
            r4 = 0
            boolean r3 = X.C18070vi.A17(r0, r7)
            r2 = 2
            X.C18070vi.A0d(r6, r2)
            java.lang.String r0 = "contact"
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = X.AnonymousClass8BR.A1b()
            java.lang.String r0 = "ACTIVE"
            r1[r4] = r0
            java.lang.String r0 = "ELIGIBLE"
            r1[r3] = r0
            java.lang.String r0 = "INELIGIBLE"
            java.util.List r2 = X.C18070vi.A0O(r0, r1, r2)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "payment-status"
            r1[r4] = r0
            java.lang.String r2 = r6.A07(r7, r2, r1)
            if (r2 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "user"
            r1[r4] = r0
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass8BY.A0L(r7, r6, r1)
            if (r1 == 0) goto L_0x000c
            r0 = 15
            X.9DH r14 = new X.9DH
            r14.<init>(r1, r7, r2, r0)
            return r14
        L_0x01bc:
            java.lang.Object r0 = r1.A01
            r13 = 0
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            java.lang.String r0 = "collection"
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1T(r1)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Long r9 = X.C108975cc.A0X()
            java.lang.Long r10 = X.AnonymousClass8BV.A0j()
            r11 = r14
            java.lang.Object r2 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "version"
            r1[r13] = r0
            java.lang.Number r0 = X.AnonymousClass8BY.A0T(r7, r6, r1)
            if (r0 == 0) goto L_0x000c
            long r18 = r0.longValue()
            r17 = 17
            X.9D6 r14 = new X.9D6
            r15 = r7
            r16 = r2
            r14.<init>(r15, r16, r17, r18)
            return r14
        L_0x01fe:
            java.lang.Object r0 = r1.A01
            r3 = 0
            boolean r2 = X.C18070vi.A17(r0, r7)
            r1 = 2
            X.C18070vi.A0d(r6, r1)
            boolean r0 = X.AnonymousClass8BR.A1Q(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r0 = "cat"
            X.AnonymousClass8BR.A1K(r1, r3, r2, r0)
            java.lang.Long r9 = X.C108975cc.A0X()
            java.lang.Long r10 = X.AnonymousClass8BV.A0k()
            java.lang.Class<byte[]> r8 = byte[].class
            r11 = r14
            r12 = r1
            java.lang.Object r1 = r6.A04(r7, r8, r9, r10, r11, r12)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x000c
            r0 = 23
        L_0x022d:
            X.9DM r14 = new X.9DM
            r14.<init>((X.C29621ca) r7, (byte[]) r1, (int) r0)
            return r14
        L_0x0233:
            java.lang.Object r0 = r1.A01
            r3 = 0
            boolean r4 = X.C18070vi.A17(r0, r7)
            r1 = 2
            X.C18070vi.A0d(r6, r1)
            java.lang.String r0 = "config"
            boolean r0 = r6.A09(r7, r0)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            r0 = 7
            X.B9c[] r2 = new X.C22470B9c[r0]
            X.AhK r0 = X.C21273AhK.A00
            r2[r3] = r0
            X.AhL r0 = X.C21274AhL.A00
            r2[r4] = r0
            X.AhM r0 = X.C21275AhM.A00
            r2[r1] = r0
            r1 = 3
            X.AhN r0 = X.C21276AhN.A00
            r2[r1] = r0
            r1 = 4
            X.AhO r0 = X.C21277AhO.A00
            r2[r1] = r0
            r1 = 5
            X.AhP r0 = X.C21278AhP.A00
            r2[r1] = r0
            r1 = 6
            X.AhQ r0 = X.C21279AhQ.A00
            java.util.List r2 = X.C18070vi.A0O(r0, r2, r1)
            java.lang.String[] r1 = new java.lang.String[r3]
            java.lang.String r0 = "AndroidClientResponse|EnterpriseClient|AppleClient|KaiosClient|FBClient|WebClient|WNSClient"
            java.lang.Object r0 = r6.A06(r7, r0, r2, r1)
            if (r0 == 0) goto L_0x000c
            X.3LS r0 = (X.AnonymousClass3LS) r0
            X.9DM r14 = new X.9DM
            r14.<init>((X.C29621ca) r7, (X.AnonymousClass3LS) r0)
            return r14
        L_0x027e:
            java.lang.Object r0 = r1.A01
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            boolean r0 = X.AnonymousClass8BR.A1R(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1U(r1)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Long r9 = X.AnonymousClass8BU.A0i()
            java.lang.Long r10 = X.AnonymousClass8BU.A0j()
            java.lang.String r11 = "service-unavailable"
            r13 = 0
            java.lang.Object r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1S(r1)
            java.lang.Class r8 = java.lang.Long.TYPE
            r0 = 503(0x1f7, double:2.485E-321)
            goto L_0x0304
        L_0x02ab:
            java.lang.Object r0 = r1.A01
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            boolean r0 = X.AnonymousClass8BR.A1R(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1U(r1)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Long r9 = X.AnonymousClass8BU.A0i()
            java.lang.Long r10 = X.AnonymousClass8BU.A0j()
            java.lang.String r11 = "feature-not-implemented"
            r13 = 0
            java.lang.Object r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1S(r1)
            java.lang.Class r8 = java.lang.Long.TYPE
            r0 = 501(0x1f5, double:2.475E-321)
            goto L_0x0304
        L_0x02d8:
            java.lang.Object r0 = r1.A01
            boolean r1 = X.AnonymousClass8BX.A1U(r0, r7, r6)
            boolean r0 = X.AnonymousClass8BR.A1R(r7, r6)
            r14 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1U(r1)
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Long r9 = X.AnonymousClass8BU.A0i()
            java.lang.Long r10 = X.AnonymousClass8BU.A0j()
            java.lang.String r11 = "internal-server-error"
            r13 = 0
            java.lang.Object r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x000c
            java.lang.String[] r12 = X.AnonymousClass8BS.A1S(r1)
            java.lang.Class r8 = java.lang.Long.TYPE
            r0 = 500(0x1f4, double:2.47E-321)
        L_0x0304:
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x000c
            X.9CT r14 = new X.9CT
            r14.<init>(r7)
            return r14
        L_0x0314:
            java.lang.Object r0 = r1.A01
            X.9DC r14 = X.AnonymousClass8BY.A0Q(r7, r6, r0)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21285AhW.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
