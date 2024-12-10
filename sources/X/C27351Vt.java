package X;

/* renamed from: X.1Vt  reason: invalid class name and case insensitive filesystem */
public class C27351Vt {
    public final AnonymousClass00H A00;
    public final C27341Vs A01;

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.CDX.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f4, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0078 A[SYNTHETIC, Splitter:B:33:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.Runnable r15, java.util.List r16) {
        /*
            r14 = this;
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r7 = r16.iterator()
        L_0x0009:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x010b
            java.lang.Object r6 = r7.next()
            java.io.File r6 = (java.io.File) r6
            r6.getPath()
            java.lang.String r0 = r6.getName()
            X.9JN r2 = X.AnonymousClass9QI.A00(r0)
            X.9JN r0 = X.AnonymousClass9JN.CRYPT12
            if (r2 != r0) goto L_0x0081
            java.lang.String r3 = "backupcipher/db/get/ioerror "
            boolean r2 = r6.exists()
            r0 = 0
            if (r2 != 0) goto L_0x0038
            java.lang.String r0 = "backupkey/db/getparams/does-not-exist"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0032:
            java.lang.String r0 = "backupencryption/getkeysforbackups/no-cipher/skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0009
        L_0x0038:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ 0vo -> 0x006f, FileNotFoundException -> 0x0054, IOException -> 0x004c, all -> 0x0109 }
            r5.<init>(r6)     // Catch:{ 0vo -> 0x006f, FileNotFoundException -> 0x0054, IOException -> 0x004c, all -> 0x0109 }
            X.9mJ r8 = X.A85.A00(r5)     // Catch:{ 0vo -> 0x004a, FileNotFoundException -> 0x0048, IOException -> 0x0046 }
            r5.close()     // Catch:{ Exception -> 0x00d1 }
            goto L_0x00d5
        L_0x0046:
            r2 = move-exception
            goto L_0x004e
        L_0x0048:
            r4 = move-exception
            goto L_0x0056
        L_0x004a:
            r2 = move-exception
            goto L_0x0071
        L_0x004c:
            r2 = move-exception
            r5 = r0
        L_0x004e:
            java.lang.String r0 = "backupcipher/db/get/error "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00fd }
            goto L_0x0076
        L_0x0054:
            r4 = move-exception
            r5 = r0
        L_0x0056:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fd }
            r2.<init>()     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "backupcipher/db/get/can't find "
            r2.append(r0)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x00fd }
            r2.append(r0)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00fd }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x00fd }
            goto L_0x0076
        L_0x006f:
            r2 = move-exception
            r5 = r0
        L_0x0071:
            java.lang.String r0 = "backupcipher/header-mismatch"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00fd }
        L_0x0076:
            if (r5 == 0) goto L_0x0032
            r5.close()     // Catch:{ Exception -> 0x007c }
            goto L_0x0032
        L_0x007c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            goto L_0x0032
        L_0x0081:
            X.9JN r0 = X.AnonymousClass9JN.CRYPT14
            if (r2 != r0) goto L_0x0032
            r8 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00f5 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x00f5 }
            X.8ai r0 = X.C165178ai.DEFAULT_INSTANCE     // Catch:{ all -> 0x00ee }
            X.Bm6 r4 = X.C23577Bm6.A04(r0, r3)     // Catch:{ all -> 0x00ee }
            X.8ai r4 = (X.C165178ai) r4     // Catch:{ all -> 0x00ee }
            if (r4 == 0) goto L_0x00cd
            int r2 = r4.keyType_     // Catch:{ all -> 0x00ee }
            if (r2 == 0) goto L_0x009f
            r0 = 1
            if (r2 == r0) goto L_0x00a2
            X.9JX r2 = X.AnonymousClass9JX.WA_PROVIDED     // Catch:{ all -> 0x00ee }
            goto L_0x00a4
        L_0x009f:
            X.9JX r2 = X.AnonymousClass9JX.WA_PROVIDED     // Catch:{ all -> 0x00ee }
            goto L_0x00a4
        L_0x00a2:
            X.9JX r2 = X.AnonymousClass9JX.HSM_CONTROLLED     // Catch:{ all -> 0x00ee }
        L_0x00a4:
            X.9JX r0 = X.AnonymousClass9JX.WA_PROVIDED     // Catch:{ all -> 0x00ee }
            if (r2 != r0) goto L_0x00cd
            X.8bC r2 = r4.waProvidedKeyData_     // Catch:{ all -> 0x00ee }
            if (r2 != 0) goto L_0x00ae
            X.8bC r2 = X.C165468bC.DEFAULT_INSTANCE     // Catch:{ all -> 0x00ee }
        L_0x00ae:
            X.DSQ r0 = r2.backupCipherHeader_     // Catch:{ all -> 0x00ee }
            byte[] r10 = r0.A06()     // Catch:{ all -> 0x00ee }
            java.lang.String r9 = r2.keyVersion_     // Catch:{ all -> 0x00ee }
            X.DSQ r0 = r2.serverSalt_     // Catch:{ all -> 0x00ee }
            byte[] r11 = r0.A06()     // Catch:{ all -> 0x00ee }
            X.DSQ r0 = r2.googleIdSalt_     // Catch:{ all -> 0x00ee }
            byte[] r12 = r0.A06()     // Catch:{ all -> 0x00ee }
            X.DSQ r0 = r2.encryptionIv_     // Catch:{ all -> 0x00ee }
            byte[] r13 = r0.A06()     // Catch:{ all -> 0x00ee }
            X.9mJ r8 = new X.9mJ     // Catch:{ all -> 0x00ee }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00ee }
        L_0x00cd:
            r3.close()     // Catch:{ IOException -> 0x00f5 }
            goto L_0x00d5
        L_0x00d1:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
        L_0x00d5:
            if (r8 == 0) goto L_0x0032
            byte[] r0 = r8.A02
            byte[] r4 = X.A8L.A05(r0)
            java.lang.String r3 = r8.A00
            byte[] r2 = r8.A04
            X.2kn r0 = new X.2kn
            r0.<init>(r3, r2, r4)
            r1.contains(r0)
            r1.add(r0)
            goto L_0x0009
        L_0x00ee:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            X.CDX.A00(r3, r2)     // Catch:{ IOException -> 0x00f5 }
            throw r0     // Catch:{ IOException -> 0x00f5 }
        L_0x00f5:
            r2 = move-exception
            java.lang.String r0 = "readProtobufBackupCipher/failed"
            com.whatsapp.util.Log.w(r0, r2)
            goto L_0x0032
        L_0x00fd:
            r1 = move-exception
            if (r5 == 0) goto L_0x010a
            r5.close()     // Catch:{ Exception -> 0x0104 }
            throw r1
        L_0x0104:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            throw r1
        L_0x0109:
            r1 = move-exception
        L_0x010a:
            throw r1
        L_0x010b:
            int r7 = r1.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "backupencryption/getkeys/size "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " (backups="
            r2.append(r0)
            int r0 = r16.size()
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r14.A00
            java.lang.Object r0 = r0.get()
            X.9j8 r0 = (X.AnonymousClass9j8) r0
            java.util.Map r0 = r0.A00
            r0.clear()
            java.util.Iterator r6 = r1.iterator()
        L_0x0145:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r2 = r6.next()
            X.2kn r2 = (X.C58502kn) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "backupencryption/getkeysforencryptedbackups/v="
            r1.append(r0)
            java.lang.String r5 = r2.A00
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            byte[] r4 = r2.A02
            java.util.Arrays.toString(r4)
            byte[] r3 = r2.A01
            java.util.Arrays.toString(r3)
            X.1Vs r2 = r14.A01
            r1 = 47
            X.Akb r0 = new X.Akb
            r0.<init>((java.lang.Object) r14, (int) r7, (int) r1, (java.lang.Object) r15)
            r2.A00(r0, r5, r4, r3)
            goto L_0x0145
        L_0x017e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27351Vt.A00(java.lang.Runnable, java.util.List):int");
    }

    public C190569lA A01(C191279mJ r4) {
        return (C190569lA) ((AnonymousClass9j8) this.A00.get()).A00.get(new C192219o0(r4.A00, r4.A04));
    }

    public C27351Vt(C27341Vs r1, AnonymousClass00H r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
