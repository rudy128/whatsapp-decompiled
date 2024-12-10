package X;

public final class DTF implements Runnable {
    public final /* synthetic */ E7R A00;
    public final /* synthetic */ C22810BPy A01;
    public final /* synthetic */ C26132Csv A02;
    public final /* synthetic */ C25751ClL A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public DTF(E7R e7r, C22810BPy bPy, C26132Csv csv, C25751ClL clL, boolean z, boolean z2, boolean z3) {
        this.A01 = bPy;
        this.A03 = clL;
        this.A02 = csv;
        this.A05 = z;
        this.A00 = e7r;
        this.A04 = z2;
        this.A06 = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            X.BPy r5 = r14.A01
            X.ClL r7 = r14.A03
            X.CKO r0 = X.C25751ClL.A0X
            java.lang.Object r9 = r7.A01(r0)
            X.C18070vi.A0b(r9)
            byte[] r9 = (byte[]) r9
            X.Csv r8 = r14.A02
            boolean r6 = r14.A05
            X.E7R r4 = r14.A00
            X.EDI r0 = r5.A06
            boolean r0 = r0.Bfg()
            if (r0 != 0) goto L_0x00c3
            java.lang.Thread r0 = X.BE8.A0k()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L_0x002e
            java.lang.String r0 = "Method processJpegToBitmap must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x002e:
            java.lang.Thread r0 = X.BE8.A0k()
            if (r0 != r1) goto L_0x003b
            java.lang.String r0 = "Method generateBitmap must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x003b:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            r0 = 0
            int r10 = r9.length
            android.graphics.BitmapFactory.decodeByteArray(r9, r0, r10, r1)
            int r2 = r1.outWidth
            int r1 = r1.outHeight
            X.Csv r0 = new X.Csv
            r0.<init>(r2, r1)
            int r12 = r8.A02
            r13 = r12
            int r11 = r8.A01
            int r3 = r0.A02
            int r1 = r0.A01
            int r2 = r3 - r1
            int r0 = r12 - r11
            int r2 = r2 * r0
            if (r2 >= 0) goto L_0x0063
            r12 = r11
            r11 = r13
        L_0x0063:
            r2 = r3
        L_0x0064:
            int r0 = r2 / 2
            if (r0 < r12) goto L_0x0071
            int r0 = r1 / 2
            if (r0 < r11) goto L_0x0071
            int r2 = r2 / 2
            int r1 = r1 / 2
            goto L_0x0064
        L_0x0071:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            int r3 = r3 / r2
            r1.inSampleSize = r3
            r0 = 0
            r1.inJustDecodeBounds = r0
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeByteArray(r9, r0, r10, r1)     // Catch:{ all -> 0x00a6 }
            if (r3 == 0) goto L_0x00a6
            int r2 = X.C25317CdN.A00(r9)
            if (r6 == 0) goto L_0x0092
            r1 = 270(0x10e, float:3.78E-43)
            r0 = 90
            if (r2 == r0) goto L_0x00a3
            if (r2 != r1) goto L_0x0092
            r2 = 90
        L_0x0092:
            android.graphics.Bitmap r1 = X.C9Q.A00(r3, r8, r2, r6)
            if (r1 == 0) goto L_0x00a6
            X.CMu r0 = X.C25866CnZ.A01(r7)
            X.C22810BPy.A00(r5)
            X.C26379Cyf.A01(r1, r4, r0)
            goto L_0x00b2
        L_0x00a3:
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x0092
        L_0x00a6:
            X.C22810BPy.A00(r5)
            java.lang.String r0 = "Failed to generate photo bitmap."
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            X.C26379Cyf.A03(r4, r0)
        L_0x00b2:
            X.EDE r1 = r5.A03
            if (r1 == 0) goto L_0x00c2
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x00c2
            r0 = 1
            r1.CK6(r0)
        L_0x00c2:
            return
        L_0x00c3:
            java.lang.String r0 = "Method handleNativePhotoTakenOnBackground must be invoked on a background thread"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DTF.run():void");
    }
}
