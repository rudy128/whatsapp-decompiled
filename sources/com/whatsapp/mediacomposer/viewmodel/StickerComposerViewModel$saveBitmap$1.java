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
import android.net.Uri;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1", f = "StickerComposerViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class StickerComposerViewModel$saveBitmap$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Bitmap $bitmap;
    public final /* synthetic */ Uri $url;
    public int label;
    public final /* synthetic */ StickerComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1$1", f = "StickerComposerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(bitmap, uri, stickerComposerViewModel, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            X.CDX.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                if (r0 != 0) goto L_0x005f
                X.C30691eM.A01(r6)
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r5     // Catch:{ Exception -> 0x0056 }
                X.00H r0 = r0.A06     // Catch:{ Exception -> 0x0056 }
                java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0056 }
                X.6ct r1 = (X.C126536ct) r1     // Catch:{ Exception -> 0x0056 }
                android.graphics.Bitmap r4 = r3     // Catch:{ Exception -> 0x0056 }
                android.net.Uri r0 = r2     // Catch:{ Exception -> 0x0056 }
                X.C18070vi.A0h(r4, r0)     // Catch:{ Exception -> 0x0056 }
                X.17r r2 = r1.A00     // Catch:{ Exception -> 0x0056 }
                java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0056 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0056 }
                java.lang.String r0 = X.C17970vW.A05(r0)     // Catch:{ Exception -> 0x0056 }
                r1.append(r0)     // Catch:{ Exception -> 0x0056 }
                java.lang.String r0 = "-sticker.png"
                java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0056 }
                java.io.File r3 = r2.A0a(r0)     // Catch:{ Exception -> 0x0056 }
                java.io.FileOutputStream r2 = X.C108945cZ.A19(r3)     // Catch:{ Exception -> 0x0056 }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x004f }
                r0 = 70
                r4.compress(r1, r0, r2)     // Catch:{ all -> 0x004f }
                r2.close()     // Catch:{ Exception -> 0x0056 }
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r0 = r5     // Catch:{ Exception -> 0x0056 }
                X.1DT r1 = r0.A03     // Catch:{ Exception -> 0x0056 }
                android.net.Uri r0 = r2     // Catch:{ Exception -> 0x0056 }
                X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r3)     // Catch:{ Exception -> 0x0056 }
                r1.A0E(r0)     // Catch:{ Exception -> 0x0056 }
                goto L_0x005c
            L_0x004f:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0051 }
            L_0x0051:
                r0 = move-exception
                X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0056 }
                throw r0     // Catch:{ Exception -> 0x0056 }
            L_0x0056:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/saveBitmap/Exception"
                com.whatsapp.util.Log.e(r0, r1)
            L_0x005c:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x005f:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$saveBitmap$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerComposerViewModel$saveBitmap$1(Bitmap bitmap, Uri uri, StickerComposerViewModel stickerComposerViewModel, C30391dr r5) {
        super(2, r5);
        this.this$0 = stickerComposerViewModel;
        this.$bitmap = bitmap;
        this.$url = uri;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerComposerViewModel$saveBitmap$1(this.$bitmap, this.$url, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StickerComposerViewModel stickerComposerViewModel = this.this$0;
            C18600wl r4 = stickerComposerViewModel.A07;
            final Bitmap bitmap = this.$bitmap;
            final Uri uri = this.$url;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerComposerViewModel$saveBitmap$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
