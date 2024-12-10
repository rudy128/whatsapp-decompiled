package X;

/* renamed from: X.64z  reason: invalid class name and case insensitive filesystem */
public final class C1187864z extends AnonymousClass7H2 {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0020, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap CP6(int r8) {
        /*
            r7 = this;
            java.lang.String r6 = "got exception decoding bitmap "
            r5 = 0
            java.io.File r1 = r7.A02     // Catch:{ IOException | SecurityException -> 0x0021 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r4 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ IOException | SecurityException -> 0x0021 }
            long r2 = (long) r8     // Catch:{ all -> 0x001a }
            long r2 = r2 * r2
            r0 = 2
            long r2 = r2 * r0
            android.graphics.Bitmap r0 = X.C137236v8.A01(r4, r8, r2)     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x0019
            r4.close()     // Catch:{ IOException | SecurityException -> 0x0021 }
        L_0x0019:
            return r0
        L_0x001a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException | SecurityException -> 0x0021 }
            throw r0     // Catch:{ IOException | SecurityException -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1187864z.CP6(int):android.graphics.Bitmap");
    }

    public String BUw() {
        return "image/*";
    }

    public int getType() {
        return 0;
    }
}
