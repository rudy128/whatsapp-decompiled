package com.whatsapp.stickers.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass70H;
import X.AnonymousClass725;
import X.AnonymousClass73Q;
import X.C130746jw;
import X.C136886uZ;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerPackFlowImpl$getStickerPackWithStickers$2", f = "AvatarStickerPackFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerPackFlowImpl$getStickerPackWithStickers$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C130746jw this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(C130746jw r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarStickerPackFlowImpl$getStickerPackWithStickers$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass725 r3 = (AnonymousClass725) C29431cG.A0c(AnonymousClass73Q.A01((AnonymousClass73Q) this.this$0.A03.get(), 2));
            if (r3 == null) {
                return null;
            }
            C130746jw r2 = this.this$0;
            ArrayList A03 = ((C136886uZ) r2.A04.get()).A03(AnonymousClass725.A00(r3));
            ((AnonymousClass70H) r2.A00.get()).A06(A03);
            r3.A07 = A03;
            return r3;
        }
        throw AnonymousClass000.A0l();
    }
}
