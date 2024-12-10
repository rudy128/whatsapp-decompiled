package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6E5;
import X.C108945cZ;
import X.C123126Tf;
import X.C17880vN;
import X.C17890vO;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$handleAvatarEvent$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$handleAvatarEvent$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C123126Tf $event;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$handleAvatarEvent$1(StickerExpressionsViewModel stickerExpressionsViewModel, C123126Tf r3, C30391dr r4) {
        super(2, r4);
        this.$event = r3;
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StickerExpressionsViewModel$handleAvatarEvent$1(this.this$0, this.$event, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.$event instanceof AnonymousClass6E5) {
                C17880vN.A1F(C17890vO.A0A(C108945cZ.A0o(this.this$0.A0K).A01), "pref_has_dismissed_sticker_upsell", true);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$handleAvatarEvent$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
