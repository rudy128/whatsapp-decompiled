package X;

/* renamed from: X.AfU  reason: case insensitive filesystem */
public class C21159AfU implements C22470B9c {
    public final int A00;
    public final Object A01;

    public C21159AfU(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03c4, code lost:
        r15 = java.lang.Long.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03c8, code lost:
        r0 = (java.lang.Number) r10.A05(r11, r12, r13, r14, r15, r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x03ce, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03d9, code lost:
        return new X.AnonymousClass9ES(r11, r0.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
        return new X.AnonymousClass9D6(r11, r0, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a9, code lost:
        r0 = (java.lang.Number) r10.A05(r11, r12, r13, r14, java.lang.Long.valueOf(r2), r16, r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b3, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
        return new X.AnonymousClass9EU(r11, r0.longValue());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r26, X.C62672rm r27) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r11 = r26
            r10 = r27
            switch(r1) {
                case 0: goto L_0x051f;
                case 1: goto L_0x04ef;
                case 2: goto L_0x04ac;
                case 3: goto L_0x046d;
                case 4: goto L_0x000d;
                case 5: goto L_0x046d;
                case 6: goto L_0x0404;
                case 7: goto L_0x000d;
                case 8: goto L_0x046d;
                case 9: goto L_0x000d;
                case 10: goto L_0x03da;
                case 11: goto L_0x0399;
                case 12: goto L_0x036d;
                case 13: goto L_0x0341;
                case 14: goto L_0x0314;
                case 15: goto L_0x02ad;
                case 16: goto L_0x0280;
                case 17: goto L_0x0251;
                case 18: goto L_0x0224;
                case 19: goto L_0x01f7;
                case 20: goto L_0x01c8;
                case 21: goto L_0x019b;
                case 22: goto L_0x016e;
                case 23: goto L_0x00bf;
                case 24: goto L_0x019b;
                case 25: goto L_0x016e;
                case 26: goto L_0x0399;
                case 27: goto L_0x036d;
                case 28: goto L_0x0280;
                case 29: goto L_0x0341;
                case 30: goto L_0x0314;
                case 31: goto L_0x02ad;
                case 32: goto L_0x007e;
                case 33: goto L_0x0052;
                case 34: goto L_0x0251;
                case 35: goto L_0x0224;
                case 36: goto L_0x01f7;
                case 37: goto L_0x01c8;
                case 38: goto L_0x00bf;
                default: goto L_0x000d;
            }
        L_0x000d:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "internal-server-error"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Long r15 = X.AnonymousClass8BV.A0i()
            java.lang.Object r2 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0051
            long r5 = r2.longValue()
            r4 = 19
        L_0x004a:
            X.9D6 r1 = new X.9D6
            r2 = r11
            r3 = r0
            r1.<init>(r2, r3, r4, r5)
        L_0x0051:
            return r1
        L_0x0052:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "wf-not-authorized-invalid-password"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 416(0x1a0, double:2.055E-321)
            goto L_0x00a9
        L_0x007e:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "wf-not-authorized-invalid-nonce"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 417(0x1a1, double:2.06E-321)
        L_0x00a9:
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0051
            long r2 = r0.longValue()
            X.9EU r1 = new X.9EU
            r1.<init>(r11, r2)
            return r1
        L_0x00bf:
            r17 = 0
            boolean r3 = X.C18070vi.A17(r0, r11)
            r6 = 2
            X.C18070vi.A0d(r10, r6)
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r0 = "encrypted_key"
            r2[r17] = r0
            java.lang.String r9 = "#elementValue"
            r2[r3] = r9
            java.lang.Long r13 = X.C108975cc.A0X()
            r0 = 2048(0x800, double:1.0118E-320)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            java.lang.Class<byte[]> r12 = byte[].class
            r1 = 0
            r15 = r1
            r16 = r2
            java.lang.Object r2 = r10.A04(r11, r12, r13, r14, r15, r16)
            byte[] r2 = (byte[]) r2
            r8 = 0
            if (r2 == 0) goto L_0x0051
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r0 = "nonce"
            r7[r17] = r0
            r7[r3] = r9
            r4 = 128(0x80, double:6.32E-322)
            java.lang.Long r14 = java.lang.Long.valueOf(r4)
            r16 = r7
            java.lang.Object r0 = r10.A04(r11, r12, r13, r14, r15, r16)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r4 = "encrypted_data"
            r7[r17] = r4
            r7[r3] = r9
            r4 = 8192(0x2000, double:4.0474E-320)
            java.lang.Long r22 = java.lang.Long.valueOf(r4)
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            r23 = r1
            r24 = r7
            java.lang.Object r4 = r18.A04(r19, r20, r21, r22, r23, r24)
            byte[] r4 = (byte[]) r4
            if (r4 == 0) goto L_0x0051
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r5 = "auth_tag"
            r6[r17] = r5
            r6[r3] = r9
            r16 = r6
            java.lang.Object r5 = r10.A04(r11, r12, r13, r14, r15, r16)
            byte[] r5 = (byte[]) r5
            if (r5 == 0) goto L_0x0051
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r1 = "version"
            r6[r17] = r1
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "1"
            r16 = r6
            java.lang.Object r1 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0546
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r1 = "algorithm"
            r3[r17] = r1
            java.lang.String r15 = "rsa2048"
            r16 = r3
            java.lang.Object r1 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x0546
            X.6Ou r1 = new X.6Ou
            r6 = r1
            r7 = r11
            r8 = r2
            r9 = r0
            r10 = r4
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r1
        L_0x016e:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "not-authorized"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 401(0x191, double:1.98E-321)
            goto L_0x03c4
        L_0x019b:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "service-unavailable"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 503(0x1f7, double:2.485E-321)
            goto L_0x03c4
        L_0x01c8:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "internal-server-error"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Long r15 = X.AnonymousClass8BV.A0i()
            goto L_0x03c8
        L_0x01f7:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "payload-enc-dec-failed"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 480(0x1e0, double:2.37E-321)
            goto L_0x03c4
        L_0x0224:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "request-timeout"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 408(0x198, double:2.016E-321)
            goto L_0x03c4
        L_0x0251:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "bad-request"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Long r15 = X.AnonymousClass8BV.A0h()
            goto L_0x03c8
        L_0x0280:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "conflict"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 409(0x199, double:2.02E-321)
            goto L_0x03c4
        L_0x02ad:
            r17 = 0
            boolean r4 = X.C18070vi.A17(r0, r11)
            r7 = 2
            X.C18070vi.A0d(r10, r7)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r6 = "false"
            r0[r17] = r6
            java.lang.String r5 = "true"
            java.util.List r3 = X.C18070vi.A0O(r5, r0, r4)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "ndc"
            r2[r17] = r0
            r10.A07(r11, r3, r2)
            java.util.List r3 = X.AnonymousClass8BX.A0o(r6, r5, r7, r4)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "npr"
            r2[r17] = r0
            r10.A07(r11, r3, r2)
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r4)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "wf-suspended"
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r4)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 484(0x1e4, double:2.39E-321)
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0051
            long r2 = r0.longValue()
            X.9ET r1 = new X.9ET
            r1.<init>(r11, r2)
            return r1
        L_0x0314:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "wf-state-mismatch"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 485(0x1e5, double:2.396E-321)
            goto L_0x03c4
        L_0x0341:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "wf-not-found"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 483(0x1e3, double:2.386E-321)
            goto L_0x03c4
        L_0x036d:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "not-allowed"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 405(0x195, double:2.0E-321)
            goto L_0x03c4
        L_0x0399:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "rate-overlimit"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            r2 = 429(0x1ad, double:2.12E-321)
        L_0x03c4:
            java.lang.Long r15 = java.lang.Long.valueOf(r2)
        L_0x03c8:
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0051
            long r2 = r0.longValue()
            X.9ES r1 = new X.9ES
            r1.<init>(r11, r2)
            return r1
        L_0x03da:
            r3 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            java.lang.String r0 = "notice"
            boolean r0 = r10.A09(r11, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r0 = "t"
            r2[r3] = r0
            java.lang.Number r0 = X.AnonymousClass8BY.A0T(r11, r10, r2)
            if (r0 == 0) goto L_0x0051
            long r2 = r0.longValue()
            X.9Ch r0 = X.C20023A3p.A00(r11, r10)
            if (r0 == 0) goto L_0x0051
            X.9DK r1 = new X.9DK
            r1.<init>((X.C29621ca) r11, (X.C178229Ch) r0, (long) r2)
            return r1
        L_0x0404:
            r3 = 0
            boolean r4 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            java.lang.String r0 = "notice"
            boolean r0 = r10.A09(r11, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "t"
            r2[r3] = r0
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Long r13 = X.C17890vO.A0L()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            r15 = r1
            r16 = r2
            r17 = r3
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0051
            long r8 = r0.longValue()
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "version"
            r2[r3] = r0
            java.lang.Long r18 = X.C108975cc.A0X()
            r15 = r10
            r16 = r11
            r17 = r12
            r19 = r14
            r20 = r1
            r21 = r2
            r22 = r3
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.String[] r16 = X.AnonymousClass8BS.A1a(r4, r3)
            r15 = r1
            r17 = r3
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Long r0 = (java.lang.Long) r0
            X.9Ch r5 = X.C20023A3p.A00(r11, r10)
            if (r5 == 0) goto L_0x0051
            X.6Ov r1 = new X.6Ov
            r3 = r1
            r4 = r11
            r6 = r2
            r7 = r0
            r3.<init>((X.C29621ca) r4, (X.C178229Ch) r5, (java.lang.Long) r6, (java.lang.Long) r7, (long) r8)
            return r1
        L_0x046d:
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            boolean r0 = X.AnonymousClass8BR.A1R(r11, r10)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1U(r2)
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Long r13 = X.AnonymousClass8BU.A0i()
            java.lang.Long r14 = X.AnonymousClass8BU.A0j()
            java.lang.String r15 = "bad-request"
            r17 = 0
            java.lang.Object r0 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r16 = X.AnonymousClass8BS.A1S(r2)
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Long r15 = X.AnonymousClass8BV.A0h()
            java.lang.Object r2 = r10.A05(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0051
            long r5 = r2.longValue()
            r4 = 18
            goto L_0x004a
        L_0x04ac:
            r3 = 0
            boolean r5 = X.C18070vi.A17(r0, r11)
            r4 = 2
            X.C18070vi.A0d(r10, r4)
            java.lang.String r0 = "item"
            boolean r0 = r10.A09(r11, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            r2[r3] = r0
            java.lang.Class<X.1ED> r0 = X.AnonymousClass1ED.class
            r2[r5] = r0
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.List r2 = X.C18070vi.A0O(r0, r2, r4)
            java.lang.String[] r0 = X.AnonymousClass8BS.A1Z(r5, r3)
            com.whatsapp.jid.Jid r4 = r10.A01(r11, r2, r0)
            if (r4 == 0) goto L_0x0051
            java.lang.String[] r2 = new java.lang.String[r5]
            java.lang.String r0 = "t"
            r2[r3] = r0
            java.lang.Number r0 = X.AnonymousClass8BY.A0T(r11, r10, r2)
            if (r0 == 0) goto L_0x0051
            long r2 = r0.longValue()
            X.9DK r1 = new X.9DK
            r1.<init>((com.whatsapp.jid.Jid) r4, (X.C29621ca) r11, (long) r2)
            return r1
        L_0x04ef:
            r4 = 0
            boolean r3 = X.C18070vi.A17(r0, r11)
            r2 = 2
            X.C18070vi.A0d(r10, r2)
            java.lang.String r0 = "single_serialized_proof"
            boolean r0 = r10.A09(r11, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            X.B9c[] r2 = new X.C22470B9c[r2]
            X.Ah0 r0 = X.C21253Ah0.A00
            r2[r4] = r0
            X.Ah1 r0 = X.C21254Ah1.A00
            java.util.List r3 = X.C18070vi.A0O(r0, r2, r3)
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r0 = "SingleSerializedProofSuccess|SingleSerializedLookupError"
            java.lang.Object r0 = r10.A06(r11, r0, r3, r2)
            if (r0 == 0) goto L_0x0051
            X.88g r0 = (X.C1603888g) r0
            X.9DO r1 = new X.9DO
            r1.<init>((X.C29621ca) r11, (X.C1603888g) r0)
            return r1
        L_0x051f:
            r3 = 0
            boolean r2 = X.AnonymousClass8BX.A1U(r0, r11, r10)
            java.lang.String r0 = "income_ranges"
            boolean r0 = r10.A09(r11, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0051
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.String r0 = "range"
            r2[r3] = r0
            X.AfT r0 = new X.AfT
            r0.<init>(r3)
            java.util.ArrayList r2 = X.AnonymousClass8BX.A0l(r11, r10, r0, r2)
            if (r2 == 0) goto L_0x0051
            r0 = 10
            X.9DN r1 = new X.9DN
            r1.<init>((X.C29621ca) r11, (java.util.List) r2, (int) r0)
            return r1
        L_0x0546:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21159AfU.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
