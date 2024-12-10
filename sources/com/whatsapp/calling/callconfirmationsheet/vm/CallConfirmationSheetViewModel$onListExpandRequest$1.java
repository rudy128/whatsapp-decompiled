package com.whatsapp.calling.callconfirmationsheet.vm;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4T3;
import X.AnonymousClass4VY;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18100vl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C72453Mb;
import X.C75953mC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel$onListExpandRequest$1", f = "CallConfirmationSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CallConfirmationSheetViewModel$onListExpandRequest$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CallConfirmationSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallConfirmationSheetViewModel$onListExpandRequest$1(CallConfirmationSheetViewModel callConfirmationSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = callConfirmationSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CallConfirmationSheetViewModel$onListExpandRequest$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CallConfirmationSheetViewModel$onListExpandRequest$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass4VY r5 = (AnonymousClass4VY) this.this$0.A0C.getValue();
            if (r5 instanceof C75953mC) {
                C75953mC r52 = (C75953mC) r5;
                if (!r52.A00) {
                    C18100vl r4 = r52.A06;
                    if (C72453Mb.A0I(r4) < C18020vd.A00(C18040vf.A02, r52.A04, 11520)) {
                        C17880vN.A1C(AnonymousClass3MZ.A08(r52.A01), "lgc_confirmation_sheet_expand_count", C72453Mb.A0I(r4) + 1);
                        r52.A00 = true;
                    }
                }
            }
            AnonymousClass3MW.A17(this.this$0.A0B).setValue(new AnonymousClass4T3(CallConfirmationSheetViewModel.A00(this.this$0).A02(), false));
            CallConfirmationSheetViewModel.A04(this.this$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
