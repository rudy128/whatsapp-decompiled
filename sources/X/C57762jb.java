package X;

/* renamed from: X.2jb  reason: invalid class name and case insensitive filesystem */
public abstract class C57762jb {
    public final int A00;
    public final C192059nj A01;
    public final C196139uW A02;
    public final String A03;
    public final String A04;

    public C57762jb(C192059nj r1, C196139uW r2, String str, String str2, int i) {
        this.A04 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = r1;
        this.A02 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01b0 A[Catch:{ all -> 0x0200, all -> 0x0219 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A00(android.os.CancellationSignal r26) {
        /*
            r25 = this;
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            r22 = 1
            r6 = -1
            r21 = 1
        L_0x000a:
            boolean r0 = r26.isCanceled()
            if (r0 == 0) goto L_0x0015
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L_0x0015:
            r0 = r25
            boolean r1 = r0 instanceof X.AnonymousClass2C3
            if (r1 == 0) goto L_0x006d
            r3 = r0
            X.2C3 r3 = (X.AnonymousClass2C3) r3
            X.2ZV r2 = r3.A02
            X.2tR r4 = r2.A00
            java.lang.String r5 = r3.A05
            long r8 = r3.A00
            int r2 = r3.A00
            long r10 = (long) r2
            X.2bo r5 = r4.A06(r5, r6, r8, r10)
        L_0x002d:
            java.util.List r4 = r5.A01
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0243
            int r2 = r4.size()
            int r3 = r0.A00
            r8 = 0
            if (r2 <= r3) goto L_0x0055
            java.util.List r4 = r4.subList(r8, r3)
            int r2 = r4.size()
            int r2 = r2 - r22
            java.lang.Object r2 = r4.get(r2)
            long r6 = X.C17880vN.A05(r2)
            X.2bo r5 = new X.2bo
            r5.<init>(r4, r6)
        L_0x0055:
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r6 = r0.A03
            r2 = r22
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r2 = r21
            X.C17880vN.A1T(r4, r2, r8)
            java.lang.String r4 = java.lang.String.format(r7, r6, r4)
            X.9nj r2 = r0.A01
            java.io.File r20 = r2.A00(r4)
            goto L_0x00a7
        L_0x006d:
            boolean r2 = r0 instanceof X.AnonymousClass2C2
            if (r2 == 0) goto L_0x0084
            r3 = r0
            X.2C2 r3 = (X.AnonymousClass2C2) r3
            X.2ZV r2 = r3.A01
            X.2tR r4 = r2.A00
            java.lang.String r5 = r3.A02
            long r8 = r3.A00
            int r2 = r3.A00
            long r10 = (long) r2
            X.2bo r5 = r4.A05(r5, r6, r8, r10)
            goto L_0x002d
        L_0x0084:
            r3 = r0
            X.2C1 r3 = (X.AnonymousClass2C1) r3
            X.2eY r2 = r3.A01
            X.2tR r4 = r2.A00
            long r8 = r3.A00
            int r2 = r3.A00
            long r10 = (long) r2
            java.lang.String r5 = "message"
            X.2bo r5 = r4.A05(r5, r6, r8, r10)
            X.2go r2 = r3.A02
            X.2fz r4 = r2.A02
            long r6 = r4.A01
            java.util.List r2 = r5.A01
            int r2 = r2.size()
            long r2 = (long) r2
            long r6 = r6 + r2
            r4.A01 = r6
            goto L_0x002d
        L_0x00a7:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ JSONException -> 0x022d }
            r2 = r20
            r6.<init>(r2)     // Catch:{ JSONException -> 0x022d }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0223 }
            r7.<init>(r6)     // Catch:{ all -> 0x0223 }
            java.util.List r2 = r5.A01     // Catch:{ all -> 0x0219 }
            r24 = r2
            if (r1 == 0) goto L_0x0194
            r10 = r0
            X.2C3 r10 = (X.AnonymousClass2C3) r10     // Catch:{ all -> 0x0219 }
            java.util.ArrayList r9 = X.AnonymousClass000.A14(r24)     // Catch:{ all -> 0x0219 }
            android.os.CancellationSignal r2 = r10.A01     // Catch:{ all -> 0x0219 }
            int r1 = r24.size()     // Catch:{ all -> 0x0219 }
            if (r1 <= 0) goto L_0x0187
            boolean r1 = r2.isCanceled()     // Catch:{ all -> 0x0219 }
            if (r1 != 0) goto L_0x0187
            r2 = 0
        L_0x00cf:
            int r1 = r24.size()     // Catch:{ all -> 0x0219 }
            if (r2 >= r1) goto L_0x0187
            int r11 = r24.size()     // Catch:{ all -> 0x0219 }
            int r1 = r2 + 100
            int r11 = java.lang.Math.min(r11, r1)     // Catch:{ all -> 0x0219 }
            r1 = r24
            java.util.List r19 = r1.subList(r2, r11)     // Catch:{ all -> 0x0219 }
            X.2ZV r1 = r10.A02     // Catch:{ all -> 0x0219 }
            X.2tR r1 = r1.A00     // Catch:{ all -> 0x0219 }
            r17 = r1
            java.lang.String r15 = r10.A05     // Catch:{ all -> 0x0219 }
            java.lang.String r12 = r10.A04     // Catch:{ all -> 0x0219 }
            java.util.ArrayList r11 = X.AnonymousClass000.A14(r19)     // Catch:{ all -> 0x0219 }
            boolean r1 = r19.isEmpty()     // Catch:{ all -> 0x0219 }
            if (r1 != 0) goto L_0x017d
            int r14 = r19.size()     // Catch:{ all -> 0x0219 }
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = "SELECT rowid, * FROM "
            r13.append(r1)     // Catch:{ all -> 0x0219 }
            X.C17890vO.A18(r13, r15)     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = "(rowid IN "
            r13.append(r1)     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = X.AnonymousClass1H2.A00(r14)     // Catch:{ all -> 0x0219 }
            r13.append(r1)     // Catch:{ all -> 0x0219 }
            java.lang.String r1 = ")"
            java.lang.String r18 = X.AnonymousClass000.A0y(r1, r13)     // Catch:{ all -> 0x0219 }
            int r1 = r19.size()     // Catch:{ all -> 0x0219 }
            java.lang.String[] r14 = new java.lang.String[r1]     // Catch:{ all -> 0x0219 }
            java.util.Iterator r16 = r19.iterator()     // Catch:{ all -> 0x0219 }
            r15 = 0
        L_0x0126:
            boolean r1 = r16.hasNext()     // Catch:{ all -> 0x0219 }
            if (r1 == 0) goto L_0x013a
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x0219 }
            int r13 = r15 + 1
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0219 }
            r14[r15] = r1     // Catch:{ all -> 0x0219 }
            r15 = r13
            goto L_0x0126
        L_0x013a:
            r1 = r17
            X.1Cd r1 = r1.A00     // Catch:{ all -> 0x0219 }
            X.1at r17 = r1.get()     // Catch:{ all -> 0x0219 }
            r1 = r17
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x01fb }
            X.1Ev r15 = r1.A02     // Catch:{ all -> 0x01fb }
            java.lang.String r13 = "BackupChangesStore/INCREMENTAL_BACKUP_QUERY_ROWS"
            r1 = r18
            android.database.Cursor r13 = r15.A0A(r1, r13, r14)     // Catch:{ all -> 0x01fb }
            java.lang.String[] r16 = r13.getColumnNames()     // Catch:{ all -> 0x01ef }
            int r14 = r13.getColumnIndex(r12)     // Catch:{ all -> 0x01ef }
        L_0x0158:
            boolean r1 = r13.moveToNext()     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x0177
            r1 = r16
            java.util.HashMap r15 = X.C63632tR.A01(r13, r1)     // Catch:{ all -> 0x01ef }
            boolean r1 = r15.isEmpty()     // Catch:{ all -> 0x01ef }
            if (r1 != 0) goto L_0x0158
            if (r14 < 0) goto L_0x0173
            java.lang.Long r1 = X.C17890vO.A0M(r13, r14)     // Catch:{ all -> 0x01ef }
            r15.put(r12, r1)     // Catch:{ all -> 0x01ef }
        L_0x0173:
            r11.add(r15)     // Catch:{ all -> 0x01ef }
            goto L_0x0158
        L_0x0177:
            r13.close()     // Catch:{ all -> 0x01fb }
            r17.close()     // Catch:{ all -> 0x0219 }
        L_0x017d:
            r9.addAll(r11)     // Catch:{ all -> 0x0219 }
            int r1 = r19.size()     // Catch:{ all -> 0x0219 }
            int r2 = r2 + r1
            goto L_0x00cf
        L_0x0187:
            int r1 = r9.size()     // Catch:{ all -> 0x0219 }
            if (r1 == 0) goto L_0x01ad
            X.2kM r1 = r10.A03     // Catch:{ all -> 0x0219 }
            org.json.JSONObject r2 = r1.A01(r9)     // Catch:{ all -> 0x0219 }
            goto L_0x01ae
        L_0x0194:
            boolean r1 = r0 instanceof X.AnonymousClass2C2     // Catch:{ all -> 0x0219 }
            if (r1 == 0) goto L_0x019f
            int r1 = r24.size()     // Catch:{ all -> 0x0219 }
            if (r1 != 0) goto L_0x019f
            goto L_0x01ad
        L_0x019f:
            java.lang.String r1 = "deleted_ids"
            X.2By r2 = new X.2By     // Catch:{ all -> 0x0219 }
            r2.<init>(r1)     // Catch:{ all -> 0x0219 }
            r1 = r24
            org.json.JSONObject r2 = r2.A01(r1)     // Catch:{ all -> 0x0219 }
            goto L_0x01ae
        L_0x01ad:
            r2 = 0
        L_0x01ae:
            if (r2 == 0) goto L_0x01b9
            r1 = 4
            java.lang.String r1 = r2.toString(r1)     // Catch:{ all -> 0x0219 }
            r7.write(r1)     // Catch:{ all -> 0x0219 }
            r8 = 1
        L_0x01b9:
            r7.close()     // Catch:{ all -> 0x0223 }
            r6.close()     // Catch:{ JSONException -> 0x022d }
            if (r8 == 0) goto L_0x01e5
            X.9uW r6 = r0.A02
            r1 = r22
            X.C18070vi.A0d(r4, r1)
            r2 = r1
            r1 = r20
            long r8 = r6.A02(r1, r4, r2)
            r6 = 0
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0205
            r0 = r23
            r0.add(r4)
            int r21 = r21 + 1
        L_0x01dc:
            long r6 = r5.A00
            int r0 = r24.size()
            if (r0 >= r3) goto L_0x000a
            return r23
        L_0x01e5:
            boolean r0 = r20.exists()
            if (r0 == 0) goto L_0x01dc
            r20.delete()
            goto L_0x01dc
        L_0x01ef:
            r2 = move-exception
            if (r13 == 0) goto L_0x01fa
            r13.close()     // Catch:{ all -> 0x01f6 }
            goto L_0x01fa
        L_0x01f6:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x01fb }
        L_0x01fa:
            throw r2     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r2 = move-exception
            r17.close()     // Catch:{ all -> 0x0200 }
            goto L_0x0204
        L_0x0200:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x0219 }
        L_0x0204:
            throw r2     // Catch:{ all -> 0x0219 }
        L_0x0205:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r0.A04
            r1.append(r0)
            java.lang.String r0 = "Failed to export required file with IDs."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0219:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x021e }
            goto L_0x0222
        L_0x021e:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x0223 }
        L_0x0222:
            throw r2     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x0228 }
            goto L_0x022c
        L_0x0228:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ JSONException -> 0x022d }
        L_0x022c:
            throw r2     // Catch:{ JSONException -> 0x022d }
        L_0x022d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r0.A04
            r1.append(r0)
            java.lang.String r0 = "Failed to write deleted message IDs to JSON"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0243:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57762jb.A00(android.os.CancellationSignal):java.util.List");
    }
}
