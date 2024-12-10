package X;

import android.net.Uri;
import com.whatsapp.mediacomposer.ImageComposerFragment;

/* renamed from: X.7HV  reason: invalid class name */
public class AnonymousClass7HV implements AnonymousClass891 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7HV(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public String Ba8() {
        StringBuilder sb;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                sb = C17890vO.A0f(((AnonymousClass8B2) this.A02).BLl());
                str = "-gallery_thumb";
                break;
            case 1:
                sb = AnonymousClass000.A10();
                sb.append(((AnonymousClass8B2) this.A01).BLl());
                str = "-selected_view";
                break;
            default:
                ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this.A02;
                Uri uri = imageComposerFragment.A01;
                if (uri == null || (str2 = uri.toString()) == null) {
                    str2 = "";
                }
                sb = AnonymousClass000.A11(str2);
                sb.append(':');
                sb.append(imageComposerFragment.A0B);
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r4 == 50) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00fb A[Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0102 A[Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0106 A[Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap BhZ() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x012e;
                case 1: goto L_0x0150;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r2 = "ImageComposerFragment/loadBitmap"
            r1 = 0
            java.lang.Object r5 = r15.A02     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            com.whatsapp.mediacomposer.ImageComposerFragment r5 = (com.whatsapp.mediacomposer.ImageComposerFragment) r5     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            android.content.Context r0 = r5.A1n()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x006e
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x006e
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x006e
            int r0 = r0.widthPixels     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x0024:
            android.content.Context r0 = r5.A1n()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x006c
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x006c
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x006c
            int r0 = r0.heightPixels     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x003c:
            X.6kj r6 = X.AnonymousClass7JF.A0j     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            java.lang.Object r7 = r15.A01     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            android.net.Uri r7 = (android.net.Uri) r7     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            X.0ve r8 = r5.A28()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            X.00H r0 = r5.A0a     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x0119
            java.lang.Object r9 = X.C18070vi.A0E(r0)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            X.1Nq r9 = (X.C25291Nq) r9     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            X.1Sl r11 = r5.A0U     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r11 == 0) goto L_0x0113
            boolean r14 = r5.A0B     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            X.00H r0 = r5.A2B()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            java.lang.Object r10 = X.C18070vi.A0E(r0)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            X.1Lc r10 = (X.C24641Lc) r10     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            android.graphics.Bitmap r8 = r6.A00(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.StickerComposerFragment     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x00f5
            r9 = r5
            com.whatsapp.mediacomposer.StickerComposerFragment r9 = (com.whatsapp.mediacomposer.StickerComposerFragment) r9     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            goto L_0x0070
        L_0x006c:
            r13 = r1
            goto L_0x003c
        L_0x006e:
            r12 = r1
            goto L_0x0024
        L_0x0070:
            X.8Ai r0 = r9.A29()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00f5
            int r4 = r0.BUd()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            X.00H r0 = r9.A02     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00dd
            r0.get()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            android.graphics.Bitmap r7 = X.C1403971g.A01(r8)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            r0 = 42
            if (r4 == r0) goto L_0x0092
            r0 = 44
            if (r4 == r0) goto L_0x0092
            r3 = 50
            r0 = 0
            if (r4 != r3) goto L_0x0093
        L_0x0092:
            r0 = 1
        L_0x0093:
            if (r0 == 0) goto L_0x00a1
            X.00H r0 = r9.A02     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00e3
            r0.get()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            android.graphics.Bitmap r8 = X.C1403971g.A00(r7)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            goto L_0x00b9
        L_0x00a1:
            X.00H r0 = r9.A02     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00d7
            java.lang.Object r0 = r0.get()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            X.71g r0 = (X.C1403971g) r0     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            android.graphics.Bitmap r0 = r0.A02(r7)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            r7.recycle()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            android.graphics.Bitmap r8 = X.C1403971g.A00(r0)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            r0.recycle()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
        L_0x00b9:
            android.net.Uri r6 = r9.A01     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            if (r6 == 0) goto L_0x00d1
            X.0vl r0 = r9.A05     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r4 = (com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel) r4     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            X.1OX r3 = X.C41561wd.A00(r4)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1 r0 = new com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            r0.<init>(r8, r6, r4, r1)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            X.AnonymousClass3MX.A1Q(r0, r3)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
        L_0x00d1:
            r7.recycle()     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            r9.A01 = r8     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            goto L_0x00f5
        L_0x00d7:
            java.lang.String r0 = "stickerMakerBitmapUtils"
            X.C18070vi.A11(r0)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00dd:
            java.lang.String r0 = "stickerMakerBitmapUtils"
            X.C18070vi.A11(r0)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
            goto L_0x00e8
        L_0x00e3:
            java.lang.String r0 = "stickerMakerBitmapUtils"
            X.C18070vi.A11(r0)     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
        L_0x00e8:
            throw r1     // Catch:{ OutOfMemoryError -> 0x00ed, Exception -> 0x00e9 }
        L_0x00e9:
            r3 = move-exception
            java.lang.String r0 = "StickerComposerFragment/onBitmapLoaded/exception"
            goto L_0x00f0
        L_0x00ed:
            r3 = move-exception
            java.lang.String r0 = "StickerComposerFragment/onBitmapLoaded/oom"
        L_0x00f0:
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            android.graphics.Bitmap r8 = X.AnonymousClass6YZ.A00     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x00f5:
            boolean r0 = r5.A2U()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            if (r0 == 0) goto L_0x0102
            android.graphics.Bitmap r4 = r5.A27(r8)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x00ff:
            X.740 r3 = r5.A05     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            goto L_0x0104
        L_0x0102:
            r4 = r1
            goto L_0x00ff
        L_0x0104:
            if (r3 == 0) goto L_0x0110
            r3.A06 = r8     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            r3.A02 = r4     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            r0 = 0
            r3.A0C = r0     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            r3.A07()     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x0110:
            r5.A00 = r4     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            return r8
        L_0x0113:
            java.lang.String r0 = "mediaFileUtils"
            X.C18070vi.A11(r0)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            throw r1     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x0119:
            java.lang.String r0 = "mediaUtils"
            X.C18070vi.A11(r0)     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
            throw r1     // Catch:{ OutOfMemoryError -> 0x0129, IOException -> 0x0124, 1iX -> 0x011f }
        L_0x011f:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            return r1
        L_0x0124:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            return r1
        L_0x0129:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)
            return r1
        L_0x012e:
            java.lang.Object r1 = r15.A01
            X.5nQ r1 = (X.C113645nQ) r1
            java.util.List r0 = X.C42011xT.A0I
            X.65m r1 = r1.A03
            java.lang.Object r0 = r1.getTag()
            if (r0 != r15) goto L_0x0170
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165735(0x7f070227, float:1.7945696E38)
            int r1 = r1.getDimensionPixelSize(r0)
            java.lang.Object r0 = r15.A02
            X.8B2 r0 = (X.AnonymousClass8B2) r0
            android.graphics.Bitmap r8 = r0.CP6(r1)
            goto L_0x016a
        L_0x0150:
            java.lang.Object r2 = r15.A02
            X.5nH r2 = (X.C113555nH) r2
            com.whatsapp.WaMediaThumbnailView r0 = r2.A03
            java.lang.Object r0 = r0.getTag()
            boolean r0 = X.C18070vi.A18(r0, r15)
            if (r0 == 0) goto L_0x0170
            java.lang.Object r1 = r15.A01
            X.8B2 r1 = (X.AnonymousClass8B2) r1
            int r0 = r2.A00
            android.graphics.Bitmap r8 = r1.CP6(r0)
        L_0x016a:
            if (r8 != 0) goto L_0x016f
            android.graphics.Bitmap r8 = X.AnonymousClass6YZ.A00
            return r8
        L_0x016f:
            return r8
        L_0x0170:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7HV.BhZ():android.graphics.Bitmap");
    }
}
