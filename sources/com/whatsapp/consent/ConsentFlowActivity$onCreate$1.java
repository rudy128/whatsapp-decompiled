package com.whatsapp.consent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7SX;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.ConsentFlowActivity$onCreate$1", f = "ConsentFlowActivity.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class ConsentFlowActivity$onCreate$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ConsentFlowActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentFlowActivity$onCreate$1(ConsentFlowActivity consentFlowActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = consentFlowActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConsentFlowActivity$onCreate$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsentFlowActivity$onCreate$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass7SX r0 = new AnonymousClass7SX(this.this$0, 0);
            this.label = 1;
            if (((C23421Fz) ((ConsentNavigationViewModel) this.this$0.A05.getValue()).A08.getValue()).BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
