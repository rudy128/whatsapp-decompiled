package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C117095zD;
import X.C137836w6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$exitStickerMultiSelectMode$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {1211}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$exitStickerMultiSelectMode$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$exitStickerMultiSelectMode$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerExpressionsViewModel$exitStickerMultiSelectMode$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$exitStickerMultiSelectMode$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            AnonymousClass1G3 r2 = stickerExpressionsViewModel.A0j;
            C117095zD r0 = new C117095zD(C137836w6.A00(stickerExpressionsViewModel.A0L));
            this.label = 1;
            if (r2.BJt(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
