package X;

import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;

/* renamed from: X.2PY  reason: invalid class name */
public final class AnonymousClass2PY extends A34 {
    public final AnonymousClass1ST A00;
    public final C24681Lg A01;
    public final MediaViewFragment A02;
    public final C438421d A03;
    public final C26521Sl A04;
    public final C32021gV A05;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8 A[Catch:{ all -> 0x00fa, all -> 0x00ff, IOException -> 0x00bf, all -> 0x0104 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dc A[SYNTHETIC, Splitter:B:50:0x00dc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r15) {
        /*
            r14 = this;
            X.1ST r7 = r14.A00     // Catch:{ IOException -> 0x010e }
            X.21d r6 = r14.A03     // Catch:{ IOException -> 0x010e }
            X.C17960vV.A01()     // Catch:{ IOException -> 0x010e }
            X.1Cd r0 = r7.A08     // Catch:{ IOException -> 0x010e }
            X.1au r13 = r0.A05()     // Catch:{ IOException -> 0x010e }
            X.2rc r5 = X.AnonymousClass206.A00(r6)     // Catch:{ all -> 0x0104 }
            X.1Nr r1 = r7.A05     // Catch:{ all -> 0x0104 }
            java.io.File r0 = r5.A0G     // Catch:{ all -> 0x0104 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0104 }
            int r0 = r1.A00(r0)     // Catch:{ all -> 0x0104 }
            if (r0 <= 0) goto L_0x003b
            X.17r r8 = r7.A00     // Catch:{ all -> 0x0104 }
            X.0vc r3 = r7.A0B     // Catch:{ all -> 0x0104 }
            java.io.File r2 = r5.A0G     // Catch:{ all -> 0x0104 }
            X.1So r1 = X.C26551So.A0E     // Catch:{ all -> 0x0104 }
            r0 = 2
            java.io.File r4 = X.C26511Sk.A0E(r8, r3, r1, r2, r0)     // Catch:{ all -> 0x0104 }
            java.io.File r0 = r5.A0G     // Catch:{ all -> 0x0104 }
            r8.A0i(r0, r4)     // Catch:{ all -> 0x0104 }
        L_0x0031:
            r3 = 0
            r1 = 1
            X.C18070vi.A0d(r4, r1)     // Catch:{ all -> 0x0104 }
            java.lang.String r12 = "Orientation"
            java.lang.String r8 = "MediaViewFragment/RotateImageTask/rotateImageClockwise/rotate/recreateThumb"
            goto L_0x003e
        L_0x003b:
            java.io.File r4 = r5.A0G     // Catch:{ all -> 0x0104 }
            goto L_0x0031
        L_0x003e:
            boolean r0 = X.C26303CxM.A0M     // Catch:{ IOException -> 0x00bf }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x00bf }
            X.CxM r11 = new X.CxM     // Catch:{ IOException -> 0x00bf }
            r11.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x00bf }
            r10 = 1
            int r9 = r11.A0Z(r1)     // Catch:{ IOException -> 0x00bf }
            r2 = 6
            if (r9 == 0) goto L_0x0063
            if (r9 == r1) goto L_0x0063
            r1 = 8
            r0 = 3
            if (r9 == r0) goto L_0x0060
            if (r9 == r2) goto L_0x005e
            if (r9 == r1) goto L_0x0064
            r10 = r9
            goto L_0x0064
        L_0x005e:
            r10 = 3
            goto L_0x0064
        L_0x0060:
            r10 = 8
            goto L_0x0064
        L_0x0063:
            r10 = 6
        L_0x0064:
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x00bf }
            r11.A0c(r12, r0)     // Catch:{ IOException -> 0x00bf }
            r11.A0b()     // Catch:{ IOException -> 0x00bf }
            java.io.ByteArrayOutputStream r9 = new java.io.ByteArrayOutputStream     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x00ba }
            r9.<init>()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x00ba }
            X.1Sl r2 = r14.A04     // Catch:{ all -> 0x00b3 }
            android.net.Uri r1 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x00b3 }
            r0 = 100
            android.graphics.Bitmap r2 = r2.A0h(r1, r0, r0)     // Catch:{ all -> 0x00b3 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00b3 }
            r0 = 80
            r2.compress(r1, r0, r9)     // Catch:{ all -> 0x00b3 }
            byte[] r0 = r9.toByteArray()     // Catch:{ all -> 0x00b3 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00b3 }
            r2.recycle()     // Catch:{ all -> 0x00b3 }
            r9.close()     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x00ba }
            r6.A0p(r0)     // Catch:{ all -> 0x0104 }
            X.2rc r2 = X.AnonymousClass206.A00(r6)     // Catch:{ all -> 0x0104 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0104 }
            long r0 = r4.length()     // Catch:{ all -> 0x0104 }
            r2.A0A = r0     // Catch:{ all -> 0x0104 }
            r2.A02 = r3     // Catch:{ all -> 0x0104 }
            r2.A03 = r3     // Catch:{ all -> 0x0104 }
            X.C26511Sk.A0Q(r2, r4)     // Catch:{ all -> 0x0104 }
            X.1gV r1 = r14.A05     // Catch:{ all -> 0x0104 }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0104 }
            r1.A0J(r6, r0)     // Catch:{ all -> 0x0104 }
            r0 = 1
            goto L_0x00c6
        L_0x00b3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x00ba }
            throw r0     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.whatsapp.util.Log.e(r8, r0)     // Catch:{ all -> 0x0104 }
            goto L_0x00c5
        L_0x00bf:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/RotateImageTask/rotateImageClockwise/rotate"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0104 }
        L_0x00c5:
            r0 = 0
        L_0x00c6:
            if (r0 != 0) goto L_0x00dc
            java.io.File r0 = r5.A0G     // Catch:{ all -> 0x0104 }
            if (r0 == r4) goto L_0x00d7
            boolean r0 = r4.delete()     // Catch:{ all -> 0x0104 }
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = "failed to delete media file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0104 }
        L_0x00d7:
            r13.close()     // Catch:{ IOException -> 0x010e }
            r0 = 0
            goto L_0x0117
        L_0x00dc:
            X.1xA r2 = r13.BD0()     // Catch:{ all -> 0x0104 }
            java.io.File r0 = r5.A0G     // Catch:{ all -> 0x00fa }
            if (r0 == r4) goto L_0x00eb
            X.1Nt r0 = r7.A04     // Catch:{ all -> 0x00fa }
            r0.A06(r6, r3, r3)     // Catch:{ all -> 0x00fa }
            r5.A0G = r4     // Catch:{ all -> 0x00fa }
        L_0x00eb:
            X.121 r0 = r7.A03     // Catch:{ all -> 0x00fa }
            r0.CQw(r6)     // Catch:{ all -> 0x00fa }
            r2.A00()     // Catch:{ all -> 0x00fa }
            r2.close()     // Catch:{ all -> 0x0104 }
            r13.close()     // Catch:{ IOException -> 0x010e }
            goto L_0x0116
        L_0x00fa:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x00ff }
            goto L_0x0103
        L_0x00ff:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0104 }
        L_0x0103:
            throw r1     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0109 }
            goto L_0x010d
        L_0x0109:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x010e }
        L_0x010d:
            throw r1     // Catch:{ IOException -> 0x010e }
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "MediaViewFragment/RotateImageTask/doInBackground/rotate"
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x0117
        L_0x0116:
            r0 = 1
        L_0x0117:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PY.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass7RT r0;
        MediaViewFragment mediaViewFragment = this.A02;
        C438421d r2 = this.A03;
        Log.i("MediaViewFragment/onImageRotated");
        AnonymousClass1FL A1B = mediaViewFragment.A1B();
        if (A1B != null && !A1B.isFinishing()) {
            mediaViewFragment.A1C.A0J(r2, AnonymousClass00R.A00);
            PhotoView A28 = mediaViewFragment.A28(r2.A0v);
            if (!(A28 == null || (r0 = mediaViewFragment.A0B) == null)) {
                r0.A01(A28, r2);
            }
        }
        if (C18070vi.A18(obj, AnonymousClass000.A0i())) {
            this.A01.A02(r2, 9);
        }
    }

    public AnonymousClass2PY(AnonymousClass1ST r2, C24681Lg r3, MediaViewFragment mediaViewFragment, C438421d r5, C26521Sl r6, C32021gV r7) {
        C18070vi.A0p(r5, r6, r3);
        C18070vi.A0d(r2, 5);
        C18070vi.A0d(r7, 6);
        this.A02 = mediaViewFragment;
        this.A03 = r5;
        this.A04 = r6;
        this.A01 = r3;
        this.A00 = r2;
        this.A05 = r7;
    }
}
