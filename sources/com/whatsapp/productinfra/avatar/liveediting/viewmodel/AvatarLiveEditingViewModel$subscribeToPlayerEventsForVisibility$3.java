package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.C18070vi;
import X.C22699BLb;
import X.C26027Cql;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$3", f = "AvatarLiveEditingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$3 extends C30431dv implements C36001nB {
    public int label;
    public final /* synthetic */ C22699BLb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$3(C22699BLb bLb, C30391dr r3) {
        super(3, r3);
        this.this$0 = bLb;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return new AvatarLiveEditingViewModel$subscribeToPlayerEventsForVisibility$3(this.this$0, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C26027Cql cql = this.this$0.A02;
            if (cql == null) {
                C18070vi.A11("richAvatarViewProvider");
                throw null;
            }
            cql.A04(1.0f);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
