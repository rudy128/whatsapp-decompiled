package com.whatsapp.calling.callsuggestions;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C132226mR;
import X.C186609eT;
import X.C188419hO;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72163Kw;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callsuggestions.FetchCallLogs$startFetchCallLogs$1", f = "FetchCallLogs.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCallLogs$startFetchCallLogs$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C188419hO $parameters;
    public int label;
    public final /* synthetic */ C132226mR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCallLogs$startFetchCallLogs$1(C188419hO r2, C132226mR r3, C30391dr r4) {
        super(2, r4);
        this.$parameters = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FetchCallLogs$startFetchCallLogs$1(this.$parameters, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new C186609eT(this.$parameters, this.this$0.A01.A09((C72163Kw) null, 0, 200));
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCallLogs$startFetchCallLogs$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
