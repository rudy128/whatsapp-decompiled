package X;

import java.io.File;

/* renamed from: X.6pn  reason: invalid class name and case insensitive filesystem */
public final class C133966pn {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass118 A02;
    public final C24481Km A03;
    public final C127896f7 A04;
    public final AnonymousClass00H A05;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (X.C137456vU.A00(r4) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(X.AnonymousClass725 r13) {
        /*
            r12 = this;
            r9 = 0
            X.C17960vV.A00()
            boolean r0 = r13.A0W
            if (r0 != 0) goto L_0x0139
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "https://static.whatsapp.net/sticker?img="
            r1.append(r0)
            java.lang.String r0 = r13.A0M
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            if (r2 == 0) goto L_0x0139
            X.0ve r4 = r12.A00
            r0 = 5693(0x163d, float:7.978E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r4, r0)
            if (r0 == 0) goto L_0x0031
            r0 = 6785(0x1a81, float:9.508E-42)
            java.lang.String r0 = X.C18020vd.A01(r1, r4, r0)
            if (r0 == 0) goto L_0x0031
            java.lang.String r2 = X.C17900vP.A0A(r2, r0)
        L_0x0031:
            X.1Km r0 = r12.A03
            java.lang.String r3 = r0.A01(r2)
            X.C18070vi.A0X(r3)
            boolean r0 = r13.A0S
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = X.AnonymousClass725.A00(r13)
            java.io.File r4 = r12.A00(r0, r9)
            if (r4 == 0) goto L_0x0139
            X.118 r0 = r12.A02
            android.content.Context r1 = r0.A00
            r0 = 2131231710(0x7f0803de, float:1.8079509E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3MX.A06(r1, r0)
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r3 = r0.getBitmap()
            java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            r0 = 100
            byte[] r0 = X.C108955ca.A1a(r1, r3, r2, r0)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            r0 = 5120(0x1400, double:2.5296E-320)
            boolean r5 = X.C64062u9.A0U(r4, r2, r0)
        L_0x0070:
            return r5
        L_0x0071:
            X.6f7 r7 = r12.A04
            java.lang.String r2 = X.AnonymousClass725.A00(r13)
            boolean r0 = r13.A08
            if (r0 == 0) goto L_0x0082
            boolean r1 = X.C137456vU.A00(r4)
            r0 = 1
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            java.io.File r11 = r12.A00(r2, r0)
            r1 = 0
            java.lang.String r4 = "StaticContentDownloader/download/error downloading: "
            if (r11 == 0) goto L_0x012e
            r10 = 9
            android.net.TrafficStats.setThreadStatsTag(r10)     // Catch:{ IOException -> 0x011d }
            X.1D9 r0 = r7.A01     // Catch:{ IOException -> 0x011d }
            X.AUZ r6 = r0.A07(r1, r3, r1)     // Catch:{ IOException -> 0x011d }
            java.net.HttpURLConnection r5 = r6.A01     // Catch:{ all -> 0x0116 }
            int r1 = r5.getResponseCode()     // Catch:{ all -> 0x0116 }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x00fc
            X.181 r1 = r7.A00     // Catch:{ all -> 0x0116 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0116 }
            X.9Hb r0 = r6.BMP(r1, r0, r0)     // Catch:{ all -> 0x0116 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0116 }
            r7.<init>(r0)     // Catch:{ all -> 0x0116 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r11)     // Catch:{ IOException -> 0x00d7 }
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00d7 }
            r8.<init>(r0)     // Catch:{ IOException -> 0x00d7 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r5 = new byte[r0]     // Catch:{ all -> 0x00cd }
        L_0x00bd:
            int r1 = r7.read(r5)     // Catch:{ all -> 0x00cd }
            r0 = -1
            if (r1 == r0) goto L_0x00c8
            r8.write(r5, r9, r1)     // Catch:{ all -> 0x00cd }
            goto L_0x00bd
        L_0x00c8:
            r8.close()     // Catch:{ IOException -> 0x00d7 }
            r5 = 1
            goto L_0x00e9
        L_0x00cd:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00d2 }
            goto L_0x00d6
        L_0x00d2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x00d7 }
        L_0x00d6:
            throw r1     // Catch:{ IOException -> 0x00d7 }
        L_0x00d7:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "FileUtils/saveInputStreamToFile/could not save file to:"
            r1.append(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            X.C108985cd.A1M(r0, r1, r5)     // Catch:{ all -> 0x00f5 }
            r5 = 0
        L_0x00e9:
            r7.close()     // Catch:{ all -> 0x0116 }
            r6.close()     // Catch:{ IOException -> 0x011d }
            android.net.TrafficStats.setThreadStatsTag(r10)
            if (r5 != 0) goto L_0x0070
            goto L_0x012f
        L_0x00f5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0116 }
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x00fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0116 }
            r1.append(r3)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = ", returned code: "
            r1.append(r0)     // Catch:{ all -> 0x0116 }
            int r0 = r5.getResponseCode()     // Catch:{ all -> 0x0116 }
            r1.append(r0)     // Catch:{ all -> 0x0116 }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0116 }
            r6.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x012b
        L_0x0116:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ IOException -> 0x011d }
            throw r0     // Catch:{ IOException -> 0x011d }
        L_0x011d:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0126 }
            X.C17900vP.A0h(r4, r3, r0, r1)     // Catch:{ all -> 0x0126 }
            goto L_0x012b
        L_0x0126:
            r0 = move-exception
            android.net.TrafficStats.setThreadStatsTag(r10)
            throw r0
        L_0x012b:
            android.net.TrafficStats.setThreadStatsTag(r10)
        L_0x012e:
            r5 = 0
        L_0x012f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerPackTrayIconDownloader/failed to download tray icon for sticker pack "
            X.C17900vP.A0e(r0, r2, r1)
            return r5
        L_0x0139:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133966pn.A01(X.725):boolean");
    }

    public final File A00(String str, boolean z) {
        return ((C138926xv) this.A05.get()).A01(C108995ce.A0Z(str), z);
    }

    public C133966pn(AnonymousClass118 r2, C18030ve r3, C24481Km r4, C127896f7 r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r6, r5, r4);
        C18070vi.A0d(r7, 6);
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = r6;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r7;
    }
}
