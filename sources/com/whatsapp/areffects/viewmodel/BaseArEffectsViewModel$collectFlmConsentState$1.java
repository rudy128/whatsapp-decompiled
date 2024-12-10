package com.whatsapp.areffects.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C99624tC;
import com.whatsapp.areffects.flmconsent.ArEffectsFlmConsentManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel$collectFlmConsentState$1", f = "BaseArEffectsViewModel.kt", i = {}, l = {929}, m = "invokeSuspend", n = {}, s = {})
public final class BaseArEffectsViewModel$collectFlmConsentState$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BaseArEffectsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseArEffectsViewModel$collectFlmConsentState$1(BaseArEffectsViewModel baseArEffectsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = baseArEffectsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new BaseArEffectsViewModel$collectFlmConsentState$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new BaseArEffectsViewModel$collectFlmConsentState$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G4 r2 = ((ArEffectsFlmConsentManager) this.this$0.A04.get()).A07;
            C99624tC A00 = C99624tC.A00(this.this$0, 10);
            this.label = 1;
            if (r2.BFC(this, A00) == r4) {
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
