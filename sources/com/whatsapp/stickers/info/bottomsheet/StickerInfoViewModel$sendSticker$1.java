package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.AnonymousClass6HS;
import X.AnonymousClass6HT;
import X.AnonymousClass72H;
import X.C108995ce;
import X.C122606Ra;
import X.C1418377d;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$sendSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$sendSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ C122606Ra $origin;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$sendSticker$1(AnonymousClass1BI r2, C1418377d r3, C122606Ra r4, StickerInfoViewModel stickerInfoViewModel, C30391dr r6) {
        super(2, r6);
        this.$chatJid = r2;
        this.this$0 = stickerInfoViewModel;
        this.$origin = r4;
        this.$sticker = r3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        AnonymousClass1BI r1 = this.$chatJid;
        StickerInfoViewModel stickerInfoViewModel = this.this$0;
        return new StickerInfoViewModel$sendSticker$1(r1, this.$sticker, this.$origin, stickerInfoViewModel, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C41731wy r1;
        Object obj2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.$chatJid != null) {
                StickerInfoViewModel stickerInfoViewModel = this.this$0;
                if (StickerInfoViewModel.A00(this.$origin) != -1) {
                    if (C108995ce.A1Y(stickerInfoViewModel.A06)) {
                        ((AnonymousClass72H) this.this$0.A0L.get()).A05(this.$sticker);
                    }
                    this.this$0.A04.A0H(this.$sticker, C18070vi.A0M(this.$chatJid), StickerInfoViewModel.A00(this.$origin), 1);
                    r1 = this.this$0.A08;
                    obj2 = AnonymousClass6HT.A00;
                    r1.A0E(obj2);
                    return C27621Wu.A00;
                }
            }
            r1 = this.this$0.A08;
            obj2 = AnonymousClass6HS.A00;
            r1.A0E(obj2);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$sendSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
