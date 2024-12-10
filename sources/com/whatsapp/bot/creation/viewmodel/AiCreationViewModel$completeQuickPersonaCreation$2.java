package com.whatsapp.bot.creation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C25741Pl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C446324e;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$completeQuickPersonaCreation$2", f = "AiCreationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationViewModel$completeQuickPersonaCreation$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C446324e $botProfile;
    public int label;
    public final /* synthetic */ AiCreationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationViewModel$completeQuickPersonaCreation$2(C446324e r2, AiCreationViewModel aiCreationViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = aiCreationViewModel;
        this.$botProfile = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiCreationViewModel$completeQuickPersonaCreation$2(this.$botProfile, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            ((C25741Pl) this.this$0.A02.get()).A02(this.$botProfile);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationViewModel$completeQuickPersonaCreation$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
