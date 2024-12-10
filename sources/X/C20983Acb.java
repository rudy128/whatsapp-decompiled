package X;

/* renamed from: X.Acb  reason: case insensitive filesystem */
public final class C20983Acb implements AnonymousClass1O5 {
    public final int A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass126 A02;
    public final C199369zs A03;
    public final AnonymousClass1OZ A04;
    public final C18030ve A05;

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00db, code lost:
        if (r7.equals("false") == false) goto L_0x00dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C7Z(X.C29621ca r46, java.lang.String r47) {
        /*
            r45 = this;
            r0 = 1
            r2 = r46
            X.C18070vi.A0d(r2, r0)
            r1 = r45
            X.0ve r4 = r1.A05
            r3 = 6350(0x18ce, float:8.898E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r3)
            if (r0 == 0) goto L_0x0060
            X.126 r3 = r1.A02
            java.lang.String r0 = "GroupChatManager/onGroupSyncResponseReceived/setGroupFetchInProgress false"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r3.A12
            r0.get()
            X.A8d r7 = X.A8d.A00     // Catch:{ 11T -> 0x01bd }
            int r6 = r1.A00     // Catch:{ 11T -> 0x01bd }
            r0 = 3
            X.Arf r5 = new X.Arf     // Catch:{ 11T -> 0x01bd }
            r5.<init>(r1, r0)     // Catch:{ 11T -> 0x01bd }
            r0 = 4
            X.Arf r3 = new X.Arf     // Catch:{ 11T -> 0x01bd }
            r3.<init>(r1, r0)     // Catch:{ 11T -> 0x01bd }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ 11T -> 0x01bd }
            java.lang.String r0 = "groups"
            X.1ca r2 = r2.A0K(r0)     // Catch:{ 11T -> 0x01bd }
            if (r2 == 0) goto L_0x0057
            java.lang.String r0 = "group"
            java.util.Iterator r2 = X.AnonymousClass8BW.A0r(r2, r0)     // Catch:{ 11T -> 0x01bd }
        L_0x0042:
            boolean r0 = r2.hasNext()     // Catch:{ 11T -> 0x01bd }
            if (r0 == 0) goto L_0x0057
            X.1ca r0 = X.C17880vN.A0a(r2)     // Catch:{ 11T -> 0x01bd }
            X.C18070vi.A0b(r0)     // Catch:{ 11T -> 0x01bd }
            X.A1t r0 = r7.A08(r0, r5, r3, r6)     // Catch:{ 11T -> 0x01bd }
            r4.add(r0)     // Catch:{ 11T -> 0x01bd }
            goto L_0x0042
        L_0x0057:
            X.9zs r3 = r1.A03     // Catch:{ 11T -> 0x01bd }
            X.9Hx r2 = X.C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED     // Catch:{ 11T -> 0x01bd }
            r0 = 0
            r3.A01(r2, r4, r0, r6)     // Catch:{ 11T -> 0x01bd }
            return
        L_0x0060:
            X.126 r10 = r1.A02
            java.lang.String r0 = "GroupChatManager/onGroupSyncResponseReceived/setGroupFetchInProgress false"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r10.A12
            r0.get()
            java.lang.String r0 = "groups"
            X.1ca r2 = r2.A0K(r0)     // Catch:{ 11T -> 0x01bd }
            r4 = 0
            if (r2 == 0) goto L_0x01b1
            java.lang.String r0 = "group"
            java.util.List r0 = r2.A0R(r0)     // Catch:{ 11T -> 0x01bd }
            if (r0 == 0) goto L_0x01b1
            java.util.ArrayList r6 = X.C29351c6.A0D(r0)     // Catch:{ 11T -> 0x01bd }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ 11T -> 0x01bd }
        L_0x0085:
            boolean r0 = r9.hasNext()     // Catch:{ 11T -> 0x01bd }
            if (r0 == 0) goto L_0x01b3
            X.1ca r0 = X.C17880vN.A0a(r9)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r2 = "id"
            java.lang.String r2 = X.AnonymousClass8BT.A0u(r0, r2, r4)     // Catch:{ 11T -> 0x01bd }
            X.1EC r12 = X.C22971Dz.A02(r2)     // Catch:{ 11T -> 0x01bd }
            X.C18070vi.A0X(r12)     // Catch:{ 11T -> 0x01bd }
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "creator"
            com.whatsapp.jid.Jid r14 = r0.A0F(r3, r2)     // Catch:{ 11T -> 0x01bd }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ 11T -> 0x01bd }
            java.lang.String r2 = "creation"
            java.lang.String r5 = r0.A0Q(r2, r4)     // Catch:{ 11T -> 0x01bd }
            r2 = 0
            long r27 = X.C20099A7c.A04(r5, r2)     // Catch:{ 11T -> 0x01bd }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r27 = r27 * r7
            r10.A0e(r14, r0)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r5 = "subject"
            java.lang.String r18 = r0.A0Q(r5, r4)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r5 = "s_t"
            java.lang.String r5 = r0.A0Q(r5, r4)     // Catch:{ 11T -> 0x01bd }
            long r29 = X.C20099A7c.A04(r5, r2)     // Catch:{ 11T -> 0x01bd }
            long r29 = r29 * r7
            java.lang.String r5 = "ack"
            java.lang.String r7 = r0.A0Q(r5, r4)     // Catch:{ 11T -> 0x01bd }
            if (r7 == 0) goto L_0x00dd
            java.lang.String r5 = "false"
            boolean r5 = r7.equals(r5)     // Catch:{ 11T -> 0x01bd }
            r40 = 0
            if (r5 != 0) goto L_0x00df
        L_0x00dd:
            r40 = 1
        L_0x00df:
            java.lang.String r5 = "locked"
            X.1ca r5 = r0.A0K(r5)     // Catch:{ 11T -> 0x01bd }
            boolean r34 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "announcement"
            X.1ca r5 = r0.A0K(r5)     // Catch:{ 11T -> 0x01bd }
            boolean r35 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "incognito"
            X.1ca r5 = r0.A0K(r5)     // Catch:{ 11T -> 0x01bd }
            boolean r38 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "no_frequently_forwarded"
            X.1ca r5 = r0.A0K(r5)     // Catch:{ 11T -> 0x01bd }
            boolean r36 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "suspended"
            X.1ca r5 = r0.A0K(r5)     // Catch:{ 11T -> 0x01bd }
            boolean r37 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "support"
            X.1ca r5 = r0.A0K(r5)     // Catch:{ 11T -> 0x01bd }
            boolean r33 = X.AnonymousClass000.A1W(r5)
            java.lang.String r5 = "a_v_id"
            long r31 = r0.A0D(r5, r2)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r2 = "addressing_mode"
            java.lang.String r7 = r0.A0Q(r2, r4)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r2 = "allow_admin_reports"
            X.1ca r2 = r0.A0K(r2)     // Catch:{ 11T -> 0x01bd }
            boolean r41 = X.AnonymousClass000.A1W(r2)
            java.lang.String r2 = "allow_non_admin_sub_group_creation"
            X.1ca r2 = r0.A0K(r2)     // Catch:{ 11T -> 0x01bd }
            boolean r42 = X.AnonymousClass000.A1W(r2)
            int r2 = r1.A00     // Catch:{ 11T -> 0x01bd }
            r3 = r2 & 1
            if (r3 == 0) goto L_0x0152
            X.190 r3 = r1.A01     // Catch:{ 11T -> 0x01bd }
            java.util.LinkedHashMap r5 = X.C21535Ali.A01(r0, r3)     // Catch:{ 11T -> 0x01bd }
            int r3 = X.C20099A7c.A00(r0, r5)     // Catch:{ 11T -> 0x01bd }
            java.lang.Integer r17 = java.lang.Integer.valueOf(r3)     // Catch:{ 11T -> 0x01bd }
        L_0x014f:
            X.1yX r15 = X.C42661yX.A05     // Catch:{ 11T -> 0x01bd }
            goto L_0x0156
        L_0x0152:
            r17 = r4
            r5 = r4
            goto L_0x014f
        L_0x0156:
            r2 = r2 & 2
            if (r2 == 0) goto L_0x015e
            X.1yX r15 = X.AnonymousClass8BW.A0P(r0)     // Catch:{ 11T -> 0x01bd }
        L_0x015e:
            X.A8d r2 = X.A8d.A00     // Catch:{ 11T -> 0x01bd }
            int r22 = X.A8d.A00(r0)     // Catch:{ 11T -> 0x01bd }
            X.1cn r16 = r2.A09(r0)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r3 = "group_history"
            X.1ca r3 = r0.A0K(r3)     // Catch:{ 11T -> 0x01bd }
            boolean r43 = X.AnonymousClass000.A1W(r3)
            java.lang.String r3 = "hidden_group"
            X.1ca r3 = r0.A0K(r3)     // Catch:{ 11T -> 0x01bd }
            boolean r44 = X.AnonymousClass000.A1W(r3)
            X.C18070vi.A0b(r15)     // Catch:{ 11T -> 0x01bd }
            X.2sm r11 = X.AnonymousClass8BV.A0E()     // Catch:{ 11T -> 0x01bd }
            int r23 = X.A8d.A02(r0)     // Catch:{ 11T -> 0x01bd }
            X.1EC r13 = X.A8d.A03(r0)     // Catch:{ 11T -> 0x01bd }
            boolean r39 = X.A8d.A06(r0)     // Catch:{ 11T -> 0x01bd }
            int r24 = r2.A07(r0)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r19 = X.C42671yY.A00(r7)     // Catch:{ 11T -> 0x01bd }
            int r25 = X.A8d.A01(r0)     // Catch:{ 11T -> 0x01bd }
            java.lang.String r2 = "capi"
            X.1ca r0 = r0.A0K(r2)     // Catch:{ 11T -> 0x01bd }
            boolean r26 = X.AnonymousClass000.A1W(r0)
            r20 = r5
            r21 = r4
            r10.A0R(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ 11T -> 0x01bd }
            r6.add(r12)     // Catch:{ 11T -> 0x01bd }
            goto L_0x0085
        L_0x01b1:
            X.0wS r6 = X.C18460wS.A00     // Catch:{ 11T -> 0x01bd }
        L_0x01b3:
            java.util.Set r2 = X.C29431cG.A12(r6)     // Catch:{ 11T -> 0x01bd }
            int r0 = r1.A00     // Catch:{ 11T -> 0x01bd }
            r10.A0k(r2, r0)     // Catch:{ 11T -> 0x01bd }
            return
        L_0x01bd:
            r2 = move-exception
            java.lang.String r0 = "GroupRequestProtocolHelper/error/groupInitFailed"
            com.whatsapp.util.Log.e(r0, r2)
            X.190 r3 = r1.A01
            java.lang.String r2 = "invalid-jid-received"
            r1 = 1
            java.lang.String r0 = "GroupRequestProtocolHelper/handleInvalidJidReceived"
            r3.A0G(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20983Acb.C7Z(X.1ca, java.lang.String):void");
    }

    public C20983Acb(AnonymousClass190 r2, C18030ve r3, AnonymousClass126 r4, C199369zs r5, AnonymousClass1OZ r6, int i) {
        C18070vi.A0k(r2, r6);
        C18070vi.A0d(r5, 5);
        this.A05 = r3;
        this.A01 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = i;
    }

    public void BrD(String str) {
        C17900vP.A0e("GroupRequestProtocolHelper/onDeliveryFailure/iqId=", str, C18070vi.A0K(str));
        this.A02.A0N(this.A00);
    }

    public void Bt9(C29621ca r3, String str) {
        C17900vP.A0e("GroupRequestProtocolHelper/onError/iqId=", str, C18070vi.A0K(str));
        this.A02.A0N(this.A00);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
