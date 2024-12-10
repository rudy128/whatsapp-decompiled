package X;

import java.io.File;

/* renamed from: X.5vB  reason: invalid class name and case insensitive filesystem */
public class C115515vB extends A2k {
    public final AnonymousClass181 A00;
    public final AnonymousClass1D9 A01;

    public C115515vB(AnonymousClass1KB r10, AnonymousClass181 r11, BCQ bcq, AnonymousClass1D9 r13, AnonymousClass10I r14, File file, String str, long j) {
        super(r10, bcq, r14, file, str, 4, j);
        this.A00 = r11;
        this.A01 = r13;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A01(X.C188219h4 r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.A03
            java.lang.String r7 = X.C17970vW.A04(r0)
            X.C17960vV.A07(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "thumbloader/download "
            r1.append(r0)
            java.lang.String r4 = r10.A04
            X.C17890vO.A1A(r1, r4)
            r0 = 11
            android.net.TrafficStats.setThreadStatsTag(r0)
            r8 = 1
            r3 = 0
            X.1D9 r0 = r9.A01     // Catch:{ IOException -> 0x006c }
            X.AUZ r6 = r0.A07(r3, r4, r3)     // Catch:{ IOException -> 0x006c }
            X.181 r1 = r9.A00     // Catch:{ IOException -> 0x003f }
            r0 = 30
            X.9Hb r2 = X.C108955ca.A0N(r1, r6, r3, r0)     // Catch:{ IOException -> 0x003f }
            X.A5O r0 = r9.A03     // Catch:{ all -> 0x0035 }
            r0.A04(r2, r7)     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x003f
        L_0x0035:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x003a }
            goto L_0x003e
        L_0x003a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x003f }
        L_0x003e:
            throw r1     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            X.A5O r5 = r9.A03     // Catch:{ all -> 0x0062 }
            int r2 = r10.A02     // Catch:{ all -> 0x0062 }
            int r1 = r10.A01     // Catch:{ all -> 0x0062 }
            boolean r0 = r10.A07     // Catch:{ all -> 0x0062 }
            android.graphics.Bitmap r2 = r5.A02(r7, r2, r1, r0)     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x0056
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = "thumbloader/decode failed "
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ all -> 0x0062 }
        L_0x0056:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0062 }
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r2)     // Catch:{ all -> 0x0062 }
            r6.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x007e
        L_0x0062:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0067 }
            goto L_0x006b
        L_0x0067:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x006c }
        L_0x006b:
            throw r1     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "thumbloader/error downloading "
            X.C17900vP.A0h(r0, r4, r1, r2)     // Catch:{ all -> 0x0082 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0082 }
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r3)     // Catch:{ all -> 0x0082 }
        L_0x007e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x0082:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115515vB.A01(X.9h4):android.util.Pair");
    }
}
