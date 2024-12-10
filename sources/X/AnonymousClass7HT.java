package X;

/* renamed from: X.7HT  reason: invalid class name */
public class AnonymousClass7HT implements AnonymousClass891 {
    public final int A00;
    public final Object A01;

    public AnonymousClass7HT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Ba8() {
        /*
            r2 = this;
            int r1 = r2.A00
            java.lang.Object r0 = r2.A01
            switch(r1) {
                case 0: goto L_0x0016;
                case 1: goto L_0x0019;
                default: goto L_0x0007;
            }
        L_0x0007:
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            java.io.File r0 = r0.A0Z
            if (r0 == 0) goto L_0x0013
        L_0x000d:
            java.lang.String r0 = r0.getAbsolutePath()
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r0 = ""
        L_0x0015:
            return r0
        L_0x0016:
            java.io.File r0 = (java.io.File) r0
            goto L_0x000d
        L_0x0019:
            com.whatsapp.mediacomposer.MediaComposerFragment r0 = (com.whatsapp.mediacomposer.MediaComposerFragment) r0
            android.net.Uri r0 = r0.A01
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0023:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "-original"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            return r0
        L_0x002e:
            java.lang.String r0 = ""
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HT.Ba8():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap BhZ() {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x002c;
                case 1: goto L_0x0065;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r3 = "VideoComposerFragment/getVideoThumb"
            java.lang.String r0 = "VideoComposerFragment/MediaThumbLoader.BitmapLoader/load"
            X.5dc r2 = new X.5dc     // Catch:{ Exception | NoSuchMethodError -> 0x0056 }
            r2.<init>(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x0056 }
            java.lang.Object r0 = r4.A01     // Catch:{ Exception | NoSuchMethodError -> 0x0056 }
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            java.io.File r0 = r0.A0Z     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x001b
            r2.A00(r0)     // Catch:{ all -> 0x0025 }
        L_0x001b:
            r0 = 1
            android.graphics.Bitmap r6 = r2.getFrameAtTime(r0)     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ Exception | NoSuchMethodError -> 0x0056 }
            return r6
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception | NoSuchMethodError -> 0x0056 }
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x0056 }
        L_0x002c:
            java.lang.String r3 = "GifComposerFragment/getVideoThumb"
            java.lang.String r0 = "GifComposerFragment/MediaThumbLoader.BitmapLoader/load"
            X.5dc r2 = new X.5dc     // Catch:{ Exception | NoSuchMethodError -> 0x004d }
            r2.<init>(r0)     // Catch:{ Exception | NoSuchMethodError -> 0x004d }
            java.lang.Object r0 = r4.A01     // Catch:{ Exception | NoSuchMethodError -> 0x004d }
            java.io.File r0 = (java.io.File) r0
            r2.A00(r0)     // Catch:{ all -> 0x0046 }
            r0 = 1
            android.graphics.Bitmap r6 = r2.getFrameAtTime(r0)     // Catch:{ all -> 0x0046 }
            r2.close()     // Catch:{ Exception | NoSuchMethodError -> 0x004d }
            return r6
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception | NoSuchMethodError -> 0x004d }
            throw r0     // Catch:{ Exception | NoSuchMethodError -> 0x004d }
        L_0x004d:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            java.lang.Object r0 = r4.A01
            java.io.File r0 = (java.io.File) r0
            goto L_0x0060
        L_0x0056:
            r0 = move-exception
            com.whatsapp.util.Log.e(r3, r0)
            java.lang.Object r0 = r4.A01
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            java.io.File r0 = r0.A0Z
        L_0x0060:
            android.graphics.Bitmap r6 = X.C1408873l.A01(r0)
            return r6
        L_0x0065:
            java.lang.String r2 = "ImageComposerFragment/loadOriginalBitmap"
            r6 = 0
            java.lang.Object r4 = r4.A01     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            com.whatsapp.mediacomposer.ImageComposerFragment r4 = (com.whatsapp.mediacomposer.ImageComposerFragment) r4     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            android.net.Uri r5 = r4.A01     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r5 == 0) goto L_0x00ed
            X.8Ai r0 = r4.A29()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00ed
            X.72S r0 = X.AnonymousClass73D.A00(r5, r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            java.io.File r0 = r0.A0C()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            android.net.Uri$Builder r3 = X.C108965cb.A06(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            java.lang.String r1 = "flip-h"
            java.lang.String r0 = r5.getQueryParameter(r1)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x008d
            r3.appendQueryParameter(r1, r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
        L_0x008d:
            android.net.Uri r8 = r3.build()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.C18070vi.A0X(r8)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
        L_0x0094:
            android.content.Context r0 = r4.A1n()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00eb
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00eb
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00eb
            int r0 = r0.widthPixels     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
        L_0x00ac:
            android.content.Context r0 = r4.A1n()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00e9
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00e9
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00e9
            int r0 = r0.heightPixels     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
        L_0x00c4:
            X.6kj r7 = X.AnonymousClass7JF.A0j     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.0ve r9 = r4.A28()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.00H r0 = r4.A0a     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r0 == 0) goto L_0x00f9
            java.lang.Object r10 = X.C18070vi.A0E(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.1Nq r10 = (X.C25291Nq) r10     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.1Sl r12 = r4.A0U     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            if (r12 == 0) goto L_0x00f3
            boolean r15 = r4.A0B     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.00H r0 = r4.A2B()     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            java.lang.Object r11 = X.C18070vi.A0E(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.1Lc r11 = (X.C24641Lc) r11     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            android.graphics.Bitmap r6 = r7.A00(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            return r6
        L_0x00e9:
            r14 = r6
            goto L_0x00c4
        L_0x00eb:
            r13 = r6
            goto L_0x00ac
        L_0x00ed:
            android.net.Uri r8 = android.net.Uri.EMPTY     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            X.C18070vi.A0Z(r8)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            goto L_0x0094
        L_0x00f3:
            java.lang.String r0 = "mediaFileUtils"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            throw r6     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
        L_0x00f9:
            java.lang.String r0 = "mediaUtils"
            X.C18070vi.A11(r0)     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
            throw r6     // Catch:{ IOException -> 0x0104, 1iX -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            return r6
        L_0x0104:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HT.BhZ():android.graphics.Bitmap");
    }
}
