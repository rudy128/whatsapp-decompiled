package com.whatsapp.productinfra.avatar.data;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7KZ;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2", f = "AvatarStickersRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AvatarStickersRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2(AvatarStickersRepository avatarStickersRepository, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarStickersRepository;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarStickersRepository$fetchOnDemandAvatarStickers$2$unwrapped$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass7KZ.A00(C17880vN.A0V(this.this$0.A03), "no avatar on backend", 4);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
