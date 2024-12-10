package com.whatsapp.stickers.info.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass6HQ;
import X.AnonymousClass6HS;
import X.AnonymousClass778;
import X.C108975cc;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41731wy;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.info.bottomsheet.StickerInfoViewModel$createYourOwnSticker$1", f = "StickerInfoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerInfoViewModel$createYourOwnSticker$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ int $origin;
    public int label;
    public final /* synthetic */ StickerInfoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerInfoViewModel$createYourOwnSticker$1(AnonymousClass1BI r2, StickerInfoViewModel stickerInfoViewModel, C30391dr r4, int i) {
        super(2, r4);
        this.$chatJid = r2;
        this.this$0 = stickerInfoViewModel;
        this.$origin = i;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StickerInfoViewModel$createYourOwnSticker$1(this.$chatJid, this.this$0, r6, this.$origin);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C41731wy r3;
        Object r2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1BI r1 = this.$chatJid;
            StickerInfoViewModel stickerInfoViewModel = this.this$0;
            if (r1 == null) {
                r3 = stickerInfoViewModel.A08;
                r2 = AnonymousClass6HS.A00;
            } else {
                AnonymousClass1E7 r0 = stickerInfoViewModel.A00;
                boolean z = false;
                if (r0 != null) {
                    z = C108975cc.A1B(r0.A0F() ? 1 : 0);
                }
                AnonymousClass1E7 r02 = this.this$0.A00;
                if (r02 != null) {
                    str = r02.A0K();
                } else {
                    str = null;
                }
                AnonymousClass778 r12 = new AnonymousClass778(Boolean.valueOf(z), str, this.$chatJid.getRawString());
                r3 = this.this$0.A08;
                r2 = new AnonymousClass6HQ(r12, this.$origin);
            }
            r3.A0E(r2);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerInfoViewModel$createYourOwnSticker$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
