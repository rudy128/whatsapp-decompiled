package com.facebook.cameracore.ardelivery.compression.zip;

import X.A3E;
import X.C22406B6j;
import java.io.InputStream;

public final class ZipDecompressor implements C22406B6j {
    public static final A3E Companion = new Object();
    public static final int UNZIP_BUFFER_SIZE = 4096;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9N9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [X.9N9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.9N9, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9N9 decompress(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r3 = "Failed to unzip:"
            X.C18070vi.A0h(r5, r6)
            X.9HP r0 = new X.9HP     // Catch:{ IOException | IllegalArgumentException -> 0x0037 }
            r0.<init>(r5)     // Catch:{ IOException | IllegalArgumentException -> 0x0037 }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r0)     // Catch:{ IOException | IllegalArgumentException -> 0x0037 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0030 }
            int r0 = X.A3E.A00(r2, r6)     // Catch:{ all -> 0x0030 }
            if (r0 <= 0) goto L_0x0023
            java.io.File r0 = X.C108945cZ.A17(r6)     // Catch:{ all -> 0x0030 }
            X.9N9 r1 = new X.9N9     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            r1.A00 = r0     // Catch:{ all -> 0x0030 }
            goto L_0x002c
        L_0x0023:
            java.lang.String r0 = "Failed to unzip: file size is 0"
            X.9N9 r1 = new X.9N9     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            r1.A01 = r0     // Catch:{ all -> 0x0030 }
        L_0x002c:
            r2.close()     // Catch:{ IOException | IllegalArgumentException -> 0x0037 }
            return r1
        L_0x0030:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException | IllegalArgumentException -> 0x0037 }
            throw r0     // Catch:{ IOException | IllegalArgumentException -> 0x0037 }
        L_0x0037:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C17900vP.A0C(r3, r0, r1)
            X.9N9 r0 = new X.9N9
            r0.<init>()
            r0.A01 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor.decompress(java.lang.String, java.lang.String):X.9N9");
    }

    public static final int unZipToFolderBuffered(InputStream inputStream, String str) {
        return A3E.A00(inputStream, str);
    }

    public static final void createDirIfNotExist(String str, String str2) {
        A3E.A01(str, str2);
    }
}
