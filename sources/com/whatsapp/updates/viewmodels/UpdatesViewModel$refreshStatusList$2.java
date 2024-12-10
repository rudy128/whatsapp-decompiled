package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C132706nQ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$refreshStatusList$2", f = "UpdatesViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$refreshStatusList$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C132706nQ $myStatusState;
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$refreshStatusList$2(C132706nQ r2, UpdatesViewModel updatesViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = updatesViewModel;
        this.$myStatusState = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new UpdatesViewModel$refreshStatusList$2(this.$myStatusState, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            UpdatesViewModel.A09(this.$myStatusState, this.this$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModel$refreshStatusList$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
