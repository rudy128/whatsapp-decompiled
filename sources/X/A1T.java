package X;

import android.content.ContentValues;

public final class A1T {
    public final AnonymousClass00H A00;

    public A1T(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r9, long r10) {
        /*
            r8 = this;
            r7 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "InactiveNotificationsStore/deleteNotificationsForLid/accountLid:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", lastActiveTsMs: "
            X.C17900vP.A0m(r0, r1, r10)
            X.00H r0 = r8.A00     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0053 }
            X.2Df r0 = (X.AnonymousClass2Df) r0     // Catch:{ all -> 0x0053 }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x0053 }
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x004c }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0045 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "notifications"
            java.lang.String r2 = "account_lid = ? AND timestamp < ?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0045 }
            r1[r7] = r9     // Catch:{ all -> 0x0045 }
            X.C17890vO.A1K(r1, r10)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "DELETE_NOTIFICATIONS_BY_LID_AND_LAST_ACTIVE_TS"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0045 }
            r6.A00()     // Catch:{ all -> 0x0045 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x0045 }
            r6.close()     // Catch:{ all -> 0x004c }
            r5.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0058
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x0058:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)
            if (r1 == 0) goto L_0x0063
            java.lang.String r0 = "InactiveNotificationsStore/deleteNotificationsForLid/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1T.A02(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r2 = 0
            monitor-enter(r11)
            r1 = 1
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0073 }
            int r0 = r12.length()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006c
            int r0 = r13.length()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x006c
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "call_status"
            X.C17880vN.A18(r5, r0, r2)     // Catch:{ all -> 0x0073 }
            X.00H r0 = r11.A00     // Catch:{ all -> 0x005b }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005b }
            X.2Df r0 = (X.AnonymousClass2Df) r0     // Catch:{ all -> 0x005b }
            X.1au r2 = r0.A06()     // Catch:{ all -> 0x005b }
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x0054 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004d }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x004d }
            java.lang.String r6 = "notifications"
            java.lang.String r7 = "account_lid = ? AND call_id = ?"
            r0 = 2
            java.lang.String[] r9 = X.C17880vN.A1b(r12, r13, r0, r1)     // Catch:{ all -> 0x004d }
            java.lang.String r8 = "UPDATE_CALL_NOTIFICATION"
            r10 = 5
            r4.A03(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x004d }
            r3.A00()     // Catch:{ all -> 0x004d }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x004d }
            r3.close()     // Catch:{ all -> 0x0054 }
            r2.close()     // Catch:{ all -> 0x005b }
            goto L_0x0060
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x0073 }
        L_0x0060:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)     // Catch:{ all -> 0x0073 }
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0073 }
            goto L_0x0071
        L_0x006c:
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r11)
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1T.A03(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ce, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(X.C195669ti r22) {
        /*
            r21 = this;
            r6 = r21
            monitor-enter(r6)
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e1 }
            r8 = r22
            java.lang.String r10 = r8.A07     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "group_message"
            boolean r0 = X.C18070vi.A18(r10, r1)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "voip_call_offer_group"
            boolean r0 = X.C18070vi.A18(r10, r0)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x002d
        L_0x001c:
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0026
            int r0 = r0.length()     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x002d
        L_0x0026:
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x002d:
            X.00H r0 = r6.A00     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00cf }
            X.2Df r0 = (X.AnonymousClass2Df) r0     // Catch:{ all -> 0x00cf }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x00cf }
            X.1xA r4 = r5.BD0()     // Catch:{ all -> 0x00c8 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c1 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "notifications"
            java.lang.String r0 = "message"
            boolean r0 = X.C18070vi.A18(r10, r0)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x0062
            boolean r0 = X.C18070vi.A18(r10, r1)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x0062
            android.content.ContentValues r7 = A00(r8)     // Catch:{ all -> 0x00c1 }
        L_0x0056:
            java.lang.String r1 = "INSERT_INACTIVE_NOTIFICATION"
            r0 = 5
            r3.A09(r2, r1, r7, r0)     // Catch:{ all -> 0x00c1 }
            r4.A00()     // Catch:{ all -> 0x00c1 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x00c1 }
            goto L_0x00b3
        L_0x0062:
            r0 = 4
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00c1 }
            java.lang.String r9 = r8.A03     // Catch:{ all -> 0x00c1 }
            X.AnonymousClass8BS.A1B(r9, r10, r7)     // Catch:{ all -> 0x00c1 }
            r0 = 2
            java.lang.String r11 = r8.A08     // Catch:{ all -> 0x00c1 }
            r7[r0] = r11     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r8.A06     // Catch:{ all -> 0x00c1 }
            r13 = r1
            if (r1 != 0) goto L_0x0076
            java.lang.String r1 = ""
        L_0x0076:
            r0 = 3
            r7[r0] = r1     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "SELECT count FROM notifications WHERE account_lid = ? AND notification_type = ? AND sender_jid = ? AND group_jid = ? "
            java.lang.String r0 = "GET_COUNT_FOR_SENDER_LID_AND_GROUP_JID"
            android.database.Cursor r7 = X.C18070vi.A04(r3, r1, r0, r7)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "count"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x00ba }
            long r19 = r7.getLong(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0094
        L_0x0092:
            r19 = 0
        L_0x0094:
            r7.close()     // Catch:{ all -> 0x00c1 }
            r0 = 1
            long r19 = r19 + r0
            long r0 = r8.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r12 = r8.A04     // Catch:{ all -> 0x00c1 }
            int r7 = r8.A00     // Catch:{ all -> 0x00c1 }
            java.lang.String r14 = r8.A05     // Catch:{ all -> 0x00c1 }
            java.lang.String r15 = r8.A09     // Catch:{ all -> 0x00c1 }
            X.9ti r8 = new X.9ti     // Catch:{ all -> 0x00c1 }
            r17 = r0
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x00c1 }
            android.content.ContentValues r7 = A00(r8)     // Catch:{ all -> 0x00c1 }
            goto L_0x0056
        L_0x00b3:
            r4.close()     // Catch:{ all -> 0x00c8 }
            r5.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d4
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00d4:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r6)
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1T.A01(X.9ti):void");
    }

    public static final ContentValues A00(C195669ti r3) {
        ContentValues A08 = C17880vN.A08();
        A08.put("account_lid", r3.A03);
        A08.put("notification_type", r3.A07);
        A08.put("sender_jid", r3.A08);
        A08.put("timestamp", Long.valueOf(r3.A02));
        String str = r3.A04;
        if (str != null) {
            A08.put("call_id", str);
        }
        A08.put("call_status", Integer.valueOf(r3.A00));
        String str2 = r3.A06;
        if (str2 != null) {
            A08.put("group_jid", str2);
        }
        String str3 = r3.A05;
        if (str3 != null) {
            A08.put("display_name", str3);
        }
        A08.put("count", Long.valueOf(r3.A01));
        String str4 = r3.A09;
        if (str4 != null) {
            A08.put("sender_pn_jid", str4);
        }
        return A08;
    }
}
