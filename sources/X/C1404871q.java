package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

/* renamed from: X.71q  reason: invalid class name and case insensitive filesystem */
public class C1404871q {
    public boolean A00;
    public final AnonymousClass190 A01;
    public final C218617r A02;
    public final C18030ve A03;
    public final C32381h6 A04;
    public final WamediaManager A05;
    public final C56202h4 A06;
    public final C115295ti A07;
    public final C136996uk A08;
    public final C139666zF A09;
    public final AnonymousClass70W A0A;
    public final C138906xt A0B;
    public final C136956ug A0C;
    public final C62272r8 A0D;
    public final C1408873l A0E;
    public final AnonymousClass10I A0F;
    public final URL A0G;
    public final AnonymousClass181 A0H;
    public final AnonymousClass11Z A0I;
    public final C24371Kb A0J;
    public final AnonymousClass1KX A0K;
    public final C26501Sj A0L;
    public final C24421Kg A0M;
    public final AnonymousClass19K A0N;

    public static void A00(C139666zF r6, File file, File file2) {
        C179249Hd r3;
        C20583AQt aQt = new C20583AQt(r6.A0A);
        byte[] bArr = r6.A0e;
        C17960vV.A07(bArr);
        C185849dF BIV = aQt.BIV(bArr);
        try {
            FileInputStream A18 = C108945cZ.A18(file);
            try {
                FileOutputStream A19 = C108945cZ.A19(file2);
                try {
                    r3 = new C179249Hd(BIV, A19, file.length());
                    byte[] bArr2 = new byte[DefaultCrypto.BUFFER_SIZE];
                    for (int read = A18.read(bArr2, 0, DefaultCrypto.BUFFER_SIZE); read > 0; read = A18.read(bArr2, 0, DefaultCrypto.BUFFER_SIZE)) {
                        r3.write(bArr2);
                    }
                    if (!r3.A01) {
                        file2.getCanonicalPath();
                        C139666zF.A00(r6);
                    } else {
                        file2.getCanonicalPath();
                        file2.length();
                    }
                    r3.close();
                    A19.close();
                    A18.close();
                    return;
                } catch (Throwable th) {
                    A19.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A18.close();
                throw th2;
            }
        } catch (IOException unused) {
            C139666zF.A00(r6);
        } catch (Throwable th3) {
            AnonymousClass0DT.A00(th2, th3);
        }
    }

    private void A01(String str) {
        if (str == null) {
            Log.e("normalDownloadHandler/cancelExpressPathFileCleanUp cancel work with empty enc hash");
        } else {
            ((A7W) this.A0N.get()).A0A(str);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:310|311|312|313|314|315|316|317|318|319|320|321|(1:323)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        X.C139666zF.A00(r2);
        r5 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        r6 = new X.C1409173o(9, (java.lang.String) null, r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05c1, code lost:
        if (r4.A0D() == false) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x05c4, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05c6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05c7, code lost:
        r5 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x05cd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x05d1, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x05d2, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:?, code lost:
        X.C139666zF.A00(r2);
        r6 = X.C1409173o.A00(r5, r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:?, code lost:
        r28.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x05f2, code lost:
        if (r4.A0D() == false) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0611, code lost:
        if (r4.A0D() != false) goto L_0x0622;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0634, code lost:
        if (r4.A0D() != false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0692, code lost:
        if (r4.A0D() != false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.C139666zF.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025e, code lost:
        if (r31 > 0) goto L_0x0260;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:314:0x05b4, B:327:0x05c9] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:310:0x05a7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:344:0x05e2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:359:0x05ff */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0208 */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x060c A[Catch:{ all -> 0x0599, all -> 0x05d4, all -> 0x06b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x062c  */
    /* JADX WARNING: Removed duplicated region for block: B:405:0x06a1  */
    /* JADX WARNING: Removed duplicated region for block: B:426:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0131 A[Catch:{ all -> 0x05f5, all -> 0x05fa, 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134 A[Catch:{ all -> 0x05f5, all -> 0x05fa, 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0138 A[ADDED_TO_REGION, Catch:{ all -> 0x05f5, all -> 0x05fa, 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x018a A[Catch:{ all -> 0x05f5, all -> 0x05fa, 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0228 A[Catch:{ all -> 0x05f5, all -> 0x05fa, 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x023c A[Catch:{ all -> 0x0599, all -> 0x05d4, all -> 0x06b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C1409173o A02(X.C191779nA r47, java.io.File r48, java.lang.String r49, java.net.URL r50, boolean r51) {
        /*
            r46 = this;
            r3 = r46
            X.6zF r2 = r3.A09
            int r0 = r2.A00
            r31 = r0
            int r0 = r0 + 15
            int r0 = r0 / 16
            int r30 = r0 * 16
            java.io.File r15 = r2.A0C
            java.lang.String r4 = "; url="
            r45 = r50
            if (r15 == 0) goto L_0x06bf
            long r0 = r15.length()
            X.70W r4 = r3.A0A
            r4.A09 = r0
            X.6uk r5 = r3.A08
            r37 = r5
            r5.A0A(r0)
            r7 = 14
            r8 = 3
            if (r51 == 0) goto L_0x007a
            r5 = r30
            long r5 = (long) r5
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 < 0) goto L_0x007a
            X.1So r0 = r2.A0A
            X.AQt r1 = new X.AQt
            r1.<init>(r0)
            byte[] r0 = r2.A0e
            X.C17960vV.A07(r0)
            X.9dF r17 = r1.BIV(r0)
            X.190 r12 = r3.A01
            X.17r r11 = r3.A02
            X.2r8 r10 = r3.A0D
            X.6xt r9 = r3.A0B
            X.1h6 r6 = r3.A04
            X.73l r5 = r3.A0E
            com.whatsapp.media.WamediaManager r4 = r3.A05
            X.5ti r1 = r3.A07
            int r0 = r1.A15
            r16 = r11
            r18 = r6
            r19 = r4
            r20 = r1
            r21 = r37
            r22 = r2
            r23 = r9
            r24 = r10
            r25 = r5
            r26 = r15
            r27 = r0
            r28 = r30
            r15 = r12
            X.AnonymousClass74L.A09(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            X.6ug r0 = r3.A0C
            r0.A02(r8)
            r0 = 0
            X.73o r6 = X.C1409173o.A00(r7, r0)
        L_0x0079:
            return r6
        L_0x007a:
            r16 = 0
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1R(r5)
            r3.A00 = r5     // Catch:{ all -> 0x06b0 }
            java.lang.String r5 = "SHA-256"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0617 }
            java.security.MessageDigest r14 = java.security.MessageDigest.getInstance(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0617 }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            r35 = r48
            if (r5 <= 0) goto L_0x0118
            long r5 = r2.A07     // Catch:{ IOException -> 0x0115 }
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0118
            X.0ve r9 = r3.A03     // Catch:{ IOException -> 0x0115 }
            X.0vf r8 = X.C18040vf.A01     // Catch:{ IOException -> 0x0115 }
            r7 = 1917(0x77d, float:2.686E-42)
            boolean r7 = X.C18020vd.A05(r8, r9, r7)     // Catch:{ IOException -> 0x0115 }
            if (r7 != 0) goto L_0x00ae
            r7 = 8520(0x2148, float:1.1939E-41)
            boolean r7 = X.C18020vd.A05(r8, r9, r7)     // Catch:{ IOException -> 0x0115 }
            if (r7 == 0) goto L_0x0118
        L_0x00ae:
            java.lang.String r8 = X.C1402370n.A01(r15, r14)     // Catch:{ IOException -> 0x0115 }
            java.lang.String r7 = r2.A0G     // Catch:{ IOException -> 0x0115 }
            boolean r9 = r8.equals(r7)     // Catch:{ IOException -> 0x0115 }
            if (r9 == 0) goto L_0x0118
            r15.getCanonicalPath()     // Catch:{ IOException -> 0x0115 }
            X.C139666zF.A00(r2)     // Catch:{ IOException -> 0x0115 }
            long r10 = r35.length()     // Catch:{ IOException -> 0x0115 }
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L_0x00d0
            r15.getCanonicalPath()     // Catch:{ IOException -> 0x0115 }
            r5 = r35
            A00(r2, r15, r5)     // Catch:{ IOException -> 0x0115 }
        L_0x00d0:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x0115 }
            r4.A0D = r5     // Catch:{ IOException -> 0x0115 }
            r5 = 3
            r4.A03 = r5     // Catch:{ IOException -> 0x0115 }
            r5 = r35
            java.lang.String r24 = X.C1402370n.A01(r5, r12)     // Catch:{ IOException -> 0x0115 }
            java.lang.Boolean r9 = X.AnonymousClass000.A0h()     // Catch:{ IOException -> 0x0115 }
            r5 = 0
            X.6gE r6 = new X.6gE     // Catch:{ IOException -> 0x0115 }
            r6.<init>(r5, r9)     // Catch:{ IOException -> 0x0115 }
            X.5ti r5 = r3.A07     // Catch:{ IOException -> 0x0115 }
            r9 = 0
            r18 = r5
            r19 = r6
            r20 = r2
            r21 = r15
            r22 = r35
            r23 = r8
            r25 = r45
            X.73o r6 = X.AnonymousClass74L.A04(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ IOException -> 0x0113 }
            r4.A09()     // Catch:{ IOException -> 0x0113 }
            boolean r5 = r6.A03()     // Catch:{ IOException -> 0x0113 }
            if (r5 == 0) goto L_0x0124
            r3.A01(r7)     // Catch:{ IOException -> 0x0113 }
            X.17r r7 = r3.A02     // Catch:{ IOException -> 0x0113 }
            r5 = r35
            X.AnonymousClass74L.A0C(r7, r6, r15, r5)     // Catch:{ IOException -> 0x0113 }
            goto L_0x0622
        L_0x0113:
            r6 = move-exception
            goto L_0x011a
        L_0x0115:
            r6 = move-exception
            r9 = 0
            goto L_0x011a
        L_0x0118:
            r9 = 0
            goto L_0x0124
        L_0x011a:
            java.lang.String r5 = "normaldownloadhandler/downloadnormal error when suspect local has full data and try to return early"
            com.whatsapp.util.Log.e(r5, r6)     // Catch:{ all -> 0x06b0 }
            X.11Z r5 = r3.A0I     // Catch:{ all -> 0x06b0 }
            r5.A05()     // Catch:{ all -> 0x06b0 }
        L_0x0124:
            X.6ug r5 = r3.A0C     // Catch:{ all -> 0x06b0 }
            r34 = r5
            r5.A02(r9)     // Catch:{ all -> 0x06b0 }
            X.1Kb r8 = r3.A0J     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0134
            r22 = r0
            goto L_0x0136
        L_0x0134:
            r22 = 0
        L_0x0136:
            if (r51 == 0) goto L_0x013f
            if (r31 <= 0) goto L_0x013f
            int r5 = r30 + -1
            long r5 = (long) r5     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
        L_0x013d:
            r7 = 1
            goto L_0x0142
        L_0x013f:
            r5 = -1
            goto L_0x013d
        L_0x0142:
            r13 = 1
            r19 = r47
            r20 = r49
            r18 = r8
            r21 = r45
            r24 = r5
            r26 = r7
            X.AUZ r28 = r18.A02(r19, r20, r21, r22, r24, r26)     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            r5 = r34
            r5.A02(r7)     // Catch:{ all -> 0x05f5 }
            r4.A08()     // Catch:{ all -> 0x05f5 }
            r5 = r28
            java.lang.Boolean r6 = r5.A00     // Catch:{ all -> 0x05f5 }
            r4.A0I = r6     // Catch:{ all -> 0x05f5 }
            java.net.HttpURLConnection r10 = r5.A01     // Catch:{ all -> 0x05f5 }
            int r5 = r10.getResponseCode()     // Catch:{ all -> 0x05f5 }
            java.lang.Long r5 = X.C17880vN.A0n(r5)     // Catch:{ all -> 0x05f5 }
            r4.A0W = r5     // Catch:{ all -> 0x05f5 }
            java.lang.String r5 = "x-fb-application-protocol"
            java.lang.String r5 = r10.getHeaderField(r5)     // Catch:{ all -> 0x05f5 }
            r4.A0c = r5     // Catch:{ all -> 0x05f5 }
            java.lang.String r5 = "X-WA-Metadata"
            java.lang.String r7 = r10.getHeaderField(r5)     // Catch:{ all -> 0x05f5 }
            X.6gE r29 = new X.6gE     // Catch:{ all -> 0x05f5 }
            r5 = r29
            r5.<init>(r7, r6)     // Catch:{ all -> 0x05f5 }
            int r6 = r10.getResponseCode()     // Catch:{ all -> 0x05f5 }
            r5 = 416(0x1a0, float:5.83E-43)
            if (r6 != r5) goto L_0x020b
            java.lang.String r5 = "Content-Range"
            java.lang.String r6 = r10.getHeaderField(r5)     // Catch:{ all -> 0x05f5 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x05f5 }
            if (r5 != 0) goto L_0x020b
            java.lang.String r5 = "*/"
            boolean r5 = r6.contains(r5)     // Catch:{ all -> 0x05f5 }
            if (r5 == 0) goto L_0x020b
            r5 = 47
            int r5 = r6.lastIndexOf(r5)     // Catch:{ NumberFormatException -> 0x0208 }
            int r5 = r5 + 1
            java.lang.String r5 = r6.substring(r5)     // Catch:{ NumberFormatException -> 0x0208 }
            long r6 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x0208 }
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x020b
            r15.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x0208 }
            java.lang.String r7 = r2.A0G     // Catch:{ NumberFormatException -> 0x0208 }
            X.C139666zF.A00(r2)     // Catch:{ NumberFormatException -> 0x0208 }
            long r18 = r35.length()     // Catch:{ NumberFormatException -> 0x0208 }
            long r5 = r2.A07     // Catch:{ NumberFormatException -> 0x0208 }
            int r8 = (r18 > r5 ? 1 : (r18 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x01cc
            r15.getCanonicalPath()     // Catch:{ NumberFormatException -> 0x0208 }
            r5 = r35
            A00(r2, r15, r5)     // Catch:{ NumberFormatException -> 0x0208 }
        L_0x01cc:
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ NumberFormatException -> 0x0208 }
            r4.A0D = r5     // Catch:{ NumberFormatException -> 0x0208 }
            r5 = 3
            r4.A03 = r5     // Catch:{ NumberFormatException -> 0x0208 }
            java.lang.String r23 = X.C1402370n.A01(r15, r14)     // Catch:{ NumberFormatException -> 0x0208 }
            r6 = r35
            java.lang.String r24 = X.C1402370n.A01(r6, r12)     // Catch:{ NumberFormatException -> 0x0208 }
            X.5ti r6 = r3.A07     // Catch:{ NumberFormatException -> 0x0208 }
            r18 = r6
            r19 = r29
            r20 = r2
            r21 = r15
            r22 = r35
            r25 = r45
            X.73o r6 = X.AnonymousClass74L.A04(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ NumberFormatException -> 0x0208 }
            r4.A09()     // Catch:{ NumberFormatException -> 0x0208 }
            r3.A01(r7)     // Catch:{ NumberFormatException -> 0x0208 }
            X.17r r8 = r3.A02     // Catch:{ NumberFormatException -> 0x0208 }
            r7 = r35
            X.AnonymousClass74L.A0C(r8, r6, r15, r7)     // Catch:{ NumberFormatException -> 0x0208 }
            r7 = r34
            r7.A02(r5)     // Catch:{ NumberFormatException -> 0x0208 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            goto L_0x060d
        L_0x0208:
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x05f5 }
        L_0x020b:
            int r5 = r10.getContentLength()     // Catch:{ all -> 0x05f5 }
            long r8 = (long) r5     // Catch:{ all -> 0x05f5 }
            long r8 = r8 + r0
            X.11Z r5 = r3.A0I     // Catch:{ all -> 0x05f5 }
            long r20 = r5.A01()     // Catch:{ all -> 0x05f5 }
            X.0ve r5 = r3.A03     // Catch:{ all -> 0x05f5 }
            r33 = r5
            r6 = 1291(0x50b, float:1.809E-42)
            long r18 = X.C108995ce.A07(r5, r6)     // Catch:{ all -> 0x05f5 }
            long r18 = r18 + r8
            r5 = 4
            int r6 = (r20 > r18 ? 1 : (r20 == r18 ? 0 : -1))
            if (r6 >= 0) goto L_0x023c
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x05f5 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x05f5 }
            X.73o r6 = X.C1409173o.A00(r5, r0)     // Catch:{ all -> 0x05f5 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x023c:
            r11 = 0
            X.5ti r7 = r3.A07     // Catch:{ all -> 0x05f5 }
            boolean r5 = r7.A05     // Catch:{ all -> 0x05f5 }
            if (r5 == 0) goto L_0x0290
            int r5 = r7.A15     // Catch:{ all -> 0x05f5 }
            if (r5 == r13) goto L_0x024c
            int r6 = r7.A15     // Catch:{ all -> 0x05f5 }
            r5 = 2
            if (r6 != r5) goto L_0x0290
        L_0x024c:
            X.1Sj r5 = r3.A0L     // Catch:{ all -> 0x05f5 }
            r18 = r5
            X.1So r5 = r2.A0A     // Catch:{ all -> 0x05f5 }
            r19 = r5
            long r5 = r2.A07     // Catch:{ all -> 0x05f5 }
            r25 = r5
            boolean r5 = r2.A0Q     // Catch:{ all -> 0x05f5 }
            if (r5 != 0) goto L_0x0260
            r24 = 0
            if (r31 <= 0) goto L_0x0262
        L_0x0260:
            r24 = 1
        L_0x0262:
            int r5 = r2.A04     // Catch:{ all -> 0x05f5 }
            r20 = r5
            boolean r13 = r2.A0Z     // Catch:{ all -> 0x05f5 }
            boolean r6 = r2.A0Y     // Catch:{ all -> 0x05f5 }
            boolean r5 = r2.A0S     // Catch:{ all -> 0x05f5 }
            r23 = 0
            r21 = r25
            r25 = r13
            r26 = r6
            r27 = r5
            boolean r5 = r18.A03(r19, r20, r21, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x05f5 }
            if (r5 != 0) goto L_0x0290
            boolean r1 = r3.A00     // Catch:{ all -> 0x05f5 }
            r0 = 24
            X.73o r6 = new X.73o     // Catch:{ all -> 0x05f5 }
            r6.<init>(r0, r11, r1)     // Catch:{ all -> 0x05f5 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x0290:
            java.util.concurrent.FutureTask r5 = r7.A02     // Catch:{ all -> 0x05f5 }
            boolean r5 = r5.isCancelled()     // Catch:{ all -> 0x05f5 }
            if (r5 == 0) goto L_0x02ac
            boolean r1 = r3.A00     // Catch:{ all -> 0x05f5 }
            r0 = 13
            X.73o r6 = new X.73o     // Catch:{ all -> 0x05f5 }
            r6.<init>(r0, r11, r1)     // Catch:{ all -> 0x05f5 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x02ac:
            int r5 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x02c7
            long r18 = r15.length()     // Catch:{ all -> 0x05f5 }
            int r5 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x02c7
            r15.getCanonicalPath()     // Catch:{ all -> 0x05f5 }
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x05f5 }
            X.1TJ r6 = r7.A0I     // Catch:{ all -> 0x05f5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x05f5 }
            r6.A04(r5)     // Catch:{ all -> 0x05f5 }
        L_0x02c7:
            X.1So r5 = r2.A0A     // Catch:{ all -> 0x05f5 }
            r32 = r5
            X.AQt r6 = new X.AQt     // Catch:{ all -> 0x05f5 }
            r6.<init>(r5)     // Catch:{ all -> 0x05f5 }
            byte[] r5 = r2.A0e     // Catch:{ all -> 0x05f5 }
            X.C17960vV.A07(r5)     // Catch:{ all -> 0x05f5 }
            X.9dF r27 = r6.BIV(r5)     // Catch:{ all -> 0x05f5 }
            r11 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x05e0 }
            r5 = r35
            r6.<init>(r5, r11)     // Catch:{ IOException -> 0x05e0 }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x05e0 }
            r11.<init>(r6)     // Catch:{ IOException -> 0x05e0 }
            r5 = 2
            X.C18070vi.A0d(r12, r5)     // Catch:{ IOException -> 0x05e0 }
            X.Amn r26 = new X.Amn     // Catch:{ IOException -> 0x05e0 }
            r5 = r26
            r5.<init>(r11, r12)     // Catch:{ IOException -> 0x05e0 }
            int r5 = r10.getContentLength()     // Catch:{ all -> 0x05d4 }
            long r5 = (long) r5     // Catch:{ all -> 0x05d4 }
            long r10 = r15.length()     // Catch:{ all -> 0x05d4 }
            long r5 = r5 + r10
            X.9Hd r25 = new X.9Hd     // Catch:{ all -> 0x05d4 }
            r12 = r26
            r11 = r25
            r10 = r27
            r11.<init>(r10, r12, r5)     // Catch:{ all -> 0x05d4 }
            boolean r5 = r15.exists()     // Catch:{ IOException -> 0x05a7 }
            if (r5 == 0) goto L_0x0344
            long r10 = r15.length()     // Catch:{ IOException -> 0x05a7 }
            int r5 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0344
            java.io.FileInputStream r6 = X.C26511Sk.A0J(r15)     // Catch:{ IOException -> 0x0341 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0341 }
            r5.<init>(r6)     // Catch:{ IOException -> 0x0341 }
            X.9HQ r13 = new X.9HQ     // Catch:{ IOException -> 0x0341 }
            r13.<init>(r5, r14)     // Catch:{ IOException -> 0x0341 }
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r12]     // Catch:{ all -> 0x0337 }
        L_0x0326:
            r10 = 0
            int r6 = r13.read(r11, r10, r12)     // Catch:{ all -> 0x0337 }
            if (r6 < 0) goto L_0x0333
            r5 = r25
            r5.write(r11, r10, r6)     // Catch:{ all -> 0x0337 }
            goto L_0x0326
        L_0x0333:
            r13.close()     // Catch:{ IOException -> 0x0341 }
            goto L_0x0344
        L_0x0337:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x033c }
            goto L_0x0340
        L_0x033c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0341 }
        L_0x0340:
            throw r1     // Catch:{ IOException -> 0x0341 }
        L_0x0341:
            r1 = move-exception
            goto L_0x05a3
        L_0x0344:
            r5 = 1
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x05a7 }
            r6.<init>(r15, r5)     // Catch:{ IOException -> 0x05a7 }
            java.security.DigestOutputStream r24 = new java.security.DigestOutputStream     // Catch:{ IOException -> 0x05a7 }
            r5 = r24
            r5.<init>(r6, r14)     // Catch:{ IOException -> 0x05a7 }
            X.181 r10 = r3.A0H     // Catch:{ IOException -> 0x0556 }
            boolean r6 = r2.A0Z     // Catch:{ IOException -> 0x0556 }
            r5 = 0
            if (r6 == 0) goto L_0x0359
            r5 = 4
        L_0x0359:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x0556 }
            r12 = 0
            r5 = r28
            X.9Hb r23 = X.C108955ca.A0N(r10, r5, r6, r12)     // Catch:{ IOException -> 0x0556 }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r6]     // Catch:{ IOException -> 0x042a }
            r10 = 0
            r5 = r23
            int r12 = r5.read(r11, r12, r6)     // Catch:{ IOException -> 0x042a }
            r5 = r30
            long r5 = (long) r5
            r21 = r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            boolean r20 = X.AnonymousClass000.A1Q(r5)
        L_0x037a:
            if (r12 < 0) goto L_0x0428
            long r13 = r4.A03()     // Catch:{ IOException -> 0x042a }
            r18 = -1
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x03a4
            r6 = 2
            r5 = r34
            r5.A02(r6)     // Catch:{ IOException -> 0x042a }
            long r13 = r4.A0A     // Catch:{ IOException -> 0x042a }
            int r5 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x03a4
            long r16 = r4.A01()     // Catch:{ IOException -> 0x042a }
            int r5 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r5 == 0) goto L_0x03a4
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x042a }
            long r5 = r5 - r13
            r4.A0G = r5     // Catch:{ IOException -> 0x042a }
            r5 = 2
            r4.A03 = r5     // Catch:{ IOException -> 0x042a }
        L_0x03a4:
            r5 = r24
            r5.write(r11, r10, r12)     // Catch:{ IOException -> 0x042a }
            r5 = r25
            r5.write(r11, r10, r12)     // Catch:{ IOException -> 0x042a }
            long r5 = (long) r12     // Catch:{ IOException -> 0x042a }
            long r0 = r0 + r5
            X.2h4 r5 = r3.A06     // Catch:{ IOException -> 0x042a }
            if (r5 == 0) goto L_0x03b6
            r5.A0A = r0     // Catch:{ IOException -> 0x042a }
        L_0x03b6:
            long r5 = (long) r12     // Catch:{ IOException -> 0x042a }
            r4.A0B(r0, r5)     // Catch:{ IOException -> 0x042a }
            r12 = 0
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1R(r5)
            r3.A00 = r5     // Catch:{ IOException -> 0x042a }
            boolean r5 = X.C63972u0.A07(r32)     // Catch:{ IOException -> 0x042a }
            if (r5 == 0) goto L_0x03ec
            byte[] r5 = r2.A0d     // Catch:{ IOException -> 0x042a }
            if (r31 <= 0) goto L_0x03ec
            if (r5 == 0) goto L_0x03ec
            if (r51 != 0) goto L_0x03ec
            int r5 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r5 < 0) goto L_0x03ec
            if (r20 != 0) goto L_0x03ec
            X.10I r6 = r3.A0F     // Catch:{ IOException -> 0x042a }
            r18 = 32
            X.Aiu r5 = new X.Aiu     // Catch:{ IOException -> 0x042a }
            r13 = r5
            r14 = r3
            r16 = r27
            r17 = r30
            r13.<init>(r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x042a }
            r6.CGF(r5)     // Catch:{ IOException -> 0x042a }
            r20 = 1
        L_0x03ec:
            r5 = r37
            r5.A0A(r0)     // Catch:{ IOException -> 0x042a }
            r7.A0F()     // Catch:{ IOException -> 0x042a }
            java.util.concurrent.atomic.AtomicBoolean r5 = r7.A0z     // Catch:{ IOException -> 0x042a }
            boolean r5 = r5.getAndSet(r10)     // Catch:{ IOException -> 0x042a }
            if (r5 == 0) goto L_0x0412
            long r16 = r8 - r0
            r12 = 52428800(0x3200000, double:2.5903269E-316)
            int r5 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x0412
            r12 = 488(0x1e8, float:6.84E-43)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ IOException -> 0x042a }
            r5 = r33
            boolean r5 = X.C18020vd.A05(r6, r5, r12)     // Catch:{ IOException -> 0x042a }
            if (r5 == 0) goto L_0x0412
            goto L_0x0425
        L_0x0412:
            X.1TJ r6 = r7.A0I     // Catch:{ IOException -> 0x042a }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x042a }
            r6.A04(r5)     // Catch:{ IOException -> 0x042a }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5 = r23
            int r12 = r5.read(r11, r10, r6)     // Catch:{ IOException -> 0x042a }
            goto L_0x037a
        L_0x0425:
            r5 = 20
            goto L_0x043d
        L_0x0428:
            r5 = 0
            goto L_0x043d
        L_0x042a:
            r1 = move-exception
            r4.A0C(r1)     // Catch:{ all -> 0x054c }
            java.net.URL r0 = r3.A0G     // Catch:{ all -> 0x054c }
            java.lang.String r0 = X.A7N.A01(r0)     // Catch:{ all -> 0x054c }
            r4.A0d = r0     // Catch:{ all -> 0x054c }
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x054c }
            int r5 = X.C123856Wc.A00(r1)     // Catch:{ all -> 0x054c }
        L_0x043d:
            r1 = 3
            r0 = r34
            r0.A02(r1)     // Catch:{ all -> 0x054c }
            if (r51 == 0) goto L_0x0497
            monitor-enter(r4)     // Catch:{ all -> 0x054c }
            monitor-exit(r4)     // Catch:{ all -> 0x054c }
            boolean r0 = r3.A00     // Catch:{ all -> 0x054c }
            if (r0 == 0) goto L_0x0478
            X.190 r11 = r3.A01     // Catch:{ all -> 0x054c }
            X.17r r10 = r3.A02     // Catch:{ all -> 0x054c }
            X.2r8 r9 = r3.A0D     // Catch:{ all -> 0x054c }
            X.6xt r8 = r3.A0B     // Catch:{ all -> 0x054c }
            X.1h6 r6 = r3.A04     // Catch:{ all -> 0x054c }
            X.73l r5 = r3.A0E     // Catch:{ all -> 0x054c }
            com.whatsapp.media.WamediaManager r1 = r3.A05     // Catch:{ all -> 0x054c }
            int r0 = r7.A15     // Catch:{ all -> 0x054c }
            r31 = r11
            r32 = r10
            r33 = r27
            r34 = r6
            r35 = r1
            r36 = r7
            r38 = r2
            r39 = r8
            r40 = r9
            r41 = r5
            r42 = r15
            r43 = r0
            r44 = r30
            X.AnonymousClass74L.A09(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x054c }
        L_0x0478:
            boolean r1 = r3.A00     // Catch:{ all -> 0x054c }
            r0 = 14
            X.73o r6 = X.C1409173o.A00(r0, r1)     // Catch:{ all -> 0x054c }
            r23.close()     // Catch:{ IOException -> 0x0556 }
            r24.close()     // Catch:{ IOException -> 0x05a7 }
            r25.close()     // Catch:{ all -> 0x05d4 }
            r26.close()     // Catch:{ IOException -> 0x05e0 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x0497:
            if (r5 == 0) goto L_0x04b0
            boolean r0 = r3.A00     // Catch:{ all -> 0x054c }
            X.73o r7 = X.C1409173o.A00(r5, r0)     // Catch:{ all -> 0x054c }
            r23.close()     // Catch:{ IOException -> 0x0556 }
            r24.close()     // Catch:{ IOException -> 0x05a7 }
            r25.close()     // Catch:{ all -> 0x05d4 }
            r26.close()     // Catch:{ IOException -> 0x05e0 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            goto L_0x068e
        L_0x04b0:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x054c }
            r4.A0D = r0     // Catch:{ all -> 0x054c }
            r0 = 3
            r4.A03 = r0     // Catch:{ all -> 0x054c }
            java.security.MessageDigest r0 = r24.getMessageDigest()     // Catch:{ all -> 0x054c }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x054c }
            java.lang.String r10 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x054c }
            r0 = r25
            boolean r0 = r0.A01     // Catch:{ all -> 0x054c }
            if (r0 == 0) goto L_0x04e8
            java.security.MessageDigest r0 = r26.getMessageDigest()     // Catch:{ all -> 0x054c }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x054c }
            java.lang.String r11 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x054c }
        L_0x04d7:
            r5 = r7
            r6 = r29
            r7 = r2
            r8 = r15
            r9 = r35
            r12 = r45
            X.73o r6 = X.AnonymousClass74L.A04(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x054c }
            r4.A09()     // Catch:{ all -> 0x054c }
            goto L_0x04ea
        L_0x04e8:
            r11 = 0
            goto L_0x04d7
        L_0x04ea:
            r23.close()     // Catch:{ IOException -> 0x0556 }
            r24.close()     // Catch:{ IOException -> 0x05a7 }
            r25.close()     // Catch:{ all -> 0x05d4 }
            r26.close()     // Catch:{ IOException -> 0x05e0 }
            X.0vf r5 = X.C18040vf.A01     // Catch:{ all -> 0x05f5 }
            r1 = 1917(0x77d, float:2.686E-42)
            r0 = r33
            boolean r0 = X.C18020vd.A05(r5, r0, r1)     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x0507
            java.lang.String r0 = r2.A0G     // Catch:{ all -> 0x05f5 }
            r3.A01(r0)     // Catch:{ all -> 0x05f5 }
        L_0x0507:
            X.17r r8 = r3.A02     // Catch:{ all -> 0x05f5 }
            X.AnonymousClass74L.A0C(r8, r6, r15, r9)     // Catch:{ all -> 0x05f5 }
            java.lang.String r7 = r2.A0H     // Catch:{ all -> 0x05f5 }
            java.lang.String r5 = r2.A0L     // Catch:{ all -> 0x05f5 }
            java.io.File r1 = r8.A0f(r7, r5)     // Catch:{ all -> 0x05f5 }
            boolean r0 = r6.A03()     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x0541
            if (r1 == 0) goto L_0x0525
            boolean r0 = X.C63972u0.A04(r32)     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x0525
            r1.delete()     // Catch:{ all -> 0x05f5 }
        L_0x0525:
            boolean r0 = X.C63972u0.A07(r32)     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x0541
            boolean r0 = r2.A0Q     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x0541
            java.io.File r1 = r8.A0g(r7, r5)     // Catch:{ all -> 0x05f5 }
            if (r1 == 0) goto L_0x0541
            boolean r0 = r1.exists()     // Catch:{ all -> 0x05f5 }
            if (r0 == 0) goto L_0x0541
            r1.getAbsolutePath()     // Catch:{ all -> 0x05f5 }
            r1.delete()     // Catch:{ all -> 0x05f5 }
        L_0x0541:
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x054c:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0551 }
            goto L_0x0555
        L_0x0551:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0556 }
        L_0x0555:
            throw r1     // Catch:{ IOException -> 0x0556 }
        L_0x0556:
            r5 = move-exception
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x0599 }
            X.1KX r1 = r3.A0K     // Catch:{ all -> 0x0599 }
            boolean r0 = r1.A03(r5)     // Catch:{ all -> 0x0599 }
            if (r0 == 0) goto L_0x0581
            r1.A00()     // Catch:{ all -> 0x0599 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x0599 }
            r0 = 15
            X.73o r6 = X.C1409173o.A00(r0, r1)     // Catch:{ all -> 0x0599 }
            r24.close()     // Catch:{ IOException -> 0x05a7 }
            r25.close()     // Catch:{ all -> 0x05d4 }
            r26.close()     // Catch:{ IOException -> 0x05e0 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x0581:
            int r1 = X.C123856Wc.A00(r5)     // Catch:{ all -> 0x0599 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x0599 }
            X.73o r7 = X.C1409173o.A00(r1, r0)     // Catch:{ all -> 0x0599 }
            r24.close()     // Catch:{ IOException -> 0x05a7 }
            r25.close()     // Catch:{ all -> 0x05d4 }
            r26.close()     // Catch:{ IOException -> 0x05e0 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            goto L_0x0630
        L_0x0599:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x059e }
            goto L_0x05a6
        L_0x059e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x05a7 }
            goto L_0x05a6
        L_0x05a3:
            X.C139666zF.A00(r2)     // Catch:{ IOException -> 0x05a7 }
        L_0x05a6:
            throw r1     // Catch:{ IOException -> 0x05a7 }
        L_0x05a7:
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x05c6 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x05c6 }
            r5 = 9
            r0 = 0
            X.73o r6 = new X.73o     // Catch:{ all -> 0x05c4 }
            r6.<init>(r5, r0, r1)     // Catch:{ all -> 0x05c4 }
            r25.close()     // Catch:{ all -> 0x05d2 }
            r26.close()     // Catch:{ IOException -> 0x05e2 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x05c4:
            r1 = move-exception
            goto L_0x05c9
        L_0x05c6:
            r1 = move-exception
            r5 = 9
        L_0x05c9:
            r25.close()     // Catch:{ all -> 0x05cd }
            goto L_0x05d1
        L_0x05cd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x05d2 }
        L_0x05d1:
            throw r1     // Catch:{ all -> 0x05d2 }
        L_0x05d2:
            r1 = move-exception
            goto L_0x05d7
        L_0x05d4:
            r1 = move-exception
            r5 = 9
        L_0x05d7:
            r26.close()     // Catch:{ all -> 0x05db }
            goto L_0x05df
        L_0x05db:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x05e2 }
        L_0x05df:
            throw r1     // Catch:{ IOException -> 0x05e2 }
        L_0x05e0:
            r5 = 9
        L_0x05e2:
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x05f5 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x05f5 }
            X.73o r6 = X.C1409173o.A00(r5, r0)     // Catch:{ all -> 0x05f5 }
            r28.close()     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x05f5:
            r1 = move-exception
            r28.close()     // Catch:{ all -> 0x05fa }
            goto L_0x05fe
        L_0x05fa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
        L_0x05fe:
            throw r1     // Catch:{ 68P -> 0x0676, 68O -> 0x0651, IllegalArgumentException -> 0x05ff, IOException -> 0x0637 }
        L_0x05ff:
            boolean r1 = r3.A00     // Catch:{ all -> 0x06a5 }
            r0 = 1
            X.73o r6 = X.C1409173o.A00(r0, r1)     // Catch:{ all -> 0x06a5 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
            goto L_0x0613
        L_0x060d:
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0622
        L_0x0613:
            r4.A08()     // Catch:{ all -> 0x06b0 }
            goto L_0x0622
        L_0x0617:
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x06b0 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x06b0 }
            r0 = 26
            X.73o r6 = X.C1409173o.A00(r0, r1)     // Catch:{ all -> 0x06b0 }
        L_0x0622:
            long r7 = r4.A02()
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0079
            r4.A0A()
            return r6
        L_0x0630:
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0697
            goto L_0x0694
        L_0x0637:
            r1 = move-exception
            X.C139666zF.A00(r2)     // Catch:{ all -> 0x06a5 }
            r0 = r45
            X.AnonymousClass70W.A00(r4, r1, r0)     // Catch:{ all -> 0x06a5 }
            int r1 = X.C123856Wc.A00(r1)     // Catch:{ all -> 0x06a5 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x06a5 }
            X.73o r7 = X.C1409173o.A00(r1, r0)     // Catch:{ all -> 0x06a5 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0697
            goto L_0x0694
        L_0x0651:
            r2 = move-exception
            r4.A08()     // Catch:{ all -> 0x06a5 }
            r0 = r45
            X.AnonymousClass70W.A00(r4, r2, r0)     // Catch:{ all -> 0x06a5 }
            int r1 = r2.responseCode     // Catch:{ all -> 0x06a5 }
            java.lang.Long r0 = X.C17880vN.A0n(r1)     // Catch:{ all -> 0x06a5 }
            r4.A0W = r0     // Catch:{ all -> 0x06a5 }
            X.1Kg r0 = r3.A0M     // Catch:{ all -> 0x06a5 }
            r0.A0E(r1)     // Catch:{ all -> 0x06a5 }
            int r1 = r2.downloadStatus     // Catch:{ all -> 0x06a5 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x06a5 }
            X.73o r7 = X.C1409173o.A00(r1, r0)     // Catch:{ all -> 0x06a5 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0697
            goto L_0x0694
        L_0x0676:
            r1 = move-exception
            r0 = r45
            X.AnonymousClass70W.A00(r4, r1, r0)     // Catch:{ all -> 0x06a5 }
            r1.getCause()     // Catch:{ all -> 0x06a5 }
            int r1 = r1.downloadStatus     // Catch:{ all -> 0x06a5 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x06a5 }
            X.73o r7 = X.C1409173o.A00(r1, r0)     // Catch:{ all -> 0x06a5 }
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0697
            goto L_0x0694
        L_0x068e:
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x0697
        L_0x0694:
            r4.A08()     // Catch:{ all -> 0x06b0 }
        L_0x0697:
            long r5 = r4.A02()
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x06a4
            r4.A0A()
        L_0x06a4:
            return r7
        L_0x06a5:
            r1 = move-exception
            boolean r0 = r4.A0D()     // Catch:{ all -> 0x06b0 }
            if (r0 != 0) goto L_0x06af
            r4.A08()     // Catch:{ all -> 0x06b0 }
        L_0x06af:
            throw r1     // Catch:{ all -> 0x06b0 }
        L_0x06b0:
            r3 = move-exception
            long r5 = r4.A02()
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x06be
            r4.A0A()
        L_0x06be:
            throw r3
        L_0x06bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaDownload/MMS download failed due to message allowed into download encrypted without sufficient information to compute a download file; mediaHash="
            r1.append(r0)
            java.lang.String r0 = r2.A0H
            java.lang.String r0 = X.C123836Wa.A00(r0)
            r1.append(r0)
            r0 = r45
            java.lang.String r0 = X.AnonymousClass001.A1E(r0, r4, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404871q.A02(X.9nA, java.io.File, java.lang.String, java.net.URL, boolean):X.73o");
    }

    public C1404871q(AnonymousClass190 r2, C218617r r3, AnonymousClass181 r4, AnonymousClass11Z r5, C18030ve r6, C24371Kb r7, AnonymousClass1KX r8, C32381h6 r9, WamediaManager wamediaManager, C56202h4 r11, C26501Sj r12, C115295ti r13, C136996uk r14, C139666zF r15, AnonymousClass70W r16, C24421Kg r17, C138906xt r18, C136956ug r19, C62272r8 r20, C1408873l r21, AnonymousClass10I r22, AnonymousClass19K r23, URL url) {
        this.A03 = r6;
        this.A01 = r2;
        this.A0F = r22;
        this.A02 = r3;
        this.A0I = r5;
        this.A0M = r17;
        this.A0D = r20;
        this.A0B = r18;
        this.A04 = r9;
        this.A0E = r21;
        this.A05 = wamediaManager;
        this.A0N = r23;
        this.A0L = r12;
        this.A0K = r8;
        this.A0J = r7;
        this.A0G = url;
        this.A09 = r15;
        this.A0A = r16;
        this.A0H = r4;
        this.A06 = r11;
        this.A07 = r13;
        this.A08 = r14;
        this.A0C = r19;
    }
}
