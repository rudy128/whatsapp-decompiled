package X;

/* renamed from: X.2zr  reason: invalid class name and case insensitive filesystem */
public final class C67482zr implements AnonymousClass1L0 {
    public final AnonymousClass1P3 A00;
    public final C25571Os A01;
    public final AnonymousClass00H A02;

    public /* synthetic */ void Bqg() {
    }

    public void Bqi() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x019b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x019c, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r5 = ((java.lang.Long) r8.get(r9)).longValue();
        X.C17900vP.A0m("SignalPreKeyStore/deleteExpiredServerPreKeys found keys ready to be deleted, uploaded at or before: ", X.AnonymousClass000.A10(), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        if (r5 <= 0) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        r11 = r12.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r10 = r11.BD0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r9 = r12.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r4 = ((X.C28801av) r9).A02;
        r1 = X.C17880vN.A1Y();
        r8 = java.lang.String.valueOf(r5);
        r1[0] = r8;
        r7 = r4.A04("prekeys", "sent_to_server = 1 AND upload_timestamp <= ?", "SignalPreKeyStore/deleteExpiredSentPreKeys", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r9.close();
        r6 = r12.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5 = ((X.C28801av) r6).A02;
        r1 = X.C17880vN.A1Y();
        r1[0] = r8;
        r3 = r5.A04("prekey_uploads", "upload_timestamp <= ?", "SignalPreKeyStore/deleteExpiredPreKeyUpload", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r6.close();
        r1 = X.AnonymousClass000.A10();
        r1.append("SignalPreKeyStore/deleteExpiredServerPreKeys deleted expired uploaded keys:");
        r1.append(r7);
        X.C17900vP.A0j(" timestamp rows:", r1, r3);
        r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013b, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0144, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x014a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys nothing expiring yet";
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0169 A[SYNTHETIC, Splitter:B:77:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C67482zr r17) {
        /*
            r1 = r17
            X.1Os r0 = r1.A01
            X.3Ez r2 = r0.A07()
            X.1P3 r1 = r1.A00     // Catch:{ all -> 0x0199 }
            r1.A0P()     // Catch:{ all -> 0x0199 }
            X.1Os r0 = r1.A0H     // Catch:{ all -> 0x0199 }
            X.3Ez r17 = r0.A07()     // Catch:{ all -> 0x0199 }
            X.1PJ r0 = r1.A01     // Catch:{ all -> 0x018d }
            X.1PH r4 = r0.A00     // Catch:{ all -> 0x018d }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ all -> 0x018d }
            X.18O r1 = r4.A00     // Catch:{ all -> 0x018d }
            X.18Q r0 = X.AnonymousClass18O.A1P     // Catch:{ all -> 0x018d }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x018d }
            long r0 = (long) r0     // Catch:{ all -> 0x018d }
            long r15 = r3.toSeconds(r0)     // Catch:{ all -> 0x018d }
            X.1PC r0 = r4.A03     // Catch:{ all -> 0x018d }
            X.11P r10 = r0.A00     // Catch:{ all -> 0x018d }
            long r8 = X.AnonymousClass11P.A00(r10)     // Catch:{ all -> 0x018d }
            long r8 = r8 - r15
            X.1MH r12 = r0.A01     // Catch:{ all -> 0x018d }
            X.1au r5 = r12.A06()     // Catch:{ all -> 0x018d }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0183 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0183 }
            java.lang.String r7 = "prekeys"
            java.lang.String r3 = "direct_distribution = 1 AND upload_timestamp < ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r8)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredDirectDistributionPreKeys"
            int r3 = r4.A04(r7, r3, r0, r1)     // Catch:{ all -> 0x0183 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredDirectDistributionPreKeys keys:"
            X.C17900vP.A0j(r0, r1, r3)     // Catch:{ all -> 0x0183 }
            r5.close()     // Catch:{ all -> 0x018d }
            java.util.ArrayList r8 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x018d }
            X.1at r4 = r12.get()     // Catch:{ all -> 0x018d }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x017e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x017e }
            java.lang.String r1 = "SELECT upload_timestamp FROM prekey_uploads ORDER BY _id DESC"
            java.lang.String r0 = "SignalPreKeyStore/getAllPreKeyUploads"
            android.database.Cursor r3 = X.C23141Ev.A00(r3, r1, r0)     // Catch:{ all -> 0x017e }
            java.lang.String r0 = "upload_timestamp"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0172 }
        L_0x0070:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0172 }
            if (r0 == 0) goto L_0x007a
            X.C17900vP.A0K(r3, r8, r1)     // Catch:{ all -> 0x0172 }
            goto L_0x0070
        L_0x007a:
            r3.close()     // Catch:{ all -> 0x017e }
            r4.close()     // Catch:{ all -> 0x018d }
            int r1 = r8.size()     // Catch:{ all -> 0x018d }
            r0 = 3
            if (r1 < r0) goto L_0x0157
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys found more than 2 upload generations"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018d }
            r9 = 2
        L_0x008d:
            int r0 = r8.size()     // Catch:{ all -> 0x018d }
            r13 = 0
            if (r9 >= r0) goto L_0x0154
            int r0 = r9 + -2
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x018d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x018d }
            long r5 = r0.longValue()     // Catch:{ all -> 0x018d }
            long r5 = r5 + r15
            long r3 = X.AnonymousClass11P.A00(r10)     // Catch:{ all -> 0x018d }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
            java.lang.Object r0 = r8.get(r9)     // Catch:{ all -> 0x018d }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x018d }
            long r5 = r0.longValue()     // Catch:{ all -> 0x018d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys found keys ready to be deleted, uploaded at or before: "
            X.C17900vP.A0m(r0, r1, r5)     // Catch:{ all -> 0x018d }
            goto L_0x00d1
        L_0x00be:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys not deleting prekeys for upload timestamp:"
            r1.append(r0)     // Catch:{ all -> 0x018d }
            java.lang.Object r0 = r8.get(r9)     // Catch:{ all -> 0x018d }
            X.C17900vP.A0b(r0, r1)     // Catch:{ all -> 0x018d }
            int r9 = r9 + 1
            goto L_0x008d
        L_0x00d1:
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0154
            X.1au r11 = r12.A06()     // Catch:{ all -> 0x018d }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x014f }
            X.1au r9 = r12.A06()     // Catch:{ all -> 0x0145 }
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013b }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x013b }
            java.lang.String r3 = "sent_to_server = 1 AND upload_timestamp <= ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x013b }
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x013b }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x013b }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredSentPreKeys"
            int r7 = r4.A04(r7, r3, r0, r1)     // Catch:{ all -> 0x013b }
            r9.close()     // Catch:{ all -> 0x0145 }
            X.1au r6 = r12.A06()     // Catch:{ all -> 0x0145 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0136 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0136 }
            java.lang.String r4 = "prekey_uploads"
            java.lang.String r3 = "upload_timestamp <= ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0136 }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredPreKeyUpload"
            int r3 = r5.A04(r4, r3, r0, r1)     // Catch:{ all -> 0x0136 }
            r6.close()     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys deleted expired uploaded keys:"
            r1.append(r0)     // Catch:{ all -> 0x0145 }
            r1.append(r7)     // Catch:{ all -> 0x0145 }
            java.lang.String r0 = " timestamp rows:"
            X.C17900vP.A0j(r0, r1, r3)     // Catch:{ all -> 0x0145 }
            r10.A00()     // Catch:{ all -> 0x0145 }
            r10.close()     // Catch:{ all -> 0x014f }
            r11.close()     // Catch:{ all -> 0x018d }
            goto L_0x0167
        L_0x0136:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0140 }
            goto L_0x0144
        L_0x013b:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0145 }
        L_0x0144:
            throw r1     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x014a }
            goto L_0x014e
        L_0x014a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x014f }
        L_0x014e:
            throw r1     // Catch:{ all -> 0x014f }
        L_0x014f:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0188 }
            goto L_0x018c
        L_0x0154:
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys nothing expiring yet"
            goto L_0x0164
        L_0x0157:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018d }
            java.lang.String r0 = "SignalPreKeyStore/deleteExpiredServerPreKeys, not enough key uploads yet:"
            X.C17890vO.A14(r0, r1, r8)     // Catch:{ all -> 0x018d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x018d }
        L_0x0164:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x018d }
        L_0x0167:
            if (r17 == 0) goto L_0x016c
            r17.close()     // Catch:{ all -> 0x0199 }
        L_0x016c:
            if (r2 == 0) goto L_0x0171
            r2.close()
        L_0x0171:
            return
        L_0x0172:
            r1 = move-exception
            if (r3 == 0) goto L_0x017d
            r3.close()     // Catch:{ all -> 0x0179 }
            goto L_0x017d
        L_0x0179:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x017e }
        L_0x017d:
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0188 }
            goto L_0x018c
        L_0x0183:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0188 }
            goto L_0x018c
        L_0x0188:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x018d }
        L_0x018c:
            throw r1     // Catch:{ all -> 0x018d }
        L_0x018d:
            r1 = move-exception
            if (r17 == 0) goto L_0x0198
            r17.close()     // Catch:{ all -> 0x0194 }
            goto L_0x0198
        L_0x0194:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0199 }
        L_0x0198:
            throw r1     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x019b }
        L_0x019b:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67482zr.A00(X.2zr):void");
    }

    public void Bqh() {
        if (this.A00.A0Y()) {
            A00(this);
        } else {
            ((C25581Ot) this.A02.get()).A00(new C70573Bq(this, 17));
        }
    }

    public C67482zr(AnonymousClass1P3 r1, C25571Os r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
