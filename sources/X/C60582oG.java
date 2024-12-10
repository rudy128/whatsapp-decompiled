package X;

/* renamed from: X.2oG  reason: invalid class name and case insensitive filesystem */
public abstract class C60582oG {
    public static final String A00(C1418377d r4, int i, int i2, boolean z) {
        String obj;
        String str = r4.A0F;
        if (str != null) {
            obj = AnonymousClass1YE.A07(str, "/", "-", false);
        } else {
            obj = r4.toString();
        }
        if (r4.A0O) {
            String str2 = r4.A0I;
            if (str2 == null) {
                str2 = r4.toString();
            }
            obj = C29361c9.A0Q(str2, 225);
        }
        StringBuilder A11 = AnonymousClass000.A11(obj);
        A11.append('_');
        A11.append(i);
        A11.append('_');
        A11.append(i2);
        A11.append('_');
        A11.append(z);
        return A11.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0142, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0146, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0149, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x014d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x012f, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A01(X.C218617r r11, X.AnonymousClass11C r12, com.whatsapp.media.WamediaManager r13, X.C1418377d r14) {
        /*
            java.lang.String r8 = r14.A0B
            r10 = 0
            if (r8 != 0) goto L_0x000b
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData filePath is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000a:
            return r10
        L_0x000b:
            int r0 = r8.length()     // Catch:{ IOException -> 0x015d }
            if (r0 != 0) goto L_0x0014
            r9 = 0
            goto L_0x013c
        L_0x0014:
            int r1 = r14.A01     // Catch:{ IOException -> 0x015d }
            r0 = 3
            if (r1 != r0) goto L_0x006c
            X.11B r1 = r12.A0O()     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r14.A0B     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
            java.io.InputStream r3 = r1.A07(r0)     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
            goto L_0x002b
        L_0x002a:
            r3 = r10
        L_0x002b:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x004d }
            r2.<init>()     // Catch:{ all -> 0x004d }
            if (r3 == 0) goto L_0x0048
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x0041 }
            byte[] r9 = r2.toByteArray()     // Catch:{ all -> 0x0041 }
            r2.close()     // Catch:{ all -> 0x004d }
            r3.close()     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
            goto L_0x013c
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x0048:
            r2.close()     // Catch:{ all -> 0x004d }
            goto L_0x013b
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
            throw r0     // Catch:{ IOException -> 0x0064, SecurityException -> 0x005c, IllegalArgumentException -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IllegalArgumentException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015d }
            goto L_0x013b
        L_0x005c:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/SecurityException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015d }
            goto L_0x013b
        L_0x0064:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IOException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015d }
            goto L_0x013b
        L_0x006c:
            r9 = 0
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x015d }
            r5.<init>(r8)     // Catch:{ IOException -> 0x015d }
            boolean r0 = r5.exists()     // Catch:{ IOException -> 0x015d }
            if (r0 == 0) goto L_0x00cd
            long r0 = r5.length()     // Catch:{ IOException -> 0x015d }
            r2 = 1048576(0x100000, double:5.180654E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0108
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015d }
            java.lang.String r4 = "Sticker/getImageDataFromFile/sticker is above legal size limit: "
            r6.append(r4)     // Catch:{ IOException -> 0x015d }
            r6.append(r2)     // Catch:{ IOException -> 0x015d }
            java.lang.String r4 = ", hash: "
            r6.append(r4)     // Catch:{ IOException -> 0x015d }
            java.lang.String r4 = r14.A0F     // Catch:{ IOException -> 0x015d }
            X.C17890vO.A1A(r6, r4)     // Catch:{ IOException -> 0x015d }
            java.lang.String r6 = r14.A0F     // Catch:{ IOException -> 0x015d }
            java.lang.String r4 = r14.A0I     // Catch:{ IOException -> 0x015d }
            java.io.File r7 = r11.A0g(r6, r4)     // Catch:{ IOException -> 0x015d }
            if (r7 != 0) goto L_0x00aa
            java.lang.String r0 = "Sticker/getImageDataFromFile/could not get sticker thumbnail file"
        L_0x00a5:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x015d }
            goto L_0x013c
        L_0x00aa:
            boolean r4 = r7.exists()     // Catch:{ IOException -> 0x015d }
            if (r4 != 0) goto L_0x0107
            boolean r0 = r14.A02()     // Catch:{ IOException -> 0x015d }
            if (r0 != 0) goto L_0x00ca
            int r0 = r13.getFirstFrameLocation(r8)     // Catch:{ IOException -> 0x015d }
            long r0 = (long) r0     // Catch:{ IOException -> 0x015d }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00d8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015d }
            java.lang.String r0 = "Sticker/getImageDataFromFile/even first frame is above legal size limit: "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ IOException -> 0x015d }
            goto L_0x00a5
        L_0x00ca:
            java.lang.String r0 = "Sticker/getImageDataFromFile/lottie sticker exceeds sticker file limit"
            goto L_0x00a5
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015d }
            java.lang.String r0 = "Sticker/getImageDataFromFile/sticker file cannot be found, "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ IOException -> 0x015d }
            goto L_0x00a5
        L_0x00d8:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x015d }
            r2.<init>(r5)     // Catch:{ IOException -> 0x015d }
            X.6QY r6 = new X.6QY     // Catch:{ IOException -> 0x015d }
            r6.<init>(r2, r0)     // Catch:{ IOException -> 0x015d }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0147 }
            r5.<init>()     // Catch:{ all -> 0x0147 }
            X.C64062u9.A00(r6, r5)     // Catch:{ all -> 0x0140 }
            byte[] r4 = r5.toByteArray()     // Catch:{ all -> 0x0140 }
            int r3 = (int) r0     // Catch:{ all -> 0x0140 }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x0140 }
            boolean r2 = r13.createThumbnail(r4, r3, r2)     // Catch:{ all -> 0x0140 }
            if (r2 == 0) goto L_0x0100
            r5.close()     // Catch:{ all -> 0x0147 }
            r6.close()     // Catch:{ IOException -> 0x015d }
            goto L_0x0107
        L_0x0100:
            r5.close()     // Catch:{ all -> 0x0147 }
            r6.close()     // Catch:{ IOException -> 0x015d }
            goto L_0x013c
        L_0x0107:
            r5 = r7
        L_0x0108:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ OutOfMemoryError -> 0x0134 }
            r2.<init>(r5)     // Catch:{ OutOfMemoryError -> 0x0134 }
            X.6QY r3 = new X.6QY     // Catch:{ OutOfMemoryError -> 0x0134 }
            r3.<init>(r2, r0)     // Catch:{ OutOfMemoryError -> 0x0134 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x012d }
            r2.<init>()     // Catch:{ all -> 0x012d }
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x0126 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0126 }
            r2.close()     // Catch:{ all -> 0x012d }
            r3.close()     // Catch:{ OutOfMemoryError -> 0x0134 }
            r9 = r0
            goto L_0x013c
        L_0x0126:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0134 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromFile/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x015d }
            goto L_0x013c
        L_0x013b:
            r9 = r10
        L_0x013c:
            r10 = r9
            if (r9 != 0) goto L_0x000a
            goto L_0x014e
        L_0x0140:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0142 }
        L_0x0142:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0147:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0149 }
        L_0x0149:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ IOException -> 0x015d }
            throw r0     // Catch:{ IOException -> 0x015d }
        L_0x014e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x015d }
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker file does not exist: "
            r1.append(r0)     // Catch:{ IOException -> 0x015d }
            java.lang.String r0 = r14.A0F     // Catch:{ IOException -> 0x015d }
            X.C17890vO.A1B(r1, r0)     // Catch:{ IOException -> 0x015d }
            return r10
        L_0x015d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker IOException when getting image data: "
            r1.append(r0)
            java.lang.String r0 = r14.A0F
            r1.append(r0)
            X.C17880vN.A1M(r1, r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60582oG.A01(X.17r, X.11C, com.whatsapp.media.WamediaManager, X.77d):byte[]");
    }
}
