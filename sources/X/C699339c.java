package X;

/* renamed from: X.39c  reason: invalid class name and case insensitive filesystem */
public final class C699339c implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r9, X.C49702Rn r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r0 = 4096(0x1000, double:2.0237E-320)
            boolean r0 = r9.A11(r0)
            java.lang.Class<X.39c> r7 = X.C699339c.class
            if (r0 == 0) goto L_0x0077
            X.00H r0 = r8.A01
            java.lang.Object r1 = r0.get()
            X.2j9 r1 = (X.C57482j9) r1
            X.00H r0 = r8.A00
            java.lang.Object r3 = r0.get()
            X.1M9 r3 = (X.AnonymousClass1M9) r3
            X.1ya r6 = r9.A0O
            if (r6 != 0) goto L_0x0027
            X.1ya r6 = new X.1ya
            r6.<init>()
        L_0x0027:
            X.1Cd r0 = r1.A02
            X.1au r5 = r0.A05()
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x00df }
            X.AnonymousClass206.A04(r4, r9)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "host_storage"
            int r0 = r6.hostStorage     // Catch:{ all -> 0x00df }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "actual_actors"
            int r0 = r6.actualActors     // Catch:{ all -> 0x00df }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "privacy_mode_ts"
            long r0 = r6.privacyModeTs     // Catch:{ all -> 0x00df }
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00df }
            int r1 = r9.A0D     // Catch:{ all -> 0x00df }
            r0 = 3
            if (r1 != r0) goto L_0x0069
            boolean r0 = r9.A0r     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0069
            com.whatsapp.jid.UserJid r0 = r9.A0I()     // Catch:{ all -> 0x00df }
            X.1E7 r0 = r3.A0E(r0)     // Catch:{ all -> 0x00df }
            if (r0 == 0) goto L_0x0069
            java.lang.String r1 = r0.A0L()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "business_name"
            r4.put(r0, r1)     // Catch:{ all -> 0x00df }
            r9.A0Z = r1     // Catch:{ all -> 0x00df }
        L_0x0069:
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00df }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "message_privacy_state"
            java.lang.String r1 = "INSERT_PRIVACY_STATE_INFO"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x00df }
            goto L_0x00e9
        L_0x0077:
            X.205 r1 = r9.A0v
            X.1BI r3 = r1.A00
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0089
            boolean r0 = r9.A19
            if (r0 == 0) goto L_0x00f3
        L_0x0089:
            int r1 = r9.A0u
            r0 = 7
            if (r1 == r0) goto L_0x00f3
            int r1 = r9.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x00f3
            X.00H r0 = r8.A01
            java.lang.Object r2 = r0.get()
            X.2j9 r2 = (X.C57482j9) r2
            X.1PM r1 = r2.A00
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r3)
            X.1yf r3 = r1.A02(r0)
            if (r3 == 0) goto L_0x00ec
            boolean r0 = r3.A02()
            if (r0 == 0) goto L_0x00ec
            X.1Cd r0 = r2.A02
            X.1au r5 = r0.A05()
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x00df }
            X.AnonymousClass206.A04(r4, r9)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "host_storage"
            int r0 = r3.A01     // Catch:{ all -> 0x00df }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x00df }
            java.lang.String r1 = "actual_actors"
            int r0 = r3.A00     // Catch:{ all -> 0x00df }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "privacy_mode_ts"
            long r0 = r3.A04     // Catch:{ all -> 0x00df }
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00df }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00df }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00df }
            java.lang.String r2 = "message_privacy_state"
            java.lang.String r1 = "INSERT_PRIVACY_STATE_INFO"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x00df }
            goto L_0x00e9
        L_0x00df:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00e4 }
            throw r1
        L_0x00e4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00e9:
            r5.close()
        L_0x00ec:
            if (r10 == 0) goto L_0x00f3
            java.lang.NullPointerException r0 = X.C17900vP.A07(r7)
            throw r0
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699339c.CCZ(X.206, X.2Rn):void");
    }

    public C699339c(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
