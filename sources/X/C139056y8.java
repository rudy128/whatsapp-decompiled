package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.6y8  reason: invalid class name and case insensitive filesystem */
public final class C139056y8 {
    public final AnonymousClass190 A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final Map A03 = C17880vN.A13();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(java.io.InputStream r9, java.lang.String r10) {
        /*
            r8 = 0
            r7 = 1
            boolean r0 = r9 instanceof java.io.BufferedInputStream
            if (r0 != 0) goto L_0x000e
            r1 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r0.<init>(r9, r1)
            r9 = r0
        L_0x000e:
            java.security.MessageDigest r2 = X.C108945cZ.A1I()     // Catch:{ all -> 0x004e }
        L_0x0012:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x004e }
            int r0 = r9.read(r1)     // Catch:{ all -> 0x004e }
            if (r0 < 0) goto L_0x0020
            r2.update(r1, r8, r0)     // Catch:{ all -> 0x004e }
            goto L_0x0012
        L_0x0020:
            byte[] r6 = r2.digest()     // Catch:{ all -> 0x004e }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = ""
            int r5 = r6.length     // Catch:{ all -> 0x004e }
            r4 = 0
        L_0x002b:
            if (r4 >= r5) goto L_0x0046
            byte r0 = r6[r4]     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r1)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "%02x"
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ all -> 0x004e }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = X.C108995ce.A0Y(r0, r2, r1, r8, r7)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ all -> 0x004e }
            int r4 = r4 + 1
            goto L_0x002b
        L_0x0046:
            r9.close()
            boolean r0 = X.AnonymousClass1YE.A09(r10, r1, r7)
            return r0
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139056y8.A00(java.io.InputStream, java.lang.String):boolean");
    }

    public final File A01(String str, int i) {
        File file = new File(AnonymousClass000.A0y("/ML_MODEL", AnonymousClass000.A11(this.A01.A00.getFilesDir().getCanonicalPath())), str);
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append('_');
        return C17880vN.A0e(file, C17880vN.A0t(A11, i));
    }

    public C139056y8(AnonymousClass190 r2, AnonymousClass118 r3, C18030ve r4) {
        C18070vi.A0o(r4, r3, r2);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }
}
