package X;

/* renamed from: X.9nD  reason: invalid class name and case insensitive filesystem */
public class C191809nD {
    public final AnonymousClass181 A00;
    public final C18030ve A01;
    public final AnonymousClass1D9 A02;
    public final B8O A03;
    public final C25461Oh A04;
    public final C198129xp A05;
    public final C24481Km A06;
    public final C220418j A07;
    public final AnonymousClass190 A08;
    public final C0L A09;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        r2.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
        r1 = r10.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (X.C198129xp.A00(r6, r1).A00(r6).exists() == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r5.A02(r6.id, 3);
        r3.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b1, code lost:
        X.C18070vi.A0d(r3, 1);
        r1 = X.C198129xp.A00(r6, r1).A00(r6);
        r0 = r1.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c1, code lost:
        if (r0 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c3, code lost:
        X.AnonymousClass8BV.A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.C64062u9.A0I(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r5.A02(r6.id, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ce, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d3, code lost:
        return java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0140, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0141, code lost:
        X.C108995ce.A1M("InternalDirFileStorageManager/put/failed/", X.AnonymousClass000.A10(), r2);
        r5.A02(r6.id, 8);
        r3.delete();
        r1 = X.C17880vN.A0f("NetworkResourceDownload/file-rename-failed");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A00() {
        /*
            r10 = this;
            X.0ve r8 = r10.A01
            r1 = 3005(0xbbd, float:4.211E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0174
            X.C0L r6 = r10.A09
            r0 = 21
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException -> 0x015d }
            java.lang.String r1 = "downloading-"
            java.lang.String r0 = ".tmp"
            java.io.File r3 = java.io.File.createTempFile(r1, r0)     // Catch:{ all -> 0x015b }
            X.1Oh r5 = r10.A04     // Catch:{ all -> 0x015b }
            java.lang.String r0 = r6.id     // Catch:{ all -> 0x015b }
            int r1 = r5.A01(r0)     // Catch:{ all -> 0x015b }
            r0 = 5
            if (r1 != r0) goto L_0x002c
            java.lang.String r1 = r6.id     // Catch:{ all -> 0x015b }
            r0 = 2
            r5.A02(r1, r0)     // Catch:{ all -> 0x015b }
        L_0x002c:
            r0 = 1
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x015b }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x015b }
            java.lang.String r7 = r6.id     // Catch:{ all -> 0x0136 }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ all -> 0x0136 }
            java.lang.String r1 = "cat"
            java.lang.String r0 = "nw_media"
            r4.put(r1, r0)     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "id"
            r4.put(r0, r7)     // Catch:{ all -> 0x0136 }
            X.1Km r1 = r10.A06     // Catch:{ all -> 0x0136 }
            java.lang.String r0 = "/wa/static/network_resource"
            android.net.Uri$Builder r0 = X.C88574a9.A00(r8, r1, r0)     // Catch:{ all -> 0x0136 }
            java.lang.String r7 = X.C88574a9.A02(r0, r4)     // Catch:{ all -> 0x0136 }
            X.1D9 r4 = r10.A02     // Catch:{ all -> 0x0134 }
            X.18j r1 = r10.A07     // Catch:{ all -> 0x0134 }
            r0 = 0
            X.AUZ r4 = r4.A05(r0, r1, r7, r0)     // Catch:{ all -> 0x0134 }
            java.net.HttpURLConnection r0 = r4.A01     // Catch:{ all -> 0x012a }
            int r7 = r0.getResponseCode()     // Catch:{ all -> 0x012a }
            r0 = 200(0xc8, float:2.8E-43)
            r8 = 22
            r9 = 0
            if (r7 != r0) goto L_0x00d4
            X.181 r7 = r10.A00     // Catch:{ all -> 0x012a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x012a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012a }
            X.9Hb r8 = r4.BMP(r7, r1, r0)     // Catch:{ all -> 0x012a }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x0120 }
        L_0x0078:
            int r1 = r8.read(r7)     // Catch:{ all -> 0x0120 }
            r0 = -1
            if (r1 == r0) goto L_0x008b
            X.B8O r0 = r10.A03     // Catch:{ all -> 0x0120 }
            boolean r0 = r0.BeV()     // Catch:{ all -> 0x0120 }
            if (r0 != 0) goto L_0x010f
            r2.write(r7, r9, r1)     // Catch:{ all -> 0x0120 }
            goto L_0x0078
        L_0x008b:
            r2.flush()     // Catch:{ all -> 0x0120 }
            r8.close()     // Catch:{ all -> 0x012a }
            r4.close()     // Catch:{ all -> 0x0134 }
            r2.close()     // Catch:{ all -> 0x015b }
            X.9xp r1 = r10.A05     // Catch:{ all -> 0x015b }
            X.9lH r0 = X.C198129xp.A00(r6, r1)     // Catch:{ all -> 0x015b }
            java.io.File r0 = r0.A00(r6)     // Catch:{ all -> 0x015b }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x015b }
            r2 = 3
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r6.id     // Catch:{ all -> 0x015b }
            r5.A02(r0, r2)     // Catch:{ all -> 0x015b }
            r3.delete()     // Catch:{ all -> 0x015b }
            goto L_0x00ce
        L_0x00b1:
            r0 = 1
            X.C18070vi.A0d(r3, r0)     // Catch:{ all -> 0x015b }
            X.9lH r0 = X.C198129xp.A00(r6, r1)     // Catch:{ all -> 0x015b }
            java.io.File r1 = r0.A00(r6)     // Catch:{ all -> 0x015b }
            java.io.File r0 = r1.getParentFile()     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x00c6
            X.AnonymousClass8BV.A1H(r0)     // Catch:{ all -> 0x015b }
        L_0x00c6:
            X.C64062u9.A0I(r3, r1)     // Catch:{ Exception -> 0x0140 }
            java.lang.String r0 = r6.id     // Catch:{ IOException -> 0x015d }
            r5.A02(r0, r2)     // Catch:{ IOException -> 0x015d }
        L_0x00ce:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00d4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x012a }
            java.lang.String r0 = "NetworkResourceDownload/ response code: "
            X.C17900vP.A0i(r0, r1, r7)     // Catch:{ all -> 0x012a }
            X.181 r3 = r10.A00     // Catch:{ all -> 0x012a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x012a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x012a }
            X.9Hb r8 = r4.BMO(r3, r1, r0)     // Catch:{ all -> 0x012a }
            java.lang.String r1 = r6.id     // Catch:{ all -> 0x0120 }
            r0 = 6
            r5.A02(r1, r0)     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "NetworkResourceDownload/responseCode:"
            r1.append(r0)     // Catch:{ all -> 0x0120 }
            r1.append(r7)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "; error="
            r1.append(r0)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = X.AnonymousClass1EY.A00(r8)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0120 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0120 }
            goto L_0x011f
        L_0x010f:
            java.lang.String r1 = r6.id     // Catch:{ all -> 0x0120 }
            r0 = 7
            r5.A02(r1, r0)     // Catch:{ all -> 0x0120 }
            r3.delete()     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = "NetworkResourceDownload/user-canceled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0120 }
            r0.<init>(r1)     // Catch:{ all -> 0x0120 }
        L_0x011f:
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0125 }
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x012a }
        L_0x0129:
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x012f }
            goto L_0x0133
        L_0x012f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0134 }
        L_0x0133:
            throw r1     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0136 }
        L_0x0136:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x013b }
            goto L_0x015a
        L_0x013b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x015b }
            goto L_0x015a
        L_0x0140:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "InternalDirFileStorageManager/put/failed/"
            X.C108995ce.A1M(r0, r1, r2)     // Catch:{ all -> 0x015b }
            java.lang.String r1 = r6.id     // Catch:{ all -> 0x015b }
            r0 = 8
            r5.A02(r1, r0)     // Catch:{ all -> 0x015b }
            r3.delete()     // Catch:{ all -> 0x015b }
            java.lang.String r0 = "NetworkResourceDownload/file-rename-failed"
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x015b }
        L_0x015a:
            throw r1     // Catch:{ all -> 0x015b }
        L_0x015b:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x015d }
        L_0x015d:
            r3 = move-exception
            X.190 r2 = r10.A08     // Catch:{ all -> 0x016f }
            java.lang.String r1 = "NetworkResourceDownload/"
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x016f }
            r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x016f }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x016f }
            android.net.TrafficStats.clearThreadStatsTag()
            return r0
        L_0x016f:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0174:
            java.lang.String r1 = "NetworkResourceDownload/ABProp disabled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191809nD.A00():java.lang.Boolean");
    }

    public C191809nD(AnonymousClass190 r1, AnonymousClass181 r2, C18030ve r3, AnonymousClass1D9 r4, B8O b8o, C25461Oh r6, C0L c0l, C198129xp r8, C24481Km r9, C220418j r10) {
        this.A09 = c0l;
        this.A04 = r6;
        this.A01 = r3;
        this.A08 = r1;
        this.A00 = r2;
        this.A02 = r4;
        this.A07 = r10;
        this.A06 = r9;
        this.A03 = b8o;
        this.A05 = r8;
    }
}
