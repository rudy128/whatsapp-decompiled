package X;

import com.whatsapp.media.WamediaManager;

/* renamed from: X.68X  reason: invalid class name */
public final class AnonymousClass68X extends C27086DTl {
    public final AnonymousClass190 A00;
    public final C218617r A01;
    public final C25311Ns A02;
    public final AnonymousClass11C A03;
    public final WamediaManager A04;
    public final C57852jk A05;
    public final AnonymousClass68U A06;
    public final C138906xt A07;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r2.exists() == true) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d4, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x011b, code lost:
        if (r2.exists() != false) goto L_0x011d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C55362fe A07() {
        /*
            r14 = this;
            X.68U r3 = r14.A06
            java.lang.String r4 = r3.A03
            if (r4 == 0) goto L_0x006f
            X.1Ns r1 = r14.A02
            java.lang.String r0 = r3.A04
            java.io.File r2 = r1.A04(r4, r0)
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x006f
        L_0x0015:
            X.1D6 r6 = X.AnonymousClass1D6.A01(r2, r4)
        L_0x0019:
            r9 = 0
            if (r6 == 0) goto L_0x006c
            java.lang.Object r8 = r6.first
            java.io.File r8 = (java.io.File) r8
            java.lang.Object r10 = r6.second
            java.lang.String r10 = (java.lang.String) r10
        L_0x0024:
            X.6xt r1 = r14.A07
            java.lang.String r0 = r3.A04
            X.6uF r2 = r1.A01(r8, r0)
            if (r8 == 0) goto L_0x0068
            java.lang.String r0 = r8.getAbsolutePath()
            if (r0 == 0) goto L_0x0068
            if (r2 == 0) goto L_0x0068
            long r6 = r8.length()
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x005c
            r0 = 2131896409(0x7f122859, float:1.9427678E38)
        L_0x0044:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12 = -1
            if (r0 == 0) goto L_0x0166
            int r1 = r0.intValue()
            X.E6h r0 = r3.A05
            r0.BJ0(r1)
            r13 = 0
            X.2KM r7 = new X.2KM
            r11 = r9
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x005c:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x0126
            r0 = 2131887931(0x7f12073b, float:1.9410483E38)
            goto L_0x0044
        L_0x0068:
            r0 = 2131896086(0x7f122716, float:1.9427023E38)
            goto L_0x0044
        L_0x006c:
            r8 = r9
            r10 = r9
            goto L_0x0024
        L_0x006f:
            java.io.File r2 = r3.A01
            if (r2 == 0) goto L_0x007b
            boolean r1 = r2.exists()
            r0 = 1
            if (r1 != r0) goto L_0x007b
            goto L_0x0015
        L_0x007b:
            java.io.File r4 = r3.A06
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x00af
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/sticker uri is null "
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0086:
            r0 = 0
        L_0x0087:
            r5 = 0
            if (r0 == 0) goto L_0x00fa
            com.whatsapp.media.WamediaManager r6 = r14.A04
            java.lang.String r0 = r4.getAbsolutePath()
            com.whatsapp.stickers.WebpInfo r2 = r6.verifyWebpFile(r0)
            if (r2 == 0) goto L_0x00f5
            int r0 = r2.height
            r1 = 512(0x200, float:7.175E-43)
            if (r0 != r1) goto L_0x00f5
            int r0 = r2.width
            if (r0 != r1) goto L_0x00f5
            X.73B r0 = r3.A00
            if (r0 == 0) goto L_0x00f2
            byte[] r0 = r0.A04()
            boolean r0 = r6.insertWebpMetadata(r4, r0)
            if (r0 == 0) goto L_0x00f2
            goto L_0x00e6
        L_0x00af:
            X.11C r0 = r14.A03     // Catch:{ Exception -> 0x00de }
            X.11B r1 = r0.A0O()     // Catch:{ Exception -> 0x00de }
            if (r1 == 0) goto L_0x00d9
            android.net.Uri r0 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00de }
            java.io.InputStream r2 = r1.A07(r0)     // Catch:{ Exception -> 0x00de }
            if (r2 != 0) goto L_0x00c7
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri failed to open input stream"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x0086
        L_0x00c7:
            r0 = 500000(0x7a120, double:2.47033E-318)
            boolean r0 = X.C64062u9.A0U(r4, r2, r0)     // Catch:{ all -> 0x00d2 }
            r2.close()     // Catch:{ Exception -> 0x00de }
            goto L_0x0087
        L_0x00d2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x00de }
            goto L_0x00dd
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()     // Catch:{ Exception -> 0x00de }
        L_0x00dd:
            throw r0     // Catch:{ Exception -> 0x00de }
        L_0x00de:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/copyStickerFileFromUri/copyStickerFileFromUri exception "
            com.whatsapp.util.Log.e(r0, r1)
            r0 = 0
            goto L_0x0087
        L_0x00e6:
            java.lang.String r5 = X.C1402370n.A00(r4)     // Catch:{ IOException -> 0x00eb }
            goto L_0x00fa
        L_0x00eb:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia/unable to get sticker hash"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00fa
        L_0x00f2:
            java.lang.String r0 = "ProcessStickerTask/processMedia/there is no sticker metadata object in processMediaRequestData"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r0 = "ProcessStickerTask/processMedia/sticker uri in processMediaRequestData was invalid"
        L_0x00f7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00fa:
            r6 = 0
            if (r5 == 0) goto L_0x0019
            X.1Ns r1 = r14.A02
            java.lang.String r0 = r3.A04
            java.io.File r2 = r1.A04(r5, r0)
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x011d
            X.17r r0 = r14.A01     // Catch:{ IOException -> 0x0111 }
            r0.A0j(r4, r2)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0117
        L_0x0111:
            r1 = move-exception
            java.lang.String r0 = "ProcessStickerTask/processMedia failed to move file to destination "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0117:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0019
        L_0x011d:
            X.C108985cd.A1C(r4)
            X.1D6 r6 = X.AnonymousClass1D6.A01(r2, r5)
            goto L_0x0019
        L_0x0126:
            X.1So r6 = X.C26551So.A0j
            java.io.File r5 = r2.A00
            boolean r4 = r2 instanceof X.AnonymousClass6HI
            if (r4 == 0) goto L_0x0176
            java.lang.String r3 = "image/webp"
        L_0x0130:
            r0 = 0
            X.2et r1 = new X.2et
            r1.<init>(r6, r5, r3, r0)
            X.2jk r0 = r14.A05
            X.2eu r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0174
            byte[] r11 = r0.A02
        L_0x0140:
            if (r4 == 0) goto L_0x0172
            r0 = r2
            X.6HI r0 = (X.AnonymousClass6HI) r0
            X.0vl r0 = r0.A04
            int r1 = X.C72453Mb.A0I(r0)
        L_0x014b:
            X.6zN r0 = new X.6zN
            r0.<init>(r1)
            int r12 = r0.A00
            if (r4 == 0) goto L_0x0170
            X.6HI r2 = (X.AnonymousClass6HI) r2
            X.0vl r0 = r2.A04
            int r1 = X.C72453Mb.A0I(r0)
            r0 = -1
            boolean r0 = X.C108975cc.A1D(r1, r0)
        L_0x0161:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)
            goto L_0x0169
        L_0x0166:
            if (r2 != 0) goto L_0x0126
            r11 = r9
        L_0x0169:
            r13 = 1
            X.2KM r7 = new X.2KM
            r7.<init>(r8, r9, r10, r11, r12, r13)
            return r7
        L_0x0170:
            r0 = 1
            goto L_0x0161
        L_0x0172:
            r1 = -1
            goto L_0x014b
        L_0x0174:
            r11 = 0
            goto L_0x0140
        L_0x0176:
            java.lang.String r3 = "application/was"
            goto L_0x0130
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass68X.A07():X.2fe");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass68X(AnonymousClass190 r1, C218617r r2, C25311Ns r3, AnonymousClass11C r4, WamediaManager wamediaManager, C57852jk r6, AnonymousClass68U r7, C138906xt r8) {
        super(r7);
        C18070vi.A0q(r7, r6, r8);
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = wamediaManager;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = r6;
        this.A07 = r8;
    }
}
