package com.whatsapp.flows.webview.bridge.factory.impl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9RE;
import X.C172128st;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.flows.webview.bridge.factory.impl.FlowsSaveReportingData$execute$2", f = "FlowsSaveReportingData.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FlowsSaveReportingData$execute$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C172128st this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowsSaveReportingData$execute$2(C172128st r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FlowsSaveReportingData$execute$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FlowsSaveReportingData$execute$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Map A00 = AnonymousClass9RE.A00(this.this$0.A02);
            if (A00 != null) {
                C172128st r0 = this.this$0;
                r0.A00.A03(r0.A04, r0.A05, r0.A03, r0.A01, A00);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
