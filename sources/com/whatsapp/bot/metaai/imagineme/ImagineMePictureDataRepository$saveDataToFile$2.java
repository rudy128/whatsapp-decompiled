package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMePictureDataRepository$saveDataToFile$2", f = "ImagineMePictureDataRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMePictureDataRepository$saveDataToFile$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ byte[] $data;
    public int label;
    public final /* synthetic */ ImagineMePictureDataRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMePictureDataRepository$saveDataToFile$2(ImagineMePictureDataRepository imagineMePictureDataRepository, C30391dr r3, byte[] bArr) {
        super(2, r3);
        this.$data = bArr;
        this.this$0 = imagineMePictureDataRepository;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ImagineMePictureDataRepository$saveDataToFile$2(this.this$0, r5, this.$data);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.1IU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.1IU} */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ec, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00dc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e0 A[Catch:{ all -> 0x00ec }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            if (r0 != 0) goto L_0x0115
            X.C30691eM.A01(r12)
            byte[] r6 = r11.$data
            r2 = 0
            X.C18070vi.A0d(r6, r2)
            java.lang.String r0 = "ImagineMeSelfieProcessor/scaleDown start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r0 = 1
            r1.inJustDecodeBounds = r0
            int r0 = r6.length
            android.graphics.BitmapFactory.decodeByteArray(r6, r2, r0, r1)
            int r5 = r1.outWidth
            int r4 = r1.outHeight
            r3 = 0
            java.lang.String r2 = ", "
            r0 = 1080(0x438, float:1.513E-42)
            if (r5 <= r0) goto L_0x00b0
            if (r4 <= r0) goto L_0x00b0
            int r0 = java.lang.Math.min(r5, r4)
            float r1 = (float) r0
            r0 = 1149698048(0x44870000, float:1080.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            float r7 = (float) r0
            float r0 = (float) r5
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r8 = (float) r0
            int r8 = (int) r8
            float r0 = (float) r4
            float r0 = r0 / r7
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            float r9 = (float) r0
            int r9 = (int) r9
            int r1 = 1080 - r8
            int r0 = r5 + -1080
            r10 = 41
            if (r1 >= r0) goto L_0x0098
            int r1 = 1080 - r9
            int r0 = r4 + -1080
            if (r1 >= r0) goto L_0x0098
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMeSelfieProcessor/scaleDown scaling down by factor "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " to get dimensions ("
            X.AnonymousClass000.A1E(r0, r2, r1, r8)
            r1.append(r9)
            java.lang.String r0 = X.C17890vO.A0c(r1, r10)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.25O r0 = new X.25O
            r0.<init>(r8, r9)
            X.25P r0 = X.AnonymousClass204.A0C(r0, r6)
            android.graphics.Bitmap r0 = r0.A02
            if (r0 != 0) goto L_0x0093
            java.lang.String r0 = "ImagineMeSelfieProcessor/scaleDown scaledDownBitmap was null, returning original data"
        L_0x0083:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r6, r3)
        L_0x008a:
            java.lang.Object r1 = r0.first
            byte[] r1 = (byte[]) r1
            java.lang.Object r4 = r0.second
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            goto L_0x00c6
        L_0x0093:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r3, r0)
            goto L_0x008a
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMeSelfieProcessor/scaleDown distance of ("
            X.AnonymousClass000.A1E(r0, r2, r1, r8)
            r1.append(r9)
            java.lang.String r0 = ") to 1080 is greater than ("
            X.AnonymousClass000.A1E(r0, r2, r1, r5)
            r1.append(r4)
            r1.append(r10)
            goto L_0x00c1
        L_0x00b0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMeSelfieProcessor/scaleDown one of ("
            X.AnonymousClass000.A1E(r0, r2, r1, r5)
            r1.append(r4)
            java.lang.String r0 = ") is at most 1080, returning original data"
            r1.append(r0)
        L_0x00c1:
            java.lang.String r0 = r1.toString()
            goto L_0x0083
        L_0x00c6:
            com.whatsapp.bot.metaai.imagineme.ImagineMePictureDataRepository r0 = r11.this$0     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            X.17r r5 = r0.A00     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            X.0vc r6 = r0.A02     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            java.lang.String r8 = ".jpeg"
            X.1So r7 = X.C26551So.A0E     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            r9 = 0
            r10 = 4
            java.io.File r3 = X.C26511Sk.A0G(r5, r6, r7, r8, r9, r10)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r3)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            if (r1 == 0) goto L_0x00e0
            r2.write(r1)     // Catch:{ all -> 0x00ea }
            goto L_0x00f1
        L_0x00e0:
            if (r4 == 0) goto L_0x00f1
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00ea }
            r0 = 100
            r4.compress(r1, r0, r2)     // Catch:{ all -> 0x00ea }
            goto L_0x00f1
        L_0x00ea:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ec }
        L_0x00ec:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            throw r0     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
        L_0x00f1:
            r2.close()     // Catch:{ FileNotFoundException -> 0x00f5, IOException -> 0x00fd }
            goto L_0x010f
        L_0x00f5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMePictureDataRepository/ File not found: "
            goto L_0x0104
        L_0x00fd:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ImagineMePictureDataRepository/ Error accessing file: "
        L_0x0104:
            java.lang.String r0 = X.C17900vP.A0C(r0, r1, r2)
            com.whatsapp.util.Log.e(r0, r2)
            X.1IU r3 = X.C108945cZ.A1J(r2)
        L_0x010f:
            X.1eK r0 = new X.1eK
            r0.<init>(r3)
            return r0
        L_0x0115:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagineme.ImagineMePictureDataRepository$saveDataToFile$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImagineMePictureDataRepository$saveDataToFile$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
