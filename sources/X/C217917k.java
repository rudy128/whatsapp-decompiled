package X;

/* renamed from: X.17k  reason: invalid class name and case insensitive filesystem */
public class C217917k implements C201511a {
    public final C1193367s A00;
    public final AnonymousClass00H A01;
    public final C25311Ns A02;
    public final AnonymousClass18K A03;
    public final AnonymousClass00H A04 = AnonymousClass12Q.A00(C214315y.class);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r0 = ((X.AnonymousClass7JE) r1).A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00() {
        /*
            r21 = this;
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles"
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            r5.A04()
            X.2GL r2 = new X.2GL
            r2.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r3 = r21
            X.00H r0 = r3.A01
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1at r9 = r0.get()
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01de }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x01de }
            java.lang.String r6 = "SELECT plaintext_hash, mime_type FROM ( SELECT plain_file_hash as plaintext_hash, mime_type as mime_type FROM stickers UNION SELECT plaintext_hash as plaintext_hash, mimetype as mime_type FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash, mimetype as mime_type FROM starred_stickers )"
            java.lang.String r1 = "STICKER_REFERENCE_ALL_INTERNAL_STICKER_HASHES"
            r0 = 0
            android.database.Cursor r8 = r7.A0A(r6, r1, r0)     // Catch:{ all -> 0x01de }
            java.lang.String r0 = "plaintext_hash"
            int r7 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = "mime_type"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01d2 }
        L_0x003c:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x01d2 }
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = r8.getString(r7)     // Catch:{ all -> 0x01d2 }
            java.lang.String r0 = r8.getString(r6)     // Catch:{ all -> 0x01d2 }
            if (r1 == 0) goto L_0x0050
            r4.put(r1, r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x003c
        L_0x0050:
            java.lang.String r0 = "InternalStickerFileReferenceManager/getAllInternalStickerPlainTextHashes/a sticker plaintextHash is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01d2 }
            goto L_0x003c
        L_0x0056:
            r8.close()     // Catch:{ all -> 0x01de }
            r9.close()
            X.67s r0 = r3.A00
            java.util.ArrayList r0 = r0.A05()
            java.util.Iterator r6 = r0.iterator()
        L_0x0066:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r1 = r6.next()
            X.8B0 r1 = (X.AnonymousClass8B0) r1
            boolean r0 = r1 instanceof X.AnonymousClass7JE
            if (r0 == 0) goto L_0x0066
            X.7JE r1 = (X.AnonymousClass7JE) r1
            X.77d r0 = r1.A00
            java.lang.String r1 = r0.A0F
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = r0.A0E
            r4.put(r1, r0)
            goto L_0x0066
        L_0x0084:
            long r0 = r5.A01()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.String r0 = "finished db query"
            r5.A03(r0)
            X.1Ns r14 = r3.A02     // Catch:{ Exception -> 0x01b9 }
            X.17r r0 = r14.A00     // Catch:{ Exception -> 0x01b9 }
            java.io.File r13 = r0.A0I()     // Catch:{ Exception -> 0x01b9 }
            X.C17960vV.A07(r13)     // Catch:{ Exception -> 0x01b9 }
            boolean r0 = r13.exists()     // Catch:{ Exception -> 0x01b9 }
            if (r0 == 0) goto L_0x01d1
            int r0 = r4.size()     // Catch:{ Exception -> 0x01b9 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x01b9 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x01b9 }
            java.util.Set r0 = r4.entrySet()     // Catch:{ Exception -> 0x01b9 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x01b9 }
        L_0x00b5:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x01b9 }
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r1 = r8.next()     // Catch:{ Exception -> 0x01b9 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Exception -> 0x01b9 }
            java.lang.Object r7 = r1.getKey()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01b9 }
            X.00H r0 = r3.A04     // Catch:{ Exception -> 0x01b9 }
            r0.get()     // Catch:{ Exception -> 0x01b9 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x01b9 }
            if (r0 == 0) goto L_0x00f7
            java.lang.String r6 = ".was"
        L_0x00dc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b9 }
            r4.<init>()     // Catch:{ Exception -> 0x01b9 }
            r1 = 47
            r0 = 45
            java.lang.String r0 = r7.replace(r1, r0)     // Catch:{ Exception -> 0x01b9 }
            r4.append(r0)     // Catch:{ Exception -> 0x01b9 }
            r4.append(r6)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x01b9 }
            r12.add(r0)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x00b5
        L_0x00f7:
            java.lang.String r6 = ".webp"
            goto L_0x00dc
        L_0x00fa:
            java.lang.String[] r11 = r13.list()     // Catch:{ Exception -> 0x01b9 }
            X.C17960vV.A07(r11)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "finished string conversion"
            r5.A03(r0)     // Catch:{ Exception -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b9 }
            r1.<init>()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles/total file count: "
            r1.append(r0)     // Catch:{ Exception -> 0x01b9 }
            int r10 = r11.length     // Catch:{ Exception -> 0x01b9 }
            r1.append(r10)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01b9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01b9 }
            long r19 = r5.A01()     // Catch:{ Exception -> 0x01b9 }
            r9 = 0
            r17 = 0
            r4 = 0
        L_0x0123:
            if (r9 >= r10) goto L_0x017b
            r1 = r11[r9]     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = ".png"
            boolean r0 = r1.endsWith(r0)     // Catch:{ Exception -> 0x01b9 }
            if (r0 != 0) goto L_0x016e
            boolean r0 = r12.contains(r1)     // Catch:{ Exception -> 0x01b9 }
            if (r0 != 0) goto L_0x016e
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x01b9 }
            r6.<init>(r13, r1)     // Catch:{ Exception -> 0x01b9 }
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x01b9 }
            if (r0 == 0) goto L_0x016e
            int r4 = r4 + 1
            long r0 = r6.length()     // Catch:{ Exception -> 0x01b9 }
            long r17 = r17 + r0
            X.C64062u9.A0Q(r6)     // Catch:{ Exception -> 0x01b9 }
            X.1Nr r0 = r14.A02     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r16 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x01b9 }
            X.1Cd r0 = r0.A00     // Catch:{ Exception -> 0x01b9 }
            X.1au r15 = r0.A05()     // Catch:{ Exception -> 0x01b9 }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0171 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0171 }
            java.lang.String r7 = "media_refs"
            java.lang.String r6 = "path = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0171 }
            r0 = 0
            r1[r0] = r16     // Catch:{ all -> 0x0171 }
            java.lang.String r0 = "DELETE_MEDIA_REF_SQL"
            r8.A04(r7, r6, r0, r1)     // Catch:{ all -> 0x0171 }
            r15.close()     // Catch:{ Exception -> 0x01b9 }
        L_0x016e:
            int r9 = r9 + 1
            goto L_0x0123
        L_0x0171:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0176 }
            goto L_0x017a
        L_0x0176:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x01b9 }
        L_0x017a:
            throw r1     // Catch:{ Exception -> 0x01b9 }
        L_0x017b:
            long r0 = r5.A01()     // Catch:{ Exception -> 0x01b9 }
            long r0 = r0 - r19
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x01b9 }
            r2.A03 = r0     // Catch:{ Exception -> 0x01b9 }
            long r0 = (long) r4     // Catch:{ Exception -> 0x01b9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x01b9 }
            r2.A01 = r0     // Catch:{ Exception -> 0x01b9 }
            r0 = 1024(0x400, double:5.06E-321)
            long r17 = r17 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x01b9 }
            r2.A02 = r0     // Catch:{ Exception -> 0x01b9 }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01b9 }
            r2.A00 = r0     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "finished orphan file deletion"
            r5.A03(r0)     // Catch:{ Exception -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b9 }
            r1.<init>()     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = "cleanUpOrphanInternalStickerFiles/total orphan file count: "
            r1.append(r0)     // Catch:{ Exception -> 0x01b9 }
            r1.append(r4)     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01b9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x01b9 }
            goto L_0x01cc
        L_0x01b9:
            r1 = move-exception
            java.lang.String r0 = "InternalStickerFileReferenceManager/cleanUpOrphanInternalStickerFiles/exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            java.lang.String r0 = r1.getMessage()
            r2.A05 = r0
        L_0x01cc:
            X.18K r0 = r3.A03
            r0.CC7(r2)
        L_0x01d1:
            return
        L_0x01d2:
            r1 = move-exception
            if (r8 == 0) goto L_0x01dd
            r8.close()     // Catch:{ all -> 0x01d9 }
            goto L_0x01dd
        L_0x01d9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01de }
        L_0x01dd:
            throw r1     // Catch:{ all -> 0x01de }
        L_0x01de:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x01e3 }
            throw r1
        L_0x01e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217917k.A00():void");
    }

    public C217917k(C25311Ns r2, AnonymousClass18K r3, C1193367s r4, AnonymousClass00H r5) {
        this.A03 = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r2;
    }
}
