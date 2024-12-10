package X;

/* renamed from: X.6xF  reason: invalid class name and case insensitive filesystem */
public final class C138536xF {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public C138536xF(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A00 = r2;
        this.A05 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A01 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        r4 = X.C108945cZ.A0x(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x014a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014e, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0151, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C138536xF r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.util.List r15) {
        /*
            java.util.Iterator r10 = r15.iterator()
        L_0x0004:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0162
            X.77d r4 = X.C108945cZ.A0x(r10)
            java.lang.String r0 = r4.A0B
            if (r0 == 0) goto L_0x0162
            java.io.File r3 = X.C108945cZ.A17(r0)
            r4.A0H = r12
            X.73B r1 = r4.A04
            if (r1 == 0) goto L_0x0029
            r1.A00 = r12
            r1.A01 = r13
            if (r14 != 0) goto L_0x0141
            java.lang.String r0 = ""
        L_0x0024:
            r1.A02 = r0
            r0 = 0
            r1.A03 = r0
        L_0x0029:
            X.00H r0 = r11.A03
            X.6uF r1 = X.C138906xt.A00(r4, r0, r3)
            if (r1 == 0) goto L_0x0162
            X.73B r0 = r4.A04
            if (r0 == 0) goto L_0x013e
            byte[] r9 = r0.A04()
        L_0x0039:
            boolean r0 = r1 instanceof X.AnonymousClass6HI
            if (r0 == 0) goto L_0x005e
            X.6HI r1 = (X.AnonymousClass6HI) r1
            com.whatsapp.media.WamediaManager r0 = r1.A00
            java.io.File r5 = r0.insertAndCopyMetadata(r3, r9)
        L_0x0045:
            if (r5 == 0) goto L_0x0162
            X.C108945cZ.A1O(r4, r5)
            X.00H r0 = r11.A05
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = X.C1402370n.A00(r5)
            X.C18070vi.A0X(r0)
            r4.A0F = r0
            goto L_0x0004
        L_0x005e:
            X.6HJ r1 = (X.AnonymousClass6HJ) r1
            X.72L r6 = r1.A01
            boolean r0 = r3.exists()
            r2 = 0
            if (r0 == 0) goto L_0x0107
            if (r9 == 0) goto L_0x0107
            int r0 = r9.length
            if (r0 == 0) goto L_0x0107
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()
            java.lang.String r0 = r3.getAbsolutePath()
            r5.append(r0)
            r0 = 46
            r5.append(r0)
            java.util.Random r0 = r6.A00
            if (r0 != 0) goto L_0x0089
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r6.A00 = r0
        L_0x0089:
            long r0 = r0.nextLong()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.append(r0)
            java.lang.String r0 = ".tmp"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r5)
            java.io.File r7 = X.C108945cZ.A17(r0)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x0152
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x00b0
            X.7gd r1 = new X.7gd
            r1.<init>(r3, r7)
            throw r1
        L_0x00b0:
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r7.mkdirs()
            if (r0 != 0) goto L_0x00de
            java.lang.String r0 = "Failed to create target directory."
            X.6QV r1 = new X.6QV
            r1.<init>(r3, r7, r0)
            throw r1
        L_0x00c4:
            java.io.File r0 = r7.getParentFile()
            if (r0 == 0) goto L_0x00cd
            r0.mkdirs()
        L_0x00cd:
            java.io.FileInputStream r8 = X.C108945cZ.A18(r3)
            java.io.FileOutputStream r5 = X.C108945cZ.A19(r7)     // Catch:{ all -> 0x014b }
            X.C196989vy.A00(r8, r5)     // Catch:{ all -> 0x0144 }
            r5.close()     // Catch:{ all -> 0x014b }
            r8.close()
        L_0x00de:
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            X.C18070vi.A0Z(r0)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            X.C18070vi.A0X(r1)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            r0.<init>(r9, r1)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            boolean r0 = r6.A06(r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            r3.getAbsolutePath()     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            if (r0 == 0) goto L_0x0107
            r2 = r7
            goto L_0x0107
        L_0x00fa:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LottieUtils/insertMetadataToTempFile/error when converting bytes to string, input file:"
            X.C108995ce.A1J(r3, r0, r1, r5)
            X.C64062u9.A0Q(r7)
        L_0x0107:
            r1 = 0
            java.io.File r0 = r3.getParentFile()     // Catch:{ IOException -> 0x0158 }
            if (r0 == 0) goto L_0x0162
            if (r2 == 0) goto L_0x0162
            java.io.File r0 = r3.getParentFile()     // Catch:{ IOException -> 0x0158 }
            if (r0 == 0) goto L_0x011a
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0158 }
        L_0x011a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)     // Catch:{ IOException -> 0x0158 }
            r0 = 47
            r1.append(r0)     // Catch:{ IOException -> 0x0158 }
            X.00H r0 = r6.A03     // Catch:{ IOException -> 0x0158 }
            r0.get()     // Catch:{ IOException -> 0x0158 }
            java.lang.String r0 = X.C1402370n.A00(r2)     // Catch:{ IOException -> 0x0158 }
            X.C108995ce.A1N(r1, r0)     // Catch:{ IOException -> 0x0158 }
            java.lang.String r0 = ".was"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0158 }
            java.io.File r5 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x0158 }
            r2.renameTo(r5)     // Catch:{ IOException -> 0x0158 }
            goto L_0x0045
        L_0x013e:
            r9 = 0
            goto L_0x0039
        L_0x0141:
            r0 = r14
            goto L_0x0024
        L_0x0144:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            X.CDX.A00(r8, r1)
            throw r0
        L_0x0152:
            X.7ge r1 = new X.7ge
            r1.<init>(r3)
            throw r1
        L_0x0158:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "LottieUtils/insertWebpMetadata/error hashing, input file:"
            X.C108995ce.A1J(r3, r0, r1, r2)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138536xF.A00(X.6xF, java.lang.String, java.lang.String, java.lang.String, java.util.List):void");
    }
}
