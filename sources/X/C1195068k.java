package X;

import java.io.File;

/* renamed from: X.68k  reason: invalid class name and case insensitive filesystem */
public final class C1195068k extends C1195468o implements BC9 {
    public File A00;
    public boolean A01;
    public AnonymousClass64W A02;
    public final long A03;
    public final AnonymousClass118 A04;
    public final C18030ve A05;
    public final AnonymousClass89E A06;
    public final AnonymousClass1U8 A07;
    public final String A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1195068k(X.AnonymousClass181 r11, X.AnonymousClass11P r12, X.AnonymousClass118 r13, X.AnonymousClass11Z r14, X.C18030ve r15, X.C24371Kb r16, X.AnonymousClass89E r17, X.AnonymousClass1U8 r18, X.C24421Kg r19, java.lang.String r20, long r21) {
        /*
            r10 = this;
            r3 = r11
            r4 = r12
            r5 = r14
            r7 = r16
            r8 = r19
            X.C18070vi.A0w(r12, r11, r14, r8, r7)
            r6 = r15
            X.C18070vi.A0l(r15, r13)
            r9 = 0
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A05 = r15
            r10.A04 = r13
            r0 = r18
            r10.A07 = r0
            r0 = r21
            r10.A03 = r0
            r0 = r20
            r10.A08 = r0
            r0 = r17
            r10.A06 = r0
            r10.BB6(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195068k.<init>(X.181, X.11P, X.118, X.11Z, X.0ve, X.1Kb, X.89E, X.1U8, X.1Kg, java.lang.String, long):void");
    }

    public C126026c4 A03() {
        this.A01 = true;
        C126026c4 A032 = super.A03();
        AnonymousClass64W r1 = A032.A00.A00;
        if (r1 != null) {
            r1.A0L = 1;
            r1.A0M = AnonymousClass3MY.A0h();
            r1.A0K = AnonymousClass3MY.A0g();
            r1.A0J = C17880vN.A0l();
        } else {
            r1 = null;
        }
        this.A02 = r1;
        return A032;
    }

    public /* synthetic */ void BsA(long j) {
    }

    public void BsC(boolean z) {
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BsD(X.C1409173o r11, X.C136996uk r12) {
        /*
            r10 = this;
            r2 = 0
            X.C18070vi.A0d(r11, r2)
            boolean r0 = r11.A03()
            r7 = 1
            if (r0 == 0) goto L_0x0076
            java.io.File r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            if (r0 == 0) goto L_0x001d
            long r0 = r0.length()     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            int r5 = (int) r0     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
        L_0x0014:
            byte[] r1 = new byte[r5]     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            java.io.File r0 = r10.A00     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            java.io.FileInputStream r4 = X.C108945cZ.A18(r0)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0014
        L_0x001f:
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0048 }
            r3.<init>(r4)     // Catch:{ all -> 0x0048 }
            r3.read(r1, r2, r5)     // Catch:{ all -> 0x0041 }
            r3.close()     // Catch:{ all -> 0x0048 }
            r4.close()     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            X.89E r0 = r10.A06     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            r0.C7X(r1)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            java.lang.String r0 = "AnonymousProfilePicDownload: Downloaded successfully: "
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            java.lang.String r0 = r10.A08     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            X.C17890vO.A1B(r1, r0)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            goto L_0x0087
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
            throw r0     // Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x004f }
        L_0x004f:
            r1 = move-exception
            java.lang.String r0 = "AnonymousProfilePicDownload: IO Exception while reading the picture download file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x006b }
            X.89E r1 = r10.A06     // Catch:{ all -> 0x006b }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x006b }
            r1.Bt7(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0087
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "AnonymousProfilePicDownload: Could not find picture download file"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x006b }
            X.89E r1 = r10.A06     // Catch:{ all -> 0x006b }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x006b }
            r1.Bt7(r0)     // Catch:{ all -> 0x006b }
            goto L_0x0087
        L_0x006b:
            r1 = move-exception
            java.io.File r0 = r10.A00
            if (r0 == 0) goto L_0x0073
            r0.delete()
        L_0x0073:
            r10.A01 = r2
            throw r1
        L_0x0076:
            int r0 = r11.A01
            boolean r0 = X.C1409173o.A02(r0)
            r7 = 6
            if (r0 == 0) goto L_0x0080
            r7 = 4
        L_0x0080:
            X.89E r1 = r10.A06
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r1.Bt7(r0)
        L_0x0087:
            java.io.File r0 = r10.A00
            if (r0 == 0) goto L_0x008e
            r0.delete()
        L_0x008e:
            r10.A01 = r2
            X.64W r0 = r11.A00
            if (r0 == 0) goto L_0x00bd
            java.lang.Long r0 = r0.A0R
            if (r0 == 0) goto L_0x00bd
            long r0 = r0.longValue()
            int r9 = (int) r0
        L_0x009d:
            X.1U8 r4 = r10.A07
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A03
            java.lang.Long r6 = X.C108945cZ.A1B(r2, r0)
            java.io.File r0 = r10.A00
            if (r0 == 0) goto L_0x00bb
            long r0 = r0.length()
            double r2 = (double) r0
            java.lang.Double r5 = java.lang.Double.valueOf(r2)
        L_0x00b6:
            r8 = 1
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x00bb:
            r5 = 0
            goto L_0x00b6
        L_0x00bd:
            r9 = -1
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195068k.BsD(X.73o, X.6uk):void");
    }
}
