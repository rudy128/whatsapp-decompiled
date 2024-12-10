package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4T3;
import X.AnonymousClass4US;
import X.AnonymousClass4XV;
import X.C178119Bw;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C89444cT;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$init$1", f = "CallConfirmationSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallConfirmationSheetViewModel$init$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallConfirmationSheetViewModel$init$1(CallConfirmationSheetViewModel callConfirmationSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callConfirmationSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallConfirmationSheetViewModel$init$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallConfirmationSheetViewModel$init$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        C18030ve r2;
        int i2;
        if (this.label == 0) {
            C30691eM.A01(obj);
            CallConfirmationSheetViewModel callConfirmationSheetViewModel = this.this$0;
            AnonymousClass1EC r1 = callConfirmationSheetViewModel.A09;
            boolean z2 = false;
            if (r1 != null) {
                i = callConfirmationSheetViewModel.A08.A09(r1);
            } else {
                i = 0;
            }
            AnonymousClass4XV r4 = callConfirmationSheetViewModel.A04;
            int i3 = callConfirmationSheetViewModel.A01;
            C89444cT r12 = callConfirmationSheetViewModel.A0A;
            if (r4.A01(i3)) {
                C178119Bw A00 = AnonymousClass4XV.A00(r4, r12, i3);
                if (A00 == null) {
                    r2 = r4.A06;
                    i2 = 11270;
                } else {
                    i = A00.A0B().size();
                    r2 = r4.A06;
                    i2 = 11616;
                }
                if (i >= C18020vd.A00(C18040vf.A02, r2, i2)) {
                    z2 = true;
                    CallConfirmationSheetViewModel.A00(callConfirmationSheetViewModel).A00 = true;
                }
            }
            CallConfirmationSheetViewModel callConfirmationSheetViewModel2 = this.this$0;
            AnonymousClass4XV r13 = callConfirmationSheetViewModel2.A04;
            int i4 = callConfirmationSheetViewModel2.A01;
            C89444cT r42 = callConfirmationSheetViewModel2.A0A;
            if (r13.A01(i4)) {
                C18030ve r22 = r13.A06;
                int i5 = 11611;
                if (r42 == null) {
                    i5 = 11588;
                }
                if (C18020vd.A05(C18040vf.A02, r22, i5)) {
                    AnonymousClass4US A002 = CallConfirmationSheetViewModel.A00(callConfirmationSheetViewModel2);
                    ((Set) A002.A02.getValue()).addAll(A002.A01());
                    z = true;
                    if (z2 || z) {
                        AnonymousClass3MW.A17(this.this$0.A0B).setValue(new AnonymousClass4T3(CallConfirmationSheetViewModel.A00(this.this$0).A02(), true));
                    }
                    CallConfirmationSheetViewModel.A04(this.this$0);
                    return C27621Wu.A00;
                }
            }
            z = false;
            AnonymousClass3MW.A17(this.this$0.A0B).setValue(new AnonymousClass4T3(CallConfirmationSheetViewModel.A00(this.this$0).A02(), true));
            CallConfirmationSheetViewModel.A04(this.this$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
