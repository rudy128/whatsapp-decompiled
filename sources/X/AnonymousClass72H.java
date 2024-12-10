package X;

import android.graphics.Bitmap;
import com.whatsapp.media.WamediaManager;
import java.io.File;
import java.io.OutputStream;

/* renamed from: X.72H  reason: invalid class name */
public final class AnonymousClass72H {
    public final C25311Ns A00;
    public final AnonymousClass181 A01;
    public final C219317y A02;
    public final WamediaManager A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1418377d A03(X.AnonymousClass73B r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            byte[] r0 = X.C108975cc.A1O(r10)
            java.lang.String r0 = X.C108955ca.A14(r0)
            java.lang.String r0 = X.C17970vW.A04(r0)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            if (r11 == 0) goto L_0x0032
            X.17y r2 = r8.A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C108995ce.A1N(r1, r5)
            java.lang.String r0 = ".webp"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r4 = r2.A00(r0)
        L_0x0029:
            boolean r0 = r4.exists()
            if (r0 != 0) goto L_0x00bd
            r7 = 0
            r6 = 0
            goto L_0x003b
        L_0x0032:
            X.1Ns r1 = r8.A00
            java.lang.String r0 = "image/webp"
            java.io.File r4 = r1.A04(r5, r0)
            goto L_0x0029
        L_0x003b:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x008c }
            r1.<init>(r10)     // Catch:{ Exception -> 0x008c }
            r0 = 9
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ Exception -> 0x008c }
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x008c }
            java.lang.String r0 = "null cannot be cast to non-null type java.net.HttpURLConnection"
            X.C18070vi.A0z(r3, r0)     // Catch:{ Exception -> 0x008c }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x008c }
            r3.connect()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            X.181 r0 = r8.A01     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            X.9Hb r2 = X.C108995ce.A0N(r0, r3, r7)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            java.lang.String r0 = ".webp"
            boolean r0 = X.AnonymousClass1YF.A0Y(r10, r0, r7)     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x0065
            X.C64062u9.A0T(r4, r2)     // Catch:{ all -> 0x007f }
            goto L_0x007b
        L_0x0065:
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x007f }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x007f }
            r0 = 80
            boolean r0 = r8.A00(r1, r4, r0)     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x007b
            r2.close()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            r3.disconnect()
            goto L_0x009f
        L_0x007b:
            r2.close()     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            goto L_0x00b7
        L_0x007f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
            throw r0     // Catch:{ Exception -> 0x0089, all -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            r6 = r3
            goto L_0x00ae
        L_0x0089:
            r2 = move-exception
            r6 = r3
            goto L_0x008d
        L_0x008c:
            r2 = move-exception
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = "StickerMaker/processStreamFromUrl/exception "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)     // Catch:{ all -> 0x00ad }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00ad }
            if (r6 == 0) goto L_0x009f
            r6.disconnect()
        L_0x009f:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.String r0 = "StickerMaker/createFromUrl/local file cannot be created"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x00ad:
            r0 = move-exception
        L_0x00ae:
            if (r6 == 0) goto L_0x00b3
            r6.disconnect()
        L_0x00b3:
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x00b7:
            r3.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x00bd:
            if (r9 == 0) goto L_0x00c8
            com.whatsapp.media.WamediaManager r1 = r8.A03
            byte[] r0 = r9.A04()
            r1.insertWebpMetadata(r4, r0)
        L_0x00c8:
            X.77d r3 = X.C108985cd.A0a()
            r3.A0I = r10
            r3.A0F = r5
            r3.A0C = r5
            java.lang.String r0 = "image/webp"
            r3.A0E = r0
            long r1 = r4.length()
            int r0 = (int) r1
            r3.A00 = r0
            r0 = 512(0x200, float:7.175E-43)
            r3.A03 = r0
            r3.A02 = r0
            X.C108985cd.A1B(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72H.A03(X.73B, java.lang.String, boolean):X.77d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C1418377d r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.lang.String r2 = r8.A0F     // Catch:{ FileNotFoundException -> 0x0072 }
            if (r2 == 0) goto L_0x007c
            X.1Ns r1 = r7.A00     // Catch:{ FileNotFoundException -> 0x0072 }
            java.lang.String r0 = r8.A0E     // Catch:{ FileNotFoundException -> 0x0072 }
            java.io.File r4 = r1.A04(r2, r0)     // Catch:{ FileNotFoundException -> 0x0072 }
            java.lang.String r3 = r8.A0B     // Catch:{ FileNotFoundException -> 0x0072 }
            if (r3 == 0) goto L_0x007c
            boolean r0 = r4.exists()     // Catch:{ FileNotFoundException -> 0x0072 }
            if (r0 == 0) goto L_0x0041
            long r5 = r4.length()     // Catch:{ FileNotFoundException -> 0x0072 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0041
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x0072 }
            boolean r0 = r3.equals(r0)     // Catch:{ FileNotFoundException -> 0x0072 }
            if (r0 != 0) goto L_0x007c
        L_0x002e:
            X.C108985cd.A1B(r8, r4)     // Catch:{ FileNotFoundException -> 0x0072 }
            com.whatsapp.media.WamediaManager r1 = r7.A03     // Catch:{ FileNotFoundException -> 0x0072 }
            X.73B r0 = r8.A04     // Catch:{ FileNotFoundException -> 0x0072 }
            if (r0 == 0) goto L_0x003f
            byte[] r0 = r0.A04()     // Catch:{ FileNotFoundException -> 0x0072 }
        L_0x003b:
            r1.insertWebpMetadata(r4, r0)     // Catch:{ FileNotFoundException -> 0x0072 }
            goto L_0x0063
        L_0x003f:
            r0 = 0
            goto L_0x003b
        L_0x0041:
            java.io.File r1 = X.C108945cZ.A17(r3)     // Catch:{ FileNotFoundException -> 0x0072 }
            boolean r0 = r1.exists()     // Catch:{ FileNotFoundException -> 0x0072 }
            if (r0 == 0) goto L_0x007c
            r4.delete()     // Catch:{ FileNotFoundException -> 0x0072 }
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x0072 }
            java.io.FileInputStream r3 = X.C108945cZ.A18(r1)     // Catch:{ FileNotFoundException -> 0x0072 }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r4)     // Catch:{ all -> 0x006b }
            X.C64062u9.A00(r3, r2)     // Catch:{ all -> 0x0064 }
            r2.close()     // Catch:{ all -> 0x006b }
            r3.close()     // Catch:{ FileNotFoundException -> 0x0072 }
            goto L_0x002e
        L_0x0063:
            return
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ FileNotFoundException -> 0x0072 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0072 }
        L_0x0072:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickerMaker/updateFilepath/exception "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72H.A05(X.77d):void");
    }

    private final boolean A01(Bitmap bitmap, OutputStream outputStream, int i) {
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            C108975cc.A0o(bitmap, "StickerMaker/compress/bitmap info/w = ", A10);
            A10.append(", h = ");
            A10.append(bitmap.getHeight());
            C17900vP.A0j(", quality = ", A10, i);
            boolean compress = bitmap.compress(Bitmap.CompressFormat.WEBP, i, outputStream);
            if (!compress) {
                ((AnonymousClass190) this.A04.get()).A0G("StickerMaker", AnonymousClass001.A1I("compress failed with quality ", AnonymousClass000.A10(), i), true);
            }
            return compress;
        } catch (Throwable th) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("Fatal error compressing with quality ");
            A102.append(i);
            A102.append(10);
            ((AnonymousClass190) this.A04.get()).A0G("StickerMaker", AnonymousClass000.A0y(C25359CeJ.A00(th), A102), true);
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1418377d A02(android.graphics.Bitmap r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            X.17y r0 = r5.A02
            X.17z r1 = r0.A00
            java.lang.String r0 = ""
            java.io.File r1 = r1.A01(r0)
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r1)
            boolean r0 = r5.A01(r6, r3, r8)     // Catch:{ all -> 0x0063 }
            r2 = 0
            r3.close()
            if (r0 == 0) goto L_0x002e
            java.io.FileInputStream r3 = X.C108945cZ.A18(r1)
            java.security.MessageDigest r0 = X.C108945cZ.A1I()     // Catch:{ all -> 0x0063 }
            X.C1402370n.A02(r3, r0)     // Catch:{ all -> 0x0063 }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = X.C108955ca.A14(r0)     // Catch:{ all -> 0x0063 }
            r3.close()
        L_0x002e:
            r4 = 0
            if (r2 == 0) goto L_0x0045
            X.1Ns r0 = r5.A00
            java.lang.String r1 = "image/webp"
            java.io.File r3 = r0.A04(r2, r1)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0046
            boolean r0 = r5.A00(r6, r3, r8)
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            return r4
        L_0x0046:
            X.77d r4 = X.C108985cd.A0a()
            r4.A0I = r7
            r4.A0F = r2
            r4.A0C = r2
            r4.A0E = r1
            long r1 = r3.length()
            int r0 = (int) r1
            r4.A00 = r0
            r0 = 512(0x200, float:7.175E-43)
            r4.A03 = r0
            r4.A02 = r0
            X.C108985cd.A1B(r4, r3)
            return r4
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72H.A02(android.graphics.Bitmap, java.lang.String, int):X.77d");
    }

    public final void A04(C1418377d r5) {
        byte[] bArr;
        String str = r5.A0B;
        byte[] bArr2 = null;
        if (str != null) {
            WamediaManager wamediaManager = this.A03;
            File A17 = C108945cZ.A17(str);
            AnonymousClass73B r0 = r5.A04;
            if (r0 != null) {
                bArr = r0.A04();
            } else {
                bArr = null;
            }
            wamediaManager.insertWebpMetadata(A17, bArr);
        }
        String str2 = r5.A0F;
        if (str2 != null) {
            File A042 = this.A00.A04(str2, r5.A0E);
            WamediaManager wamediaManager2 = this.A03;
            AnonymousClass73B r02 = r5.A04;
            if (r02 != null) {
                bArr2 = r02.A04();
            }
            wamediaManager2.insertWebpMetadata(A042, bArr2);
        }
    }

    public AnonymousClass72H(C25311Ns r1, AnonymousClass181 r2, C219317y r3, WamediaManager wamediaManager, AnonymousClass00H r5) {
        C18070vi.A0w(r2, r5, wamediaManager, r1, r3);
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = wamediaManager;
        this.A00 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        X.CDX.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A00(android.graphics.Bitmap r4, java.io.File r5, int r6) {
        /*
            r3 = this;
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r5)
            boolean r0 = r3.A01(r4, r2, r6)     // Catch:{ all -> 0x000c }
            r2.close()
            return r0
        L_0x000c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x000e }
        L_0x000e:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72H.A00(android.graphics.Bitmap, java.io.File, int):boolean");
    }
}
