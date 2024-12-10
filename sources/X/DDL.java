package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

public final class DDL implements E97 {
    public final boolean A00;

    public boolean BEH(C25783Clu clu) {
        C18070vi.A0d(clu, 0);
        if (clu == CIN.A04 || clu == CIN.A06) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5 A[Catch:{ OutOfMemoryError -> 0x00bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.CV7 CPd(android.graphics.ColorSpace r18, X.C25786Clx r19, X.DRJ r20, java.io.OutputStream r21) {
        /*
            r17 = this;
            r9 = 0
            java.lang.String r2 = "Out-Of-Memory during transcode"
            java.lang.String r4 = "SimpleImageTranscoder"
            r11 = 0
            r7 = 1
            r0 = r17
            boolean r0 = r0.A00
            r8 = r20
            if (r0 != 0) goto L_0x0025
            r6 = 1
        L_0x0010:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r5.inSampleSize = r6
            r3 = r18
            if (r18 == 0) goto L_0x0023
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0023
            r5.inPreferredColorSpace = r3
        L_0x0023:
            r3 = 2
            goto L_0x002c
        L_0x0025:
            r0 = 2048(0x800, float:2.87E-42)
            int r6 = X.C9I.A00(r8, r0)
            goto L_0x0010
        L_0x002c:
            java.io.InputStream r0 = r8.A08()     // Catch:{ OutOfMemoryError -> 0x00d4 }
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeStream(r0, r9, r5)     // Catch:{ OutOfMemoryError -> 0x00d4 }
            if (r10 != 0) goto L_0x004a
            java.lang.String r2 = "Couldn't decode the EncodedImage InputStream ! "
            X.EAY r1 = X.C26265CwA.A00
            r0 = 6
            boolean r0 = r1.BfN(r0)
            if (r0 == 0) goto L_0x0044
            r1.BJn(r4, r2)
        L_0x0044:
            X.CV7 r0 = new X.CV7
            r0.<init>(r3)
            return r0
        L_0x004a:
            X.3Ej r1 = X.C25903CoF.A00
            X.DRJ.A03(r8)
            int r0 = r8.A00
            boolean r0 = X.C108965cb.A1Z(r1, r0)
            r1 = r19
            if (r0 == 0) goto L_0x0081
            int r9 = X.C25903CoF.A00(r1, r8)
            android.graphics.Matrix r15 = X.C108945cZ.A0J()
            r8 = 1065353216(0x3f800000, float:1.0)
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r9 == r3) goto L_0x007d
            r0 = 7
            r1 = -1028390912(0xffffffffc2b40000, float:-90.0)
            if (r9 == r0) goto L_0x0076
            r0 = 4
            r1 = 1127481344(0x43340000, float:180.0)
            if (r9 == r0) goto L_0x0076
            r0 = 5
            if (r9 != r0) goto L_0x00a8
            r1 = 1119092736(0x42b40000, float:90.0)
        L_0x0076:
            r15.setRotate(r1)
            r15.postScale(r5, r8)
            goto L_0x008f
        L_0x007d:
            r15.setScale(r5, r8)
            goto L_0x008f
        L_0x0081:
            int r0 = X.C25903CoF.A01(r1, r8)
            if (r0 == 0) goto L_0x00a8
            android.graphics.Matrix r15 = X.C108945cZ.A0J()
            float r0 = (float) r0
            r15.setRotate(r0)
        L_0x008f:
            int r13 = r10.getWidth()     // Catch:{ OutOfMemoryError -> 0x00a5, all -> 0x00a2 }
            int r14 = r10.getHeight()     // Catch:{ OutOfMemoryError -> 0x00a5, all -> 0x00a2 }
            r16 = r11
            r12 = r11
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ OutOfMemoryError -> 0x00a5, all -> 0x00a2 }
            X.C18070vi.A0X(r5)     // Catch:{ OutOfMemoryError -> 0x00a5, all -> 0x00a2 }
            goto L_0x00a9
        L_0x00a2:
            r0 = move-exception
            r5 = r10
            goto L_0x00cd
        L_0x00a5:
            r0 = move-exception
            r5 = r10
            goto L_0x00bd
        L_0x00a8:
            r5 = r10
        L_0x00a9:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ OutOfMemoryError -> 0x00bc }
            r0 = 85
            r8 = r21
            r5.compress(r1, r0, r8)     // Catch:{ OutOfMemoryError -> 0x00bc }
            r1 = 1
            if (r6 <= r7) goto L_0x00b6
            r1 = 0
        L_0x00b6:
            X.CV7 r0 = new X.CV7     // Catch:{ OutOfMemoryError -> 0x00bc }
            r0.<init>(r1)     // Catch:{ OutOfMemoryError -> 0x00bc }
            goto L_0x00c5
        L_0x00bc:
            r0 = move-exception
        L_0x00bd:
            X.C26265CwA.A05(r4, r2, r0)     // Catch:{ all -> 0x00cc }
            X.CV7 r0 = new X.CV7     // Catch:{ all -> 0x00cc }
            r0.<init>(r3)     // Catch:{ all -> 0x00cc }
        L_0x00c5:
            r5.recycle()
            r10.recycle()
            return r0
        L_0x00cc:
            r0 = move-exception
        L_0x00cd:
            r5.recycle()
            r10.recycle()
            throw r0
        L_0x00d4:
            r0 = move-exception
            X.C26265CwA.A05(r4, r2, r0)
            X.CV7 r0 = new X.CV7
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDL.CPd(android.graphics.ColorSpace, X.Clx, X.DRJ, java.io.OutputStream):X.CV7");
    }

    public boolean BEA(DRJ drj) {
        if (!this.A00 || C9I.A00(drj, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) <= 1) {
            return false;
        }
        return true;
    }

    public String BSk() {
        return "SimpleImageTranscoder";
    }

    public DDL(boolean z) {
        this.A00 = z;
    }
}
