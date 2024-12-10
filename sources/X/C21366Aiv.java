package X;

/* renamed from: X.Aiv  reason: case insensitive filesystem */
public class C21366Aiv implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C21366Aiv(Object obj, Object obj2, String str, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A04 = str;
        this.A01 = j;
        this.A03 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01be, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01c2, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0055;
                case 1: goto L_0x00be;
                case 2: goto L_0x015a;
                case 3: goto L_0x016a;
                case 4: goto L_0x0100;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r14.A02
            X.1Uq r2 = (X.C27081Uq) r2
            java.lang.Object r1 = r14.A03
            X.1BI r1 = (X.AnonymousClass1BI) r1
            java.lang.String r7 = r14.A04
            long r3 = r14.A01
            X.1Cd r0 = r2.A03
            X.1au r6 = r0.A05()
            X.1LW r0 = r2.A01     // Catch:{ all -> 0x004b }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x004b }
            r5 = 1
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x004b }
            r9.<init>(r5)     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "call_log_row_id"
            X.C17880vN.A19(r9, r2, r3)     // Catch:{ all -> 0x004b }
            java.lang.String r11 = "key_chat_row_id = ? AND key_id = ?"
            r2 = r6
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x004b }
            X.1Ev r8 = r2.A02     // Catch:{ all -> 0x004b }
            java.lang.String r10 = "scheduled_calls"
            java.lang.String[] r13 = X.C17880vN.A1Z()     // Catch:{ all -> 0x004b }
            X.C17890vO.A1J(r13, r0)     // Catch:{ all -> 0x004b }
            r13[r5] = r7     // Catch:{ all -> 0x004b }
            java.lang.String r12 = "ScheduledCallsStore/UPDATE_CALL_LOG_ROW_ID_BY_KEY_ID_AND_CHAT"
            int r0 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x004b }
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "ScheduledCallsStore/updateCallLogRowId (by key_id and chat) failed to update"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x004b }
        L_0x0047:
            r6.close()
            return
        L_0x004b:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0050 }
            throw r1
        L_0x0050:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0055:
            java.lang.Object r5 = r14.A02
            com.whatsapp.backup.google.RestoreFromBackupActivity r5 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r5
            java.lang.String r7 = r14.A04
            long r1 = r14.A01
            java.lang.Object r6 = r14.A03
            X.A1C r6 = (X.A1C) r6
            android.os.ConditionVariable r0 = r5.A0w
            r0.block()
            r3 = 24
            r0 = 0
            r5.A4j(r0, r3)
            X.0z4 r0 = r5.A0A
            r0.A1Z(r7)
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            X.0z4 r0 = r5.A0A
            r0.A1o(r7, r1)
        L_0x007c:
            boolean r0 = r6 instanceof X.AnonymousClass8g6
            if (r0 == 0) goto L_0x0094
            X.8g6 r6 = (X.AnonymousClass8g6) r6
            monitor-enter(r6)
            java.util.Map r0 = r6.A00     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x008c
            java.util.Set r4 = r0.keySet()     // Catch:{ all -> 0x0091 }
            goto L_0x0099
        L_0x008c:
            java.util.Set r4 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0091 }
            goto L_0x0099
        L_0x0091:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0094:
            java.util.Set r4 = java.util.Collections.emptySet()
            goto L_0x009a
        L_0x0099:
            monitor-exit(r6)
        L_0x009a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b9
            java.lang.String r0 = "restore>RestoreFromBackupActivity/create-media-placeholders/before message restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r3 = r5.A0G
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00b9
            X.10I r2 = r3.A09
            r1 = 34
            X.AkK r0 = new X.AkK
            r0.<init>(r3, r4, r1)
            r2.CGF(r0)
        L_0x00b9:
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A14(r5, r0)
            return
        L_0x00be:
            java.lang.Object r6 = r14.A02
            X.9yv r6 = (X.C198799yv) r6
            java.lang.Object r5 = r14.A03
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5
            java.lang.String r4 = r14.A04
            long r2 = r14.A01
            X.A8S r1 = r6.A0E     // Catch:{ Exception -> 0x00f8 }
            X.9rM r0 = r1.A07(r5, r4)     // Catch:{ Exception -> 0x00f8 }
            if (r0 == 0) goto L_0x00f0
            r0.A00 = r2     // Catch:{ Exception -> 0x00f8 }
            r1.A0A(r0, r5)     // Catch:{ Exception -> 0x00f8 }
            X.9rM r0 = r1.A07(r5, r4)     // Catch:{ Exception -> 0x00f8 }
            if (r0 == 0) goto L_0x00f0
            X.1DT r3 = r6.A0A     // Catch:{ Exception -> 0x00f8 }
            if (r3 == 0) goto L_0x0154
            long r1 = r0.A00     // Catch:{ Exception -> 0x00f8 }
            int r0 = (int) r1     // Catch:{ Exception -> 0x00f8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00f8 }
            android.util.Pair r0 = X.C108945cZ.A0N(r4, r0)     // Catch:{ Exception -> 0x00f8 }
            r3.A0E(r0)     // Catch:{ Exception -> 0x00f8 }
            return
        L_0x00f0:
            X.1DT r0 = r6.A06     // Catch:{ Exception -> 0x00f8 }
            if (r0 == 0) goto L_0x0154
            X.C72463Mc.A1B(r0)     // Catch:{ Exception -> 0x00f8 }
            return
        L_0x00f8:
            X.1DT r0 = r6.A06
            if (r0 == 0) goto L_0x0154
            X.C72463Mc.A1B(r0)
            return
        L_0x0100:
            java.lang.Object r0 = r14.A02
            X.1i1 r0 = (X.C32951i1) r0
            java.lang.Object r12 = r14.A03
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            java.lang.String r9 = r14.A04
            long r6 = r14.A01
            r0.A09()
            java.lang.String r10 = ""
            java.lang.String r3 = r12.getString(r9, r10)
            r11 = 1
            X.C18070vi.A0d(r3, r11)
            char[] r1 = new char[r11]
            r0 = 44
            r2 = 0
            r1[r2] = r0
            r8 = 0
            java.util.List r0 = X.AnonymousClass1YF.A0R(r3, r1)
            java.lang.String[] r1 = X.C108955ca.A1b(r0)
            java.lang.Long r0 = X.C63782tg.A05(r1, r2)
            r4 = 0
            if (r0 != 0) goto L_0x0155
            r2 = 0
        L_0x0133:
            java.lang.Long r0 = X.C63782tg.A05(r1, r11)
            if (r0 == 0) goto L_0x013d
            long r4 = r0.longValue()
        L_0x013d:
            long r4 = r4 + r6
            android.content.SharedPreferences$Editor r6 = r12.edit()
            r0 = 2
            java.lang.Long[] r1 = new java.lang.Long[r0]
            X.AnonymousClass3MX.A1S(r1, r8, r2)
            X.AnonymousClass3MX.A1S(r1, r11, r4)
            java.lang.String r0 = ","
            java.lang.String r0 = X.C200410p.A0I(r0, r10, r10, r1)
            X.C17880vN.A1E(r6, r9, r0)
        L_0x0154:
            return
        L_0x0155:
            long r2 = r0.longValue()
            goto L_0x0133
        L_0x015a:
            java.lang.Object r4 = r14.A02
            com.whatsapp.calling.service.VoiceServiceEventCallback r4 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r4
            java.lang.String r3 = r14.A04
            java.lang.Object r2 = r14.A03
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            long r0 = r14.A01
            r4.m45lambda$setScheduledCallJoinTimeDiffMs$7$comwhatsappcallingserviceVoiceServiceEventCallback(r3, r2, r0)
            return
        L_0x016a:
            java.lang.Object r0 = r14.A02
            X.1kI r0 = (X.C34321kI) r0
            long r1 = r14.A01
            java.lang.Object r8 = r14.A03
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8
            java.lang.String r7 = r14.A04
            X.00H r0 = r0.A06
            java.lang.Object r0 = r0.get()
            X.2kd r0 = (X.C58402kd) r0
            X.1Lt r0 = r0.A00
            X.1au r4 = r0.A06()
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x01bf }
            r0 = 3
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x01b8 }
            r6.<init>(r0)     // Catch:{ all -> 0x01b8 }
            java.lang.String r3 = "user_jid"
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x01b8 }
            r6.put(r3, r0)     // Catch:{ all -> 0x01b8 }
            java.lang.String r0 = "invite_accepted_time"
            X.C17880vN.A19(r6, r0, r1)     // Catch:{ all -> 0x01b8 }
            java.lang.String r0 = "invite_receiver_reason"
            r6.put(r0, r7)     // Catch:{ all -> 0x01b8 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01b8 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x01b8 }
            java.lang.String r2 = "recently_accepted_deeplink_invites"
            java.lang.String r1 = "insert_recently_accepted_invite"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x01b8 }
            r5.A00()     // Catch:{ all -> 0x01b8 }
            r5.close()     // Catch:{ all -> 0x01bf }
            r4.close()
            return
        L_0x01b8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01c1 }
        L_0x01c1:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21366Aiv.run():void");
    }
}
