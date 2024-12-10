package com.whatsapp.bot.creation.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C89474cW;
import X.C93004iH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.viewmodel.AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1", f = "AiCreationViewModel.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C89474cW $updatedPersona;
    public int label;
    public final /* synthetic */ AiCreationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1(C89474cW r2, AiCreationViewModel aiCreationViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = aiCreationViewModel;
        this.$updatedPersona = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1(this.$updatedPersona, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C93004iH r0 = new C93004iH(this.$updatedPersona);
            this.label = 1;
            if (((AnonymousClass1G3) this.this$0.A04.getValue()).BJt(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        this.this$0.A00.A04("created_persona", this.$updatedPersona);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationViewModel$updateGenAiPersonaCreationResultFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
