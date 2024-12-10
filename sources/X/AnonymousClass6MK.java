package X;

import com.whatsapp.media.WamediaManager;
import java.io.File;

/* renamed from: X.6MK  reason: invalid class name */
public abstract class AnonymousClass6MK extends A34 {
    public final C18030ve A00;
    public final AnonymousClass892 A01;
    public final AnonymousClass893 A02;
    public final String A03;
    public final AnonymousClass190 A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass11P A06;
    public final WamediaManager A07;
    public final boolean A08;
    public final AnonymousClass1NM A09;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        File file;
        C132626nC r5 = (C132626nC) obj;
        AnonymousClass892 r3 = this.A01;
        String str = this.A03;
        byte[] bArr = null;
        if (r5 == null) {
            file = null;
        } else {
            file = r5.A00;
            bArr = r5.A01;
        }
        r3.BuY(file, str, bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c7, code lost:
        if (r4 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0110, code lost:
        r2 = X.C1408873l.A04(r8);
        r20 = X.AnonymousClass11P.A01(r20) - r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011c, code lost:
        if (r10.A08 == false) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011e, code lost:
        r0 = r10.A07;
        r0.removeAudioTracks(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r0.applyGifTag(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0127, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        com.whatsapp.util.Log.e("ProcessGifTask/processGif/applyGifTag failed", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r15 = new X.C132626nC(r8, r2, r18, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        r3.close();
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c2, code lost:
        if (r3 == null) goto L_0x01c7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x01db A[SYNTHETIC, Splitter:B:112:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e0 A[Catch:{ IOException -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C132626nC A0J() {
        /*
            r23 = this;
            r10 = r23
            java.lang.String r9 = r10.A03
            X.8CU r0 = r10.A02
            r22 = r0
            boolean r0 = r22.isCancelled()
            r13 = 0
            if (r0 != 0) goto L_0x0028
            X.893 r6 = r10.A02
            X.6gA r1 = r6.BM6(r9)
            if (r1 == 0) goto L_0x0029
            java.lang.String r0 = r1.A00
            java.io.File r14 = X.C108945cZ.A17(r0)
            byte[] r15 = r1.A02
            r16 = -1
            X.6nC r13 = new X.6nC
            r18 = r16
            r13.<init>(r14, r15, r16, r18)
        L_0x0028:
            return r13
        L_0x0029:
            X.11P r0 = r10.A06
            r20 = r0
            long r16 = X.AnonymousClass11P.A01(r20)
            r0 = 10
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x01b9, all -> 0x01d4 }
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x01b9, all -> 0x01d4 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01b9, all -> 0x01d4 }
            java.lang.String r0 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
            java.net.URLConnection r5 = r1.openConnection()     // Catch:{ Exception -> 0x01b9, all -> 0x01d4 }
            X.C18070vi.A0z(r5, r0)     // Catch:{ Exception -> 0x01b9, all -> 0x01d4 }
            javax.net.ssl.HttpsURLConnection r5 = (javax.net.ssl.HttpsURLConnection) r5     // Catch:{ Exception -> 0x01b9, all -> 0x01d4 }
            r5.connect()     // Catch:{ Exception -> 0x01b7, all -> 0x01cd }
            int r1 = r5.getResponseCode()     // Catch:{ Exception -> 0x01b7, all -> 0x01cd }
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0056
            r5.disconnect()
            goto L_0x017e
        L_0x0056:
            int r12 = r5.getContentLength()     // Catch:{ Exception -> 0x01b7, all -> 0x01cd }
            X.181 r0 = r10.A05     // Catch:{ Exception -> 0x01b7, all -> 0x01cd }
            r11 = 0
            X.9Hb r4 = X.C108995ce.A0N(r0, r5, r11)     // Catch:{ Exception -> 0x01b7, all -> 0x01cd }
            boolean r0 = r10 instanceof X.AnonymousClass66M     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            if (r0 == 0) goto L_0x00c4
            r7 = r10
            X.66M r7 = (X.AnonymousClass66M) r7     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.893 r1 = r7.A02     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            boolean r0 = r1 instanceof X.C144527Hq     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            if (r0 == 0) goto L_0x009c
            X.7Hq r1 = (X.C144527Hq) r1     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = r7.A03     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.C18070vi.A0d(r0, r11)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.C144527Hq.A00(r1)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            com.facebook.stash.core.FileStash r2 = r1.A00     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.C17960vV.A07(r2)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = X.C17970vW.A04(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            r1.append(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = ".gif"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.io.File r8 = r2.insertFile(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.C18070vi.A0X(r8)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
        L_0x0095:
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r8)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x00df
        L_0x009c:
            X.118 r0 = r7.A00     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            android.content.Context r3 = r0.A00     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.0ve r2 = r7.A00     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.00H r1 = r7.A01     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = "gif/gif_preview_cache"
            java.io.File r2 = X.C124296Xu.A00(r3, r2, r1, r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            if (r2 == 0) goto L_0x01ac
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = r7.A03     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = X.C17970vW.A04(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            r1.append(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = ".gif"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.io.File r8 = X.C17880vN.A0e(r2, r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            goto L_0x0095
        L_0x00c4:
            r0 = r10
            X.66L r0 = (X.AnonymousClass66L) r0     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            X.17r r2 = r0.A00     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = X.C26511Sk.A0K()     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            r1.append(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            java.io.File r8 = r2.A0a(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            goto L_0x0095
        L_0x00df:
            byte[] r7 = new byte[r0]     // Catch:{ Exception -> 0x01aa }
            r18 = 0
        L_0x00e3:
            int r2 = r4.read(r7)     // Catch:{ Exception -> 0x01aa }
            r0 = -1
            if (r2 == r0) goto L_0x0110
            boolean r0 = r22.isCancelled()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x00f5
            r4.close()     // Catch:{ Exception -> 0x01aa }
            goto L_0x0175
        L_0x00f5:
            long r0 = (long) r2     // Catch:{ Exception -> 0x01aa }
            long r18 = r18 + r0
            if (r12 <= 0) goto L_0x010b
            java.lang.Object[] r13 = X.AnonymousClass3MW.A1a()     // Catch:{ Exception -> 0x01aa }
            r0 = 100
            long r0 = r0 * r18
            long r14 = (long) r12     // Catch:{ Exception -> 0x01aa }
            long r0 = r0 / r14
            int r14 = (int) r0     // Catch:{ Exception -> 0x01aa }
            X.C17880vN.A1T(r13, r14, r11)     // Catch:{ Exception -> 0x01aa }
            r10.A0C(r13)     // Catch:{ Exception -> 0x01aa }
        L_0x010b:
            r3.write(r7, r11, r2)     // Catch:{ Exception -> 0x01aa }
            r13 = 0
            goto L_0x00e3
        L_0x0110:
            byte[] r2 = X.C1408873l.A04(r8)     // Catch:{ Exception -> 0x01aa }
            long r20 = X.AnonymousClass11P.A01(r20)     // Catch:{ Exception -> 0x01aa }
            long r20 = r20 - r16
            boolean r0 = r10.A08     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x012d
            com.whatsapp.media.WamediaManager r0 = r10.A07     // Catch:{ Exception -> 0x01aa }
            r0.removeAudioTracks(r8)     // Catch:{ Exception -> 0x01aa }
            r0.applyGifTag(r8)     // Catch:{ Exception -> 0x0127 }
            goto L_0x012d
        L_0x0127:
            r1 = move-exception
            java.lang.String r0 = "ProcessGifTask/processGif/applyGifTag failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x01aa }
        L_0x012d:
            boolean r0 = r22.isCancelled()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x013e
            r3.close()     // Catch:{ IOException -> 0x0139 }
            r4.close()     // Catch:{ IOException -> 0x0139 }
        L_0x0139:
            r5.disconnect()
            goto L_0x01e8
        L_0x013e:
            monitor-enter(r6)     // Catch:{ Exception -> 0x01aa }
            X.6gA r7 = r6.BM6(r9)     // Catch:{ all -> 0x01a5 }
            if (r7 == 0) goto L_0x0182
            java.lang.String r10 = r7.A00     // Catch:{ all -> 0x01a5 }
            boolean r0 = X.C108975cc.A1M(r10)     // Catch:{ all -> 0x01a5 }
            if (r0 == 0) goto L_0x0182
            java.io.File r0 = X.C108945cZ.A17(r10)     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = r0.getAbsolutePath()     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = r8.getAbsolutePath()     // Catch:{ all -> 0x01a5 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01a5 }
            if (r0 != 0) goto L_0x0182
            r3.close()     // Catch:{ all -> 0x01a5 }
            X.C64062u9.A0Q(r8)     // Catch:{ all -> 0x01a5 }
            java.io.File r14 = X.C108945cZ.A17(r10)     // Catch:{ all -> 0x01a5 }
            byte[] r15 = r7.A02     // Catch:{ all -> 0x01a5 }
            r16 = -1
            X.6nC r13 = new X.6nC     // Catch:{ all -> 0x01a5 }
            r18 = r16
            r13.<init>(r14, r15, r16, r18)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r6)     // Catch:{ all -> 0x01a5 }
        L_0x0175:
            r3.close()     // Catch:{ IOException -> 0x017b }
            r4.close()     // Catch:{ IOException -> 0x017b }
        L_0x017b:
            r5.disconnect()
        L_0x017e:
            android.net.TrafficStats.clearThreadStatsTag()
            return r13
        L_0x0182:
            java.lang.String r1 = r8.getAbsolutePath()     // Catch:{ all -> 0x01a5 }
            X.6gA r0 = new X.6gA     // Catch:{ all -> 0x01a5 }
            r0.<init>(r1, r2, r9)     // Catch:{ all -> 0x01a5 }
            r6.CD1(r0, r9)     // Catch:{ all -> 0x01a5 }
            monitor-exit(r6)     // Catch:{ all -> 0x01a5 }
            X.6nC r15 = new X.6nC     // Catch:{ Exception -> 0x01aa, all -> 0x01a8 }
            r16 = r8
            r17 = r2
            r15.<init>(r16, r17, r18, r20)     // Catch:{ Exception -> 0x01aa, all -> 0x01a8 }
            r3.close()     // Catch:{ IOException -> 0x019e }
            r4.close()     // Catch:{ IOException -> 0x019e }
        L_0x019e:
            r5.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            return r15
        L_0x01a5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01a5 }
            throw r0     // Catch:{ Exception -> 0x01aa, all -> 0x01a8 }
        L_0x01a8:
            r0 = move-exception
            goto L_0x01c4
        L_0x01aa:
            r0 = move-exception
            goto L_0x01bd
        L_0x01ac:
            java.lang.String r0 = "GifCache/gifpreviewdownloadaction/createtempfile/error creating directory"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
            throw r0     // Catch:{ Exception -> 0x01b5, all -> 0x01b3 }
        L_0x01b3:
            r0 = move-exception
            goto L_0x01c9
        L_0x01b5:
            r0 = move-exception
            goto L_0x01bc
        L_0x01b7:
            r0 = move-exception
            goto L_0x01bb
        L_0x01b9:
            r0 = move-exception
            r5 = 0
        L_0x01bb:
            r4 = 0
        L_0x01bc:
            r3 = 0
        L_0x01bd:
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x01c1 }
            goto L_0x01d9
        L_0x01c1:
            r0 = move-exception
            if (r3 == 0) goto L_0x01c7
        L_0x01c4:
            r3.close()     // Catch:{ IOException -> 0x01ce }
        L_0x01c7:
            if (r4 == 0) goto L_0x01ce
        L_0x01c9:
            r4.close()     // Catch:{ IOException -> 0x01ce }
            goto L_0x01ce
        L_0x01cd:
            r0 = move-exception
        L_0x01ce:
            if (r5 == 0) goto L_0x01d5
            r5.disconnect()
            goto L_0x01d5
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01d9:
            if (r3 == 0) goto L_0x01de
            r3.close()     // Catch:{ IOException -> 0x01e3 }
        L_0x01de:
            if (r4 == 0) goto L_0x01e3
            r4.close()     // Catch:{ IOException -> 0x01e3 }
        L_0x01e3:
            if (r5 == 0) goto L_0x01e8
            r5.disconnect()
        L_0x01e8:
            android.net.TrafficStats.clearThreadStatsTag()
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MK.A0J():X.6nC");
    }

    public AnonymousClass6MK(AnonymousClass190 r1, AnonymousClass181 r2, AnonymousClass1NM r3, AnonymousClass11P r4, C18030ve r5, AnonymousClass892 r6, AnonymousClass893 r7, WamediaManager wamediaManager, String str, boolean z) {
        this.A06 = r4;
        this.A00 = r5;
        this.A04 = r1;
        this.A05 = r2;
        this.A07 = wamediaManager;
        this.A09 = r3;
        this.A03 = str;
        this.A01 = r6;
        this.A08 = z;
        this.A02 = r7;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        return A0J();
    }
}
