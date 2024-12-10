package com.whatsapp.profile;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3U6;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99384sj;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.UsernameManagementFlowActivity$onCreate$2", f = "UsernameManagementFlowActivity.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class UsernameManagementFlowActivity$onCreate$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ UsernameManagementFlowActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsernameManagementFlowActivity$onCreate$2(UsernameManagementFlowActivity usernameManagementFlowActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = usernameManagementFlowActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new UsernameManagementFlowActivity$onCreate$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new UsernameManagementFlowActivity$onCreate$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23421Fz r3 = ((AnonymousClass3U6) this.this$0.A00.getValue()).A02;
            C99384sj r0 = new C99384sj(this.this$0, 6);
            this.label = 1;
            if (r3.BFC(this, r0) == r5) {
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
