package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108935cY;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeAvatarStickers$2", f = "AvatarExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeAvatarStickers$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeAvatarStickers$2(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarExpressionsViewModel$observeAvatarStickers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarExpressionsViewModel$observeAvatarStickers$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C108935cY r1 = this.this$0.A0H;
            C27621Wu r0 = C27621Wu.A00;
            r1.BFN(r0);
            return r0;
        }
        throw AnonymousClass000.A0l();
    }
}
