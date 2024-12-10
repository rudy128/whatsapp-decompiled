package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C42751yg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$getContactNameToDisplay$2", f = "ReportSpamDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogViewModel$getContactNameToDisplay$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass1E7 $contactToDisplay;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$getContactNameToDisplay$2(AnonymousClass1E7 r2, AnonymousClass1BI r3, ReportSpamDialogViewModel reportSpamDialogViewModel, C30391dr r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogViewModel;
        this.$chatJid = r3;
        this.$contactToDisplay = r2;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        ReportSpamDialogViewModel reportSpamDialogViewModel = this.this$0;
        return new ReportSpamDialogViewModel$getContactNameToDisplay$2(this.$contactToDisplay, this.$chatJid, reportSpamDialogViewModel, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            boolean A0R = this.this$0.A09.A0R(this.$chatJid);
            ReportSpamDialogViewModel reportSpamDialogViewModel = this.this$0;
            if (!A0R) {
                return AnonymousClass3MY.A0q(reportSpamDialogViewModel.A04, this.$contactToDisplay);
            }
            AnonymousClass1E7 r5 = this.$contactToDisplay;
            AnonymousClass1BI r4 = this.$chatJid;
            C42751yg A0F = reportSpamDialogViewModel.A04.A0F(r5, 7, false, true);
            String A06 = AnonymousClass3MW.A0Z(reportSpamDialogViewModel.A0C).A06(r5, r4, A0F.A00, 7);
            if (A06 == null) {
                return A0F.A01;
            }
            return A06;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$getContactNameToDisplay$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
