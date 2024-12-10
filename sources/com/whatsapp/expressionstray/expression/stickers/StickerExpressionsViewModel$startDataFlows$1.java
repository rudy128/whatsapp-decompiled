package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MX;
import X.C123126Tf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41561wd;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$startDataFlows$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$startDataFlows$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$startDataFlows$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        StickerExpressionsViewModel$startDataFlows$1 stickerExpressionsViewModel$startDataFlows$1 = new StickerExpressionsViewModel$startDataFlows$1(this.this$0, r4);
        stickerExpressionsViewModel$startDataFlows$1.L$0 = obj;
        return stickerExpressionsViewModel$startDataFlows$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            AnonymousClass3MX.A1Q(new StickerExpressionsViewModel$handleAvatarEvent$1(stickerExpressionsViewModel, (C123126Tf) this.L$0, (C30391dr) null), C41561wd.A00(stickerExpressionsViewModel));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$startDataFlows$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
