package X;

import java.io.File;

public final class A3E {
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r0 = X.C17880vN.A0f(X.AnonymousClass001.A1H("ZIP input flows into path traversal sink. The generated file doesn't start with ", r12, X.AnonymousClass000.A10()));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(java.io.InputStream r11, java.lang.String r12) {
        /*
            r10 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x00e2 }
            r3.<init>(r11)     // Catch:{ all -> 0x00e2 }
            java.io.BufferedInputStream r4 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00e0 }
            r4.<init>(r3)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = ""
            A01(r12, r0)     // Catch:{ all -> 0x00e5 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00e5 }
            r6 = 0
            r9 = 0
        L_0x0016:
            java.util.zip.ZipEntry r2 = r3.getNextEntry()     // Catch:{ all -> 0x00e5 }
            if (r2 == 0) goto L_0x00d9
            java.lang.String r8 = r2.getName()     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0b(r8)     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = ".."
            r1.append(r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = java.io.File.separator     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x00e5 }
            boolean r0 = X.AnonymousClass1YF.A0Y(r8, r0, r6)     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x00c8
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0042
            A01(r12, r8)     // Catch:{ all -> 0x00e5 }
            goto L_0x0016
        L_0x0042:
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0Z(r2)     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0d(r8, r6)     // Catch:{ all -> 0x00e5 }
            int r0 = r8.length()     // Catch:{ all -> 0x00e5 }
            int r0 = r0 + -1
            int r0 = X.AnonymousClass1YF.A0E(r8, r2, r0)     // Catch:{ all -> 0x00e5 }
            r5 = -1
            if (r0 == r5) goto L_0x006a
            java.lang.String r0 = X.C108955ca.A0q(r6, r0, r8)     // Catch:{ all -> 0x00e5 }
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r12, r2, r0)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00e5 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x00e5 }
            r0.mkdirs()     // Catch:{ all -> 0x00e5 }
        L_0x006a:
            java.io.File r0 = X.AnonymousClass8BR.A0u(r12, r8)     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x00e5 }
            java.io.File r0 = X.C108945cZ.A17(r12)     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ all -> 0x00e5 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00e5 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00b9
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r12, r2, r8)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00b6 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b6 }
            r2.<init>(r0)     // Catch:{ all -> 0x00b6 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00b4 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b4 }
        L_0x0098:
            int r0 = r4.read(r7)     // Catch:{ all -> 0x00b1 }
            if (r0 == r5) goto L_0x00a3
            r1.write(r7, r6, r0)     // Catch:{ all -> 0x00b1 }
            int r9 = r9 + r0
            goto L_0x0098
        L_0x00a3:
            r1.flush()     // Catch:{ all -> 0x00b1 }
            r3.closeEntry()     // Catch:{ all -> 0x00e5 }
            X.C197099w9.A00(r1)     // Catch:{ all -> 0x00e5 }
            X.C197099w9.A00(r2)     // Catch:{ all -> 0x00e5 }
            goto L_0x0016
        L_0x00b1:
            r0 = move-exception
            r10 = r1
            goto L_0x00cf
        L_0x00b4:
            r0 = move-exception
            goto L_0x00cf
        L_0x00b6:
            r0 = move-exception
            r2 = r10
            goto L_0x00cf
        L_0x00b9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00e5 }
            java.lang.String r0 = "ZIP input flows into path traversal sink. The generated file doesn't start with "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)     // Catch:{ all -> 0x00e5 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00d8
        L_0x00c8:
            java.lang.String r0 = "zipEntryName contains ../"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x00e5 }
            goto L_0x00d8
        L_0x00cf:
            r3.closeEntry()     // Catch:{ all -> 0x00e5 }
            X.C197099w9.A00(r10)     // Catch:{ all -> 0x00e5 }
            X.C197099w9.A00(r2)     // Catch:{ all -> 0x00e5 }
        L_0x00d8:
            throw r0     // Catch:{ all -> 0x00e5 }
        L_0x00d9:
            X.C197099w9.A00(r4)
            X.C197099w9.A00(r3)
            return r9
        L_0x00e0:
            r0 = move-exception
            goto L_0x00e7
        L_0x00e2:
            r0 = move-exception
            r3 = r10
            goto L_0x00e7
        L_0x00e5:
            r0 = move-exception
            r10 = r4
        L_0x00e7:
            X.C197099w9.A00(r10)
            X.C197099w9.A00(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A3E.A00(java.io.InputStream, java.lang.String):int");
    }

    public static final void A01(String str, String str2) {
        File A17 = C108945cZ.A17(AnonymousClass001.A1H(File.separator, str2, AnonymousClass000.A11(str)));
        if (!A17.isDirectory()) {
            A17.mkdirs();
        }
    }
}
