package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108985cd;
import X.C25274CcM;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToParametricChanges$2", f = "AvatarLiveEditingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarLiveEditingViewModel$subscribeToParametricChanges$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C25274CcM $liveEditingPlayer;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingViewModel$subscribeToParametricChanges$2(C25274CcM ccM, C30391dr r3) {
        super(2, r3);
        this.$liveEditingPlayer = ccM;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarLiveEditingViewModel$subscribeToParametricChanges$2 avatarLiveEditingViewModel$subscribeToParametricChanges$2 = new AvatarLiveEditingViewModel$subscribeToParametricChanges$2(this.$liveEditingPlayer, r4);
        avatarLiveEditingViewModel$subscribeToParametricChanges$2.L$0 = obj;
        return avatarLiveEditingViewModel$subscribeToParametricChanges$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$liveEditingPlayer.A04(C108985cd.A0f(), (Map) this.L$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLiveEditingViewModel$subscribeToParametricChanges$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
