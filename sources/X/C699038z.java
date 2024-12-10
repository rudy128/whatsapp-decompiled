package X;

/* renamed from: X.38z  reason: invalid class name and case insensitive filesystem */
public final class C699038z implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public C699038z(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C62232r4) this.A00.get()).A02((C445823z) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C62232r4) this.A00.get()).A02((C445823z) r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0117, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011f, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0122, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r17) {
        /*
            r16 = this;
            r8 = r17
            r1 = 0
            X.C18070vi.A0d(r8, r1)
            r0 = r16
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.2r4 r0 = (X.C62232r4) r0
            X.23z r8 = (X.C445823z) r8
            X.C18070vi.A0d(r8, r1)
            X.1Cd r0 = r0.A02
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x011c }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x011c }
            java.lang.String r2 = "SELECT name, description, join_link, start_time, end_time, is_canceled, location_latitude, location_longitude, location_name, location_address, chat_row_id, event_state, allow_extra_guests FROM message_event WHERE message_row_id = ? "
            java.lang.String[] r1 = X.AnonymousClass206.A09(r8)     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "GET_MESSAGE_EVENT_BY_MESSAGE_ROW_ID"
            android.database.Cursor r7 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x011c }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "name"
            int r15 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "description"
            int r14 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "join_link"
            int r11 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "start_time"
            int r1 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "end_time"
            int r10 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "is_canceled"
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "location_latitude"
            int r3 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "location_longitude"
            int r4 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "location_name"
            int r5 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "location_address"
            int r2 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "event_state"
            int r12 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = "allow_extra_guests"
            int r9 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.getString(r15)     // Catch:{ all -> 0x0115 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0115 }
            r8.A06 = r0     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.getString(r14)     // Catch:{ all -> 0x0115 }
            r8.A04 = r0     // Catch:{ all -> 0x0115 }
            java.lang.String r0 = r7.getString(r11)     // Catch:{ all -> 0x0115 }
            r8.A05 = r0     // Catch:{ all -> 0x0115 }
            long r0 = r7.getLong(r1)     // Catch:{ all -> 0x0115 }
            r8.A00 = r0     // Catch:{ all -> 0x0115 }
            long r14 = r7.getLong(r10)     // Catch:{ all -> 0x0115 }
            r10 = 0
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x00a2
            r0 = 0
            goto L_0x00a6
        L_0x00a2:
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0115 }
        L_0x00a6:
            r8.A03 = r0     // Catch:{ all -> 0x0115 }
            int r0 = r7.getInt(r13)     // Catch:{ all -> 0x0115 }
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r8.A08 = r0     // Catch:{ all -> 0x0115 }
            java.lang.String r11 = r7.getString(r5)     // Catch:{ all -> 0x0115 }
            java.lang.String r10 = r7.getString(r2)     // Catch:{ all -> 0x0115 }
            double r2 = r7.getDouble(r3)     // Catch:{ all -> 0x0115 }
            java.lang.Double r5 = java.lang.Double.valueOf(r2)     // Catch:{ all -> 0x0115 }
            double r0 = r7.getDouble(r4)     // Catch:{ all -> 0x0115 }
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x0115 }
            if (r5 == 0) goto L_0x00cf
            if (r4 == 0) goto L_0x00cf
            goto L_0x00d1
        L_0x00cf:
            r4 = 0
            goto L_0x00d6
        L_0x00d1:
            X.9qf r4 = new X.9qf     // Catch:{ all -> 0x0115 }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x0115 }
        L_0x00d6:
            X.9rg r0 = new X.9rg     // Catch:{ all -> 0x0115 }
            r0.<init>(r4, r11, r10)     // Catch:{ all -> 0x0115 }
            r8.A01 = r0     // Catch:{ all -> 0x0115 }
            int r5 = r7.getInt(r12)     // Catch:{ all -> 0x0115 }
            r0 = 2
            java.lang.Integer[] r4 = X.AnonymousClass00R.A00(r0)     // Catch:{ all -> 0x0115 }
            int r3 = r4.length     // Catch:{ all -> 0x0115 }
            r2 = 0
        L_0x00e8:
            if (r2 >= r3) goto L_0x0106
            r1 = r4[r2]     // Catch:{ all -> 0x0115 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x0115 }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x00f6
            r0 = 0
            goto L_0x00f7
        L_0x00f6:
            r0 = 1
        L_0x00f7:
            if (r0 != r5) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            int r2 = r2 + 1
            goto L_0x00e8
        L_0x00fd:
            r8.A02 = r1     // Catch:{ all -> 0x0115 }
            boolean r0 = X.AnonymousClass24X.A01(r7, r9)     // Catch:{ all -> 0x0115 }
            r8.A07 = r0     // Catch:{ all -> 0x0115 }
            goto L_0x010e
        L_0x0106:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0115 }
            r0.<init>(r1)     // Catch:{ all -> 0x0115 }
            throw r0     // Catch:{ all -> 0x0115 }
        L_0x010e:
            r7.close()     // Catch:{ all -> 0x011c }
            r6.close()
            return
        L_0x0115:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x011c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x011e }
        L_0x011e:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699038z.BL9(X.206):void");
    }
}
