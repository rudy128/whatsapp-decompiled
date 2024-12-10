package com.whatsapp.pancake.dosa;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.dobverification.DosaRepository;
import com.whatsapp.dobverification.DosaRepository$submitVerifiedAge$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.pancake.dosa.DosaAgeRemediationPassViewModel$onContinueClicked$2", f = "DosaAgeRemediationPassViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
public final class DosaAgeRemediationPassViewModel$onContinueClicked$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ DosaAgeRemediationPassViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DosaAgeRemediationPassViewModel$onContinueClicked$2(DosaAgeRemediationPassViewModel dosaAgeRemediationPassViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = dosaAgeRemediationPassViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new DosaAgeRemediationPassViewModel$onContinueClicked$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new DosaAgeRemediationPassViewModel$onContinueClicked$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            DosaRepository dosaRepository = this.this$0.A00;
            this.label = 1;
            if (C30451dy.A00(this, dosaRepository.A07, new DosaRepository$submitVerifiedAge$2(dosaRepository, (C30391dr) null)) == r4) {
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
