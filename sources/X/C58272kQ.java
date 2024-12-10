package X;

/* renamed from: X.2kQ  reason: invalid class name and case insensitive filesystem */
public final class C58272kQ {
    public final AnonymousClass1Cd A00;

    public C58272kQ(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C27354DcQ A00(long r14, long r16) {
        /*
            r13 = this;
            X.1Cd r0 = r13.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006a }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "SELECT message_row_id, scheduled_reminder_timestamp_ms, chat_row_id FROM scheduled_reminder_message WHERE scheduled_reminder_timestamp_ms >= ? AND scheduled_reminder_timestamp_ms <= ?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x006a }
            X.C17890vO.A1J(r1, r14)     // Catch:{ all -> 0x006a }
            r4 = r16
            X.C17890vO.A1K(r1, r4)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "ScheduledReminderMessageStore/GET_ALL_ACTIVE_SCHEDULED_REMINDERS_BETWEEN_TIMESTAMPS"
            android.database.Cursor r4 = X.C18070vi.A04(r6, r3, r0, r1)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "message_row_id"
            int r6 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "scheduled_reminder_timestamp_ms"
            int r5 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "chat_row_id"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
            X.DcQ r1 = X.AnonymousClass1ZT.A01()     // Catch:{ all -> 0x0063 }
        L_0x0035:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0058
            long r9 = r4.getLong(r6)     // Catch:{ all -> 0x0063 }
            long r11 = r4.getLong(r5)     // Catch:{ all -> 0x0063 }
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x004b
            r8 = 0
            goto L_0x004f
        L_0x004b:
            java.lang.Long r8 = X.C17890vO.A0M(r4, r3)     // Catch:{ all -> 0x0063 }
        L_0x004f:
            X.4UH r7 = new X.4UH     // Catch:{ all -> 0x0063 }
            r7.<init>(r8, r9, r11)     // Catch:{ all -> 0x0063 }
            r1.add(r7)     // Catch:{ all -> 0x0063 }
            goto L_0x0035
        L_0x0058:
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r1)     // Catch:{ all -> 0x0063 }
            r4.close()     // Catch:{ all -> 0x006a }
            r2.close()
            return r0
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58272kQ.A00(long, long):X.DcQ");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r7) {
        /*
            r6 = this;
            X.1Cd r0 = r6.A00
            X.1au r5 = r0.A05()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001c }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x001c }
            java.lang.String r3 = "scheduled_reminder_message"
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r7)     // Catch:{ all -> 0x001c }
            java.lang.String r0 = "ScheduledReminderMessageStore/DELETE_REMINDER_BY_ROW_ID"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x001c }
            r5.close()
            return
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58272kQ.A01(long):void");
    }
}
