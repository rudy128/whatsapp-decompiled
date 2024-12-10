package com.whatsapp.inappbugreporting.data.repository;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4X1;
import X.C131956lw;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1", f = "ReportBugRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass4X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1(AnonymousClass4X1 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ReportBugRepository$submitBugForExternalUsers$1$logsInfoDeferred$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            String A00 = ((C131956lw) this.this$0.A01.get()).A00();
            AnonymousClass4X1.A00(this.this$0).A00.markerPoint(476715896, "device_log_fetched");
            return A00;
        }
        throw AnonymousClass000.A0l();
    }
}
