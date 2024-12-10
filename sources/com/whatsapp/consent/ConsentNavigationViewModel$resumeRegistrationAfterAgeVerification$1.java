package com.whatsapp.consent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.dobverification.WaConsentRepository;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.consent.ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1", f = "ConsentNavigationViewModel.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ ConsentNavigationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1(ConsentNavigationViewModel consentNavigationViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = consentNavigationViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ConsentNavigationViewModel$resumeRegistrationAfterAgeVerification$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            if (this.this$0.A04.A02().getInt("dob_year", 0) > 0) {
                WaConsentRepository waConsentRepository = this.this$0.A04;
                int i2 = waConsentRepository.A02().getInt("dob_year", 0);
                int i3 = this.this$0.A04.A02().getInt("dob_month", 0);
                int i4 = this.this$0.A04.A02().getInt("dob_day", 0);
                this.label = 1;
                if (waConsentRepository.CRm(this, i2, i3, i4) == r5) {
                    return r5;
                }
            } else {
                Log.e("ConsentNavigationViewModel/resumeRegistrationAfterAgeVerification bad dob year, stop");
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
