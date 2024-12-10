package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6HP;
import X.AnonymousClass6HS;
import X.AnonymousClass72H;
import X.C108995ce;
import X.C122606Ra;
import X.C1418377d;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$addToStickerPack$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$addToStickerPack$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122606Ra $origin;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$addToStickerPack$1(C1418377d r2, C122606Ra r3, StickerInfoViewModel stickerInfoViewModel, C30391dr r5) {
        super(2, r5);
        this.this$0 = stickerInfoViewModel;
        this.$origin = r3;
        this.$sticker = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        StickerInfoViewModel stickerInfoViewModel = this.this$0;
        return new StickerInfoViewModel$addToStickerPack$1(this.$sticker, this.$origin, stickerInfoViewModel, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C41731wy r3;
        Object r2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            StickerInfoViewModel stickerInfoViewModel = this.this$0;
            if (StickerInfoViewModel.A00(this.$origin) == -1) {
                r3 = stickerInfoViewModel.A08;
                r2 = AnonymousClass6HS.A00;
            } else {
                if (C108995ce.A1Y(stickerInfoViewModel.A06)) {
                    ((AnonymousClass72H) this.this$0.A0L.get()).A05(this.$sticker);
                }
                r3 = this.this$0.A08;
                r2 = new AnonymousClass6HP(this.$sticker, this.$origin);
            }
            r3.A0E(r2);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$addToStickerPack$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
