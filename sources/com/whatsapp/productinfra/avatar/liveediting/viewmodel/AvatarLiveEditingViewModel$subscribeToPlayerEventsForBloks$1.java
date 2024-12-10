package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C22699BLb;
import X.C24305Bz2;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1", f = "AvatarLiveEditingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C22699BLb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1(C22699BLb bLb, C30391dr r3) {
        super(2, r3);
        this.this$0 = bLb;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarLiveEditingViewModel$subscribeToPlayerEventsForBloks$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A0C.A00.invoke(C24305Bz2.EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_START.toString(), (Object) null);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
