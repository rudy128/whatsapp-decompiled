package X;

import java.util.List;

/* renamed from: X.2lE  reason: invalid class name and case insensitive filesystem */
public final class C58772lE {
    public final C19830z4 A00;
    public final AnonymousClass1TG A01;
    public final C24661Le A02;
    public final AnonymousClass1N9 A03;
    public final C55512ft A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass00H A0A;

    public final void A01(AnonymousClass206 r10, List list, boolean z, boolean z2) {
        C17880vN.A0L(this.A0A).A01(new AnonymousClass7Q6(this, r10, list, 4, z, z2), 51);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r17 = r18.BD0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r13 = r3.A0F;
        r6 = r2.A0y;
        r14 = r8.A01();
        r4 = r8.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0211, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r0 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0215, code lost:
        r10 = X.C22971Dz.A06(r2.A0I());
        r16 = r13.A03.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r8 = X.C17880vN.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0227, code lost:
        if (r12 == false) goto L_0x022e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0229, code lost:
        X.C17880vN.A19(r8, "last_read_receipt_sent_message_table_id", r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022e, code lost:
        X.C17880vN.A19(r8, "last_read_message_table_id", r6);
        X.C17880vN.A18(r8, "unseen_count", r14);
        X.C17880vN.A19(r8, "first_unread_message_table_id", r4);
        X.C17880vN.A19(r8, "autodownload_limit_message_table_id", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0265, code lost:
        if (((X.C28801av) r16).A02.A02(r8, "status", "jid_row_id=?", X.C24661Le.A00("updateStatus/UPDATE"), X.C24661Le.A04(r13, X.C22941Dw.A02(r10))) != 0) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0267, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("msgstore/setstatusreadreceiptssent/no status saved for ");
        r1.append(r10);
        X.C17890vO.A19(r1, ";");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0283, code lost:
        if (X.C22971Dz.A0Z(r2.A0H()) == false) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0285, code lost:
        r8 = r3.A0D;
        r5 = r8.A01("status_psa_viewed_time", 0);
        r7 = r3.A0E;
        r1 = r7.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0297, code lost:
        if (r1.A00() != false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a2, code lost:
        if (r1.A01 != Long.MAX_VALUE) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a4, code lost:
        r6 = r1.A04;
        r0 = X.AnonymousClass11P.A01(r3.A02);
        r11 = X.C17880vN.A08();
        X.C17880vN.A19(r11, "first_seen_timestamp", r0);
        r5 = r7.A00.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r10 = ((X.C28801av) r5).A02;
        r4 = X.C17880vN.A1Z();
        r4[0] = r6;
        X.C17880vN.A1U(r4, 1, Long.MAX_VALUE);
        r10.A02(r11, "message_status_psa_campaign", "campaign_id=? AND first_seen_timestamp=?", "message_status_psa_campaign.UPDATE_SEEN_TIMESTAMP", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02d9, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r0 = r2.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e2, code lost:
        if (r0 < r5) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e4, code lost:
        r8.A05("status_psa_viewed_time", r0 + 10000);
        r8.A05("status_psa_exipration_time", X.AnonymousClass11P.A01(r3.A02) + 86400000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02fb, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02fe, code lost:
        r17.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0305, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x030a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0312, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0317, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x031b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x031c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0320, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0321, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0322, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r3.A0B.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x033b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r18.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x033f, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0340, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0341, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0344, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0135, code lost:
        r0 = "statusmanager/markstatusasseen/updatestatus returned null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e1, code lost:
        r3 = r6.A01;
        r1 = X.AnonymousClass000.A10();
        r1.append("msgstore/setstatusreadreceiptssent/");
        r1.append(r2.A0H());
        X.C17900vP.A0n(" rrsent=", r1, r12);
        r18 = r3.A0C.A05();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0142  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass206 r26, X.AnonymousClass206 r27, java.util.List r28, int r29, boolean r30, boolean r31) {
        /*
            r25 = this;
            r2 = r26
            if (r26 == 0) goto L_0x00c4
            long r3 = r2.A0y
            r8 = r27
            long r0 = r8.A0y
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L_0x00c4
            r6 = r25
            X.00H r4 = r6.A06
            java.lang.Object r0 = r4.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r0 = r0.A01
            r7 = 8880(0x22b0, float:1.2444E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r5 = X.C18020vd.A05(r3, r0, r7)
            if (r5 == 0) goto L_0x0030
            if (r31 == 0) goto L_0x0030
            X.205 r1 = r2.A0v
            X.205 r0 = r8.A0v
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0038
        L_0x0030:
            X.1Le r0 = r6.A02
            boolean r0 = r0.A0K(r2, r5)
            if (r0 == 0) goto L_0x00c4
        L_0x0038:
            java.lang.Object r0 = r4.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r0 = r0.A01
            boolean r0 = X.C18020vd.A05(r3, r0, r7)
            r8 = 0
            r9 = 1
            r7 = r28
            if (r0 == 0) goto L_0x018c
            X.205 r10 = r2.A0v
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x018c
            java.util.Iterator r12 = r7.iterator()
        L_0x0054:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0189
            java.lang.Object r5 = r12.next()
            r11 = r5
            X.206 r11 = (X.AnonymousClass206) r11
            X.205 r0 = r11.A0v
            boolean r0 = X.C18070vi.A18(r0, r10)
            if (r0 != 0) goto L_0x0054
            r0 = -9223372036854775808
            boolean r0 = X.C20133A8t.A0C(r11, r0, r9)
            if (r0 != 0) goto L_0x0054
        L_0x0071:
            X.206 r5 = (X.AnonymousClass206) r5
            r1 = -1
            if (r5 == 0) goto L_0x008d
            int r0 = r7.indexOf(r5)
            if (r0 == r1) goto L_0x008d
            int r1 = r7.size()
            int r1 = r1 - r9
            int r0 = r0 + 2
            int r0 = r0 - r9
        L_0x0084:
            if (r1 <= r0) goto L_0x0087
            r1 = r0
        L_0x0087:
            java.lang.Object r8 = r7.get(r1)
            X.206 r8 = (X.AnonymousClass206) r8
        L_0x008d:
            r15 = 0
            X.205 r13 = r2.A0v
            boolean r10 = r13.A02
            X.0z4 r0 = r6.A00
            boolean r12 = r0.A2U()
            r14 = r10 ^ 1
            if (r10 != 0) goto L_0x0142
            X.36j r0 = X.C63672tV.A02(r2)
            if (r0 == 0) goto L_0x0142
            boolean r0 = r0.A02()
            if (r0 != r9) goto L_0x0142
            int r1 = r2.A0D()
            r0 = 16
            if (r1 != r0) goto L_0x0142
            java.lang.Object r0 = r4.get()
            X.1Lc r0 = (X.C24641Lc) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0142
            r14 = 0
        L_0x00bd:
            if (r30 == 0) goto L_0x00c5
            X.1N9 r0 = r6.A03
            r0.A0A(r2)
        L_0x00c4:
            return
        L_0x00c5:
            X.1Le r1 = r6.A02
            if (r10 == 0) goto L_0x0139
            X.2sx r7 = r1.A07()
        L_0x00cd:
            if (r7 != 0) goto L_0x00e7
            if (r14 == 0) goto L_0x00c4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "statusmanager/markstatusasseen/no status for "
            r1.append(r0)
            X.1BI r0 = r2.A0H()
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
        L_0x00e3:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00e7:
            int r0 = r7.A01()
            if (r0 <= r9) goto L_0x012a
            long r0 = r2.A0y
            long r13 = r7.A03()
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x012a
            java.lang.Object r0 = r4.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r1 = r0.A01
            r0 = 10541(0x292d, float:1.4771E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x012a
            X.00H r0 = r6.A05
            java.lang.Object r11 = r0.get()
            X.190 r11 = (X.AnonymousClass190) r11
            java.lang.String r1 = "StatusManager/markStatusAsSeenInternal/unseenCount in bad state"
            r0 = 0
            r11.A0G(r1, r0, r15)
            r13 = 1
        L_0x0116:
            java.lang.Object r0 = r4.get()
            X.1Lc r0 = (X.C24641Lc) r0
            X.0ve r1 = r0.A01
            r0 = 8880(0x22b0, float:1.2444E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            monitor-enter(r7)
            if (r0 == 0) goto L_0x012c
            if (r10 == 0) goto L_0x01ab
            goto L_0x012c
        L_0x012a:
            r13 = 0
            goto L_0x0116
        L_0x012c:
            long r3 = r2.A0y     // Catch:{ all -> 0x0345 }
            long r0 = r7.A05     // Catch:{ all -> 0x0345 }
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x01ab
            monitor-exit(r7)
            java.lang.String r0 = "statusmanager/markstatusasseen/updatestatus returned null"
            goto L_0x00e3
        L_0x0139:
            com.whatsapp.jid.UserJid r0 = r2.A0I()
            X.2sx r7 = r1.A08(r0)
            goto L_0x00cd
        L_0x0142:
            if (r14 == 0) goto L_0x00bd
            X.1N9 r0 = r6.A03
            r0.A09(r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "statusmanager/markstatusasseen/sending status rr for "
            r1.append(r0)
            r1.append(r13)
            r11 = 32
            r1.append(r11)
            X.1BI r0 = r2.A0H()
            r1.append(r0)
            r1.append(r11)
            int r7 = r2.A0u
            X.C17900vP.A0o(r1, r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "statusmanager/markstatusasseen/mark seen "
            r1.append(r0)
            r1.append(r13)
            r1.append(r11)
            X.1BI r0 = r2.A0H()
            r1.append(r0)
            r1.append(r11)
            X.C17900vP.A0o(r1, r7)
            goto L_0x00bd
        L_0x0189:
            r5 = r8
            goto L_0x0071
        L_0x018c:
            int r1 = r29 + 1
            int r0 = r7.size()
            if (r1 >= r0) goto L_0x01a9
            java.lang.Object r5 = r7.get(r1)
            X.206 r5 = (X.AnonymousClass206) r5
        L_0x019a:
            int r0 = r7.size()
            if (r1 >= r0) goto L_0x008d
            int r1 = r7.size()
            int r1 = r1 - r9
            int r0 = r29 + 2
            goto L_0x0084
        L_0x01a9:
            r5 = r8
            goto L_0x019a
        L_0x01ab:
            if (r12 == 0) goto L_0x01b1
            long r0 = r2.A0y     // Catch:{ all -> 0x0345 }
            r7.A06 = r0     // Catch:{ all -> 0x0345 }
        L_0x01b1:
            long r3 = r2.A0y     // Catch:{ all -> 0x0345 }
            r7.A05 = r3     // Catch:{ all -> 0x0345 }
            int r0 = r7.A01     // Catch:{ all -> 0x0345 }
            if (r0 <= 0) goto L_0x01c9
            int r11 = r0 + -1
            r7.A01 = r11     // Catch:{ all -> 0x0345 }
            if (r13 == 0) goto L_0x01c9
            long r0 = r7.A04     // Catch:{ all -> 0x0345 }
            int r10 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x01c9
            if (r11 <= 0) goto L_0x01c9
            r7.A01 = r15     // Catch:{ all -> 0x0345 }
        L_0x01c9:
            r3 = -9223372036854775808
            if (r5 != 0) goto L_0x01d0
            r0 = -9223372036854775808
            goto L_0x01d2
        L_0x01d0:
            long r0 = r5.A0y     // Catch:{ all -> 0x0345 }
        L_0x01d2:
            r7.A03 = r0     // Catch:{ all -> 0x0345 }
            r7.A07 = r5     // Catch:{ all -> 0x0345 }
            if (r8 == 0) goto L_0x01da
            long r3 = r8.A0y     // Catch:{ all -> 0x0345 }
        L_0x01da:
            r7.A02 = r3     // Catch:{ all -> 0x0345 }
            X.2sx r8 = r7.A06()     // Catch:{ all -> 0x0345 }
            monitor-exit(r7)
            X.1TG r3 = r6.A01
            java.lang.String r11 = "status_psa_viewed_time"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/"
            r1.append(r0)
            X.1BI r0 = r2.A0H()
            r1.append(r0)
            java.lang.String r0 = " rrsent="
            X.C17900vP.A0n(r0, r1, r12)
            X.1Cd r0 = r3.A0C
            X.1au r18 = r0.A05()
            X.1xA r17 = r18.BD0()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0321, Error | RuntimeException -> 0x031c }
            X.1Le r13 = r3.A0F     // Catch:{ all -> 0x0312 }
            long r6 = r2.A0y     // Catch:{ all -> 0x0312 }
            int r14 = r8.A01()     // Catch:{ all -> 0x0312 }
            long r4 = r8.A02()     // Catch:{ all -> 0x0312 }
            monitor-enter(r8)     // Catch:{ all -> 0x0312 }
            long r0 = r8.A02     // Catch:{ all -> 0x030f }
            monitor-exit(r8)     // Catch:{ all -> 0x0312 }
            com.whatsapp.jid.UserJid r8 = r2.A0I()     // Catch:{ all -> 0x0312 }
            java.lang.String r10 = X.C22971Dz.A06(r8)     // Catch:{ all -> 0x0312 }
            X.1Cd r8 = r13.A03     // Catch:{ all -> 0x0312 }
            X.1au r16 = r8.A05()     // Catch:{ all -> 0x0312 }
            android.content.ContentValues r8 = X.C17880vN.A08()     // Catch:{ all -> 0x0305 }
            if (r12 == 0) goto L_0x022e
            java.lang.String r12 = "last_read_receipt_sent_message_table_id"
            X.C17880vN.A19(r8, r12, r6)     // Catch:{ all -> 0x0305 }
        L_0x022e:
            java.lang.String r12 = "last_read_message_table_id"
            X.C17880vN.A19(r8, r12, r6)     // Catch:{ all -> 0x0305 }
            java.lang.String r6 = "unseen_count"
            X.C17880vN.A18(r8, r6, r14)     // Catch:{ all -> 0x0305 }
            java.lang.String r6 = "first_unread_message_table_id"
            X.C17880vN.A19(r8, r6, r4)     // Catch:{ all -> 0x0305 }
            java.lang.String r4 = "autodownload_limit_message_table_id"
            X.C17880vN.A19(r8, r4, r0)     // Catch:{ all -> 0x0305 }
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0305 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0305 }
            java.lang.String r21 = "status"
            java.lang.String r22 = "jid_row_id=?"
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r10)     // Catch:{ all -> 0x0305 }
            java.lang.String[] r24 = X.C24661Le.A04(r13, r0)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "updateStatus/UPDATE"
            java.lang.String r23 = X.C24661Le.A00(r0)     // Catch:{ all -> 0x0305 }
            r19 = r1
            r20 = r8
            int r0 = r19.A02(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x0278
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "msgstore/setstatusreadreceiptssent/no status saved for "
            r1.append(r0)     // Catch:{ all -> 0x0305 }
            r1.append(r10)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = ";"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0305 }
        L_0x0278:
            r16.close()     // Catch:{ all -> 0x0312 }
            X.1BI r0 = r2.A0H()     // Catch:{ all -> 0x0312 }
            boolean r0 = X.C22971Dz.A0Z(r0)     // Catch:{ all -> 0x0312 }
            if (r0 == 0) goto L_0x02fe
            X.1La r8 = r3.A0D     // Catch:{ all -> 0x0312 }
            r0 = 0
            long r5 = r8.A01(r11, r0)     // Catch:{ all -> 0x0312 }
            X.1Lb r7 = r3.A0E     // Catch:{ all -> 0x0312 }
            X.2ss r1 = r7.A00(r2)     // Catch:{ all -> 0x0312 }
            boolean r0 = r1.A00()     // Catch:{ all -> 0x0312 }
            if (r0 != 0) goto L_0x02de
            long r4 = r1.A01     // Catch:{ all -> 0x0312 }
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x02fe
            java.lang.String r6 = r1.A04     // Catch:{ all -> 0x0312 }
            X.11P r0 = r3.A02     // Catch:{ all -> 0x0312 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0312 }
            android.content.ContentValues r11 = X.C17880vN.A08()     // Catch:{ all -> 0x0312 }
            java.lang.String r4 = "first_seen_timestamp"
            X.C17880vN.A19(r11, r4, r0)     // Catch:{ all -> 0x0312 }
            X.1Cd r0 = r7.A00     // Catch:{ all -> 0x0312 }
            X.1au r5 = r0.A05()     // Catch:{ all -> 0x0312 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x02d9 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x02d9 }
            java.lang.String r12 = "message_status_psa_campaign"
            java.lang.String r13 = "campaign_id=? AND first_seen_timestamp=?"
            java.lang.String[] r4 = X.C17880vN.A1Z()     // Catch:{ all -> 0x02d9 }
            r4[r15] = r6     // Catch:{ all -> 0x02d9 }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.C17880vN.A1U(r4, r9, r0)     // Catch:{ all -> 0x02d9 }
            java.lang.String r14 = "message_status_psa_campaign.UPDATE_SEEN_TIMESTAMP"
            r15 = r4
            r10.A02(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x02d9 }
            goto L_0x02fb
        L_0x02d9:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x030a }
            goto L_0x030e
        L_0x02de:
            long r0 = r2.A0I     // Catch:{ all -> 0x0312 }
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x02fe
            r4 = 10000(0x2710, double:4.9407E-320)
            long r0 = r0 + r4
            X.11P r4 = r3.A02     // Catch:{ all -> 0x0312 }
            long r4 = X.AnonymousClass11P.A01(r4)     // Catch:{ all -> 0x0312 }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            long r4 = r4 + r6
            r8.A05(r11, r0)     // Catch:{ all -> 0x0312 }
            java.lang.String r0 = "status_psa_exipration_time"
            r8.A05(r0, r4)     // Catch:{ all -> 0x0312 }
            goto L_0x02fe
        L_0x02fb:
            r5.close()     // Catch:{ all -> 0x0312 }
        L_0x02fe:
            r17.A00()     // Catch:{ all -> 0x0312 }
            r17.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0321, Error | RuntimeException -> 0x031c }
            goto L_0x032a
        L_0x0305:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x030a }
            goto L_0x030e
        L_0x030a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0312 }
        L_0x030e:
            throw r1     // Catch:{ all -> 0x0312 }
        L_0x030f:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0312 }
            throw r0     // Catch:{ all -> 0x0312 }
        L_0x0312:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0317 }
            goto L_0x031b
        L_0x0317:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0321, Error | RuntimeException -> 0x031c }
        L_0x031b:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0321, Error | RuntimeException -> 0x031c }
        L_0x031c:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x033b }
            throw r0     // Catch:{ all -> 0x033b }
        L_0x0321:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x033b }
            X.1Cn r0 = r3.A0B     // Catch:{ all -> 0x033b }
            r0.A03()     // Catch:{ all -> 0x033b }
        L_0x032a:
            X.1Q2 r0 = r3.A06     // Catch:{ all -> 0x033b }
            android.os.Handler r4 = r0.A02     // Catch:{ all -> 0x033b }
            r1 = 3
            X.3Ch r0 = new X.3Ch     // Catch:{ all -> 0x033b }
            r0.<init>(r3, r2, r1)     // Catch:{ all -> 0x033b }
            r4.post(r0)     // Catch:{ all -> 0x033b }
            r18.close()
            return
        L_0x033b:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0340 }
            throw r1
        L_0x0340:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0345:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58772lE.A00(X.206, X.206, java.util.List, int, boolean, boolean):void");
    }

    public C58772lE(AnonymousClass11P r1, C19830z4 r2, AnonymousClass1TG r3, C24661Le r4, AnonymousClass1N9 r5, C55512ft r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        C18070vi.A0w(r1, r4, r5, r7, r3);
        C18070vi.A0x(r2, r8, r9, r10, r11);
        this.A09 = r1;
        this.A02 = r4;
        this.A03 = r5;
        this.A0A = r7;
        this.A01 = r3;
        this.A00 = r2;
        this.A08 = r8;
        this.A07 = r9;
        this.A06 = r10;
        this.A05 = r11;
        this.A04 = r6;
    }
}
