package com.facebook.avatar.autogen.presenter;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.DAS;
import android.graphics.Rect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1", f = "AECapturePresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AECapturePresenter$saveImage$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Rect $cropRect;
    public final /* synthetic */ byte[] $data;
    public final /* synthetic */ int $frameHeight;
    public final /* synthetic */ int $frameWidth;
    public final /* synthetic */ int $rotation;
    public int label;
    public final /* synthetic */ DAS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AECapturePresenter$saveImage$1(Rect rect, DAS das, C30391dr r4, byte[] bArr, int i, int i2, int i3) {
        super(2, r4);
        this.this$0 = das;
        this.$data = bArr;
        this.$frameWidth = i;
        this.$frameHeight = i2;
        this.$cropRect = rect;
        this.$rotation = i3;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        return new AECapturePresenter$saveImage$1(this.$cropRect, this.this$0, r10, this.$data, this.$frameWidth, this.$frameHeight, this.$rotation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r2 = "AECapturePresenter"
            int r0 = r15.label
            if (r0 != 0) goto L_0x011a
            X.C30691eM.A01(r16)
            X.DAS r0 = r15.this$0
            X.D3v r0 = r0.A03
            java.lang.String r0 = r0.A02
            byte[] r7 = r15.$data
            int r9 = r15.$frameWidth
            int r10 = r15.$frameHeight
            r11 = 0
            r8 = 17
            android.graphics.YuvImage r6 = new android.graphics.YuvImage
            r6.<init>(r7, r8, r9, r10, r11)
            java.io.ByteArrayOutputStream r5 = X.C108945cZ.A15()
            int r3 = r15.$frameWidth
            int r1 = r15.$frameHeight
            int r1 = java.lang.Math.min(r3, r1)
            r7 = 1137180672(0x43c80000, float:400.0)
            float r1 = (float) r1
            float r7 = r7 / r1
            android.graphics.Rect r1 = r15.$cropRect     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            r4 = 100
            r6.compressToJpeg(r1, r4, r5)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            byte[] r6 = r5.toByteArray()     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            X.C18070vi.A0X(r6)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            android.graphics.Matrix r13 = X.C108945cZ.A0J()     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            X.DAS r1 = r15.this$0     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            X.D3v r1 = r1.A03     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            java.lang.Boolean r1 = r1.A01     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            java.lang.Boolean r3 = X.AnonymousClass000.A0i()     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            boolean r1 = X.C18070vi.A18(r1, r3)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            if (r1 == 0) goto L_0x0056
            r5 = 1065353216(0x3f800000, float:1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.preScale(r5, r1)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
        L_0x0056:
            int r1 = r15.$rotation     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            float r1 = (float) r1     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            r13.postRotate(r1)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            r13.postScale(r7, r7)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            int r1 = r6.length     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            r9 = 0
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeByteArray(r6, r9, r1)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            android.graphics.Rect r1 = r15.$cropRect     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            int r11 = r1.width()     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            android.graphics.Rect r1 = r15.$cropRect     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            int r12 = r1.height()     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            r14 = 1
            r10 = r9
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            X.C18070vi.A0X(r6)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            java.io.FileOutputStream r5 = X.C108945cZ.A19(r0)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            X.DAS r1 = r15.this$0     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00e1 }
            r6.compress(r0, r4, r5)     // Catch:{ all -> 0x00e1 }
            X.CkI r7 = r1.A04     // Catch:{ all -> 0x00e1 }
            java.util.HashMap r6 = X.C17880vN.A11()     // Catch:{ all -> 0x00e1 }
            X.D3v r8 = r7.A06     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00ba
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x00e1 }
            java.net.URI r4 = r0.toURI()     // Catch:{ all -> 0x00e1 }
            if (r4 == 0) goto L_0x00ba
            X.A3z r1 = X.C20030A3z.A01     // Catch:{ all -> 0x00e1 }
            X.D8H r0 = new X.D8H     // Catch:{ all -> 0x00e1 }
            r0.<init>(r4)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = X.C20030A3z.A00(r0, r1)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00b1
            java.net.URI r4 = new java.net.URI     // Catch:{ all -> 0x00e1 }
            r4.<init>(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00b1:
            java.lang.String r1 = X.C18070vi.A0H(r4)     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = "selfie_photo"
            r6.put(r0, r1)     // Catch:{ all -> 0x00e1 }
        L_0x00ba:
            X.EDL r0 = r7.A02     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00c1
            r0.pause()     // Catch:{ all -> 0x00e1 }
        L_0x00c1:
            java.lang.Boolean r0 = r8.A00     // Catch:{ all -> 0x00e1 }
            boolean r0 = X.C18070vi.A18(r0, r3)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00cc
            r3 = 0
            goto L_0x00ce
        L_0x00cc:
            r3 = 800(0x320, double:3.953E-321)
        L_0x00ce:
            java.lang.String r0 = "onSuccessTimer"
            java.util.Timer r1 = new java.util.Timer     // Catch:{ all -> 0x00e1 }
            r1.<init>(r0, r9)     // Catch:{ all -> 0x00e1 }
            X.Dc3 r0 = new X.Dc3     // Catch:{ all -> 0x00e1 }
            r0.<init>(r7, r6)     // Catch:{ all -> 0x00e1 }
            r1.schedule(r0, r3)     // Catch:{ all -> 0x00e1 }
            r5.close()     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            goto L_0x0114
        L_0x00e1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
            throw r0     // Catch:{ IOException -> 0x00e8, IllegalArgumentException -> 0x00f5 }
        L_0x00e8:
            r1 = move-exception
            java.lang.String r0 = "Failed to save image to file"
            X.C26294Cx6.A09(r2, r0, r1)
            X.DAS r0 = r15.this$0
            X.CkI r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0101
        L_0x00f5:
            r1 = move-exception
            java.lang.String r0 = "Failed to create image from frame"
            X.C26294Cx6.A09(r2, r0, r1)
            X.DAS r0 = r15.this$0
            X.CkI r1 = r0.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x0101:
            X.COL r1 = r1.A07
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0117
            java.lang.String r3 = "image_creation_failed"
        L_0x010b:
            X.DOZ r2 = r1.A00
            X.DFL r1 = r1.A01
            r0 = 36
            X.CCY.A00(r2, r1, r3, r0)
        L_0x0114:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0117:
            java.lang.String r3 = "save_image_failed"
            goto L_0x010b
        L_0x011a:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.autogen.presenter.AECapturePresenter$saveImage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AECapturePresenter$saveImage$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
