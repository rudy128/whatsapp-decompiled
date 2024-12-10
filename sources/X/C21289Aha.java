package X;

/* renamed from: X.Aha  reason: case insensitive filesystem */
public class C21289Aha implements C22470B9c {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21289Aha(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static C21289Aha A00(Object obj, Object obj2, int i) {
        return new C21289Aha(obj, obj2, i);
    }

    public static Object A01(C29621ca r1, C62672rm r2, Object obj, Object obj2, int i) {
        return new C21289Aha(obj, obj2, i).BCF(r1, r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v39, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x056a, code lost:
        return new X.AnonymousClass9DP(r1, r4, new X.AnonymousClass9DB(r2, r4, r0, r5, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x08b7, code lost:
        r15 = new X.AnonymousClass9D6(r16, r0, r18, r19);
        r0 = X.A96.A07(r4, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x08c3, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x08ca, code lost:
        return new X.AnonymousClass9EG(r4, r15, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0920, code lost:
        r15 = new X.AnonymousClass9D6(r16, r0, r18, r19);
        r0 = X.A96.A07(r4, r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x092c, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0933, code lost:
        return new X.AnonymousClass9EF(r4, r15, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x094b, code lost:
        return new X.AnonymousClass9DJ(r5, r2, r4, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0957, code lost:
        return new X.AnonymousClass9DB(r2, r4, r0, r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0958, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("required child ");
        r0 = r3[r22];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0964, code lost:
        r0 = X.AnonymousClass000.A10();
        X.AnonymousClass8BY.A12(r4, r0, r7, r5);
        r0 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0970, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("required child ");
        r0 = r6[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x097b, code lost:
        r1.append(r0);
        r1.append(" missing for tag ");
        r0 = X.AnonymousClass000.A0y(r4.A00, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0989, code lost:
        r9.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x098b, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:?, code lost:
        return new X.AnonymousClass9DB(r0, r4, r2, r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:?, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        return r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r29, X.C62672rm r30) {
        /*
            r28 = this;
            r2 = r28
            int r0 = r2.A00
            r4 = r29
            r9 = r30
            switch(r0) {
                case 0: goto L_0x08cb;
                case 1: goto L_0x0860;
                case 2: goto L_0x0807;
                case 3: goto L_0x07ae;
                case 4: goto L_0x074f;
                case 5: goto L_0x08cb;
                case 6: goto L_0x0860;
                case 7: goto L_0x0807;
                case 8: goto L_0x07ae;
                case 9: goto L_0x074f;
                case 10: goto L_0x06e5;
                case 11: goto L_0x08cb;
                case 12: goto L_0x067b;
                case 13: goto L_0x0807;
                case 14: goto L_0x074f;
                case 15: goto L_0x08cb;
                case 16: goto L_0x0860;
                case 17: goto L_0x0807;
                case 18: goto L_0x07ae;
                case 19: goto L_0x074f;
                case 20: goto L_0x05f3;
                case 21: goto L_0x056b;
                case 22: goto L_0x04bb;
                case 23: goto L_0x043b;
                case 24: goto L_0x03bb;
                case 25: goto L_0x0337;
                case 26: goto L_0x02b2;
                case 27: goto L_0x020f;
                case 28: goto L_0x016d;
                case 29: goto L_0x0934;
                case 30: goto L_0x0934;
                case 31: goto L_0x0099;
                case 32: goto L_0x0934;
                case 33: goto L_0x0099;
                case 34: goto L_0x0934;
                case 35: goto L_0x0099;
                case 36: goto L_0x0934;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r1 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r10, r4, r9, r3)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "id"
            r2[r1] = r0
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r0, r15, r1)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r1
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r21 = r2
            r22 = r3
            r16 = r4
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r3, r1)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r21 = X.AnonymousClass8BS.A1X(r3, r1)
            r16 = r10
            r20 = r14
            r22 = r1
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r19 = r4
            r20 = r17
            r21 = r12
            r22 = r13
            r25 = r3
            java.lang.Object r0 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r1)
            java.lang.String r20 = "result"
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r1
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0098
            r10 = 14
        L_0x008e:
            X.9DB r14 = new X.9DB
            r5 = r14
            r6 = r0
            r7 = r4
            r8 = r2
            r9 = r1
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0098:
            return r14
        L_0x0099:
            java.lang.Object r1 = r2.A01
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r0 = 0
            boolean r1 = X.C18070vi.A17(r1, r10)
            r3 = 2
            X.AnonymousClass3Ma.A1O(r4, r3, r9)
            boolean r2 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1Z(r1, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r11 = com.whatsapp.jid.Jid.class
            java.lang.String[] r15 = new java.lang.String[r1]
            java.lang.String r2 = "to"
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r2, r15, r0)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r1
            r16 = r4
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            if (r5 == 0) goto L_0x0098
            java.lang.String[] r7 = new java.lang.String[r1]
            java.lang.String r6 = "id"
            r7[r0] = r6
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r2 = new java.lang.String[r1]
            r2[r0] = r6
            r15 = r2
            r16 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r21 = r7
            r16 = r4
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.String r23 = "error"
            r6[r0] = r23
            java.lang.String r2 = "text"
            r6[r1] = r2
            java.lang.Long r18 = X.C108975cc.A0X()
            r20 = r14
            r21 = r6
            r22 = r0
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r0] = r23
            java.lang.String r3 = "code"
            r6[r1] = r3
            java.lang.Class r17 = java.lang.Long.TYPE
            r21 = r6
            java.lang.Object r3 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r3 = (java.lang.Number) r3
            if (r3 == 0) goto L_0x0098
            long r26 = r3.longValue()
            java.lang.String[] r24 = X.AnonymousClass8BS.A1a(r1, r0)
            r18 = r9
            r20 = r11
            r21 = r12
            r22 = r13
            r25 = r0
            r19 = r4
            java.lang.Object r3 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            if (r3 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r1]
            r6[r0] = r23
            r3 = 10
            X.AhS r1 = new X.AhS
            r1.<init>(r3)
            java.util.ArrayList r1 = X.AnonymousClass8BU.A0u(r4, r9, r1, r6)
            if (r1 == 0) goto L_0x0098
            X.1ca r23 = X.AnonymousClass8BR.A0m(r1, r0)
            if (r23 == 0) goto L_0x0098
            X.9Cu r14 = new X.9Cu
            r21 = r14
            r22 = r5
            r24 = r4
            r25 = r2
            r21.<init>(r22, r23, r24, r25, r26)
            return r14
        L_0x016d:
            java.lang.Object r0 = r2.A01
            java.lang.Object r7 = r2.A02
            X.1ca r7 = (X.C29621ca) r7
            r3 = 0
            boolean r1 = X.C18070vi.A17(r0, r7)
            r0 = 2
            X.AnonymousClass3Ma.A1O(r4, r0, r9)
            java.lang.String r5 = "iq"
            boolean r2 = r9.A09(r4, r5)
            r14 = 0
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1Z(r1, r3)
            java.lang.Class<X.8v4> r17 = X.C173438v4.class
            X.8v4 r20 = X.C173438v4.A00
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r15 = r9
            r22 = r3
            r16 = r4
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            X.8v4 r2 = (X.C173438v4) r2
            if (r2 == 0) goto L_0x0098
            boolean r5 = r9.A09(r4, r5)
            if (r5 == 0) goto L_0x0098
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r6 = "id"
            r8[r3] = r6
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r5 = new java.lang.String[r1]
            r5[r3] = r6
            r12 = r18
            r13 = r19
            r10 = r7
            r15 = r5
            r16 = r3
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r21 = r8
            r22 = r1
            r16 = r4
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r1, r3)
            java.lang.String r20 = "result"
            r22 = r3
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r5 == 0) goto L_0x0098
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r0 = "ta_pad"
            X.AnonymousClass8BR.A1K(r5, r3, r1, r0)
            java.lang.Long r12 = X.C17890vO.A0L()
            r0 = 100000(0x186a0, double:4.94066E-319)
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            java.lang.Class<byte[]> r11 = byte[].class
            r10 = r4
            r15 = r5
            java.lang.Object r3 = r9.A04(r10, r11, r12, r13, r14, r15)
            byte[] r3 = (byte[]) r3
            if (r3 == 0) goto L_0x0098
            r0 = 24
            X.9DM r1 = new X.9DM
            r1.<init>((X.C29621ca) r4, (byte[]) r3, (int) r0)
            X.9DB r0 = new X.9DB
            r0.<init>((X.C29621ca) r4, (X.AnonymousClass9DM) r1)
            X.9DP r14 = new X.9DP
            r14.<init>((X.C173438v4) r2, (X.C29621ca) r4, (X.AnonymousClass9DB) r0)
            return r14
        L_0x020f:
            java.lang.Object r6 = r2.A02
            X.1ca r6 = (X.C29621ca) r6
            r3 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r6, r4, r9, r5)
            java.lang.String r2 = "iq"
            boolean r0 = r9.A09(r4, r2)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r8 = "to"
            r0[r3] = r8
            java.lang.Class<com.whatsapp.jid.UserJid> r11 = com.whatsapp.jid.UserJid.class
            java.lang.Long r12 = X.AnonymousClass8BU.A0i()
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r10 = r4
            r15 = r0
            r16 = r3
            java.lang.Object r1 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r9.A09(r4, r2)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r2 = "id"
            r7[r3] = r2
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r5]
            r0[r3] = r2
            r10 = r6
            r15 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r16 = r4
            r17 = r11
            r21 = r7
            r22 = r5
            r18 = r12
            r19 = r13
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r5, r3)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r2 = new java.lang.String[r5]
            r2[r3] = r8
            r16 = r6
            r20 = r14
            r21 = r2
            r22 = r3
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r19 = r4
            r20 = r17
            r25 = r5
            r21 = r12
            r22 = r13
            java.lang.Object r2 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r5, r3)
            java.lang.String r20 = "result"
            r16 = r4
            r17 = r11
            r22 = r3
            r18 = r12
            r19 = r13
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0098
            r11 = 9
            goto L_0x055b
        L_0x02b2:
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r1 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r10, r4, r9, r3)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "id"
            r2[r1] = r0
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r0, r15, r1)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r1
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r21 = r2
            r22 = r3
            r16 = r4
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r3, r1)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r21 = X.AnonymousClass8BS.A1X(r3, r1)
            r16 = r10
            r20 = r14
            r22 = r1
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r20 = r17
            r21 = r12
            r22 = r13
            r25 = r3
            r19 = r4
            java.lang.Object r0 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r1)
            java.lang.String r20 = "result"
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r1
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0098
            r10 = 8
            goto L_0x008e
        L_0x0337:
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r1 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r10, r4, r9, r3)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "id"
            r2[r1] = r0
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r0, r15, r1)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r1
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r21 = r2
            r22 = r3
            r16 = r4
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r3, r1)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r21 = X.AnonymousClass8BS.A1X(r3, r1)
            r16 = r10
            r20 = r14
            r22 = r1
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r20 = r17
            r21 = r12
            r22 = r13
            r25 = r3
            r19 = r4
            java.lang.Object r0 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r1)
            java.lang.String r20 = "result"
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r1
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0098
            r10 = 7
            goto L_0x008e
        L_0x03bb:
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r0 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r10, r4, r9, r3)
            boolean r1 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r1 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1Z(r3, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r11 = com.whatsapp.jid.Jid.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.String r2 = "to"
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r2, r15, r0)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r3
            r16 = r4
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r6 = "id"
            r7[r0] = r6
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r1 = new java.lang.String[r3]
            r1[r0] = r6
            r15 = r1
            r16 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r21 = r7
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r0] = r2
            java.lang.Class<com.whatsapp.jid.UserJid> r17 = com.whatsapp.jid.UserJid.class
            r20 = r14
            r21 = r6
            r22 = r0
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r0)
            java.lang.String r20 = "result"
            r17 = r11
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0940
            return r14
        L_0x043b:
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r0 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r10, r4, r9, r3)
            boolean r1 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r1 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1Z(r3, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r11 = com.whatsapp.jid.Jid.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.String r2 = "to"
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r2, r15, r0)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r3
            r16 = r4
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r6 = "id"
            r7[r0] = r6
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r1 = new java.lang.String[r3]
            r1[r0] = r6
            r15 = r1
            r16 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r21 = r7
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r0] = r2
            java.lang.Class<com.whatsapp.jid.UserJid> r17 = com.whatsapp.jid.UserJid.class
            r20 = r14
            r21 = r6
            r22 = r0
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r0)
            java.lang.String r20 = "error"
            r17 = r11
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0940
            return r14
        L_0x04bb:
            java.lang.Object r6 = r2.A02
            X.1ca r6 = (X.C29621ca) r6
            r3 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r6, r4, r9, r5)
            java.lang.String r2 = "iq"
            boolean r0 = r9.A09(r4, r2)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r8 = "to"
            r0[r3] = r8
            java.lang.Class<com.whatsapp.jid.UserJid> r11 = com.whatsapp.jid.UserJid.class
            java.lang.Long r12 = X.AnonymousClass8BU.A0i()
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r10 = r4
            r15 = r0
            r16 = r3
            java.lang.Object r1 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r0 = r9.A09(r4, r2)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r2 = "id"
            r7[r3] = r2
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r5]
            r0[r3] = r2
            r10 = r6
            r15 = r0
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r16 = r4
            r17 = r11
            r21 = r7
            r22 = r5
            r18 = r12
            r19 = r13
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r5, r3)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r2 = new java.lang.String[r5]
            r2[r3] = r8
            r16 = r6
            r20 = r14
            r21 = r2
            r22 = r3
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r19 = r4
            r20 = r17
            r25 = r5
            r21 = r12
            r22 = r13
            java.lang.Object r2 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r5, r3)
            java.lang.String r20 = "result"
            r16 = r4
            r17 = r11
            r22 = r3
            r18 = r12
            r19 = r13
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0098
            r11 = 4
        L_0x055b:
            X.9DB r3 = new X.9DB
            r6 = r3
            r7 = r2
            r8 = r4
            r9 = r0
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            X.9DP r14 = new X.9DP
            r14.<init>((com.whatsapp.jid.UserJid) r1, (X.C29621ca) r4, (X.AnonymousClass9DB) r3)
            return r14
        L_0x056b:
            java.lang.Object r0 = r2.A01
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r1 = 0
            boolean r3 = X.AnonymousClass8BX.A1U(r0, r10, r4)
            r5 = 3
            X.C18070vi.A0d(r9, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "id"
            r2[r1] = r0
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r0, r15, r1)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r1
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r21 = r2
            r22 = r3
            r16 = r4
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r3, r1)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r21 = X.AnonymousClass8BS.A1X(r3, r1)
            r16 = r10
            r20 = r14
            r22 = r1
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r20 = r17
            r21 = r12
            r22 = r13
            r25 = r3
            r19 = r4
            java.lang.Object r2 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r1)
            java.lang.String r20 = "result"
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r1
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x094c
            return r14
        L_0x05f3:
            java.lang.Object r0 = r2.A01
            java.lang.Object r10 = r2.A02
            X.1ca r10 = (X.C29621ca) r10
            r1 = 0
            boolean r3 = X.C18070vi.A17(r0, r10)
            r5 = 2
            X.AnonymousClass3Ma.A1O(r4, r5, r9)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r2 = new java.lang.String[r3]
            java.lang.String r0 = "id"
            r2[r1] = r0
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String[] r15 = new java.lang.String[r3]
            java.lang.Long r12 = X.AnonymousClass8BW.A0Z(r0, r15, r1)
            java.lang.Long r13 = X.AnonymousClass8BU.A0j()
            r16 = r1
            java.lang.Object r20 = r9.A05(r10, r11, r12, r13, r14, r15, r16)
            if (r20 == 0) goto L_0x0098
            r15 = r9
            r17 = r11
            r18 = r12
            r19 = r13
            r21 = r2
            r22 = r3
            r16 = r4
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r24 = X.AnonymousClass8BS.A1Z(r3, r1)
            java.lang.Class<com.whatsapp.jid.Jid> r17 = com.whatsapp.jid.Jid.class
            java.lang.String[] r21 = X.AnonymousClass8BS.A1X(r3, r1)
            r16 = r10
            r20 = r14
            r22 = r1
            java.lang.Object r23 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r23 == 0) goto L_0x0098
            r18 = r9
            r20 = r17
            r21 = r12
            r22 = r13
            r25 = r3
            r19 = r4
            java.lang.Object r2 = r18.A05(r19, r20, r21, r22, r23, r24, r25)
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r3, r1)
            java.lang.String r20 = "error"
            r17 = r11
            r18 = r12
            r19 = r13
            r22 = r1
            r16 = r4
            java.lang.Object r1 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x094c
            return r14
        L_0x067b:
            java.lang.Object r0 = r2.A02
            X.1ca r0 = (X.C29621ca) r0
            r22 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r0, r4, r9, r5)
            boolean r1 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r1 == 0) goto L_0x0098
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r2 = "error"
            X.1ca r1 = X.AnonymousClass8BT.A0Z(r4, r2, r3)
            if (r1 == 0) goto L_0x0958
            boolean r2 = r9.A09(r1, r2)
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r5)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "not-authorized"
            r15 = r9
            r16 = r1
            java.lang.Object r3 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r5)
            java.lang.Class r17 = java.lang.Long.TYPE
            r5 = 401(0x191, double:1.98E-321)
            java.lang.Long r20 = java.lang.Long.valueOf(r5)
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0098
            long r19 = r2.longValue()
            r18 = 13
            X.9D6 r2 = new X.9D6
            r15 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19)
            X.9DB r0 = X.A96.A07(r4, r0, r9)
            if (r0 == 0) goto L_0x0098
            X.9EI r14 = new X.9EI
            r14.<init>(r4, r2, r0)
            return r14
        L_0x06e5:
            java.lang.Object r0 = r2.A02
            X.1ca r0 = (X.C29621ca) r0
            r22 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r0, r4, r9, r5)
            boolean r1 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r1 == 0) goto L_0x0098
            java.lang.String[] r3 = new java.lang.String[r5]
            java.lang.String r2 = "error"
            X.1ca r1 = X.AnonymousClass8BT.A0Z(r4, r2, r3)
            if (r1 == 0) goto L_0x0958
            boolean r2 = r9.A09(r1, r2)
            if (r2 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r5)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "not-allowed"
            r15 = r9
            r16 = r1
            java.lang.Object r3 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r5)
            java.lang.Class r17 = java.lang.Long.TYPE
            r5 = 405(0x195, double:2.0E-321)
            java.lang.Long r20 = java.lang.Long.valueOf(r5)
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0098
            long r19 = r2.longValue()
            r18 = 12
            X.9D6 r2 = new X.9D6
            r15 = r2
            r17 = r3
            r15.<init>(r16, r17, r18, r19)
            X.9DB r0 = X.A96.A07(r4, r0, r9)
            if (r0 == 0) goto L_0x0098
            X.9EH r14 = new X.9EH
            r14.<init>(r4, r2, r0)
            return r14
        L_0x074f:
            java.lang.Object r0 = r2.A01
            java.lang.Object r1 = r2.A02
            X.1ca r1 = (X.C29621ca) r1
            r5 = 0
            boolean r6 = X.C18070vi.A17(r0, r1)
            r3 = 2
            X.AnonymousClass3Ma.A1O(r4, r3, r9)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r0 = "error"
            X.1ca r2 = X.AnonymousClass8BT.A0Z(r4, r0, r7)
            if (r2 == 0) goto L_0x0964
            boolean r0 = r9.A09(r2, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r6)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "rate-overlimit"
            r15 = r9
            r22 = r5
            r16 = r2
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r6)
            java.lang.Class r17 = java.lang.Long.TYPE
            r6 = 429(0x1ad, double:2.12E-321)
            java.lang.Long r20 = java.lang.Long.valueOf(r6)
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0098
            long r19 = r5.longValue()
            r18 = 14
            goto L_0x0920
        L_0x07ae:
            java.lang.Object r1 = r2.A02
            X.1ca r1 = (X.C29621ca) r1
            r3 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r1, r4, r9, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "error"
            X.1ca r2 = X.AnonymousClass8BT.A0Z(r4, r0, r6)
            if (r2 == 0) goto L_0x0970
            boolean r0 = r9.A09(r2, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r5)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "locked"
            r15 = r9
            r22 = r3
            r16 = r2
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r5)
            java.lang.Class r17 = java.lang.Long.TYPE
            r5 = 423(0x1a7, double:2.09E-321)
            java.lang.Long r20 = java.lang.Long.valueOf(r5)
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0098
            long r19 = r5.longValue()
            r18 = 11
            goto L_0x08b7
        L_0x0807:
            java.lang.Object r1 = r2.A02
            X.1ca r1 = (X.C29621ca) r1
            r5 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r1, r4, r9, r3)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r0 = "error"
            X.1ca r2 = X.AnonymousClass8BT.A0Z(r4, r0, r7)
            if (r2 == 0) goto L_0x0964
            boolean r0 = r9.A09(r2, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r3)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "item-not-found"
            r15 = r9
            r22 = r5
            r16 = r2
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r3)
            java.lang.Class r17 = java.lang.Long.TYPE
            r6 = 404(0x194, double:1.996E-321)
            java.lang.Long r20 = java.lang.Long.valueOf(r6)
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0098
            long r19 = r5.longValue()
            r18 = 10
            goto L_0x0920
        L_0x0860:
            java.lang.Object r1 = r2.A02
            X.1ca r1 = (X.C29621ca) r1
            r5 = 0
            r3 = 1
            X.AnonymousClass8BX.A1J(r1, r4, r9, r3)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r7 = new java.lang.String[r3]
            java.lang.String r0 = "error"
            X.1ca r2 = X.AnonymousClass8BT.A0Z(r4, r0, r7)
            if (r2 == 0) goto L_0x0964
            boolean r0 = r9.A09(r2, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r3)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "features-disabled"
            r15 = r9
            r22 = r5
            r16 = r2
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r3)
            java.lang.Class r17 = java.lang.Long.TYPE
            r6 = 451(0x1c3, double:2.23E-321)
            java.lang.Long r20 = java.lang.Long.valueOf(r6)
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0098
            long r19 = r5.longValue()
            r18 = 15
        L_0x08b7:
            X.9D6 r5 = new X.9D6
            r15 = r5
            r17 = r0
            r15.<init>(r16, r17, r18, r19)
            X.9DB r0 = X.A96.A07(r4, r1, r9)
            if (r0 == 0) goto L_0x0098
            X.9EG r14 = new X.9EG
            r14.<init>(r4, r5, r0, r3)
            return r14
        L_0x08cb:
            java.lang.Object r1 = r2.A02
            X.1ca r1 = (X.C29621ca) r1
            r3 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r1, r4, r9, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r4, r9)
            r14 = 0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r6 = new java.lang.String[r5]
            java.lang.String r0 = "error"
            X.1ca r2 = X.AnonymousClass8BT.A0Z(r4, r0, r6)
            if (r2 == 0) goto L_0x0970
            boolean r0 = r9.A09(r2, r0)
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1U(r5)
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            java.lang.String r20 = "bad-request"
            r15 = r9
            r22 = r3
            r16 = r2
            java.lang.Object r0 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0098
            java.lang.String[] r21 = X.AnonymousClass8BS.A1S(r5)
            java.lang.Class r17 = java.lang.Long.TYPE
            java.lang.Long r20 = X.AnonymousClass8BV.A0h()
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 == 0) goto L_0x0098
            long r19 = r5.longValue()
            r18 = 8
        L_0x0920:
            X.9D6 r5 = new X.9D6
            r15 = r5
            r17 = r0
            r15.<init>(r16, r17, r18, r19)
            X.9DB r0 = X.A96.A07(r4, r1, r9)
            if (r0 == 0) goto L_0x0098
            X.9EF r14 = new X.9EF
            r14.<init>(r4, r5, r0, r3)
            return r14
        L_0x0934:
            java.lang.Object r0 = r2.A02
            X.1ca r0 = (X.C29621ca) r0
            X.C18070vi.A0o(r0, r4, r9)
            X.9DB r14 = X.C20072A5y.A01(r4, r0, r9)
            return r14
        L_0x0940:
            X.9DJ r14 = new X.9DJ
            r6 = r14
            r7 = r5
            r8 = r2
            r9 = r4
            r10 = r1
            r11 = r0
            r6.<init>((com.whatsapp.jid.Jid) r7, (com.whatsapp.jid.UserJid) r8, (X.C29621ca) r9, (java.lang.String) r10, (java.lang.String) r11)
            return r14
        L_0x094c:
            X.9DB r14 = new X.9DB
            r6 = r14
            r7 = r2
            r8 = r4
            r9 = r0
            r10 = r1
            r11 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            return r14
        L_0x0958:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "required child "
            r1.append(r0)
            r0 = r3[r22]
            goto L_0x097b
        L_0x0964:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.AnonymousClass8BY.A12(r4, r0, r7, r5)
            java.lang.String r0 = r0.toString()
            goto L_0x0989
        L_0x0970:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "required child "
            r1.append(r0)
            r0 = r6[r3]
        L_0x097b:
            r1.append(r0)
            java.lang.String r0 = " missing for tag "
            r1.append(r0)
            java.lang.String r0 = r4.A00
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0989:
            r9.A00 = r0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21289Aha.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
