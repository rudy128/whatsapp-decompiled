package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BR4;
import X.C22699BLb;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$initSharedPlayerEvents$3", f = "AvatarLiveEditingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarLiveEditingViewModel$initSharedPlayerEvents$3 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C22699BLb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingViewModel$initSharedPlayerEvents$3(C22699BLb bLb, C30391dr r3) {
        super(2, r3);
        this.this$0 = bLb;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarLiveEditingViewModel$initSharedPlayerEvents$3 avatarLiveEditingViewModel$initSharedPlayerEvents$3 = new AvatarLiveEditingViewModel$initSharedPlayerEvents$3(this.this$0, r4);
        avatarLiveEditingViewModel$initSharedPlayerEvents$3.L$0 = obj;
        return avatarLiveEditingViewModel$initSharedPlayerEvents$3;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (this.L$0 instanceof BR4) {
                this.this$0.A05 = false;
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLiveEditingViewModel$initSharedPlayerEvents$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
