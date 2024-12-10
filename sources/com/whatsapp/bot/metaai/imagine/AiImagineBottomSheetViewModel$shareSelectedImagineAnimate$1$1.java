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
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {1322}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $it;
    public final /* synthetic */ File $videoFile;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r3, file, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
            if (r0.A06 != true) goto L_0x0016;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                int r0 = r11.label
                if (r0 != 0) goto L_0x00b3
                X.C30691eM.A01(r12)
                X.5jD r0 = X.C111225jD.this
                X.6jC r0 = X.C111225jD.A03(r0)
                r7 = 0
                r10 = 1
                if (r0 == 0) goto L_0x0016
                boolean r0 = r0.A06
                r6 = 1
                if (r0 == r10) goto L_0x0017
            L_0x0016:
                r6 = 0
            L_0x0017:
                X.5jD r0 = X.C111225jD.this
                X.6jC r0 = X.C111225jD.A03(r0)
                if (r0 == 0) goto L_0x0024
                boolean r0 = r0.A05
                if (r0 != r10) goto L_0x0024
                r7 = 1
            L_0x0024:
                X.5jD r0 = X.C111225jD.this
                X.1Pp r5 = r0.A0Z
                X.1i1 r4 = r0.A02
                r8 = 0
                X.1BI r2 = r5.A02
                if (r2 == 0) goto L_0x008d
                r5.A04 = r10
                r1 = 9
                int r0 = r5.A00
                r5.A04(r2, r1, r0, r10)
                int r0 = r5.A01
                X.1BI r3 = r5.A02
                if (r0 == r10) goto L_0x00a8
                if (r3 == 0) goto L_0x004b
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 34
            L_0x0048:
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x004b:
                if (r6 == 0) goto L_0x005c
                X.1BI r3 = r5.A02
                if (r3 == 0) goto L_0x005c
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 29
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x005c:
                if (r7 == 0) goto L_0x006d
                X.1BI r3 = r5.A02
                if (r3 == 0) goto L_0x006d
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 26
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x006d:
                X.1BI r3 = r5.A02
                if (r3 == 0) goto L_0x007c
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 30
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x007c:
                if (r7 == 0) goto L_0x008d
                X.1BI r3 = r5.A02
                if (r3 == 0) goto L_0x008d
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 38
                X.C108965cb.A1K(r1, r4, r3, r2, r0)
            L_0x008d:
                java.util.ArrayList r7 = X.AnonymousClass000.A13()
                X.1BI r0 = r3
                r7.add(r0)
                X.5jD r0 = X.C111225jD.this
                X.1kd r0 = r0.A0X
                java.io.File r5 = r2
                r1 = 0
                r3 = r1
                r4 = r1
                r6 = r1
                r2 = r1
                r9 = r8
                r0.A0A(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x00a8:
                if (r3 == 0) goto L_0x004b
                android.content.SharedPreferences r2 = X.C32951i1.A00(r4)
                X.10s r1 = r4.A0T
                r0 = 31
                goto L_0x0048
            L_0x00b3:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1(C111225jD r2, AnonymousClass1BI r3, File file, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$it = r3;
        this.$videoFile = file;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1(this.this$0, this.$it, this.$videoFile, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r5 = this.this$0;
            C18600wl r4 = r5.A0w;
            final AnonymousClass1BI r3 = this.$it;
            final File file = this.$videoFile;
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
        return ((AiImagineBottomSheetViewModel$shareSelectedImagineAnimate$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
