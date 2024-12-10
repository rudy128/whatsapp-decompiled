package com.whatsapp.passkeys;

import X.AnonymousClass000;
import X.C193929qt;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.passkeys.PasskeyFacade$passkeyCreate$2", f = "PasskeyFacade.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class PasskeyFacade$passkeyCreate$2 extends C30431dv implements C22821Di {
    public final /* synthetic */ C193929qt $clientResponse;
    public int label;
    public final /* synthetic */ PasskeyFacade this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasskeyFacade$passkeyCreate$2(C193929qt r2, PasskeyFacade passkeyFacade, C30391dr r4) {
        super(1, r4);
        this.this$0 = passkeyFacade;
        this.$clientResponse = r2;
    }

    public final C30391dr create(C30391dr r4) {
        return new PasskeyFacade$passkeyCreate$2(this.$clientResponse, this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((PasskeyFacade$passkeyCreate$2) create((C30391dr) obj)).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            PasskeyServerApiImpl passkeyServerApiImpl = this.this$0.A05;
            String str = this.$clientResponse.A01;
            this.label = 1;
            obj = passkeyServerApiImpl.A02(str, this);
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
}
