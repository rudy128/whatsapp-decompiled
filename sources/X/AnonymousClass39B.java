package X;

/* renamed from: X.39B  reason: invalid class name */
public final class AnonymousClass39B implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, X.2S8] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d1, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        X.CDX.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00dd, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e0, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c8=Splitter:B:34:0x00c8, B:20:0x00af=Splitter:B:20:0x00af} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r7 = 0
            X.C18070vi.A0d(r10, r7)
            X.00H r0 = r9.A00
            java.lang.Object r6 = r0.get()
            X.2bv r6 = (X.C53062bv) r6
            X.249 r10 = (X.AnonymousClass249) r10
            X.C18070vi.A0d(r10, r7)
            X.1Cd r0 = r6.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00da }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "SELECT bcall_session_row_id FROM message_bcall_session WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass206.A09(r10)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "MessageBCallSessionStore/getSessionRowId"
            android.database.Cursor r5 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x00da }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r0 = "bcall_session_row_id"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cf }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x00cf }
            if (r0 != 0) goto L_0x00c3
            long r2 = r5.getLong(r1)     // Catch:{ all -> 0x00cf }
            r5.close()     // Catch:{ all -> 0x00da }
            r4.close()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ce
            X.00H r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.2Zh r0 = (X.C51702Zh) r0
            X.1Cd r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00da }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00da }
            java.lang.String r5 = "SELECT * FROM bcall_session WHERE _id = ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00da }
            X.C17880vN.A1V(r1, r7, r2)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "BCallSessionStore/getSessionByRowId"
            android.database.Cursor r6 = r6.A0A(r5, r0, r1)     // Catch:{ all -> 0x00da }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00bf }
            r8 = 0
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = "session_id"
            java.lang.String r7 = X.C17890vO.A0S(r6, r0)     // Catch:{ all -> 0x00bf }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "media_type"
            int r5 = X.C17890vO.A01(r6, r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "master_key"
            byte[] r3 = X.C17890vO.A1X(r6, r0)     // Catch:{ all -> 0x00bf }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "caption"
            java.lang.String r2 = X.C17890vO.A0S(r6, r0)     // Catch:{ all -> 0x00bf }
            java.lang.String r0 = "_id"
            long r0 = X.C17890vO.A06(r6, r0)     // Catch:{ all -> 0x00bf }
            X.2S8 r8 = new X.2S8     // Catch:{ all -> 0x00bf }
            r8.<init>()     // Catch:{ all -> 0x00bf }
            r8.A03 = r7     // Catch:{ all -> 0x00bf }
            r8.A00 = r5     // Catch:{ all -> 0x00bf }
            r8.A02 = r2     // Catch:{ all -> 0x00bf }
            r8.A01 = r0     // Catch:{ all -> 0x00bf }
            int r0 = r3.length     // Catch:{ all -> 0x00bf }
            byte[] r0 = java.util.Arrays.copyOf(r3, r0)     // Catch:{ all -> 0x00bf }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00bf }
            r8.A04 = r0     // Catch:{ all -> 0x00bf }
        L_0x00af:
            r6.close()     // Catch:{ all -> 0x00da }
            r4.close()
            if (r8 != 0) goto L_0x00bc
            java.lang.String r0 = "MessageBCallSessionStore/fillMessage cannot load session"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00bc:
            r10.A00 = r8
            return
        L_0x00bf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            goto L_0x00d6
        L_0x00c3:
            java.lang.String r0 = "MessageBCallSessionStore/getSessionRowId bcall_session_row_id is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00cf }
        L_0x00c8:
            r5.close()     // Catch:{ all -> 0x00da }
            r4.close()
        L_0x00ce:
            return
        L_0x00cf:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r1 = move-exception
            X.CDX.A00(r5, r0)     // Catch:{ all -> 0x00da }
            goto L_0x00d9
        L_0x00d6:
            X.CDX.A00(r6, r0)     // Catch:{ all -> 0x00da }
        L_0x00d9:
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39B.BL9(X.206):void");
    }

    public void CQL(AnonymousClass206 r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0134, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0135, code lost:
        X.CDX.A00(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0138, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdY(X.AnonymousClass206 r19) {
        /*
            r18 = this;
            r5 = r19
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            java.lang.Class<X.249> r1 = X.AnonymousClass249.class
            boolean r0 = r5 instanceof X.AnonymousClass249
            if (r0 != 0) goto L_0x0023
            java.lang.String r3 = X.C17890vO.A0U(r5)
            java.lang.String r2 = r1.getName()
            java.lang.String r0 = ""
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = X.C17890vO.A0W(r1)
            java.lang.IllegalArgumentException r1 = X.AnonymousClass206.A02(r5, r2, r3, r0, r1)
            throw r1
        L_0x0023:
            X.249 r5 = (X.AnonymousClass249) r5
            X.2S8 r7 = r5.A00
            if (r7 != 0) goto L_0x002f
            java.lang.String r0 = "FMessageBCallDatabase/insert no session"
        L_0x002b:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x002f:
            long r1 = r7.A01
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            r6 = r18
            if (r0 > 0) goto L_0x00c1
            X.00H r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.2Zh r0 = (X.C51702Zh) r0
            r8 = 0
            X.1Cd r0 = r0.A00
            X.1au r4 = r0.A05()
            android.content.ContentValues r12 = X.C17880vN.A08()     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = "session_id"
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x0132 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0132 }
            int r0 = r7.A00     // Catch:{ all -> 0x0132 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "media_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = "master_key"
            byte[] r0 = r7.A04     // Catch:{ all -> 0x0132 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = "caption"
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x0132 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0132 }
            long r0 = r7.A01     // Catch:{ all -> 0x0132 }
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a0
            r2 = r4
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x0132 }
            X.1Ev r11 = r2.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r13 = "bcall_session"
            java.lang.String r14 = "_id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x0132 }
            X.C17880vN.A1V(r2, r8, r0)     // Catch:{ all -> 0x0132 }
            java.lang.String r15 = "BCallSessionStore/updateSession"
            r17 = 4
            r16 = r2
            int r2 = r11.A03(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0132 }
            if (r2 == r3) goto L_0x00be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "BCallSessionStore/updateSession affects "
            r1.append(r0)     // Catch:{ all -> 0x0132 }
            r1.append(r2)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = " rows, supposed to be only one row"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0132 }
            goto L_0x00be
        L_0x00a0:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0132 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "bcall_session"
            java.lang.String r1 = "BCallSessionStore/insertSession"
            r0 = 5
            long r2 = r3.A09(r2, r1, r12, r0)     // Catch:{ all -> 0x0132 }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b5
            r7.A01 = r2     // Catch:{ all -> 0x0132 }
            goto L_0x00be
        L_0x00b5:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "BCallSessionStore/insertSession failed, return="
            X.C17900vP.A0l(r0, r1, r2)     // Catch:{ all -> 0x0132 }
        L_0x00be:
            r4.close()
        L_0x00c1:
            X.00H r0 = r6.A00
            java.lang.Object r6 = r0.get()
            X.2bv r6 = (X.C53062bv) r6
            r4 = 0
            long r1 = r5.A0x
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00e1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageBCallSessionStore/insertSession bad message rowId="
            X.AnonymousClass206.A06(r5, r0, r1)
            java.lang.String r0 = r1.toString()
        L_0x00dd:
            X.C17960vV.A0F(r4, r0)
            return
        L_0x00e1:
            X.2S8 r1 = r5.A00
            if (r1 != 0) goto L_0x00e9
            java.lang.String r0 = "MessageBCallSessionStore/insertSession session is null"
            goto L_0x002b
        L_0x00e9:
            long r2 = r1.A01
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageBCallSessionStore/insertSession bad session rowId="
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)
            goto L_0x00dd
        L_0x00fa:
            X.1Cd r0 = r6.A00
            X.1au r4 = r0.A05()
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x0132 }
            X.AnonymousClass206.A04(r6, r5)     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "bcall_session_row_id"
            long r0 = r1.A01     // Catch:{ all -> 0x0132 }
            X.C17880vN.A19(r6, r2, r0)     // Catch:{ all -> 0x0132 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0132 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0132 }
            java.lang.String r2 = "message_bcall_session"
            java.lang.String r1 = "MessageBCallSessionStore/insertSession"
            r0 = 4
            long r2 = r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x0132 }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x012e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "MessageBCallSessionStore/insertSession/insert error, message_row_id="
            X.AnonymousClass206.A06(r5, r0, r1)     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = ", return="
            X.C17900vP.A0l(r0, r1, r2)     // Catch:{ all -> 0x0132 }
        L_0x012e:
            r4.close()
            return
        L_0x0132:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            X.CDX.A00(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39B.BdY(X.206):void");
    }

    public AnonymousClass39B(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
