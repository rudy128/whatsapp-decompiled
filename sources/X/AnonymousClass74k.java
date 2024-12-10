package X;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.File;

/* renamed from: X.74k  reason: invalid class name */
public final class AnonymousClass74k implements Application.ActivityLifecycleCallbacks {
    public AnonymousClass4VT A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.graphics.Rect r15, android.widget.ImageView r16, X.C138146wb r17, java.lang.String r18, java.lang.String r19) {
        /*
            r14 = this;
            r0 = 0
            r8 = r18
            X.C18070vi.A0d(r8, r0)
            r13 = 1
            r6 = r16
            r9 = r19
            X.C18070vi.A0e(r9, r13, r6)
            java.lang.String r0 = "file:///"
            r4 = 0
            boolean r0 = X.C108955ca.A1Z(r0, r8)
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "file:/"
            boolean r0 = X.C108955ca.A1Z(r0, r8)
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "android.resource"
            boolean r0 = X.C108955ca.A1Z(r0, r8)
            if (r0 == 0) goto L_0x002f
            android.net.Uri r0 = android.net.Uri.parse(r8)
            r6.setImageURI(r0)
            return
        L_0x002f:
            java.lang.String r0 = "content"
            boolean r0 = X.C108955ca.A1Z(r0, r8)
            if (r0 == 0) goto L_0x00a4
            android.net.Uri r3 = android.net.Uri.parse(r8)
            X.00H r1 = r14.A03
            java.lang.Object r0 = r1.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            X.11B r0 = r0.A0O()
            if (r0 == 0) goto L_0x0054
            java.io.InputStream r2 = r0.A07(r3)
            if (r2 == 0) goto L_0x0054
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0056
        L_0x0054:
            r7 = r4
            goto L_0x0059
        L_0x0056:
            r2.close()
        L_0x0059:
            java.lang.Object r0 = r1.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            X.11B r0 = r0.A0O()
            if (r0 == 0) goto L_0x0078
            java.io.InputStream r2 = r0.A07(r3)
            if (r2 == 0) goto L_0x0078
            X.CxM r0 = new X.CxM     // Catch:{ all -> 0x0071 }
            r0.<init>((java.io.InputStream) r2)     // Catch:{ all -> 0x0071 }
            goto L_0x007a
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x0078:
            r4 = r7
            goto L_0x00a0
        L_0x007a:
            r2.close()
            int r1 = r0.A0Z(r13)
            r0 = 6
            if (r1 != r0) goto L_0x0078
            if (r7 == 0) goto L_0x00a0
            r0 = 1119092736(0x42b40000, float:90.0)
            r8 = 0
            android.graphics.Matrix r12 = X.C108945cZ.A0J()
            r12.postRotate(r0)
            int r10 = r7.getWidth()
            int r11 = r7.getHeight()
            r9 = r8
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r7, r8, r9, r10, r11, r12, r13)
            X.C18070vi.A0X(r4)
        L_0x00a0:
            r6.setImageBitmap(r4)
            return
        L_0x00a4:
            r1 = r17
            if (r17 == 0) goto L_0x00d7
            r0 = 2
            X.7Mw r7 = new X.7Mw
            r7.<init>(r1, r0)
        L_0x00ae:
            if (r15 == 0) goto L_0x00ce
            int r10 = r15.width()
            int r11 = r15.height()
        L_0x00b8:
            if (r10 <= 0) goto L_0x00d9
            if (r11 <= 0) goto L_0x00d9
            X.4VT r0 = A00(r14)
            X.4hx r3 = new X.4hx
            r5 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.A2k r1 = r0.A02
            boolean r0 = r0.A03
            r1.A03(r3, r0)
            return
        L_0x00ce:
            int r10 = r6.getWidth()
            int r11 = r6.getHeight()
            goto L_0x00b8
        L_0x00d7:
            r7 = r4
            goto L_0x00ae
        L_0x00d9:
            X.4VT r0 = A00(r14)
            int r10 = r0.A01
            X.4hx r3 = new X.4hx
            r5 = r4
            r11 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            X.A2k r1 = r0.A02
            boolean r0 = r0.A03
            r1.A03(r3, r0)
            return
        L_0x00ee:
            android.net.Uri r0 = android.net.Uri.parse(r8)
            java.lang.String r0 = r0.getPath()
            java.io.File r0 = X.C108945cZ.A17(r0)
            java.lang.String r0 = r0.getCanonicalPath()
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)
            r6.setImageBitmap(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74k.A01(android.graphics.Rect, android.widget.ImageView, X.6wb, java.lang.String, java.lang.String):void");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public static final AnonymousClass4VT A00(AnonymousClass74k r10) {
        AnonymousClass4VT r0 = r10.A00;
        if (r0 == null) {
            File A0e = C17880vN.A0e(C108945cZ.A16((AnonymousClass118) r10.A04.get()), "wabloks_images");
            C86284Ra r3 = new C86284Ra(C108945cZ.A0a(r10.A01), (AnonymousClass181) r10.A02.get(), (AnonymousClass1D9) r10.A05.get(), AnonymousClass3MX.A0x(r10.A06), A0e, "bk-image");
            r3.A05 = true;
            r3.A01 = 16777216;
            r3.A00 = Integer.MAX_VALUE;
            r0 = r3.A00();
            r10.A00 = r0;
        }
        C18070vi.A0z(r0, "null cannot be cast to non-null type com.whatsapp.thumbloader.SimpleThumbLoader");
        return r0;
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass4VT r0 = this.A00;
        if (r0 != null) {
            r0.A02.A04(false);
            this.A00 = null;
        }
    }

    public AnonymousClass74k(AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0d(r7, 6);
        this.A04 = r2;
        this.A01 = r3;
        this.A06 = r4;
        this.A02 = r5;
        this.A05 = r6;
        this.A03 = r7;
    }
}
