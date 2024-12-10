package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99624tC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel$onOnboardingCreated$1", f = "ImagineMeOnboardingViewModel.kt", i = {}, l = {297}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeOnboardingViewModel$onOnboardingCreated$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ImagineMeOnboardingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeOnboardingViewModel$onOnboardingCreated$1(ImagineMeOnboardingViewModel imagineMeOnboardingViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = imagineMeOnboardingViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ImagineMeOnboardingViewModel$onOnboardingCreated$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ImagineMeOnboardingViewModel$onOnboardingCreated$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            ImagineMeOnboardingViewModel imagineMeOnboardingViewModel = this.this$0;
            AnonymousClass1G1 r1 = imagineMeOnboardingViewModel.A0A.A06;
            C99624tC A00 = C99624tC.A00(imagineMeOnboardingViewModel, 20);
            this.label = 1;
            if (r1.BFC(this, A00) == r4) {
                return r4;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw AnonymousClass3MW.A13();
    }
}
