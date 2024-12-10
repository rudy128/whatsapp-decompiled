package com.whatsapp.passkeys;

import X.AnonymousClass000;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1", f = "PasskeyFacade.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1 extends C30431dv implements C22821Di {
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1(PasskeyFacade passkeyFacade, C30391dr r3) {
        super(1, r3);
        this.this$0 = passkeyFacade;
    }

    public final C30391dr create(C30391dr r3) {
        return new PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1(this.this$0, r3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new PasskeyFacade$passkeyCreate$startRegisterResponseOutcome$1(this.this$0, (C30391dr) obj).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PasskeyServerApiImpl passkeyServerApiImpl = this.this$0.A05;
            this.label = 1;
            obj = passkeyServerApiImpl.A04(this);
            if (obj == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
