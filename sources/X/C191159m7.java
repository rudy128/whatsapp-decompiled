package X;

/* renamed from: X.9m7  reason: invalid class name and case insensitive filesystem */
public final class C191159m7 {
    public final AnonymousClass118 A00;
    public final C25081Mu A01;
    public final AnonymousClass00H A02;
    public final C18030ve A03;

    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C192209nz r33, X.C22523BBg r34, java.lang.Integer r35, java.lang.String r36, java.lang.String r37, java.lang.String r38) {
        /*
            r32 = this;
            r3 = 0
            r5 = 1
            r18 = 0
            r0 = r33
            if (r33 == 0) goto L_0x009a
            java.util.List r6 = r0.A01
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0094
            r9 = 0
        L_0x000f:
            r11 = r32
            X.00H r0 = r11.A02
            r31 = r0
            java.lang.String r15 = X.C17890vO.A0T(r31)
            X.0ve r7 = r11.A03
            r0 = 2792(0xae8, float:3.912E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r4, r7, r0)
            r8 = r38
            if (r38 == 0) goto L_0x0091
            r1 = 4116(0x1014, float:5.768E-42)
            int r0 = X.C18020vd.A00(r4, r7, r1)
            if (r0 <= 0) goto L_0x0091
            int r0 = X.C18020vd.A00(r4, r7, r1)
            java.lang.String r17 = java.lang.String.valueOf(r0)
        L_0x0037:
            if (r2 == 0) goto L_0x003f
            if (r9 == 0) goto L_0x003f
            java.lang.Long r18 = X.C108965cb.A0m(r9)
        L_0x003f:
            if (r6 == 0) goto L_0x00a4
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x00a4
            java.util.ArrayList r2 = X.C29351c6.A0D(r6)
            java.util.Iterator r12 = r6.iterator()
        L_0x004f:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r10 = r12.next()
            X.9rd r10 = (X.C194379rd) r10
            X.1yz r0 = X.AnonymousClass1EC.A01
            X.1BI r0 = r10.A01
            X.1EC r9 = X.C42941yz.A00(r0)
            if (r9 == 0) goto L_0x009f
            java.lang.Long r0 = r10.A00
            if (r0 != 0) goto L_0x0081
            java.lang.Long r0 = r10.A02
            long r0 = r0.longValue()
            r6 = -1
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x007b
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r6 = r4.toSeconds(r0)
        L_0x007b:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r10.A00 = r0
        L_0x0081:
            X.C18070vi.A0X(r0)
            long r0 = r0.longValue()
            X.9Ee r4 = new X.9Ee
            r4.<init>((X.AnonymousClass1EC) r9, (long) r0)
            r2.add(r4)
            goto L_0x004f
        L_0x0091:
            r17 = r18
            goto L_0x0037
        L_0x0094:
            java.lang.String r9 = java.lang.String.valueOf(r0)
            goto L_0x000f
        L_0x009a:
            r6 = r18
            r9 = r6
            goto L_0x000f
        L_0x009f:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x00a4:
            X.0wS r2 = X.C18460wS.A00
        L_0x00a6:
            if (r35 == 0) goto L_0x0163
            int r0 = r35.intValue()
        L_0x00ac:
            long r6 = (long) r0
            java.lang.Long r25 = java.lang.Long.valueOf(r6)
            java.lang.String r9 = "id"
            java.lang.String r14 = "platform"
            r4 = 2
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = "fbns"
            r1[r3] = r0
            java.lang.String r0 = "gcm"
            java.util.List r13 = X.C18070vi.A0O(r0, r1, r5)
            java.lang.String[] r1 = new java.lang.String[r4]
            java.lang.String r0 = "614665046147756"
            r1[r3] = r0
            java.lang.String r0 = "994766073959253"
            java.util.List r0 = X.AnonymousClass8BR.A15(r0, r1, r5)
            X.C18070vi.A0X(r0)
            java.lang.String[] r1 = X.AnonymousClass8BR.A1b()
            java.lang.String r0 = "0"
            r1[r3] = r0
            java.lang.String r0 = "1"
            r1[r5] = r0
            java.lang.String r0 = "2"
            java.util.List r10 = X.C18070vi.A0O(r0, r1, r4)
            java.lang.String r16 = "config"
            X.1cX r4 = X.C108945cZ.A0t(r16)
            r20 = 1
            r22 = 1024(0x400, double:5.06E-321)
            r1 = r36
            r19 = r1
            r24 = r3
            boolean r0 = X.C29601cY.A04(r19, r20, r22, r24)
            X.AnonymousClass8BW.A1F(r4, r9, r1, r0)
            if (r18 == 0) goto L_0x010b
            boolean r0 = X.AnonymousClass8BX.A1T(r18)
            if (r0 == 0) goto L_0x010b
            java.lang.String r12 = "app_mute"
            long r0 = r18.longValue()
            X.C108965cb.A1I(r4, r12, r0)
        L_0x010b:
            if (r38 == 0) goto L_0x011e
            r22 = 64
            r19 = r8
            r24 = r5
            boolean r0 = X.C29601cY.A04(r19, r20, r22, r24)
            if (r0 == 0) goto L_0x011e
            java.lang.String r0 = "pkey"
            X.C29591cX.A01(r4, r0, r8)
        L_0x011e:
            if (r25 == 0) goto L_0x0131
            r26 = 0
            r28 = 5
            r30 = r5
            boolean r0 = X.C29601cY.A03(r25, r26, r28, r30)
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "num_acc"
            X.C108965cb.A1I(r4, r0, r6)
        L_0x0131:
            r0 = r37
            r4.A09(r0, r14, r13)
            java.lang.String r1 = "voip_payload_type"
            r0 = r17
            r4.A08(r0, r1, r10)
            X.1ca r8 = r4.A03()
            X.C18070vi.A0d(r2, r5)
            X.1cX r4 = X.C108945cZ.A0t(r16)
            r6 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            boolean r0 = X.C29601cY.A05(r2, r6, r0)
            if (r0 == 0) goto L_0x0166
            java.util.Iterator r1 = r2.iterator()
        L_0x0159:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0166
            X.C178719Ee.A01(r4, r1)
            goto L_0x0159
        L_0x0163:
            r0 = 1
            goto L_0x00ac
        L_0x0166:
            java.lang.Boolean r0 = X.C17960vV.A01
            r4.A06(r8)
            X.1ca r2 = r4.A03()
            java.lang.String r4 = "iq"
            X.1cX r1 = X.C108945cZ.A0t(r4)
            X.1cX r0 = X.C108945cZ.A0t(r16)
            r0.A06(r2)
            X.1ca r2 = X.C29591cX.A00(r0, r1)
            X.1cX r1 = X.C108945cZ.A0t(r4)
            X.C108995ce.A1E(r1)
            java.lang.String r0 = "urn:xmpp:whatsapp:push"
            X.AnonymousClass8BY.A17(r1, r0)
            boolean r0 = X.AnonymousClass8BU.A1Z(r15, r6, r3)
            X.AnonymousClass8BW.A1F(r1, r9, r15, r0)
            r1.A06(r2)
            X.1ca r3 = r1.A03()
            r0 = 18
            X.Aco r2 = new X.Aco
            r1 = r34
            r2.<init>(r11, r1, r0)
            X.1OZ r1 = X.C17880vN.A0U(r31)
            r6 = 32000(0x7d00, double:1.581E-319)
            r4 = r15
            r1.A0N(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191159m7.A00(X.9nz, X.BBg, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public C191159m7(AnonymousClass118 r1, C18030ve r2, C25081Mu r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r3, r4);
        this.A03 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A02 = r4;
    }
}
