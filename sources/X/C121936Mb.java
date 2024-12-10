package X;

import android.content.Context;
import android.webkit.URLUtil;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.6Mb  reason: invalid class name and case insensitive filesystem */
public class C121936Mb extends A34 {
    public static final HashMap A0A = C17880vN.A11();
    public final int A00;
    public final long A01;
    public final AnonymousClass181 A02;
    public final C26881Tv A03;
    public final AnonymousClass118 A04;
    public final C55782gM A05;
    public final AnonymousClass1U8 A06;
    public final C220418j A07;
    public final AnonymousClass11W A08;
    public final AnonymousClass10I A09;

    public static void A01(AnonymousClass181 r7, C26881Tv r8, AnonymousClass118 r9, C55782gM r10, AnonymousClass1U8 r11, C220418j r12, AnonymousClass11W r13, AnonymousClass10I r14, int i, long j) {
        HashMap hashMap = A0A;
        synchronized (hashMap) {
            AnonymousClass1BI r4 = r10.A03;
            if (hashMap.containsKey(r4)) {
                C121936Mb r3 = (C121936Mb) hashMap.get(r4);
                C55782gM r2 = r3.A05;
                if (!r2.A06.equals(r10.A06)) {
                    r3.A0B(true);
                    hashMap.remove(r2.A03);
                } else if (r3.A09() != 1) {
                    hashMap.remove(r2.A03);
                }
            }
            C121936Mb r6 = new C121936Mb(r7, r8, r9, r10, r11, r12, r13, r14, i, j);
            hashMap.put(r4, r6);
            C17890vO.A0u(r6, r14);
        }
    }

    public void A0E() {
        C108985cd.A1C(A00(this.A04.A00, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (r10 != 0) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.C17900vP.A0Z(r4, "ProfilePictureDownload: IO Exception in middle of download: ", X.AnonymousClass000.A10());
        r13 = new X.C129796iN(r14, r15, 0, 5, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0155, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0156, code lost:
        r2 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ba, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d1, code lost:
        if (r5 == null) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01d5, code lost:
        r2 = r5;
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01d7, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01da, code lost:
        if (r2 != null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01e1, code lost:
        com.whatsapp.util.Log.w("ProfilePictureDownload: Could not close connection input stream", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0155 A[ExcHandler: 6Si (e X.6Si), Splitter:B:15:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0197 A[Catch:{ all -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a8 A[Catch:{ all -> 0x01d0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01bf A[SYNTHETIC, Splitter:B:79:0x01bf] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d4 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x006b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r20) {
        /*
            r19 = this;
            r14 = r19
            X.118 r0 = r14.A04
            android.content.Context r0 = r0.A00
            java.io.File r15 = A00(r0, r14)
            boolean r0 = r15.createNewFile()     // Catch:{ IOException -> 0x01f6 }
            if (r0 != 0) goto L_0x0015
            long r0 = r15.length()     // Catch:{ IOException -> 0x01f6 }
            goto L_0x0017
        L_0x0015:
            r0 = 0
        L_0x0017:
            java.lang.String r8 = "ProfilePictureDownload: Could not close connection input stream"
            java.lang.String r7 = "ProfilePictureDownload: Could not close FileOutputStream "
            r4 = 1
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x01ed }
            r6.<init>(r15, r4)     // Catch:{ FileNotFoundException -> 0x01ed }
            r5 = 0
            X.2gM r2 = r14.A05     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.net.URL r11 = r2.A06     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.net.URLConnection r3 = r11.openConnection()     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            boolean r2 = r3 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            if (r2 == 0) goto L_0x015d
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            X.18j r2 = r14.A07     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            X.9A9 r2 = r2.A02()     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            r3.setSSLSocketFactory(r2)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r2)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            X.11W r2 = r14.A08     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r9 = r2.A02()     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r2 = "User-Agent"
            r3.setRequestProperty(r2, r9)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            r12 = 0
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r2 = "bytes="
            r9.append(r2)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            r9.append(r0)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r2 = "-"
            java.lang.String r9 = X.AnonymousClass000.A0y(r2, r9)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r2 = "Range"
            r3.setRequestProperty(r2, r9)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
        L_0x006b:
            r3.connect()     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r9 = 206(0xce, float:2.89E-43)
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            r0 = 200(0xc8, float:2.8E-43)
            if (r10 <= 0) goto L_0x007c
            r0 = 206(0xce, float:2.89E-43)
        L_0x007c:
            if (r2 != r0) goto L_0x013d
            X.181 r0 = r14.A02     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r12 = 0
            X.9Hb r5 = X.C108995ce.A0N(r0, r3, r12)     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r10 = new byte[r0]     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
        L_0x0089:
            r0 = 8192(0x2000, float:1.14794E-41)
            int r1 = r5.read(r10, r12, r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r0 = -1
            if (r1 == r0) goto L_0x00a9
            boolean r0 = X.C108945cZ.A1T(r14)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            if (r0 == 0) goto L_0x00a5
            X.6iN r13 = new X.6iN     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r16 = r4
            r17 = r4
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            goto L_0x0135
        L_0x00a5:
            r6.write(r10, r12, r1)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            goto L_0x0089
        L_0x00a9:
            r6.flush()     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            if (r2 != r9) goto L_0x00cd
            java.lang.String r0 = "Content-Range"
            java.lang.String r1 = r3.getHeaderField(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            if (r0 != 0) goto L_0x00cb
            java.lang.String r0 = "/"
            java.lang.String[] r9 = r1.split(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            int r1 = r9.length     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r0 = 2
            if (r1 != r0) goto L_0x00cb
            r0 = r9[r4]     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            goto L_0x00d1
        L_0x00cb:
            r10 = -1
            goto L_0x00d3
        L_0x00cd:
            int r10 = r3.getContentLength()     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
        L_0x00d1:
            if (r10 == 0) goto L_0x0114
        L_0x00d3:
            long r0 = (long) r10     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            long r12 = r15.length()     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            int r9 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r9 == 0) goto L_0x0114
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = "ProfilePictureDownload: Length mismatch between CDN response and stored file: "
            r9.append(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r9.append(r11)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = " responseCode:"
            r9.append(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r9.append(r2)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = " contentLength:"
            r9.append(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r9.append(r10)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = " fileLength:"
            r9.append(r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            long r0 = r15.length()     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = X.C17880vN.A0u(r9, r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r17 = 6
            X.6iN r13 = new X.6iN     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r16 = r4
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            goto L_0x0135
        L_0x0114:
            r16 = 2
            X.6iN r13 = new X.6iN     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            r18 = r2
            r17 = r4
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0120, 6Si -> 0x0155, all -> 0x01d4 }
            goto L_0x0135
        L_0x0120:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = "ProfilePictureDownload: IO Exception in middle of download: "
            X.C17900vP.A0Z(r4, r0, r1)     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r16 = 0
            r17 = 5
            X.6iN r13 = new X.6iN     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
        L_0x0135:
            r3.disconnect()
            r5.close()     // Catch:{ IOException -> 0x01c3 }
            goto L_0x01c7
        L_0x013d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            java.lang.String r0 = "ProfilePictureDownload: Non Success Response from CDN: "
            X.C17900vP.A0k(r0, r1, r2)     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r17 = 6
            X.6iN r13 = new X.6iN     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r16 = r4
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0159, 6Si -> 0x0155, all -> 0x01d4 }
            r3.disconnect()
            goto L_0x01c7
        L_0x0155:
            r1 = move-exception
            r2 = r5
            r5 = r3
            goto L_0x0178
        L_0x0159:
            r1 = move-exception
            r2 = r5
            r5 = r3
            goto L_0x018b
        L_0x015d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r0 = "Could not get HTTPS Connection:"
            r1.append(r0)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r0 = X.C17890vO.A0U(r3)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            X.6Si r0 = new X.6Si     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            r0.<init>(r14, r1)     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
            throw r0     // Catch:{ IOException -> 0x0189, 6Si -> 0x0176, all -> 0x0174 }
        L_0x0174:
            r1 = move-exception
            goto L_0x01e4
        L_0x0176:
            r1 = move-exception
            r2 = r5
        L_0x0178:
            java.lang.String r0 = "ProfilePictureDownload: "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01d0 }
            r17 = 4
            r18 = -1
            r16 = 0
            X.6iN r13 = new X.6iN     // Catch:{ all -> 0x01d0 }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d0 }
            goto L_0x01b8
        L_0x0189:
            r1 = move-exception
            r2 = r5
        L_0x018b:
            boolean r0 = r1 instanceof java.net.UnknownHostException     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r1 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r1 instanceof java.net.ConnectException     // Catch:{ all -> 0x01d0 }
            if (r0 != 0) goto L_0x01a8
            java.lang.String r0 = "ProfilePictureDownload: Fatal error connecting to CDN "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01d0 }
            r17 = 4
            r18 = -1
            r16 = 1
            X.6iN r13 = new X.6iN     // Catch:{ all -> 0x01d0 }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d0 }
            goto L_0x01b8
        L_0x01a8:
            java.lang.String r0 = "ProfilePictureDownload: Transient error connecting to CDN "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x01d0 }
            r17 = 4
            r18 = -1
            r16 = 0
            X.6iN r13 = new X.6iN     // Catch:{ all -> 0x01d0 }
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01d0 }
        L_0x01b8:
            if (r5 == 0) goto L_0x01bd
            r5.disconnect()
        L_0x01bd:
            if (r2 == 0) goto L_0x01c7
            r2.close()     // Catch:{ IOException -> 0x01c3 }
            goto L_0x01c7
        L_0x01c3:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)
        L_0x01c7:
            r6.close()     // Catch:{ IOException -> 0x01cb }
            return r13
        L_0x01cb:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)
            return r13
        L_0x01d0:
            r1 = move-exception
            if (r5 == 0) goto L_0x01da
            goto L_0x01d7
        L_0x01d4:
            r1 = move-exception
            r2 = r5
            r5 = r3
        L_0x01d7:
            r5.disconnect()
        L_0x01da:
            if (r2 == 0) goto L_0x01e4
            r2.close()     // Catch:{ IOException -> 0x01e0 }
            goto L_0x01e4
        L_0x01e0:
            r0 = move-exception
            com.whatsapp.util.Log.w(r8, r0)
        L_0x01e4:
            r6.close()     // Catch:{ IOException -> 0x01e8 }
            throw r1
        L_0x01e8:
            r0 = move-exception
            com.whatsapp.util.Log.w(r7, r0)
            throw r1
        L_0x01ed:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not open FileOutputStream "
            com.whatsapp.util.Log.w(r0, r1)
            r5 = 5
            r6 = -1
            goto L_0x01ff
        L_0x01f6:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Failed, could not create temp file:"
            com.whatsapp.util.Log.w(r0, r1)
            r5 = 5
            r6 = -1
            r4 = 1
        L_0x01ff:
            X.6iN r13 = new X.6iN
            r1 = r13
            r2 = r14
            r3 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121936Mb.A0G(java.lang.Object[]):java.lang.Object");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r14) {
        /*
            r13 = this;
            X.6iN r14 = (X.C129796iN) r14
            int r1 = r14.A02
            r0 = 2
            if (r1 != r0) goto L_0x003c
            java.io.File r0 = r14.A03
            long r2 = r0.length()
            int r1 = (int) r2
            byte[] r4 = new byte[r1]
            java.io.FileInputStream r3 = X.C108945cZ.A18(r0)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002e }
            r2.<init>(r3)     // Catch:{ all -> 0x002e }
            r0 = 0
            r2.read(r4, r0, r1)     // Catch:{ all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x002e }
            r3.close()     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
            goto L_0x0061
        L_0x0024:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x002e }
        L_0x002d:
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
        L_0x0037:
            throw r1     // Catch:{ FileNotFoundException -> 0x005b, IOException -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
            goto L_0x005e
        L_0x003c:
            if (r1 != 0) goto L_0x006a
            int r1 = r13.A00
            r0 = 3
            if (r1 >= r0) goto L_0x006a
            X.118 r4 = r13.A04
            X.11W r8 = r13.A08
            X.10I r9 = r13.A09
            X.181 r2 = r13.A02
            X.18j r7 = r13.A07
            X.1Tv r3 = r13.A03
            X.1U8 r6 = r13.A06
            X.2gM r5 = r13.A05
            int r10 = r1 + 1
            long r11 = r13.A01
            A01(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
        L_0x005e:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0061:
            X.2gM r1 = r13.A05
            r1.A00 = r4
            X.1Tv r0 = r13.A03
            r0.A04(r1)
        L_0x006a:
            X.1U8 r5 = r13.A06
            int r8 = r14.A01
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r13.A01
            java.lang.Long r7 = X.C108945cZ.A1B(r2, r0)
            java.io.File r4 = r14.A03
            long r0 = r4.length()
            double r2 = (double) r0
            java.lang.Double r6 = java.lang.Double.valueOf(r2)
            int r10 = r14.A00
            r9 = 2
            r5.A00(r6, r7, r8, r9, r10)
            java.util.HashMap r1 = A0A
            monitor-enter(r1)
            X.2gM r0 = r13.A05     // Catch:{ all -> 0x0098 }
            X.1BI r0 = r0.A03     // Catch:{ all -> 0x0098 }
            r1.remove(r0)     // Catch:{ all -> 0x0098 }
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            r4.delete()
            return
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121936Mb.A0H(java.lang.Object):void");
    }

    public C121936Mb(AnonymousClass181 r1, C26881Tv r2, AnonymousClass118 r3, C55782gM r4, AnonymousClass1U8 r5, C220418j r6, AnonymousClass11W r7, AnonymousClass10I r8, int i, long j) {
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r1;
        this.A07 = r6;
        this.A03 = r2;
        this.A06 = r5;
        this.A05 = r4;
        this.A00 = i;
        this.A01 = j;
    }

    public static File A00(Context context, C121936Mb r3) {
        File A0e = C17880vN.A0e(context.getCacheDir(), "ProfilePictureTemp");
        A0e.mkdirs();
        return C17880vN.A0e(A0e, URLUtil.guessFileName(r3.A05.A06.toString(), (String) null, (String) null));
    }
}
