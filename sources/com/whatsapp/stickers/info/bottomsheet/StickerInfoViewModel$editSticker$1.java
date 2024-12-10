package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass1OS;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$editSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $origin;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$editSticker$1(C1418377d r2, StickerInfoViewModel stickerInfoViewModel, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = stickerInfoViewModel;
        this.$sticker = r2;
        this.$origin = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerInfoViewModel$editSticker$1(this.$sticker, this.this$0, r6, this.$origin);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            if (r0 != 0) goto L_0x00c4
            X.C30691eM.A01(r8)
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r3 = r7.this$0
            X.77d r5 = r7.$sticker
            java.lang.String r0 = r5.A0B
            if (r0 == 0) goto L_0x00a3
            java.io.File r6 = X.C108945cZ.A17(r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x00a3
            boolean r0 = r5.A02()
            r4 = 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0043
            X.00H r0 = r3.A0F
            java.lang.Object r2 = r0.get()
            X.72L r2 = (X.AnonymousClass72L) r2
            java.lang.String r1 = r5.A0F
            X.6L1 r0 = r2.A02     // Catch:{ OutOfMemoryError -> 0x003c }
            X.1tf r0 = r0.A0A(r6, r1)     // Catch:{ OutOfMemoryError -> 0x003c }
            if (r0 == 0) goto L_0x00a3
            X.1rd r0 = r2.A03(r0)     // Catch:{ OutOfMemoryError -> 0x003c }
            android.graphics.Bitmap r4 = X.AnonymousClass72L.A00(r0, r4, r4)     // Catch:{ OutOfMemoryError -> 0x003c }
            goto L_0x0064
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "LottieUtils/getThumbnailBitmap OOM getting thumbnail bitmap"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x00a3
        L_0x0043:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r6.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = "-webp-sticker"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r1 = X.C17970vW.A05(r0)
            X.00H r0 = r3.A0M
            java.lang.Object r0 = r0.get()
            X.1Su r0 = (X.C26611Su) r0
            android.graphics.Bitmap r4 = r0.A06(r6, r1, r4, r4)
        L_0x0064:
            if (r4 == 0) goto L_0x00a3
            java.lang.String r0 = r5.A0F
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = X.C17970vW.A05(r0)
            X.00H r0 = r3.A0E     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            java.lang.Object r1 = r0.get()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            X.17r r1 = (X.C218617r) r1     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            java.lang.String r0 = X.C108995ce.A0Z(r2)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            java.io.File r3 = r1.A0a(r0)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r3)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0092 }
            r0 = 70
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x0092 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            r4.recycle()     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            goto L_0x00ad
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
            throw r0     // Catch:{ FileNotFoundException -> 0x009d, IOException -> 0x0099 }
        L_0x0099:
            r1 = move-exception
            java.lang.String r0 = "StickerInfoViewModel/getBitmapFile/IOException/error"
            goto L_0x00a0
        L_0x009d:
            r1 = move-exception
            java.lang.String r0 = "StickerInfoViewModel/getBitmapFile/resultFile/error"
        L_0x00a0:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a3:
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r7.this$0
            X.1wy r1 = r0.A08
            X.6HS r0 = X.AnonymousClass6HS.A00
            r1.A0E(r0)
            goto L_0x00c1
        L_0x00ad:
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            if (r3 == 0) goto L_0x00a3
            com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel r0 = r7.this$0
            X.1wy r2 = r0.A08
            int r1 = r7.$origin
            X.6HR r0 = new X.6HR
            r0.<init>(r3, r1)
            r2.A0E(r0)
        L_0x00c1:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00c4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$editSticker$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$editSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
