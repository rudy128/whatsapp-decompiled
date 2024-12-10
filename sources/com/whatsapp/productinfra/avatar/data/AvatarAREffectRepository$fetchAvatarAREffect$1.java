package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarAREffectRepository$fetchAvatarAREffect$1", f = "AvatarAREffectRepository.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarAREffectRepository$fetchAvatarAREffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $effectId;
    public int label;
    public final /* synthetic */ AvatarAREffectRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarAREffectRepository$fetchAvatarAREffect$1(AvatarAREffectRepository avatarAREffectRepository, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarAREffectRepository;
        this.$effectId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarAREffectRepository$fetchAvatarAREffect$1(this.this$0, this.$effectId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AvatarAREffectRepository avatarAREffectRepository = this.this$0;
            String str = this.$effectId;
            this.label = 1;
            obj = AvatarAREffectRepository.A00(avatarAREffectRepository, str, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarAREffectRepository$fetchAvatarAREffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
