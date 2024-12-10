package com.whatsapp.inappbugreporting.data.repository;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4RM;
import X.AnonymousClass4X1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1", f = "ReportBugRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $bugReportingEndpoint;
    public int label;
    public final /* synthetic */ AnonymousClass4X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1(AnonymousClass4X1 r2, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$bugReportingEndpoint = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1(this.this$0, this.$bugReportingEndpoint, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            String A00 = ((AnonymousClass4RM) this.this$0.A03.get()).A00(this.$bugReportingEndpoint);
            AnonymousClass4X1.A00(this.this$0).A00.markerPoint(476715896, "debug_info_fetched");
            return A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportBugRepository$submitBugForInternalUsers$2$debugInfoDeferred$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
