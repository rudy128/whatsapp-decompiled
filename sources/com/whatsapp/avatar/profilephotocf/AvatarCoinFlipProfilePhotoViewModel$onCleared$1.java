package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1405371w;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.productinfra.avatar.data.AvatarCoinFlipProfilePhotoPosesRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.profilephotocf.AvatarCoinFlipProfilePhotoViewModel$onCleared$1", f = "AvatarCoinFlipProfilePhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarCoinFlipProfilePhotoViewModel$onCleared$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AvatarCoinFlipProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarCoinFlipProfilePhotoViewModel$onCleared$1(AvatarCoinFlipProfilePhotoViewModel avatarCoinFlipProfilePhotoViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarCoinFlipProfilePhotoViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarCoinFlipProfilePhotoViewModel$onCleared$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarCoinFlipProfilePhotoViewModel$onCleared$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1405371w.A01(((AvatarCoinFlipProfilePhotoPosesRepository) this.this$0.A0A.get()).A00);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
