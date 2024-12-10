package com.whatsapp.bot.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass1OB;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.onboarding.BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1", f = "BonsaiOnboardingControllerImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1OB $ageCollectionJob;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1(C30391dr r2, AnonymousClass1OB r3) {
        super(2, r2);
        this.$ageCollectionJob = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1(r4, this.$ageCollectionJob);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BonsaiOnboardingControllerImpl$collectAgeIfNeededAndThenCallback$1((C30391dr) obj2, this.$ageCollectionJob).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (!this.$ageCollectionJob.isCancelled()) {
                this.$ageCollectionJob.BEM((CancellationException) null);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
