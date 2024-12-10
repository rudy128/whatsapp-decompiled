package X;

/* renamed from: X.1M5  reason: invalid class name */
public final class AnonymousClass1M5 implements AnonymousClass1M4 {
    public final AnonymousClass1DL A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public AnonymousClass1M5(AnonymousClass1DL r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String BMm(X.AnonymousClass1E1 r12) {
        /*
            r11 = this;
            r8 = 0
            X.C18070vi.A0d(r12, r8)
            X.1DL r0 = r11.A00
            long r9 = r0.A09(r12)
            X.00H r0 = r11.A01
            java.lang.Object r6 = r0.get()
            X.2pY r6 = (X.C61362pY) r6
            r7 = 0
            r3 = 0
            X.1Cd r0 = r6.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ac }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "\n            SELECT display_name, username\n            FROM lid_display_name\n            WHERE lid_row_id = ?\n            "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00ac }
            r1[r8] = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "LidDisplayNameStore/GET_DISPLAY_NAME"
            android.database.Cursor r4 = r4.A0A(r2, r0, r1)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "username"
            int r2 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "display_name"
            int r1 = r4.getColumnIndex(r0)     // Catch:{ all -> 0x00a5 }
            if (r1 < 0) goto L_0x005e
            if (r2 < 0) goto L_0x005e
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r3 = r4.getString(r2)     // Catch:{ all -> 0x00a5 }
            if (r3 == 0) goto L_0x0055
            int r0 = r3.length()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x0056
            r3 = 0
            goto L_0x0056
        L_0x0055:
            r3 = r7
        L_0x0056:
            java.lang.String r7 = r4.getString(r1)     // Catch:{ all -> 0x00a5 }
            r4.close()     // Catch:{ all -> 0x00ac }
            goto L_0x0066
        L_0x005e:
            r4.close()     // Catch:{ all -> 0x00ac }
            r5.close()
            r0 = 0
            goto L_0x006a
        L_0x0066:
            r5.close()
            r0 = 1
        L_0x006a:
            if (r0 == 0) goto L_0x00a3
            X.0ve r2 = r6.A01
            r1 = 4746(0x128a, float:6.65E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 1
            if (r0 != r2) goto L_0x00a0
            if (r3 == 0) goto L_0x00a1
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            r0 = r0 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x0085:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00a0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 64
            r1.append(r0)
            r1.append(r3)
            java.lang.String r7 = r1.toString()
        L_0x00a0:
            return r7
        L_0x00a1:
            r1 = 0
            goto L_0x0085
        L_0x00a3:
            r7 = 0
            return r7
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M5.BMm(X.1E1):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String BMn(X.AnonymousClass1E1 r10) {
        /*
            r9 = this;
            r6 = 0
            X.C18070vi.A0d(r10, r6)
            X.1DL r0 = r9.A00
            long r7 = r0.A09(r10)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0080
            X.00H r0 = r9.A01
            java.lang.Object r0 = r0.get()
            X.2pY r0 = (X.C61362pY) r0
            r5 = 0
            X.1Cd r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0079 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0079 }
            java.lang.String r2 = "\n            SELECT display_name, username\n            FROM lid_display_name\n            WHERE lid_row_id = ?\n            "
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0079 }
            r1[r6] = r0     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "LidDisplayNameStore/GET_DISPLAY_NAME"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0079 }
            java.lang.String r0 = "username"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0072 }
            java.lang.String r0 = "display_name"
            int r2 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0072 }
            if (r2 < 0) goto L_0x0063
            if (r1 < 0) goto L_0x0063
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0063
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x0072 }
            if (r1 == 0) goto L_0x005a
            int r0 = r1.length()     // Catch:{ all -> 0x0072 }
            if (r0 != 0) goto L_0x005b
            r1 = 0
            goto L_0x005b
        L_0x005a:
            r1 = r5
        L_0x005b:
            r3.getString(r2)     // Catch:{ all -> 0x0072 }
            r5 = r1
            r3.close()     // Catch:{ all -> 0x0079 }
            goto L_0x006b
        L_0x0063:
            r3.close()     // Catch:{ all -> 0x0079 }
            r4.close()
            r0 = 0
            goto L_0x006f
        L_0x006b:
            r4.close()
            r0 = 1
        L_0x006f:
            if (r0 == 0) goto L_0x0080
            return r5
        L_0x0072:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0080:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M5.BMn(X.1E1):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bdb(X.AnonymousClass1E1 r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.1DL r0 = r5.A00
            long r0 = r0.A09(r6)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0026
            X.00H r2 = r5.A01
            java.lang.Object r2 = r2.get()
            X.2pY r2 = (X.C61362pY) r2
            X.1Cd r3 = r2.A00
            r3.A06()
            boolean r2 = r3.A08
            if (r2 != 0) goto L_0x0028
            java.lang.String r0 = "AliasedDisplayNameStore/upsertDisplayNameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0026:
            r0 = 0
            return r0
        L_0x0028:
            X.1au r3 = r3.A05()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x0045 }
            X.C61362pY.A00(r3, r7, r0)     // Catch:{ all -> 0x003e }
            r2.A00()     // Catch:{ all -> 0x003e }
            r2.close()     // Catch:{ all -> 0x0045 }
            r3.close()
            r0 = 1
            return r0
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M5.Bdb(X.1E1, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bdc(X.AnonymousClass1E1 r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = 0
            r5 = r18
            X.C18070vi.A0d(r5, r0)
            r7 = r17
            java.lang.String r3 = r7.BMn(r5)
            if (r3 != 0) goto L_0x0010
            java.lang.String r3 = ""
        L_0x0010:
            r4 = r19
            boolean r0 = X.C18070vi.A18(r4, r3)
            if (r0 != 0) goto L_0x003b
            X.1DL r0 = r7.A00
            long r9 = r0.A09(r5)
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            X.00H r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.2pY r0 = (X.C61362pY) r0
            r8 = 1
            X.1Cd r1 = r0.A00
            r1.A06()
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "AliasedDisplayNameStore/upsertUsernameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003b:
            r2 = 0
            return r2
        L_0x003d:
            X.1au r2 = r1.A05()
            X.1xA r6 = r2.BD0()     // Catch:{ all -> 0x00a7 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x00a0 }
            r12.<init>()     // Catch:{ all -> 0x00a0 }
            java.lang.String r1 = "lid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x00a0 }
            r12.put(r1, r0)     // Catch:{ all -> 0x00a0 }
            java.lang.String r0 = "username"
            r12.put(r0, r4)     // Catch:{ all -> 0x00a0 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a0 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x00a0 }
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x00a0 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00a0 }
            r8[r1] = r0     // Catch:{ all -> 0x00a0 }
            java.lang.String r15 = "LidDisplayNameStore/INSERT_USERNAME"
            java.lang.String r13 = "lid_display_name"
            java.lang.String r14 = "lid_row_id = ?"
            r16 = r8
            int r0 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00a0 }
            long r0 = (long) r0     // Catch:{ all -> 0x00a0 }
            r9 = 0
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0085
            java.lang.String r1 = "display_name"
            java.lang.String r0 = ""
            r12.put(r1, r0)     // Catch:{ all -> 0x00a0 }
            r0 = 5
            r11.A09(r13, r15, r12, r0)     // Catch:{ all -> 0x00a0 }
        L_0x0085:
            r6.A00()     // Catch:{ all -> 0x00a0 }
            r6.close()     // Catch:{ all -> 0x00a7 }
            r2.close()
            r2 = 1
            X.00H r0 = r7.A02
            java.lang.Object r1 = r0.get()
            X.10T r1 = (X.AnonymousClass10T) r1
            X.35Q r0 = new X.35Q
            r0.<init>(r3, r5, r4)
            r1.notifyAllObservers(r0)
            return r2
        L_0x00a0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M5.Bdc(X.1E1, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cf, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List Bda(java.util.Map r9) {
        /*
            r8 = this;
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x000d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            X.1DL r1 = r8.A00
            java.lang.Object r0 = r3.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            long r0 = r1.A09(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object r1 = r3.getValue()
            X.1D6 r0 = new X.1D6
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x000d
        L_0x0036:
            java.util.Map r7 = X.AnonymousClass1D7.A0D(r5)
            X.00H r0 = r8.A01
            java.lang.Object r0 = r0.get()
            X.2pY r0 = (X.C61362pY) r0
            X.1Cd r1 = r0.A00
            r1.A06()
            boolean r0 = r1.A08
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "AliasedDisplayNameStore/upsertDisplayNameForLid db not ready"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0wS r0 = X.C18460wS.A00
        L_0x0052:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x005b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            X.1DL r0 = r8.A00
            com.whatsapp.jid.Jid r1 = r0.A0B(r1)
            boolean r0 = r1 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            r4.add(r1)
            goto L_0x005b
        L_0x007b:
            r7.size()
            X.1au r6 = r1.A05()
            X.1xA r5 = r6.BD0()     // Catch:{ all -> 0x00cc }
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x00c5 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00c5 }
        L_0x008e:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x00c5 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x00c5 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x00c5 }
            long r1 = r0.longValue()     // Catch:{ all -> 0x00c5 }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x00c5 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00c5 }
            X.C61362pY.A00(r6, r0, r1)     // Catch:{ all -> 0x00c5 }
            goto L_0x008e
        L_0x00ae:
            r5.A00()     // Catch:{ all -> 0x00c5 }
            r5.close()     // Catch:{ all -> 0x00cc }
            r6.close()
            java.util.Set r0 = r7.keySet()
            java.util.List r0 = X.C29431cG.A0t(r0)
            goto L_0x0052
        L_0x00c0:
            java.util.List r0 = X.C29431cG.A0t(r4)
            return r0
        L_0x00c5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00cc }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1M5.Bda(java.util.Map):java.util.List");
    }
}
