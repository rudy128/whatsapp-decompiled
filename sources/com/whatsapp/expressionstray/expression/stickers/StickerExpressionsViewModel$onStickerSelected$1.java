package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C108945cZ;
import X.C117215zP;
import X.C137836w6;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$onStickerSelected$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {1191}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onStickerSelected$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $position;
    public final /* synthetic */ C1418377d $sticker;
    public final /* synthetic */ Integer $stickerSendOrigin;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onStickerSelected$1(StickerExpressionsViewModel stickerExpressionsViewModel, C1418377d r3, Integer num, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = stickerExpressionsViewModel;
        this.$sticker = r3;
        this.$stickerSendOrigin = num;
        this.$position = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new StickerExpressionsViewModel$onStickerSelected$1(this.this$0, this.$sticker, this.$stickerSendOrigin, r8, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            AnonymousClass1G3 r1 = stickerExpressionsViewModel.A0j;
            C117215zP r4 = new C117215zP(C137836w6.A00(stickerExpressionsViewModel.A0L), this.$sticker, this.$stickerSendOrigin, this.$position, false);
            this.label = 1;
            if (r1.BJt(r4, this) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C108945cZ.A0e(this.this$0.A0M).A03(AnonymousClass3MW.A0v(32), 1, 10);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$onStickerSelected$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
