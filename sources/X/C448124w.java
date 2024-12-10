package X;

/* renamed from: X.24w  reason: invalid class name and case insensitive filesystem */
public final class C448124w implements C447624r {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C448124w(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0194, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0198, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x019b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x019c, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x019f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r17, X.C49702Rn r18) {
        /*
            r16 = this;
            r0 = 0
            r4 = r17
            X.C18070vi.A0d(r4, r0)
            X.205 r0 = r4.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x01a0
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x01a0
            r3 = r16
            X.00H r0 = r3.A00
            java.lang.Object r2 = r0.get()
            X.1hM r2 = (X.C32541hM) r2
            com.whatsapp.jid.UserJid r0 = r4.A0I()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x005c
            long r0 = r4.A0x
            X.2mQ r2 = r2.A00(r0)
            X.36h r1 = r2.A03
            java.lang.Class<X.36h> r0 = X.C692036h.class
            X.25F r0 = r4.A0M(r0)
            r0.A02(r1)
            X.Aby r1 = r2.A02
            java.lang.Class<X.Aby> r0 = X.C20944Aby.class
            X.25F r0 = r4.A0M(r0)
            r0.A02(r1)
            X.36e r1 = r2.A00
            java.lang.Class<X.36e> r0 = X.C691736e.class
            X.25F r0 = r4.A0M(r0)
            r0.A02(r1)
            X.36f r1 = r2.A01
            java.lang.Class<X.36f> r0 = X.C691836f.class
            X.25F r0 = r4.A0M(r0)
            r0.A02(r1)
        L_0x005c:
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.2i6 r0 = (X.C56832i6) r0
            long r5 = r4.A0x
            X.1Cd r0 = r0.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0199 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0199 }
            java.lang.String r7 = "SELECT search_provider, plugin_type, thumbnail_cdn_url, profile_photo_cdn_url, search_provider_url, search_query, reference_index, favicon_cdn_url FROM bot_plugin_metadata WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0199 }
            java.lang.String r1 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0199 }
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x0199 }
            java.lang.String r0 = "GET_BOT_PLUGIN_METADATA_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r3 = r8.A0A(r7, r0, r3)     // Catch:{ all -> 0x0199 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0192 }
            r15 = 0
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "search_provider"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0099
            r6 = r15
            goto L_0x00a1
        L_0x0099:
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x0192 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0192 }
        L_0x00a1:
            java.lang.String r0 = "plugin_type"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00af
            r7 = r15
            goto L_0x00b7
        L_0x00af:
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x0192 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0192 }
        L_0x00b7:
            java.lang.String r0 = "thumbnail_cdn_url"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00c6
            r11 = r15
            goto L_0x00ca
        L_0x00c6:
            java.lang.String r11 = r3.getString(r1)     // Catch:{ all -> 0x0192 }
        L_0x00ca:
            java.lang.String r0 = "profile_photo_cdn_url"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00d8
            r12 = r15
            goto L_0x00dc
        L_0x00d8:
            java.lang.String r12 = r3.getString(r1)     // Catch:{ all -> 0x0192 }
        L_0x00dc:
            java.lang.String r0 = "search_provider_url"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00eb
            r13 = r15
            goto L_0x00ef
        L_0x00eb:
            java.lang.String r13 = r3.getString(r1)     // Catch:{ all -> 0x0192 }
        L_0x00ef:
            java.lang.String r0 = "reference_index"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00fd
            r10 = r15
            goto L_0x0105
        L_0x00fd:
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x0192 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0192 }
        L_0x0105:
            java.lang.String r0 = "search_query"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0114
            r14 = r15
            goto L_0x0118
        L_0x0114:
            java.lang.String r14 = r3.getString(r1)     // Catch:{ all -> 0x0192 }
        L_0x0118:
            java.lang.String r0 = "favicon_cdn_url"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0128
            java.lang.String r15 = r3.getString(r1)     // Catch:{ all -> 0x0192 }
        L_0x0128:
            r8 = 0
            if (r6 == 0) goto L_0x0146
            X.0z2 r0 = X.C179479Ic.A00     // Catch:{ all -> 0x0192 }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x0131:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0146
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0192 }
            X.9Ic r9 = (X.C179479Ic) r9     // Catch:{ all -> 0x0192 }
            int r1 = r9.value     // Catch:{ all -> 0x0192 }
            int r0 = r6.intValue()     // Catch:{ all -> 0x0192 }
            if (r1 != r0) goto L_0x0131
            goto L_0x0147
        L_0x0146:
            r9 = r8
        L_0x0147:
            if (r7 == 0) goto L_0x0164
            X.0z2 r0 = X.C179539Ij.A00     // Catch:{ all -> 0x0192 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x014f:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0164
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0192 }
            X.9Ij r5 = (X.C179539Ij) r5     // Catch:{ all -> 0x0192 }
            int r1 = r5.value     // Catch:{ all -> 0x0192 }
            int r0 = r7.intValue()     // Catch:{ all -> 0x0192 }
            if (r1 != r0) goto L_0x014f
            r8 = r5
        L_0x0164:
            X.36i r7 = new X.36i     // Catch:{ all -> 0x0192 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0192 }
            r3.close()     // Catch:{ all -> 0x0199 }
            goto L_0x0175
        L_0x016d:
            r3.close()     // Catch:{ all -> 0x0199 }
            r2.close()
            r7 = r15
            goto L_0x0178
        L_0x0175:
            r2.close()
        L_0x0178:
            java.lang.Class<X.36i> r0 = X.C692136i.class
            X.25F r0 = r4.A0M(r0)
            r0.A02(r7)
            if (r18 == 0) goto L_0x01a0
            java.lang.Class<X.24w> r1 = X.C448124w.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0192:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0199 }
            throw r0     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x019b }
        L_0x019b:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448124w.CCZ(X.206, X.2Rn):void");
    }
}
