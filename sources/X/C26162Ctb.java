package X;

import android.os.Build;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Ctb  reason: case insensitive filesystem */
public abstract class C26162Ctb {
    public static boolean A03(C25092CXd cXd, C26052CrM crM, int[] iArr) {
        if (cXd != null && Build.VERSION.SDK_INT >= 24) {
            if (iArr.length == 0) {
                iArr = C108945cZ.A1W();
                // fill-array-data instruction
                iArr[0] = 7;
                iArr[1] = 6;
            }
            int length = iArr.length;
            int i = 0;
            while (i < length) {
                int i2 = iArr[i];
                if (crM != null) {
                    HashMap hashMap = cXd.A0J;
                    if (hashMap != null) {
                        C24322BzJ bzJ = C24322BzJ.VIDEO;
                        if (hashMap.get(bzJ) != null) {
                            Iterator A0j = C17890vO.A0j((AbstractMap) hashMap.get(bzJ));
                            while (A0j.hasNext()) {
                                Iterator A13 = AnonymousClass8BR.A13(A0j.next());
                                while (true) {
                                    if (A13.hasNext()) {
                                        if (((C25092CXd) A13.next()).A02 != i2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    i++;
                } else if (cXd.A02 != i2) {
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean A04(C24322BzJ bzJ, C26052CrM crM) {
        if (crM != null) {
            Iterator A0i = C17890vO.A0i(crM.A05(bzJ));
            loop0:
            while (A0i.hasNext()) {
                Iterator A13 = AnonymousClass8BR.A13(C17890vO.A0P(A0i));
                while (true) {
                    if (A13.hasNext()) {
                        MediaEffect mediaEffect = ((C6M) A13.next()).A01;
                        if (mediaEffect instanceof BW5) {
                            if (AnonymousClass000.A1O((((BW5) mediaEffect).A00 > 1.0f ? 1 : (((BW5) mediaEffect).A00 == 1.0f ? 0 : -1)))) {
                                break loop0;
                            }
                        } else {
                            break loop0;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r16.isEmpty() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(X.E7q r18, X.C25833Cmm r19, boolean r20) {
        /*
            r2 = r19
            java.util.List r0 = r2.A07
            java.util.ArrayList r17 = X.C17880vN.A10(r0)
            java.util.List r0 = r2.A06
            java.util.ArrayList r16 = X.C17880vN.A10(r0)
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r16.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            java.lang.String r0 = "only timelinespeed or pts mutator may be populated."
            X.C26171Ctn.A03(r1, r0)
            java.util.List r0 = r2.A04
            java.util.Iterator r2 = X.AnonymousClass8BV.A0y(r0)
            r14 = 0
            r12 = 0
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0041
            java.lang.Object r0 = r2.next()
            X.CcJ r0 = (X.C25271CcJ) r0
            r3 = r18
            r1 = r20
            long r0 = A02(r3, r0, r1)
            long r12 = r12 + r0
            goto L_0x002b
        L_0x0041:
            java.util.Iterator r11 = r17.iterator()
            r9 = 0
            r7 = 0
        L_0x0049:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r2 = r11.next()
            X.Cll r2 = (X.C25774Cll) r2
            X.A5W r1 = r2.A01
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r5 = r1.A03(r0)
            long r3 = r1.A02(r0)
            float r2 = r2.A00
            int r0 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            r5 = 0
        L_0x0069:
            int r0 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x006e
            r3 = r12
        L_0x006e:
            long r3 = r3 - r5
            long r9 = r9 + r3
            float r1 = (float) r3
            float r0 = java.lang.Math.abs(r2)
            float r1 = r1 / r0
            long r0 = (long) r1
            long r7 = r7 + r0
            goto L_0x0049
        L_0x0079:
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0082
            long r12 = r12 - r9
            long r12 = r12 + r7
        L_0x0081:
            return r12
        L_0x0082:
            java.util.Iterator r1 = r16.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            r1.next()
            java.lang.String r0 = "getSourceTimeRange"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26162Ctb.A01(X.E7q, X.Cmm, boolean):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        if ("image/gif".equals(X.C180949Oo.A00(r5.getPath(), "video/mp4", r13)) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(X.E7q r11, X.C25271CcJ r12, boolean r13) {
        /*
            X.By8 r1 = r12.A04
            X.By8 r0 = X.C24250By8.MULTI_PHOTO
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0112
            java.io.File r5 = r12.A05
            if (r5 == 0) goto L_0x0021
            java.lang.String r1 = r5.getPath()
            java.lang.String r0 = "video/mp4"
            java.lang.String r1 = X.C180949Oo.A00(r1, r0, r13)
            java.lang.String r0 = "image/gif"
            boolean r1 = r0.equals(r1)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r9 = 0
            if (r0 == 0) goto L_0x0080
            long r1 = r12.A02
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0114
            if (r5 == 0) goto L_0x0114
            r0 = 0
            java.io.FileInputStream r1 = X.C108945cZ.A18(r5)     // Catch:{ all -> 0x007e }
            X.Cv2 r7 = new X.Cv2     // Catch:{ all -> 0x0079 }
            r7.<init>(r1, r0)     // Catch:{ all -> 0x0079 }
            r7.A04()     // Catch:{ all -> 0x0079 }
            r1.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0072
            java.util.List r5 = r7.A05
            int r4 = r5.size()
            r3 = 0
            r2 = 0
        L_0x004c:
            if (r3 >= r4) goto L_0x006c
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0065
            int r0 = r5.size()
            r1 = 1
            if (r3 >= r0) goto L_0x0061
            java.lang.Object r0 = r5.get(r3)
            int[] r0 = (int[]) r0
            r1 = r0[r1]
        L_0x0061:
            int r2 = r2 + r1
            int r3 = r3 + 1
            goto L_0x004c
        L_0x0065:
            java.lang.String r0 = "getFrameDurationMs called before extract"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x006c:
            long r0 = (long) r2
            long r1 = r6.toMicros(r0)
            return r1
        L_0x0072:
            java.lang.String r0 = "getFrameCount called before extract"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0079:
            r0 = move-exception
            r1.close()     // Catch:{ IOException -> 0x007f }
            throw r0
        L_0x007e:
            r0 = move-exception
        L_0x007f:
            throw r0
        L_0x0080:
            boolean r0 = r12.A02(r13)
            if (r0 != 0) goto L_0x0112
            java.net.URL r3 = r12.A06
            X.A5W r1 = r12.A03
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r7 = r1.A03(r0)
            long r1 = r1.A02(r0)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x009a
            r7 = 0
        L_0x009a:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0110
            r6 = 0
            r4 = 1
            if (r3 == 0) goto L_0x00c7
            X.C28111Yx.A02(r11)     // Catch:{ IllegalArgumentException -> 0x00b5 }
            X.CXd r0 = r11.BKw(r3)     // Catch:{ IllegalArgumentException -> 0x00b5 }
            X.C28111Yx.A02(r0)     // Catch:{ IllegalArgumentException -> 0x00b5 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IllegalArgumentException -> 0x00b5 }
            long r0 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00b5 }
            long r1 = r2.toMicros(r0)     // Catch:{ IllegalArgumentException -> 0x00b5 }
            goto L_0x0110
        L_0x00b5:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.BE6.A1H(r3, r1, r6)
            java.lang.String r0 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. url: %s"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00c7:
            X.C28111Yx.A02(r5)     // Catch:{ IllegalArgumentException -> 0x00da }
            X.C28111Yx.A02(r11)     // Catch:{ IllegalArgumentException -> 0x00da }
            X.CXd r0 = X.BE7.A0I(r11, r5)     // Catch:{ IllegalArgumentException -> 0x00da }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ IllegalArgumentException -> 0x00da }
            long r0 = r0.A07     // Catch:{ IllegalArgumentException -> 0x00da }
            long r1 = r2.toMicros(r0)     // Catch:{ IllegalArgumentException -> 0x00da }
            goto L_0x0110
        L_0x00da:
            if (r5 == 0) goto L_0x0109
            java.util.Locale r3 = java.util.Locale.US
            java.lang.Object[] r2 = X.BE6.A1a()
            boolean r0 = r5.exists()
            X.AnonymousClass8BR.A1L(r2, r6, r0)
            boolean r0 = r5.canRead()
            X.AnonymousClass8BR.A1L(r2, r4, r0)
            r1 = 2
            java.lang.String r0 = r5.getPath()
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = r5.getCanonicalPath()
            r2[r1] = r0
            java.lang.String r0 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. exists: %b, canRead: %b, path: %s, canonicalPath: %s"
            java.lang.String r0 = java.lang.String.format(r3, r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0109:
            java.lang.String r0 = "mediaMetadataExtractor.extractMediaMetadata IllegalArgumentException. exists: sourceFile is NULL"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0110:
            long r1 = r1 - r7
            return r1
        L_0x0112:
            long r1 = r12.A02
        L_0x0114:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26162Ctb.A02(X.E7q, X.CcJ, boolean):long");
    }

    public static long A00(E7q e7q, C24322BzJ bzJ, C26052CrM crM, boolean z) {
        int size;
        HashMap A06 = crM.A06(bzJ);
        int i = 0;
        if (A06 == null) {
            size = 0;
        } else {
            size = A06.size();
        }
        long j = -1;
        while (i < size) {
            C25833Cmm A03 = crM.A03(bzJ, i);
            if (A03 != null) {
                C25833Cmm A032 = crM.A03(bzJ, i);
                C28111Yx.A02(A032);
                j = Math.max(j, A03.A00 + A01(e7q, A032, z));
                i++;
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("No track available for ");
                throw BE9.A0e(bzJ.name(), A10);
            }
        }
        return j;
    }
}
