package X;

/* renamed from: X.2zi  reason: invalid class name and case insensitive filesystem */
public final class C67392zi implements AnonymousClass1L0 {
    public final C37511pf A00;
    public final C25111Mx A01;
    public final AnonymousClass1PM A02;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e1, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqh() {
        /*
            r11 = this;
            X.1PM r1 = r11.A02
            java.lang.String r0 = "VerifiedNameManager/deleteStaleUnconfirmedVerifiedNameCerts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.C17960vV.A01()
            java.lang.Object r5 = r1.A07
            monitor-enter(r5)
            X.1PL r2 = r1.A03     // Catch:{ all -> 0x00e5 }
            X.18O r1 = r1.A00     // Catch:{ all -> 0x00e5 }
            X.18Q r0 = X.AnonymousClass18O.A1J     // Catch:{ all -> 0x00e5 }
            int r9 = r1.A04(r0)     // Catch:{ all -> 0x00e5 }
            X.1Lt r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0049 }
            X.1au r8 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x0049 }
            java.lang.String r7 = "wa_vnames"
            java.lang.String r6 = "identity_unconfirmed_since > ? AND identity_unconfirmed_since < ?"
            java.lang.String[] r4 = X.C17880vN.A1Z()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "0"
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x003f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003f }
            long r2 = X.C17880vN.A04(r0)     // Catch:{ all -> 0x003f }
            long r0 = (long) r9     // Catch:{ all -> 0x003f }
            long r2 = r2 - r0
            X.C17890vO.A1K(r4, r2)     // Catch:{ all -> 0x003f }
            X.C24861Ly.A02(r8, r7, r6, r4)     // Catch:{ all -> 0x003f }
            r8.close()     // Catch:{ IllegalArgumentException -> 0x0049 }
            goto L_0x004f
        L_0x003f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0049 }
        L_0x0048:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to delete stale vnames"
            X.C17960vV.A09(r0, r1)     // Catch:{ all -> 0x00e5 }
        L_0x004f:
            monitor-exit(r5)     // Catch:{ all -> 0x00e5 }
            X.1pf r0 = r11.A00
            X.1pg r1 = r0.A00
            r0 = 1
            X.1Ez r9 = new X.1Ez
            r9.<init>((boolean) r0)
            r9.A04()
            r8 = 0
            X.1Lt r0 = r1.A00     // Catch:{ IllegalArgumentException -> 0x0089 }
            X.1au r7 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x0089 }
            java.lang.String r6 = "wa_last_entry_point"
            java.lang.String r5 = "entry_point_time <= ?"
            java.lang.String[] r4 = X.C17880vN.A1Y()     // Catch:{ all -> 0x007f }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007f }
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r2 = r2 - r0
            X.C17880vN.A1V(r4, r8, r2)     // Catch:{ all -> 0x007f }
            X.C24861Ly.A02(r7, r6, r5, r4)     // Catch:{ all -> 0x007f }
            r7.close()     // Catch:{ IllegalArgumentException -> 0x0089 }
            goto L_0x0090
        L_0x007f:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0089 }
        L_0x0088:
            throw r1     // Catch:{ IllegalArgumentException -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            java.lang.String r0 = "deleteOldChatEntryPointLogs/unable to delete old chat entry points "
            X.C17960vV.A09(r0, r1)
            goto L_0x0093
        L_0x0090:
            r9.A01()
        L_0x0093:
            X.1Mx r6 = r11.A01
            long r9 = r6.A04()
            long r7 = r6.A03()
            X.1My r0 = r6.A01
            X.1Lt r3 = r0.A00
            X.1au r5 = r3.A06()
            java.lang.String r2 = "wa_trusted_contacts"
            java.lang.String r1 = "incoming_tc_token_timestamp< ?"
            java.lang.String[] r0 = X.C17900vP.A0t(r9)     // Catch:{ all -> 0x00de }
            X.C24861Ly.A02(r5, r2, r1, r0)     // Catch:{ all -> 0x00de }
            r5.close()
            X.1au r5 = r3.A06()
            java.lang.String r2 = "wa_trusted_contacts_send"
            java.lang.String r1 = "sent_tc_token_timestamp< ?"
            java.lang.String[] r0 = X.C17900vP.A0t(r7)     // Catch:{ all -> 0x00de }
            long r3 = X.C24861Ly.A02(r5, r2, r1, r0)     // Catch:{ all -> 0x00de }
            r5.close()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            X.0vl r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            X.C18070vi.A0X(r0)
            java.util.Map r0 = (java.util.Map) r0
            r0.clear()
        L_0x00dd:
            return
        L_0x00de:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00e5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67392zi.Bqh():void");
    }

    public C67392zi(C37511pf r1, C25111Mx r2, AnonymousClass1PM r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
