package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4T3;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onListCollapseRequest$1", f = "CallConfirmationSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallConfirmationSheetViewModel$onListCollapseRequest$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallConfirmationSheetViewModel$onListCollapseRequest$1(CallConfirmationSheetViewModel callConfirmationSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callConfirmationSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallConfirmationSheetViewModel$onListCollapseRequest$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallConfirmationSheetViewModel$onListCollapseRequest$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass3MW.A17(this.this$0.A0B).setValue(new AnonymousClass4T3(CallConfirmationSheetViewModel.A00(this.this$0).A02(), false));
            CallConfirmationSheetViewModel.A04(this.this$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
