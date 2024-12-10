package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.graphics.Bitmap;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1", f = "StickerComposerViewModel.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class StickerComposerViewModel$processBitmap$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Bitmap $bitmap;
    public int label;
    public final /* synthetic */ StickerComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1$1", f = "StickerComposerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(bitmap, stickerComposerViewModel, r5);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            X.CDX.A00(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                if (r0 != 0) goto L_0x0056
                X.C30691eM.A01(r7)
                r4 = 0
                android.graphics.Bitmap r0 = r2     // Catch:{ Exception -> 0x0046 }
                java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0046 }
                java.lang.String r2 = X.C17970vW.A05(r0)     // Catch:{ Exception -> 0x0046 }
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r4     // Catch:{ Exception -> 0x0046 }
                X.17r r1 = r0.A05     // Catch:{ Exception -> 0x0046 }
                java.lang.String r0 = X.C108995ce.A0Z(r2)     // Catch:{ Exception -> 0x0046 }
                java.io.File r5 = r1.A0a(r0)     // Catch:{ Exception -> 0x0046 }
                java.io.FileOutputStream r3 = X.C108945cZ.A19(r5)     // Catch:{ Exception -> 0x0046 }
                android.graphics.Bitmap r2 = r2     // Catch:{ Exception -> 0x0046 }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x003f }
                r0 = 70
                r2.compress(r1, r0, r3)     // Catch:{ all -> 0x003f }
                r3.close()     // Catch:{ Exception -> 0x0046 }
                android.graphics.Bitmap r0 = r2     // Catch:{ Exception -> 0x0046 }
                r0.recycle()     // Catch:{ Exception -> 0x0046 }
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r4     // Catch:{ Exception -> 0x0046 }
                X.1DT r1 = r0.A02     // Catch:{ Exception -> 0x0046 }
                android.net.Uri r0 = android.net.Uri.fromFile(r5)     // Catch:{ Exception -> 0x0046 }
                r1.A0E(r0)     // Catch:{ Exception -> 0x0046 }
                goto L_0x0053
            L_0x003f:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0041 }
            L_0x0041:
                r0 = move-exception
                X.CDX.A00(r3, r1)     // Catch:{ Exception -> 0x0046 }
                throw r0     // Catch:{ Exception -> 0x0046 }
            L_0x0046:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/processBitmap/Exception"
                com.whatsapp.util.Log.e(r0, r1)
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r4
                X.1DT r0 = r0.A02
                r0.A0E(r4)
            L_0x0053:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0056:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$processBitmap$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerComposerViewModel$processBitmap$1(Bitmap bitmap, StickerComposerViewModel stickerComposerViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = stickerComposerViewModel;
        this.$bitmap = bitmap;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StickerComposerViewModel$processBitmap$1(this.$bitmap, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StickerComposerViewModel stickerComposerViewModel = this.this$0;
            C18600wl r3 = stickerComposerViewModel.A07;
            final Bitmap bitmap = this.$bitmap;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerComposerViewModel$processBitmap$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
