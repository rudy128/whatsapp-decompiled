package X;

/* renamed from: X.9CA  reason: invalid class name */
public final class AnonymousClass9CA extends C24861Ly {
    public final C24851Lx A00;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C195609tc A0I(com.whatsapp.jid.UserJid r16) {
        /*
            r15 = this;
            java.lang.String r0 = "BizIntegritySignalsStore/getBizIntegritySignals"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Lx r0 = r15.A00
            r1 = r16
            com.whatsapp.jid.UserJid r0 = r0.A00(r1)
            java.lang.String r1 = X.C22971Dz.A06(r0)
            r5 = 0
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "BizIntegritySignalsStore/getBizIntegritySignals/cannot get business integrity signals by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r5
        L_0x001a:
            X.1Lt r0 = r15.A00
            X.1at r2 = r0.get()
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x00a5 }
            r0 = 0
            java.lang.String[] r3 = X.C17880vN.A1a(r1, r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = "CONTACT_BIZ_INTEGRITY_SIGNALS"
            java.lang.String r0 = "SELECT jid, dhash, fb_linked_page_number_of_likes, ig_linked_page_number_of_followers, is_suspicious, join_date_ms, is_banned, phone_country_code, trust_tier FROM wa_biz_integrity_signals WHERE jid = ?"
            android.database.Cursor r3 = X.C24861Ly.A03(r2, r0, r1, r3)     // Catch:{ all -> 0x00a5 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x00a5 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = "jid"
            java.lang.String r0 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x009e }
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A02(r0)     // Catch:{ all -> 0x009e }
            if (r6 == 0) goto L_0x0097
            java.lang.String r0 = "dhash"
            java.lang.String r12 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "fb_linked_page_number_of_likes"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x009e }
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "ig_linked_page_number_of_followers"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x009e }
            java.lang.Long r10 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "phone_country_code"
            java.lang.String r13 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "is_banned"
            int r0 = X.C17890vO.A01(r3, r0)     // Catch:{ all -> 0x009e }
            r5 = 0
            r4 = 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "join_date_ms"
            long r0 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x009e }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "trust_tier"
            java.lang.String r14 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "is_suspicious"
            int r0 = X.C17890vO.A01(r3, r0)     // Catch:{ all -> 0x009e }
            if (r0 != r4) goto L_0x008e
            r5 = 1
        L_0x008e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x009e }
            X.9tc r5 = new X.9tc     // Catch:{ all -> 0x009e }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x009e }
        L_0x0097:
            r3.close()     // Catch:{ all -> 0x00a5 }
            r2.close()
            return r5
        L_0x009e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9CA.A0I(com.whatsapp.jid.UserJid):X.9tc");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9CA(C24851Lx r1, C24811Lt r2) {
        super(r2);
        C18070vi.A0j(r2, r1);
        this.A00 = r1;
    }
}
