package X;

/* renamed from: X.6Xu  reason: invalid class name and case insensitive filesystem */
public abstract class C124296Xu {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r2.mkdirs() == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File A00(android.content.Context r4, X.C18030ve r5, X.AnonymousClass00H r6, java.lang.String r7) {
        /*
            X.C18070vi.A0n(r4, r5, r6)
            r3 = 8083(0x1f93, float:1.1327E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r5, r3)
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r6.get()
            X.6dZ r0 = (X.C126956dZ) r0
            X.0vl r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x0037
            r0.mkdirs()
        L_0x0020:
            java.io.File r2 = X.C17880vN.A0e(r0, r7)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0030
            boolean r0 = r2.mkdirs()
            if (r0 == 0) goto L_0x0037
        L_0x0030:
            return r2
        L_0x0031:
            java.io.File r0 = r4.getExternalCacheDir()
            if (r0 != 0) goto L_0x0020
        L_0x0037:
            java.lang.String r0 = "FileUtils/createCacheFolder couldn't create external cache folder"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            boolean r0 = X.C18020vd.A05(r1, r5, r3)
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = r6.get()
            X.6dZ r0 = (X.C126956dZ) r0
            X.0vl r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            if (r0 == 0) goto L_0x0055
            r0.mkdirs()
        L_0x0055:
            r2 = 0
            if (r0 == 0) goto L_0x0030
            java.io.File r1 = X.C17880vN.A0e(r0, r7)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0068
            boolean r0 = r1.mkdirs()
            if (r0 == 0) goto L_0x0030
        L_0x0068:
            return r1
        L_0x0069:
            java.io.File r0 = r4.getCacheDir()
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124296Xu.A00(android.content.Context, X.0ve, X.00H, java.lang.String):java.io.File");
    }
}
