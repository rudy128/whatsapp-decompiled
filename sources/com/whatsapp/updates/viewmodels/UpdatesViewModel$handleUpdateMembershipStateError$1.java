package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6KZ;
import X.C108495bn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$handleUpdateMembershipStateError$1", f = "UpdatesViewModel.kt", i = {}, l = {1078}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$handleUpdateMembershipStateError$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6KZ $errorSideEffect;
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$handleUpdateMembershipStateError$1(AnonymousClass6KZ r2, UpdatesViewModel updatesViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = updatesViewModel;
        this.$errorSideEffect = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UpdatesViewModel$handleUpdateMembershipStateError$1(this.$errorSideEffect, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass6KZ r0 = this.$errorSideEffect;
            this.label = 1;
            if (((C108495bn) this.this$0.A0n.getValue()).CHH(r0, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModel$handleUpdateMembershipStateError$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
