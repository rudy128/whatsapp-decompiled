package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C121056Hl;
import X.C122606Ra;
import X.C131016kN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122606Ra $origin;
    public final /* synthetic */ int $quantity;
    public int label;
    public final /* synthetic */ C131016kN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1(C122606Ra r2, C131016kN r3, C30391dr r4, int i) {
        super(2, r4);
        this.this$0 = r3;
        this.$origin = r2;
        this.$quantity = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1(this.$origin, this.this$0, r6, this.$quantity);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G3 r3 = this.this$0.A00;
            C121056Hl r0 = new C121056Hl(this.$origin, this.$quantity);
            this.label = 1;
            if (r3.BJt(r0, this) == r5) {
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
        return ((RecentStickerFlowImpl$stickerCallbackFlow$1$stickerObserver$1$onStickerMoveToTop$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
