package X;

/* renamed from: X.1fr  reason: invalid class name and case insensitive filesystem */
public final class C31621fr {
    public final AnonymousClass11S A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass1NG A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final C31441fZ A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;

    public C31621fr(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass11P r4, AnonymousClass1NG r5, C18030ve r6, AnonymousClass18K r7, C31441fZ r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r3, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r8, 6);
        C18070vi.A0d(r5, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r2;
        this.A00 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A03 = r5;
        this.A07 = r9;
        this.A08 = r10;
    }

    public static final void A00(AnonymousClass190 r6, C63362sw r7, C29621ca r8) {
        int i;
        if (!C22971Dz.A0V(r7.A0Z)) {
            String A0Q = r8.A0Q("mediatype", (String) null);
            C194059r6 A002 = AnonymousClass9RW.A00(r8);
            if (A002.A01 != null || "livelocation".equals(A0Q)) {
                if (A002.A00 == 2) {
                    r7.A09 = A002;
                } else {
                    r7.A08 = A002;
                }
                int A0A = r8.A0A("count", 0);
                if (r7.A0H == null || r7.A02() == A0A) {
                    r7.A0H = Integer.valueOf(A0A);
                    String A0Q2 = r8.A0Q("mediareason", (String) null);
                    if (A0Q2 != null) {
                        if (A0Q2.equals("retry")) {
                            Boolean bool = r7.A0F;
                            if (bool == null || bool.booleanValue()) {
                                r7.A0F = true;
                            } else {
                                throw new AnonymousClass1UI("mediareason retry may not mismatch between two enc nodes in the same message");
                            }
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown mediareason ");
                            sb.append(A0Q2);
                            throw new AnonymousClass1UI(sb.toString());
                        }
                    }
                    if ("hide".equals(r8.A0Q("decrypt-fail", (String) null)) || "peer".equals(r7.A0N) || (i = r7.A01) == 7 || i == 8) {
                        r7.A00 = 1;
                    } else {
                        r7.A00 = 0;
                    }
                } else {
                    throw new AnonymousClass1UI("retry count may not mismatch between two enc nodes in the same message");
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(A002.A00);
                sb2.append(':');
                sb2.append(2);
                r6.A0G("missing-ciphertext", sb2.toString(), true);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("missing ciphertext ");
                sb3.append(2);
                throw new AnonymousClass1UI(sb3.toString());
            }
        } else {
            throw new AnonymousClass1UI("Received enc message for newsletters");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01b7, code lost:
        if (r1.A0O(r0) != false) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x03c3 A[LOOP:7: B:135:0x03bd->B:137:0x03c3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x013e A[LOOP:0: B:19:0x0138->B:21:0x013e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0269  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair A01(X.C29621ca r45, X.C31631fs r46, long r47, long r49) {
        /*
            r44 = this;
            r30 = 0
            r29 = 1
            r15 = r46
            r0 = r29
            X.C18070vi.A0d(r15, r0)
            java.lang.String r0 = "id"
            r10 = r45
            java.lang.String r43 = r10.A0P(r0)
            java.lang.String r0 = "t"
            r1 = 0
            java.lang.String r14 = r10.A0Q(r0, r1)
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r13 = r10.A0G(r2, r0)
            java.lang.String r0 = "notify"
            java.lang.String r28 = r10.A0Q(r0, r1)
            java.lang.String r0 = "display_name"
            java.lang.String r27 = r10.A0Q(r0, r1)
            java.lang.String r0 = "category"
            java.lang.String r26 = r10.A0Q(r0, r1)
            java.lang.String r0 = "is_sender"
            java.lang.String r1 = r10.A0Q(r0, r1)
            java.lang.String r0 = "true"
            boolean r25 = r0.equals(r1)
            java.lang.String r24 = "type"
            r12 = 0
            r0 = r24
            java.lang.String r23 = r10.A0Q(r0, r12)
            java.lang.String r22 = "count"
            r1 = r22
            r0 = r30
            int r21 = r10.A0A(r1, r0)
            boolean r20 = X.C22971Dz.A0O(r13)
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r9 = r10.A0F(r2, r0)
            if (r20 == 0) goto L_0x006b
            X.C17960vV.A07(r9)
            X.C18070vi.A0X(r9)
            r0 = r9
            r9 = r13
            r13 = r0
        L_0x006b:
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "recipient"
            com.whatsapp.jid.Jid r11 = r10.A0F(r1, r0)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            java.lang.Class<com.whatsapp.jid.PhoneUserJid> r2 = com.whatsapp.jid.PhoneUserJid.class
            java.lang.String r0 = "peer_recipient_pn"
            com.whatsapp.jid.Jid r8 = r10.A0F(r2, r0)
            com.whatsapp.jid.PhoneUserJid r8 = (com.whatsapp.jid.PhoneUserJid) r8
            java.lang.Class<X.1E2> r1 = X.AnonymousClass1E2.class
            java.lang.String r0 = "peer_recipient_lid"
            com.whatsapp.jid.Jid r7 = r10.A0F(r1, r0)
            X.1E2 r7 = (X.AnonymousClass1E2) r7
            java.lang.String r0 = "sender_pn"
            com.whatsapp.jid.Jid r6 = r10.A0F(r2, r0)
            com.whatsapp.jid.PhoneUserJid r6 = (com.whatsapp.jid.PhoneUserJid) r6
            java.lang.String r0 = "sender_lid"
            com.whatsapp.jid.Jid r5 = r10.A0F(r1, r0)
            X.1E2 r5 = (X.AnonymousClass1E2) r5
            java.lang.String r0 = "participant_pn"
            com.whatsapp.jid.Jid r4 = r10.A0F(r2, r0)
            com.whatsapp.jid.PhoneUserJid r4 = (com.whatsapp.jid.PhoneUserJid) r4
            java.lang.String r0 = "participant_lid"
            com.whatsapp.jid.Jid r3 = r10.A0F(r1, r0)
            X.1E2 r3 = (X.AnonymousClass1E2) r3
            java.lang.String r0 = "meta"
            X.1ca r1 = r10.A0K(r0)
            if (r1 == 0) goto L_0x00b9
            java.lang.String r0 = "origin"
            java.lang.String r12 = r1.A0Q(r0, r12)
        L_0x00b9:
            r2 = r44
            X.11P r0 = r2.A02
            long r0 = X.AnonymousClass11P.A01(r0)
            r18 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r18
            long r16 = X.C20099A7c.A04(r14, r0)
            long r16 = r16 * r18
            boolean r0 = r13 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r13 instanceof X.C29671cg
            if (r0 == 0) goto L_0x01bd
        L_0x00d3:
            boolean r0 = r9 instanceof com.whatsapp.jid.DeviceJid
            if (r0 == 0) goto L_0x01aa
            X.11S r1 = r2.A00
            r0 = r9
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.userJid
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x01aa
        L_0x00e4:
            r1 = 1
        L_0x00e5:
            r0 = 0
            java.lang.Long r42 = java.lang.Long.valueOf(r16)
            if (r1 == 0) goto L_0x0148
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r29)
            r40 = r0
            r31 = r0
            r32 = r9
            r33 = r13
            r34 = r3
            r35 = r7
            r36 = r5
            r37 = r4
            r38 = r8
            r39 = r6
            X.2sw r7 = X.C50342Ub.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            r0 = r21
            r7.A03 = r0
        L_0x010c:
            java.lang.Long r0 = java.lang.Long.valueOf(r47)
            r7.A0L = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r49)
            r7.A0K = r0
            r0 = r23
            r7.A0R = r0
            r0 = r20
            r7.A0S = r0
            r0 = r28
            r7.A0Q = r0
            r0 = r27
            r7.A0P = r0
            r0 = r26
            r7.A0N = r0
            X.00H r11 = r2.A07
            java.lang.Object r0 = r11.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0138:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r0 = r1.next()
            X.3M6 r0 = (X.AnonymousClass3M6) r0
            r0.CB9(r7, r10)
            goto L_0x0138
        L_0x0148:
            boolean r1 = X.C22971Dz.A0V(r13)
            if (r1 == 0) goto L_0x016b
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r25)
        L_0x0152:
            r31 = r0
            r32 = r9
            r33 = r13
            r34 = r3
            r35 = r7
            r36 = r5
            r37 = r4
            r38 = r8
            r39 = r6
            r40 = r11
            X.2sw r7 = X.C50342Ub.A00(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x010c
        L_0x016b:
            X.2Qs r1 = X.C49502Qs.CTWA
            java.lang.String r14 = r1.origin
            r1 = r29
            boolean r1 = X.AnonymousClass1YE.A09(r14, r12, r1)
            if (r1 != 0) goto L_0x019c
            X.1NG r1 = r2.A03
            if (r11 == 0) goto L_0x01a1
            X.1BI r0 = r1.A02(r11, r7, r8)
        L_0x017f:
            X.0ve r14 = r2.A04
            r12 = 11660(0x2d8c, float:1.6339E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r14, r12)
            if (r1 == 0) goto L_0x019c
            boolean r1 = X.C22971Dz.A0M(r0)
            if (r1 == 0) goto L_0x019c
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r0, r1)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            com.whatsapp.jid.UserJid r0 = X.C22971Dz.A03(r0)
        L_0x019c:
            java.lang.Boolean r41 = java.lang.Boolean.valueOf(r30)
            goto L_0x0152
        L_0x01a1:
            X.1BI r0 = X.C22971Dz.A00(r13)
            X.1BI r0 = r1.A02(r0, r5, r6)
            goto L_0x017f
        L_0x01aa:
            X.11S r1 = r2.A00
            boolean r0 = r9 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x01bb
            r0 = r9
            X.1BI r0 = (X.AnonymousClass1BI) r0
        L_0x01b3:
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x01bd
            goto L_0x00e4
        L_0x01bb:
            r0 = 0
            goto L_0x01b3
        L_0x01bd:
            r1 = 0
            goto L_0x00e5
        L_0x01c0:
            r6 = 0
            com.whatsapp.jid.Jid r5 = r7.A0Y
            r25 = r5
            if (r5 == 0) goto L_0x01fa
            boolean r0 = r5 instanceof X.C47712Jo
            if (r0 == 0) goto L_0x01fa
        L_0x01cb:
            com.whatsapp.jid.Jid r4 = r7.A04()
            com.whatsapp.jid.UserJid r1 = r7.A05()
            int r0 = r7.A01
            X.9sb r3 = new X.9sb
            r3.<init>(r5, r4, r1, r0)
            java.lang.Object r0 = r11.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x01e4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r0 = r1.next()
            X.3M6 r0 = (X.AnonymousClass3M6) r0
            X.B5K r0 = r0.CBD(r3, r10)
            if (r0 == 0) goto L_0x01e4
            r7.A08(r0)
            goto L_0x01e4
        L_0x01fa:
            com.whatsapp.jid.Jid r5 = r7.A0Z
            goto L_0x01cb
        L_0x01fd:
            java.lang.Object r0 = r11.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r5 = r0.iterator()
        L_0x0207:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0223
            java.lang.Object r0 = r5.next()
            X.3M6 r0 = (X.AnonymousClass3M6) r0
            long r3 = r0.CBC(r10)
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0207
            long r0 = r7.A05
            long r3 = r3 | r0
            r7.A05 = r3
            goto L_0x0207
        L_0x0223:
            java.lang.Class<X.34x> r1 = X.C688434x.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.util.HashMap r5 = r7.A0i
            java.lang.Object r0 = r5.get(r0)
            X.B5K r0 = (X.B5K) r0
            if (r0 == 0) goto L_0x0236
            r7.A0Q = r6
        L_0x0236:
            X.1ca[] r4 = r10.A02
            if (r4 != 0) goto L_0x023e
            r0 = r30
            X.1ca[] r4 = new X.C29621ca[r0]
        L_0x023e:
            java.lang.String r1 = "Failed requirement."
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x024c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x025f
            java.lang.Object r0 = r3.next()
            X.3LF r0 = (X.AnonymousClass3LF) r0
            boolean r0 = r0.CRi(r7, r10)
            if (r0 != 0) goto L_0x024c
            return r6
        L_0x025f:
            java.lang.String r8 = "pay"
            r0 = r23
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0354
            int r9 = r4.length
            r3 = 0
            r10 = 0
            r14 = 0
            r12 = 0
            r13 = 0
        L_0x026f:
            if (r3 >= r9) goto L_0x0397
            r2 = r4[r3]
            java.lang.String r0 = "enc"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x02a5
            r1 = r22
            r0 = r30
            int r0 = r2.A0A(r1, r0)
            if (r10 != 0) goto L_0x029c
            if (r0 <= 0) goto L_0x029c
            X.1QS r0 = r15.A02
            X.AnonymousClass1QS.A00(r0)
            X.1QR r12 = r0.A04
            java.lang.String r10 = r7.A0h
            r0 = -1
            X.AW0 r0 = r12.A0N(r10, r6, r0)
            if (r0 == 0) goto L_0x034c
            r7.A08(r0)
            r10 = 1
        L_0x029c:
            X.190 r0 = r15.A00
            A00(r0, r7, r2)
            r12 = 1
        L_0x02a2:
            int r3 = r3 + 1
            goto L_0x026f
        L_0x02a5:
            if (r14 != 0) goto L_0x0333
            boolean r0 = X.C29621ca.A07(r2, r8)
            if (r0 == 0) goto L_0x0333
            java.lang.String r1 = "country"
            java.lang.String r0 = "IN"
            java.lang.String r10 = r2.A0Q(r1, r0)
            java.lang.String r0 = "version"
            java.lang.String r1 = r2.A0Q(r0, r6)
            r0 = r29
            int r0 = X.C20099A7c.A01(r1, r0)
            boolean r0 = X.C20128A8n.A09(r10, r0)
            if (r0 != 0) goto L_0x02d3
            long r0 = r7.A0X
            X.AW0 r0 = X.C30951em.A00(r2, r0)
        L_0x02ce:
            r7.A08(r0)
        L_0x02d1:
            r10 = 1
            goto L_0x02a2
        L_0x02d3:
            r0 = r24
            java.lang.String r1 = r2.A0Q(r0, r6)
            java.lang.String r0 = "request"
            boolean r0 = r0.equals(r1)
            X.1em r10 = r15.A03
            if (r0 == 0) goto L_0x0319
            java.lang.Class<X.AW0> r0 = X.AW0.class
            X.B5K r1 = r7.A06(r0)
            X.AW0 r1 = (X.AW0) r1
            if (r1 == 0) goto L_0x02fa
            java.lang.String r0 = "request-id"
            java.lang.String r0 = r2.A0Q(r0, r6)
            X.C17960vV.A07(r0)
            r1.A0C(r0)
            goto L_0x02d1
        L_0x02fa:
            X.1BI r1 = r7.A03()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r17 = X.C22941Dw.A01(r1)
            X.1BI r0 = X.C22971Dz.A00(r25)
            com.whatsapp.jid.UserJid r18 = X.C22941Dw.A01(r0)
            long r0 = r7.A0X
            r16 = r10
            r19 = r2
            r20 = r0
            X.AW0 r0 = r16.A01(r17, r18, r19, r20)
            goto L_0x02ce
        L_0x0319:
            X.1BI r1 = r7.A03()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r12 = X.C22941Dw.A01(r1)
            long r0 = r7.A0X
            X.AW0 r0 = r10.A02(r12, r2, r0)
            if (r0 == 0) goto L_0x032e
            r7.A08(r0)
        L_0x032e:
            r10 = 1
            r12 = 1
            r13 = 1
            goto L_0x02a2
        L_0x0333:
            if (r13 != 0) goto L_0x02a2
            java.lang.String r0 = "transaction"
            boolean r0 = X.C29621ca.A07(r2, r0)
            if (r0 == 0) goto L_0x02a2
            X.1ex r0 = r15.A01
            X.AW0 r0 = r0.A03(r2)
            if (r0 == 0) goto L_0x0349
            r7.A08(r0)
        L_0x0349:
            r14 = 1
            goto L_0x02a2
        L_0x034c:
            java.lang.String r1 = "PaymentMessageStanzaParser/paymentTransactionInfo is null"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0354:
            X.4s7 r5 = new X.4s7
            r5.<init>(r4)
            r12 = 0
        L_0x035a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x03b3
            java.lang.Object r4 = r5.next()
            X.1ca r4 = (X.C29621ca) r4
            if (r4 == 0) goto L_0x0391
            java.lang.Object r0 = r11.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r3 = r0.iterator()
        L_0x0372:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0382
            java.lang.Object r0 = r3.next()
            X.3M6 r0 = (X.AnonymousClass3M6) r0
            r0.CBF(r7, r4)
            goto L_0x0372
        L_0x0382:
            java.lang.String r0 = "enc"
            boolean r0 = X.C29621ca.A07(r4, r0)
            if (r0 == 0) goto L_0x035a
            X.190 r0 = r2.A01
            A00(r0, r7, r4)
            r12 = 1
            goto L_0x035a
        L_0x0391:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0397:
            java.lang.Class<X.AW0> r1 = X.AW0.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.Object r0 = r5.get(r0)
            X.B5K r0 = (X.B5K) r0
            if (r0 != 0) goto L_0x03b3
            if (r10 != 0) goto L_0x03aa
            if (r14 == 0) goto L_0x03b3
        L_0x03aa:
            long r0 = r7.A0X
            X.AW0 r0 = X.C20128A8n.A01(r0)
            r7.A08(r0)
        L_0x03b3:
            java.lang.Object r0 = r11.get()
            java.util.Set r0 = (java.util.Set) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x03bd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03cf
            java.lang.Object r0 = r1.next()
            X.3M6 r0 = (X.AnonymousClass3M6) r0
            boolean r0 = r0.CM6(r7)
            r12 = r12 | r0
            goto L_0x03bd
        L_0x03cf:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            android.util.Pair r0 = android.util.Pair.create(r7, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31621fr.A01(X.1ca, X.1fs, long, long):android.util.Pair");
    }
}
