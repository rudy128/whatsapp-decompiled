package com.whatsapp.updates.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.updates.viewmodels.UpdatesViewModel$tryReportTabOpenEvent$2", f = "UpdatesViewModel.kt", i = {}, l = {472}, m = "invokeSuspend", n = {}, s = {})
public final class UpdatesViewModel$tryReportTabOpenEvent$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $delay;
    public final /* synthetic */ String $token;
    public int label;
    public final /* synthetic */ UpdatesViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdatesViewModel$tryReportTabOpenEvent$2(UpdatesViewModel updatesViewModel, String str, C30391dr r4, long j) {
        super(2, r4);
        this.this$0 = updatesViewModel;
        this.$delay = j;
        this.$token = str;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new UpdatesViewModel$tryReportTabOpenEvent$2(this.this$0, this.$token, r8, this.$delay);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            UpdatesViewModel updatesViewModel = this.this$0;
            long j = this.$delay;
            String str = this.$token;
            this.label = 1;
            if (UpdatesViewModel.A04(updatesViewModel, str, this, j) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UpdatesViewModel$tryReportTabOpenEvent$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
