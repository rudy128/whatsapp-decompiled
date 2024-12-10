package X;

import android.net.Uri;
import java.lang.ref.WeakReference;

/* renamed from: X.6MT  reason: invalid class name */
public class AnonymousClass6MT extends A34 {
    public String A00;
    public final Uri A01;
    public final C26521Sl A02;
    public final WeakReference A03;

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C25124CYx A00(android.graphics.Bitmap r10, X.C25640CjT r11) {
        /*
            r3 = r10
            int r1 = r10.getWidth()
            int r0 = r10.getHeight()
            int r1 = r1 * r0
            int[] r4 = new int[r1]
            int r6 = r10.getWidth()
            int r9 = r10.getWidth()
            int r10 = r10.getHeight()
            r5 = 0
            r8 = r5
            r7 = r5
            r3.getPixels(r4, r5, r6, r7, r8, r9, r10)
            int r2 = r3.getWidth()
            int r0 = r3.getHeight()
            X.Bne r1 = new X.Bne
            r1.<init>(r2, r4, r0)
            r0 = 0
            X.CYx r0 = X.CDQ.A00(r1, r11, r0)     // Catch:{ C2R -> 0x0030, all -> 0x0031 }
        L_0x0030:
            return r0
        L_0x0031:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MT.A00(android.graphics.Bitmap, X.CjT):X.CYx");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        com.whatsapp.util.Log.e("CheckImageForQrCodeAsyncTask/OOM ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        com.whatsapp.util.Log.e("contactQrActivity/checkImageForQrCode/ioexception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        return 0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[ExcHandler: 1iX | IOException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r13) {
        /*
            r12 = this;
            r11 = 0
            X.1Sl r6 = r12.A02     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            android.net.Uri r7 = r12.A01     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            r10 = 1
            r8 = 2000(0x7d0, float:2.803E-42)
            r9 = r8
            android.graphics.Bitmap r5 = r6.A0i(r7, r8, r9, r10, r11)     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            X.CjT r4 = new X.CjT     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            r4.<init>()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            X.CYx r3 = A00(r5, r4)     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
        L_0x0016:
            r6 = 1
            if (r3 != 0) goto L_0x0064
            int r0 = r5.getWidth()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            double r0 = (double) r0     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            r9 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r0 = r0 / r9
            r7 = 4644337115725824000(0x4074000000000000, double:320.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0064
            int r0 = r5.getHeight()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            double r0 = (double) r0     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            double r0 = r0 / r9
            r7 = 4647151865492930560(0x407e000000000000, double:480.0)
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 < 0) goto L_0x0064
            int r0 = r5.getWidth()     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            double r0 = r0 / r9
            double r0 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            int r3 = (int) r0     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            int r0 = r5.getHeight()     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            double r0 = (double) r0     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            double r0 = r0 / r9
            double r1 = java.lang.Math.floor(r0)     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            int r0 = (int) r1     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r5, r3, r0, r6)     // Catch:{ IllegalArgumentException -> 0x0059, 1iX | IOException -> 0x007e }
            r5.recycle()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            X.CYx r3 = A00(r0, r4)     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            r5 = r0
            goto L_0x0016
        L_0x0059:
            r5.getConfig()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            r5.isRecycled()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            return r0
        L_0x0064:
            r5.recycle()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            if (r3 != 0) goto L_0x006e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            return r0
        L_0x006e:
            java.lang.String r0 = r3.A02     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            r12.A00 = r0     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ 1iX | IOException -> 0x007e, OutOfMemoryError -> 0x0077 }
            return r0
        L_0x0077:
            r1 = move-exception
            java.lang.String r0 = "CheckImageForQrCodeAsyncTask/OOM "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0083
        L_0x007e:
            java.lang.String r0 = "contactQrActivity/checkImageForQrCode/ioexception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0083:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MT.A0G(java.lang.Object[]):java.lang.Object");
    }

    public AnonymousClass6MT(Uri uri, C1601987n r3, C26521Sl r4) {
        this.A02 = r4;
        this.A03 = AnonymousClass3MW.A0z(r3);
        this.A01 = uri;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        int A0M = AnonymousClass000.A0M(obj);
        C1601987n r1 = (C1601987n) this.A03.get();
        if (r1 != null) {
            r1.C3m(this.A00, A0M);
        }
    }
}
