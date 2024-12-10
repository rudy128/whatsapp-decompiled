package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$getContact$2", f = "ReportSpamDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogViewModel$getContact$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$getContact$2(AnonymousClass1BI r2, ReportSpamDialogViewModel reportSpamDialogViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = reportSpamDialogViewModel;
        this.$chatJid = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ReportSpamDialogViewModel$getContact$2(this.$chatJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.this$0.A03.A0H(this.$chatJid);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$getContact$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
