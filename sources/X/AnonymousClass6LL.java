package X;

/* renamed from: X.6LL  reason: invalid class name */
public final class AnonymousClass6LL extends A34 {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f8, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r10) {
        /*
            r9 = this;
            X.00H r5 = r9.A03
            java.lang.Object r0 = r5.get()
            X.72Q r0 = (X.AnonymousClass72Q) r0
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.1Cd r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f5 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = "SELECT status_message_row_id FROM status_crossposting WHERE state = 0"
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/SELECT_PENDING_AUTO_CROSSPOST"
            android.database.Cursor r3 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "status_message_row_id"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ee }
        L_0x0025:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00ee }
            if (r0 == 0) goto L_0x0033
            long r0 = r3.getLong(r2)     // Catch:{ all -> 0x00ee }
            X.C17880vN.A1R(r7, r0)     // Catch:{ all -> 0x00ee }
            goto L_0x0025
        L_0x0033:
            r3.close()     // Catch:{ all -> 0x00f5 }
            r4.close()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = r7.iterator()
        L_0x0041:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0089
            long r3 = X.C17890vO.A07(r7)
            X.00H r0 = r9.A02
            java.lang.Object r0 = r0.get()
            X.6mr r0 = (X.C132466mr) r0
            X.00H r0 = r0.A01
            X.206 r1 = X.AnonymousClass1W2.A02(r0, r3)
            if (r1 == 0) goto L_0x0065
            boolean r0 = X.AnonymousClass25A.A0p(r1)
            if (r0 != 0) goto L_0x0065
            r6.add(r1)
            goto L_0x0041
        L_0x0065:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "XFamilyAutoCrosspostTask/getMessageFromMessageRowIds encountered empty or revoked message: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", skipping and retrying the rest"
            X.C108995ce.A1O(r1, r0)
            java.lang.Object r2 = r5.get()
            X.72Q r2 = (X.AnonymousClass72Q) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.util.List r1 = X.C18070vi.A0M(r0)
            r0 = 4
            r2.A06(r1, r0)
            goto L_0x0041
        L_0x0089:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r6.iterator()
        L_0x0091:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c3
            java.lang.Object r7 = r8.next()
            r6 = r7
            X.206 r6 = (X.AnonymousClass206) r6
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            long r1 = r6.A0H
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            X.11P r0 = r9.A00
            long r3 = X.AnonymousClass11P.A01(r0)
            r0 = 4000(0xfa0, double:1.9763E-320)
            long r3 = r3 - r0
            long r1 = r6.A0H
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0091
            boolean r0 = X.AnonymousClass25A.A0p(r6)
            if (r0 != 0) goto L_0x0091
            r5.add(r7)
            goto L_0x0091
        L_0x00c3:
            boolean r0 = r5.isEmpty()
            r4 = 0
            if (r0 != 0) goto L_0x00ed
            r0 = 30
            java.util.ArrayList r0 = X.C29431cG.A0i(r5, r0, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00d4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r2 = r3.next()
            java.util.List r2 = (java.util.List) r2
            X.00H r0 = r9.A01
            java.lang.Object r1 = r0.get()
            X.73A r1 = (X.AnonymousClass73A) r1
            r0 = 0
            r1.A05(r2, r0)
            goto L_0x00d4
        L_0x00ed:
            return r4
        L_0x00ee:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6LL.A0G(java.lang.Object[]):java.lang.Object");
    }

    public AnonymousClass6LL(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
