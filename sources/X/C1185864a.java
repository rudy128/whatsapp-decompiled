package X;

/* renamed from: X.64a  reason: invalid class name and case insensitive filesystem */
public final class C1185864a extends C128476g4 {
    public final long A00;
    public final C138906xt A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass18K A03;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r10.equals(r0) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r10.equals("webp") != false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r1 = r9.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r1 == null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        if (r1.exists() != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        r1.mkdirs();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10 = X.C108945cZ.A19(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        if ((8192 + r15) > r6.A00) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r8.read(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        if (r1 == -1) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        r10.write(r5, 0, r1);
        r15 = r15 + ((long) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0098, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        com.whatsapp.util.Log.e("StickerPackZipEntrySaver/saveFile", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00ff A[Catch:{ IOException -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00f9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A00(java.io.File r20) {
        /*
            r19 = this;
            r0 = 0
            r7 = r20
            X.C18070vi.A0d(r7, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.io.FileInputStream r0 = X.C108945cZ.A18(r7)     // Catch:{ IOException -> 0x012f }
            java.util.zip.ZipInputStream r8 = new java.util.zip.ZipInputStream     // Catch:{ IOException -> 0x012f }
            r8.<init>(r0)     // Catch:{ IOException -> 0x012f }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r0]     // Catch:{ IOException -> 0x012f }
            r17 = 0
            r4 = 0
        L_0x001a:
            java.util.zip.ZipEntry r11 = r8.getNextEntry()     // Catch:{ IOException -> 0x012f }
            r6 = r19
            if (r11 == 0) goto L_0x0108
            java.io.File r0 = r6.A02     // Catch:{ IOException -> 0x012f }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x012f }
            java.lang.String r0 = r11.getName()     // Catch:{ IOException -> 0x012f }
            java.io.File r9 = X.C64062u9.A06(r1, r0)     // Catch:{ IOException -> 0x012f }
            if (r9 == 0) goto L_0x0055
            java.lang.String r10 = X.C21721ArX.A03(r9)     // Catch:{ IOException -> 0x012f }
            int r1 = r10.hashCode()     // Catch:{ IOException -> 0x012f }
            r0 = 111145(0x1b229, float:1.55747E-40)
            if (r1 == r0) goto L_0x004a
            r0 = 117481(0x1cae9, float:1.64626E-40)
            if (r1 == r0) goto L_0x004d
            r0 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 != r0) goto L_0x0055
            goto L_0x0059
        L_0x004a:
            java.lang.String r0 = "png"
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "was"
        L_0x004f:
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x012f }
            if (r0 != 0) goto L_0x0061
        L_0x0055:
            r11.getName()     // Catch:{ IOException -> 0x012f }
            goto L_0x001a
        L_0x0059:
            java.lang.String r0 = "webp"
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x012f }
            if (r0 == 0) goto L_0x0055
        L_0x0061:
            r11 = 0
            java.io.File r1 = r9.getParentFile()     // Catch:{ IOException -> 0x012f }
            if (r1 == 0) goto L_0x0071
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x012f }
            if (r0 != 0) goto L_0x0071
            r1.mkdirs()     // Catch:{ IOException -> 0x012f }
        L_0x0071:
            r15 = 0
            java.io.FileOutputStream r10 = X.C108945cZ.A19(r9)     // Catch:{ FileNotFoundException -> 0x0098 }
        L_0x0077:
            r13 = 8192(0x2000, double:4.0474E-320)
            long r13 = r13 + r15
            long r0 = r6.A00     // Catch:{ all -> 0x0091 }
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x008d
            int r1 = r8.read(r5)     // Catch:{ all -> 0x0091 }
            r0 = -1
            if (r1 == r0) goto L_0x008d
            r10.write(r5, r11, r1)     // Catch:{ all -> 0x0091 }
            long r0 = (long) r1     // Catch:{ all -> 0x0091 }
            long r15 = r15 + r0
            goto L_0x0077
        L_0x008d:
            r10.close()     // Catch:{ FileNotFoundException -> 0x0098 }
            goto L_0x009e
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ FileNotFoundException -> 0x0098 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            java.lang.String r0 = "StickerPackZipEntrySaver/saveFile"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x012f }
        L_0x009e:
            java.lang.String r1 = X.C21721ArX.A03(r9)     // Catch:{ IOException -> 0x012f }
            int r11 = r1.hashCode()     // Catch:{ IOException -> 0x012f }
            r0 = 111145(0x1b229, float:1.55747E-40)
            r10 = 1
            if (r11 == r0) goto L_0x00c4
            r0 = 117481(0x1cae9, float:1.64626E-40)
            if (r11 == r0) goto L_0x00b7
            r0 = 3645340(0x379f9c, float:5.10821E-39)
            if (r11 != r0) goto L_0x00cc
            goto L_0x00d3
        L_0x00b7:
            java.lang.String r0 = "was"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x012f }
            if (r0 == 0) goto L_0x00cc
            X.6xt r1 = r6.A01     // Catch:{ IOException -> 0x012f }
            java.lang.String r0 = "application/was"
            goto L_0x00df
        L_0x00c4:
            java.lang.String r0 = "png"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x012f }
            if (r0 != 0) goto L_0x00ed
        L_0x00cc:
            java.lang.String r0 = "StickerPackZipEntrySaver/file in zip is not valid"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ IOException -> 0x012f }
            throw r0     // Catch:{ IOException -> 0x012f }
        L_0x00d3:
            java.lang.String r0 = "webp"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x012f }
            if (r0 == 0) goto L_0x00cc
            X.6xt r1 = r6.A01     // Catch:{ IOException -> 0x012f }
            java.lang.String r0 = "image/webp"
        L_0x00df:
            X.6uF r1 = r1.A01(r9, r0)     // Catch:{ IOException -> 0x012f }
            if (r1 == 0) goto L_0x00cc
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ IOException -> 0x012f }
            boolean r0 = r1.A02(r0)     // Catch:{ IOException -> 0x012f }
            if (r0 != r10) goto L_0x00cc
        L_0x00ed:
            long r17 = r17 + r15
            r10 = 8192(0x2000, double:4.0474E-320)
            long r10 = r10 + r17
            long r0 = r6.A01     // Catch:{ IOException -> 0x012f }
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x00ff
            java.lang.String r0 = "SafeZipEntrySaver: File being unzipped is too big."
        L_0x00fb:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x012f }
            goto L_0x0108
        L_0x00ff:
            int r4 = r4 + 1
            int r0 = r6.A00     // Catch:{ IOException -> 0x012f }
            if (r4 <= r0) goto L_0x001a
            java.lang.String r0 = "SafeZipEntrySaver: Too many files to unzip."
            goto L_0x00fb
        L_0x0108:
            X.18K r5 = r6.A03
            X.62o r4 = new X.62o
            r4.<init>()
            long r0 = r7.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A02 = r0
            java.lang.Integer r0 = X.C17880vN.A0i()
            r4.A00 = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = X.C108945cZ.A1B(r0, r2)
            r4.A01 = r0
            r5.CC7(r4)
            java.io.File r0 = r6.A02
            return r0
        L_0x012f:
            r1 = move-exception
            java.lang.String r0 = "StickerPackZipEntrySaver/saveStickerPackZipFiles failed "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185864a.A00(java.io.File):java.io.File");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1185864a(X.C218617r r9, X.AnonymousClass11P r10, X.C18030ve r11, X.AnonymousClass18K r12, X.C138906xt r13) {
        /*
            r8 = this;
            X.C18070vi.A0w(r11, r9, r10, r12, r13)
            r7 = 1900(0x76c, float:2.662E-42)
            X.0vf r6 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r6, r11, r7)
            long r0 = (long) r0
            r4 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r4
            r2 = 65
            long r0 = r0 * r2
            r3 = 65
            java.io.File r2 = r9.A0G()
            r8.<init>(r2, r3, r0)
            r8.A02 = r10
            r8.A03 = r12
            r8.A01 = r13
            int r0 = X.C18020vd.A00(r6, r11, r7)
            long r0 = (long) r0
            long r0 = r0 * r4
            r8.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185864a.<init>(X.17r, X.11P, X.0ve, X.18K, X.6xt):void");
    }
}
