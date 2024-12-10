package X;

import java.util.Set;

/* renamed from: X.2r8  reason: invalid class name and case insensitive filesystem */
public final class C62272r8 {
    public static final C18180vt A03 = new C18180vt(1, 1);
    public static final AnonymousClass747 A04 = new Object();
    public static final Object A05 = C17880vN.A0p();
    public static final Set A06 = AnonymousClass1AP.A01("wmv", "aif", "cda", "mpa", "opus", "ogg", "wlp", "amr", "mp3", "m4a", "aac", "wav", "wma");
    public static final Set A07 = AnonymousClass1AP.A01("7z", "arj", "deb", "pkg", "rar", "rpm", "gz", "z", "zip");
    public static final Set A08 = AnonymousClass1AP.A01("pdf", "doc", "docx", "ppt", "pptx", "xls", "xlsx", "txt", "rtf", "tex", "csv", "wpd");
    public static final Set A09 = AnonymousClass1AP.A01("apk", "bat", "bin", "cgi", "pl", "com", "exe", "gadget", "jar", "msi", "py", "wsf");
    public static final Set A0A = AnonymousClass1AP.A01("ai", "ico", "jpeg", "jpg", "png", "ps", "psd", "svg", "tif", "tiff");
    public static final Set A0B = AnonymousClass1AP.A01("vcf", "vcard");
    public static final Set A0C = AnonymousClass1AP.A01("3g2", "3gp", "avi", "flv", "h264", "m4v", "mkv", "mov", "mp4", "mpg", "mpeg", "rm", "vob");
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final C1408873l A02;

    public final boolean A00(String str) {
        if (str == null) {
            return false;
        }
        if ("application/pdf".equals(str) || "application/vnd.openxmlformats-officedocument.presentationml.presentation".equals(str) || "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet".equals(str) || "application/vnd.openxmlformats-officedocument.wordprocessingml.document".equals(str)) {
            return true;
        }
        if (C18020vd.A05(C18040vf.A02, this.A01, 1258)) {
            return AnonymousClass747.A05(str) || C26521Sl.A0f(str);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0133, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0137, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A01(java.io.File r17, java.lang.String r18, float r19, int r20) {
        /*
            r16 = this;
            r7 = 0
            r3 = r17
            if (r17 == 0) goto L_0x0145
            r4 = r16
            r5 = r18
            boolean r0 = r4.A00(r5)
            if (r0 == 0) goto L_0x0145
            java.lang.String r0 = "application/pdf"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x013f }
            if (r0 == 0) goto L_0x003b
            r0 = 1139802112(0x43f00000, float:480.0)
            float r19 = r19 * r0
            int r4 = X.C22339B3q.A01(r19)     // Catch:{ Exception -> 0x013f }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x013f }
            X.C18070vi.A0X(r2)     // Catch:{ Exception -> 0x013f }
            r1 = 0
            boolean r0 = X.C39761tb.A08()     // Catch:{ Exception -> 0x013f }
            if (r0 != 0) goto L_0x0145
            android.graphics.Bitmap r1 = X.AnonymousClass747.A01(r2, r1, r1, r4, r1)     // Catch:{ Exception -> 0x013f }
            if (r1 == 0) goto L_0x0145
            byte[] r0 = X.AnonymousClass747.A06(r1)     // Catch:{ Exception -> 0x013f }
            r1.recycle()     // Catch:{ Exception -> 0x013f }
            return r0
        L_0x003b:
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.presentationml.presentation"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x013f }
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x013f }
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "application/vnd.openxmlformats-officedocument.wordprocessingml.document"
            boolean r0 = r0.equals(r5)     // Catch:{ Exception -> 0x013f }
            if (r0 != 0) goto L_0x00aa
            X.0ve r2 = r4.A01     // Catch:{ Exception -> 0x013f }
            r1 = 6003(0x1773, float:8.412E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x013f }
            int r0 = X.C18020vd.A00(r0, r2, r1)     // Catch:{ Exception -> 0x013f }
            float r0 = (float) r0     // Catch:{ Exception -> 0x013f }
            float r19 = r19 * r0
            int r11 = X.C22339B3q.A01(r19)     // Catch:{ Exception -> 0x013f }
            boolean r0 = X.AnonymousClass747.A05(r5)     // Catch:{ Exception -> 0x013f }
            r12 = r20
            if (r0 == 0) goto L_0x0077
            X.73l r1 = r4.A02     // Catch:{ Exception -> 0x013f }
            android.net.Uri r0 = android.net.Uri.fromFile(r3)     // Catch:{ Exception -> 0x013f }
            byte[] r7 = r1.A05(r0, r11, r11, r12)     // Catch:{ Exception -> 0x013f }
            return r7
        L_0x0077:
            boolean r0 = X.C26521Sl.A0f(r5)     // Catch:{ Exception -> 0x013f }
            if (r0 == 0) goto L_0x0145
            r2 = 0
            X.DRK.A04(r3)     // Catch:{ IOException -> 0x0082 }
            goto L_0x0084
        L_0x0082:
            r0 = 0
            goto L_0x0085
        L_0x0084:
            r0 = 1
        L_0x0085:
            if (r0 == 0) goto L_0x0090
            android.graphics.Bitmap r2 = X.DRK.A00(r3)     // Catch:{ IOException | IllegalArgumentException -> 0x008c, Exception -> 0x009f }
            goto L_0x00a5
        L_0x008c:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x00a2
        L_0x0090:
            r13 = 0
            r9 = 0
            X.6c1 r8 = new X.6c1     // Catch:{ Exception -> 0x013f }
            r8.<init>(r3)     // Catch:{ Exception -> 0x013f }
            r15 = r9
            r10 = r9
            android.graphics.Bitmap r2 = X.C1408873l.A00(r7, r8, r9, r10, r11, r12, r13, r15)     // Catch:{ Exception -> 0x013f }
            goto L_0x00a5
        L_0x009f:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x00a2:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x013f }
        L_0x00a5:
            byte[] r7 = X.C1408873l.A03(r2, r11)     // Catch:{ Exception -> 0x013f }
            return r7
        L_0x00aa:
            r0 = 1139802112(0x43f00000, float:480.0)
            float r19 = r19 * r0
            int r5 = X.C22339B3q.A01(r19)     // Catch:{ Exception -> 0x013f }
            r6 = 0
            java.lang.String r0 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0138 }
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0138 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r0 = "docProps/thumbnail.jpeg"
            java.util.zip.ZipEntry r0 = r2.getEntry(r0)     // Catch:{ all -> 0x0131 }
            if (r0 == 0) goto L_0x012d
            java.io.InputStream r3 = r2.getInputStream(r0)     // Catch:{ all -> 0x0131 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0126 }
            r1.<init>()     // Catch:{ all -> 0x0126 }
            r0 = 1
            r1.inDither = r0     // Catch:{ all -> 0x0126 }
            android.graphics.Bitmap r8 = X.AnonymousClass204.A06(r1, r3)     // Catch:{ all -> 0x0126 }
            if (r8 == 0) goto L_0x0120
            int r0 = r8.getWidth()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0120
            int r0 = r8.getHeight()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x0120
            int r4 = r8.getWidth()     // Catch:{ all -> 0x0126 }
            int r0 = r8.getHeight()     // Catch:{ all -> 0x0126 }
            if (r4 >= r0) goto L_0x00ed
            r4 = r0
        L_0x00ed:
            if (r4 <= r5) goto L_0x0119
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r5     // Catch:{ all -> 0x0126 }
            float r1 = r1 * r0
            float r0 = (float) r4     // Catch:{ all -> 0x0126 }
            float r1 = r1 / r0
            android.graphics.Matrix r13 = new android.graphics.Matrix     // Catch:{ all -> 0x0126 }
            r13.<init>()     // Catch:{ all -> 0x0126 }
            r13.setScale(r1, r1)     // Catch:{ all -> 0x0126 }
            int r11 = r8.getWidth()     // Catch:{ all -> 0x0126 }
            int r12 = r8.getHeight()     // Catch:{ all -> 0x0126 }
            r14 = 1
            r9 = 0
            r10 = r9
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0126 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0126 }
            boolean r0 = r1.equals(r8)     // Catch:{ all -> 0x0126 }
            if (r0 != 0) goto L_0x0119
            r8.recycle()     // Catch:{ all -> 0x0126 }
            r8 = r1
        L_0x0119:
            byte[] r6 = X.AnonymousClass747.A06(r8)     // Catch:{ all -> 0x0126 }
            r8.recycle()     // Catch:{ all -> 0x0126 }
        L_0x0120:
            if (r3 == 0) goto L_0x012d
            r3.close()     // Catch:{ all -> 0x0131 }
            goto L_0x012d
        L_0x0126:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x012d:
            r2.close()     // Catch:{ IOException -> 0x0138 }
            return r6
        L_0x0131:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0133 }
        L_0x0133:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0138 }
            throw r0     // Catch:{ IOException -> 0x0138 }
        L_0x0138:
            r1 = move-exception
            java.lang.String r0 = "documentutils/openxmlthumb "
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ Exception -> 0x013f }
            return r6
        L_0x013f:
            r1 = move-exception
            java.lang.String r0 = "documentutils/getthumbnail "
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0145:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62272r8.A01(java.io.File, java.lang.String, float, int):byte[]");
    }

    public C62272r8(AnonymousClass118 r1, C18030ve r2, C1408873l r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
