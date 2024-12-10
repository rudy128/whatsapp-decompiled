package com.whatsapp.bot.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass1FU;
import X.AnonymousClass1G0;
import X.AnonymousClass1OS;
import X.AnonymousClass6R9;
import X.AnonymousClass86Z;
import X.C147257Sk;
import X.C147317Sr;
import X.C1598386b;
import X.C25721Pj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.onboarding.BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1", f = "BonsaiOnboardingControllerImpl.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {})
public final class BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FU $dialogActivity;
    public final /* synthetic */ AnonymousClass86Z $onboardingCompletedCallback;
    public final /* synthetic */ C1598386b $onboardingSuccessCallback;
    public final /* synthetic */ boolean $tosJustAccepted;
    public final /* synthetic */ AnonymousClass6R9 $tosState;
    public int label;
    public final /* synthetic */ C25721Pj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1(AnonymousClass1FU r2, AnonymousClass86Z r3, C1598386b r4, AnonymousClass6R9 r5, C25721Pj r6, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = r6;
        this.$dialogActivity = r2;
        this.$onboardingCompletedCallback = r3;
        this.$onboardingSuccessCallback = r4;
        this.$tosJustAccepted = z;
        this.$tosState = r5;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C25721Pj r5 = this.this$0;
        return new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1(this.$dialogActivity, this.$onboardingCompletedCallback, this.$onboardingSuccessCallback, this.$tosState, r5, r10, this.$tosJustAccepted);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G0 BQm = this.this$0.A03.BQm();
            C147257Sk r3 = new C147257Sk(this.$dialogActivity, this.$onboardingCompletedCallback, this.$onboardingSuccessCallback, this.$tosState, this.$tosJustAccepted);
            this.label = 1;
            if (BQm.BFC(this, r3) == r2) {
                return r2;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw new C147317Sr();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$ageCollectionJob$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
