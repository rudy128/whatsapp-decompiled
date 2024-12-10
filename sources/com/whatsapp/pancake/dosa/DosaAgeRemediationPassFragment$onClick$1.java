package com.whatsapp.pancake.dosa;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.dosa.DosaAgeRemediationPassFragment$onClick$1", f = "DosaAgeRemediationPassFragment.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
public final class DosaAgeRemediationPassFragment$onClick$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DosaAgeRemediationPassFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaAgeRemediationPassFragment$onClick$1(DosaAgeRemediationPassFragment dosaAgeRemediationPassFragment, C30391dr r3) {
        super(2, r3);
        this.this$0 = dosaAgeRemediationPassFragment;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DosaAgeRemediationPassFragment$onClick$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DosaAgeRemediationPassFragment$onClick$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DosaAgeRemediationPassViewModel dosaAgeRemediationPassViewModel = (DosaAgeRemediationPassViewModel) this.this$0.A00.getValue();
            this.label = 1;
            if (C30451dy.A00(this, dosaAgeRemediationPassViewModel.A01, new DosaAgeRemediationPassViewModel$onContinueClicked$2(dosaAgeRemediationPassViewModel, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
