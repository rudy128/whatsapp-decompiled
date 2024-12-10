package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C147277Sn;
import X.C147317Sr;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeViewModel$monitorFlowEvents$2", f = "AiHomeViewModel.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeViewModel$monitorFlowEvents$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AiHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeViewModel$monitorFlowEvents$2(AiHomeViewModel aiHomeViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = aiHomeViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AiHomeViewModel$monitorFlowEvents$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AiHomeViewModel$monitorFlowEvents$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AiHomeViewModel aiHomeViewModel = this.this$0;
            AnonymousClass1G4 r2 = aiHomeViewModel.A08.A04;
            C147277Sn r0 = new C147277Sn(aiHomeViewModel, 5);
            this.label = 1;
            if (r2.BFC(this, r0) == r5) {
                return r5;
            }
        } else if (i != 1) {
            throw AnonymousClass000.A0l();
        } else {
            C30691eM.A01(obj);
        }
        throw new C147317Sr();
    }
}
