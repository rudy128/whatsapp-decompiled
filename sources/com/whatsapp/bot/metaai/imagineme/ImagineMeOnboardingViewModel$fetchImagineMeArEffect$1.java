package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.metaai.imagineme.ImagineMeOnboardingViewModel$fetchImagineMeArEffect$1", f = "ImagineMeOnboardingViewModel.kt", i = {}, l = {309}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineMeOnboardingViewModel$fetchImagineMeArEffect$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $effectId;
    public Object L$0;
    public int label;
    public final /* synthetic */ ImagineMeOnboardingViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineMeOnboardingViewModel$fetchImagineMeArEffect$1(ImagineMeOnboardingViewModel imagineMeOnboardingViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = imagineMeOnboardingViewModel;
        this.$effectId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ImagineMeOnboardingViewModel$fetchImagineMeArEffect$1(this.this$0, this.$effectId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G4 r2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.this$0.A0L.setValue((Object) null);
            ImagineMeOnboardingViewModel imagineMeOnboardingViewModel = this.this$0;
            r2 = imagineMeOnboardingViewModel.A0L;
            ImagineMeOnboardingArEffectRepository imagineMeOnboardingArEffectRepository = imagineMeOnboardingViewModel.A08;
            String str = this.$effectId;
            this.L$0 = r2;
            this.label = 1;
            obj = imagineMeOnboardingArEffectRepository.A00(str, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            r2 = (AnonymousClass1G4) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        r2.setValue(obj);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ImagineMeOnboardingViewModel/fetchImagineMeArEffect ");
        C17900vP.A0b(this.this$0.A0P.getValue(), A10);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImagineMeOnboardingViewModel$fetchImagineMeArEffect$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
