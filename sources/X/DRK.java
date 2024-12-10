package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.facebook.animated.gif.GifImage;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public class DRK implements Closeable {
    public static final C25798CmA A04;
    public static final C25798CmA A05;
    public static final ExecutorService A06 = Executors.newSingleThreadExecutor();
    public static final AtomicBoolean A07 = C108965cb.A0w();
    public final GifImage A00;
    public final C26113Csb A01;
    public final ParcelFileDescriptor A02;
    public final BSC A03;

    public static Bitmap A00(File file) {
        DRK A012 = A01(ParcelFileDescriptor.open(file, 268435456), true);
        boolean z = true;
        try {
            C17960vV.A0C(true);
            GifImage gifImage = A012.A00;
            if (0 >= gifImage.getFrameCount()) {
                z = false;
            }
            C17960vV.A0C(z);
            Bitmap createBitmap = Bitmap.createBitmap(gifImage.getWidth(), gifImage.getHeight(), Bitmap.Config.ARGB_8888);
            A012.A01.A03(0, createBitmap);
            A012.close();
            return createBitmap;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static C128526gF A03(ParcelFileDescriptor parcelFileDescriptor) {
        DRK A012 = A01(parcelFileDescriptor, true);
        try {
            GifImage gifImage = A012.A00;
            C128526gF r0 = new C128526gF(gifImage.getWidth(), gifImage.getHeight(), gifImage.isAnimated());
            A012.close();
            return r0;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    static {
        CRJ crj = new CRJ();
        crj.A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        crj.A03 = true;
        A05 = new C25798CmA(crj);
        CRJ crj2 = new CRJ();
        crj2.A00 = ZipDecompressor.UNZIP_BUFFER_SIZE;
        A04 = new C25798CmA(crj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0072 A[SYNTHETIC, Splitter:B:34:0x0072] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DRK A01(android.os.ParcelFileDescriptor r5, boolean r6) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r3 = A07
            boolean r0 = r3.get()
            if (r0 != 0) goto L_0x0033
            java.util.concurrent.ExecutorService r2 = A06
            boolean r0 = r2.isShutdown()
            if (r0 != 0) goto L_0x0033
            r1 = 2
            X.DVQ r0 = new X.DVQ     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            r0.<init>(r1)     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            java.lang.Object r0 = r0.get()     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            boolean r1 = X.AnonymousClass000.A1Y(r0)     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            r0 = 0
            r3.compareAndSet(r0, r1)     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            r2.shutdown()     // Catch:{ RejectedExecutionException -> 0x0033, InterruptedException | ExecutionException -> 0x002a }
            goto L_0x0033
        L_0x002a:
            r2 = move-exception
            java.lang.String r1 = "Failed to initialize Fresco"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1, r2)
            throw r0
        L_0x0033:
            boolean r0 = r3.get()
            if (r0 == 0) goto L_0x0080
            r4 = 0
            int r2 = r5.getFd()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
            if (r6 == 0) goto L_0x004e
            X.CmA r0 = A05     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
        L_0x0042:
            com.facebook.animated.gif.GifImage.ensure()     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
            int r1 = r0.A00     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
            boolean r0 = r0.A03     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
            com.facebook.animated.gif.GifImage r3 = com.facebook.animated.gif.GifImage.nativeCreateFromFileDescriptor(r2, r1, r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
            goto L_0x0051
        L_0x004e:
            X.CmA r0 = A04     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0064 }
            goto L_0x0042
        L_0x0051:
            X.ChM r0 = new X.ChM     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0061 }
            r0.<init>((X.EAH) r3)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0061 }
            X.BSC r2 = new X.BSC     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0061 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0061 }
            X.DRK r0 = new X.DRK     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0067 }
            r0.<init>(r5, r3, r2)     // Catch:{ IllegalArgumentException | IllegalStateException -> 0x0067 }
            return r0
        L_0x0061:
            r1 = move-exception
            r2 = r4
            goto L_0x0068
        L_0x0064:
            r1 = move-exception
            r2 = r4
            goto L_0x006d
        L_0x0067:
            r1 = move-exception
        L_0x0068:
            if (r3 == 0) goto L_0x006d
            r3.dispose()
        L_0x006d:
            X.AnonymousClass1EY.A02(r2)
            if (r5 == 0) goto L_0x007a
            r5.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x007a:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x0080:
            java.lang.String r0 = "Fresco failed to initialize"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRK.A01(android.os.ParcelFileDescriptor, boolean):X.DRK");
    }

    public static C128526gF A02(Uri uri, AnonymousClass1NL r4, AnonymousClass11B r5) {
        ParcelFileDescriptor A062;
        if (r5 != null) {
            r4.A03(uri);
            try {
                A062 = r5.A06(uri, "r");
                if (A062 != null) {
                    r4.A05(A062);
                    C128526gF A032 = A03(A062);
                    A062.close();
                    return A032;
                }
                throw C17880vN.A0f(AnonymousClass001.A1E(uri, "gifdecoder/getmetadata/cannot open uri, pfd=null, uri=", AnonymousClass000.A10()));
            } catch (SecurityException e) {
                Log.e(AnonymousClass001.A1E(uri, "gifdecoder/getmetadata/failed to read uri ", AnonymousClass000.A10()), e);
                throw new IOException(e);
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
            }
        } else {
            throw C17880vN.A0f("gifdecoder/getmetadata/cannot open uri, cr=null");
        }
        throw th;
    }

    public static C128526gF A04(File file) {
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
        try {
            C128526gF A032 = A03(open);
            if (open != null) {
                open.close();
            }
            return A032;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void close() {
        this.A00.dispose();
        AnonymousClass1EY.A02(this.A03);
        ParcelFileDescriptor parcelFileDescriptor = this.A02;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th) {
                Log.e(th);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.C99, java.lang.Object] */
    public DRK(ParcelFileDescriptor parcelFileDescriptor, GifImage gifImage, BSC bsc) {
        this.A02 = parcelFileDescriptor;
        this.A03 = bsc;
        this.A00 = gifImage;
        ? obj = new Object();
        this.A01 = new C26113Csb(new C26116Cse(new Rect(0, 0, gifImage.getWidth(), gifImage.getHeight()), new C25524ChM((EAH) gifImage), obj, false), new C26753DCi(this, 2), false);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.BFF] */
    /* JADX WARNING: type inference failed for: r2v6, types: [X.BFA] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.BFF A05(android.content.Context r19) {
        /*
            r18 = this;
            boolean r0 = X.C26141Ct4.A02()
            if (r0 != 0) goto L_0x0024
            android.content.Context r2 = r19.getApplicationContext()
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.CTF r1 = new X.CTF
            r1.<init>(r2)
            java.lang.Integer r0 = X.C17880vN.A0h()
            r1.A03 = r0
            X.CUW r0 = new X.CUW
            r0.<init>(r1)
            X.C26141Ct4.A01(r0)
            r0 = 0
            X.C24448C4n.A00 = r0
        L_0x0024:
            X.Ct4 r1 = X.C26141Ct4.A0G
            java.lang.String r0 = "ImagePipelineFactory was not initialized!"
            X.C26208Cuj.A02(r1, r0)
            com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl r2 = X.C26141Ct4.A00(r1)
            if (r2 != 0) goto L_0x0038
            java.lang.String r0 = "Failed to create gif drawable, no drawable factory"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0038:
            X.CkS r4 = r2.A03
            if (r4 != 0) goto L_0x00b1
            r0 = 2
            X.DB8 r5 = new X.DB8
            r5.<init>(r0)
            X.EEB r1 = r2.A02
            if (r1 != 0) goto L_0x0056
            X.E18 r0 = r2.A09
            X.DCr r0 = (X.C26762DCr) r0
            java.util.concurrent.Executor r3 = r0.A01
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            X.BQo r1 = new X.BQo
            r1.<init>(r0, r3)
        L_0x0056:
            r0 = 3
            X.DB8 r6 = new X.DB8
            r6.<init>(r0)
            X.E4K r7 = X.C24697CGj.A00
            X.E14 r13 = r2.A05
            if (r13 != 0) goto L_0x006a
            r0 = 0
            X.DCh r13 = new X.DCh
            r13.<init>(r2, r0)
            r2.A05 = r13
        L_0x006a:
            X.Dc6 r17 = X.C27334Dc6.A01
            if (r17 != 0) goto L_0x0075
            X.Dc6 r17 = new X.Dc6
            r17.<init>()
            X.C27334Dc6.A01 = r17
        L_0x0075:
            com.facebook.common.time.RealtimeSinceBootClock r12 = com.facebook.common.time.RealtimeSinceBootClock.A00
            X.CUc r14 = r2.A07
            X.ECt r15 = r2.A08
            boolean r0 = r2.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 1
            X.DB9 r8 = new X.DB9
            r8.<init>(r0, r3)
            boolean r0 = r2.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.DB9 r9 = new X.DB9
            r9.<init>(r0, r3)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.DB9 r10 = new X.DB9
            r10.<init>(r0, r3)
            int r0 = r2.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.DB9 r11 = new X.DB9
            r11.<init>(r0, r3)
            X.CkS r4 = new X.CkS
            r16 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.A03 = r4
        L_0x00b1:
            r0 = r18
            X.BSC r3 = r0.A03
            r2 = 0
            if (r3 == 0) goto L_0x00e9
            monitor-enter(r3)
            X.ChM r0 = r3.A00     // Catch:{ all -> 0x00c7 }
            if (r0 != 0) goto L_0x00be
            goto L_0x00c1
        L_0x00be:
            X.EAH r1 = r0.A01     // Catch:{ all -> 0x00c7 }
            goto L_0x00c2
        L_0x00c1:
            r1 = 0
        L_0x00c2:
            monitor-exit(r3)
            monitor-enter(r3)
            X.ChM r0 = r3.A00     // Catch:{ all -> 0x00c7 }
            goto L_0x00ca
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ca:
            monitor-exit(r3)
            X.C26208Cuj.A01(r0)
            if (r1 == 0) goto L_0x00d4
            android.graphics.Bitmap$Config r2 = r1.getAnimatedBitmapConfig()
        L_0x00d4:
            X.DBj r1 = X.C25697CkS.A00(r2, r4, r0)
            X.E4K r0 = r4.A02
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x00f0
            X.BFA r2 = new X.BFA
            r2.<init>(r1)
        L_0x00e9:
            boolean r0 = r2 instanceof X.BFF
            if (r0 == 0) goto L_0x00f6
            X.BFF r2 = (X.BFF) r2
            return r2
        L_0x00f0:
            X.BFF r2 = new X.BFF
            r2.<init>(r1)
            goto L_0x00e9
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to create gif drawable, incorrect type or null: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r2, r0, r1)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DRK.A05(android.content.Context):X.BFF");
    }

    public DRK() {
    }
}
