package X;

/* renamed from: X.2jX  reason: invalid class name and case insensitive filesystem */
public final class C57722jX {
    public final AnonymousClass1Q2 A00;
    public final C24681Lg A01;
    public final AnonymousClass1Cd A02;
    public final AnonymousClass00H A03;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(X.C29691ci r9) {
        /*
            r8 = this;
            r7 = 0
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r6 = X.AnonymousClass2WN.A01
            X.1Cd r0 = r8.A02     // Catch:{ all -> 0x006f }
            X.1at r3 = r0.get()     // Catch:{ all -> 0x006f }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0068 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0068 }
            java.lang.String[] r4 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0068 }
            java.lang.Long r0 = r9.A09()     // Catch:{ all -> 0x0068 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0068 }
            X.C17880vN.A1V(r4, r7, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "GET_ENFORCED_MESSAGES_FOR_CHAT"
            android.database.Cursor r4 = r5.A0A(r6, r0, r4)     // Catch:{ all -> 0x0068 }
        L_0x0027:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0058
            X.00H r0 = r8.A03     // Catch:{ all -> 0x0061 }
            X.1W6 r1 = X.C17880vN.A0c(r0)     // Catch:{ all -> 0x0061 }
            X.1BI r0 = r9.A08()     // Catch:{ all -> 0x0061 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0061 }
            X.206 r0 = r1.A02(r4, r0)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0044
            r2.add(r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0027
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed to read enforced message for channel for channel: "
            r1.append(r0)     // Catch:{ all -> 0x0061 }
            X.1BI r0 = r9.A08()     // Catch:{ all -> 0x0061 }
            r1.append(r0)     // Catch:{ all -> 0x0061 }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x0027
        L_0x0058:
            X.1Wu r1 = X.C27621Wu.A00     // Catch:{ all -> 0x0061 }
            r4.close()     // Catch:{ all -> 0x0068 }
            r3.close()     // Catch:{ all -> 0x006f }
            goto L_0x0075
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0068 }
            throw r0     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.1IU r1 = new X.1IU
            r1.<init>(r0)
        L_0x0075:
            java.lang.Throwable r1 = X.C30671eK.A00(r1)
            if (r1 == 0) goto L_0x0080
            java.lang.String r0 = "NewsletterMessageEnforcementsStore/failed get enforced messages for channel"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57722jX.A00(X.1ci):java.util.ArrayList");
    }

    public C57722jX(AnonymousClass1Q2 r1, C24681Lg r2, AnonymousClass1Cd r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r4, r2, r3);
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }
}
