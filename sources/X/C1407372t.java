package X;

import com.whatsapp.media.WamediaManager;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.72t  reason: invalid class name and case insensitive filesystem */
public class C1407372t {
    public static final byte[] A05 = {102, 116, 121, 112};
    public static final byte[] A06 = {109, 100, 97, 116};
    public static final byte[] A07 = {109, 111, 111, 118};
    public int A00 = 0;
    public long A01 = 262144;
    public final long A02;
    public final WamediaManager A03;
    public final File A04;

    public static int A00(int i, int i2, int i3, int i4) {
        return (((((i & 255) << 24) | ((i2 & 255) << 16)) | ((i3 & 255) << 8)) | (i4 & 255)) - 8;
    }

    private int A01(boolean z) {
        try {
            long j = this.A03.streamCheck(this.A04, z, this.A02).bytesRequiredToExtractThumbnail;
            if (j <= 0) {
                return 1;
            }
            this.A01 = j;
            return 1;
        } catch (AnonymousClass2RS e) {
            Log.e("Mp4StreamCheck/failed/exception", e);
            this.A03.uploadMp4FailureLogs(this.A04, e, "stream check on download", false);
            return 2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        r5 = 0;
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (r12 == false) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        if (r0 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        if (r5 > r0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cf, code lost:
        if (r5 <= (r0 - 1024)) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        r3 = A01(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d6, code lost:
        if (r0 == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d8, code lost:
        com.whatsapp.util.Log.e("Mp4StreamCheck/mdat before moov, failing check");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r3 = A01(false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(long r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            if (r0 == 0) goto L_0x0006
            r2 = 0
            return r2
        L_0x0006:
            java.io.File r0 = r14.A04
            java.io.FileInputStream r8 = X.C108945cZ.A18(r0)
            r6 = 8
            byte[] r5 = new byte[r6]     // Catch:{ all -> 0x00fa }
            r4 = 0
            int r0 = r8.read(r5, r4, r6)     // Catch:{ all -> 0x00fa }
            r7 = 1
            if (r0 != r6) goto L_0x00de
            byte[] r3 = A05     // Catch:{ all -> 0x00fa }
            r9 = 4
            r2 = 0
        L_0x001c:
            int r0 = r2 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x00fa }
            byte r0 = r3[r2]     // Catch:{ all -> 0x00fa }
            if (r1 == r0) goto L_0x0025
            goto L_0x002b
        L_0x0025:
            int r2 = r2 + 1
            r0 = 1
            if (r2 >= r9) goto L_0x002c
            goto L_0x001c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r3 = 2
            if (r0 == 0) goto L_0x00e6
            byte r10 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r2 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            r13 = 3
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r11 = A00(r10, r2, r1, r0)
            int r2 = r11 + 8
            long r0 = (long) r2
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 > 0) goto L_0x00de
            long r0 = (long) r11     // Catch:{ all -> 0x00fa }
            r8.skip(r0)     // Catch:{ all -> 0x00fa }
            r12 = 0
        L_0x0048:
            int r0 = r2 + 8
            long r0 = (long) r0     // Catch:{ all -> 0x00fa }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x00a6
            int r0 = r8.read(r5, r4, r6)     // Catch:{ all -> 0x00fa }
            int r2 = r2 + r0
            if (r0 != r6) goto L_0x00de
            byte[] r11 = A07     // Catch:{ all -> 0x00fa }
            r10 = 0
        L_0x0059:
            int r0 = r10 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x00fa }
            byte r0 = r11[r10]     // Catch:{ all -> 0x00fa }
            if (r1 == r0) goto L_0x0082
            byte[] r11 = A06     // Catch:{ all -> 0x00fa }
            r10 = 0
        L_0x0064:
            int r0 = r10 + 4
            byte r1 = r5[r0]     // Catch:{ all -> 0x00fa }
            byte r0 = r11[r10]     // Catch:{ all -> 0x00fa }
            if (r1 == r0) goto L_0x007d
            byte r11 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r10 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r10 = A00(r11, r10, r1, r0)     // Catch:{ all -> 0x00fa }
            long r0 = (long) r10     // Catch:{ all -> 0x00fa }
            r8.skip(r0)     // Catch:{ all -> 0x00fa }
            goto L_0x00a0
        L_0x007d:
            int r10 = r10 + 1
            if (r10 < r9) goto L_0x0064
            goto L_0x00aa
        L_0x0082:
            int r10 = r10 + 1
            if (r10 < r9) goto L_0x0059
            byte r11 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r10 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r10 = A00(r11, r10, r1, r0)
            int r0 = r2 + r10
            long r0 = (long) r0
            int r11 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r11 > 0) goto L_0x00de
            long r0 = (long) r10     // Catch:{ all -> 0x00fa }
            r8.skip(r0)     // Catch:{ all -> 0x00fa }
            int r2 = r2 + r10
            r12 = 1
            goto L_0x0048
        L_0x00a0:
            int r2 = r2 + r10
            long r0 = (long) r2     // Catch:{ all -> 0x00fa }
            int r10 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r10 <= 0) goto L_0x0048
        L_0x00a6:
            r5 = 0
            r0 = 0
            goto L_0x00c0
        L_0x00aa:
            byte r9 = r5[r4]     // Catch:{ all -> 0x00fa }
            byte r6 = r5[r7]     // Catch:{ all -> 0x00fa }
            byte r1 = r5[r3]     // Catch:{ all -> 0x00fa }
            byte r0 = r5[r13]     // Catch:{ all -> 0x00fa }
            int r6 = A00(r9, r6, r1, r0)
            int r0 = r2 + 8
            long r0 = (long) r0
            int r5 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r5 >= 0) goto L_0x00de
            int r2 = r2 + r6
            long r5 = (long) r2
            r0 = 1
        L_0x00c0:
            if (r12 == 0) goto L_0x00d6
            if (r0 == 0) goto L_0x00de
            long r0 = r14.A02     // Catch:{ all -> 0x00fa }
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e6
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 - r2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x00e2
            int r3 = r14.A01(r7)     // Catch:{ all -> 0x00fa }
            goto L_0x00e6
        L_0x00d6:
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "Mp4StreamCheck/mdat before moov, failing check"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fa }
            goto L_0x00e6
        L_0x00de:
            r2 = 1
            java.lang.String r0 = "Mp4StreamCheck/need more data to attempt stream check"
            goto L_0x00f3
        L_0x00e2:
            int r3 = r14.A01(r4)     // Catch:{ all -> 0x00fa }
        L_0x00e6:
            r14.A00 = r3     // Catch:{ all -> 0x00fa }
            r2 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "Mp4StreamCheck/check complete: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x00fa }
        L_0x00f3:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fa }
            r8.close()
            return r2
        L_0x00fa:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00ff }
            throw r1
        L_0x00ff:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407372t.A02(long):boolean");
    }

    public C1407372t(WamediaManager wamediaManager, File file, long j) {
        this.A03 = wamediaManager;
        this.A04 = file;
        this.A02 = j;
    }
}
