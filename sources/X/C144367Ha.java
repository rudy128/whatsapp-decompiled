package X;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7Ha  reason: invalid class name and case insensitive filesystem */
public final class C144367Ha implements AnonymousClass891 {
    public final int A00;
    public final Context A01;
    public final Uri A02;
    public final AnonymousClass1T1 A03;
    public final C18000vb A04;
    public final AnonymousClass2E5 A05;
    public final AnonymousClass1KW A06;
    public final C18030ve A07;
    public final AnonymousClass72S A08;
    public final C34501ka A09;
    public final C25291Nq A0A;
    public final C26631Sw A0B;
    public final C26521Sl A0C;
    public final AtomicBoolean A0D = C108965cb.A0w();
    public final AnonymousClass69G A0E;

    public C144367Ha(Uri uri, AnonymousClass1T1 r3, C18000vb r4, AnonymousClass2E5 r5, AnonymousClass1KW r6, C18030ve r7, AnonymousClass72S r8, C34501ka r9, C25291Nq r10, AnonymousClass69G r11, C26631Sw r12, C26521Sl r13, int i) {
        C18070vi.A0d(uri, 6);
        this.A04 = r4;
        this.A06 = r6;
        this.A0C = r13;
        this.A09 = r9;
        this.A0B = r12;
        this.A02 = uri;
        this.A08 = r8;
        this.A0E = r11;
        this.A05 = r5;
        this.A00 = i;
        this.A07 = r7;
        this.A0A = r10;
        this.A03 = r3;
        this.A01 = AnonymousClass3MY.A04(r11);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap BhZ() {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.A0D
            boolean r0 = r2.get()
            r1 = 0
            if (r0 != 0) goto L_0x0139
            X.69G r0 = r13.A0E
            java.lang.Object r0 = r0.getTag()
            if (r0 != r13) goto L_0x0139
            boolean r0 = r2.get()
            if (r0 != 0) goto L_0x0139
            X.1ka r1 = r13.A09     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.net.Uri r0 = r13.A02     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            int r1 = r1.A00(r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r0 = 1
            if (r1 == r0) goto L_0x0023
            goto L_0x0059
        L_0x0023:
            X.72S r1 = r13.A08     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            monitor-enter(r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            java.io.File r0 = r1.A0B     // Catch:{ all -> 0x0124 }
            monitor-exit(r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0042
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch:{ OutOfMemoryError -> 0x0039 }
            X.C18070vi.A0b(r3)     // Catch:{ OutOfMemoryError -> 0x0039 }
            goto L_0x0061
        L_0x0039:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailBitmapLoader/getImageThumbnail/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.graphics.Bitmap r3 = X.AnonymousClass6YZ.A00     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x0061
        L_0x0042:
            java.io.File r0 = r1.A09()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.net.Uri r2 = android.net.Uri.fromFile(r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.1Sl r1 = r13.A0C     // Catch:{ 1iX | IOException -> 0x0056 }
            int r0 = r13.A00     // Catch:{ 1iX | IOException -> 0x0056 }
            android.graphics.Bitmap r3 = r1.A0h(r2, r0, r0)     // Catch:{ 1iX | IOException -> 0x0056 }
            X.C18070vi.A0b(r3)     // Catch:{ 1iX | IOException -> 0x0056 }
            goto L_0x0061
        L_0x0056:
            android.graphics.Bitmap r3 = X.AnonymousClass6YZ.A00     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x0061
        L_0x0059:
            r0 = 3
            if (r1 == r0) goto L_0x0064
            r0 = 13
            if (r1 == r0) goto L_0x0064
            r3 = 0
        L_0x0061:
            if (r3 != 0) goto L_0x00c8
            goto L_0x00c5
        L_0x0064:
            X.72S r0 = r13.A08     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            java.io.File r0 = r0.A0C()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x011f
            android.graphics.Bitmap r9 = X.C1408873l.A01(r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r9 != 0) goto L_0x0077
            android.graphics.Bitmap r3 = X.AnonymousClass6YZ.A00     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x0061
        L_0x0077:
            android.graphics.Bitmap$Config r0 = r9.getConfig()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0127
            int r8 = r13.A00     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.graphics.Canvas r7 = X.C108955ca.A0E(r3)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.graphics.Paint r6 = X.AnonymousClass3MW.A06()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r0 = 1
            r6.setAntiAlias(r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r6.setFilterBitmap(r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r6.setDither(r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            int r10 = r9.getWidth()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            int r5 = r9.getHeight()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r4 = 0
            if (r10 <= r5) goto L_0x00b8
            int r0 = r10 - r5
            int r1 = r0 / 2
            int r10 = r10 + r5
            int r0 = r10 / 2
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r2.<init>(r1, r4, r0, r5)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
        L_0x00ac:
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r0.<init>(r4, r4, r8, r8)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r7.drawBitmap(r9, r2, r0, r6)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r9.recycle()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x0061
        L_0x00b8:
            int r0 = r5 - r10
            int r1 = r0 / 2
            int r5 = r5 + r10
            int r0 = r5 / 2
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r2.<init>(r4, r1, r10, r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x00ac
        L_0x00c5:
            android.graphics.Bitmap r3 = X.AnonymousClass6YZ.A00     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            return r3
        L_0x00c8:
            X.72S r2 = r13.A08     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            int r4 = r2.A01()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r4 == 0) goto L_0x00da
            r1 = 1
            X.2E5 r0 = r13.A05     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.graphics.Bitmap r0 = com.whatsapp.filter.FilterUtils.A00(r3, r0, r4, r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 == 0) goto L_0x00da
            r3 = r0
        L_0x00da:
            java.lang.String r0 = r2.A0F()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0111
            boolean r0 = r3.isMutable()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 != 0) goto L_0x00ed
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r0 = 1
            android.graphics.Bitmap r3 = r3.copy(r1, r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
        L_0x00ed:
            X.6yp r4 = X.C1409573s.A06     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            java.lang.String r12 = r2.A0F()     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            android.content.Context r5 = r13.A01     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.1KW r8 = r13.A06     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.0vb r7 = r13.A04     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.1Sw r11 = r13.A0B     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.0ve r9 = r13.A07     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.1Nq r10 = r13.A0A     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.1T1 r6 = r13.A03     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            X.73s r1 = r4.A02(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r1 == 0) goto L_0x010e
            X.C18070vi.A0b(r3)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            r0 = 0
            r1.A08(r3, r0, r0, r0)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
        L_0x010e:
            X.C18070vi.A0b(r3)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
        L_0x0111:
            monitor-enter(r2)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            java.io.File r0 = r2.A0B     // Catch:{ all -> 0x011c }
            monitor-exit(r2)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            if (r0 == 0) goto L_0x0138
            android.graphics.Bitmap r3 = X.AnonymousClass204.A03(r3)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            return r3
        L_0x011c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x012b
        L_0x011f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x012b
        L_0x0124:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
            goto L_0x012b
        L_0x0127:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
        L_0x012b:
            throw r0     // Catch:{ OutOfMemoryError -> 0x012c, Exception -> 0x0130 }
        L_0x012c:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailBitmapLoader/load/OutOfMemoryError"
            goto L_0x0133
        L_0x0130:
            r1 = move-exception
            java.lang.String r0 = "ThumbnailBitmapLoader/load/exception"
        L_0x0133:
            com.whatsapp.util.Log.e(r0, r1)
            android.graphics.Bitmap r3 = X.AnonymousClass6YZ.A00
        L_0x0138:
            return r3
        L_0x0139:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144367Ha.BhZ():android.graphics.Bitmap");
    }

    public String Ba8() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A02.toString());
        return AnonymousClass000.A0y("-thumb", A10);
    }
}
