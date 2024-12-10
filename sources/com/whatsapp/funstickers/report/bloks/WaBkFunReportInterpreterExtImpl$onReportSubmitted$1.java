package com.whatsapp.funstickers.report.bloks;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C125936bv;
import X.C128496g7;
import X.C134686qz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.report.bloks.WaBkFunReportInterpreterExtImpl$onReportSubmitted$1", f = "WaBkFunReportInterpreterExtImpl.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class WaBkFunReportInterpreterExtImpl$onReportSubmitted$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $requestId;
    public final /* synthetic */ String $responseId;
    public int label;
    public final /* synthetic */ C128496g7 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(C128496g7 r2, String str, String str2, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$responseId = str;
        this.$requestId = str2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new WaBkFunReportInterpreterExtImpl$onReportSubmitted$1(this.this$0, this.$responseId, this.$requestId, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C134686qz r1 = new C134686qz(this.$responseId, this.$requestId);
            this.label = 1;
            if (((C125936bv) this.this$0.A00.get()).A00.BJt(r1, this) == r5) {
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
        return ((WaBkFunReportInterpreterExtImpl$onReportSubmitted$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
