package com.whatsapp.flows.webview.bridge.factory.impl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass84U;
import X.C158047ze;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.FlowsMarketingDisclosureState$execute$2", f = "FlowsMarketingDisclosureState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsMarketingDisclosureState$execute$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ FlowsMarketingDisclosureState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsMarketingDisclosureState$execute$2(FlowsMarketingDisclosureState flowsMarketingDisclosureState, C30391dr r3) {
        super(2, r3);
        this.this$0 = flowsMarketingDisclosureState;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FlowsMarketingDisclosureState$execute$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FlowsMarketingDisclosureState$execute$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return AnonymousClass84U.A00(new C158047ze(this.this$0));
        }
        throw AnonymousClass000.A0l();
    }
}
