package X;

/* renamed from: X.Ahb  reason: case insensitive filesystem */
public class C21290Ahb implements C22470B9c {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21290Ahb(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static C21290Ahb A00(Object obj, Object obj2, int i) {
        return new C21290Ahb(obj, obj2, i);
    }

    public static C29621ca A01(C21290Ahb ahb) {
        return (C29621ca) ahb.A02;
    }

    public static Object A02(C29621ca r1, C62672rm r2, Object obj, Object obj2, int i) {
        return new C21290Ahb(obj, obj2, i).BCF(r1, r2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v30, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x05ea, code lost:
        return new X.AnonymousClass9DG(r0, r1, r2, r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0798, code lost:
        return new X.AnonymousClass9DG(r4, r1, r0, r2, r5);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object BCF(X.C29621ca r32, X.C62672rm r33) {
        /*
            r31 = this;
            r2 = r31
            int r0 = r2.A00
            r1 = r32
            r15 = r33
            switch(r0) {
                case 0: goto L_0x0781;
                case 1: goto L_0x0772;
                case 2: goto L_0x0763;
                case 3: goto L_0x0757;
                case 4: goto L_0x0781;
                case 5: goto L_0x0781;
                case 6: goto L_0x0781;
                case 7: goto L_0x0757;
                case 8: goto L_0x0781;
                case 9: goto L_0x0772;
                case 10: goto L_0x0763;
                case 11: goto L_0x0671;
                case 12: goto L_0x0671;
                case 13: goto L_0x05eb;
                case 14: goto L_0x055e;
                case 15: goto L_0x055e;
                case 16: goto L_0x055e;
                case 17: goto L_0x055e;
                case 18: goto L_0x04da;
                case 19: goto L_0x074b;
                case 20: goto L_0x074b;
                case 21: goto L_0x074b;
                case 22: goto L_0x000b;
                case 23: goto L_0x000b;
                case 24: goto L_0x073f;
                case 25: goto L_0x000b;
                case 26: goto L_0x03ce;
                case 27: goto L_0x000b;
                case 28: goto L_0x073f;
                case 29: goto L_0x03ce;
                case 30: goto L_0x000b;
                case 31: goto L_0x0323;
                case 32: goto L_0x0733;
                case 33: goto L_0x02a5;
                case 34: goto L_0x0220;
                case 35: goto L_0x00ed;
                case 36: goto L_0x0220;
                case 37: goto L_0x00ed;
                case 38: goto L_0x0727;
                case 39: goto L_0x071b;
                case 40: goto L_0x070f;
                case 41: goto L_0x0703;
                case 42: goto L_0x070f;
                case 43: goto L_0x06f7;
                case 44: goto L_0x070f;
                case 45: goto L_0x06f7;
                case 46: goto L_0x070f;
                case 47: goto L_0x06f7;
                case 48: goto L_0x06f7;
                case 49: goto L_0x0017;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.A8Z.A00(r1, r0, r15)
        L_0x0016:
            return r3
        L_0x0017:
            java.lang.Object r0 = r2.A01
            java.lang.Object r7 = r2.A02
            X.1ca r7 = (X.C29621ca) r7
            r2 = 0
            boolean r0 = X.C18070vi.A17(r0, r7)
            r6 = 2
            X.C18070vi.A0d(r1, r6)
            r5 = 3
            X.C18070vi.A0d(r15, r5)
            java.lang.String r8 = "iq"
            boolean r4 = r15.A09(r1, r8)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            boolean r4 = r15.A09(r1, r8)
            if (r4 == 0) goto L_0x0016
            java.lang.String[] r9 = new java.lang.String[r0]
            java.lang.String r8 = "id"
            r9[r2] = r8
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.Long r18 = X.AnonymousClass8BW.A0Z(r8, r4, r2)
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r7
            r20 = r3
            r21 = r4
            r22 = r2
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r21 = r9
            r22 = r0
            r16 = r1
            java.lang.Object r4 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0016
            java.lang.String[] r13 = X.AnonymousClass8BS.A1Z(r0, r2)
            java.lang.Class<com.whatsapp.jid.Jid> r22 = com.whatsapp.jid.Jid.class
            java.lang.String[] r26 = X.AnonymousClass8BS.A1X(r0, r2)
            r20 = r15
            r21 = r7
            r23 = r18
            r24 = r19
            r25 = r3
            r27 = r2
            java.lang.Object r12 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            if (r12 == 0) goto L_0x0016
            r7 = r15
            r9 = r22
            r10 = r18
            r11 = r19
            r14 = r0
            r8 = r1
            java.lang.Object r8 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            if (r8 == 0) goto L_0x0016
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r0, r2)
            java.lang.String r20 = "error"
            r22 = r2
            java.lang.Object r9 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0016
            r26 = 24
            X.9DG r7 = new X.9DG
            r21 = r7
            r22 = r8
            r23 = r1
            r24 = r4
            r25 = r9
            r21.<init>((com.whatsapp.jid.Jid) r22, (X.C29621ca) r23, (java.lang.String) r24, (java.lang.String) r25, (int) r26)
            r4 = 7
            X.B9c[] r8 = new X.C22470B9c[r4]
            X.Agt r4 = X.C21246Agt.A00
            r8[r2] = r4
            X.Agu r4 = X.C21247Agu.A00
            r8[r0] = r4
            X.Agv r4 = X.C21248Agv.A00
            r8[r6] = r4
            X.Agw r4 = X.C21249Agw.A00
            r8[r5] = r4
            r5 = 4
            X.Agx r4 = X.C21250Agx.A00
            r8[r5] = r4
            r5 = 5
            X.Agy r4 = X.C21251Agy.A00
            r8[r5] = r4
            r5 = 6
            X.Agz r4 = X.C21252Agz.A00
            java.util.List r5 = X.C18070vi.A0O(r4, r8, r5)
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r2] = r20
            java.lang.String r0 = "IQErrorInternalServerError|IQErrorNotAuthorized|IQErrorItemNotFound|IQErrorRequestTimeout|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorSequencingPending"
            java.lang.Object r0 = r15.A06(r1, r0, r5, r4)
            if (r0 == 0) goto L_0x0016
            X.6Ot r0 = (X.C122306Ot) r0
            X.9DP r3 = new X.9DP
            r3.<init>((X.C29621ca) r1, (X.AnonymousClass9DG) r7, (X.C122306Ot) r0)
            return r3
        L_0x00ed:
            java.lang.Object r5 = r2.A02
            X.1ca r5 = (X.C29621ca) r5
            r0 = 0
            r4 = 1
            X.AnonymousClass8BX.A1J(r5, r1, r15, r4)
            java.lang.String r12 = "iq"
            boolean r2 = r15.A09(r1, r12)
            r3 = 0
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r11 = "fds"
            X.1ca r9 = X.AnonymousClass8BT.A0Z(r1, r11, r2)
            if (r9 != 0) goto L_0x010d
            X.AnonymousClass8BY.A11(r1, r15, r2, r0)
            return r3
        L_0x010d:
            boolean r2 = r15.A09(r9, r11)
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r2 = "states"
            r6[r0] = r2
            r2 = 5
            java.lang.Object r10 = X.C21287AhY.A00(r9, r15, r6, r2)
            X.9DO r10 = (X.AnonymousClass9DO) r10
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r2 = "next_screens"
            r6[r0] = r2
            r2 = 6
            java.lang.Object r8 = X.C21287AhY.A00(r9, r15, r6, r2)
            X.9DO r8 = (X.AnonymousClass9DO) r8
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r2 = "screen_data"
            r6[r0] = r2
            r2 = 7
            java.lang.Object r7 = X.C21287AhY.A00(r9, r15, r6, r2)
            X.9DO r7 = (X.AnonymousClass9DO) r7
            java.lang.String[] r6 = new java.lang.String[r4]
            java.lang.String r2 = "persist_data"
            r6[r0] = r2
            r2 = 9
            java.lang.Object r6 = X.C21287AhY.A00(r9, r15, r6, r2)
            X.9DO r6 = (X.AnonymousClass9DO) r6
            boolean r2 = r15.A09(r9, r11)
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r2 = new java.lang.String[r4]
            java.lang.String r11 = "state"
            r2[r0] = r11
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r9
            r20 = r3
            r21 = r2
            r22 = r0
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String[] r11 = new java.lang.String[r4]
            java.lang.String r13 = "parameters"
            r11[r0] = r13
            java.lang.Long r23 = X.C17890vO.A0L()
            java.lang.Long r24 = X.AnonymousClass8BV.A0l()
            r20 = r15
            r21 = r9
            r22 = r17
            r25 = r3
            r26 = r11
            r27 = r0
            java.lang.Object r11 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r11 = (java.lang.String) r11
            r14 = 4
            X.9Ci r13 = new X.9Ci
            r13.<init>(r9, r2, r11, r14)
            X.9DE r11 = new X.9DE
            r22 = r13
            r23 = r10
            r24 = r8
            r25 = r7
            r26 = r6
            r20 = r11
            r20.<init>((X.C29621ca) r21, (X.C178239Ci) r22, (X.AnonymousClass9DO) r23, (X.AnonymousClass9DO) r24, (X.AnonymousClass9DO) r25, (X.AnonymousClass9DO) r26)
            boolean r2 = r15.A09(r1, r12)
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.String r6 = "id"
            r7[r0] = r6
            java.lang.String[] r2 = new java.lang.String[r4]
            r2[r0] = r6
            r16 = r5
            r20 = r3
            r21 = r2
            r22 = r0
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r21 = r7
            r22 = r4
            r16 = r1
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r29 = X.AnonymousClass8BS.A1Z(r4, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r22 = com.whatsapp.jid.Jid.class
            java.lang.String[] r26 = X.AnonymousClass8BS.A1X(r4, r0)
            r20 = r15
            r21 = r5
            r23 = r18
            r24 = r19
            r25 = r3
            java.lang.Object r28 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            if (r28 == 0) goto L_0x0016
            r23 = r15
            r25 = r22
            r26 = r18
            r27 = r19
            r30 = r4
            r24 = r1
            java.lang.Object r5 = r23.A05(r24, r25, r26, r27, r28, r29, r30)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            if (r5 == 0) goto L_0x0016
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r4, r0)
            java.lang.String r20 = "result"
            r22 = r0
            java.lang.Object r4 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0016
            r17 = 18
            X.9DG r0 = new X.9DG
            r12 = r0
            r13 = r5
            r14 = r1
            r15 = r2
            r16 = r4
            r12.<init>((com.whatsapp.jid.Jid) r13, (X.C29621ca) r14, (java.lang.String) r15, (java.lang.String) r16, (int) r17)
            X.9DP r3 = new X.9DP
            r3.<init>((X.C29621ca) r1, (X.AnonymousClass9DE) r11, (X.AnonymousClass9DG) r0)
            return r3
        L_0x0220:
            java.lang.Object r6 = r2.A02
            X.1ca r6 = (X.C29621ca) r6
            r4 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r6, r1, r15, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r1, r15)
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r2 = "id"
            r7[r4] = r2
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Long r18 = X.AnonymousClass8BW.A0Z(r2, r0, r4)
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r6
            r20 = r3
            r21 = r0
            r22 = r4
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r21 = r7
            r22 = r5
            r16 = r1
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r26 = X.AnonymousClass8BS.A1Z(r5, r4)
            java.lang.Class<com.whatsapp.jid.Jid> r9 = com.whatsapp.jid.Jid.class
            java.lang.String[] r13 = X.AnonymousClass8BS.A1X(r5, r4)
            r7 = r15
            r8 = r6
            r10 = r18
            r11 = r19
            r12 = r3
            r14 = r4
            java.lang.Object r25 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r25 == 0) goto L_0x0016
            r20 = r15
            r22 = r9
            r23 = r10
            r24 = r11
            r27 = r5
            r21 = r1
            java.lang.Object r0 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r11 = X.AnonymousClass8BS.A1a(r5, r4)
            java.lang.String r10 = "error"
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r4
            r6 = r1
            java.lang.Object r4 = r5.A05(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0016
            r10 = 17
            goto L_0x05e0
        L_0x02a5:
            java.lang.Object r8 = r2.A02
            X.1ca r8 = (X.C29621ca) r8
            r4 = 0
            r6 = 1
            X.AnonymousClass8BX.A1J(r8, r1, r15, r6)
            boolean r0 = X.AnonymousClass8BR.A1Q(r1, r15)
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r21 = X.AnonymousClass8BS.A1Z(r6, r4)
            java.lang.Class<com.whatsapp.jid.Jid> r9 = com.whatsapp.jid.Jid.class
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r0 = "to"
            java.lang.Long r10 = X.AnonymousClass8BW.A0Z(r0, r2, r4)
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            r7 = r15
            r12 = r3
            r13 = r2
            r14 = r4
            java.lang.Object r20 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L_0x0016
            r17 = r9
            r18 = r10
            r19 = r11
            r22 = r6
            r16 = r1
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            if (r5 == 0) goto L_0x0016
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r2 = "id"
            r7[r4] = r2
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r6]
            r0[r4] = r2
            r16 = r8
            r20 = r3
            r21 = r0
            r22 = r4
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r21 = r7
            r22 = r6
            r16 = r1
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r13 = X.AnonymousClass8BS.A1a(r6, r4)
            java.lang.String r12 = "result"
            r7 = r15
            r9 = r17
            r8 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0016
            X.9DG r3 = new X.9DG
            r3.<init>((com.whatsapp.jid.Jid) r5, (X.C29621ca) r1, (java.lang.String) r2, (java.lang.String) r0)
            return r3
        L_0x0323:
            java.lang.Object r7 = r2.A02
            X.1ca r7 = (X.C29621ca) r7
            r0 = 0
            r2 = 1
            X.AnonymousClass8BX.A1J(r7, r1, r15, r2)
            java.lang.String r5 = "iq"
            boolean r4 = r15.A09(r1, r5)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.String r9 = "to"
            r4[r0] = r9
            java.lang.Class<com.whatsapp.jid.UserJid> r17 = com.whatsapp.jid.UserJid.class
            java.lang.Long r18 = X.AnonymousClass8BU.A0i()
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r1
            r20 = r3
            r21 = r4
            r22 = r0
            java.lang.Object r4 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            boolean r5 = r15.A09(r1, r5)
            if (r5 == 0) goto L_0x0016
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.String r6 = "id"
            r8[r0] = r6
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r5 = new java.lang.String[r2]
            r5[r0] = r6
            r16 = r7
            r21 = r5
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r16 = r1
            r21 = r8
            r22 = r2
            java.lang.Object r5 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0016
            java.lang.String[] r12 = X.AnonymousClass8BS.A1Z(r2, r0)
            java.lang.Class<com.whatsapp.jid.Jid> r22 = com.whatsapp.jid.Jid.class
            java.lang.String[] r6 = new java.lang.String[r2]
            r6[r0] = r9
            r20 = r15
            r21 = r7
            r23 = r18
            r24 = r19
            r25 = r3
            r26 = r6
            r27 = r0
            java.lang.Object r11 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            if (r11 == 0) goto L_0x0016
            r6 = r15
            r7 = r1
            r8 = r22
            r13 = r2
            r9 = r18
            r10 = r19
            java.lang.Object r6 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6
            if (r6 == 0) goto L_0x0016
            java.lang.String[] r21 = X.AnonymousClass8BS.A1a(r2, r0)
            java.lang.String r20 = "result"
            r22 = r0
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0016
            r12 = 13
            X.9DG r0 = new X.9DG
            r7 = r0
            r8 = r6
            r9 = r1
            r10 = r5
            r11 = r2
            r7.<init>((com.whatsapp.jid.Jid) r8, (X.C29621ca) r9, (java.lang.String) r10, (java.lang.String) r11, (int) r12)
            X.9DP r3 = new X.9DP
            r3.<init>((com.whatsapp.jid.UserJid) r4, (X.C29621ca) r1, (X.AnonymousClass9DG) r0)
            return r3
        L_0x03ce:
            java.lang.Object r0 = r2.A01
            java.lang.Object r8 = r2.A02
            X.1ca r8 = (X.C29621ca) r8
            r14 = 0
            boolean r0 = X.C18070vi.A17(r0, r8)
            r7 = 2
            X.AnonymousClass3Ma.A1O(r1, r7, r15)
            java.lang.String r6 = "account"
            boolean r2 = r15.A09(r1, r6)
            r3 = 0
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r4 = "action"
            r5[r14] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String[] r2 = new java.lang.String[r7]
            r2[r14] = r6
            java.lang.Long r10 = X.AnonymousClass8BW.A0Z(r4, r2, r0)
            java.lang.Long r11 = X.AnonymousClass8BU.A0j()
            r7 = r15
            r12 = r3
            r13 = r2
            java.lang.Object r20 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r20 == 0) goto L_0x0016
            r17 = r9
            r18 = r10
            r19 = r11
            r21 = r5
            r22 = r0
            r16 = r1
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r2 = "version"
            r4[r14] = r2
            java.lang.Class r17 = java.lang.Long.TYPE
            java.lang.Long r18 = X.C17890vO.A0L()
            r20 = r3
            r21 = r4
            r22 = r14
            r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String[] r6 = new java.lang.String[r0]
            java.lang.String r2 = "instance-id"
            r6[r14] = r2
            r4 = 18
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            r8 = r1
            r11 = r10
            r13 = r6
            r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r2 = "wa-support-phone-number"
            r4[r14] = r2
            java.lang.Long r10 = X.C108975cc.A0X()
            java.lang.Long r11 = X.AnonymousClass8BV.A0c()
            r13 = r4
            r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r2 = "card"
            r5[r14] = r2
            r4 = 11
            X.AhR r2 = new X.AhR
            r2.<init>(r4)
            r10 = 0
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r15
            r7 = r1
            r8 = r2
            r9 = r5
            java.util.ArrayList r6 = r6.A08(r7, r8, r9, r10, r12)
            if (r6 == 0) goto L_0x0016
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r2 = "bank"
            r5[r14] = r2
            r4 = 12
            X.AhR r2 = new X.AhR
            r2.<init>(r4)
            r17 = r2
            r18 = r5
            r19 = r10
            r21 = r12
            java.util.ArrayList r7 = r15.A08(r16, r17, r18, r19, r21)
            if (r7 == 0) goto L_0x0016
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r2 = "merchant"
            r5[r14] = r2
            r4 = 13
            X.AhR r2 = new X.AhR
            r2.<init>(r4)
            r17 = r2
            r18 = r5
            java.util.ArrayList r8 = r15.A08(r16, r17, r18, r19, r21)
            if (r8 == 0) goto L_0x0016
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r2 = "alias"
            r5[r14] = r2
            r4 = 14
            X.AhR r2 = new X.AhR
            r2.<init>(r4)
            r21 = 100
            r17 = r2
            r18 = r5
            java.util.ArrayList r9 = r15.A08(r16, r17, r18, r19, r21)
            if (r9 == 0) goto L_0x0016
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = "custom_payment_method"
            r4[r14] = r0
            r2 = 15
            X.AhR r0 = new X.AhR
            r0.<init>(r2)
            r18 = 5
            r12 = r15
            r13 = r1
            r14 = r0
            r15 = r4
            r16 = r10
            java.util.ArrayList r10 = r12.A08(r13, r14, r15, r16, r18)
            if (r10 == 0) goto L_0x0016
            X.9Cx r3 = new X.9Cx
            r4 = r3
            r5 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r3
        L_0x04da:
            java.lang.Object r6 = r2.A02
            X.1ca r6 = (X.C29621ca) r6
            r4 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r6, r1, r15, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r1, r15)
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r2 = "id"
            r7[r4] = r2
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Long r18 = X.AnonymousClass8BW.A0Z(r2, r0, r4)
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r6
            r20 = r3
            r21 = r0
            r22 = r4
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r21 = r7
            r22 = r5
            r16 = r1
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r26 = X.AnonymousClass8BS.A1Z(r5, r4)
            java.lang.Class<com.whatsapp.jid.Jid> r9 = com.whatsapp.jid.Jid.class
            java.lang.String[] r13 = X.AnonymousClass8BS.A1X(r5, r4)
            r7 = r15
            r8 = r6
            r10 = r18
            r11 = r19
            r12 = r3
            r14 = r4
            java.lang.Object r25 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r25 == 0) goto L_0x0016
            r20 = r15
            r21 = r1
            r22 = r9
            r23 = r10
            r24 = r11
            r27 = r5
            java.lang.Object r0 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r11 = X.AnonymousClass8BS.A1a(r5, r4)
            java.lang.String r10 = "error"
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r4
            r6 = r1
            java.lang.Object r4 = r5.A05(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0016
            r10 = 7
            goto L_0x05e0
        L_0x055e:
            java.lang.Object r6 = r2.A02
            X.1ca r6 = (X.C29621ca) r6
            r4 = 0
            r5 = 1
            X.AnonymousClass8BX.A1J(r6, r1, r15, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r1, r15)
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r7 = new java.lang.String[r5]
            java.lang.String r2 = "id"
            r7[r4] = r2
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Long r18 = X.AnonymousClass8BW.A0Z(r2, r0, r4)
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r6
            r20 = r3
            r21 = r0
            r22 = r4
            java.lang.Object r20 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r20 == 0) goto L_0x0016
            r21 = r7
            r22 = r5
            r16 = r1
            java.lang.Object r2 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x0016
            java.lang.String[] r26 = X.AnonymousClass8BS.A1Z(r5, r4)
            java.lang.Class<com.whatsapp.jid.Jid> r9 = com.whatsapp.jid.Jid.class
            java.lang.String[] r13 = X.AnonymousClass8BS.A1X(r5, r4)
            r7 = r15
            r8 = r6
            r10 = r18
            r11 = r19
            r12 = r3
            r14 = r4
            java.lang.Object r25 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r25 == 0) goto L_0x0016
            r20 = r15
            r21 = r1
            r22 = r9
            r23 = r10
            r24 = r11
            r27 = r5
            java.lang.Object r0 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r11 = X.AnonymousClass8BS.A1a(r5, r4)
            java.lang.String r10 = "error"
            r5 = r15
            r7 = r17
            r8 = r18
            r9 = r19
            r12 = r4
            r6 = r1
            java.lang.Object r4 = r5.A05(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0016
            r10 = 5
        L_0x05e0:
            X.9DG r3 = new X.9DG
            r5 = r3
            r6 = r0
            r7 = r1
            r8 = r2
            r9 = r4
            r5.<init>((com.whatsapp.jid.Jid) r6, (X.C29621ca) r7, (java.lang.String) r8, (java.lang.String) r9, (int) r10)
            return r3
        L_0x05eb:
            java.lang.Object r0 = r2.A01
            java.lang.Object r4 = r2.A02
            X.1ca r4 = (X.C29621ca) r4
            r2 = 0
            boolean r6 = X.AnonymousClass8BX.A1U(r0, r4, r1)
            r5 = 3
            X.C18070vi.A0d(r15, r5)
            boolean r0 = X.AnonymousClass8BR.A1Q(r1, r15)
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r7 = "id"
            r8[r2] = r7
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Long r18 = X.AnonymousClass8BW.A0Z(r7, r0, r2)
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r16 = r4
            r20 = r3
            r21 = r0
            r22 = r2
            java.lang.Object r12 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r12 == 0) goto L_0x0016
            r7 = r15
            r9 = r17
            r10 = r18
            r11 = r19
            r13 = r8
            r14 = r6
            r8 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r26 = X.AnonymousClass8BS.A1Z(r6, r2)
            java.lang.Class<com.whatsapp.jid.Jid> r9 = com.whatsapp.jid.Jid.class
            java.lang.String[] r13 = X.AnonymousClass8BS.A1X(r6, r2)
            r8 = r4
            r12 = r3
            r14 = r2
            java.lang.Object r25 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r25 == 0) goto L_0x0016
            r20 = r15
            r21 = r1
            r22 = r9
            r23 = r10
            r24 = r11
            r27 = r6
            java.lang.Object r4 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            if (r4 == 0) goto L_0x0016
            java.lang.String[] r12 = X.AnonymousClass8BS.A1a(r6, r2)
            java.lang.String r11 = "result"
            r6 = r15
            r8 = r17
            r9 = r10
            r10 = r19
            r13 = r2
            r7 = r1
            java.lang.Object r2 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x078d
            return r3
        L_0x0671:
            java.lang.Object r0 = r2.A01
            java.lang.Object r4 = r2.A02
            X.1ca r4 = (X.C29621ca) r4
            r2 = 0
            boolean r6 = X.C18070vi.A17(r0, r4)
            r5 = 2
            X.AnonymousClass3Ma.A1O(r1, r5, r15)
            boolean r0 = X.AnonymousClass8BR.A1Q(r1, r15)
            r3 = 0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r8 = new java.lang.String[r6]
            java.lang.String r7 = "id"
            r8[r2] = r7
            java.lang.Class<java.lang.String> r17 = java.lang.String.class
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Long r18 = X.AnonymousClass8BW.A0Z(r7, r0, r2)
            java.lang.Long r19 = X.AnonymousClass8BU.A0j()
            r20 = r3
            r21 = r0
            r22 = r2
            r16 = r4
            java.lang.Object r12 = r15.A05(r16, r17, r18, r19, r20, r21, r22)
            if (r12 == 0) goto L_0x0016
            r7 = r15
            r9 = r17
            r10 = r18
            r11 = r19
            r13 = r8
            r14 = r6
            r8 = r1
            java.lang.Object r0 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0016
            java.lang.String[] r26 = X.AnonymousClass8BS.A1Z(r6, r2)
            java.lang.Class<com.whatsapp.jid.Jid> r9 = com.whatsapp.jid.Jid.class
            java.lang.String[] r13 = X.AnonymousClass8BS.A1X(r6, r2)
            r8 = r4
            r12 = r3
            r14 = r2
            java.lang.Object r25 = r7.A05(r8, r9, r10, r11, r12, r13, r14)
            if (r25 == 0) goto L_0x0016
            r20 = r15
            r21 = r1
            r22 = r9
            r23 = r10
            r24 = r11
            r27 = r6
            java.lang.Object r4 = r20.A05(r21, r22, r23, r24, r25, r26, r27)
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            if (r4 == 0) goto L_0x0016
            java.lang.String[] r12 = X.AnonymousClass8BS.A1a(r6, r2)
            java.lang.String r11 = "error"
            r6 = r15
            r8 = r17
            r9 = r10
            r10 = r19
            r13 = r2
            r7 = r1
            java.lang.Object r2 = r6.A05(r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x078d
            return r3
        L_0x06f7:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.A97.A05(r1, r0, r15)
            return r3
        L_0x0703:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DP r3 = X.A97.A00(r1, r0, r15)
            return r3
        L_0x070f:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.A97.A04(r1, r0, r15)
            return r3
        L_0x071b:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.A8H.A01(r1, r0, r15)
            return r3
        L_0x0727:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.A8H.A00(r1, r0, r15)
            return r3
        L_0x0733:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.A5x.A00(r1, r0, r15)
            return r3
        L_0x073f:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9Cu r3 = X.A8Z.A02(r1, r0, r15)
            return r3
        L_0x074b:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.C20020A3m.A00(r1, r0, r15)
            return r3
        L_0x0757:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.C20071A5w.A00(r1, r0, r15)
            return r3
        L_0x0763:
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            X.1ca r2 = (X.C29621ca) r2
            r0 = 0
            X.AnonymousClass8BX.A1J(r3, r1, r15, r0)
            X.9DG r3 = X.C20071A5w.A01(r1, r2, r15)
            return r3
        L_0x0772:
            java.lang.Object r3 = r2.A01
            java.lang.Object r2 = r2.A02
            X.1ca r2 = (X.C29621ca) r2
            r0 = 0
            X.AnonymousClass8BX.A1J(r3, r1, r15, r0)
            X.9DG r3 = X.C20071A5w.A00(r1, r2, r15)
            return r3
        L_0x0781:
            X.1ca r0 = A01(r2)
            X.C18070vi.A0o(r0, r1, r15)
            X.9DG r3 = X.C20071A5w.A01(r1, r0, r15)
            return r3
        L_0x078d:
            X.9DG r3 = new X.9DG
            r6 = r3
            r7 = r4
            r8 = r1
            r9 = r0
            r10 = r2
            r11 = r5
            r6.<init>((com.whatsapp.jid.Jid) r7, (X.C29621ca) r8, (java.lang.String) r9, (java.lang.String) r10, (int) r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21290Ahb.BCF(X.1ca, X.2rm):java.lang.Object");
    }
}
