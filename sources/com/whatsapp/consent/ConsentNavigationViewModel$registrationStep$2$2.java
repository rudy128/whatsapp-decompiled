package com.whatsapp.consent;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.C1594984t;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.ConsentNavigationViewModel$registrationStep$2$2", f = "ConsentNavigationViewModel.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
public final class ConsentNavigationViewModel$registrationStep$2$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ ConsentNavigationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentNavigationViewModel$registrationStep$2$2(ConsentNavigationViewModel consentNavigationViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = consentNavigationViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ConsentNavigationViewModel$registrationStep$2$2 consentNavigationViewModel$registrationStep$2$2 = new ConsentNavigationViewModel$registrationStep$2$2(this.this$0, r4);
        consentNavigationViewModel$registrationStep$2$2.L$0 = obj;
        return consentNavigationViewModel$registrationStep$2$2;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ConsentNavigationViewModel consentNavigationViewModel = this.this$0;
            C1594984t A00 = ConsentNavigationViewModel.A00(consentNavigationViewModel, consentNavigationViewModel.A07.A00(false));
            this.label = 1;
            if (((AnonymousClass1G2) this.L$0).BJt(A00, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ConsentNavigationViewModel$registrationStep$2$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
