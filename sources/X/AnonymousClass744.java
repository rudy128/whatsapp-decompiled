package X;

import android.util.Base64;
import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.744  reason: invalid class name */
public class AnonymousClass744 {
    public C128516gE A00;
    public C1407372t A01;
    public Exception A02;
    public String A03;
    public String A04;
    public final AnonymousClass190 A05;
    public final C218617r A06;
    public final AnonymousClass181 A07;
    public final AnonymousClass11Z A08;
    public final C185849dF A09;
    public final C18030ve A0A;
    public final C32381h6 A0B;
    public final WamediaManager A0C;
    public final C26501Sj A0D;
    public final C115295ti A0E;
    public final C136996uk A0F;
    public final C139666zF A0G;
    public final C127376eF A0H;
    public final C136956ug A0I;
    public final C131756lc A0J;
    public final File A0K;
    public final File A0L;
    public final File A0M;
    public final URL A0N;
    public final byte[] A0O;
    public final int[] A0P;
    public final AnonymousClass11P A0Q;
    public final AnonymousClass118 A0R;
    public final C24371Kb A0S;
    public final C191779nA A0T;
    public final String A0U;

    public static boolean A05(AnonymousClass744 r9, String str) {
        long j;
        BufferedInputStream bufferedInputStream;
        if (str != null) {
            try {
                File file = r9.A0L;
                MessageDigest A1I = C108945cZ.A1I();
                int[] iArr = r9.A0P;
                if (iArr == null || iArr.length != 4) {
                    j = -1;
                } else {
                    j = (long) (iArr[0] + iArr[1] + iArr[2]);
                }
                bufferedInputStream = new BufferedInputStream(new AnonymousClass6QY(C26511Sk.A0J(file), j));
                C1402370n.A02(bufferedInputStream, A1I);
                String encodeToString = Base64.encodeToString(A1I.digest(), 2);
                bufferedInputStream.close();
                if (str.equals(encodeToString)) {
                    return true;
                }
                Log.e("ProgressiveJpegUtils/setPartialImageFailed plaintextHashes did not match");
                return false;
            } catch (IOException | NoSuchAlgorithmException e) {
                Log.e("ProgressiveJpegUtils/validatePartialHashesFailed", e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        }
        return false;
        throw th;
    }

    public static AUZ A00(AnonymousClass744 r9, URL url, long j, long j2) {
        AUZ A022 = r9.A0S.A02(r9.A0T, r9.A0U, url, j, j2, true);
        if (r9.A00 == null) {
            r9.A00 = new C128516gE(A022.A01.getHeaderField("X-WA-Metadata"), A022.A00);
        }
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r6 == -1) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C190549l8 r16, X.AnonymousClass744 r17, X.AnonymousClass70M r18, java.io.RandomAccessFile r19, java.io.RandomAccessFile r20, int r21) {
        /*
            r4 = r21
            r6 = r18
            long r12 = r6.A05(r4)
            int r0 = r6.A02(r4)
            long r14 = (long) r0
            r7 = r20
            r7.seek(r12)
            r2 = 0
            int r0 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x001c
            r0 = 16
            long r2 = r12 - r0
        L_0x001c:
            r0 = r19
            r0.seek(r2)
            X.6QX r9 = new X.6QX
            r5 = r17
            r9.<init>(r5, r0)
            X.6Qa r10 = new X.6Qa
            r10.<init>(r5, r7)
            int r11 = r21 * 10
            r8 = r16
            r8.A00(r9, r10, r11, r12, r14)
            java.io.FileDescriptor r0 = r7.getFD()
            r0.sync()
            X.6zF r0 = r5.A0G
            int r1 = r0.A02
            r0 = 2
            if (r1 != r0) goto L_0x0090
            X.72t r8 = r5.A01
            X.C17960vV.A07(r8)
            int r0 = r8.A00
            if (r0 != 0) goto L_0x0090
            r1 = 0
            long r3 = r6.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            int r2 = r6.A03(r1)
        L_0x0057:
            int r1 = r6.A00
            if (r2 >= r1) goto L_0x0064
            boolean r0 = r6.A09(r2)
            if (r0 == 0) goto L_0x0064
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0064:
            if (r2 == r1) goto L_0x0070
            long r6 = r6.A05(r2)
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
        L_0x0070:
            r6 = r3
        L_0x0071:
            boolean r0 = r8.A02(r6)
            if (r0 != 0) goto L_0x0090
            X.72t r0 = r5.A01
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x008a
            X.17r r1 = r5.A06
            java.io.File r0 = r5.A0L
            java.io.File r0 = r1.A0P(r0)
            r0.createNewFile()
            return
        L_0x008a:
            X.6S8 r0 = new X.6S8
            r0.<init>()
            throw r0
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass744.A01(X.9l8, X.744, X.70M, java.io.RandomAccessFile, java.io.RandomAccessFile, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.AnonymousClass744 r6) {
        /*
            X.6zF r2 = r6.A0G
            X.1So r0 = r2.A0A
            boolean r1 = r2.A0Z
            boolean r0 = X.C63972u0.A04(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r5 = 0
            if (r0 == 0) goto L_0x0049
            boolean r0 = r2.A0P
            if (r0 != 0) goto L_0x0049
            int[] r1 = r6.A0P
            if (r1 == 0) goto L_0x0049
            X.6uk r4 = r6.A0F
            byte[] r0 = r4.A0G()
            if (r0 != 0) goto L_0x0049
            java.io.File r2 = r6.A0L
            r0 = r1[r5]
            long r0 = (long) r0
            r3 = 0
            X.6QR r2 = X.C124336Xy.A00(r2, r0)     // Catch:{ IOException -> 0x003c }
            byte[] r0 = X.C181039Ox.A00(r2)     // Catch:{ all -> 0x0035 }
            r2.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0043
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x003c }
            throw r0     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "ProgressiveJpegUtils/generateThumbnailFromFirstScan/errorGeneratingThumbnail"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = r3
        L_0x0043:
            r4.A0F(r0)
            if (r0 == 0) goto L_0x0049
            r5 = 1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass744.A02(X.744):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        if (r2 != 0) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0011 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.AnonymousClass744 r10, long r11) {
        /*
            X.5ti r0 = r10.A0E
            int r6 = r0.A15
            r0 = 3
            r5 = 6
            r4 = 5
            r3 = 4
            r9 = 0
            if (r6 == r0) goto L_0x0012
            if (r6 == r3) goto L_0x0012
            if (r6 == r4) goto L_0x0012
            if (r6 == r5) goto L_0x0012
        L_0x0011:
            return r9
        L_0x0012:
            X.6zF r2 = r10.A0G
            X.1So r1 = r2.A0A
            boolean r0 = r2.A0Z
            if (r0 == 0) goto L_0x006f
            boolean r0 = X.C63972u0.A0A(r1)
            if (r0 == 0) goto L_0x0043
            if (r6 == r4) goto L_0x0024
            if (r6 != r5) goto L_0x0043
        L_0x0024:
            long r5 = r2.A07
            long r3 = r2.A06
            r7 = 1084227584(0x40a00000, float:5.0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0038
            r2 = 0
        L_0x0032:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            r9 = 1
            return r9
        L_0x0038:
            float r1 = (float) r5
            float r0 = (float) r3
            float r1 = r1 / r0
            float r7 = r7 * r1
            double r0 = (double) r7
            double r0 = java.lang.Math.ceil(r0)
            long r2 = (long) r0
            goto L_0x0032
        L_0x0043:
            boolean r0 = X.C63972u0.A04(r1)
            if (r0 == 0) goto L_0x006f
            if (r6 != r3) goto L_0x006f
            X.0ve r2 = r10.A0A
            r1 = 8523(0x214b, float:1.1943E-41)
            X.0vf r0 = X.C18040vf.A02
            int r8 = X.C18020vd.A00(r0, r2, r1)
            int[] r7 = r10.A0P
            r5 = 0
            if (r7 == 0) goto L_0x0077
            r4 = 0
            r2 = 0
        L_0x005e:
            int r0 = r7.length
            if (r4 >= r0) goto L_0x006a
            if (r4 >= r8) goto L_0x006a
            r0 = r7[r4]
            long r0 = (long) r0
            long r2 = r2 + r0
            int r4 = r4 + 1
            goto L_0x005e
        L_0x006a:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            goto L_0x0032
        L_0x006f:
            int[] r0 = r10.A0P
            if (r0 == 0) goto L_0x0077
            r0 = r0[r9]
            long r2 = (long) r0
            goto L_0x0032
        L_0x0077:
            r2 = 262144(0x40000, double:1.295163E-318)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass744.A03(X.744, long):boolean");
    }

    public static boolean A04(AnonymousClass744 r8, AnonymousClass70M r9) {
        int[] iArr;
        String str;
        C139666zF r7 = r8.A0G;
        if (r7.A02 == 3 && r9 != null && (iArr = r8.A0P) != null && iArr.length == 4 && (str = r7.A0M) != null && r9.A09(0) && r9.A09(1) && r9.A09(2)) {
            try {
                if (r8.A0J.A00(r8.A0L, iArr[0], r7.A0Z) && A05(r8, str)) {
                    return A06(r8, iArr);
                }
            } catch (IOException e) {
                Log.e("StreamMediaDownloadHandler/attemptSetPartialProgressiveJpegOnDownloadFailure", e);
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A06(X.AnonymousClass744 r7, int[] r8) {
        /*
            java.io.File r1 = r7.A0L
            r6 = 0
            r4 = 1
            java.lang.String r0 = "rw"
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0035 }
            r5.<init>(r1, r0)     // Catch:{ IOException -> 0x0035 }
            r1 = r8[r6]     // Catch:{ all -> 0x002e }
            r0 = r8[r4]     // Catch:{ all -> 0x002e }
            int r1 = r1 + r0
            r0 = 2
            r0 = r8[r0]     // Catch:{ all -> 0x002e }
            int r1 = r1 + r0
            long r2 = (long) r1     // Catch:{ all -> 0x002e }
            r5.seek(r2)     // Catch:{ all -> 0x002e }
            byte[] r0 = X.C26511Sk.A02     // Catch:{ all -> 0x002e }
            r5.write(r0)     // Catch:{ all -> 0x002e }
            r0 = 2
            long r2 = r2 + r0
            r5.setLength(r2)     // Catch:{ all -> 0x002e }
            java.io.FileDescriptor r0 = r5.getFD()     // Catch:{ all -> 0x002e }
            r0.sync()     // Catch:{ all -> 0x002e }
            r5.close()     // Catch:{ IOException -> 0x0035 }
            goto L_0x003c
        L_0x002e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x0035 }
            throw r0     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            java.lang.String r0 = "ProgressiveJpegUtils/setPartialImageToReadableFile/failed to set file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            X.6uk r1 = r7.A0F
            if (r0 == 0) goto L_0x004f
            monitor-enter(r1)
            r1.A0G = r4     // Catch:{ all -> 0x004c }
            monitor-exit(r1)
            X.6ug r1 = r7.A0I
            r0 = 3
            r1.A02(r0)
            return r4
        L_0x004c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x004f:
            r1.A07()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass744.A06(X.744, int[]):boolean");
    }

    public AnonymousClass744(AnonymousClass190 r5, C218617r r6, AnonymousClass181 r7, AnonymousClass11P r8, AnonymousClass118 r9, AnonymousClass11Z r10, C18030ve r11, C24371Kb r12, C32381h6 r13, WamediaManager wamediaManager, C26501Sj r15, C115295ti r16, C136996uk r17, C139666zF r18, C127376eF r19, C191779nA r20, C136956ug r21, C131756lc r22, File file, File file2, File file3, String str, URL url, byte[] bArr, int[] iArr) {
        this.A0R = r9;
        this.A0Q = r8;
        this.A0A = r11;
        this.A05 = r5;
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r10;
        this.A0C = wamediaManager;
        this.A0B = r13;
        this.A0D = r15;
        this.A0J = r22;
        this.A0O = bArr;
        C139666zF r3 = r18;
        this.A0G = r3;
        C136996uk r2 = r17;
        this.A0F = r2;
        this.A0P = iArr;
        this.A0S = r12;
        this.A0H = r19;
        this.A09 = new C20583AQt(r3.A0A).BIV(r3.A0e);
        this.A0E = r16;
        this.A0I = r21;
        this.A0N = url;
        this.A0M = file;
        this.A0L = file2;
        this.A0K = file3;
        this.A0T = r20;
        C17960vV.A0D(r3.A02());
        if (r3.A02 == 3) {
            r2.A06 = Integer.valueOf(r3.A0M == null ? 4 : 6);
        }
        this.A0U = str;
    }
}
