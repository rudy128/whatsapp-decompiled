package X;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Trace;
import android.text.TextUtils;
import java.net.URL;
import java.util.HashMap;

/* renamed from: X.DGv  reason: case insensitive filesystem */
public class C26864DGv implements E7q {
    public final Context A00;
    public final boolean A01;
    public final HashMap A02 = C17880vN.A11();

    public static C25092CXd A01(MediaMetadataRetriever mediaMetadataRetriever, long j) {
        int i;
        long j2;
        long j3;
        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
        int A002 = A00(mediaMetadataRetriever2, 18, -1);
        int A003 = A00(mediaMetadataRetriever2, 19, -1);
        int A004 = A00(mediaMetadataRetriever2, 24, 0);
        int i2 = 3;
        if (Build.VERSION.SDK_INT >= 30) {
            int A005 = A00(mediaMetadataRetriever2, 36, 3);
            if (A005 == 6) {
                i2 = 6;
            } else if (A005 == 7) {
                i2 = 7;
            }
            i = A00(mediaMetadataRetriever2, 35, 1);
        } else {
            i = 1;
        }
        String extractMetadata = mediaMetadataRetriever2.extractMetadata(9);
        if (TextUtils.isEmpty(extractMetadata)) {
            j2 = 0;
        } else {
            try {
                j2 = Long.parseLong(extractMetadata);
            } catch (NumberFormatException unused) {
                j2 = 0;
            }
        }
        String extractMetadata2 = mediaMetadataRetriever2.extractMetadata(20);
        if (TextUtils.isEmpty(extractMetadata2)) {
            j3 = -1;
        } else {
            try {
                j3 = Long.parseLong(extractMetadata2);
            } catch (NumberFormatException unused2) {
                j3 = -1;
            }
        }
        long j4 = j;
        C25092CXd cXd = new C25092CXd((C26543D3e) null, (String) null, (String) null, (String) null, mediaMetadataRetriever2.extractMetadata(23), mediaMetadataRetriever2.extractMetadata(5), (String) null, (String) null, mediaMetadataRetriever2.extractMetadata(4), "VIDEO", (HashMap) null, A002, A003, A004, i2, i, -1, j2, j3, j4, AnonymousClass000.A1W(mediaMetadataRetriever2.extractMetadata(16)));
        Trace.endSection();
        return cXd;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:29|(2:31|32)|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
        if (r7 == null) goto L_0x007f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0070 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C25092CXd BKv(android.net.Uri r15) {
        /*
            r14 = this;
            java.util.HashMap r2 = r14.A02
            boolean r0 = r2.containsKey(r15)
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r2.get(r15)
            X.CXd r0 = (X.C25092CXd) r0
            return r0
        L_0x000f:
            java.lang.String r0 = "SystemVideoMetadataExtractor.extract"
            android.os.Trace.beginSection(r0)
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            boolean r0 = r14.A01     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x0077
            r7 = 0
            android.content.Context r0 = r14.A00     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            X.C26159CtX.A01(r0)     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            android.content.ContentResolver r1 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r7 = r1.openAssetFileDescriptor(r15, r0)     // Catch:{ FileNotFoundException -> 0x005a }
            if (r7 == 0) goto L_0x0053
            java.io.FileDescriptor r9 = r7.getFileDescriptor()     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            boolean r0 = r9.valid()     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            if (r0 == 0) goto L_0x0063
            long r5 = r7.getDeclaredLength()     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0047
            r8.setDataSource(r9)     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            goto L_0x0073
        L_0x0047:
            long r10 = r7.getStartOffset()     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            long r12 = r7.getDeclaredLength()     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            r8.setDataSource(r9, r10, r12)     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            goto L_0x0073
        L_0x0053:
            java.lang.String r0 = "file descriptor null"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            goto L_0x0069
        L_0x005a:
            r1 = move-exception
            java.lang.String r0 = "file not found"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            r3.<init>(r0, r1)     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
            goto L_0x0069
        L_0x0063:
            java.lang.String r0 = "file description invalid"
            java.lang.IllegalArgumentException r3 = X.AnonymousClass000.A0k(r0)     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
        L_0x0069:
            throw r3     // Catch:{ SecurityException -> 0x0071, all -> 0x006a }
        L_0x006a:
            r0 = move-exception
            if (r7 == 0) goto L_0x0070
            r7.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            throw r0     // Catch:{ Exception -> 0x00a6 }
        L_0x0071:
            if (r7 == 0) goto L_0x007f
        L_0x0073:
            r7.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x007f
        L_0x0077:
            android.content.Context r0 = r14.A00     // Catch:{ Exception -> 0x00a6 }
            X.C26159CtX.A01(r0)     // Catch:{ Exception -> 0x00a6 }
            r8.setDataSource(r0, r15)     // Catch:{ Exception -> 0x00a6 }
        L_0x007f:
            java.lang.String r0 = r15.getPath()     // Catch:{ Exception -> 0x00a6 }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = r15.getPath()     // Catch:{ Exception -> 0x00a6 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ Exception -> 0x00a6 }
            long r0 = r0.length()     // Catch:{ Exception -> 0x00a6 }
        L_0x0091:
            X.CXd r0 = A01(r8, r0)     // Catch:{ Exception -> 0x00a6 }
            r2.put(r15, r0)     // Catch:{ Exception -> 0x00a6 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x00a6 }
            goto L_0x009f
        L_0x009c:
            r0 = 0
            goto L_0x0091
        L_0x009f:
            android.os.Trace.endSection()
            r8.release()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            return r0
        L_0x00a6:
            r2 = move-exception
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x0123 }
            if (r0 == 0) goto L_0x0114
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "Exception in extractMediaMetadata isFileExists: "
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x0123 }
            boolean r0 = X.C108975cc.A1M(r0)     // Catch:{ all -> 0x0123 }
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " path is: "
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x0123 }
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " is readable: "
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x0123 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x0123 }
            boolean r0 = r0.canRead()     // Catch:{ all -> 0x0123 }
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " is writable: "
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x0123 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x0123 }
            boolean r0 = r0.canWrite()     // Catch:{ all -> 0x0123 }
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " file size in bytes: "
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = r15.getPath()     // Catch:{ all -> 0x0123 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x0123 }
            long r0 = r0.length()     // Catch:{ all -> 0x0123 }
            r3.append(r0)     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = " file uri is: "
            java.lang.String r0 = X.BEA.A0j(r15, r0, r3)     // Catch:{ all -> 0x0123 }
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r2)     // Catch:{ all -> 0x0123 }
        L_0x0113:
            throw r0     // Catch:{ all -> 0x0123 }
        L_0x0114:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0123 }
            java.lang.String r0 = "Exception in extractMediaMetadata invalid path, uri is: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r15, r0, r1)     // Catch:{ all -> 0x0123 }
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)     // Catch:{ all -> 0x0123 }
            goto L_0x0113
        L_0x0123:
            r0 = move-exception
            android.os.Trace.endSection()
            r8.release()     // Catch:{ all -> 0x012a }
        L_0x012a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26864DGv.BKv(android.net.Uri):X.CXd");
    }

    public C25092CXd BKw(URL url) {
        HashMap hashMap = this.A02;
        if (hashMap.containsKey(url.toString())) {
            return (C25092CXd) hashMap.get(url.toString());
        }
        Trace.beginSection("SystemVideoMetadataExtractor.extract");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(url.toString(), C17880vN.A11());
            C25092CXd A012 = A01(mediaMetadataRetriever, -1);
            hashMap.put(C26215Cuu.A01(url.toString()), A012);
            Trace.endSection();
            Trace.endSection();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused) {
            }
            return A012;
        } catch (Exception e) {
            throw BE6.A0o(BEA.A0j(url, "Exception in extractMediaMetadata:  file url is: ", AnonymousClass000.A10()), e);
        } catch (Throwable th) {
            Trace.endSection();
            try {
                mediaMetadataRetriever.release();
            } catch (Throwable unused2) {
            }
            throw th;
        }
    }

    public C26864DGv(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }

    public static int A00(MediaMetadataRetriever mediaMetadataRetriever, int i, int i2) {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(i);
        if (TextUtils.isEmpty(extractMetadata)) {
            return i2;
        }
        try {
            return Integer.parseInt(extractMetadata);
        } catch (NumberFormatException unused) {
            return i2;
        }
    }
}
