package X;

import java.io.File;

/* renamed from: X.6xv  reason: invalid class name and case insensitive filesystem */
public final class C138926xv {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A01(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            if (r8 == 0) goto L_0x0071
            X.00H r0 = r6.A00
            java.lang.Object r0 = r0.get()
            X.17r r0 = (X.C218617r) r0
            X.2hC r0 = r0.A08()
            java.io.File r4 = r0.A02
            X.C218617r.A07(r4, r1)
            r5 = 0
            X.00H r0 = r6.A01     // Catch:{ FileNotFoundException -> 0x005a }
            java.lang.Object r0 = r0.get()     // Catch:{ FileNotFoundException -> 0x005a }
            X.1Ns r0 = (X.C25311Ns) r0     // Catch:{ FileNotFoundException -> 0x005a }
            X.17r r0 = r0.A00     // Catch:{ FileNotFoundException -> 0x005a }
            java.io.File r0 = r0.A0I()     // Catch:{ FileNotFoundException -> 0x005a }
            java.io.File r1 = X.C17880vN.A0e(r0, r7)     // Catch:{ FileNotFoundException -> 0x005a }
            boolean r0 = r1.exists()     // Catch:{ FileNotFoundException -> 0x005a }
            if (r0 == 0) goto L_0x005f
            java.io.File r0 = X.C17880vN.A0e(r4, r7)     // Catch:{ FileNotFoundException -> 0x005a }
            r0.createNewFile()     // Catch:{ FileNotFoundException -> 0x005a }
            java.io.FileInputStream r3 = X.C108945cZ.A18(r1)     // Catch:{ FileNotFoundException -> 0x005a }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r0)     // Catch:{ all -> 0x0053 }
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x005a }
            r1.delete()     // Catch:{ FileNotFoundException -> 0x005a }
            goto L_0x005f
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ FileNotFoundException -> 0x005a }
            throw r0     // Catch:{ FileNotFoundException -> 0x005a }
        L_0x005a:
            java.lang.String r0 = "StickerTrayIconHandler/getTrayIconFromExcludedBackupStorage/failed to copy file from internal storage to excluded backup storage"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x005f:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x006c
            boolean r0 = r4.mkdirs()
            if (r0 != 0) goto L_0x006c
            return r5
        L_0x006c:
            java.io.File r5 = X.C17880vN.A0e(r4, r7)
            return r5
        L_0x0071:
            java.io.File r5 = A00(r6, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138926xv.A01(java.lang.String, boolean):java.io.File");
    }

    public static final File A00(C138926xv r1, String str) {
        File A0I = ((C25311Ns) r1.A01.get()).A00.A0I();
        if (A0I.exists() || A0I.mkdirs()) {
            return C17880vN.A0e(A0I, str);
        }
        return null;
    }

    public C138926xv(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
