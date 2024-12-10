package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$runProgress$1", f = "StickerComposerViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class StickerComposerViewModel$runProgress$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerComposerViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$runProgress$1$1", f = "StickerComposerViewModel.kt", i = {}, l = {108, 111}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$runProgress$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0021 A[Catch:{ Exception -> 0x0050 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004d A[Catch:{ Exception -> 0x0050 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r8.label
                r5 = 95
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L_0x0014
                if (r0 == r3) goto L_0x0032
                if (r0 != r4) goto L_0x000f
                goto L_0x0018
            L_0x000f:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            L_0x0014:
                X.C30691eM.A01(r9)
                goto L_0x001b
            L_0x0018:
                X.C30691eM.A01(r9)     // Catch:{ Exception -> 0x0050 }
            L_0x001b:
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r7 = com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel.this     // Catch:{ Exception -> 0x0050 }
                int r0 = r7.A00     // Catch:{ Exception -> 0x0050 }
                if (r0 >= r5) goto L_0x0056
                X.0wl r2 = r7.A08     // Catch:{ Exception -> 0x0050 }
                r1 = 0
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$runProgress$1$1$1 r0 = new com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$runProgress$1$1$1     // Catch:{ Exception -> 0x0050 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0050 }
                r8.label = r3     // Catch:{ Exception -> 0x0050 }
                java.lang.Object r0 = X.C30451dy.A00(r8, r2, r0)     // Catch:{ Exception -> 0x0050 }
                if (r0 != r6) goto L_0x0035
                goto L_0x004e
            L_0x0032:
                X.C30691eM.A01(r9)     // Catch:{ Exception -> 0x0050 }
            L_0x0035:
                com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel r1 = com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel.this     // Catch:{ Exception -> 0x0050 }
                int r0 = r1.A00     // Catch:{ Exception -> 0x0050 }
                int r0 = r0 + 5
                r1.A00 = r0     // Catch:{ Exception -> 0x0050 }
                int r0 = java.lang.Math.min(r0, r5)     // Catch:{ Exception -> 0x0050 }
                r1.A00 = r0     // Catch:{ Exception -> 0x0050 }
                r8.label = r4     // Catch:{ Exception -> 0x0050 }
                r0 = 500(0x1f4, double:2.47E-321)
                java.lang.Object r0 = X.C62882s9.A00(r8, r0)     // Catch:{ Exception -> 0x0050 }
                if (r0 != r6) goto L_0x001b
                goto L_0x004f
            L_0x004e:
                return r6
            L_0x004f:
                return r6
            L_0x0050:
                r1 = move-exception
                java.lang.String r0 = "StickerComposerViewModel/runProgress/cancelled"
                com.whatsapp.util.Log.e(r0, r1)
            L_0x0056:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.viewmodel.StickerComposerViewModel$runProgress$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerComposerViewModel$runProgress$1(StickerComposerViewModel stickerComposerViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerComposerViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerComposerViewModel$runProgress$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerComposerViewModel$runProgress$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final StickerComposerViewModel stickerComposerViewModel = this.this$0;
            C18600wl r2 = stickerComposerViewModel.A07;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
