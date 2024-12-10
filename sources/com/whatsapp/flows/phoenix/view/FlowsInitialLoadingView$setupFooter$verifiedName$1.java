package com.whatsapp.flows.phoenix.view;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C42741yf;
import com.whatsapp.flows.phoenix.viewmodel.FlowsFooterViewModel;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.phoenix.view.FlowsInitialLoadingView$setupFooter$verifiedName$1", f = "FlowsInitialLoadingView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsInitialLoadingView$setupFooter$verifiedName$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $businessJid;
    public int label;
    public final /* synthetic */ FlowsInitialLoadingView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsInitialLoadingView$setupFooter$verifiedName$1(FlowsInitialLoadingView flowsInitialLoadingView, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = flowsInitialLoadingView;
        this.$businessJid = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FlowsInitialLoadingView$setupFooter$verifiedName$1(this.this$0, this.$businessJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C42741yf A01;
        if (this.label == 0) {
            C30691eM.A01(obj);
            FlowsFooterViewModel A00 = this.this$0.getFlowsFooterViewModel();
            if (A00 == null || (A01 = A00.A02.A01(this.$businessJid)) == null) {
                return null;
            }
            return A01.A08;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowsInitialLoadingView$setupFooter$verifiedName$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
