package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C138596xL;
import X.C1405371w;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel$onCleared$1", f = "AvatarProfilePhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarProfilePhotoViewModel$onCleared$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarProfilePhotoViewModel$onCleared$1(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarProfilePhotoViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarProfilePhotoViewModel$onCleared$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarProfilePhotoViewModel$onCleared$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1405371w.A01(((C138596xL) this.this$0.A0B.get()).A02);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
