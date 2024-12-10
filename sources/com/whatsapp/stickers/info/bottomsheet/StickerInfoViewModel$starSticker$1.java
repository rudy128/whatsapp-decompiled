package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass72H;
import X.C108995ce;
import X.C1418377d;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$starSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$starSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$starSticker$1(C1418377d r2, StickerInfoViewModel stickerInfoViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = stickerInfoViewModel;
        this.$sticker = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StickerInfoViewModel$starSticker$1(this.$sticker, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (C108995ce.A1Y(this.this$0.A06)) {
                ((AnonymousClass72H) this.this$0.A0L.get()).A05(this.$sticker);
            }
            this.this$0.A07.A0I(C18070vi.A0M(this.$sticker));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$starSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
