package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass6TC;
import X.AnonymousClass6TE;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$observerSearchProvider$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {240, 242}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$observerSearchProvider$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$observerSearchProvider$2(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        StickerExpressionsViewModel$observerSearchProvider$2 stickerExpressionsViewModel$observerSearchProvider$2 = new StickerExpressionsViewModel$observerSearchProvider$2(this.this$0, r4);
        stickerExpressionsViewModel$observerSearchProvider$2.L$0 = obj;
        return stickerExpressionsViewModel$observerSearchProvider$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1D6 r1 = (AnonymousClass1D6) this.L$0;
            AnonymousClass6TC r3 = (AnonymousClass6TC) r1.first;
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            if (stickerExpressionsViewModel.A08) {
                this.label = 1;
                if (StickerExpressionsViewModel.A05(r3, stickerExpressionsViewModel, (String) r1.second, this) == r6) {
                    return r6;
                }
                return C27621Wu.A00;
            }
            AnonymousClass1G4 r12 = stickerExpressionsViewModel.A0l;
            AnonymousClass6TE A04 = StickerExpressionsViewModel.A04(r3, stickerExpressionsViewModel);
            this.label = 2;
            if (r12.BJt(A04, this) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
            return C27621Wu.A00;
        } else if (i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A0f.BFN(C27621Wu.A00);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$observerSearchProvider$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
