package com.whatsapp.funstickers;

import X.AnonymousClass000;
import X.AnonymousClass10T;
import X.AnonymousClass1OS;
import X.AnonymousClass725;
import X.AnonymousClass7KY;
import X.C134046pv;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.FunStickerPack$addStickerIntoStickerPack$3", f = "FunStickerPack.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickerPack$addStickerIntoStickerPack$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass725 $stickerPack;
    public int label;
    public final /* synthetic */ C134046pv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickerPack$addStickerIntoStickerPack$3(C134046pv r2, AnonymousClass725 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$stickerPack = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FunStickerPack$addStickerIntoStickerPack$3(this.this$0, this.$stickerPack, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass10T A0V = C17880vN.A0V(this.this$0.A04);
            AnonymousClass725 r1 = this.$stickerPack;
            C18070vi.A0d(r1, 0);
            AnonymousClass7KY.A00(A0V, r1, 20);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FunStickerPack$addStickerIntoStickerPack$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
