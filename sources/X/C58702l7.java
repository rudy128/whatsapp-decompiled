package X;

/* renamed from: X.2l7  reason: invalid class name and case insensitive filesystem */
public final class C58702l7 {
    public final AnonymousClass1PW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass121 A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C218617r A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public final void A01(AnonymousClass206 r4) {
        String str;
        C18070vi.A0d(r4, 0);
        C692136i A002 = AnonymousClass2UX.A00(r4);
        String str2 = null;
        if (A002 != null) {
            str = A002.A04;
        } else {
            str = null;
        }
        C692136i A003 = AnonymousClass2UX.A00(r4);
        if (A003 != null) {
            str2 = A003.A07;
        }
        if (str != null) {
            C64062u9.A0Q(this.A05.A0Q(str));
        }
        if (str2 != null) {
            C64062u9.A0Q(this.A05.A0R(str2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(java.lang.String r7) {
        /*
            r6 = this;
            X.00H r0 = r6.A06
            java.lang.Object r0 = r0.get()
            X.1hM r0 = (X.C32541hM) r0
            r1 = 0
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            X.1Cd r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0060 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0060 }
            java.lang.String r2 = "SELECT message_row_id FROM bot_message_info WHERE target_id= ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r7, r1)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "SQL_GET_BOT_MESSAGE_ROW_ID_BY_TARGET_ID"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0060 }
        L_0x0024:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0059 }
            X.C17900vP.A0K(r2, r5, r0)     // Catch:{ all -> 0x0059 }
            goto L_0x0024
        L_0x0034:
            r2.close()     // Catch:{ all -> 0x0060 }
            r4.close()
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r5.iterator()
        L_0x0042:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0058
            long r1 = X.C17890vO.A07(r3)
            X.00H r0 = r6.A07
            X.206 r0 = X.AnonymousClass1W2.A02(r0, r1)
            if (r0 == 0) goto L_0x0042
            r4.add(r0)
            goto L_0x0042
        L_0x0058:
            return r4
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58702l7.A00(java.lang.String):java.util.ArrayList");
    }

    public C58702l7(C218617r r1, AnonymousClass1PW r2, AnonymousClass1CJ r3, AnonymousClass121 r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r5, r3, r1, r6, r7);
        C18070vi.A0q(r8, r4, r2);
        this.A03 = r5;
        this.A01 = r3;
        this.A05 = r1;
        this.A07 = r6;
        this.A04 = r7;
        this.A06 = r8;
        this.A02 = r4;
        this.A00 = r2;
    }
}
