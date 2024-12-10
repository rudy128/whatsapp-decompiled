package com.whatsapp.flows.downloadresponse.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C195059sj;
import X.C20268AEb;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C438721g;
import X.C57922jr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.downloadresponse.viewmodel.FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1", f = "FlowsDownloadResponseViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ long $messageRowId;
    public int label;
    public final /* synthetic */ FlowsDownloadResponseViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1(FlowsDownloadResponseViewModel flowsDownloadResponseViewModel, C30391dr r3, long j) {
        super(2, r3);
        this.this$0 = flowsDownloadResponseViewModel;
        this.$messageRowId = j;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1(this.this$0, r6, this.$messageRowId);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C20268AEb aEb;
        C195059sj A00;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C57922jr r0 = this.this$0.A01;
            C438721g r02 = (C438721g) C17880vN.A0c(r0.A01).A01.A03(this.$messageRowId);
            if (r02 == null || (aEb = r02.A00) == null || (A00 = aEb.A00()) == null) {
                str = null;
            } else {
                str = A00.A01;
            }
            this.this$0.A00.A0E(str);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsDownloadResponseViewModel$fetchFlowNameForMessageRowId$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
