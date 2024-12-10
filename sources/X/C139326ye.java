package X;

import android.graphics.RectF;
import android.view.View;

/* renamed from: X.6ye  reason: invalid class name and case insensitive filesystem */
public final class C139326ye {
    public final AnonymousClass1T1 A00;
    public final C218617r A01;
    public final C18000vb A02;
    public final AnonymousClass1KW A03;
    public final C18030ve A04;
    public final AnonymousClass1T6 A05;
    public final C25291Nq A06;
    public final AnonymousClass1T5 A07;
    public final C18010vc A08;
    public final C26631Sw A09;

    public static final RectF A00(View view, View view2) {
        C18070vi.A0d(view2, 1);
        float A032 = C108945cZ.A03(view);
        float A042 = C108945cZ.A04(view);
        float A033 = C108945cZ.A03(view2);
        RectF A002 = AnonymousClass4aO.A00(view2);
        float centerX = A002.centerX();
        float centerY = ((A042 / 2.0f) - A002.centerY()) / A042;
        float f = (A033 + 2.0f) / A032;
        float f2 = 2.0f * (((A032 / 2.0f) - centerX) / A032);
        float f3 = 2.0f * centerY;
        float f4 = f3 - f;
        return new RectF(f2 - f, f3 + f, f2 + f, f4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0099, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009d, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00aa A[Catch:{ RuntimeException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0 A[Catch:{ RuntimeException -> 0x00b8 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A01(android.content.Context r16, android.view.View r17, android.view.View r18, float r19) {
        /*
            r15 = this;
            r13 = 0
            r6 = 1
            android.content.res.Resources r2 = r16.getResources()
            X.C18070vi.A0b(r2)
            X.C18070vi.A0d(r2, r13)
            android.util.DisplayMetrics r0 = r2.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 / r0
            r0 = 2131166858(0x7f07068a, float:1.7947973E38)
            float r0 = r2.getDimension(r0)
            float r0 = r0 * r1
            int r5 = (int) r0
            r0 = 2131166856(0x7f070688, float:1.794797E38)
            float r0 = r2.getDimension(r0)
            float r0 = r0 * r1
            int r3 = (int) r0
            r8 = 0
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ RuntimeException -> 0x00b8 }
            r7 = r17
            boolean r0 = r7.isLaidOut()     // Catch:{ RuntimeException -> 0x00b8 }
            if (r0 == 0) goto L_0x00b1
            int r1 = r7.getWidth()     // Catch:{ RuntimeException -> 0x00b8 }
            int r0 = r7.getHeight()     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r1, r0, r2)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.Canvas r2 = X.C108945cZ.A0I(r4)     // Catch:{ RuntimeException -> 0x00b8 }
            int r0 = r7.getScrollX()     // Catch:{ RuntimeException -> 0x00b8 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x00b8 }
            float r1 = -r0
            int r0 = r7.getScrollY()     // Catch:{ RuntimeException -> 0x00b8 }
            float r0 = (float) r0     // Catch:{ RuntimeException -> 0x00b8 }
            float r0 = -r0
            r2.translate(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            r7.draw(r2)     // Catch:{ RuntimeException -> 0x00b8 }
            if (r18 == 0) goto L_0x006f
            android.graphics.Canvas r2 = X.C108945cZ.A0I(r4)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.Paint r1 = X.C108945cZ.A0K(r6)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_OUT     // Catch:{ RuntimeException -> 0x00b8 }
            X.C108965cb.A11(r1, r0)     // Catch:{ RuntimeException -> 0x00b8 }
            r1.setColor(r13)     // Catch:{ RuntimeException -> 0x00b8 }
            android.graphics.RectF r0 = X.AnonymousClass4aO.A00(r18)     // Catch:{ RuntimeException -> 0x00b8 }
            r7 = r19
            r2.drawRoundRect(r0, r7, r7, r1)     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x006f:
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r4, r5, r3, r6)     // Catch:{ RuntimeException -> 0x00b8 }
            if (r4 == r3) goto L_0x0078
            r4.recycle()     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x0078:
            X.17r r9 = r15.A01     // Catch:{ RuntimeException -> 0x00b8 }
            X.0vc r10 = r15.A08     // Catch:{ RuntimeException -> 0x00b8 }
            X.1So r11 = X.C26551So.A0E     // Catch:{ RuntimeException -> 0x00b8 }
            r14 = 2
            java.lang.String r12 = ".png"
            java.io.File r4 = X.C26511Sk.A0G(r9, r10, r11, r12, r13, r14)     // Catch:{ RuntimeException -> 0x00b8 }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r4)     // Catch:{ FileNotFoundException -> 0x009e }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0097 }
            r0 = 100
            boolean r0 = r3.compress(r1, r0, r2)     // Catch:{ all -> 0x0097 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x009e }
            if (r0 == 0) goto L_0x00a4
            goto L_0x00a5
        L_0x0097:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x009e }
            throw r0     // Catch:{ FileNotFoundException -> 0x009e }
        L_0x009e:
            r1 = move-exception
            java.lang.String r0 = "Error writing output on file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x00a4:
            r4 = r8
        L_0x00a5:
            r3.recycle()     // Catch:{ RuntimeException -> 0x00b8 }
            if (r4 != 0) goto L_0x00b0
            java.lang.String r0 = "Error generating media"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00b8 }
            return r8
        L_0x00b0:
            return r4
        L_0x00b1:
            java.lang.String r0 = "View needs to be laid out before calling drawToBitmap()"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ RuntimeException -> 0x00b8 }
            throw r0     // Catch:{ RuntimeException -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139326ye.A01(android.content.Context, android.view.View, android.view.View, float):java.io.File");
    }

    public C139326ye(AnonymousClass1T1 r1, C218617r r2, C18000vb r3, AnonymousClass1KW r4, C18030ve r5, AnonymousClass1T6 r6, C25291Nq r7, AnonymousClass1T5 r8, C18010vc r9, C26631Sw r10) {
        C18070vi.A0w(r2, r9, r5, r3, r4);
        C18070vi.A0x(r10, r7, r1, r6, r8);
        this.A01 = r2;
        this.A08 = r9;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
        this.A09 = r10;
        this.A06 = r7;
        this.A00 = r1;
        this.A05 = r6;
        this.A07 = r8;
    }
}
