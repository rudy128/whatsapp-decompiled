package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C117165zK;
import X.C137836w6;
import X.C139806zT;
import X.C1409773u;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$onShapeSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {1094}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onShapeSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C139806zT $shape;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onShapeSelected$1(Context context, StickerExpressionsViewModel stickerExpressionsViewModel, C139806zT r4, C30391dr r5) {
        super(2, r5);
        this.$shape = r4;
        this.$context = context;
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerExpressionsViewModel$onShapeSelected$1(this.$context, this.this$0, this.$shape, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C1409773u BHq = this.$shape.A00.BHq(this.$context, this.this$0.A0B, false);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            AnonymousClass1G3 r2 = stickerExpressionsViewModel.A0j;
            C117165zK r0 = new C117165zK(C137836w6.A00(stickerExpressionsViewModel.A0L), BHq);
            this.label = 1;
            if (r2.BJt(r0, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$onShapeSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
