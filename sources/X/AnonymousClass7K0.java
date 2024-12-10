package X;

import com.whatsapp.ml.v2.MLModelUtilV2;

/* renamed from: X.7K0  reason: invalid class name */
public final class AnonymousClass7K0 implements AnonymousClass89D {
    public final MLModelUtilV2 A00;

    public AnonymousClass7K0(MLModelUtilV2 mLModelUtilV2) {
        C18070vi.A0d(mLModelUtilV2, 1);
        this.A00 = mLModelUtilV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CCc(X.AnonymousClass708 r10, java.io.File r11, java.lang.String r12, X.C30391dr r13) {
        /*
            r9 = this;
            java.lang.String r7 = r10.A04
            r8 = 0
            X.C18070vi.A0d(r12, r8)
            r6 = 1
            java.security.MessageDigest r5 = X.C108945cZ.A1I()
            java.io.File r0 = X.C108945cZ.A17(r12)
            java.io.FileInputStream r4 = X.C108945cZ.A18(r0)
            boolean r0 = r4 instanceof java.io.BufferedInputStream     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x001b
            r3 = r4
            java.io.BufferedInputStream r3 = (java.io.BufferedInputStream) r3     // Catch:{ all -> 0x005d }
            goto L_0x0022
        L_0x001b:
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x005d }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x005d }
        L_0x0022:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x0056 }
        L_0x0026:
            int r1 = r3.read(r2)     // Catch:{ all -> 0x0056 }
            r0 = -1
            if (r1 == r0) goto L_0x0031
            r5.update(r2, r8, r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0026
        L_0x0031:
            byte[] r1 = r5.digest()     // Catch:{ all -> 0x0056 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0056 }
            X.83o r0 = X.C1591883o.A00     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = X.C200410p.A0J(r0, r1)     // Catch:{ all -> 0x0056 }
            r3.close()     // Catch:{ all -> 0x005d }
            r4.close()
            boolean r0 = X.AnonymousClass1YE.A09(r7, r0, r6)
            if (r0 == 0) goto L_0x0050
            X.8Jk r0 = new X.8Jk
            r0.<init>()
            return r0
        L_0x0050:
            X.8Jj r0 = new X.8Jj
            r0.<init>()
            return r0
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K0.CCc(X.708, java.io.File, java.lang.String, X.1dr):java.lang.Object");
    }

    public String Ba8() {
        return "HashVerificationStep";
    }
}
