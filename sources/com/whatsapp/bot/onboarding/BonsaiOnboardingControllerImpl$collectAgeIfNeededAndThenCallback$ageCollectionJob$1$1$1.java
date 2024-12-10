package com.whatsapp.bot.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6R9;
import X.AnonymousClass86Z;
import X.C1598386b;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.onboarding.BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1", f = "BonsaiOnboardingControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass86Z $onboardingCompletedCallback;
    public final /* synthetic */ C1598386b $onboardingSuccessCallback;
    public final /* synthetic */ boolean $tosJustAccepted;
    public final /* synthetic */ AnonymousClass6R9 $tosState;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1(AnonymousClass86Z r2, C1598386b r3, AnonymousClass6R9 r4, C30391dr r5, boolean z) {
        super(2, r5);
        this.$onboardingSuccessCallback = r3;
        this.$tosJustAccepted = z;
        this.$onboardingCompletedCallback = r2;
        this.$tosState = r4;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1(this.$onboardingCompletedCallback, this.$onboardingSuccessCallback, this.$tosState, r8, this.$tosJustAccepted);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1598386b r1 = this.$onboardingSuccessCallback;
            if (r1 != null) {
                r1.BzV(this.$tosJustAccepted);
            }
            AnonymousClass86Z r12 = this.$onboardingCompletedCallback;
            if (r12 != null) {
                r12.BzU(this.$tosState);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
