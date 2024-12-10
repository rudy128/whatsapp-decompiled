package X;

import com.whatsapp.bloks.BloksCameraOverlay;
import com.whatsapp.util.Log;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.BwB  reason: case insensitive filesystem */
public class C24145BwB extends A34 {
    public final int A00;
    public final int A01;
    public final B6T A02;
    public final C189369iy A03;
    public final File A04;
    public final String A05;
    public final WeakReference A06;
    public final boolean A07;
    public final byte[] A08;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010b, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x010d, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0111, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0112, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.whatsapp.util.Log.e(X.C17900vP.A0C("BloksStorePictureTask/ Error accessing file: ", X.AnonymousClass000.A10(), r4), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0120, code lost:
        if (r3 != null) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0126, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0127, code lost:
        com.whatsapp.util.Log.e(X.C17900vP.A0C("BloksStorePictureTask/ Error closing file: ", X.AnonymousClass000.A10(), r1), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0132, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0133, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0134, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        com.whatsapp.util.Log.e(X.C17900vP.A0C("BloksStorePictureTask/ File not found: ", X.AnonymousClass000.A10(), r4), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        if (r3 != null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0147, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0148, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        com.whatsapp.util.Log.e(X.C17900vP.A0C("BloksStorePictureTask/ Error closing file: ", X.AnonymousClass000.A10(), r1), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0154, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0155, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0156, code lost:
        if (r3 == null) goto L_0x0168;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010b A[ExcHandler: IOException (e java.io.IOException), PHI: r3 
      PHI: (r3v8 java.io.FileOutputStream) = (r3v6 java.io.FileOutputStream), (r3v9 java.io.FileOutputStream) binds: [B:4:0x0018, B:19:0x00d3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010d A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), PHI: r3 
      PHI: (r3v7 java.io.FileOutputStream) = (r3v6 java.io.FileOutputStream), (r3v9 java.io.FileOutputStream) binds: [B:4:0x0018, B:19:0x00d3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0122 A[SYNTHETIC, Splitter:B:39:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0144 A[SYNTHETIC, Splitter:B:50:0x0144] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:36:0x0113=Splitter:B:36:0x0113, B:47:0x0135=Splitter:B:47:0x0135} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r23) {
        /*
            r22 = this;
            java.lang.String r2 = "BloksStorePictureTask/ Error closing file: "
            java.lang.String r0 = "BloksStorePictureTask/doInBackground start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r22
            X.B6T r0 = r4.A02
            java.lang.Object r0 = r0.get()
            r12 = 0
            if (r0 == 0) goto L_0x0175
            java.io.File r5 = r4.A04     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x0111, all -> 0x010f }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r5)     // Catch:{ FileNotFoundException -> 0x0133, IOException -> 0x0111, all -> 0x010f }
            byte[] r1 = r4.A08     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r3.write(r1)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r3.close()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            boolean r0 = X.C26303CxM.A0M     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            X.CxM r0 = new X.CxM     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r0.<init>((java.lang.String) r6)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r14 = 0
            int r6 = r0.A0Z(r14)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r0 = 3
            if (r6 == r0) goto L_0x0041
            r0 = 6
            if (r6 == r0) goto L_0x003e
            r0 = 8
            r7 = 270(0x10e, float:3.78E-43)
            if (r6 == r0) goto L_0x0043
            r7 = 0
            goto L_0x0043
        L_0x003e:
            r7 = 90
            goto L_0x0043
        L_0x0041:
            r7 = 180(0xb4, float:2.52E-43)
        L_0x0043:
            java.lang.String r0 = r5.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            android.graphics.Matrix r6 = X.C108945cZ.A0J()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            float r0 = (float) r7     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r6.postRotate(r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r16 = r13.getWidth()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r17 = r13.getHeight()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r19 = 1
            r15 = r14
            r18 = r6
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            boolean r0 = r4.A07     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            if (r0 == 0) goto L_0x00d1
            android.graphics.Matrix r8 = X.C108945cZ.A0J()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r15.getWidth()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r0 / 2
            float r9 = (float) r0     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r15.getHeight()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r0 / 2
            float r7 = (float) r0     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.postScale(r6, r0, r9, r7)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r18 = r15.getWidth()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r19 = r15.getHeight()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r21 = 1
            r17 = r14
            r16 = r14
            r20 = r8
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
        L_0x0095:
            int r6 = r4.A01     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r4.A00     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r9, r6, r0, r14)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            java.lang.ref.WeakReference r0 = r4.A06     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            java.lang.Object r11 = r0.get()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            com.whatsapp.bloks.BloksCameraOverlay r11 = (com.whatsapp.bloks.BloksCameraOverlay) r11     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r8 = r11.A02     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r11.A01     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r8 = r8 - r0
            int r7 = r11.A00     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r11.A03     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r7 = r7 - r0
            r10.getWidth()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r10.getHeight()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r6 = r11.A01     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            int r0 = r11.A03     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r10, r6, r0, r8, r7)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r15.recycle()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r9.recycle()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r10.recycle()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            r13.recycle()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r5)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b }
            goto L_0x00d3
        L_0x00d1:
            r9 = r15
            goto L_0x0095
        L_0x00d3:
            java.io.ByteArrayOutputStream r6 = X.C108945cZ.A15()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            java.lang.String r0 = r4.A05     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            java.lang.String r4 = X.AnonymousClass8BS.A0n(r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            java.lang.String r0 = ".jpg"
            boolean r0 = r4.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = ".jpeg"
            boolean r0 = r4.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            if (r0 == 0) goto L_0x00f1
        L_0x00ef:
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
        L_0x00f1:
            r0 = 75
            r7.compress(r5, r0, r6)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            byte[] r0 = r6.toByteArray()     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            r3.write(r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            r3.write(r1)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            java.lang.String r0 = "BloksStorePictureTask/doInBackground end"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x010d, IOException -> 0x010b, all -> 0x0109 }
            r3.close()     // Catch:{ IOException -> 0x0169 }
            return r12
        L_0x0109:
            r4 = move-exception
            goto L_0x0158
        L_0x010b:
            r4 = move-exception
            goto L_0x0113
        L_0x010d:
            r4 = move-exception
            goto L_0x0135
        L_0x010f:
            r4 = move-exception
            throw r4
        L_0x0111:
            r4 = move-exception
            r3 = r12
        L_0x0113:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "BloksStorePictureTask/ Error accessing file: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r4)     // Catch:{ all -> 0x0155 }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x0175
            r3.close()     // Catch:{ IOException -> 0x0126 }
            return r12
        L_0x0126:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        L_0x0133:
            r4 = move-exception
            r3 = r12
        L_0x0135:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "BloksStorePictureTask/ File not found: "
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r4)     // Catch:{ all -> 0x0155 }
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0155 }
            if (r3 == 0) goto L_0x0175
            r3.close()     // Catch:{ IOException -> 0x0148 }
            return r12
        L_0x0148:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
            return r12
        L_0x0155:
            r4 = move-exception
            if (r3 == 0) goto L_0x0168
        L_0x0158:
            r3.close()     // Catch:{ IOException -> 0x015c }
            throw r4
        L_0x015c:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0168:
            throw r4
        L_0x0169:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17900vP.A0C(r2, r0, r1)
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0175:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24145BwB.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Log.i("BloksStorePictureTask/onPostExecute start");
        COM com2 = (COM) this.A02.get();
        if (com2 != null) {
            Object A042 = C26272CwJ.A04(com2.A00, com2.A01);
            C25344Ce3.A00(A042);
            CUD cud = (CUD) A042;
            C17960vV.A07(cud);
            cud.A0A = true;
            C26109CsU.A01(com2, cud, this.A03);
        }
        Log.i("BloksStorePictureTask/onPostExecute end");
    }

    public C24145BwB(B6T b6t, BloksCameraOverlay bloksCameraOverlay, C189369iy r4, File file, String str, byte[] bArr, int i, int i2, boolean z) {
        this.A02 = b6t;
        this.A08 = bArr;
        this.A07 = z;
        this.A04 = file;
        this.A05 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = AnonymousClass3MW.A0z(bloksCameraOverlay);
        this.A03 = r4;
    }
}
