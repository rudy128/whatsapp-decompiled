package X;

import java.io.File;

/* renamed from: X.5vA  reason: invalid class name and case insensitive filesystem */
public class C115505vA extends A2k {
    public final AnonymousClass734 A00;

    public C115505vA(AnonymousClass1KB r10, BCQ bcq, AnonymousClass734 r12, AnonymousClass10I r13, File file, long j) {
        super(r10, bcq, r13, file, "sticker", 4, j);
        this.A00 = r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c5 A[SYNTHETIC, Splitter:B:56:0x00c5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A01(X.C188219h4 r15) {
        /*
            r14 = this;
            java.lang.String r0 = r15.A03
            java.lang.String r6 = X.C17970vW.A04(r0)
            X.C17960vV.A07(r6)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerThumbLoader/download "
            r1.append(r0)
            java.lang.String r4 = r15.A04
            X.C17890vO.A1A(r1, r4)
            r0 = 11
            android.net.TrafficStats.setThreadStatsTag(r0)
            r3 = 0
            X.734 r8 = r14.A00     // Catch:{ IOException -> 0x00c9 }
            r0 = 0
            X.C18070vi.A0d(r4, r0)     // Catch:{ IOException -> 0x00c9 }
            X.11P r7 = r8.A04     // Catch:{ IOException -> 0x00c9 }
            long r0 = X.AnonymousClass11P.A01(r7)     // Catch:{ IOException -> 0x00c9 }
            r5 = 0
            javax.net.ssl.HttpsURLConnection r5 = X.AnonymousClass734.A02(r8, r4)     // Catch:{ IOException -> 0x00b5 }
            r5.connect()     // Catch:{ IOException -> 0x00b3, all -> 0x00c2 }
            X.AUZ r2 = new X.AUZ     // Catch:{ IOException -> 0x00b3, all -> 0x00c2 }
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x00b3, all -> 0x00c2 }
            long r12 = X.AnonymousClass11P.A01(r7)     // Catch:{ all -> 0x00ac }
            long r12 = r12 - r0
            java.net.HttpURLConnection r0 = r2.A01     // Catch:{ all -> 0x00ac }
            java.net.URL r9 = r0.getURL()     // Catch:{ all -> 0x00ac }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x00ac }
            int r0 = r0.getResponseCode()     // Catch:{ all -> 0x00ac }
            long r10 = (long) r0     // Catch:{ all -> 0x00ac }
            r8.A04(r9, r10, r12)     // Catch:{ all -> 0x00ac }
            X.181 r1 = r8.A03     // Catch:{ all -> 0x00ac }
            r0 = 26
            X.9Hb r8 = X.C108955ca.A0N(r1, r2, r3, r0)     // Catch:{ all -> 0x00ac }
            java.io.ByteArrayOutputStream r9 = X.C108945cZ.A15()     // Catch:{ all -> 0x00a5 }
            X.C26208Cuj.A01(r8)     // Catch:{ all -> 0x00a5 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00a5 }
        L_0x005f:
            int r1 = r8.read(r7)     // Catch:{ all -> 0x00a5 }
            r0 = -1
            if (r1 != r0) goto L_0x0070
            byte[] r0 = r9.toByteArray()     // Catch:{ all -> 0x00a5 }
            java.io.ByteArrayInputStream r7 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x00a5 }
            r7.<init>(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x0075
        L_0x0070:
            r0 = 0
            r9.write(r7, r0, r1)     // Catch:{ all -> 0x00a5 }
            goto L_0x005f
        L_0x0075:
            r8.close()     // Catch:{ all -> 0x00ac }
            r2.close()     // Catch:{ IOException -> 0x00b3, all -> 0x00c2 }
            r5.disconnect()     // Catch:{ IOException -> 0x00c9 }
            X.A5O r5 = r14.A03     // Catch:{ all -> 0x009b }
            r5.A04(r7, r6)     // Catch:{ all -> 0x009b }
            int r2 = r15.A02     // Catch:{ all -> 0x009b }
            int r1 = r15.A01     // Catch:{ all -> 0x009b }
            r0 = 0
            android.graphics.Bitmap r3 = r5.A02(r6, r2, r1, r0)     // Catch:{ all -> 0x009b }
            if (r3 != 0) goto L_0x0097
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "StickerThumbLoader/decode failed "
            X.C17900vP.A0e(r0, r4, r1)     // Catch:{ all -> 0x009b }
        L_0x0097:
            r7.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00d3
        L_0x009b:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x00c9 }
        L_0x00a4:
            throw r1     // Catch:{ IOException -> 0x00c9 }
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x00ac }
            throw r0     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x00b3, all -> 0x00c2 }
            throw r0     // Catch:{ IOException -> 0x00b3, all -> 0x00c2 }
        L_0x00b3:
            r2 = move-exception
            goto L_0x00b6
        L_0x00b5:
            r2 = move-exception
        L_0x00b6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "StickerPackNetworkProvider/preview thumbnail decode failed "
            X.C17900vP.A0h(r0, r4, r1, r2)     // Catch:{ all -> 0x00c0 }
            throw r2     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r0 = move-exception
        L_0x00c3:
            if (r5 == 0) goto L_0x00c8
            r5.disconnect()     // Catch:{ IOException -> 0x00c9 }
        L_0x00c8:
            throw r0     // Catch:{ IOException -> 0x00c9 }
        L_0x00c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00df }
            java.lang.String r0 = "StickerThumbLoader/error downloading "
            X.C17900vP.A0h(r0, r4, r1, r2)     // Catch:{ all -> 0x00df }
        L_0x00d3:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r3)
            return r0
        L_0x00df:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115505vA.A01(X.9h4):android.util.Pair");
    }
}
