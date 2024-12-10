package X;

import android.net.Uri;

/* renamed from: X.65Z  reason: invalid class name */
public final class AnonymousClass65Z extends AnonymousClass7H1 {
    public final int A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass65Z(Uri uri, AnonymousClass11B r14, String str, String str2, int i, long j, long j2, long j3, boolean z) {
        super(uri, r14, str, str2, j, j2, j3);
        C18070vi.A0d(uri, 3);
        this.A01 = z;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 != 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap A02(android.graphics.BitmapFactory.Options r13, int r14) {
        /*
            r12 = this;
            X.71a r5 = X.C1403471a.A01()     // Catch:{ all -> 0x0054 }
            X.11B r4 = r12.A02     // Catch:{ all -> 0x0054 }
            long r6 = r12.A00     // Catch:{ all -> 0x0054 }
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            X.6mg r2 = X.C1403471a.A00(r5, r3)     // Catch:{ all -> 0x0054 }
            monitor-enter(r5)     // Catch:{ all -> 0x0054 }
            java.util.WeakHashMap r0 = r5.A00     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x0051 }
            X.6mg r0 = (X.C132376mg) r0     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A00     // Catch:{ all -> 0x0051 }
            r0 = 0
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            monitor-exit(r5)     // Catch:{ all -> 0x0054 }
            if (r0 != 0) goto L_0x0026
            r0 = 0
            return r0
        L_0x0026:
            r1 = 0
            monitor-enter(r2)     // Catch:{ all -> 0x0046 }
            r0 = 1
            r2.A02 = r0     // Catch:{ all -> 0x0043 }
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            android.content.ContentResolver r5 = r4.A00     // Catch:{ all -> 0x0046 }
            long r8 = r3.getId()     // Catch:{ all -> 0x0046 }
            r11 = r13
            r10 = r14
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r5, r6, r8, r10, r11)     // Catch:{ all -> 0x0046 }
            monitor-enter(r2)     // Catch:{ all -> 0x0054 }
            r2.A02 = r1     // Catch:{ all -> 0x0040 }
            r2.notifyAll()     // Catch:{ all -> 0x0040 }
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0040 }
            goto L_0x0053
        L_0x0043:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            monitor-enter(r2)     // Catch:{ all -> 0x0054 }
            r2.A02 = r1     // Catch:{ all -> 0x004f }
            r2.notifyAll()     // Catch:{ all -> 0x004f }
        L_0x004d:
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            goto L_0x004d
        L_0x0051:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0054 }
        L_0x0053:
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "Image/getBitmapThumbnail/got exception"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65Z.A02(android.graphics.BitmapFactory$Options, int):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r3 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap CP6(int r16) {
        /*
            r15 = this;
            boolean r0 = X.AnonymousClass112.A06()
            r12 = r16
            if (r0 == 0) goto L_0x0029
            boolean r0 = r15.A01
            if (r0 == 0) goto L_0x0029
            r3 = 0
            X.11B r2 = r15.A02     // Catch:{ all -> 0x001b }
            android.net.Uri r1 = r15.A01     // Catch:{ all -> 0x001b }
            android.util.Size r0 = new android.util.Size     // Catch:{ all -> 0x001b }
            r0.<init>(r12, r12)     // Catch:{ all -> 0x001b }
            android.graphics.Bitmap r1 = r2.A04(r1, r0)     // Catch:{ all -> 0x001b }
            goto L_0x0020
        L_0x001b:
            r0 = move-exception
            X.1IU r1 = X.C108945cZ.A1J(r0)
        L_0x0020:
            boolean r0 = r1 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x0025
            r3 = r1
        L_0x0025:
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L_0x0034
        L_0x0029:
            r0 = 144(0x90, float:2.02E-43)
            r14 = 1
            if (r12 >= r0) goto L_0x0055
            r1 = 0
            r0 = 3
            android.graphics.Bitmap r3 = r15.A02(r1, r0)
        L_0x0034:
            if (r3 != 0) goto L_0x003f
            long r2 = (long) r12
            long r2 = r2 * r2
            r0 = 2
            long r2 = r2 * r0
            android.graphics.Bitmap r3 = r15.A01(r2, r12)
        L_0x003f:
            boolean r0 = X.AnonymousClass112.A06()
            if (r0 != 0) goto L_0x004f
            if (r3 == 0) goto L_0x0054
            int r0 = r15.A00
            if (r0 == 0) goto L_0x0051
            android.graphics.Bitmap r3 = X.C137236v8.A00(r3, r0)
        L_0x004f:
            if (r3 == 0) goto L_0x0054
        L_0x0051:
            X.C24161Jc.A01()
        L_0x0054:
            return r3
        L_0x0055:
            android.graphics.BitmapFactory$Options r8 = new android.graphics.BitmapFactory$Options
            r8.<init>()
            r0 = 0
            r8.inDither = r0
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r8.inPreferredConfig = r0
            X.11B r0 = r15.A02
            android.content.ContentResolver r3 = r0.A00
            long r0 = r15.A00
            java.lang.String[] r2 = X.C124366Yb.A00
            android.database.Cursor r6 = android.provider.MediaStore.Images.Thumbnails.queryMiniThumbnail(r3, r0, r14, r2)
            if (r6 == 0) goto L_0x009f
            boolean r0 = r6.moveToFirst()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "width"
            int r7 = X.C17890vO.A01(r6, r0)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "height"
            int r5 = X.C17890vO.A01(r6, r0)     // Catch:{ all -> 0x00a9 }
            long r3 = (long) r12     // Catch:{ all -> 0x00a9 }
            long r3 = r3 * r3
            r0 = 2
            long r3 = r3 * r0
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x008e
            r11 = 0
            goto L_0x0092
        L_0x008e:
            java.lang.Long r11 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00a9 }
        L_0x0092:
            r10 = 0
            X.25O r9 = new X.25O     // Catch:{ all -> 0x00a9 }
            r13 = r12
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00a9 }
            int r0 = X.AnonymousClass204.A02(r9, r7, r5)     // Catch:{ all -> 0x00a9 }
            r8.inSampleSize = r0     // Catch:{ all -> 0x00a9 }
        L_0x009f:
            if (r6 == 0) goto L_0x00a4
            r6.close()
        L_0x00a4:
            android.graphics.Bitmap r3 = r15.A02(r8, r14)
            goto L_0x0034
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass65Z.CP6(int):android.graphics.Bitmap");
    }

    public int getType() {
        return 0;
    }
}
