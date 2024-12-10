package com.whatsapp.bot.creation.service;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C106245Vc;
import X.C108795cJ;
import X.C19993A2g;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C72473Md;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.creation.service.AiCreationService$createGenAiPersona$response$1", f = "AiCreationService.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class AiCreationService$createGenAiPersona$response$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108795cJ $request;
    public int label;
    public final /* synthetic */ AiCreationService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiCreationService$createGenAiPersona$response$1(C108795cJ r2, AiCreationService aiCreationService, C30391dr r4) {
        super(2, r4);
        this.this$0 = aiCreationService;
        this.$request = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiCreationService$createGenAiPersona$response$1(this.$request, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C19993A2g A0W = C72473Md.A0W(this.$request, this.this$0.A00);
            C106245Vc r0 = C106245Vc.A00;
            this.label = 1;
            obj = A0W.A01(this, r0);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiCreationService$createGenAiPersona$response$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
