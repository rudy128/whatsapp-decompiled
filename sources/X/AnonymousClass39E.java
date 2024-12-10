package X;

/* renamed from: X.39E  reason: invalid class name */
public final class AnonymousClass39E implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011e, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0121, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x012f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0130, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0133, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            boolean r0 = r9 instanceof X.AnonymousClass2MS
            if (r0 == 0) goto L_0x001d
            X.00H r0 = r8.A00
            X.1RR r2 = X.C17880vN.A0N(r0)
            X.2MS r9 = (X.AnonymousClass2MS) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            long r0 = r9.A0x
            int r0 = X.AnonymousClass1RR.A00(r2, r0)
            r9.A00 = r0
        L_0x001c:
            return
        L_0x001d:
            boolean r0 = r9 instanceof X.AnonymousClass2MA
            if (r0 == 0) goto L_0x0036
            X.00H r0 = r8.A00
            X.1RR r2 = X.C17880vN.A0N(r0)
            X.2MA r9 = (X.AnonymousClass2MA) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            long r0 = r9.A0x
            int r0 = X.AnonymousClass1RR.A00(r2, r0)
            r9.A00 = r0
            return
        L_0x0036:
            boolean r0 = r9 instanceof X.AnonymousClass2M9
            if (r0 == 0) goto L_0x006d
            X.00H r0 = r8.A00
            X.1RR r4 = X.C17880vN.A0N(r0)
            X.2M9 r9 = (X.AnonymousClass2M9) r9
            r7 = 0
            X.C18070vi.A0d(r9, r7)
            long r0 = r9.A0x
            int r0 = X.AnonymousClass1RR.A00(r4, r0)
            r9.A00 = r0
            X.0vl r0 = r4.A0B
            java.lang.Object r2 = r0.getValue()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 5309(0x14bd, float:7.44E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00de
            X.0vl r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r4 = r0.get()
            goto L_0x0086
        L_0x006d:
            boolean r0 = r9 instanceof X.AnonymousClass2MR
            if (r0 == 0) goto L_0x001c
            X.00H r0 = r8.A00
            X.1RR r2 = X.C17880vN.A0N(r0)
            X.2MR r9 = (X.AnonymousClass2MR) r9
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            long r0 = r9.A0x
            int r0 = X.AnonymousClass1RR.A00(r2, r0)
            r9.A00 = r0
            return
        L_0x0086:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012d }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x012d }
            java.lang.String r3 = "SELECT setting_reason, ephemeral_trigger, ephemeral_initiated_by_me FROM message_ephemeral_setting WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x012d }
            long r0 = r9.A0x     // Catch:{ all -> 0x012d }
            X.C17880vN.A1U(r2, r7, r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_INFO"
            android.database.Cursor r5 = r5.A0A(r3, r0, r2)     // Catch:{ all -> 0x012d }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "setting_reason"
            int r3 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "ephemeral_trigger"
            int r2 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "ephemeral_initiated_by_me"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00da }
            int r0 = r5.getInt(r3)     // Catch:{ all -> 0x00da }
            r9.A00 = r0     // Catch:{ all -> 0x00da }
            int r0 = r5.getInt(r2)     // Catch:{ all -> 0x00da }
            r9.A04 = r0     // Catch:{ all -> 0x00da }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d3
            int r0 = r5.getInt(r1)     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00cd
            r6 = 0
        L_0x00cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00da }
            r9.A0Q = r0     // Catch:{ all -> 0x00da }
        L_0x00d3:
            r5.close()     // Catch:{ all -> 0x012d }
            r4.close()
            return
        L_0x00da:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            r1 = move-exception
            goto L_0x011e
        L_0x00de:
            long r2 = r9.A0x
            X.0vl r0 = r4.A0J
            java.lang.Object r0 = r0.getValue()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012d }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x012d }
            java.lang.String r5 = "SELECT setting_reason FROM message_ephemeral_setting WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x012d }
            X.C17880vN.A1U(r1, r7, r2)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_DURATION"
            android.database.Cursor r2 = r6.A0A(r5, r0, r1)     // Catch:{ all -> 0x012d }
            if (r2 == 0) goto L_0x0122
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = "setting_reason"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0117 }
            r2.close()     // Catch:{ all -> 0x012d }
            goto L_0x0127
        L_0x0113:
            r2.close()     // Catch:{ all -> 0x012d }
            goto L_0x0122
        L_0x0117:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ all -> 0x012d }
            goto L_0x0121
        L_0x011e:
            X.CDX.A00(r5, r0)     // Catch:{ all -> 0x012d }
        L_0x0121:
            throw r1     // Catch:{ all -> 0x012d }
        L_0x0122:
            r4.close()
            r0 = 0
            goto L_0x012a
        L_0x0127:
            r4.close()
        L_0x012a:
            r9.A00 = r0
            return
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39E.BL9(X.206):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.2MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.2MS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.2MA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.2MA} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdY(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            r3 = 0
            X.C18070vi.A0d(r9, r3)
            X.00H r0 = r8.A01
            java.lang.Object r1 = r0.get()
            X.1N2 r1 = (X.AnonymousClass1N2) r1
            r0 = r9
            X.20i r0 = (X.C436420i) r0
            r1.A02(r0)
            boolean r0 = r9 instanceof X.AnonymousClass2MS
            if (r0 == 0) goto L_0x002a
            X.00H r0 = r8.A00
            X.1RR r0 = X.C17880vN.A0N(r0)
            long r5 = r9.A0x
            X.2MS r9 = (X.AnonymousClass2MS) r9
            int r2 = r9.A00
        L_0x0022:
            int r4 = r9.A04
            java.lang.Boolean r1 = r9.A0Q
        L_0x0026:
            r0.A06(r1, r2, r3, r4, r5)
        L_0x0029:
            return
        L_0x002a:
            boolean r0 = r9 instanceof X.AnonymousClass2MA
            if (r0 == 0) goto L_0x003b
            X.00H r0 = r8.A00
            X.1RR r0 = X.C17880vN.A0N(r0)
            long r5 = r9.A0x
            X.2MA r9 = (X.AnonymousClass2MA) r9
            int r2 = r9.A00
            goto L_0x0022
        L_0x003b:
            boolean r0 = r9 instanceof X.AnonymousClass2M9
            if (r0 == 0) goto L_0x0056
            X.00H r0 = r8.A00
            X.1RR r1 = X.C17880vN.A0N(r0)
            long r6 = r9.A0x
            r0 = r9
            X.2M9 r0 = (X.AnonymousClass2M9) r0
            int r3 = r0.A00
            int r4 = r9.A00
            int r5 = r0.A04
            java.lang.Boolean r2 = r0.A0Q
            r1.A06(r2, r3, r4, r5, r6)
            return
        L_0x0056:
            boolean r0 = r9 instanceof X.AnonymousClass2MR
            if (r0 == 0) goto L_0x0029
            X.00H r0 = r8.A00
            X.1RR r0 = X.C17880vN.A0N(r0)
            long r5 = r9.A0x
            X.2MR r9 = (X.AnonymousClass2MR) r9
            int r2 = r9.A00
            r1 = 0
            r4 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass39E.BdY(X.206):void");
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((AnonymousClass1N2) this.A01.get()).A02((C436420i) r2);
    }

    public AnonymousClass39E(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
