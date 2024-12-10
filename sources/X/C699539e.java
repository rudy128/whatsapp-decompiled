package X;

/* renamed from: X.39e  reason: invalid class name and case insensitive filesystem */
public final class C699539e implements AnonymousClass3ML {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d2, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r9, X.C49702Rn r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r0 = 1
            boolean r0 = r9.A11(r0)
            if (r0 == 0) goto L_0x00f3
            X.00H r0 = r8.A01
            java.lang.Object r2 = r0.get()
            X.2aE r2 = (X.C52012aE) r2
            long r0 = r9.A0x
            int r3 = r9.A06
            X.1Cd r2 = r2.A00
            X.1au r5 = r2.A05()
            android.content.ContentValues r4 = X.C17890vO.A08()     // Catch:{ all -> 0x00e9 }
            java.lang.String r2 = "message_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = "forward_score"
            X.C17880vN.A18(r4, r0, r3)     // Catch:{ all -> 0x00e9 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00e9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = "message_forwarded"
            java.lang.String r0 = "INSERT_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            r3.A05(r1, r0, r4)     // Catch:{ all -> 0x00e9 }
            r5.close()
            X.Ac1 r0 = X.AnonymousClass9RY.A00(r9)
            if (r0 == 0) goto L_0x0091
            X.00H r0 = r8.A02
            java.lang.Object r7 = r0.get()
            X.2cL r7 = (X.C53322cL) r7
            X.Ac1 r3 = X.AnonymousClass9RY.A00(r9)
            if (r3 == 0) goto L_0x0087
            X.1Cd r0 = r7.A01
            X.1au r4 = r0.A05()
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x00cf }
            long r0 = r9.A0x     // Catch:{ all -> 0x00cf }
            X.C17880vN.A19(r6, r2, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r5 = "newsletter_jid_row_id"
            X.1DL r1 = r7.A00     // Catch:{ all -> 0x00cf }
            X.1ch r0 = r3.A01     // Catch:{ all -> 0x00cf }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x00cf }
            X.C17880vN.A19(r6, r5, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "newsletter_server_message_id"
            int r0 = r3.A00     // Catch:{ all -> 0x00cf }
            X.C17880vN.A18(r6, r1, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x00cf }
            r6.put(r1, r0)     // Catch:{ all -> 0x00cf }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00cf }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00cf }
            java.lang.String r3 = "forwarded_newsletter_message_info"
            java.lang.String r1 = "INSERT_FORWARDED_NEWSLETTER_MESSAGE_INFO"
            r0 = 5
            r5.A09(r3, r1, r6, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x008e
        L_0x0087:
            java.lang.String r0 = "ForwardedNewsletterMessageInfoStore/insertForwardedNewsletterMessageInfo/missing information in the FMessage"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x008e:
            r4.close()
        L_0x0091:
            X.36g r0 = X.AnonymousClass2UY.A00(r9)
            if (r0 == 0) goto L_0x00e0
            X.00H r0 = r8.A00
            java.lang.Object r6 = r0.get()
            X.2eg r6 = (X.C54772eg) r6
            X.36g r3 = X.AnonymousClass2UY.A00(r9)
            if (r3 == 0) goto L_0x00d6
            X.1Cd r0 = r6.A03
            X.1au r4 = r0.A05()
            android.content.ContentValues r5 = X.C17890vO.A08()     // Catch:{ all -> 0x00cf }
            long r0 = r9.A0x     // Catch:{ all -> 0x00cf }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "business_owner_jid_row_id"
            X.1DL r1 = r6.A01     // Catch:{ all -> 0x00cf }
            com.whatsapp.jid.UserJid r0 = r3.A01     // Catch:{ all -> 0x00cf }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x00cf }
            X.C17880vN.A19(r5, r2, r0)     // Catch:{ all -> 0x00cf }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00cf }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00cf }
            java.lang.String r2 = "business_message_forward_info"
            java.lang.String r1 = "INSERT_BUSINESS_MESSAGE_FORWARD_INFO"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x00cf }
            goto L_0x00dd
        L_0x00cf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x00d6:
            java.lang.String r0 = "BusinessMessageForwardInfoStore/insertBusinessMessageForwardInfo/missing BusinessMessageForwardedInfo in message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00dd:
            r4.close()
        L_0x00e0:
            if (r10 == 0) goto L_0x00f3
            java.lang.Class<X.39e> r0 = X.C699539e.class
            java.lang.NullPointerException r0 = X.C17900vP.A07(r0)
            throw r0
        L_0x00e9:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00ee }
            throw r1
        L_0x00ee:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C699539e.CCZ(X.206, X.2Rn):void");
    }

    public C699539e(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
