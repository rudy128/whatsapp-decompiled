package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C111225jD;
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

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImage$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {1268}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$shareSelectedImage$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Bitmap $imageBitmap;
    public final /* synthetic */ AnonymousClass1BI $it;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImage$1$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImage$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(bitmap, r5, r2, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
            X.CDX.A00(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
            X.CDX.A00(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
            if (r0.A06 != true) goto L_0x0018;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r6 = r21
                int r0 = r6.label
                if (r0 != 0) goto L_0x00ea
                X.C30691eM.A01(r22)
                X.5jD r0 = r5
                X.6jC r0 = X.C111225jD.A03(r0)
                r7 = 1
                r13 = 0
                if (r0 == 0) goto L_0x0018
                boolean r0 = r0.A06
                r9 = 1
                if (r0 == r7) goto L_0x0019
            L_0x0018:
                r9 = 0
            L_0x0019:
                X.5jD r0 = r5
                X.6jC r0 = X.C111225jD.A03(r0)
                if (r0 == 0) goto L_0x0090
                boolean r0 = r0.A05
                if (r0 != r7) goto L_0x0090
            L_0x0025:
                X.5jD r0 = r5
                X.1Pp r5 = r0.A0Z
                X.1i1 r4 = r0.A02
                r8 = 1
                X.1BI r2 = r5.A02
                if (r2 == 0) goto L_0x006e
                r5.A04 = r8
                r1 = 9
                int r0 = r5.A00
                r5.A04(r2, r1, r0, r8)
                int r0 = r5.A01
                X.1BI r3 = r5.A02
                if (r0 == r8) goto L_0x0085
                if (r3 == 0) goto L_0x004c
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 34
            L_0x0049:
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x004c:
                if (r9 == 0) goto L_0x005d
                X.1BI r3 = r5.A02
                if (r3 == 0) goto L_0x005d
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 29
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x005d:
                if (r7 == 0) goto L_0x006e
                X.1BI r3 = r5.A02
                if (r3 == 0) goto L_0x006e
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 26
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x006e:
                X.5jD r0 = r5
                android.graphics.Bitmap r5 = r3
                if (r5 == 0) goto L_0x00e7
                X.17r r1 = r0.A0V
                java.lang.String r0 = "tmpi"
                java.io.File r4 = r1.A0a(r0)
                java.io.FileOutputStream r3 = X.C108945cZ.A19(r4)
                java.io.ByteArrayOutputStream r2 = X.C108945cZ.A15()
                goto L_0x0092
            L_0x0085:
                if (r3 == 0) goto L_0x004c
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 31
                goto L_0x0049
            L_0x0090:
                r7 = 0
                goto L_0x0025
            L_0x0092:
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x00b1 }
                r0 = 100
                byte[] r0 = X.C108955ca.A1a(r1, r5, r2, r0)     // Catch:{ all -> 0x00b1 }
                r2.close()
                if (r0 == 0) goto L_0x00e7
                r3.write(r0)     // Catch:{ all -> 0x00aa }
                X.C26511Sk.A0R(r4)     // Catch:{ all -> 0x00aa }
                android.net.Uri r1 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x00aa }
                goto L_0x00b8
            L_0x00aa:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00ac }
            L_0x00ac:
                r0 = move-exception
                X.CDX.A00(r3, r1)
                throw r0
            L_0x00b1:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x00b3 }
            L_0x00b3:
                r0 = move-exception
                X.CDX.A00(r2, r1)
                throw r0
            L_0x00b8:
                r3.close()
                if (r1 == 0) goto L_0x00e7
                java.util.ArrayList r9 = X.AnonymousClass000.A13()
                X.1BI r0 = r2
                r9.add(r0)
                X.5jD r0 = r5
                X.1kd r0 = r0.A0X
                java.lang.Integer r5 = X.AnonymousClass3MW.A0v(r13)
                r2 = 0
                java.lang.String r7 = ""
                r4 = r2
                r6 = r2
                r8 = r2
                r10 = r2
                r11 = r2
                r12 = r2
                r15 = r13
                r16 = r13
                r17 = r13
                r18 = r13
                r19 = r13
                r20 = r13
                r3 = r2
                r14 = r13
                r0.A04(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            L_0x00e7:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x00ea:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImage$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$shareSelectedImage$1$1(Bitmap bitmap, C111225jD r3, AnonymousClass1BI r4, C30391dr r5) {
        super(2, r5);
        this.this$0 = r3;
        this.$imageBitmap = bitmap;
        this.$it = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AiImagineBottomSheetViewModel$shareSelectedImage$1$1(this.$imageBitmap, this.this$0, this.$it, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r5 = this.this$0;
            C18600wl r4 = r5.A0w;
            final Bitmap bitmap = this.$imageBitmap;
            final AnonymousClass1BI r2 = this.$it;
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
        return ((AiImagineBottomSheetViewModel$shareSelectedImage$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
