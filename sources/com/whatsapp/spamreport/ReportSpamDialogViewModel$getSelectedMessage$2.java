package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass8oH;
import X.C108945cZ;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.spamreport.ReportSpamDialogViewModel$getSelectedMessage$2", f = "ReportSpamDialogViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReportSpamDialogViewModel$getSelectedMessage$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $entryPoint;
    public final /* synthetic */ AnonymousClass205 $selectedMessageKey;
    public int label;
    public final /* synthetic */ ReportSpamDialogViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportSpamDialogViewModel$getSelectedMessage$2(AnonymousClass205 r2, ReportSpamDialogViewModel reportSpamDialogViewModel, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = reportSpamDialogViewModel;
        this.$selectedMessageKey = r2;
        this.$entryPoint = str;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new ReportSpamDialogViewModel$getSelectedMessage$2(this.$selectedMessageKey, this.this$0, this.$entryPoint, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass206 A0s = C108945cZ.A0s(this.$selectedMessageKey, C17880vN.A0c(this.this$0.A0D));
            if (A0s == null) {
                this.this$0.A08.A00(AnonymousClass8oH.A04, this.$entryPoint);
            }
            return A0s;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ReportSpamDialogViewModel$getSelectedMessage$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
