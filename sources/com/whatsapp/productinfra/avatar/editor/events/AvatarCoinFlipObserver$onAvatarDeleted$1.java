package com.whatsapp.productinfra.avatar.editor.events;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7L7;
import X.C108995ce;
import X.C17880vN;
import X.C24771Lp;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.editor.events.AvatarCoinFlipObserver$onAvatarDeleted$1", f = "AvatarCoinFlipObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarCoinFlipObserver$onAvatarDeleted$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass7L7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipObserver$onAvatarDeleted$1(AnonymousClass7L7 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarCoinFlipObserver$onAvatarDeleted$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarCoinFlipObserver$onAvatarDeleted$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.this$0.A02.get();
            AnonymousClass7L7 r3 = this.this$0;
            MyAvatarCoinFlipRepository myAvatarCoinFlipRepository = (MyAvatarCoinFlipRepository) obj2;
            C17880vN.A1F(C108995ce.A0F(myAvatarCoinFlipRepository.A03).edit(), "pref_key_coin_flip_opt_in", false);
            ((C24771Lp) myAvatarCoinFlipRepository.A04.get()).A00().A0E("avatar_pose_preview");
            myAvatarCoinFlipRepository.A04();
            AnonymousClass7L7.A00(r3);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
