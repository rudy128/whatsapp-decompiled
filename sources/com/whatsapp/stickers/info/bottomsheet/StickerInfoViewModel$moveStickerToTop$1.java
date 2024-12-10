package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1SB;
import X.AnonymousClass7RQ;
import X.AnonymousClass7RT;
import X.C108945cZ;
import X.C1193467t;
import X.C122606Ra;
import X.C132486mt;
import X.C1418377d;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$moveStickerToTop$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$moveStickerToTop$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C122606Ra $origin;
    public final /* synthetic */ C1418377d $sticker;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$moveStickerToTop$1(C1418377d r2, C122606Ra r3, StickerInfoViewModel stickerInfoViewModel, C30391dr r5) {
        super(2, r5);
        this.$origin = r3;
        this.this$0 = stickerInfoViewModel;
        this.$sticker = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerInfoViewModel$moveStickerToTop$1(this.$sticker, this.$origin, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            int ordinal = this.$origin.ordinal();
            if (ordinal != 1) {
                if (ordinal == 2) {
                    AnonymousClass1SB r3 = this.this$0.A07;
                    AnonymousClass7RQ.A02(r3.A0C, r3, C18070vi.A0M(this.$sticker), 18);
                }
                return C27621Wu.A00;
            }
            List A0M = C18070vi.A0M(this.$sticker);
            C122606Ra r32 = this.$origin;
            C18070vi.A0d(r32, 1);
            C1193467t A0w = C108945cZ.A0w(((C132486mt) this.this$0.A0H.get()).A01);
            A0w.A07.execute(new AnonymousClass7RT(A0w, r32, A0M));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$moveStickerToTop$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
