package X;

import java.util.Calendar;

/* renamed from: X.6O1  reason: invalid class name */
public final class AnonymousClass6O1 extends C24861Ly {
    public final AnonymousClass00H A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C153787q5(this));
    public final AnonymousClass11P A02;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bf, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A0I(java.util.List r10, long r11) {
        /*
            r9 = this;
            r6 = 0
            X.C18070vi.A0d(r10, r6)
            java.util.ArrayList r2 = X.C29351c6.A0D(r10)
            java.util.Iterator r1 = r10.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001e
            com.whatsapp.jid.Jid r0 = X.C17880vN.A0S(r1)
            java.lang.String r0 = r0.getRawString()
            r2.add(r0)
            goto L_0x000c
        L_0x001e:
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r2 = r2.toArray(r0)
            r1 = 974(0x3ce, float:1.365E-42)
            X.23b r0 = new X.23b
            r0.<init>(r2, r1)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r0.iterator()
        L_0x0033:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r5 = r8.next()
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            X.1Lt r0 = r9.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00b9 }
            X.C18070vi.A0b(r5)     // Catch:{ all -> 0x00b9 }
            java.util.List r2 = X.C200410p.A0Q(r5)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = ", "
            X.83x r0 = X.C1592783x.A00     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = X.C29431cG.A0h(r1, r2, r0)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "\n        SELECT jid, total_impressions_per_day, total_clicks_per_day \n        FROM status_ranking WHERE jid IN ("
            r1.append(r0)     // Catch:{ all -> 0x00b9 }
            r1.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = ") AND date_time = ?\n        "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = X.AnonymousClass1Y7.A01(r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String[] r0 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00b9 }
            X.C17880vN.A1V(r0, r6, r11)     // Catch:{ all -> 0x00b9 }
            java.lang.Object[] r1 = X.C200310o.A0F(r5, r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "GET_IMPRESSIONS_AND_CLICKS_FROM_JID_AND_DAY"
            android.database.Cursor r5 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x00b9 }
        L_0x0082:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = "total_clicks_per_day"
            int r3 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "total_impressions_per_day"
            int r2 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x00b2 }
            X.1Dx r1 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x00b2 }
            com.whatsapp.jid.PhoneUserJid r1 = r1.A04(r0)     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x0082
            X.6sJ r0 = new X.6sJ     // Catch:{ all -> 0x00b2 }
            r0.<init>(r1, r3, r2)     // Catch:{ all -> 0x00b2 }
            r7.add(r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x0082
        L_0x00ab:
            r5.close()     // Catch:{ all -> 0x00b9 }
            r4.close()
            goto L_0x0033
        L_0x00b2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00c0:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6O1.A0I(java.util.List, long):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(X.AnonymousClass1BI r20, java.lang.String r21, int r22, int r23) {
        /*
            r19 = this;
            java.lang.String r9 = "date_time"
            java.lang.String r8 = "jid"
            java.lang.String r7 = "total_impressions_per_day"
            java.lang.String r6 = "total_clicks_per_day"
            r5 = 0
            r11 = r20
            X.C18070vi.A0d(r11, r5)
            r0 = r19
            X.1Lt r0 = r0.A00
            X.1au r4 = r0.A06()
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x0089 }
            r10 = 2
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0082 }
            r14.<init>(r10)     // Catch:{ all -> 0x0082 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0082 }
            r14.put(r6, r2)     // Catch:{ all -> 0x0082 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0082 }
            r14.put(r7, r1)     // Catch:{ all -> 0x0082 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0082 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x0082 }
            java.lang.String r15 = "status_ranking"
            java.lang.String r16 = "jid = ? AND date_time = ?"
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x0082 }
            X.C17880vN.A1J(r11, r0, r5)     // Catch:{ all -> 0x0082 }
            r12 = 1
            r10 = r21
            r0[r12] = r21     // Catch:{ all -> 0x0082 }
            java.lang.String r17 = "UPDATE_STATUS_RANKING_DATA"
            r18 = r0
            int r0 = r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0078
            r0 = 4
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0082 }
            r12.<init>(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0082 }
            r12.put(r8, r0)     // Catch:{ all -> 0x0082 }
            r12.put(r6, r2)     // Catch:{ all -> 0x0082 }
            r12.put(r7, r1)     // Catch:{ all -> 0x0082 }
            r12.put(r9, r10)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0082 }
            r12.put(r8, r0)     // Catch:{ all -> 0x0082 }
            r12.put(r9, r10)     // Catch:{ all -> 0x0082 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0082 }
            r12.put(r6, r0)     // Catch:{ all -> 0x0082 }
            r12.put(r7, r0)     // Catch:{ all -> 0x0082 }
            X.C24861Ly.A00(r12, r4, r15)     // Catch:{ all -> 0x0082 }
        L_0x0078:
            r3.A00()     // Catch:{ all -> 0x0082 }
            r3.close()     // Catch:{ all -> 0x0089 }
            r4.close()
            return
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0089 }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6O1.A0K(X.1BI, java.lang.String, int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6O1(AnonymousClass11P r2, C24811Lt r3, AnonymousClass00H r4) {
        super(r3);
        C18070vi.A0o(r4, r3, r2);
        this.A00 = r4;
        this.A02 = r2;
    }

    public final Calendar A0J() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(AnonymousClass11P.A01(this.A02));
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance;
    }
}
