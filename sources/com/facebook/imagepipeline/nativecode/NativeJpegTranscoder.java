package com.facebook.imagepipeline.nativecode;

import X.AnonymousClass000;
import X.C25783Clu;
import X.C25903CoF;
import X.C71213Ej;
import X.CIN;
import X.DRJ;
import X.E97;
import java.io.InputStream;
import java.io.OutputStream;

public class NativeJpegTranscoder implements E97 {
    public int A00;
    public boolean A01;

    public static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    public boolean BEA(DRJ drj) {
        C71213Ej r0 = C25903CoF.A00;
        return false;
    }

    public boolean BEH(C25783Clu clu) {
        return AnonymousClass000.A1Z(clu, CIN.A06);
    }

    public String BSk() {
        return "NativeJpegTranscoder";
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008c, code lost:
        if ((r6 % 90) != 0) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.CV7 CPd(android.graphics.ColorSpace r9, X.C25786Clx r10, X.DRJ r11, java.io.OutputStream r12) {
        /*
            r8 = this;
            int r0 = r8.A00
            int r7 = X.C9I.A00(r11, r0)
            r3 = 0
            r4 = 8
            X.3Ej r0 = X.C25903CoF.A00     // Catch:{ all -> 0x00bd }
            int r1 = r4 / r7
            r0 = 1
            int r1 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x00bd }
            boolean r0 = r8.A01     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x0017
            r4 = r1
        L_0x0017:
            java.io.InputStream r3 = r11.A08()     // Catch:{ all -> 0x00bd }
            X.3Ej r1 = X.C25903CoF.A00     // Catch:{ all -> 0x00bd }
            X.DRJ.A03(r11)     // Catch:{ all -> 0x00bd }
            int r0 = r11.A00     // Catch:{ all -> 0x00bd }
            boolean r1 = X.C108965cb.A1Z(r1, r0)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = "Cannot transcode from null input stream!"
            if (r1 == 0) goto L_0x0066
            int r6 = X.C25903CoF.A00(r10, r11)     // Catch:{ all -> 0x00bd }
            X.C26208Cuj.A02(r3, r0)     // Catch:{ all -> 0x00bd }
            r5 = 85
            X.C25385Cel.A00()     // Catch:{ all -> 0x00bd }
            r2 = 0
            r1 = 1
            boolean r0 = X.C108975cc.A1C(r4, r1)
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x00bd }
            r0 = 16
            boolean r0 = X.BE8.A1U(r4, r0)
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x00bd }
            switch(r6) {
                case 1: goto L_0x004d;
                case 2: goto L_0x004d;
                case 3: goto L_0x004d;
                case 4: goto L_0x004d;
                case 5: goto L_0x004d;
                case 6: goto L_0x004d;
                case 7: goto L_0x004d;
                case 8: goto L_0x004d;
                default: goto L_0x004b;
            }     // Catch:{ all -> 0x00bd }
        L_0x004b:
            r0 = 0
            goto L_0x004e
        L_0x004d:
            r0 = 1
        L_0x004e:
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x00bd }
            r0 = 8
            if (r4 != r0) goto L_0x0057
            if (r6 == r1) goto L_0x0058
        L_0x0057:
            r2 = 1
        L_0x0058:
            java.lang.String r0 = "no transformation requested"
            if (r2 == 0) goto L_0x00b8
            X.C26208Cuj.A01(r3)     // Catch:{ all -> 0x00bd }
            X.C26208Cuj.A01(r12)     // Catch:{ all -> 0x00bd }
            nativeTranscodeJpegWithExifOrientation(r3, r12, r6, r4, r5)     // Catch:{ all -> 0x00bd }
            goto L_0x00a6
        L_0x0066:
            int r6 = X.C25903CoF.A01(r10, r11)     // Catch:{ all -> 0x00bd }
            X.C26208Cuj.A02(r3, r0)     // Catch:{ all -> 0x00bd }
            r5 = 85
            X.C25385Cel.A00()     // Catch:{ all -> 0x00bd }
            r2 = 0
            r0 = 1
            if (r4 >= r0) goto L_0x0077
            r0 = 0
        L_0x0077:
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x00bd }
            r0 = 16
            boolean r0 = X.BE8.A1U(r4, r0)
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x00bd }
            if (r6 < 0) goto L_0x008e
            r0 = 270(0x10e, float:3.78E-43)
            if (r6 > r0) goto L_0x008e
            int r1 = r6 % 90
            r0 = 1
            if (r1 == 0) goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            X.C26208Cuj.A04(r0)     // Catch:{ all -> 0x00bd }
            r0 = 8
            if (r4 != r0) goto L_0x0098
            if (r6 == 0) goto L_0x0099
        L_0x0098:
            r2 = 1
        L_0x0099:
            java.lang.String r0 = "no transformation requested"
            if (r2 == 0) goto L_0x00b3
            X.C26208Cuj.A01(r3)     // Catch:{ all -> 0x00bd }
            X.C26208Cuj.A01(r12)     // Catch:{ all -> 0x00bd }
            nativeTranscodeJpeg(r3, r12, r6, r4, r5)     // Catch:{ all -> 0x00bd }
        L_0x00a6:
            X.C26075Crp.A01(r3)
            boolean r1 = X.C17890vO.A1R(r7)
            X.CV7 r0 = new X.CV7
            r0.<init>(r1)
            return r0
        L_0x00b3:
            java.lang.IllegalArgumentException r0 = X.BE8.A0W(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00bc
        L_0x00b8:
            java.lang.IllegalArgumentException r0 = X.BE8.A0W(r0)     // Catch:{ all -> 0x00bd }
        L_0x00bc:
            throw r0     // Catch:{ all -> 0x00bd }
        L_0x00bd:
            r0 = move-exception
            X.C26075Crp.A01(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.NativeJpegTranscoder.CPd(android.graphics.ColorSpace, X.Clx, X.DRJ, java.io.OutputStream):X.CV7");
    }
}
