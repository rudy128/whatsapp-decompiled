package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7R5  reason: invalid class name */
public class AnonymousClass7R5 implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public AnonymousClass7R5(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, C35081lc r5, PublicKey publicKey, X509Certificate x509Certificate, int i, int i2) {
        this.A00 = i2;
        if (2 - i2 != 0) {
            C18070vi.A0d(publicKey, 3);
        } else {
            C18070vi.A0d(publicKey, 3);
            C72473Md.A1J(r3, r4);
        }
        this.A06 = r5;
        this.A03 = x509Certificate;
        this.A05 = publicKey;
        this.A01 = i;
        this.A02 = r3;
        this.A04 = r4;
        this.A07 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [X.4Rb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0207, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        X.CDX.A00(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020b, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0171  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r0 = r32
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x0029;
                case 2: goto L_0x00b7;
                case 3: goto L_0x0095;
                case 4: goto L_0x0077;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r0.A06
            X.1lc r2 = (X.C35081lc) r2
            java.lang.Object r8 = r0.A03
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            java.lang.Object r3 = r0.A07
            X.732 r3 = (X.AnonymousClass732) r3
            java.lang.Object r7 = r0.A05
            java.security.PublicKey r7 = (java.security.PublicKey) r7
            int r1 = r0.A01
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r0.A02
            X.89m r4 = (X.C1606789m) r4
            java.lang.Object r5 = r0.A04
            X.705 r5 = (X.AnonymousClass705) r5
            r2.CBe(r3, r4, r5, r6, r7, r8)
        L_0x0028:
            return
        L_0x0029:
            java.lang.Object r1 = r0.A02
            X.9Bw r1 = (X.C178119Bw) r1
            java.lang.Object r9 = r0.A03
            X.1VP r9 = (X.AnonymousClass1VP) r9
            java.lang.Object r8 = r0.A04
            android.content.Context r8 = (android.content.Context) r8
            int r7 = r0.A01
            java.lang.Object r6 = r0.A05
            X.2mw r6 = (X.C59822mw) r6
            if (r1 == 0) goto L_0x0044
            X.1VQ r9 = (X.AnonymousClass1VQ) r9
            r0 = 0
            r9.BhC(r8, r1, r7, r0)
            return
        L_0x0044:
            if (r6 == 0) goto L_0x0058
            long r4 = r6.A03
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0058
            r9.CO2(r8, r6, r7)
            return
        L_0x0058:
            android.app.Activity r2 = X.AnonymousClass1L9.A00(r8)
            boolean r1 = r2 instanceof X.AnonymousClass1FU
            java.lang.String r0 = "Activity should be instance of DialogActivity"
            X.C17960vV.A0F(r1, r0)
            if (r1 == 0) goto L_0x0028
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.4Rb r1 = new X.4Rb
            r1.<init>()
            r0 = 30
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A00(r1, r0)
            r0 = 0
            r2.CMk(r1, r0)
            return
        L_0x0077:
            java.lang.Object r1 = r0.A06
            X.1lc r1 = (X.C35081lc) r1
            java.lang.Object r6 = r0.A03
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6
            java.lang.Object r2 = r0.A07
            X.732 r2 = (X.AnonymousClass732) r2
            java.lang.Object r5 = r0.A05
            java.security.PublicKey r5 = (java.security.PublicKey) r5
            int r7 = r0.A01
            java.lang.Object r4 = r0.A04
            X.705 r4 = (X.AnonymousClass705) r4
            java.lang.Object r3 = r0.A02
            X.89m r3 = (X.C1606789m) r3
            r1.A0A(r2, r3, r4, r5, r6, r7)
            return
        L_0x0095:
            java.lang.Object r2 = r0.A06
            X.1lc r2 = (X.C35081lc) r2
            java.lang.Object r8 = r0.A03
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            java.lang.Object r3 = r0.A07
            X.732 r3 = (X.AnonymousClass732) r3
            java.lang.Object r7 = r0.A05
            java.security.PublicKey r7 = (java.security.PublicKey) r7
            int r1 = r0.A01
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = r0.A02
            X.89m r4 = (X.C1606789m) r4
            java.lang.Object r5 = r0.A04
            X.705 r5 = (X.AnonymousClass705) r5
            r2.CBd(r3, r4, r5, r6, r7, r8)
            return
        L_0x00b7:
            java.lang.Object r5 = r0.A06
            X.1lc r5 = (X.C35081lc) r5
            java.lang.Object r1 = r0.A07
            X.732 r1 = (X.AnonymousClass732) r1
            X.77e r4 = r1.A04
            X.C18070vi.A0X(r4)
            java.lang.Object r8 = r0.A03
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8
            java.lang.Object r2 = r0.A02
            X.89m r2 = (X.C1606789m) r2
            X.77e r1 = r1.A05
            java.lang.String r6 = X.C108985cd.A0m(r1)
            java.lang.Object r7 = r0.A05
            java.security.PublicKey r7 = (java.security.PublicKey) r7
            int r9 = r0.A01
            java.lang.Object r3 = r0.A04
            X.705 r3 = (X.AnonymousClass705) r3
            X.C35081lc.A05(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x00e0:
            java.lang.Object r6 = r0.A02
            X.6jE r6 = (X.C130316jE) r6
            java.lang.Object r5 = r0.A03
            android.net.Uri r5 = (android.net.Uri) r5
            java.lang.Object r4 = r0.A04
            java.lang.Object r3 = r0.A05
            java.lang.Object r7 = r0.A06
            java.lang.Object r1 = r0.A07
            int r8 = r0.A01
            X.0ve r9 = r6.A02
            r2 = 6314(0x18aa, float:8.848E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r9, r2)
            r10 = 0
            if (r0 == 0) goto L_0x0223
            X.1Nq r2 = r6.A03     // Catch:{ IOException -> 0x0165, SecurityException -> 0x015d }
            r0 = 1
            java.io.InputStream r9 = r2.A0A(r5, r0)     // Catch:{ IOException -> 0x0165, SecurityException -> 0x015d }
            r0 = 0
            android.graphics.Bitmap r2 = X.AnonymousClass204.A06(r0, r9)     // Catch:{ all -> 0x0156 }
            r13 = 0
            if (r2 == 0) goto L_0x014c
            boolean r0 = r2.hasAlpha()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x014c
            int r12 = r2.getWidth()     // Catch:{ all -> 0x0156 }
            r0 = 1
            int r12 = r12 - r0
            int r11 = r2.getHeight()     // Catch:{ all -> 0x0156 }
            int r11 = r11 - r0
            if (r12 < 0) goto L_0x014c
            if (r11 < 0) goto L_0x014c
            int r0 = r2.getPixel(r10, r10)     // Catch:{ all -> 0x0156 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x014b
            int r0 = r2.getPixel(r12, r10)     // Catch:{ all -> 0x0156 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x014b
            int r0 = r2.getPixel(r10, r11)     // Catch:{ all -> 0x0156 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x014b
            int r0 = r2.getPixel(r12, r11)     // Catch:{ all -> 0x0156 }
            int r0 = android.graphics.Color.alpha(r0)     // Catch:{ all -> 0x0156 }
            if (r0 != 0) goto L_0x014c
        L_0x014b:
            r13 = 1
        L_0x014c:
            r10 = r13
            if (r2 == 0) goto L_0x0152
            r2.recycle()     // Catch:{ all -> 0x0156 }
        L_0x0152:
            r9.close()     // Catch:{ IOException -> 0x0165, SecurityException -> 0x015d }
            goto L_0x016f
        L_0x0156:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            X.CDX.A00(r9, r2)     // Catch:{ IOException -> 0x0165, SecurityException -> 0x015d }
            throw r0     // Catch:{ IOException -> 0x0165, SecurityException -> 0x015d }
        L_0x015d:
            r9 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TransparentImageStickerHandler/handlePastedPngImage/SecurityException/error while getting bitmap stream "
            goto L_0x016c
        L_0x0165:
            r9 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TransparentImageStickerHandler/handlePastedPngImage/IOException/error while getting bitmap stream "
        L_0x016c:
            X.C17900vP.A0X(r9, r0, r2)
        L_0x016f:
            if (r10 == 0) goto L_0x0223
            r14 = 0
            X.1Nq r2 = r6.A03     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r0 = 1
            java.io.InputStream r9 = r2.A0A(r5, r0)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            android.graphics.Bitmap r12 = X.AnonymousClass204.A06(r14, r9)     // Catch:{ all -> 0x0205 }
            r9.close()     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            if (r12 == 0) goto L_0x021e
            r2 = 512(0x200, float:7.175E-43)
            r0 = 16
            android.graphics.Bitmap r13 = X.AnonymousClass204.A04(r12, r2, r0)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            X.C18070vi.A0X(r13)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            X.118 r11 = r6.A01     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            android.content.Context r9 = r11.A00     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r0 = 2131168783(0x7f070e0f, float:1.7951878E38)
            float r10 = X.AnonymousClass3MW.A00(r2, r0)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r0 = 2131103104(0x7f060d80, float:1.7818665E38)
            int r9 = X.C19740yt.A00(r9, r0)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r0.<init>(r9, r2)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            android.graphics.Bitmap r10 = X.AnonymousClass204.A05(r13, r0, r10)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            X.C18070vi.A0X(r10)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r12.recycle()     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            X.72H r9 = r6.A04     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r25 = 0
            r0 = 70
            X.77d r2 = r9.A02(r10, r2, r0)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            if (r2 == 0) goto L_0x021e
            r0 = 2131899594(0x7f1234ca, float:1.9434138E38)
            java.lang.String r16 = r11.A01(r0)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r26 = 1
            r24 = 5
            X.73B r13 = new X.73B     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r17 = r14
            r18 = r14
            r19 = r14
            r20 = r14
            r21 = r14
            r22 = r14
            r23 = r14
            r28 = r25
            r29 = r25
            r30 = r25
            r31 = r25
            r15 = r14
            r27 = r25
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r2.A04 = r13     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            r9.A04(r2)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            X.1KB r1 = r6.A00
            r13 = 16
            X.AkZ r0 = new X.AkZ
            r7 = r0
            r8 = r3
            r9 = r6
            r10 = r4
            r11 = r2
            r12 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1.A0J(r0)
            return
        L_0x0205:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0207 }
        L_0x0207:
            r0 = move-exception
            X.CDX.A00(r9, r2)     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
            throw r0     // Catch:{ IOException -> 0x0214, SecurityException -> 0x020c }
        L_0x020c:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TransparentImageStickerHandler/getStickerFromTransparentImageUri/SecurityException/error while getting bitmap stream "
            goto L_0x021b
        L_0x0214:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TransparentImageStickerHandler/getStickerFromTransparentImageUri/IOException/error while getting bitmap stream "
        L_0x021b:
            X.C17900vP.A0X(r3, r0, r2)
        L_0x021e:
            java.lang.String r0 = "TransparentImageStickerHandler/handlePastedPngImage/could not convert image uri to sticker"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0223:
            X.1KB r2 = r6.A00
            r14 = 13
            X.Aiu r0 = new X.Aiu
            r9 = r0
            r10 = r7
            r11 = r5
            r12 = r1
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            r2.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7R5.run():void");
    }

    public AnonymousClass7R5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A07 = obj6;
        this.A01 = i;
    }
}
