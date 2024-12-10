package X;

public final class DAX implements C28654ECo {
    public final /* synthetic */ CXR A00;

    public void Bnt() {
    }

    public void Bnv(Exception exc) {
        C18070vi.A0d(exc, 0);
        CNV cnv = this.A00.A02;
        if (cnv != null) {
            DAR dar = cnv.A01;
            dar.A00 = AnonymousClass00R.A0j;
            dar.A02.get();
        }
    }

    public void Bny() {
    }

    public DAX(CXR cxr) {
        this.A00 = cxr;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.CNS] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0156, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.CDX.A00(r1, r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A[Catch:{ Exception -> 0x0162 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C0X(byte[] r18) {
        /*
            r17 = this;
            java.lang.String r7 = "Orientation"
            r9 = 0
            r10 = r18
            X.C18070vi.A0d(r10, r9)
            r3 = r17
            X.CXR r2 = r3.A00     // Catch:{ Exception -> 0x0162 }
            long r4 = r2.A05     // Catch:{ Exception -> 0x0162 }
            r11 = 0
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            int r8 = r10.length     // Catch:{ Exception -> 0x0162 }
            long r0 = (long) r8     // Catch:{ Exception -> 0x0162 }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00a0
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeByteArray(r10, r9, r8)     // Catch:{ Exception -> 0x0162 }
            if (r13 == 0) goto L_0x015b
            java.lang.String r8 = r2.A06     // Catch:{ Exception -> 0x0162 }
            X.C18070vi.A0d(r8, r9)     // Catch:{ Exception -> 0x0162 }
            r9 = 1
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0162 }
            r12.<init>(r8)     // Catch:{ Exception -> 0x0162 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0098 }
            r11 = 90
            r13.compress(r0, r11, r12)     // Catch:{ all -> 0x0098 }
            r12.close()     // Catch:{ Exception -> 0x0162 }
            int r6 = r13.getWidth()     // Catch:{ Exception -> 0x0162 }
            int r14 = r13.getHeight()     // Catch:{ Exception -> 0x0162 }
            java.io.File r0 = X.C108945cZ.A17(r8)     // Catch:{ Exception -> 0x0162 }
            long r15 = r0.length()     // Catch:{ Exception -> 0x0162 }
        L_0x0045:
            int r0 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0079
            java.io.File r0 = X.C108945cZ.A17(r8)     // Catch:{ Exception -> 0x0162 }
            r0.delete()     // Catch:{ Exception -> 0x0162 }
            float r0 = (float) r6     // Catch:{ Exception -> 0x0162 }
            r1 = 1064514355(0x3f733333, float:0.95)
            float r0 = r0 * r1
            int r6 = (int) r0     // Catch:{ Exception -> 0x0162 }
            float r0 = (float) r14     // Catch:{ Exception -> 0x0162 }
            float r0 = r0 * r1
            int r14 = (int) r0     // Catch:{ Exception -> 0x0162 }
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r13, r6, r14, r9)     // Catch:{ Exception -> 0x0162 }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x0162 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0162 }
            r12.<init>(r8)     // Catch:{ Exception -> 0x0162 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x0098 }
            r1.compress(r0, r11, r12)     // Catch:{ all -> 0x0098 }
            r12.close()     // Catch:{ Exception -> 0x0162 }
            r1.recycle()     // Catch:{ Exception -> 0x0162 }
            java.io.File r0 = X.C108945cZ.A17(r8)     // Catch:{ Exception -> 0x0162 }
            long r15 = r0.length()     // Catch:{ Exception -> 0x0162 }
            goto L_0x0045
        L_0x0079:
            boolean r0 = X.C26120Csi.A05     // Catch:{ Exception -> 0x0162 }
            java.io.ByteArrayInputStream r1 = X.BE6.A0h(r10)     // Catch:{ Exception -> 0x0162 }
            X.Csi r0 = new X.Csi     // Catch:{ Exception -> 0x0162 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0162 }
            int r0 = r0.A03(r7, r9)     // Catch:{ Exception -> 0x0162 }
            X.CxM r1 = new X.CxM     // Catch:{ Exception -> 0x0162 }
            r1.<init>((java.lang.String) r8)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0162 }
            r1.A0c(r7, r0)     // Catch:{ Exception -> 0x0162 }
            r1.A0b()     // Catch:{ Exception -> 0x0162 }
            goto L_0x00b0
        L_0x0098:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r2 = move-exception
            X.CDX.A00(r12, r0)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0161
        L_0x00a0:
            java.lang.String r0 = r2.A06     // Catch:{ Exception -> 0x0162 }
            X.C18070vi.A0d(r0, r9)     // Catch:{ Exception -> 0x0162 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0162 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0162 }
            r1.write(r10)     // Catch:{ all -> 0x0154 }
            r1.close()     // Catch:{ Exception -> 0x0162 }
        L_0x00b0:
            X.CNV r0 = r2.A02     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0173
            X.CXR r4 = r0.A00     // Catch:{ Exception -> 0x0162 }
            java.lang.String r0 = r4.A07     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x00c4
            com.facebook.smartcapture.camera.PhotoCameraFragment r0 = r4.A00     // Catch:{ Exception -> 0x0162 }
            X.EDL r0 = r0.A25()     // Catch:{ Exception -> 0x0162 }
            r0.COb()     // Catch:{ Exception -> 0x0162 }
            return
        L_0x00c4:
            java.lang.String r2 = r4.A06     // Catch:{ Exception -> 0x0162 }
            X.1IX r1 = r4.A03     // Catch:{ Exception -> 0x0162 }
            X.CNS r0 = new X.CNS     // Catch:{ Exception -> 0x0162 }
            r0.<init>()     // Catch:{ Exception -> 0x0162 }
            r0.A01 = r2     // Catch:{ Exception -> 0x0162 }
            r0.A00 = r1     // Catch:{ Exception -> 0x0162 }
            X.D3z r7 = new X.D3z     // Catch:{ Exception -> 0x0162 }
            r7.<init>((X.CNS) r0)     // Catch:{ Exception -> 0x0162 }
            r4.A01 = r7     // Catch:{ Exception -> 0x0162 }
            X.CNV r4 = r4.A02     // Catch:{ Exception -> 0x0162 }
            if (r4 == 0) goto L_0x0173
            X.DAR r2 = r4.A01     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r1 = r2.A00     // Catch:{ Exception -> 0x0162 }
            java.lang.Integer r0 = X.AnonymousClass00R.A0N     // Catch:{ Exception -> 0x0162 }
            if (r1 == r0) goto L_0x014e
            java.lang.Integer r0 = X.AnonymousClass00R.A0C     // Catch:{ Exception -> 0x0162 }
            if (r1 == r0) goto L_0x014e
            java.lang.ref.WeakReference r0 = r2.A02     // Catch:{ Exception -> 0x0162 }
            java.lang.Object r5 = r0.get()     // Catch:{ Exception -> 0x0162 }
            X.E1N r5 = (X.E1N) r5     // Catch:{ Exception -> 0x0162 }
            if (r5 == 0) goto L_0x0173
            com.facebook.smartcapture.view.SelfiePhotoCaptureActivity r5 = (com.facebook.smartcapture.view.SelfiePhotoCaptureActivity) r5     // Catch:{ Exception -> 0x0162 }
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Exception -> 0x0162 }
            r4.<init>()     // Catch:{ Exception -> 0x0162 }
            java.lang.String r1 = r7.A01     // Catch:{ Exception -> 0x0162 }
            java.lang.String r6 = "result_photo_path"
            r2 = 1
            if (r1 == 0) goto L_0x0117
            java.io.File r0 = X.C108945cZ.A17(r1)     // Catch:{ Exception -> 0x0162 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0162 }
            r4.setData(r0)     // Catch:{ Exception -> 0x0162 }
            android.content.Intent r0 = r4.putExtra(r6, r1)     // Catch:{ Exception -> 0x0162 }
            X.C18070vi.A0b(r0)     // Catch:{ Exception -> 0x0162 }
        L_0x0112:
            java.lang.String r1 = r7.A02     // Catch:{ Exception -> 0x0162 }
            if (r1 == 0) goto L_0x0146
            goto L_0x0134
        L_0x0117:
            X.1IX r0 = r7.A00     // Catch:{ Exception -> 0x0162 }
            if (r0 == 0) goto L_0x0132
            java.lang.Object r1 = X.C29431cG.A0c(r0)     // Catch:{ Exception -> 0x0162 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x0162 }
            if (r1 == 0) goto L_0x0132
            java.io.File r0 = X.C108945cZ.A17(r1)     // Catch:{ Exception -> 0x0162 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0162 }
            r4.setData(r0)     // Catch:{ Exception -> 0x0162 }
            r4.putExtra(r6, r1)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0112
        L_0x0132:
            r2 = 0
            goto L_0x0112
        L_0x0134:
            if (r2 != 0) goto L_0x0141
            java.io.File r0 = X.C108945cZ.A17(r1)     // Catch:{ Exception -> 0x0162 }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ Exception -> 0x0162 }
            r4.setData(r0)     // Catch:{ Exception -> 0x0162 }
        L_0x0141:
            java.lang.String r0 = "result_video_path"
            r4.putExtra(r0, r1)     // Catch:{ Exception -> 0x0162 }
        L_0x0146:
            r0 = -1
            r5.setResult(r0, r4)     // Catch:{ Exception -> 0x0162 }
            r5.finish()     // Catch:{ Exception -> 0x0162 }
            return
        L_0x014e:
            X.CXR r0 = r4.A00     // Catch:{ Exception -> 0x0162 }
            r0.A00()     // Catch:{ Exception -> 0x0162 }
            return
        L_0x0154:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r2 = move-exception
            X.CDX.A00(r1, r0)     // Catch:{ Exception -> 0x0162 }
            goto L_0x0161
        L_0x015b:
            java.lang.String r0 = "unable to decode jpeg"
            java.lang.IllegalStateException r2 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x0162 }
        L_0x0161:
            throw r2     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            X.CXR r0 = r3.A00
            X.CNV r0 = r0.A02
            if (r0 == 0) goto L_0x0173
            X.DAR r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            r1.A00 = r0
            java.lang.ref.WeakReference r0 = r1.A02
            r0.get()
        L_0x0173:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DAX.C0X(byte[]):void");
    }
}
