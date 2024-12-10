package X;

/* renamed from: X.12C  reason: invalid class name */
public final class AnonymousClass12C implements C201511a {
    public final C218617r A00;
    public final AnonymousClass118 A01;

    public AnonymousClass12C(C218617r r2, AnonymousClass118 r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A00(X.AnonymousClass210 r7, X.C110485fs r8) {
        /*
            r6 = this;
            r5 = 0
            X.C17960vV.A01()
            X.118 r0 = r6.A01
            android.content.Context r0 = r0.A00
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
            float r1 = (float) r3
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r2 = X.C22339B3q.A01(r1)
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r8.measure(r1, r0)
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r3, r2, r0)
            X.C18070vi.A0X(r4)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r4)
            r8.layout(r5, r5, r3, r2)
            r8.draw(r0)
            r5 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.lang.String r0 = "share-"
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            X.205 r0 = r7.A0v     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.lang.String r0 = r0.A01     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.lang.String r0 = X.C17970vW.A05(r0)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.lang.String r0 = ".png"
            r1.append(r0)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.lang.String r1 = r1.toString()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            X.17r r0 = r6.A00     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.io.File r0 = r0.A0G()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.io.File r3 = X.C218617r.A02(r0, r1)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x007b }
            r0 = 75
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x007b }
            r2.flush()     // Catch:{ all -> 0x007b }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            r4.recycle()
            return r3
        L_0x007b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007d }
        L_0x007d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
            throw r0     // Catch:{ FileNotFoundException -> 0x0082, IOException -> 0x009b }
        L_0x0082:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r1.<init>()     // Catch:{ all -> 0x009f }
            java.lang.String r0 = "File not found: "
            r1.append(r0)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x009f }
            r1.append(r0)     // Catch:{ all -> 0x009f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009f }
        L_0x009b:
            r4.recycle()
            return r5
        L_0x009f:
            r0 = move-exception
            r4.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12C.A00(X.210, X.5fs):java.io.File");
    }
}
