package X;

/* renamed from: X.24u  reason: invalid class name and case insensitive filesystem */
public final class C447924u implements C447624r {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public C447924u(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0112, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0115, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0116, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0119, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r11, X.C49702Rn r12) {
        /*
            r10 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            r0 = 1
            boolean r0 = r11.A11(r0)
            if (r0 == 0) goto L_0x0144
            X.00H r0 = r10.A02
            java.lang.Object r0 = r0.get()
            X.2aE r0 = (X.C52012aE) r0
            X.1Cd r0 = r0.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013a }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x013a }
            java.lang.String r4 = "SELECT forward_score FROM message_forwarded WHERE message_row_id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x013a }
            long r0 = r11.A0x     // Catch:{ all -> 0x013a }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x013a }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x013a }
            java.lang.String r0 = "GET_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ all -> 0x013a }
            if (r2 == 0) goto L_0x0045
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = "forward_score"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x012e }
            int r3 = r2.getInt(r0)     // Catch:{ all -> 0x012e }
        L_0x0045:
            r11.A06 = r3     // Catch:{ all -> 0x012e }
            if (r2 == 0) goto L_0x004c
            r2.close()     // Catch:{ all -> 0x013a }
        L_0x004c:
            r6.close()
            r0 = 32
            boolean r0 = r11.A0z(r0)
            if (r0 == 0) goto L_0x0083
            X.00H r0 = r10.A00
            java.lang.Object r2 = r0.get()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 4652(0x122c, float:6.519E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0083
            X.00H r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.2eg r0 = (X.C54772eg) r0
            X.2g2 r4 = r0.A00
            X.3Hq r3 = new X.3Hq
            r3.<init>(r0, r11)
            X.10s r2 = r4.A04
            r1 = 1
            X.3C4 r0 = new X.3C4
            r0.<init>(r4, r11, r3, r1)
            r2.execute(r0)
        L_0x0083:
            X.00H r0 = r10.A00
            java.lang.Object r2 = r0.get()
            X.0vd r2 = (X.C18020vd) r2
            r1 = 6507(0x196b, float:9.118E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x009d
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r11.A0z(r0)
            if (r0 == 0) goto L_0x011d
        L_0x009d:
            X.00H r0 = r10.A03
            java.lang.Object r4 = r0.get()
            X.2cL r4 = (X.C53322cL) r4
            r7 = 0
            X.1Cd r0 = r4.A01
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0113 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0113 }
            java.lang.String r5 = "SELECT newsletter_jid_row_id,newsletter_server_message_id,newsletter_name FROM forwarded_newsletter_message_info WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0113 }
            long r0 = r11.A0x     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0113 }
            r3[r7] = r0     // Catch:{ all -> 0x0113 }
            java.lang.String r0 = "GET_FORWARDED_NEWSLETTER_MESSAGE_INFO_FOR_ROW_ID_SQL"
            android.database.Cursor r3 = r6.A0A(r5, r0, r3)     // Catch:{ all -> 0x0113 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "newsletter_jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010c }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x010c }
            long r0 = (long) r0     // Catch:{ all -> 0x010c }
            X.1DL r5 = r4.A00     // Catch:{ all -> 0x010c }
            java.lang.Class<X.1ch> r4 = X.C29681ch.class
            com.whatsapp.jid.Jid r5 = r5.A0E(r4, r0)     // Catch:{ all -> 0x010c }
            X.1ch r5 = (X.C29681ch) r5     // Catch:{ all -> 0x010c }
            if (r5 == 0) goto L_0x0108
            java.lang.String r0 = "newsletter_server_message_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010c }
            int r9 = r3.getInt(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "newsletter_name"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010c }
            java.lang.String r7 = r3.getString(r0)     // Catch:{ all -> 0x010c }
            X.C18070vi.A0b(r7)     // Catch:{ all -> 0x010c }
            r6 = 0
            X.Ac1 r4 = new X.Ac1     // Catch:{ all -> 0x010c }
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x010c }
            java.lang.Class<X.Ac1> r0 = X.C20947Ac1.class
            X.25F r0 = r11.A0M(r0)     // Catch:{ all -> 0x010c }
            r0.A02(r4)     // Catch:{ all -> 0x010c }
        L_0x0108:
            r3.close()     // Catch:{ all -> 0x0113 }
            goto L_0x011a
        L_0x010c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0113 }
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0115 }
        L_0x0115:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x011a:
            r2.close()
        L_0x011d:
            if (r12 == 0) goto L_0x0144
            java.lang.Class<X.24u> r1 = X.C447924u.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x012e:
            r1 = move-exception
            if (r2 == 0) goto L_0x0139
            r2.close()     // Catch:{ all -> 0x0135 }
            goto L_0x0139
        L_0x0135:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x013a }
        L_0x0139:
            throw r1     // Catch:{ all -> 0x013a }
        L_0x013a:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x013f }
            throw r1
        L_0x013f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447924u.CCZ(X.206, X.2Rn):void");
    }
}
