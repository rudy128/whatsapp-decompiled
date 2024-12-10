package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass6F1;
import X.C136876uY;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogFragment$triggerReportAction$2", f = "ReportSpamDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogFragment$triggerReportAction$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ List $selectedMessages;
    public int label;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogFragment$triggerReportAction$2(AnonymousClass1E7 r2, ReportSpamDialogFragment reportSpamDialogFragment, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogFragment;
        this.$contact = r2;
        this.$selectedMessages = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ReportSpamDialogFragment$triggerReportAction$2(this.$contact, this.this$0, this.$selectedMessages, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
            C136876uY r3 = reportSpamDialogFragment.A04;
            if (r3 != null) {
                r3.A02(this.$contact, AnonymousClass3MW.A0y(reportSpamDialogFragment.A0T), this.$selectedMessages);
                return AnonymousClass6F1.A00;
            }
            C18070vi.A11("spamReportManager");
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogFragment$triggerReportAction$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
