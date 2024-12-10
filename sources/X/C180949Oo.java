package X;

/* renamed from: X.9Oo  reason: invalid class name and case insensitive filesystem */
public abstract class C180949Oo {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.lang.String r3, java.lang.String r4, boolean r5) {
        /*
            if (r3 == 0) goto L_0x004c
            java.lang.String r2 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r3)
            r0 = 0
            if (r2 == 0) goto L_0x002b
            int r0 = r2.length()
            if (r0 != 0) goto L_0x0023
            r1 = 46
            int r0 = r3.length()
            int r0 = r0 + -1
            int r0 = X.AnonymousClass1YF.A0B(r3, r1, r0)
            if (r0 < 0) goto L_0x0023
            int r0 = r0 + 1
            java.lang.String r2 = X.C108955ca.A0z(r3, r0)
        L_0x0023:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r0 = r0.getMimeTypeFromExtension(r2)
        L_0x002b:
            if (r5 == 0) goto L_0x0049
            if (r0 != 0) goto L_0x0049
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0048 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0041 }
            r0.<init>(r2)     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = java.net.URLConnection.guessContentTypeFromStream(r0)     // Catch:{ all -> 0x0041 }
            r2.close()     // Catch:{ Exception -> 0x0048 }
            goto L_0x0049
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0048 }
            throw r0     // Catch:{ Exception -> 0x0048 }
        L_0x0048:
            return r4
        L_0x0049:
            if (r0 == 0) goto L_0x004c
            return r0
        L_0x004c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180949Oo.A00(java.lang.String, java.lang.String, boolean):java.lang.String");
    }
}
