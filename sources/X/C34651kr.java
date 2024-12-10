package X;

/* renamed from: X.1kr  reason: invalid class name and case insensitive filesystem */
public final class C34651kr {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18600wl A04;
    public final AnonymousClass1OX A05;

    public C34651kr(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, C18600wl r6, AnonymousClass1OX r7) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r6, 6);
        this.A01 = r2;
        this.A00 = r3;
        this.A03 = r4;
        this.A02 = r5;
        this.A05 = r7;
        this.A04 = r6;
    }

    public final String A00(AnonymousClass1ED r2) {
        C18070vi.A0d(r2, 0);
        return ((C33971jg) this.A03.get()).A01(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0107, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010b, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap A01(java.util.List r20) {
        /*
            r19 = this;
            r0 = r19
            X.00H r0 = r0.A01
            java.lang.Object r8 = r0.get()
            X.2cM r8 = (X.C53332cM) r8
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r2 = r20.iterator()
        L_0x0019:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r2.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            java.util.Map r0 = r8.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0039
            r7.put(r1, r0)
            goto L_0x0019
        L_0x0039:
            r4.add(r1)
            goto L_0x0019
        L_0x003d:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x010f
            r0 = 10
            int r0 = X.C29351c6.A0C(r4, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r1.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x0052
        L_0x006a:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r4 = r2.toArray(r0)
            java.lang.String[] r4 = (java.lang.String[]) r4
            X.1Cd r0 = r8.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0108 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0108 }
            int r2 = r4.length     // Catch:{ all -> 0x0108 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0108 }
            r1.<init>()     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "SELECT integrator_id, display_name, status, icon_path, opt_in_status, identifier_type FROM integrator_display_name WHERE integrator_id IN "
            r1.append(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r2)     // Catch:{ all -> 0x0108 }
            r1.append(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "InteropIntegratorStoreGET_INTEGRATOR_INFO"
            android.database.Cursor r5 = r3.A0A(r1, r0, r4)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "integrator_id"
            int r9 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "display_name"
            int r4 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "status"
            int r3 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "icon_path"
            int r2 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "opt_in_status"
            int r1 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "identifier_type"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ all -> 0x0101 }
        L_0x00be:
            boolean r10 = r5.moveToNext()     // Catch:{ all -> 0x0101 }
            if (r10 == 0) goto L_0x00fa
            int r15 = r5.getInt(r9)     // Catch:{ all -> 0x0101 }
            java.lang.String r13 = r5.getString(r4)     // Catch:{ all -> 0x0101 }
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x0101 }
            int r16 = r5.getInt(r3)     // Catch:{ all -> 0x0101 }
            java.lang.String r14 = r5.getString(r2)     // Catch:{ all -> 0x0101 }
            X.C18070vi.A0X(r14)     // Catch:{ all -> 0x0101 }
            int r10 = r5.getInt(r1)     // Catch:{ all -> 0x0101 }
            r18 = 0
            if (r10 <= 0) goto L_0x00e4
            r18 = 1
        L_0x00e4:
            int r17 = r5.getInt(r0)     // Catch:{ all -> 0x0101 }
            X.4ca r12 = new X.4ca     // Catch:{ all -> 0x0101 }
            r12.<init>((java.lang.String) r13, (java.lang.String) r14, (int) r15, (int) r16, (int) r17, (boolean) r18)     // Catch:{ all -> 0x0101 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0101 }
            java.util.Map r10 = r8.A01     // Catch:{ all -> 0x0101 }
            r10.put(r11, r12)     // Catch:{ all -> 0x0101 }
            r7.put(r11, r12)     // Catch:{ all -> 0x0101 }
            goto L_0x00be
        L_0x00fa:
            r5.close()     // Catch:{ all -> 0x0108 }
            r6.close()
            return r7
        L_0x0101:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0108 }
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010a }
        L_0x010a:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x010f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34651kr.A01(java.util.List):java.util.LinkedHashMap");
    }
}
