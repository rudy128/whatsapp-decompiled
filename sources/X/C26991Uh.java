package X;

/* renamed from: X.1Uh  reason: invalid class name and case insensitive filesystem */
public class C26991Uh implements AnonymousClass128 {
    public final AnonymousClass1KB A00;
    public final AnonymousClass122 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass1Cd A04;
    public final AnonymousClass1MX A05;
    public final C25011Mn A06;
    public final C59422mH A07;
    public final AnonymousClass00H A08;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r1 == 13) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcH(X.AnonymousClass206 r8, int r9) {
        /*
            r7 = this;
            r3 = 1
            if (r9 == r3) goto L_0x0137
            r0 = 2
            if (r9 == r0) goto L_0x0119
            r0 = 4
            if (r9 == r0) goto L_0x0116
            r0 = 7
            if (r9 == r0) goto L_0x0089
            r0 = 8
            if (r9 == r0) goto L_0x0085
            switch(r9) {
                case 3009: goto L_0x0035;
                case 3010: goto L_0x0039;
                case 3011: goto L_0x006d;
                case 3012: goto L_0x0126;
                case 3013: goto L_0x0071;
                case 3014: goto L_0x013c;
                case 3015: goto L_0x0075;
                case 3016: goto L_0x0079;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r9) {
                case 3018: goto L_0x002d;
                case 3019: goto L_0x0031;
                case 3020: goto L_0x011c;
                default: goto L_0x0016;
            }
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unhandled action "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x002d:
            java.lang.String r0 = "groupactionhandler/handle subgroup suggestion created"
            goto L_0x011e
        L_0x0031:
            java.lang.String r0 = "groupactionhandler/handle history setting update"
            goto L_0x011e
        L_0x0035:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle groupchat announcements only change"
            goto L_0x011e
        L_0x0039:
            java.lang.String r0 = "groupactionhandler/community_link_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r2 = r8 instanceof X.AnonymousClass2MY
            boolean r1 = r8 instanceof X.C48322Ma
            if (r1 == 0) goto L_0x004d
            r0 = r8
            X.2Mh r0 = (X.C48392Mh) r0
            int r0 = r0.A00
            if (r0 != r3) goto L_0x004d
            goto L_0x0121
        L_0x004d:
            if (r2 != 0) goto L_0x0053
            if (r1 != 0) goto L_0x0053
            goto L_0x0121
        L_0x0053:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "groupactionhandler/community_link_change/skip "
            r1.append(r0)
            X.205 r0 = r8.A0v
            X.1BI r0 = r0.A00
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0126
        L_0x006d:
            java.lang.String r0 = "groupactionhandler/sibling_link"
            goto L_0x011e
        L_0x0071:
            java.lang.String r0 = "groupactionhandler/handle_group_linked_with_membership_approval_mode"
            goto L_0x011e
        L_0x0075:
            java.lang.String r0 = "groupactionhandler/handle community description change"
            goto L_0x011e
        L_0x0079:
            java.lang.String r0 = "groupactionhandler/handle community description updated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.122 r0 = r7.A01
            r0.CQw(r8)
            goto L_0x0126
        L_0x0085:
            java.lang.String r0 = "groupactionhandler/handle_growth_lock_change"
            goto L_0x011e
        L_0x0089:
            java.lang.String r0 = "groupactionhandler/handle_user_remove"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r6 = r8
            X.2Mh r6 = (X.C48392Mh) r6
            X.205 r0 = r6.A0v
            X.1BI r1 = r0.A00
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r5 = X.C36321nh.A00(r1)
            X.C17960vV.A07(r5)
            int r1 = r6.A00
            r0 = 5
            if (r1 == r0) goto L_0x00a8
            r0 = 13
            r3 = 0
            if (r1 != r0) goto L_0x00a9
        L_0x00a8:
            r3 = 1
        L_0x00a9:
            X.1MX r0 = r7.A05
            X.0ve r2 = r0.A02
            r0 = 1613(0x64d, float:2.26E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0121
            r0 = 1527(0x5f7, float:2.14E-42)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0121
            if (r3 == 0) goto L_0x0121
            X.1MZ r4 = r7.A03
            boolean r0 = r4.A0K(r5)
            if (r0 != 0) goto L_0x0121
            X.1Cd r0 = r7.A04
            X.1au r3 = r0.A05()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x010c }
            r4.A0G(r6)     // Catch:{ all -> 0x0102 }
            X.2mH r1 = r7.A07     // Catch:{ all -> 0x0102 }
            boolean r0 = r4.A0J(r5)     // Catch:{ all -> 0x0102 }
            r1.A00(r3, r5, r0)     // Catch:{ all -> 0x0102 }
            boolean r0 = r4.A0J(r5)     // Catch:{ all -> 0x0102 }
            if (r0 != 0) goto L_0x00f0
            X.00H r0 = r7.A08     // Catch:{ all -> 0x0102 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0102 }
            X.2r4 r0 = (X.C62232r4) r0     // Catch:{ all -> 0x0102 }
            r0.A01(r3, r5)     // Catch:{ all -> 0x0102 }
        L_0x00f0:
            r2.A00()     // Catch:{ all -> 0x0102 }
            r2.close()     // Catch:{ all -> 0x010c }
            r3.close()
            X.2rV r1 = r6.A03
            if (r1 == 0) goto L_0x0126
            r0 = 0
            X.C62502rV.A00(r0, r1, r0)
            goto L_0x0126
        L_0x0102:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0107 }
            goto L_0x010b
        L_0x0107:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x010c }
        L_0x010b:
            throw r1     // Catch:{ all -> 0x010c }
        L_0x010c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0111 }
            throw r1
        L_0x0111:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0116:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_groupchat_subject_change"
            goto L_0x011e
        L_0x0119:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle_add_groupchat_msg"
            goto L_0x011e
        L_0x011c:
            java.lang.String r0 = "groupactionhandler/handle group deactivation"
        L_0x011e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0121:
            X.122 r0 = r7.A01
            r0.BBM(r8)
        L_0x0126:
            X.205 r0 = r8.A0v
            X.1BI r3 = r0.A00
            X.1KB r2 = r7.A00
            r1 = 30
            X.7Qq r0 = new X.7Qq
            r0.<init>(r7, r3, r1)
            r2.A0J(r0)
            return
        L_0x0137:
            java.lang.String r0 = "groupactionhandler/handleGroupAction/handle-init-group-chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x013c:
            X.122 r0 = r7.A01
            r0.BBM(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26991Uh.BcH(X.206, int):void");
    }

    public C26991Uh(AnonymousClass1KB r1, AnonymousClass122 r2, AnonymousClass1MZ r3, AnonymousClass1Cd r4, AnonymousClass1MX r5, C25011Mn r6, C59422mH r7, AnonymousClass00H r8, AnonymousClass00H r9) {
        this.A00 = r1;
        this.A06 = r6;
        this.A01 = r2;
        this.A07 = r7;
        this.A08 = r8;
        this.A04 = r4;
        this.A02 = r9;
        this.A03 = r3;
        this.A05 = r5;
    }
}
