package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import android.os.Build;
import com.facebook.imagepipeline.platform.PreverificationHelper;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Csx  reason: case insensitive filesystem */
public abstract class C26134Csx {
    public static final byte[] A03 = {-1, -39};
    public final C29011bR A00;
    public final BSH A01;
    public final PreverificationHelper A02;

    public DRN A04(Bitmap.Config config, DRJ drj) {
        BitmapFactory.Options A002 = A00(config, drj);
        boolean A1Z = AnonymousClass3Ma.A1Z(A002.inPreferredConfig, Bitmap.Config.ARGB_8888);
        try {
            InputStream A08 = drj.A08();
            C26208Cuj.A01(A08);
            return A01(A002, (ColorSpace) null, A08);
        } catch (RuntimeException e) {
            if (A1Z) {
                return A04(Bitmap.Config.ARGB_8888, drj);
            }
            throw e;
        }
    }

    public static BitmapFactory.Options A00(Bitmap.Config config, DRJ drj) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = drj.A03;
        options.inJustDecodeBounds = true;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        BitmapFactory.decodeStream(drj.A08(), (Rect) null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw BE6.A0j();
        }
        options.inJustDecodeBounds = false;
        return options;
    }

    public int A02(BitmapFactory.Options options, int i, int i2) {
        Bitmap.Config config = options.inPreferredConfig;
        if (config != null) {
            return C26077Crr.A01(config, i, i2);
        }
        throw C17880vN.A0g();
    }

    public DRN A03(Bitmap.Config config, ColorSpace colorSpace, DRJ drj, int i) {
        DRN drn;
        DRN drn2;
        C25783Clu clu = drj.A07;
        boolean z = true;
        if ((clu == CIN.A06 || clu == CIN.A02) && drj.A0A == null) {
            DRN drn3 = drj.A0B;
            C26208Cuj.A01(drn3);
            DRG drg = (DRG) drn3.A05();
            if (!(i >= 2 && drg.A00(i - 2) == -1 && drg.A00(i - 1) == -39)) {
                z = false;
            }
        }
        BitmapFactory.Options A002 = A00(config, drj);
        AnonymousClass6QR A08 = drj.A08();
        C26208Cuj.A01(A08);
        if (drj.A05() > i) {
            A08 = new AnonymousClass6QS(A08, i);
        }
        if (!z) {
            A08 = new AnonymousClass6QR(A08, A03);
        }
        Bitmap.Config config2 = A002.inPreferredConfig;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        try {
            drn2 = AnonymousClass3Ma.A1Z(config2, config3);
            DRN A012 = A01(A002, colorSpace, A08);
            drn2 = A012;
            drn = A012;
        } catch (RuntimeException e) {
            if (drn2) {
                drn = A03(config3, colorSpace, drj, i);
            } else {
                throw e;
            }
        } catch (Throwable th) {
            try {
                A08.close();
                throw th;
            } catch (IOException e2) {
                e2.printStackTrace();
                throw th;
            }
        }
        try {
            A08.close();
            return drn;
        } catch (IOException e3) {
            e3.printStackTrace();
            return drn;
        }
    }

    public C26134Csx(C29011bR r3, BSH bsh) {
        PreverificationHelper preverificationHelper;
        if (Build.VERSION.SDK_INT >= 26) {
            preverificationHelper = new PreverificationHelper();
        } else {
            preverificationHelper = null;
        }
        this.A02 = preverificationHelper;
        this.A01 = bsh;
        this.A00 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.DBJ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r1.shouldUseHardwareBitmapConfig(r8.inPreferredConfig) == false) goto L_0x001b;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.DRN A01(android.graphics.BitmapFactory.Options r8, android.graphics.ColorSpace r9, java.io.InputStream r10) {
        /*
            r7 = this;
            X.C26208Cuj.A01(r10)
            int r6 = r8.outWidth
            int r5 = r8.outHeight
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            r3 = 0
            if (r0 < r4) goto L_0x001b
            com.facebook.imagepipeline.platform.PreverificationHelper r1 = r7.A02
            if (r1 == 0) goto L_0x001b
            android.graphics.Bitmap$Config r0 = r8.inPreferredConfig
            boolean r1 = r1.shouldUseHardwareBitmapConfig(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r2 = 0
            if (r0 == 0) goto L_0x0043
            r8.inMutable = r3
            r3 = r2
        L_0x0022:
            r8.inBitmap = r3
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L_0x0032
            if (r9 != 0) goto L_0x0030
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r9 = android.graphics.ColorSpace.get(r0)
        L_0x0030:
            r8.inPreferredColorSpace = r9
        L_0x0032:
            X.1bR r4 = r7.A00
            java.lang.Object r5 = r4.BAf()
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L_0x0058
            r0 = 16384(0x4000, float:2.2959E-41)
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocate(r0)
            goto L_0x0058
        L_0x0043:
            int r1 = r7.A02(r8, r6, r5)
            X.BSH r0 = r7.A01
            java.lang.Object r3 = r0.get(r1)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 != 0) goto L_0x0022
            java.lang.String r0 = "BitmapPool.get returned null"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0058:
            byte[] r0 = r5.array()     // Catch:{ IllegalArgumentException -> 0x0088, RuntimeException -> 0x007f }
            r8.inTempStorage = r0     // Catch:{ IllegalArgumentException -> 0x0088, RuntimeException -> 0x007f }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r10, r2, r8)     // Catch:{ IllegalArgumentException -> 0x0088, RuntimeException -> 0x007f }
            r4.CEF(r5)
            if (r3 == 0) goto L_0x0078
            if (r3 == r1) goto L_0x0078
            X.BSH r0 = r7.A01
            r0.CEE(r3)
            if (r1 == 0) goto L_0x0073
            r1.recycle()
        L_0x0073:
            java.lang.IllegalStateException r0 = X.BE6.A0k()
            throw r0
        L_0x0078:
            X.BSH r0 = r7.A01
            X.DRN r0 = X.DRN.A00(r0, r1)
            return r0
        L_0x007f:
            r1 = move-exception
            if (r3 == 0) goto L_0x0087
            X.BSH r0 = r7.A01     // Catch:{ all -> 0x00ae }
            r0.CEE(r3)     // Catch:{ all -> 0x00ae }
        L_0x0087:
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x0088:
            r2 = move-exception
            if (r3 == 0) goto L_0x0090
            X.BSH r0 = r7.A01     // Catch:{ all -> 0x00ae }
            r0.CEE(r3)     // Catch:{ all -> 0x00ae }
        L_0x0090:
            r10.reset()     // Catch:{ IOException -> 0x00ad }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r10)     // Catch:{ IOException -> 0x00ad }
            if (r1 == 0) goto L_0x00ac
            X.DBJ r0 = X.DBJ.A00     // Catch:{ IOException -> 0x00ad }
            if (r0 != 0) goto L_0x00a4
            X.DBJ r0 = new X.DBJ     // Catch:{ IOException -> 0x00ad }
            r0.<init>()     // Catch:{ IOException -> 0x00ad }
            X.DBJ.A00 = r0     // Catch:{ IOException -> 0x00ad }
        L_0x00a4:
            X.DRN r0 = X.DRN.A00(r0, r1)     // Catch:{ IOException -> 0x00ad }
            r4.CEF(r5)
            return r0
        L_0x00ac:
            throw r2     // Catch:{ IOException -> 0x00ad }
        L_0x00ad:
            throw r2     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            r4.CEF(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26134Csx.A01(android.graphics.BitmapFactory$Options, android.graphics.ColorSpace, java.io.InputStream):X.DRN");
    }
}
