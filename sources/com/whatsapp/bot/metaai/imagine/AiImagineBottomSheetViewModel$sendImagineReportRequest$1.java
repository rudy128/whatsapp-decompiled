package com.whatsapp.bot.metaai.imagine;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6YX;
import X.AnonymousClass7I7;
import X.C108975cc;
import X.C111225jD;
import X.C127226e0;
import X.C131206ki;
import X.C134626qt;
import X.C144587Hw;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C35021lW;
import X.C71053Dp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$sendImagineReportRequest$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {600}, m = "invokeSuspend", n = {}, s = {})
public final class AiImagineBottomSheetViewModel$sendImagineReportRequest$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $imageSource;
    public int label;
    public final /* synthetic */ C111225jD this$0;

    @DebugMetadata(c = "com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$sendImagineReportRequest$1$1", f = "AiImagineBottomSheetViewModel.kt", i = {}, l = {601}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.metaai.imagine.AiImagineBottomSheetViewModel$sendImagineReportRequest$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(str, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C35021lW r3;
            C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                C111225jD r0 = C111225jD.this;
                C127226e0 r6 = r0.A0f;
                C134626qt r5 = new C134626qt(r0.A0D, str);
                this.label = 1;
                C71053Dp A0k = C108975cc.A0k(this);
                if (r5.A01) {
                    r3 = C35021lW.A05;
                } else {
                    r3 = AnonymousClass6YX.A00;
                }
                obj = AnonymousClass7I7.A01(C131206ki.A00(r3, r6.A01, new C144587Hw(r6, r5, 4)), A0k, 5);
                if (obj == r7) {
                    return r7;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiImagineBottomSheetViewModel$sendImagineReportRequest$1(C111225jD r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$imageSource = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiImagineBottomSheetViewModel$sendImagineReportRequest$1(this.this$0, this.$imageSource, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C111225jD r4 = this.this$0;
            C18600wl r3 = r4.A0w;
            final String str = this.$imageSource;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r3, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (Exception unused) {
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiImagineBottomSheetViewModel$sendImagineReportRequest$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
