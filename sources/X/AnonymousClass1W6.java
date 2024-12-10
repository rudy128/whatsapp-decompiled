package X;

import android.database.Cursor;

/* renamed from: X.1W6  reason: invalid class name */
public class AnonymousClass1W6 {
    public final AnonymousClass1W5 A00;
    public final AnonymousClass1W2 A01;
    public final AnonymousClass1W3 A02;
    public final AnonymousClass1W4 A03;

    public AnonymousClass1W6(AnonymousClass1W5 r2, AnonymousClass1W3 r3, AnonymousClass1W2 r4, AnonymousClass1W4 r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A01 = r4;
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = r2;
    }

    public AnonymousClass206 A01(Cursor cursor) {
        AnonymousClass1W2 r2 = this.A01;
        AnonymousClass1BI A0C = r2.A01.A0C(cursor);
        if (A0C != null) {
            return r2.A04(cursor, A0C, false, true);
        }
        return null;
    }

    public AnonymousClass206 A02(Cursor cursor, AnonymousClass1BI r5) {
        C18070vi.A0d(r5, 1);
        return this.A01.A04(cursor, r5, false, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A03(X.AnonymousClass1BI r12, long r13) {
        /*
            r11 = this;
            r7 = 0
            X.C18070vi.A0d(r12, r7)
            X.1W2 r5 = r11.A01
            java.lang.String r4 = "CachedMessageStore/getMessageBySortIdForChat/sortId"
            long r9 = android.os.SystemClock.uptimeMillis()
            X.1Cd r0 = r5.A06     // Catch:{ all -> 0x0060 }
            X.1at r6 = r0.get()     // Catch:{ all -> 0x0060 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0059 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = X.AnonymousClass203.A0D     // Catch:{ all -> 0x0059 }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0059 }
            r2[r7] = r0     // Catch:{ all -> 0x0059 }
            X.1LW r0 = r5.A01     // Catch:{ all -> 0x0059 }
            long r0 = r0.A09(r12)     // Catch:{ all -> 0x0059 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0059 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "GET_MESSAGE_BY_SORT_ID_SQL_FOR_CHAT"
            android.database.Cursor r2 = r8.A0A(r3, r0, r2)     // Catch:{ all -> 0x0059 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0052 }
            r3 = 0
            if (r0 == 0) goto L_0x0041
            r0 = 1
            X.206 r3 = r5.A04(r2, r12, r7, r0)     // Catch:{ all -> 0x0052 }
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x0059 }
            r6.close()     // Catch:{ all -> 0x0060 }
            X.1LY r2 = r5.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r9
            r2.A01(r4, r0)
            return r3
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r3 = move-exception
            X.1LY r2 = r5.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r9
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W6.A03(X.1BI, long):X.206");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0112, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass206 r12) {
        /*
            r11 = this;
            X.1W3 r4 = r11.A02
            long r9 = android.os.SystemClock.uptimeMillis()
            boolean r0 = r12 instanceof X.C442522s
            if (r0 == 0) goto L_0x0021
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FMessageDatabaseInsertMethods/skip storing transient message: "
            r1.append(r0)
            X.205 r0 = r12.A0v
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0021:
            X.00H r6 = r4.A04
            java.lang.Object r0 = r6.get()
            X.24k r0 = (X.C446924k) r0
            int r2 = r12.A0u
            X.0vl r1 = r0.A0B
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            boolean r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x0113
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            X.20A r0 = r0.A00(r2)
            boolean r0 = r0 instanceof X.C447124m
            if (r0 == 0) goto L_0x0113
            X.1Cd r0 = r4.A02
            X.1au r3 = r0.A05()
            X.1xA r5 = r3.BD0()     // Catch:{ all -> 0x010c }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x0105 }
            X.24k r6 = (X.C446924k) r6     // Catch:{ all -> 0x0105 }
            X.3Hs r8 = new X.3Hs     // Catch:{ all -> 0x0105 }
            r8.<init>(r12, r4)     // Catch:{ all -> 0x0105 }
            X.0vl r1 = r6.A0B     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0105 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x0105 }
            boolean r0 = r0.A02(r2)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0105 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x0105 }
            X.20A r0 = r0.A00(r2)     // Catch:{ all -> 0x0105 }
            boolean r0 = r0 instanceof X.C447124m     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x0105 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x0105 }
            X.20A r7 = r0.A00(r2)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.insertion.FMessageDatabaseInserter"
            X.C18070vi.A0z(r7, r0)     // Catch:{ all -> 0x0105 }
            X.24m r7 = (X.C447124m) r7     // Catch:{ all -> 0x0105 }
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x0105 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0105 }
            r0.<init>(r1)     // Catch:{ all -> 0x0105 }
            r2 = 0
            X.00H r0 = r6.A07     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0105 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0105 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0105 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0105 }
        L_0x00a2:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0105 }
            X.24q r0 = (X.C447524q) r0     // Catch:{ all -> 0x0105 }
            r0.CCZ(r12, r2)     // Catch:{ all -> 0x0105 }
            goto L_0x00a2
        L_0x00b2:
            r8.invoke()     // Catch:{ all -> 0x0105 }
            r7.BdY(r12)     // Catch:{ all -> 0x0105 }
            X.00H r0 = r6.A06     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0105 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0105 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0105 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0105 }
        L_0x00c7:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0105 }
            X.24q r0 = (X.C447524q) r0     // Catch:{ all -> 0x0105 }
            r0.CCZ(r12, r2)     // Catch:{ all -> 0x0105 }
            goto L_0x00c7
        L_0x00d7:
            java.lang.String r2 = "update"
            java.lang.String r1 = "fmessage-database-inserting-not-supported"
            java.lang.String r0 = "message cannot be inserted into the database"
            X.C446924k.A00(r12, r6, r0, r2, r1)     // Catch:{ all -> 0x0105 }
        L_0x00e1:
            r5.A00()     // Catch:{ all -> 0x0105 }
            r5.close()     // Catch:{ all -> 0x010c }
            r3.close()
            X.12I r3 = r4.A03
            X.10s r2 = r3.A01
            r1 = 42
            X.3Ch r0 = new X.3Ch
            r0.<init>(r3, r12, r1)
            r2.execute(r0)
            X.1LY r3 = r4.A00
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "CoreMessageStore/insertMessage"
            r3.A01(r0, r1)
            return
        L_0x0105:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x010c }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0113:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported message type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W6.A04(X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ef, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(X.AnonymousClass206 r12, int r13) {
        /*
            r11 = this;
            X.1W4 r5 = r11.A03
            long r9 = android.os.SystemClock.uptimeMillis()
            X.00H r6 = r5.A04
            java.lang.Object r0 = r6.get()
            X.24k r0 = (X.C446924k) r0
            int r2 = r12.A0u
            X.0vl r1 = r0.A0B
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            boolean r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x00f3
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            X.20A r0 = r0.A00(r2)
            boolean r0 = r0 instanceof X.C447324o
            if (r0 == 0) goto L_0x00f3
            X.1Cd r0 = r5.A03
            X.1au r3 = r0.A05()
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x00ec }
            java.lang.Object r6 = r6.get()     // Catch:{ all -> 0x00e5 }
            X.24k r6 = (X.C446924k) r6     // Catch:{ all -> 0x00e5 }
            X.3I2 r8 = new X.3I2     // Catch:{ all -> 0x00e5 }
            r8.<init>(r12, r5, r13)     // Catch:{ all -> 0x00e5 }
            X.0vl r1 = r6.A0B     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00e5 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x00e5 }
            boolean r0 = r0.A02(r2)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00e5 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x00e5 }
            X.20A r0 = r0.A00(r2)     // Catch:{ all -> 0x00e5 }
            boolean r0 = r0 instanceof X.C447324o     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r1.getValue()     // Catch:{ all -> 0x00e5 }
            X.20Z r0 = (X.AnonymousClass20Z) r0     // Catch:{ all -> 0x00e5 }
            X.20A r7 = r0.A00(r2)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.update.FMessageDatabaseUpdater"
            X.C18070vi.A0z(r7, r0)     // Catch:{ all -> 0x00e5 }
            X.24o r7 = (X.C447324o) r7     // Catch:{ all -> 0x00e5 }
            java.lang.Class r1 = r7.getClass()     // Catch:{ all -> 0x00e5 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x00e5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e5 }
            r2 = 0
            X.00H r0 = r6.A0A     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00e5 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00e5 }
        L_0x0087:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e5 }
            X.3LL r0 = (X.AnonymousClass3LL) r0     // Catch:{ all -> 0x00e5 }
            r0.CCb(r12, r2, r13)     // Catch:{ all -> 0x00e5 }
            goto L_0x0087
        L_0x0097:
            r8.invoke()     // Catch:{ all -> 0x00e5 }
            r7.CQL(r12)     // Catch:{ all -> 0x00e5 }
            X.00H r0 = r6.A09     // Catch:{ all -> 0x00e5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x00e5 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00e5 }
        L_0x00ac:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00e5 }
            X.3LK r0 = (X.AnonymousClass3LK) r0     // Catch:{ all -> 0x00e5 }
            r0.CCb(r12, r2, r13)     // Catch:{ all -> 0x00e5 }
            goto L_0x00ac
        L_0x00bc:
            java.lang.String r2 = "insert"
            java.lang.String r1 = "fmessage-database-updating-not-supported"
            java.lang.String r0 = "message cannot be updated into the database"
            X.C446924k.A00(r12, r6, r0, r2, r1)     // Catch:{ all -> 0x00e5 }
        L_0x00c5:
            r4.A00()     // Catch:{ all -> 0x00e5 }
            r1 = 2
            X.7RD r0 = new X.7RD     // Catch:{ all -> 0x00e5 }
            r0.<init>(r5, r12, r1)     // Catch:{ all -> 0x00e5 }
            r3.BJ7(r0)     // Catch:{ all -> 0x00e5 }
            r4.close()     // Catch:{ all -> 0x00ec }
            r3.close()
            X.1LY r3 = r5.A00
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r9
            java.lang.String r0 = "CoreMessageStore/updateMessageOnCurrentThread"
            r3.A01(r0, r1)
            r0 = 1
            return r0
        L_0x00e5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e7 }
        L_0x00e7:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00ec }
            throw r0     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x00f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported message type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W6.A05(X.206, int):boolean");
    }

    public static AnonymousClass206 A00(Cursor cursor, AnonymousClass00H r2) {
        return ((AnonymousClass1W6) r2.get()).A01(cursor);
    }
}
