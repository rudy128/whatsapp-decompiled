package X;

/* renamed from: X.64b  reason: invalid class name and case insensitive filesystem */
public final class C1185964b extends C128476g4 {
    public final long A00;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00aa, code lost:
        X.CDX.A00(r13, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ad, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(java.io.OutputStream r11, java.io.OutputStream r12, java.util.zip.ZipInputStream r13) {
        /*
            r10 = this;
            r9 = 0
            r8 = 1
            if (r12 != 0) goto L_0x003f
            java.util.zip.ZipEntry r3 = r13.getNextEntry()
            r2 = 0
        L_0x0009:
            if (r3 == 0) goto L_0x002d
            java.lang.String r1 = "animation/animation.json"
            java.lang.String r0 = r3.getName()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002b
            java.util.zip.ZipEntry r3 = r13.getNextEntry()
            int r2 = r2 + 1
            r0 = 20
            if (r2 <= r0) goto L_0x0009
            java.lang.String r0 = "LottieStickerZipEntrySaver/findAnimationEntry too many files to unzip"
        L_0x0023:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
        L_0x0027:
            r5 = 0
            if (r0 == 0) goto L_0x0094
            goto L_0x0030
        L_0x002b:
            r0 = 1
            goto L_0x0027
        L_0x002d:
            java.lang.String r0 = "LottieStickerZipEntrySaver/findAnimationEntry unable to find right entry"
            goto L_0x0023
        L_0x0030:
            long r3 = A00(r10, r11, r13)     // Catch:{ all -> 0x0082 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            r5 = 1
        L_0x003b:
            r11.close()     // Catch:{ all -> 0x00a7 }
            goto L_0x0091
        L_0x003f:
            java.util.zip.ZipEntry r7 = r13.getNextEntry()     // Catch:{ all -> 0x00a7 }
            r6 = 0
            r5 = 0
            r3 = -1
            r2 = 0
        L_0x0048:
            if (r7 == 0) goto L_0x0095
            if (r6 == 0) goto L_0x004e
            if (r5 != 0) goto L_0x0095
        L_0x004e:
            java.lang.String r1 = "animation/animation.json"
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x00a7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0062
            long r3 = A00(r10, r11, r13)     // Catch:{ all -> 0x0082 }
            r11.close()     // Catch:{ all -> 0x00a7 }
            r6 = 1
        L_0x0062:
            java.lang.String r1 = "animation/animation.json.overridden_metadata"
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x00a7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0072
            A00(r10, r12, r13)     // Catch:{ all -> 0x00a7 }
            r5 = 1
        L_0x0072:
            java.util.zip.ZipEntry r7 = r13.getNextEntry()     // Catch:{ all -> 0x00a7 }
            int r2 = r2 + 1
            r0 = 20
            if (r2 <= r0) goto L_0x0048
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveAnimationAndMetadataStream too many files to unzip"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0089
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x00a7 }
            throw r0     // Catch:{ all -> 0x00a7 }
        L_0x0089:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1R(r0)
        L_0x0091:
            r13.close()
        L_0x0094:
            return r5
        L_0x0095:
            r13.close()
            if (r6 == 0) goto L_0x00a1
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00a1
            return r8
        L_0x00a1:
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveAnimationAndMetadataStream unable to find animation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x00a7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            X.CDX.A00(r13, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185964b.A01(java.io.OutputStream, java.io.OutputStream, java.util.zip.ZipInputStream):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.C1185964b r8, java.io.OutputStream r9, java.util.zip.ZipInputStream r10) {
        /*
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]
            r5 = 0
        L_0x0006:
            r3 = 8192(0x2000, double:4.0474E-320)
            long r3 = r3 + r5
            long r1 = r8.A00     // Catch:{ all -> 0x0023 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x001d
            int r1 = r10.read(r7)     // Catch:{ all -> 0x0023 }
            r0 = -1
            if (r1 == r0) goto L_0x001d
            r0 = 0
            r9.write(r7, r0, r1)     // Catch:{ all -> 0x0023 }
            long r0 = (long) r1     // Catch:{ all -> 0x0023 }
            long r5 = r5 + r0
            goto L_0x0006
        L_0x001d:
            if (r9 == 0) goto L_0x0022
            r9.close()     // Catch:{ IOException -> 0x002a }
        L_0x0022:
            return r5
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ IOException -> 0x002a }
            throw r0     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            r1 = move-exception
            java.lang.String r0 = "LottieStickerZipEntrySaver/saveToOutputStream "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185964b.A00(X.64b, java.io.OutputStream, java.util.zip.ZipInputStream):long");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1185964b(X.C218617r r9, X.C18030ve r10) {
        /*
            r8 = this;
            X.C18070vi.A0j(r10, r9)
            r7 = 1900(0x76c, float:2.662E-42)
            X.0vf r6 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r6, r10, r7)
            long r1 = (long) r0
            r4 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r4
            r3 = 20
            java.io.File r0 = r9.A0G()
            r8.<init>(r0, r3, r1)
            int r0 = X.C18020vd.A00(r6, r10, r7)
            long r0 = (long) r0
            long r0 = r0 * r4
            r8.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185964b.<init>(X.17r, X.0ve):void");
    }
}
