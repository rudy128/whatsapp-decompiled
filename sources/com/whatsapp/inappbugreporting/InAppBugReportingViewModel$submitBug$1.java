package com.whatsapp.inappbugreporting;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4X1;
import X.C200410p;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C96504nx;
import com.whatsapp.inappbugreporting.data.repository.ReportBugRepository$submitBugForInternalUsers$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.inappbugreporting.InAppBugReportingViewModel$submitBug$1", f = "InAppBugReportingViewModel.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
public final class InAppBugReportingViewModel$submitBug$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $bugCategory;
    public final /* synthetic */ String $description;
    public final /* synthetic */ String $title;
    public int label;
    public final /* synthetic */ InAppBugReportingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InAppBugReportingViewModel$submitBug$1(InAppBugReportingViewModel inAppBugReportingViewModel, String str, String str2, String str3, C30391dr r6) {
        super(2, r6);
        this.this$0 = inAppBugReportingViewModel;
        this.$title = str;
        this.$bugCategory = str2;
        this.$description = str3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new InAppBugReportingViewModel$submitBug$1(this.this$0, this.$title, this.$bugCategory, this.$description, r8);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r1 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass4X1 r4 = (AnonymousClass4X1) this.this$0.A09.get();
            String str = this.$title;
            String str2 = this.$bugCategory;
            String str3 = this.$description;
            InAppBugReportingViewModel inAppBugReportingViewModel = this.this$0;
            String str4 = inAppBugReportingViewModel.A03;
            List A0t = C29431cG.A0t(C200410p.A0P(inAppBugReportingViewModel.A04));
            C96504nx r3 = new C96504nx(this.this$0);
            this.label = 1;
            if (C30451dy.A00(this, r4.A05, new ReportBugRepository$submitBugForInternalUsers$2(r3, r4, str, str3, str2, str4, A0t, (C30391dr) null)) == r1) {
                return r1;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InAppBugReportingViewModel$submitBug$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
