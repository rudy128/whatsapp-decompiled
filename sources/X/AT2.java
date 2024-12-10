package X;

public final class AT2 implements B83, B85, C436820m {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18030ve A05;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r1 != X.C179839Kc.A0J) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r0 == null) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r7 == null) goto L_0x0135;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 CBG(X.C20077A6d r20) {
        /*
            r19 = this;
            r6 = 0
            r5 = r20
            X.C18070vi.A0d(r5, r6)
            X.8cr r7 = r5.A08
            int r0 = r7.bitField0_
            r0 = r0 & 2048(0x800, float:2.87E-42)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r12 = 0
            if (r0 == 0) goto L_0x002e
            X.8cm r0 = r7.protocolMessage_
            r1 = r0
            if (r0 != 0) goto L_0x001c
            X.8cm r0 = X.C166368cm.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x002e
        L_0x001c:
            int r0 = r0.bitField0_
            r0 = r0 & 2
            if (r0 == 0) goto L_0x002e
            if (r1 != 0) goto L_0x0044
            X.8cm r1 = X.C166368cm.DEFAULT_INSTANCE
            if (r1 != 0) goto L_0x0044
            r1 = r12
        L_0x0029:
            X.9Kc r0 = X.C179839Kc.STATUS_MENTION_MESSAGE
            r3 = 1
            if (r1 == r0) goto L_0x002f
        L_0x002e:
            r3 = 0
        L_0x002f:
            int r2 = r7.bitField2_
            r0 = r2 & 32
            boolean r1 = X.AnonymousClass000.A1O(r0)
            r0 = r2 & 512(0x200, float:7.175E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            if (r3 != 0) goto L_0x0049
            if (r1 != 0) goto L_0x0049
            if (r0 != 0) goto L_0x0049
            return r12
        L_0x0044:
            X.9Kc r1 = r1.A0R()
            goto L_0x0029
        L_0x0049:
            r3 = r19
            X.0ve r2 = r3.A05
            r0 = 9816(0x2658, float:1.3755E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x0064
            r0 = 12254(0x2fde, float:1.7172E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x0064
            X.23U r4 = r5.A04(r6)
            return r4
        L_0x0064:
            int r1 = r7.bitField2_
            r0 = r1 & 32
            boolean r0 = X.AnonymousClass000.A1O(r0)
            r4 = 0
            if (r0 == 0) goto L_0x00b3
            X.8Xc r0 = r7.statusMentionMessage_
        L_0x0071:
            if (r0 != 0) goto L_0x0077
            X.8Xc r0 = X.C163988Xc.DEFAULT_INSTANCE
            if (r0 == 0) goto L_0x0135
        L_0x0077:
            X.8cr r7 = r0.message_
            if (r7 != 0) goto L_0x007f
            X.8cr r7 = X.C166418cr.DEFAULT_INSTANCE
            if (r7 == 0) goto L_0x0135
        L_0x007f:
            X.8cm r7 = r7.protocolMessage_
            if (r7 != 0) goto L_0x0087
            X.8cm r7 = X.C166368cm.DEFAULT_INSTANCE
            if (r7 == 0) goto L_0x0135
        L_0x0087:
            boolean r0 = r5.A0L
            if (r0 == 0) goto L_0x00c4
            X.00H r0 = r3.A02
            X.1W6 r0 = X.C17880vN.A0c(r0)
            X.205 r7 = r5.A0A
            X.206 r6 = X.C108945cZ.A0s(r7, r0)
            boolean r0 = r6 instanceof X.AnonymousClass24L
            if (r0 == 0) goto L_0x00ba
            if (r6 == 0) goto L_0x00ba
            X.00H r0 = r3.A01
            r0.get()
            long r1 = r5.A03
            r0 = 103(0x67, float:1.44E-43)
            X.24L r4 = new X.24L
            r4.<init>(r7, r0, r1)
            X.206 r0 = r6.A0K()
            r4.A0f(r0)
            return r4
        L_0x00b3:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x007f
            X.8Xc r0 = r7.groupStatusMentionMessage_
            goto L_0x0071
        L_0x00ba:
            long r1 = r5.A03
            r0 = 103(0x67, float:1.44E-43)
            X.24L r4 = new X.24L
            r4.<init>(r7, r0, r1)
            return r4
        L_0x00c4:
            X.1cg r2 = X.C29671cg.A00
            X.205 r10 = r5.A0A
            boolean r1 = r10.A02
            java.lang.String r0 = r10.A01
            X.205 r2 = X.AnonymousClass205.A01(r2, r0, r1)
            X.1BI r8 = r5.A05
            X.11S r1 = r3.A00
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x00db
            if (r8 == 0) goto L_0x00db
            r4 = r8
        L_0x00db:
            X.8cq r0 = r7.key_
            if (r0 != 0) goto L_0x00e1
            X.8cq r0 = X.C166408cq.DEFAULT_INSTANCE
        L_0x00e1:
            X.A51 r0 = X.AnonymousClass9AT.A00(r1, r4, r0, r2, r6)
            X.205 r11 = r0.A01
            X.C18070vi.A0W(r11)
            X.1BI r9 = r0.A00
            long r0 = r5.A03
            r2 = 103(0x67, float:1.44E-43)
            X.24L r4 = new X.24L
            r4.<init>(r10, r2, r0)
            boolean r2 = r5.A0K
            if (r2 == 0) goto L_0x010a
            X.00H r2 = r3.A04
            java.lang.Object r3 = r2.get()
            X.1R0 r3 = (X.AnonymousClass1R0) r3
            X.210 r2 = new X.210
            r2.<init>(r11, r0)
            r3.A00(r4, r2)
            return r4
        L_0x010a:
            X.00H r2 = r3.A02
            X.206 r2 = X.AnonymousClass1W2.A01(r11, r2)
            if (r2 == 0) goto L_0x011e
            X.00H r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.1R0 r0 = (X.AnonymousClass1R0) r0
            r0.A00(r4, r2)
            return r4
        L_0x011e:
            X.8cr r2 = r5.A09
            byte[] r13 = r2.A0M()
            r15 = 7
            r16 = 1
            X.9tq r7 = new X.9tq
            r14 = r12
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.98Y r0 = new X.98Y
            r0.<init>(r7)
            throw r0
        L_0x0135:
            X.1hd r0 = X.AnonymousClass8BR.A0o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AT2.CBG(X.A6d):X.206");
    }

    public AT2(AnonymousClass11S r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A05 = r3;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r5;
        this.A01 = r6;
        this.A03 = r7;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r12) {
        C163988Xc r0;
        int i;
        AnonymousClass205 r2;
        AnonymousClass1BI r02;
        boolean A15 = C18070vi.A15(r12, a2m);
        if (r12 instanceof AnonymousClass24L) {
            boolean A0e = C22971Dz.A0e(r12.A0v.A00);
            AnonymousClass8X8 r7 = a2m.A00;
            C166418cr r03 = (C166418cr) r7.A00;
            if (A0e) {
                r0 = r03.groupStatusMentionMessage_;
            } else {
                r0 = r03.statusMentionMessage_;
            }
            if (r0 == null) {
                r0 = C163988Xc.DEFAULT_INSTANCE;
            }
            AnonymousClass8X6 r6 = (AnonymousClass8X6) r0.A0O();
            AnonymousClass8X8 A002 = AnonymousClass8X6.A00(r6);
            C163898Wt A012 = AnonymousClass8X8.A01(A002);
            if (!a2m.A0B) {
                C166408cq r04 = ((C166368cm) A012.A00).key_;
                if (r04 == null) {
                    r04 = C166408cq.DEFAULT_INSTANCE;
                }
                AnonymousClass8X7 A0f = AnonymousClass8BR.A0f(r04);
                C18070vi.A0b(A0f);
                AnonymousClass206 A0K = r12.A0K();
                if (A0K == null || (r2 = A0K.A0v) == null) {
                    throw AnonymousClass000.A0k("Status mention message does not contain a status reference ");
                }
                C191029lu r1 = (C191029lu) C18070vi.A0E(this.A03);
                AnonymousClass206 A0K2 = r12.A0K();
                if (A0K2 != null) {
                    r02 = A0K2.A0H();
                } else {
                    r02 = null;
                }
                r1.A00(r02, A0f, r2, A15);
                A012.A0H(A0f);
            }
            A012.A0G(C179839Kc.STATUS_MENTION_MESSAGE);
            A002.A0N(A012);
            r6.A0H(A002);
            C166418cr A0M = AnonymousClass8BS.A0M(r7);
            C163988Xc r05 = (C163988Xc) r6.A0C();
            if (A0e) {
                r05.getClass();
                A0M.groupStatusMentionMessage_ = r05;
                i = A0M.bitField2_ | 512;
            } else {
                r05.getClass();
                A0M.statusMentionMessage_ = r05;
                i = A0M.bitField2_ | 32;
            }
            A0M.bitField2_ = i;
            return;
        }
        throw AnonymousClass000.A0k("FMessageStatusMentionProtobuf/message not supported");
    }
}
